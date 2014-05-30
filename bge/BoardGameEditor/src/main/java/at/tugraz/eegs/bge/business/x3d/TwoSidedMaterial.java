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
 *       &lt;attribute name="backAmbientIntensity" type="{}intensityType" default="0.2" />
 *       &lt;attribute name="diffuseColor" type="{}SFColor" default="0.8 0.8 0.8" />
 *       &lt;attribute name="backDiffuseColor" type="{}SFColor" default="0.8 0.8 0.8" />
 *       &lt;attribute name="emissiveColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="backEmissiveColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="shininess" type="{}intensityType" default="0.2" />
 *       &lt;attribute name="backShininess" type="{}intensityType" default="0.2" />
 *       &lt;attribute name="specularColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="backSpecularColor" type="{}SFColor" default="0 0 0" />
 *       &lt;attribute name="transparency" type="{}intensityType" default="0" />
 *       &lt;attribute name="backTransparency" type="{}intensityType" default="0" />
 *       &lt;attribute name="separateBackColor" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TwoSidedMaterial")
public class TwoSidedMaterial
    extends X3DMaterialNode
{

    @XmlAttribute(name = "ambientIntensity")
    protected Float ambientIntensity;
    @XmlAttribute(name = "backAmbientIntensity")
    protected Float backAmbientIntensity;
    @XmlAttribute(name = "diffuseColor")
    protected String diffuseColor;
    @XmlAttribute(name = "backDiffuseColor")
    protected String backDiffuseColor;
    @XmlAttribute(name = "emissiveColor")
    protected String emissiveColor;
    @XmlAttribute(name = "backEmissiveColor")
    protected String backEmissiveColor;
    @XmlAttribute(name = "shininess")
    protected Float shininess;
    @XmlAttribute(name = "backShininess")
    protected Float backShininess;
    @XmlAttribute(name = "specularColor")
    protected String specularColor;
    @XmlAttribute(name = "backSpecularColor")
    protected String backSpecularColor;
    @XmlAttribute(name = "transparency")
    protected Float transparency;
    @XmlAttribute(name = "backTransparency")
    protected Float backTransparency;
    @XmlAttribute(name = "separateBackColor")
    protected Boolean separateBackColor;

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
     * Ruft den Wert der backAmbientIntensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getBackAmbientIntensity() {
        if (backAmbientIntensity == null) {
            return  0.2F;
        } else {
            return backAmbientIntensity;
        }
    }

    /**
     * Legt den Wert der backAmbientIntensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBackAmbientIntensity(Float value) {
        this.backAmbientIntensity = value;
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
     * Ruft den Wert der backDiffuseColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackDiffuseColor() {
        if (backDiffuseColor == null) {
            return "0.8 0.8 0.8";
        } else {
            return backDiffuseColor;
        }
    }

    /**
     * Legt den Wert der backDiffuseColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackDiffuseColor(String value) {
        this.backDiffuseColor = value;
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
     * Ruft den Wert der backEmissiveColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackEmissiveColor() {
        if (backEmissiveColor == null) {
            return "0 0 0";
        } else {
            return backEmissiveColor;
        }
    }

    /**
     * Legt den Wert der backEmissiveColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackEmissiveColor(String value) {
        this.backEmissiveColor = value;
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
     * Ruft den Wert der backShininess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getBackShininess() {
        if (backShininess == null) {
            return  0.2F;
        } else {
            return backShininess;
        }
    }

    /**
     * Legt den Wert der backShininess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBackShininess(Float value) {
        this.backShininess = value;
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
     * Ruft den Wert der backSpecularColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackSpecularColor() {
        if (backSpecularColor == null) {
            return "0 0 0";
        } else {
            return backSpecularColor;
        }
    }

    /**
     * Legt den Wert der backSpecularColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackSpecularColor(String value) {
        this.backSpecularColor = value;
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

    /**
     * Ruft den Wert der backTransparency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getBackTransparency() {
        if (backTransparency == null) {
            return  0.0F;
        } else {
            return backTransparency;
        }
    }

    /**
     * Legt den Wert der backTransparency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBackTransparency(Float value) {
        this.backTransparency = value;
    }

    /**
     * Ruft den Wert der separateBackColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSeparateBackColor() {
        if (separateBackColor == null) {
            return false;
        } else {
            return separateBackColor;
        }
    }

    /**
     * Legt den Wert der separateBackColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeparateBackColor(Boolean value) {
        this.separateBackColor = value;
    }

}
