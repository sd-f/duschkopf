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

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class Piece {

  private String name;

  private Shape shape = new Shape();

  private PiecePosition position = new PiecePosition(0.0, 0.0, 0.0);

  public Piece(String name) {
    this.name = name;

    // TODO replace with uploadable abstract class
    this.shape = new Shape();
    Appearance appearance = new Appearance();

    this.shape.getRest().add(appearance);

    Material material = new Material();

    material.setDiffuseColor(".2 .8 .2");
    material.setSpecularColor("0.401 0.401 0.401");
    material.setEmissiveColor("0.000 0.000 0.000");
    material.setAmbientIntensity(new Float("0.333"));
    material.setShininess(new Float("0.098"));
    material.setTransparency(new Float("0.0"));

    appearance.getAppearanceChildContentModel().add(material);

    // todo replace all
    Cylinder cylinder = new Cylinder();

    this.shape.getRest().add(cylinder);

  }

  @Transient
  public X3DGroupingNode getTransform() {

    Transform outerTransform = new Transform();
    outerTransform.setTranslation(this.position.getTranslation());
    outerTransform.getBackgroundOrColorInterpolatorOrCoordinateInterpolator().add(shape);

    return outerTransform;
  }

  @Transient
  public Shape getShape() {
    return shape;
  }

  public void setShape(Shape shape) {
    this.shape = shape;
  }

  public PiecePosition getPosition() {
    return position;
  }

  public void setPosition(PiecePosition position) {
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
