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
 *     &lt;extension base="{}X3DSoundNode">
 *       &lt;attribute name="direction" type="{}SFVec3f" default="0 0 1" />
 *       &lt;attribute name="intensity" type="{}intensityType" default="1" />
 *       &lt;attribute name="location" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="maxBack" type="{}SFFloat" default="10" />
 *       &lt;attribute name="maxFront" type="{}SFFloat" default="10" />
 *       &lt;attribute name="minBack" type="{}SFFloat" default="1" />
 *       &lt;attribute name="minFront" type="{}SFFloat" default="1" />
 *       &lt;attribute name="priority" type="{}intensityType" default="0" />
 *       &lt;attribute name="spatialize" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Sound")
public class Sound
    extends X3DSoundNode
{

    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "intensity")
    protected Float intensity;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "maxBack")
    protected Float maxBack;
    @XmlAttribute(name = "maxFront")
    protected Float maxFront;
    @XmlAttribute(name = "minBack")
    protected Float minBack;
    @XmlAttribute(name = "minFront")
    protected Float minFront;
    @XmlAttribute(name = "priority")
    protected Float priority;
    @XmlAttribute(name = "spatialize")
    protected Boolean spatialize;

    /**
     * Ruft den Wert der direction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "0 0 1";
        } else {
            return direction;
        }
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Ruft den Wert der intensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getIntensity() {
        if (intensity == null) {
            return  1.0F;
        } else {
            return intensity;
        }
    }

    /**
     * Legt den Wert der intensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIntensity(Float value) {
        this.intensity = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        if (location == null) {
            return "0 0 0";
        } else {
            return location;
        }
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der maxBack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxBack() {
        if (maxBack == null) {
            return  10.0F;
        } else {
            return maxBack;
        }
    }

    /**
     * Legt den Wert der maxBack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxBack(Float value) {
        this.maxBack = value;
    }

    /**
     * Ruft den Wert der maxFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxFront() {
        if (maxFront == null) {
            return  10.0F;
        } else {
            return maxFront;
        }
    }

    /**
     * Legt den Wert der maxFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxFront(Float value) {
        this.maxFront = value;
    }

    /**
     * Ruft den Wert der minBack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinBack() {
        if (minBack == null) {
            return  1.0F;
        } else {
            return minBack;
        }
    }

    /**
     * Legt den Wert der minBack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinBack(Float value) {
        this.minBack = value;
    }

    /**
     * Ruft den Wert der minFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinFront() {
        if (minFront == null) {
            return  1.0F;
        } else {
            return minFront;
        }
    }

    /**
     * Legt den Wert der minFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinFront(Float value) {
        this.minFront = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getPriority() {
        if (priority == null) {
            return  0.0F;
        } else {
            return priority;
        }
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriority(Float value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der spatialize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSpatialize() {
        if (spatialize == null) {
            return true;
        } else {
            return spatialize;
        }
    }

    /**
     * Legt den Wert der spatialize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpatialize(Boolean value) {
        this.spatialize = value;
    }

}
