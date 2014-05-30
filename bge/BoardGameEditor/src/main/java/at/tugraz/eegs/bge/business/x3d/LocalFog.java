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
 *     &lt;extension base="{}X3DBindableNode">
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="color" type="{}SFColor" default="1 1 1" />
 *       &lt;attribute name="fogType" type="{}fogTypeValues" default="LINEAR" />
 *       &lt;attribute name="visibilityRange" type="{}SFFloat" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LocalFog")
public class LocalFog
    extends X3DBindableNode
{

    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "fogType")
    protected FogTypeValues fogType;
    @XmlAttribute(name = "visibilityRange")
    protected Float visibilityRange;

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
     * Ruft den Wert der fogType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FogTypeValues }
     *     
     */
    public FogTypeValues getFogType() {
        if (fogType == null) {
            return FogTypeValues.LINEAR;
        } else {
            return fogType;
        }
    }

    /**
     * Legt den Wert der fogType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FogTypeValues }
     *     
     */
    public void setFogType(FogTypeValues value) {
        this.fogType = value;
    }

    /**
     * Ruft den Wert der visibilityRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getVisibilityRange() {
        if (visibilityRange == null) {
            return  0.0F;
        } else {
            return visibilityRange;
        }
    }

    /**
     * Legt den Wert der visibilityRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVisibilityRange(Float value) {
        this.visibilityRange = value;
    }

}
