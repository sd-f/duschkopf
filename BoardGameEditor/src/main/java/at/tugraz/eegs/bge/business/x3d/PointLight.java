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
 *     &lt;extension base="{}X3DLightNode">
 *       &lt;attribute name="attenuation" type="{}SFVec3f" default="1 0 0" />
 *       &lt;attribute name="location" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="radius" default="100">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="global" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PointLight")
public class PointLight
    extends X3DLightNode
{

    @XmlAttribute(name = "attenuation")
    protected String attenuation;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "radius")
    protected Float radius;
    @XmlAttribute(name = "global")
    protected Boolean global;

    /**
     * Ruft den Wert der attenuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttenuation() {
        if (attenuation == null) {
            return "1 0 0";
        } else {
            return attenuation;
        }
    }

    /**
     * Legt den Wert der attenuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttenuation(String value) {
        this.attenuation = value;
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
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getRadius() {
        if (radius == null) {
            return  100.0F;
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
     * Ruft den Wert der global-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGlobal() {
        if (global == null) {
            return true;
        } else {
            return global;
        }
    }

    /**
     * Legt den Wert der global-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobal(Boolean value) {
        this.global = value;
    }

}
