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
 *       &lt;attribute name="radius" default="1">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="startAngle" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="-6.2832"/>
 *             &lt;maxExclusive value="6.2832"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="endAngle" default="1.570796">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minExclusive value="-6.2832"/>
 *             &lt;maxExclusive value="6.2832"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="closureType" type="{}ArcClose2dTypeValues" default="PIE" />
 *       &lt;attribute name="solid" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ArcClose2D")
public class ArcClose2D
    extends X3DGeometryNode
{

    @XmlAttribute(name = "radius")
    protected Float radius;
    @XmlAttribute(name = "startAngle")
    protected Float startAngle;
    @XmlAttribute(name = "endAngle")
    protected Float endAngle;
    @XmlAttribute(name = "closureType")
    protected ArcClose2DTypeValues closureType;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

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
     * Ruft den Wert der startAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStartAngle() {
        if (startAngle == null) {
            return  0.0F;
        } else {
            return startAngle;
        }
    }

    /**
     * Legt den Wert der startAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStartAngle(Float value) {
        this.startAngle = value;
    }

    /**
     * Ruft den Wert der endAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getEndAngle() {
        if (endAngle == null) {
            return  1.570796F;
        } else {
            return endAngle;
        }
    }

    /**
     * Legt den Wert der endAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEndAngle(Float value) {
        this.endAngle = value;
    }

    /**
     * Ruft den Wert der closureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArcClose2DTypeValues }
     *     
     */
    public ArcClose2DTypeValues getClosureType() {
        if (closureType == null) {
            return ArcClose2DTypeValues.PIE;
        } else {
            return closureType;
        }
    }

    /**
     * Legt den Wert der closureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArcClose2DTypeValues }
     *     
     */
    public void setClosureType(ArcClose2DTypeValues value) {
        this.closureType = value;
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
            return false;
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
