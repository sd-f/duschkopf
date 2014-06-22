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
import at.tugraz.eegs.bge.business.services.GameControllerImpl;
import at.tugraz.eegs.bge.business.x3d.Scene;
import java.io.Serializable;
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

    @POST
    @Path("/save")
    @Consumes({MediaType.APPLICATION_JSON})
    public Game setGame(Game game) {
        gameController.setGame(game);
        return gameController.getGame();
    }

    @GET
    @Path("/new")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Game newGame() {
        gameController.reset();
        return gameController.getGame();
    }

    @GET
    @Path("/new/testdata")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Game newTestdata() {
        gameController.insertTestdata();
        return gameController.getGame();
    }

    @GET
    @Path("/object/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public GameObject getGameObject(@PathParam("id") String id) {
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
    public Response addGameObject(GameObject gameObject) {
        gameController.addGameObject(gameObject);
        ResponseBuilder rb = Response.status(Status.ACCEPTED);
        return rb.build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/object/{id}/save")
    public Response setGameObject(GameObject gameObject) {
        ResponseBuilder rb = Response.status(Status.NOT_FOUND);
        if (gameController.updateGameObjectAttributes(gameObject)) {
            rb = Response.status(Status.OK);
        }
        return rb.build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/object/{id}/remove")
    public Response removeGameObject(String id) {
        ResponseBuilder rb = Response.status(Status.NOT_FOUND);
        if (gameController.removeGameObject(id)) {
            rb = Response.status(Status.OK);
        }
        return rb.build();
    }
}
