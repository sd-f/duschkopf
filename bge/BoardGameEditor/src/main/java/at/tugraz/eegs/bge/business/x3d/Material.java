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
 *     &lt;extension base="{}X3DMaterialNode">
 *       &lt;attribute name="ambientIntensity" type="{}intensityType" default="0.2" />
 *       &lt;attribute name="diffuseColor" type="{}SFColor" default="0.8 0.8 0.8" />
 *       &lt;attribute name="emissiveColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="shininess" type="{}intensityType" default="0.2" />
 *       &lt;attribute name="specularColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="transparency" type="{}intensityType" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Material")
public class Material
    extends X3DMaterialNode
{

    @XmlAttribute(name = "ambientIntensity")
    protected Float ambientIntensity;
    @XmlAttribute(name = "diffuseColor")
    protected String diffuseColor;
    @XmlAttribute(name = "emissiveColor")
    protected String emissiveColor;
    @XmlAttribute(name = "shininess")
    protected Float shininess;
    @XmlAttribute(name = "specularColor")
    protected String specularColor;
    @XmlAttribute(name = "transparency")
    protected Float transparency;

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
            return  0.2F;
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
     * Ruft den Wert der diffuseColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffuseColor() {
        if (diffuseColor == null) {
            return "0.8 0.8 0.8";
        } else {
            return diffuseColor;
        }
    }

    /**
     * Legt den Wert der diffuseColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffuseColor(String value) {
        this.diffuseColor = value;
    }

    /**
     * Ruft den Wert der emissiveColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissiveColor() {
        if (emissiveColor == null) {
            return "0 0 0";
        } else {
            return emissiveColor;
        }
    }

    /**
     * Legt den Wert der emissiveColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissiveColor(String value) {
        this.emissiveColor = value;
    }

    /**
     * Ruft den Wert der shininess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getShininess() {
        if (shininess == null) {
            return  0.2F;
        } else {
            return shininess;
        }
    }

    /**
     * Legt den Wert der shininess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShininess(Float value) {
        this.shininess = value;
    }

    /**
     * Ruft den Wert der specularColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecularColor() {
        if (specularColor == null) {
            return "0 0 0";
        } else {
            return specularColor;
        }
    }

    /**
     * Legt den Wert der specularColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecularColor(String value) {
        this.specularColor = value;
    }

    /**
     * Ruft den Wert der transparency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTransparency() {
        if (transparency == null) {
            return  0.0F;
        } else {
            return transparency;
        }
    }

    /**
     * Legt den Wert der transparency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransparency(Float value) {
        this.transparency = value;
    }

}
