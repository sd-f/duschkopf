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
 *     &lt;extension base="{}X3DRigidJointNode">
 *       &lt;attribute name="anchorPoint" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="axis" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="maxAngle" type="{}SFFloat" default="3.141592653" />
 *       &lt;attribute name="minAngle" type="{}SFFloat" default="-3.141592653" />
 *       &lt;attribute name="stopBounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stopErrorCorrection" type="{}SFFloat" default="0.8" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SingleAxisHingeJoint")
public class SingleAxisHingeJoint
    extends X3DRigidJointNode
{

    @XmlAttribute(name = "anchorPoint")
    protected String anchorPoint;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "maxAngle")
    protected Float maxAngle;
    @XmlAttribute(name = "minAngle")
    protected Float minAngle;
    @XmlAttribute(name = "stopBounce")
    protected Float stopBounce;
    @XmlAttribute(name = "stopErrorCorrection")
    protected Float stopErrorCorrection;

    /**
     * Ruft den Wert der anchorPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorPoint() {
        if (anchorPoint == null) {
            return "0 0 0";
        } else {
            return anchorPoint;
        }
    }

    /**
     * Legt den Wert der anchorPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorPoint(String value) {
        this.anchorPoint = value;
    }

    /**
     * Ruft den Wert der axis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        if (axis == null) {
            return "0 0 0";
        } else {
            return axis;
        }
    }

    /**
     * Legt den Wert der axis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Ruft den Wert der maxAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxAngle() {
        if (maxAngle == null) {
            return  3.1415927F;
        } else {
            return maxAngle;
        }
    }

    /**
     * Legt den Wert der maxAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAngle(Float value) {
        this.maxAngle = value;
    }

    /**
     * Ruft den Wert der minAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinAngle() {
        if (minAngle == null) {
            return -3.1415927F;
        } else {
            return minAngle;
        }
    }

    /**
     * Legt den Wert der minAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinAngle(Float value) {
        this.minAngle = value;
    }

    /**
     * Ruft den Wert der stopBounce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStopBounce() {
        if (stopBounce == null) {
            return  0.0F;
        } else {
            return stopBounce;
        }
    }

    /**
     * Legt den Wert der stopBounce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStopBounce(Float value) {
        this.stopBounce = value;
    }

    /**
     * Ruft den Wert der stopErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStopErrorCorrection() {
        if (stopErrorCorrection == null) {
            return  0.8F;
        } else {
            return stopErrorCorrection;
        }
    }

    /**
     * Legt den Wert der stopErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStopErrorCorrection(Float value) {
        this.stopErrorCorrection = value;
    }

}
