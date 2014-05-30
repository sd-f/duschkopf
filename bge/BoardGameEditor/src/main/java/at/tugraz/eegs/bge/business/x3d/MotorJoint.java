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
 *       &lt;attribute name="autoCalc" type="{}SFBool" default="false" />
 *       &lt;attribute name="axis1Angle" type="{}SFFloat" default="0" />
 *       &lt;attribute name="axis1Torque" type="{}SFFloat" default="0" />
 *       &lt;attribute name="axis2Angle" type="{}SFFloat" default="0" />
 *       &lt;attribute name="axis2Torque" type="{}SFFloat" default="0" />
 *       &lt;attribute name="axis3Angle" type="{}SFFloat" default="0" />
 *       &lt;attribute name="axis3Torque" type="{}SFFloat" default="0" />
 *       &lt;attribute name="enabledAxes" default="1">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="motor1Axis" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="motor2Axis" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="motor3Axis" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="stop1Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop1ErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="stop2Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop2ErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="stop3Bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stop3ErrorCorrection" type="{}SFFloat" default="0.8" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MotorJoint")
public class MotorJoint
    extends X3DRigidJointNode
{

    @XmlAttribute(name = "autoCalc")
    protected Boolean autoCalc;
    @XmlAttribute(name = "axis1Angle")
    protected Float axis1Angle;
    @XmlAttribute(name = "axis1Torque")
    protected Float axis1Torque;
    @XmlAttribute(name = "axis2Angle")
    protected Float axis2Angle;
    @XmlAttribute(name = "axis2Torque")
    protected Float axis2Torque;
    @XmlAttribute(name = "axis3Angle")
    protected Float axis3Angle;
    @XmlAttribute(name = "axis3Torque")
    protected Float axis3Torque;
    @XmlAttribute(name = "enabledAxes")
    protected Integer enabledAxes;
    @XmlAttribute(name = "motor1Axis")
    protected String motor1Axis;
    @XmlAttribute(name = "motor2Axis")
    protected String motor2Axis;
    @XmlAttribute(name = "motor3Axis")
    protected String motor3Axis;
    @XmlAttribute(name = "stop1Bounce")
    protected Float stop1Bounce;
    @XmlAttribute(name = "stop1ErrorCorrection")
    protected Float stop1ErrorCorrection;
    @XmlAttribute(name = "stop2Bounce")
    protected Float stop2Bounce;
    @XmlAttribute(name = "stop2ErrorCorrection")
    protected Float stop2ErrorCorrection;
    @XmlAttribute(name = "stop3Bounce")
    protected Float stop3Bounce;
    @XmlAttribute(name = "stop3ErrorCorrection")
    protected Float stop3ErrorCorrection;

    /**
     * Ruft den Wert der autoCalc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoCalc() {
        if (autoCalc == null) {
            return false;
        } else {
            return autoCalc;
        }
    }

    /**
     * Legt den Wert der autoCalc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCalc(Boolean value) {
        this.autoCalc = value;
    }

    /**
     * Ruft den Wert der axis1Angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis1Angle() {
        if (axis1Angle == null) {
            return  0.0F;
        } else {
            return axis1Angle;
        }
    }

    /**
     * Legt den Wert der axis1Angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis1Angle(Float value) {
        this.axis1Angle = value;
    }

    /**
     * Ruft den Wert der axis1Torque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis1Torque() {
        if (axis1Torque == null) {
            return  0.0F;
        } else {
            return axis1Torque;
        }
    }

    /**
     * Legt den Wert der axis1Torque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis1Torque(Float value) {
        this.axis1Torque = value;
    }

    /**
     * Ruft den Wert der axis2Angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis2Angle() {
        if (axis2Angle == null) {
            return  0.0F;
        } else {
            return axis2Angle;
        }
    }

    /**
     * Legt den Wert der axis2Angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis2Angle(Float value) {
        this.axis2Angle = value;
    }

    /**
     * Ruft den Wert der axis2Torque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis2Torque() {
        if (axis2Torque == null) {
            return  0.0F;
        } else {
            return axis2Torque;
        }
    }

    /**
     * Legt den Wert der axis2Torque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis2Torque(Float value) {
        this.axis2Torque = value;
    }

    /**
     * Ruft den Wert der axis3Angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis3Angle() {
        if (axis3Angle == null) {
            return  0.0F;
        } else {
            return axis3Angle;
        }
    }

    /**
     * Legt den Wert der axis3Angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis3Angle(Float value) {
        this.axis3Angle = value;
    }

    /**
     * Ruft den Wert der axis3Torque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAxis3Torque() {
        if (axis3Torque == null) {
            return  0.0F;
        } else {
            return axis3Torque;
        }
    }

    /**
     * Legt den Wert der axis3Torque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxis3Torque(Float value) {
        this.axis3Torque = value;
    }

    /**
     * Ruft den Wert der enabledAxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getEnabledAxes() {
        if (enabledAxes == null) {
            return  1;
        } else {
            return enabledAxes;
        }
    }

    /**
     * Legt den Wert der enabledAxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnabledAxes(Integer value) {
        this.enabledAxes = value;
    }

    /**
     * Ruft den Wert der motor1Axis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor1Axis() {
        if (motor1Axis == null) {
            return "0 0 0";
        } else {
            return motor1Axis;
        }
    }

    /**
     * Legt den Wert der motor1Axis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor1Axis(String value) {
        this.motor1Axis = value;
    }

    /**
     * Ruft den Wert der motor2Axis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor2Axis() {
        if (motor2Axis == null) {
            return "0 0 0";
        } else {
            return motor2Axis;
        }
    }

    /**
     * Legt den Wert der motor2Axis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor2Axis(String value) {
        this.motor2Axis = value;
    }

    /**
     * Ruft den Wert der motor3Axis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor3Axis() {
        if (motor3Axis == null) {
            return "0 0 0";
        } else {
            return motor3Axis;
        }
    }

    /**
     * Legt den Wert der motor3Axis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor3Axis(String value) {
        this.motor3Axis = value;
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

    /**
     * Ruft den Wert der stop3Bounce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop3Bounce() {
        if (stop3Bounce == null) {
            return  0.0F;
        } else {
            return stop3Bounce;
        }
    }

    /**
     * Legt den Wert der stop3Bounce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop3Bounce(Float value) {
        this.stop3Bounce = value;
    }

    /**
     * Ruft den Wert der stop3ErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getStop3ErrorCorrection() {
        if (stop3ErrorCorrection == null) {
            return  0.8F;
        } else {
            return stop3ErrorCorrection;
        }
    }

    /**
     * Legt den Wert der stop3ErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStop3ErrorCorrection(Float value) {
        this.stop3ErrorCorrection = value;
    }

}
