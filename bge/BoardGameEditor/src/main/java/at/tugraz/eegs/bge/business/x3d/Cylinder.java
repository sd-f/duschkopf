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
 *       &lt;attribute name="bottom" type="{}SFBool" default="true" />
 *       &lt;attribute name="height" default="2">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="radius" default="1">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="side" type="{}SFBool" default="true" />
 *       &lt;attribute name="top" type="{}SFBool" default="true" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Cylinder")
public class Cylinder
    extends X3DGeometryNode
{

    @XmlAttribute(name = "bottom")
    protected Boolean bottom;
    @XmlAttribute(name = "height")
    protected Float height;
    @XmlAttribute(name = "radius")
    protected Float radius;
    @XmlAttribute(name = "side")
    protected Boolean side;
    @XmlAttribute(name = "top")
    protected Boolean top;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

    /**
     * Ruft den Wert der bottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBottom() {
        if (bottom == null) {
            return true;
        } else {
            return bottom;
        }
    }

    /**
     * Legt den Wert der bottom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBottom(Boolean value) {
        this.bottom = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getHeight() {
        if (height == null) {
            return  2.0F;
        } else {
            return height;
        }
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getRadius() {
        if (radius == null) {
            return  1.0F;
        } else {
            return radius;
        }
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRadius(Float value) {
        this.radius = value;
    }

    /**
     * Ruft den Wert der side-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSide() {
        if (side == null) {
            return true;
        } else {
            return side;
        }
    }

    /**
     * Legt den Wert der side-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSide(Boolean value) {
        this.side = value;
    }

    /**
     * Ruft den Wert der top-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTop() {
        if (top == null) {
            return true;
        } else {
            return top;
        }
    }

    /**
     * Legt den Wert der top-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTop(Boolean value) {
        this.top = value;
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
