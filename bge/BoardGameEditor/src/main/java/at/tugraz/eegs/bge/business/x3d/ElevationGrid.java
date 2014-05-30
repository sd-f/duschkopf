//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{}X3DGeometryNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}FloatVertexAttribute"/>
 *         &lt;element ref="{}Matrix3VertexAttribute"/>
 *         &lt;element ref="{}Matrix4VertexAttribute"/>
 *         &lt;element ref="{}Color"/>
 *         &lt;element ref="{}ColorRGBA"/>
 *         &lt;element ref="{}FogCoordinate"/>
 *         &lt;element ref="{}Normal"/>
 *         &lt;element ref="{}TextureCoordinate"/>
 *         &lt;element ref="{}TextureCoordinate3D"/>
 *         &lt;element ref="{}TextureCoordinate4D"/>
 *         &lt;element ref="{}TextureCoordinateGenerator"/>
 *         &lt;element ref="{}MultiTextureCoordinate"/>
 *         &lt;element ref="{}NurbsTextureCoordinate"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="height" type="{}MFFloat" />
 *       &lt;attribute name="ccw" type="{}SFBool" default="true" />
 *       &lt;attribute name="colorPerVertex" type="{}SFBool" default="true" />
 *       &lt;attribute name="creaseAngle" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="normalPerVertex" type="{}SFBool" default="true" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *       &lt;attribute name="xDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="xSpacing" default="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="zDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="zSpacing" default="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute"
})
@XmlRootElement(name = "ElevationGrid")
public class ElevationGrid
    extends X3DGeometryNode
{

    @XmlElements({
        @XmlElement(name = "FloatVertexAttribute", type = FloatVertexAttribute.class),
        @XmlElement(name = "Matrix3VertexAttribute", type = Matrix3VertexAttribute.class),
        @XmlElement(name = "Matrix4VertexAttribute", type = Matrix4VertexAttribute.class),
        @XmlElement(name = "Color", type = Color.class),
        @XmlElement(name = "ColorRGBA", type = ColorRGBA.class),
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
    protected List<Object> floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "ccw")
    protected Boolean ccw;
    @XmlAttribute(name = "colorPerVertex")
    protected Boolean colorPerVertex;
    @XmlAttribute(name = "creaseAngle")
    protected Float creaseAngle;
    @XmlAttribute(name = "normalPerVertex")
    protected Boolean normalPerVertex;
    @XmlAttribute(name = "solid")
    protected Boolean solid;
    @XmlAttribute(name = "xDimension")
    protected BigInteger xDimension;
    @XmlAttribute(name = "xSpacing")
    protected Float xSpacing;
    @XmlAttribute(name = "zDimension")
    protected BigInteger zDimension;
    @XmlAttribute(name = "zSpacing")
    protected Float zSpacing;

    /**
     * Gets the value of the floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute().add(newItem);
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
    public List<Object> getFloatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute() {
        if (floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute == null) {
            floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute = new ArrayList<Object>();
        }
        return this.floatVertexAttributeOrMatrix3VertexAttributeOrMatrix4VertexAttribute;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
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
     * Ruft den Wert der creaseAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getCreaseAngle() {
        if (creaseAngle == null) {
            return  0.0F;
        } else {
            return creaseAngle;
        }
    }

    /**
     * Legt den Wert der creaseAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCreaseAngle(Float value) {
        this.creaseAngle = value;
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

    /**
     * Ruft den Wert der xDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXDimension() {
        if (xDimension == null) {
            return new BigInteger("0");
        } else {
            return xDimension;
        }
    }

    /**
     * Legt den Wert der xDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXDimension(BigInteger value) {
        this.xDimension = value;
    }

    /**
     * Ruft den Wert der xSpacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getXSpacing() {
        if (xSpacing == null) {
            return  1.0F;
        } else {
            return xSpacing;
        }
    }

    /**
     * Legt den Wert der xSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXSpacing(Float value) {
        this.xSpacing = value;
    }

    /**
     * Ruft den Wert der zDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZDimension() {
        if (zDimension == null) {
            return new BigInteger("0");
        } else {
            return zDimension;
        }
    }

    /**
     * Legt den Wert der zDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZDimension(BigInteger value) {
        this.zDimension = value;
    }

    /**
     * Ruft den Wert der zSpacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getZSpacing() {
        if (zSpacing == null) {
            return  1.0F;
        } else {
            return zSpacing;
        }
    }

    /**
     * Legt den Wert der zSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZSpacing(Float value) {
        this.zSpacing = value;
    }

}
