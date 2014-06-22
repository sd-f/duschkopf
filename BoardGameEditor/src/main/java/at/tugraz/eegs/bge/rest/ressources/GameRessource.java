/*
 * Copyright (C) 2014 Lucas Reeh <lreeh@tugraz.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package at.tugraz.eegs.bge.rest.ressources;

import at.tugraz.eegs.bge.business.Game;
import at.tugraz.eegs.bge.business.GameObject;
import at.tugraz.eegs.bge.business.GameObjectPosition;
import at.tugraz.eegs.bge.business.services.GameControllerImpl;
import at.tugraz.eegs.bge.business.x3d.Scene;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import org.json.JSONObject;
/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@Singleton
@Path("/game")
public class GameRessource implements Serializable {

  @EJB
  GameControllerImpl gameController;

  @GET
  @Path("/")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public Game getGame() {
    return gameController.getGame();
  }

  @GET
  @Path("/object/{id}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public GameObject getObjectGame(@PathParam("id") String id) {
    for (GameObject gameObject : gameController.getGame().getGameObjects()) {
      if (gameObject.getId().equals(id)) {
        return gameObject;
      }
    }
    return null;
  }

  @POST
  @Path("/board/xml")
  @Produces({MediaType.APPLICATION_XML})
  public Scene getBoardScene() {
    return gameController.getGame().getScene();
  }
  
  @POST 
  @Consumes({MediaType.APPLICATION_JSON})
  @Path("/newobject/save")
  public Response addObjectGame(String data) {
    JSONObject jsonObj = new JSONObject(data);
    List<GameObject> game_objects = this.getGame().getGameObjects();
    
    GameObject temp = new GameObject();
    temp.setId(jsonObj.getString("id"));
    temp.setName(jsonObj.getString("name"));
    temp.setPosition(new GameObjectPosition(0.0, 0.0, 0.0));
    temp.getPosition().setX(jsonObj.getJSONObject("position").getDouble("x"));
    temp.getPosition().setY(jsonObj.getJSONObject("position").getDouble("y"));
    temp.getPosition().setZ(jsonObj.getJSONObject("position").getDouble("z"));
    
    game_objects.add(temp);
    
    ResponseBuilder rb = Response.status(Status.ACCEPTED);
    return rb.build();
  }


  @POST 
  @Consumes({MediaType.APPLICATION_JSON})
  @Path("/object/{id}/save")
  public Response setObjectGame(String data) {
    JSONObject jsonObj = new JSONObject(data);
    List<GameObject> game_objects = this.getGame().getGameObjects();
    
    for (GameObject temp : game_objects)
      if (temp.getId().equals(jsonObj.get("id"))) {
        JSONObject new_pos = jsonObj.getJSONObject("position");
        
        temp.getPosition().setX(new_pos.getDouble("x"));
        temp.getPosition().setY(new_pos.getDouble("y"));
        temp.getPosition().setZ(new_pos.getDouble("z"));
        ResponseBuilder rb = Response.status(Status.ACCEPTED);
        return rb.build();
      }
    ResponseBuilder rb = Response.status(Status.NOT_MODIFIED);
    return rb.build();
  }

  @POST 
  @Consumes({MediaType.APPLICATION_JSON})
  @Path("/object/{id}/remove")
  public Response removeObjectGame(String id) {
    List<GameObject> game_objects = this.getGame().getGameObjects();
    
    for (GameObject temp : game_objects)
      if (temp.getId().equals(id)) {
        System.out.println(game_objects.size());
        game_objects.remove(temp);
        ResponseBuilder rb = Response.status(Status.ACCEPTED);
        System.out.println(game_objects.size());
        return rb.build();
      }
    ResponseBuilder rb = Response.status(Status.NOT_MODIFIED);
    return rb.build();
  }
}
