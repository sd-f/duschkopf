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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element ref="{}GeoOrigin"/>
 *           &lt;group ref="{}ColorNormalTexCoordContentModel" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;group ref="{}ColorNormalTexCoordContentModel"/>
 *           &lt;element ref="{}GeoOrigin" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *       &lt;attribute name="geoGridOrigin" type="{}SFVec3d" default="0 0 0" />
 *       &lt;attribute name="height" type="{}MFDouble" default="0 0" />
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
 *           &lt;restriction base="{}SFDouble">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="yScale" default="1">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="zDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="zSpacing" default="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFDouble">
 *             &lt;minInclusive value="0"/>
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
    "rest"
})
@XmlRootElement(name = "GeoElevationGrid")
public class GeoElevationGrid
    extends X3DGeometryNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "ColorRGBA", type = ColorRGBA.class, required = false),
        @XmlElementRef(name = "MultiTextureCoordinate", type = MultiTextureCoordinate.class, required = false),
        @XmlElementRef(name = "NurbsTextureCoordinate", type = NurbsTextureCoordinate.class, required = false),
        @XmlElementRef(name = "GeoOrigin", type = GeoOrigin.class, required = false),
        @XmlElementRef(name = "Normal", type = Normal.class, required = false),
        @XmlElementRef(name = "Color", type = Color.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "FogCoordinate", type = FogCoordinate.class, required = false),
        @XmlElementRef(name = "TextureCoordinate", type = TextureCoordinate.class, required = false),
        @XmlElementRef(name = "TextureCoordinateGenerator", type = TextureCoordinateGenerator.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "geoGridOrigin")
    protected String geoGridOrigin;
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
    protected Double xSpacing;
    @XmlAttribute(name = "yScale")
    protected Float yScale;
    @XmlAttribute(name = "zDimension")
    protected BigInteger zDimension;
    @XmlAttribute(name = "zSpacing")
    protected Double zSpacing;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "TextureCoordinate" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2727 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 2714 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
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
     * {@link ColorRGBA }
     * {@link MultiTextureCoordinate }
     * {@link NurbsTextureCoordinate }
     * {@link GeoOrigin }
     * {@link Normal }
     * {@link Color }
     * {@link ProtoInstance }
     * {@link FogCoordinate }
     * {@link TextureCoordinate }
     * {@link TextureCoordinateGenerator }
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
     * Ruft den Wert der geoSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoSystem() {
        if (geoSystem == null) {
            return "\"GD\" \"WE\"";
        } else {
            return geoSystem;
        }
    }

    /**
     * Legt den Wert der geoSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoSystem(String value) {
        this.geoSystem = value;
    }

    /**
     * Ruft den Wert der geoGridOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoGridOrigin() {
        if (geoGridOrigin == null) {
            return "0 0 0";
        } else {
            return geoGridOrigin;
        }
    }

    /**
     * Legt den Wert der geoGridOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoGridOrigin(String value) {
        this.geoGridOrigin = value;
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
        if (height == null) {
            return "0 0";
        } else {
            return height;
        }
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
     *     {@link Double }
     *     
     */
    public double getXSpacing() {
        if (xSpacing == null) {
            return  1.0D;
        } else {
            return xSpacing;
        }
    }

    /**
     * Legt den Wert der xSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXSpacing(Double value) {
        this.xSpacing = value;
    }

    /**
     * Ruft den Wert der yScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getYScale() {
        if (yScale == null) {
            return  1.0F;
        } else {
            return yScale;
        }
    }

    /**
     * Legt den Wert der yScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYScale(Float value) {
        this.yScale = value;
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
     *     {@link Double }
     *     
     */
    public double getZSpacing() {
        if (zSpacing == null) {
            return  1.0D;
        } else {
            return zSpacing;
        }
    }

    /**
     * Legt den Wert der zSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZSpacing(Double value) {
        this.zSpacing = value;
    }

}
