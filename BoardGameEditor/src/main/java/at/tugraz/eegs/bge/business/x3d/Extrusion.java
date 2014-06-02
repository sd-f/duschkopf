//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="beginCap" type="{}SFBool" default="true" />
 *       &lt;attribute name="ccw" type="{}SFBool" default="true" />
 *       &lt;attribute name="convex" type="{}SFBool" default="true" />
 *       &lt;attribute name="creaseAngle" default="0.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="crossSection" type="{}MFVec2f" default="1 1 1 -1 -1 -1 -1 1 1 1" />
 *       &lt;attribute name="endCap" type="{}SFBool" default="true" />
 *       &lt;attribute name="orientation" type="{}MFRotation" default="0 0 1 0" />
 *       &lt;attribute name="scale" type="{}MFVec2f" default="1 1" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *       &lt;attribute name="spine" type="{}MFVec3f" default="0 0 0 0 1 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Extrusion")
public class Extrusion
    extends X3DGeometryNode
{

    @XmlAttribute(name = "beginCap")
    protected Boolean beginCap;
    @XmlAttribute(name = "ccw")
    protected Boolean ccw;
    @XmlAttribute(name = "convex")
    protected Boolean convex;
    @XmlAttribute(name = "creaseAngle")
    protected Float creaseAngle;
    @XmlAttribute(name = "crossSection")
    protected String crossSection;
    @XmlAttribute(name = "endCap")
    protected Boolean endCap;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "scale")
    protected String scale;
    @XmlAttribute(name = "solid")
    protected Boolean solid;
    @XmlAttribute(name = "spine")
    protected String spine;

    /**
     * Ruft den Wert der beginCap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBeginCap() {
        if (beginCap == null) {
            return true;
        } else {
            return beginCap;
        }
    }

    /**
     * Legt den Wert der beginCap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeginCap(Boolean value) {
        this.beginCap = value;
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
     * Ruft den Wert der convex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConvex() {
        if (convex == null) {
            return true;
        } else {
            return convex;
        }
    }

    /**
     * Legt den Wert der convex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvex(Boolean value) {
        this.convex = value;
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
     * Ruft den Wert der crossSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossSection() {
        if (crossSection == null) {
            return "1 1 1 -1 -1 -1 -1 1 1 1";
        } else {
            return crossSection;
        }
    }

    /**
     * Legt den Wert der crossSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossSection(String value) {
        this.crossSection = value;
    }

    /**
     * Ruft den Wert der endCap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEndCap() {
        if (endCap == null) {
            return true;
        } else {
            return endCap;
        }
    }

    /**
     * Legt den Wert der endCap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndCap(Boolean value) {
        this.endCap = value;
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "0 0 1 0";
        } else {
            return orientation;
        }
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        if (scale == null) {
            return "1 1";
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
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
     * Ruft den Wert der spine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpine() {
        if (spine == null) {
            return "0 0 0 0 1 0";
        } else {
            return spine;
        }
    }

    /**
     * Legt den Wert der spine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpine(String value) {
        this.spine = value;
    }

}
