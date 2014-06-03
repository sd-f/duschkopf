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
 *     &lt;extension base="{}X3DTextureTransformNode">
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="rotation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="scale" type="{}SFVec3f" default="1 1 1" />
 *       &lt;attribute name="translation" type="{}SFVec3f" default="0 0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TextureTransform3D")
public class TextureTransform3D
    extends X3DTextureTransformNode
{

    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "scale")
    protected String scale;
    @XmlAttribute(name = "translation")
    protected String translation;

    /**
     * Ruft den Wert der center-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        if (center == null) {
            return "0 0 0";
        } else {
            return center;
        }
    }

    /**
     * Legt den Wert der center-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        if (rotation == null) {
            return "0 0 1 0";
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        if (scale == null) {
            return "1 1 1";
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Ruft den Wert der translation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        if (translation == null) {
            return "0 0 0";
        } else {
            return translation;
        }
    }

    /**
     * Legt den Wert der translation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

}
