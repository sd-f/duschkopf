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
 *       &lt;attribute name="axis" type="{}SFVec3f" default="0 1 0" />
 *       &lt;attribute name="maxSeparation" type="{}SFFloat" default="1" />
 *       &lt;attribute name="minSeparation" type="{}SFFloat" default="0" />
 *       &lt;attribute name="sliderForce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stopBounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="stopErrorCorrection" type="{}SFFloat" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SliderJoint")
public class SliderJoint
    extends X3DRigidJointNode
{

    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "maxSeparation")
    protected Float maxSeparation;
    @XmlAttribute(name = "minSeparation")
    protected Float minSeparation;
    @XmlAttribute(name = "sliderForce")
    protected Float sliderForce;
    @XmlAttribute(name = "stopBounce")
    protected Float stopBounce;
    @XmlAttribute(name = "stopErrorCorrection")
    protected Float stopErrorCorrection;

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
            return "0 1 0";
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
     * Ruft den Wert der maxSeparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxSeparation() {
        if (maxSeparation == null) {
            return  1.0F;
        } else {
            return maxSeparation;
        }
    }

    /**
     * Legt den Wert der maxSeparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxSeparation(Float value) {
        this.maxSeparation = value;
    }

    /**
     * Ruft den Wert der minSeparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinSeparation() {
        if (minSeparation == null) {
            return  0.0F;
        } else {
            return minSeparation;
        }
    }

    /**
     * Legt den Wert der minSeparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinSeparation(Float value) {
        this.minSeparation = value;
    }

    /**
     * Ruft den Wert der sliderForce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSliderForce() {
        if (sliderForce == null) {
            return  0.0F;
        } else {
            return sliderForce;
        }
    }

    /**
     * Legt den Wert der sliderForce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSliderForce(Float value) {
        this.sliderForce = value;
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
            return  1.0F;
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
