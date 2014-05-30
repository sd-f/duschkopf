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
import at.tugraz.eegs.bge.business.services.GameControllerImpl;
import at.tugraz.eegs.bge.business.x3d.Scene;
import at.tugraz.eegs.bge.business.x3d.X3DGroupingNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
  @Path("/init")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public Game getGame() {
    return gameController.getGame();
  }

  @POST
  @Path("/board/xml")
  @Produces({MediaType.APPLICATION_XML})
  public Scene getBoardScene() {
    return gameController.getGame().getScene();
  }

}