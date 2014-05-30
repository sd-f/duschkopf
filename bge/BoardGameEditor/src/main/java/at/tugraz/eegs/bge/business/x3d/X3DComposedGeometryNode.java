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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DComposedGeometryNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DComposedGeometryNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DGeometryNode">
 *       &lt;group ref="{}ComposedGeometryContentModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attribute name="ccw" type="{}SFBool" default="true" />
 *       &lt;attribute name="colorPerVertex" type="{}SFBool" default="true" />
 *       &lt;attribute name="normalPerVertex" type="{}SFBool" default="true" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DComposedGeometryNode", propOrder = {
    "composedGeometryContentModel"
})
@XmlSeeAlso({
    IndexedQuadSet.class,
    QuadSet.class,
    TriangleStripSet.class,
    TriangleSet.class,
    TriangleFanSet.class,
    IndexedTriangleStripSet.class,
    IndexedTriangleSet.class,
    IndexedTriangleFanSet.class,
    IndexedFaceSet.class
})
public abstract class X3DComposedGeometryNode
    extends X3DGeometryNode
{

    @XmlElements({
        @XmlElement(name = "FloatVertexAttribute", type = FloatVertexAttribute.class),
        @XmlElement(name = "Matrix3VertexAttribute", type = Matrix3VertexAttribute.class),
        @XmlElement(name = "Matrix4VertexAttribute", type = Matrix4VertexAttribute.class),
        @XmlElement(name = "Color", type = Color.class),
        @XmlElement(name = "ColorRGBA", type = ColorRGBA.class),
        @XmlElement(name = "Coordinate", type = Coordinate.class),
        @XmlElement(name = "CoordinateDouble", type = CoordinateDouble.class),
        @XmlElement(name = "GeoCoordinate", type = GeoCoordinate.class),
        @XmlElement(name = "FogCoordinate", type = FogCoordinate.class),
        @XmlElement(name = "Normal", type = Normal.class),
        @XmlElement(name = "TextureCoordinate", type = TextureCoordinate.class),
        @XmlElement(name = "TextureCoordinate3D", type = TextureCoordinate3D.class),
        @XmlElement(name = "TextureCoordinate4D", type = TextureCoordinate4D.class),
        @XmlElement(name = "TextureCoordinateGenerator", type = TextureCoordinateGenerator.class),
        @XmlElement(name = "MultiTextureCoordinate", type = MultiTextureCoordinate.class),
        @XmlElement(name = "NurbsTextureCoordinate", type = NurbsTextureCoordinate.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> composedGeometryContentModel;
    @XmlAttribute(name = "ccw")
    protected Boolean ccw;
    @XmlAttribute(name = "colorPerVertex")
    protected Boolean colorPerVertex;
    @XmlAttribute(name = "normalPerVertex")
    protected Boolean normalPerVertex;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

    /**
     * Gets the value of the composedGeometryContentModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composedGeometryContentModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposedGeometryContentModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatVertexAttribute }
     * {@link Matrix3VertexAttribute }
     * {@link Matrix4VertexAttribute }
     * {@link Color }
     * {@link ColorRGBA }
     * {@link Coordinate }
     * {@link CoordinateDouble }
     * {@link GeoCoordinate }
     * {@link FogCoordinate }
     * {@link Normal }
     * {@link TextureCoordinate }
     * {@link TextureCoordinate3D }
     * {@link TextureCoordinate4D }
     * {@link TextureCoordinateGenerator }
     * {@link MultiTextureCoordinate }
     * {@link NurbsTextureCoordinate }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getComposedGeometryContentModel() {
        if (composedGeometryContentModel == null) {
            composedGeometryContentModel = new ArrayList<Object>();
        }
        return this.composedGeometryContentModel;
    }

    /**
     * Ruft den Wert der ccw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCcw() {
        if (ccw == null) {
            return true;
        } else {
            return ccw;
        }
    }

    /**
     * Legt den Wert der ccw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcw(Boolean value) {
        this.ccw = value;
    }

    /**
     * Ruft den Wert der colorPerVertex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isColorPerVertex() {
        if (colorPerVertex == null) {
            return true;
        } else {
            return colorPerVertex;
        }
    }

    /**
     * Legt den Wert der colorPerVertex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorPerVertex(Boolean value) {
        this.colorPerVertex = value;
    }

    /**
     * Ruft den Wert der normalPerVertex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalPerVertex() {
        if (normalPerVertex == null) {
            return true;
        } else {
            return normalPerVertex;
        }
    }

    /**
     * Legt den Wert der normalPerVertex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalPerVertex(Boolean value) {
        this.normalPerVertex = value;
    }

    /**
     * Ruft den Wert der solid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolid() {
        if (solid == null) {
            return true;
        } else {
            return solid;
        }
    }

    /**
     * Legt den Wert der solid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolid(Boolean value) {
        this.solid = value;
    }

}
