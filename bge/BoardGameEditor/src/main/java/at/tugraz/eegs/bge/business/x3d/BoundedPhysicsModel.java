//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DParticlePhysicsModelNode">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{}GeometryContentModel"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "box",
    "cone",
    "cylinder",
    "indexedFaceSet",
    "indexedLineSet",
    "indexedTriangleFanSet",
    "indexedTriangleSet",
    "indexedTriangleStripSet",
    "lineSet",
    "pointSet",
    "sphere",
    "triangleFanSet",
    "triangleSet",
    "triangleStripSet",
    "elevationGrid",
    "polyline2D",
    "polypoint2D",
    "rectangle2D",
    "triangleSet2D",
    "extrusion",
    "text",
    "arc2D",
    "arcClose2D",
    "circle2D",
    "disk2D",
    "quadSet",
    "indexedQuadSet",
    "geoElevationGrid",
    "nurbsCurve",
    "nurbsCurve2D",
    "nurbsPatchSurface",
    "nurbsSweptSurface",
    "nurbsSwungSurface",
    "nurbsTrimmedSurface",
    "protoInstance"
})
@XmlRootElement(name = "BoundedPhysicsModel")
public class BoundedPhysicsModel
    extends X3DParticlePhysicsModelNode
{

    @XmlElement(name = "Box")
    protected Box box;
    @XmlElement(name = "Cone")
    protected Cone cone;
    @XmlElement(name = "Cylinder")
    protected Cylinder cylinder;
    @XmlElement(name = "IndexedFaceSet")
    protected IndexedFaceSet indexedFaceSet;
    @XmlElement(name = "IndexedLineSet")
    protected IndexedLineSet indexedLineSet;
    @XmlElement(name = "IndexedTriangleFanSet")
    protected IndexedTriangleFanSet indexedTriangleFanSet;
    @XmlElement(name = "IndexedTriangleSet")
    protected IndexedTriangleSet indexedTriangleSet;
    @XmlElement(name = "IndexedTriangleStripSet")
    protected IndexedTriangleStripSet indexedTriangleStripSet;
    @XmlElement(name = "LineSet")
    protected LineSet lineSet;
    @XmlElement(name = "PointSet")
    protected PointSet pointSet;
    @XmlElement(name = "Sphere")
    protected Sphere sphere;
    @XmlElement(name = "TriangleFanSet")
    protected TriangleFanSet triangleFanSet;
    @XmlElement(name = "TriangleSet")
    protected TriangleSet triangleSet;
    @XmlElement(name = "TriangleStripSet")
    protected TriangleStripSet triangleStripSet;
    @XmlElement(name = "ElevationGrid")
    protected ElevationGrid elevationGrid;
    @XmlElement(name = "Polyline2D")
    protected Polyline2D polyline2D;
    @XmlElement(name = "Polypoint2D")
    protected Polypoint2D polypoint2D;
    @XmlElement(name = "Rectangle2D")
    protected Rectangle2D rectangle2D;
    @XmlElement(name = "TriangleSet2D")
    protected TriangleSet2D triangleSet2D;
    @XmlElement(name = "Extrusion")
    protected Extrusion extrusion;
    @XmlElement(name = "Text")
    protected Text text;
    @XmlElement(name = "Arc2D")
    protected Arc2D arc2D;
    @XmlElement(name = "ArcClose2D")
    protected ArcClose2D arcClose2D;
    @XmlElement(name = "Circle2D")
    protected Circle2D circle2D;
    @XmlElement(name = "Disk2D")
    protected Disk2D disk2D;
    @XmlElement(name = "QuadSet")
    protected QuadSet quadSet;
    @XmlElement(name = "IndexedQuadSet")
    protected IndexedQuadSet indexedQuadSet;
    @XmlElement(name = "GeoElevationGrid")
    protected GeoElevationGrid geoElevationGrid;
    @XmlElement(name = "NurbsCurve")
    protected NurbsCurve nurbsCurve;
    @XmlElement(name = "NurbsCurve2D")
    protected NurbsCurve2D nurbsCurve2D;
    @XmlElement(name = "NurbsPatchSurface")
    protected NurbsPatchSurface nurbsPatchSurface;
    @XmlElement(name = "NurbsSweptSurface")
    protected NurbsSweptSurface nurbsSweptSurface;
    @XmlElement(name = "NurbsSwungSurface")
    protected NurbsSwungSurface nurbsSwungSurface;
    @XmlElement(name = "NurbsTrimmedSurface")
    protected NurbsTrimmedSurface nurbsTrimmedSurface;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;

    /**
     * Ruft den Wert der box-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Legt den Wert der box-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Ruft den Wert der cone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cone }
     *     
     */
    public Cone getCone() {
        return cone;
    }

    /**
     * Legt den Wert der cone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cone }
     *     
     */
    public void setCone(Cone value) {
        this.cone = value;
    }

    /**
     * Ruft den Wert der cylinder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cylinder }
     *     
     */
    public Cylinder getCylinder() {
        return cylinder;
    }

    /**
     * Legt den Wert der cylinder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cylinder }
     *     
     */
    public void setCylinder(Cylinder value) {
        this.cylinder = value;
    }

    /**
     * Ruft den Wert der indexedFaceSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedFaceSet }
     *     
     */
    public IndexedFaceSet getIndexedFaceSet() {
        return indexedFaceSet;
    }

    /**
     * Legt den Wert der indexedFaceSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedFaceSet }
     *     
     */
    public void setIndexedFaceSet(IndexedFaceSet value) {
        this.indexedFaceSet = value;
    }

    /**
     * Ruft den Wert der indexedLineSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedLineSet }
     *     
     */
    public IndexedLineSet getIndexedLineSet() {
        return indexedLineSet;
    }

    /**
     * Legt den Wert der indexedLineSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedLineSet }
     *     
     */
    public void setIndexedLineSet(IndexedLineSet value) {
        this.indexedLineSet = value;
    }

    /**
     * Ruft den Wert der indexedTriangleFanSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedTriangleFanSet }
     *     
     */
    public IndexedTriangleFanSet getIndexedTriangleFanSet() {
        return indexedTriangleFanSet;
    }

    /**
     * Legt den Wert der indexedTriangleFanSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedTriangleFanSet }
     *     
     */
    public void setIndexedTriangleFanSet(IndexedTriangleFanSet value) {
        this.indexedTriangleFanSet = value;
    }

    /**
     * Ruft den Wert der indexedTriangleSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedTriangleSet }
     *     
     */
    public IndexedTriangleSet getIndexedTriangleSet() {
        return indexedTriangleSet;
    }

    /**
     * Legt den Wert der indexedTriangleSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedTriangleSet }
     *     
     */
    public void setIndexedTriangleSet(IndexedTriangleSet value) {
        this.indexedTriangleSet = value;
    }

    /**
     * Ruft den Wert der indexedTriangleStripSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedTriangleStripSet }
     *     
     */
    public IndexedTriangleStripSet getIndexedTriangleStripSet() {
        return indexedTriangleStripSet;
    }

    /**
     * Legt den Wert der indexedTriangleStripSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedTriangleStripSet }
     *     
     */
    public void setIndexedTriangleStripSet(IndexedTriangleStripSet value) {
        this.indexedTriangleStripSet = value;
    }

    /**
     * Ruft den Wert der lineSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineSet }
     *     
     */
    public LineSet getLineSet() {
        return lineSet;
    }

    /**
     * Legt den Wert der lineSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineSet }
     *     
     */
    public void setLineSet(LineSet value) {
        this.lineSet = value;
    }

    /**
     * Ruft den Wert der pointSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointSet }
     *     
     */
    public PointSet getPointSet() {
        return pointSet;
    }

    /**
     * Legt den Wert der pointSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointSet }
     *     
     */
    public void setPointSet(PointSet value) {
        this.pointSet = value;
    }

    /**
     * Ruft den Wert der sphere-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sphere }
     *     
     */
    public Sphere getSphere() {
        return sphere;
    }

    /**
     * Legt den Wert der sphere-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sphere }
     *     
     */
    public void setSphere(Sphere value) {
        this.sphere = value;
    }

    /**
     * Ruft den Wert der triangleFanSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TriangleFanSet }
     *     
     */
    public TriangleFanSet getTriangleFanSet() {
        return triangleFanSet;
    }

    /**
     * Legt den Wert der triangleFanSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangleFanSet }
     *     
     */
    public void setTriangleFanSet(TriangleFanSet value) {
        this.triangleFanSet = value;
    }

    /**
     * Ruft den Wert der triangleSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TriangleSet }
     *     
     */
    public TriangleSet getTriangleSet() {
        return triangleSet;
    }

    /**
     * Legt den Wert der triangleSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangleSet }
     *     
     */
    public void setTriangleSet(TriangleSet value) {
        this.triangleSet = value;
    }

    /**
     * Ruft den Wert der triangleStripSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TriangleStripSet }
     *     
     */
    public TriangleStripSet getTriangleStripSet() {
        return triangleStripSet;
    }

    /**
     * Legt den Wert der triangleStripSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangleStripSet }
     *     
     */
    public void setTriangleStripSet(TriangleStripSet value) {
        this.triangleStripSet = value;
    }

    /**
     * Ruft den Wert der elevationGrid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevationGrid }
     *     
     */
    public ElevationGrid getElevationGrid() {
        return elevationGrid;
    }

    /**
     * Legt den Wert der elevationGrid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationGrid }
     *     
     */
    public void setElevationGrid(ElevationGrid value) {
        this.elevationGrid = value;
    }

    /**
     * Ruft den Wert der polyline2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Polyline2D }
     *     
     */
    public Polyline2D getPolyline2D() {
        return polyline2D;
    }

    /**
     * Legt den Wert der polyline2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Polyline2D }
     *     
     */
    public void setPolyline2D(Polyline2D value) {
        this.polyline2D = value;
    }

    /**
     * Ruft den Wert der polypoint2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Polypoint2D }
     *     
     */
    public Polypoint2D getPolypoint2D() {
        return polypoint2D;
    }

    /**
     * Legt den Wert der polypoint2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Polypoint2D }
     *     
     */
    public void setPolypoint2D(Polypoint2D value) {
        this.polypoint2D = value;
    }

    /**
     * Ruft den Wert der rectangle2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle2D }
     *     
     */
    public Rectangle2D getRectangle2D() {
        return rectangle2D;
    }

    /**
     * Legt den Wert der rectangle2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle2D }
     *     
     */
    public void setRectangle2D(Rectangle2D value) {
        this.rectangle2D = value;
    }

    /**
     * Ruft den Wert der triangleSet2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TriangleSet2D }
     *     
     */
    public TriangleSet2D getTriangleSet2D() {
        return triangleSet2D;
    }

    /**
     * Legt den Wert der triangleSet2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangleSet2D }
     *     
     */
    public void setTriangleSet2D(TriangleSet2D value) {
        this.triangleSet2D = value;
    }

    /**
     * Ruft den Wert der extrusion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Extrusion }
     *     
     */
    public Extrusion getExtrusion() {
        return extrusion;
    }

    /**
     * Legt den Wert der extrusion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Extrusion }
     *     
     */
    public void setExtrusion(Extrusion value) {
        this.extrusion = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der arc2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Arc2D }
     *     
     */
    public Arc2D getArc2D() {
        return arc2D;
    }

    /**
     * Legt den Wert der arc2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Arc2D }
     *     
     */
    public void setArc2D(Arc2D value) {
        this.arc2D = value;
    }

    /**
     * Ruft den Wert der arcClose2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArcClose2D }
     *     
     */
    public ArcClose2D getArcClose2D() {
        return arcClose2D;
    }

    /**
     * Legt den Wert der arcClose2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArcClose2D }
     *     
     */
    public void setArcClose2D(ArcClose2D value) {
        this.arcClose2D = value;
    }

    /**
     * Ruft den Wert der circle2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Circle2D }
     *     
     */
    public Circle2D getCircle2D() {
        return circle2D;
    }

    /**
     * Legt den Wert der circle2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Circle2D }
     *     
     */
    public void setCircle2D(Circle2D value) {
        this.circle2D = value;
    }

    /**
     * Ruft den Wert der disk2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Disk2D }
     *     
     */
    public Disk2D getDisk2D() {
        return disk2D;
    }

    /**
     * Legt den Wert der disk2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Disk2D }
     *     
     */
    public void setDisk2D(Disk2D value) {
        this.disk2D = value;
    }

    /**
     * Ruft den Wert der quadSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuadSet }
     *     
     */
    public QuadSet getQuadSet() {
        return quadSet;
    }

    /**
     * Legt den Wert der quadSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuadSet }
     *     
     */
    public void setQuadSet(QuadSet value) {
        this.quadSet = value;
    }

    /**
     * Ruft den Wert der indexedQuadSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedQuadSet }
     *     
     */
    public IndexedQuadSet getIndexedQuadSet() {
        return indexedQuadSet;
    }

    /**
     * Legt den Wert der indexedQuadSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedQuadSet }
     *     
     */
    public void setIndexedQuadSet(IndexedQuadSet value) {
        this.indexedQuadSet = value;
    }

    /**
     * Ruft den Wert der geoElevationGrid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoElevationGrid }
     *     
     */
    public GeoElevationGrid getGeoElevationGrid() {
        return geoElevationGrid;
    }

    /**
     * Legt den Wert der geoElevationGrid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoElevationGrid }
     *     
     */
    public void setGeoElevationGrid(GeoElevationGrid value) {
        this.geoElevationGrid = value;
    }

    /**
     * Ruft den Wert der nurbsCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsCurve }
     *     
     */
    public NurbsCurve getNurbsCurve() {
        return nurbsCurve;
    }

    /**
     * Legt den Wert der nurbsCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsCurve }
     *     
     */
    public void setNurbsCurve(NurbsCurve value) {
        this.nurbsCurve = value;
    }

    /**
     * Ruft den Wert der nurbsCurve2D-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsCurve2D }
     *     
     */
    public NurbsCurve2D getNurbsCurve2D() {
        return nurbsCurve2D;
    }

    /**
     * Legt den Wert der nurbsCurve2D-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsCurve2D }
     *     
     */
    public void setNurbsCurve2D(NurbsCurve2D value) {
        this.nurbsCurve2D = value;
    }

    /**
     * Ruft den Wert der nurbsPatchSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsPatchSurface }
     *     
     */
    public NurbsPatchSurface getNurbsPatchSurface() {
        return nurbsPatchSurface;
    }

    /**
     * Legt den Wert der nurbsPatchSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsPatchSurface }
     *     
     */
    public void setNurbsPatchSurface(NurbsPatchSurface value) {
        this.nurbsPatchSurface = value;
    }

    /**
     * Ruft den Wert der nurbsSweptSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsSweptSurface }
     *     
     */
    public NurbsSweptSurface getNurbsSweptSurface() {
        return nurbsSweptSurface;
    }

    /**
     * Legt den Wert der nurbsSweptSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsSweptSurface }
     *     
     */
    public void setNurbsSweptSurface(NurbsSweptSurface value) {
        this.nurbsSweptSurface = value;
    }

    /**
     * Ruft den Wert der nurbsSwungSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsSwungSurface }
     *     
     */
    public NurbsSwungSurface getNurbsSwungSurface() {
        return nurbsSwungSurface;
    }

    /**
     * Legt den Wert der nurbsSwungSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsSwungSurface }
     *     
     */
    public void setNurbsSwungSurface(NurbsSwungSurface value) {
        this.nurbsSwungSurface = value;
    }

    /**
     * Ruft den Wert der nurbsTrimmedSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NurbsTrimmedSurface }
     *     
     */
    public NurbsTrimmedSurface getNurbsTrimmedSurface() {
        return nurbsTrimmedSurface;
    }

    /**
     * Legt den Wert der nurbsTrimmedSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsTrimmedSurface }
     *     
     */
    public void setNurbsTrimmedSurface(NurbsTrimmedSurface value) {
        this.nurbsTrimmedSurface = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

}
