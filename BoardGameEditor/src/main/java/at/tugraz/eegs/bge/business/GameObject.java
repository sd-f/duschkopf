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

import at.tugraz.eegs.bge.business.x3d.Appearance;
import at.tugraz.eegs.bge.business.x3d.Cylinder;
import at.tugraz.eegs.bge.business.x3d.Material;
import at.tugraz.eegs.bge.business.x3d.Shape;
import at.tugraz.eegs.bge.business.x3d.Transform;
import at.tugraz.eegs.bge.business.x3d.X3DGroupingNode;
import java.beans.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class GameObject {

    private String id;

    private String name;

    private String state;

    private Shape shape = new Shape();

    private GameObjectPosition position = new GameObjectPosition(0.0, 0.0, 0.0);

    public GameObject() {
    }

    public GameObject(String name) {
        this.name = name;
    }

    @Transient
    public X3DGroupingNode getTransform() {

        Transform outerTransform = new Transform();
        outerTransform.setTranslation(this.position.getTranslation());
        outerTransform.getBackgroundOrColorInterpolatorOrCoordinateInterpolator().add(shape);

        return outerTransform;
    }

    @XmlElement(name = "Shape")
    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GameObjectPosition getPosition() {
        return position;
    }

    public void setPosition(GameObjectPosition position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateAttributes(GameObject gameObject) {
        this.setName(gameObject.getName());
        this.setPosition(gameObject.getPosition());
    }

}
