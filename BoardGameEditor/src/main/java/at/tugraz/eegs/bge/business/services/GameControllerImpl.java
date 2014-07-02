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
import at.tugraz.eegs.bge.business.GameAction;
import at.tugraz.eegs.bge.business.GameObject;
import at.tugraz.eegs.bge.business.GameRule;
import at.tugraz.eegs.bge.business.x3d.Appearance;
import at.tugraz.eegs.bge.business.x3d.Box;
import at.tugraz.eegs.bge.business.x3d.Cylinder;
import at.tugraz.eegs.bge.business.x3d.Material;
import at.tugraz.eegs.bge.business.x3d.Shape;
import at.tugraz.eegs.bge.business.x3d.Sphere;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Any;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@Stateful
public class GameControllerImpl implements Serializable {

    private Game game;

    @Any
    private List<GameAction> gameActions;

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

    public List<GameAction> getAllActions() {
        return gameActions;
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

        Shape shape = new Shape();
        Appearance appearance = new Appearance();
        shape.getRest().add(appearance);
        // grün
        Material material = new Material();
        material.setDiffuseColor(".2 .8 .2");
        material.setSpecularColor("0.401 0.401 0.401");
        material.setEmissiveColor("0.000 0.000 0.000");
        material.setAmbientIntensity(new Float("0.333"));
        material.setShininess(new Float("0.098"));
        material.setTransparency(new Float("0.0"));
        appearance.getAppearanceChildContentModel().add(material);
        Cylinder cylinder = new Cylinder();

        shape.getRest().add(cylinder);
        this.game.getGameObjects().get(0).setShape(shape);

        this.game.addPiece(new GameObject("Zweiter Läufer"));
        this.game.getGameObjects().get(1).getPosition().setY(3.0);
        this.game.getGameObjects().get(1).setId("LAUFER2");

        shape = new Shape();
        shape.getRest().add(appearance);
        appearance.getAppearanceChildContentModel().add(material);
        Sphere sphere = new Sphere();

        shape.getRest().add(sphere);
        this.game.getGameObjects().get(1).setShape(shape);

        this.game.addPiece(new GameObject("Erster Bauer"));
        this.game.getGameObjects().get(2).getPosition().setY(-3.0);
        this.game.getGameObjects().get(2).setId("PAWN1");

        shape = new Shape();
        shape.getRest().add(appearance);
        appearance.getAppearanceChildContentModel().add(material);
        Box box = new Box();
        shape.getRest().add(box);
        this.game.getGameObjects().get(2).setShape(shape);

        this.game.getRules().add(new GameRule());
        this.game.getRules().get(0).setId("INIT");
        this.game.getRules().get(0).setName("Spielfiguren aufstellen");

        this.game.getRules().add(new GameRule());
        this.game.getRules().get(1).setId("FIRSTDRAW");
        this.game.getRules().get(1).setName("Erster Zug");

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

    public boolean removeGameRule(String id) {
        Integer index = null;
        for (GameRule rule : this.getGame().getRules()) {
            if (rule.getId().equals(id)) {
                index = this.getGame().getRules().indexOf(rule);
            }
        }
        if (null != index) {
            this.getGame().getRules().remove(index.intValue());
            return true;
        }
        return false;
    }

    public boolean updateGameRule(String id, GameRule gameRule) {
        Integer index = null;
        for (GameRule rule : this.getGame().getRules()) {
            if (rule.getId().equals(id)) {
                index = this.getGame().getRules().indexOf(rule);
            }
        }
        if (null != index) {
            this.getGame().getRules().set(index, gameRule);
            return true;
        }
        this.getGame().getRules().add(gameRule);
        return true;
    }

    public GameRule getGameRule(String id) {
        for (GameRule rule : this.getGame().getRules()) {
            if (rule.getId().equals(id)) {
                return rule;
            }
        }
        return null;
    }

}
