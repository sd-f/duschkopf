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
 * <p>Java-Klasse für X3DBackgroundNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DBackgroundNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DBindableNode">
 *       &lt;attribute name="groundAngle" type="{}MFFloat" />
 *       &lt;attribute name="groundColor" type="{}MFColor" />
 *       &lt;attribute name="skyAngle" type="{}MFFloat" />
 *       &lt;attribute name="skyColor" type="{}MFColor" default="0 0 0" />
 *       &lt;attribute name="transparency" type="{}intensityType" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DBackgroundNode")
@XmlSeeAlso({
    TextureBackground.class,
    Background.class
})
public abstract class X3DBackgroundNode
    extends X3DBindableNode
{

    @XmlAttribute(name = "groundAngle")
    protected String groundAngle;
    @XmlAttribute(name = "groundColor")
    protected String groundColor;
    @XmlAttribute(name = "skyAngle")
    protected String skyAngle;
    @XmlAttribute(name = "skyColor")
    protected String skyColor;
    @XmlAttribute(name = "transparency")
    protected Float transparency;

    /**
     * Ruft den Wert der groundAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundAngle() {
        return groundAngle;
    }

    /**
     * Legt den Wert der groundAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundAngle(String value) {
        this.groundAngle = value;
    }

    /**
     * Ruft den Wert der groundColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundColor() {
        return groundColor;
    }

    /**
     * Legt den Wert der groundColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundColor(String value) {
        this.groundColor = value;
    }

    /**
     * Ruft den Wert der skyAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyAngle() {
        return skyAngle;
    }

    /**
     * Legt den Wert der skyAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkyAngle(String value) {
        this.skyAngle = value;
    }

    /**
     * Ruft den Wert der skyColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyColor() {
        if (skyColor == null) {
            return "0 0 0";
        } else {
            return skyColor;
        }
    }

    /**
     * Legt den Wert der skyColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkyColor(String value) {
        this.skyColor = value;
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
