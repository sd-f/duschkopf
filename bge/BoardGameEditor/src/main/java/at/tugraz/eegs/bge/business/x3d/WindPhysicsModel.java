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
 *     &lt;extension base="{}X3DParticlePhysicsModelNode">
 *       &lt;attribute name="direction" type="{}SFVec3f" default="1 0 0" />
 *       &lt;attribute name="gustiness" type="{}SFFloat" default="0.1" />
 *       &lt;attribute name="speed" type="{}SFFloat" default="0.1" />
 *       &lt;attribute name="turbulence" type="{}SFFloat" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "WindPhysicsModel")
public class WindPhysicsModel
    extends X3DParticlePhysicsModelNode
{

    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "gustiness")
    protected Float gustiness;
    @XmlAttribute(name = "speed")
    protected Float speed;
    @XmlAttribute(name = "turbulence")
    protected Float turbulence;

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
            return "1 0 0";
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
     * Ruft den Wert der gustiness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getGustiness() {
        if (gustiness == null) {
            return  0.1F;
        } else {
            return gustiness;
        }
    }

    /**
     * Legt den Wert der gustiness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGustiness(Float value) {
        this.gustiness = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSpeed() {
        if (speed == null) {
            return  0.1F;
        } else {
            return speed;
        }
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der turbulence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTurbulence() {
        if (turbulence == null) {
            return  0.0F;
        } else {
            return turbulence;
        }
    }

    /**
     * Legt den Wert der turbulence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTurbulence(Float value) {
        this.turbulence = value;
    }

}
