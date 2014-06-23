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
package at.tugraz.eegs.bge.business.services;

import at.tugraz.eegs.bge.business.Game;
import at.tugraz.eegs.bge.business.GameObject;
import at.tugraz.eegs.bge.business.x3d.Shape;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@Stateful
public class GameControllerImpl implements Serializable {

    private Game game;

    @PostConstruct
    public void init() {
        this.game = new Game();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void addGameObject(GameObject gameObject) {
        this.getGame().getGameObjects().add(gameObject);
    }

    public Boolean updateGameObjectAttributes(GameObject gameObject) {
        for (GameObject gameObjectItem : this.getGame().getGameObjects()) {
            if (gameObjectItem.getId().equals(gameObject.getId())) {
                gameObjectItem.updateAttributes(gameObject);
                return true;
            }
        }
        return false;
    }

    public Boolean removeGameObject(String id) {
        GameObject toDelete = null;
        for (GameObject gameObjectItem : this.getGame().getGameObjects()) {
            if (gameObjectItem.getId().equals(id)) {
                toDelete = gameObjectItem;
            }
        }
        if (null != toDelete) {
            this.getGame().getGameObjects().remove(toDelete);
            return true;
        }
        return false;
    }

    public void reset() {
        this.setGame(new Game());
    }

    public void insertTestdata() {

        this.game = new Game();

        this.game.setId("FIRSTGAME");
        this.game.setName("Erstes Spiel");

        this.game.addPiece(new GameObject("Erster Läufer"));
        this.game.getGameObjects().get(0).getPosition().setY(0.0);
        this.game.getGameObjects().get(0).setId("LAUFER1");

        this.game.addPiece(new GameObject("Zweiter Läufer"));
        this.game.getGameObjects().get(1).getPosition().setY(3.0);
        this.game.getGameObjects().get(1).setId("LAUFER2");

        this.game.addPiece(new GameObject("Erster Bauer"));
        this.game.getGameObjects().get(2).getPosition().setY(-3.0);
        this.game.getGameObjects().get(2).setId("PAWN1");
    }

    public Boolean updateGameObjectShape(String id, Shape shape) {
        for (GameObject gameObjectItem : this.getGame().getGameObjects()) {
            if (gameObjectItem.getId().equals(id)) {
                gameObjectItem.setShape(shape);
                return true;
            }
        }
        return false;
    }

}
