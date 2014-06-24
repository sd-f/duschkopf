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
package at.tugraz.eegs.bge.business;

import at.tugraz.eegs.bge.business.x3d.Background;
import at.tugraz.eegs.bge.business.x3d.NavigationInfo;
import at.tugraz.eegs.bge.business.x3d.PointLight;
import at.tugraz.eegs.bge.business.x3d.Scene;
import at.tugraz.eegs.bge.business.x3d.Transform;
import at.tugraz.eegs.bge.business.x3d.Viewpoint;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlSeeAlso(GameRule.class)
public class Game {

    private String id;

    private String name;

    private List<GameObject> gameObjects = new ArrayList<GameObject>();

    private List<GameRule> rules = new ArrayList<GameRule>();

    public Game() {
    }

    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(List<GameObject> pieces) {
        this.gameObjects = pieces;
    }

    public void addPiece(GameObject piece) {
        this.gameObjects.add(piece);
    }

    @XmlElement(name = "rules")
    public List<GameRule> getRules() {
        return rules;
    }

    public void setRules(List<GameRule> rules) {
        this.rules = rules;
    }

    public Scene getScene() {
        Scene scene = new Scene();

        NavigationInfo navigationInfo = new NavigationInfo();

        navigationInfo.setHeadlight(Boolean.FALSE);
        navigationInfo.setVisibilityLimit(new Float("0.0"));
        // missing type='"EXAMINE", "ANY"'
        navigationInfo.setAvatarSize("0.25, 1.75, 0.75");

        scene.getMetadataDoubleOrMetadataFloatOrMetadataInteger().add(navigationInfo);

        Background background = new Background();
        background.setDEF("WO_World");
        background.setGroundColor("0.051 0.051 0.051");
        background.setSkyColor("0.051 0.051 0.051");

        scene.getMetadataDoubleOrMetadataFloatOrMetadataInteger().add(background);

        for (GameObject gameObject : this.getGameObjects()) {
            scene.getMetadataDoubleOrMetadataFloatOrMetadataInteger().add(gameObject.getTransform());
        }

        Transform lightTransform = new Transform();
        lightTransform.setDEF("Lamp_TRANSFORM");
        lightTransform.setTranslation("-15.0 20.0 5.0");
        lightTransform.setScale("1.000000 1.000000 1.000000");
        lightTransform.setRotation("-0.5 -0.7 -0.5 1.5");

        PointLight pointLight = new PointLight();
        pointLight.setDEF("LA_Lamp");
        pointLight.setAmbientIntensity(new Float("0.0000"));
        pointLight.setColor("1.0000 1.0000 1.0000");
        pointLight.setRadius(new Float("50.0000"));
        pointLight.setLocation("-0.0000 -0.0000 0.0000");

        lightTransform.getBackgroundOrColorInterpolatorOrCoordinateInterpolator().add(pointLight);

        scene.getMetadataDoubleOrMetadataFloatOrMetadataInteger().add(lightTransform);

        Transform cameraTransform = new Transform();
        cameraTransform.setDEF("Camera_TRANSFORM");
        cameraTransform.setTranslation("-30 30 -30");
        cameraTransform.setScale("1 1 1");
        cameraTransform.setRotation("-0.093039 -0.968741 -0.229967 2.347036");

        Viewpoint viewPoint = new Viewpoint();
        viewPoint.setCenterOfRotation("0 0 0");
        viewPoint.setPosition("-0.00 0.00 -0.00");
        viewPoint.setOrientation("-0.92 0.35 0.17 0.00");
        viewPoint.setFieldOfView(new Float("0.858"));

        cameraTransform.getBackgroundOrColorInterpolatorOrCoordinateInterpolator().add(viewPoint);

        scene.getMetadataDoubleOrMetadataFloatOrMetadataInteger().add(cameraTransform);

        return scene;
    }

}
