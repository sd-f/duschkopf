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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DLightNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DLightNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;attribute name="ambientIntensity" type="{}intensityType" default="0" />
 *       &lt;attribute name="color" type="{}SFColor" default="1 1 1" />
 *       &lt;attribute name="intensity" type="{}intensityType" default="1" />
 *       &lt;attribute name="on" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DLightNode")
@XmlSeeAlso({
    SpotLight.class,
    PointLight.class,
    DirectionalLight.class
})
public abstract class X3DLightNode
    extends X3DChildNode
{

    @XmlAttribute(name = "ambientIntensity")
    protected Float ambientIntensity;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "intensity")
    protected Float intensity;
    @XmlAttribute(name = "on")
    protected Boolean on;

    /**
     * Ruft den Wert der ambientIntensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAmbientIntensity() {
        if (ambientIntensity == null) {
            return  0.0F;
        } else {
            return ambientIntensity;
        }
    }

    /**
     * Legt den Wert der ambientIntensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmbientIntensity(Float value) {
        this.ambientIntensity = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        if (color == null) {
            return "1 1 1";
        } else {
            return color;
        }
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Ruft den Wert der on-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOn() {
        if (on == null) {
            return true;
        } else {
            return on;
        }
    }

    /**
     * Legt den Wert der on-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOn(Boolean value) {
        this.on = value;
    }

}
