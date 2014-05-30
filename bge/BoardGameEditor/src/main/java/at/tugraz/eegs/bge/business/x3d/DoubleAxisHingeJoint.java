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
 *       &lt;attribute name="desiredAngularVelocity1" type="{}SFFloat" default="0" />
 *       &lt;attribute name="desiredAngularVelocity2" type="{}SFFloat" default="0" />
 *       &lt;attribute name="maxAngle1" type="{}SFFloat" default="3.141592653" />
 *       &lt;attribute name="maxTorque1" type="{}SFFloat" default="0" />
 *       &lt;attribute name="maxTorque2" type="{}SFFloat" default="0" />
 *       &lt;attribute name="minAngle1" type="{}SFFloat" default="-3.141592653" />
 *       &lt;attribute name="stop1Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop1ConstantForceMix" type="{}SFFloat" default="0.001" />
 *       &lt;attribute name="stop1ErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="suspensionErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="suspensionForce" type="{}SFFloat" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DoubleAxisHingeJoint")
public class DoubleAxisHingeJoint
    extends X3DRigidJointNode
{

    @XmlAttribute(name = "anchorPoint")
    protected String anchorPoint;
    @XmlAttribute(name = "axis1")
    protected String axis1;
    @XmlAttribute(name = "axis2")
    protected String axis2;
    @XmlAttribute(name = "desiredAngularVelocity1")
    protected Float desiredAngularVelocity1;
    @XmlAttribute(name = "desiredAngularVelocity2")
    protected Float desiredAngularVelocity2;
    @XmlAttribute(name = "maxAngle1")
    protected Float maxAngle1;
    @XmlAttribute(name = "maxTorque1")
    protected Float maxTorque1;
    @XmlAttribute(name = "maxTorque2")
    protected Float maxTorque2;
    @XmlAttribute(name = "minAngle1")
    protected Float minAngle1;
    @XmlAttribute(name = "stop1Bounce")
    protected Float stop1Bounce;
    @XmlAttribute(name = "stop1ConstantForceMix")
    protected Float stop1ConstantForceMix;
    @XmlAttribute(name = "stop1ErrorCorrection")
    protected Float stop1ErrorCorrection;
    @XmlAttribute(name = "suspensionErrorCorrection")
    protected Float suspensionErrorCorrection;
    @XmlAttribute(name = "suspensionForce")
    protected Float suspensionForce;

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
     * Ruft den Wert der desiredAngularVelocity1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDesiredAngularVelocity1() {
        if (desiredAngularVelocity1 == null) {
            return  0.0F;
        } else {
            return desiredAngularVelocity1;
        }
    }

    /**
     * Legt den Wert der desiredAngularVelocity1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDesiredAngularVelocity1(Float value) {
        this.desiredAngularVelocity1 = value;
    }

    /**
     * Ruft den Wert der desiredAngularVelocity2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDesiredAngularVelocity2() {
        if (desiredAngularVelocity2 == null) {
            return  0.0F;
        } else {
            return desiredAngularVelocity2;
        }
    }

    /**
     * Legt den Wert der desiredAngularVelocity2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDesiredAngularVelocity2(Float value) {
        this.desiredAngularVelocity2 = value;
    }

    /**
     * Ruft den Wert der maxAngle1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxAngle1() {
        if (maxAngle1 == null) {
            return  3.1415927F;
        } else {
            return maxAngle1;
        }
    }

    /**
     * Legt den Wert der maxAngle1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAngle1(Float value) {
        this.maxAngle1 = value;
    }

    /**
     * Ruft den Wert der maxTorque1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxTorque1() {
        if (maxTorque1 == null) {
            return  0.0F;
        } else {
            return maxTorque1;
        }
    }

    /**
     * Legt den Wert der maxTorque1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTorque1(Float value) {
        this.maxTorque1 = value;
    }

    /**
     * Ruft den Wert der maxTorque2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxTorque2() {
        if (maxTorque2 == null) {
            return  0.0F;
        } else {
            return maxTorque2;
        }
    }

    /**
     * Legt den Wert der maxTorque2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTorque2(Float value) {
        this.maxTorque2 = value;
    }

    /**
     * Ruft den Wert der minAngle1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinAngle1() {
        if (minAngle1 == null) {
            return -3.1415927F;
        } else {
            return minAngle1;
        }
    }

    /**
     * Legt den Wert der minAngle1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinAngle1(Float value) {
        this.minAngle1 = value;
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
     * Ruft den Wert der stop1ConstantForceMix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop1ConstantForceMix() {
        if (stop1ConstantForceMix == null) {
            return  0.001F;
        } else {
            return stop1ConstantForceMix;
        }
    }

    /**
     * Legt den Wert der stop1ConstantForceMix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop1ConstantForceMix(Float value) {
        this.stop1ConstantForceMix = value;
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
     * Ruft den Wert der suspensionErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSuspensionErrorCorrection() {
        if (suspensionErrorCorrection == null) {
            return  0.8F;
        } else {
            return suspensionErrorCorrection;
        }
    }

    /**
     * Legt den Wert der suspensionErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSuspensionErrorCorrection(Float value) {
        this.suspensionErrorCorrection = value;
    }

    /**
     * Ruft den Wert der suspensionForce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSuspensionForce() {
        if (suspensionForce == null) {
            return  0.0F;
        } else {
            return suspensionForce;
        }
    }

    /**
     * Legt den Wert der suspensionForce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSuspensionForce(Float value) {
        this.suspensionForce = value;
    }

}
