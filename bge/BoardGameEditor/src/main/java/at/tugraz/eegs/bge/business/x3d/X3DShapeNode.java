//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DShapeNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DShapeNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;group ref="{}ShapeChildContentModel" minOccurs="0"/>
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DShapeNode", propOrder = {
    "rest"
})
@XmlSeeAlso({
    ParticleSystem.class,
    Shape.class
})
public abstract class X3DShapeNode
    extends X3DChildNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "GeoElevationGrid", type = GeoElevationGrid.class, required = false),
        @XmlElementRef(name = "IndexedTriangleStripSet", type = IndexedTriangleStripSet.class, required = false),
        @XmlElementRef(name = "TriangleFanSet", type = TriangleFanSet.class, required = false),
        @XmlElementRef(name = "IndexedLineSet", type = IndexedLineSet.class, required = false),
        @XmlElementRef(name = "ArcClose2D", type = ArcClose2D.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "ElevationGrid", type = ElevationGrid.class, required = false),
        @XmlElementRef(name = "Cylinder", type = Cylinder.class, required = false),
        @XmlElementRef(name = "Extrusion", type = Extrusion.class, required = false),
        @XmlElementRef(name = "TriangleSet2D", type = TriangleSet2D.class, required = false),
        @XmlElementRef(name = "Rectangle2D", type = Rectangle2D.class, required = false),
        @XmlElementRef(name = "PointSet", type = PointSet.class, required = false),
        @XmlElementRef(name = "IndexedTriangleSet", type = IndexedTriangleSet.class, required = false),
        @XmlElementRef(name = "Text", type = Text.class, required = false),
        @XmlElementRef(name = "Box", type = Box.class, required = false),
        @XmlElementRef(name = "NurbsCurve2D", type = NurbsCurve2D.class, required = false),
        @XmlElementRef(name = "IndexedQuadSet", type = IndexedQuadSet.class, required = false),
        @XmlElementRef(name = "Arc2D", type = Arc2D.class, required = false),
        @XmlElementRef(name = "NurbsTrimmedSurface", type = NurbsTrimmedSurface.class, required = false),
        @XmlElementRef(name = "NurbsSwungSurface", type = NurbsSwungSurface.class, required = false),
        @XmlElementRef(name = "NurbsPatchSurface", type = NurbsPatchSurface.class, required = false),
        @XmlElementRef(name = "IndexedFaceSet", type = IndexedFaceSet.class, required = false),
        @XmlElementRef(name = "Sphere", type = Sphere.class, required = false),
        @XmlElementRef(name = "LineSet", type = LineSet.class, required = false),
        @XmlElementRef(name = "Polyline2D", type = Polyline2D.class, required = false),
        @XmlElementRef(name = "QuadSet", type = QuadSet.class, required = false),
        @XmlElementRef(name = "TriangleStripSet", type = TriangleStripSet.class, required = false),
        @XmlElementRef(name = "Disk2D", type = Disk2D.class, required = false),
        @XmlElementRef(name = "Appearance", type = Appearance.class, required = false),
        @XmlElementRef(name = "TriangleSet", type = TriangleSet.class, required = false),
        @XmlElementRef(name = "Polypoint2D", type = Polypoint2D.class, required = false),
        @XmlElementRef(name = "Circle2D", type = Circle2D.class, required = false),
        @XmlElementRef(name = "IndexedTriangleFanSet", type = IndexedTriangleFanSet.class, required = false),
        @XmlElementRef(name = "NurbsCurve", type = NurbsCurve.class, required = false),
        @XmlElementRef(name = "Cone", type = Cone.class, required = false),
        @XmlElementRef(name = "NurbsSweptSurface", type = NurbsSweptSurface.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Box" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 4591 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 4591 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedTriangleStripSet }
     * {@link GeoElevationGrid }
     * {@link TriangleFanSet }
     * {@link IndexedLineSet }
     * {@link ArcClose2D }
     * {@link ElevationGrid }
     * {@link ProtoInstance }
     * {@link Extrusion }
     * {@link Cylinder }
     * {@link TriangleSet2D }
     * {@link Rectangle2D }
     * {@link PointSet }
     * {@link Text }
     * {@link IndexedTriangleSet }
     * {@link Box }
     * {@link NurbsCurve2D }
     * {@link Arc2D }
     * {@link IndexedQuadSet }
     * {@link NurbsPatchSurface }
     * {@link NurbsSwungSurface }
     * {@link NurbsTrimmedSurface }
     * {@link IndexedFaceSet }
     * {@link Sphere }
     * {@link LineSet }
     * {@link Polyline2D }
     * {@link TriangleStripSet }
     * {@link QuadSet }
     * {@link Appearance }
     * {@link Disk2D }
     * {@link TriangleSet }
     * {@link Polypoint2D }
     * {@link Circle2D }
     * {@link IndexedTriangleFanSet }
     * {@link NurbsCurve }
     * {@link Cone }
     * {@link NurbsSweptSurface }
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

    /**
     * Ruft den Wert der bboxCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxCenter() {
        if (bboxCenter == null) {
            return "0 0 0";
        } else {
            return bboxCenter;
        }
    }

    /**
     * Legt den Wert der bboxCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxCenter(String value) {
        this.bboxCenter = value;
    }

    /**
     * Ruft den Wert der bboxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxSize() {
        if (bboxSize == null) {
            return "-1 -1 -1";
        } else {
            return bboxSize;
        }
    }

    /**
     * Legt den Wert der bboxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxSize(String value) {
        this.bboxSize = value;
    }

}
