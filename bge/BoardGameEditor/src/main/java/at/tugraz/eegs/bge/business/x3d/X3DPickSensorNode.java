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
 * <p>Java-Klasse für X3DPickSensorNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DPickSensorNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DSensorNode">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;group ref="{}GeometryContentModel"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;group ref="{}PickSensorGroupingNodeContentModel"/>
 *             &lt;element ref="{}Shape"/>
 *             &lt;element ref="{}ProtoInstance"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;group ref="{}PickSensorGroupingNodeContentModel"/>
 *             &lt;element ref="{}Shape"/>
 *             &lt;element ref="{}ProtoInstance"/>
 *           &lt;/choice>
 *           &lt;group ref="{}GeometryContentModel" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="objectType" type="{}MFString" default="ALL" />
 *       &lt;attribute name="intersectionType" type="{}SFString" default="BOUNDS" />
 *       &lt;attribute name="sortOrder" type="{}SFString" default="CLOSEST" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DPickSensorNode", propOrder = {
    "rest"
})
@XmlSeeAlso({
    LinePickSensor.class,
    VolumePickSensor.class,
    PrimitivePickSensor.class,
    PointPickSensor.class
})
public abstract class X3DPickSensorNode
    extends X3DSensorNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "GeoElevationGrid", type = GeoElevationGrid.class, required = false),
        @XmlElementRef(name = "CADPart", type = CADPart.class, required = false),
        @XmlElementRef(name = "TriangleFanSet", type = TriangleFanSet.class, required = false),
        @XmlElementRef(name = "LOD", type = LOD.class, required = false),
        @XmlElementRef(name = "ElevationGrid", type = ElevationGrid.class, required = false),
        @XmlElementRef(name = "ScreenGroup", type = ScreenGroup.class, required = false),
        @XmlElementRef(name = "Cylinder", type = Cylinder.class, required = false),
        @XmlElementRef(name = "StaticGroup", type = StaticGroup.class, required = false),
        @XmlElementRef(name = "Rectangle2D", type = Rectangle2D.class, required = false),
        @XmlElementRef(name = "PointSet", type = PointSet.class, required = false),
        @XmlElementRef(name = "NurbsCurve2D", type = NurbsCurve2D.class, required = false),
        @XmlElementRef(name = "Arc2D", type = Arc2D.class, required = false),
        @XmlElementRef(name = "IndexedQuadSet", type = IndexedQuadSet.class, required = false),
        @XmlElementRef(name = "NurbsSwungSurface", type = NurbsSwungSurface.class, required = false),
        @XmlElementRef(name = "NurbsTrimmedSurface", type = NurbsTrimmedSurface.class, required = false),
        @XmlElementRef(name = "IndexedFaceSet", type = IndexedFaceSet.class, required = false),
        @XmlElementRef(name = "Sphere", type = Sphere.class, required = false),
        @XmlElementRef(name = "LineSet", type = LineSet.class, required = false),
        @XmlElementRef(name = "Polyline2D", type = Polyline2D.class, required = false),
        @XmlElementRef(name = "Billboard", type = Billboard.class, required = false),
        @XmlElementRef(name = "TriangleStripSet", type = TriangleStripSet.class, required = false),
        @XmlElementRef(name = "QuadSet", type = QuadSet.class, required = false),
        @XmlElementRef(name = "Switch", type = Switch.class, required = false),
        @XmlElementRef(name = "Shape", type = Shape.class, required = false),
        @XmlElementRef(name = "Collision", type = Collision.class, required = false),
        @XmlElementRef(name = "Circle2D", type = Circle2D.class, required = false),
        @XmlElementRef(name = "ReceiverPdu", type = ReceiverPdu.class, required = false),
        @XmlElementRef(name = "NurbsSet", type = NurbsSet.class, required = false),
        @XmlElementRef(name = "IndexedTriangleFanSet", type = IndexedTriangleFanSet.class, required = false),
        @XmlElementRef(name = "Anchor", type = Anchor.class, required = false),
        @XmlElementRef(name = "IndexedTriangleStripSet", type = IndexedTriangleStripSet.class, required = false),
        @XmlElementRef(name = "IndexedLineSet", type = IndexedLineSet.class, required = false),
        @XmlElementRef(name = "ArcClose2D", type = ArcClose2D.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "Extrusion", type = Extrusion.class, required = false),
        @XmlElementRef(name = "TriangleSet2D", type = TriangleSet2D.class, required = false),
        @XmlElementRef(name = "TransmitterPdu", type = TransmitterPdu.class, required = false),
        @XmlElementRef(name = "GeoLocation", type = GeoLocation.class, required = false),
        @XmlElementRef(name = "CADAssembly", type = CADAssembly.class, required = false),
        @XmlElementRef(name = "Transform", type = Transform.class, required = false),
        @XmlElementRef(name = "EspduTransform", type = EspduTransform.class, required = false),
        @XmlElementRef(name = "GeoTransform", type = GeoTransform.class, required = false),
        @XmlElementRef(name = "Text", type = Text.class, required = false),
        @XmlElementRef(name = "IndexedTriangleSet", type = IndexedTriangleSet.class, required = false),
        @XmlElementRef(name = "Box", type = Box.class, required = false),
        @XmlElementRef(name = "LayoutGroup", type = LayoutGroup.class, required = false),
        @XmlElementRef(name = "NurbsPatchSurface", type = NurbsPatchSurface.class, required = false),
        @XmlElementRef(name = "Group", type = Group.class, required = false),
        @XmlElementRef(name = "Viewport", type = Viewport.class, required = false),
        @XmlElementRef(name = "GeoLOD", type = GeoLOD.class, required = false),
        @XmlElementRef(name = "Disk2D", type = Disk2D.class, required = false),
        @XmlElementRef(name = "TriangleSet", type = TriangleSet.class, required = false),
        @XmlElementRef(name = "Polypoint2D", type = Polypoint2D.class, required = false),
        @XmlElementRef(name = "SignalPdu", type = SignalPdu.class, required = false),
        @XmlElementRef(name = "HAnimJoint", type = HAnimJoint.class, required = false),
        @XmlElementRef(name = "NurbsCurve", type = NurbsCurve.class, required = false),
        @XmlElementRef(name = "CADLayer", type = CADLayer.class, required = false),
        @XmlElementRef(name = "Cone", type = Cone.class, required = false),
        @XmlElementRef(name = "NurbsSweptSurface", type = NurbsSweptSurface.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "objectType")
    protected List<String> objectType;
    @XmlAttribute(name = "intersectionType")
    protected String intersectionType;
    @XmlAttribute(name = "sortOrder")
    protected String sortOrder;

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
     * {@link GeoElevationGrid }
     * {@link CADPart }
     * {@link TriangleFanSet }
     * {@link LOD }
     * {@link ElevationGrid }
     * {@link ScreenGroup }
     * {@link Cylinder }
     * {@link StaticGroup }
     * {@link Rectangle2D }
     * {@link PointSet }
     * {@link NurbsCurve2D }
     * {@link Arc2D }
     * {@link IndexedQuadSet }
     * {@link NurbsSwungSurface }
     * {@link NurbsTrimmedSurface }
     * {@link IndexedFaceSet }
     * {@link Sphere }
     * {@link LineSet }
     * {@link Polyline2D }
     * {@link Billboard }
     * {@link TriangleStripSet }
     * {@link QuadSet }
     * {@link Switch }
     * {@link Shape }
     * {@link Collision }
     * {@link Circle2D }
     * {@link ReceiverPdu }
     * {@link NurbsSet }
     * {@link IndexedTriangleFanSet }
     * {@link Anchor }
     * {@link IndexedTriangleStripSet }
     * {@link IndexedLineSet }
     * {@link ArcClose2D }
     * {@link ProtoInstance }
     * {@link Extrusion }
     * {@link TriangleSet2D }
     * {@link TransmitterPdu }
     * {@link GeoLocation }
     * {@link CADAssembly }
     * {@link Transform }
     * {@link EspduTransform }
     * {@link GeoTransform }
     * {@link Text }
     * {@link IndexedTriangleSet }
     * {@link Box }
     * {@link LayoutGroup }
     * {@link NurbsPatchSurface }
     * {@link Group }
     * {@link Viewport }
     * {@link GeoLOD }
     * {@link Disk2D }
     * {@link TriangleSet }
     * {@link Polypoint2D }
     * {@link SignalPdu }
     * {@link HAnimJoint }
     * {@link NurbsCurve }
     * {@link CADLayer }
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
     * Gets the value of the objectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectType() {
        if (objectType == null) {
            objectType = new ArrayList<String>();
        }
        return this.objectType;
    }

    /**
     * Ruft den Wert der intersectionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionType() {
        if (intersectionType == null) {
            return "BOUNDS";
        } else {
            return intersectionType;
        }
    }

    /**
     * Legt den Wert der intersectionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionType(String value) {
        this.intersectionType = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        if (sortOrder == null) {
            return "CLOSEST";
        } else {
            return sortOrder;
        }
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

}
