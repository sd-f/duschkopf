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
 *       &lt;attribute name="axis1" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="axis2" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="stop1Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop1ErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="stop2Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop2ErrorCorrection" type="{}SFFloat" default="0.8" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "UniversalJoint")
public class UniversalJoint
    extends X3DRigidJointNode
{

    @XmlAttribute(name = "anchorPoint")
    protected String anchorPoint;
    @XmlAttribute(name = "axis1")
    protected String axis1;
    @XmlAttribute(name = "axis2")
    protected String axis2;
    @XmlAttribute(name = "stop1Bounce")
    protected Float stop1Bounce;
    @XmlAttribute(name = "stop1ErrorCorrection")
    protected Float stop1ErrorCorrection;
    @XmlAttribute(name = "stop2Bounce")
    protected Float stop2Bounce;
    @XmlAttribute(name = "stop2ErrorCorrection")
    protected Float stop2ErrorCorrection;

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
     * Ruft den Wert der axis1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis1() {
        if (axis1 == null) {
            return "0 0 0";
        } else {
            return axis1;
        }
    }

    /**
     * Legt den Wert der axis1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis1(String value) {
        this.axis1 = value;
    }

    /**
     * Ruft den Wert der axis2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis2() {
        if (axis2 == null) {
            return "0 0 0";
        } else {
            return axis2;
        }
    }

    /**
     * Legt den Wert der axis2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis2(String value) {
        this.axis2 = value;
    }

    /**
     * Ruft den Wert der stop1Bounce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop1Bounce() {
        if (stop1Bounce == null) {
            return  0.0F;
        } else {
            return stop1Bounce;
        }
    }

    /**
     * Legt den Wert der stop1Bounce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop1Bounce(Float value) {
        this.stop1Bounce = value;
    }

    /**
     * Ruft den Wert der stop1ErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop1ErrorCorrection() {
        if (stop1ErrorCorrection == null) {
            return  0.8F;
        } else {
            return stop1ErrorCorrection;
        }
    }

    /**
     * Legt den Wert der stop1ErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop1ErrorCorrection(Float value) {
        this.stop1ErrorCorrection = value;
    }

    /**
     * Ruft den Wert der stop2Bounce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop2Bounce() {
        if (stop2Bounce == null) {
            return  0.0F;
        } else {
            return stop2Bounce;
        }
    }

    /**
     * Legt den Wert der stop2Bounce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop2Bounce(Float value) {
        this.stop2Bounce = value;
    }

    /**
     * Ruft den Wert der stop2ErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop2ErrorCorrection() {
        if (stop2ErrorCorrection == null) {
            return  0.8F;
        } else {
            return stop2ErrorCorrection;
        }
    }

    /**
     * Legt den Wert der stop2ErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop2ErrorCorrection(Float value) {
        this.stop2ErrorCorrection = value;
    }

}
