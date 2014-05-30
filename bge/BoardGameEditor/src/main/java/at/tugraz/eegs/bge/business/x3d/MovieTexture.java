//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{}X3DSoundSourceNode">
 *       &lt;attribute name="description" type="{}SFString" />
 *       &lt;attribute name="url" type="{}MFString" />
 *       &lt;attribute name="repeatS" type="{}SFBool" default="true" />
 *       &lt;attribute name="repeatT" type="{}SFBool" default="true" />
 *       &lt;attribute name="speed" type="{}SFFloat" default="1.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MovieTexture")
public class MovieTexture
    extends X3DSoundSourceNode
{

    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "url")
    protected List<String> url;
    @XmlAttribute(name = "repeatS")
    protected Boolean repeatS;
    @XmlAttribute(name = "repeatT")
    protected Boolean repeatT;
    @XmlAttribute(name = "speed")
    protected Float speed;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrl() {
        if (url == null) {
            url = new ArrayList<String>();
        }
        return this.url;
    }

    /**
     * Ruft den Wert der repeatS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatS() {
        if (repeatS == null) {
            return true;
        } else {
            return repeatS;
        }
    }

    /**
     * Legt den Wert der repeatS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatS(Boolean value) {
        this.repeatS = value;
    }

    /**
     * Ruft den Wert der repeatT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatT() {
        if (repeatT == null) {
            return true;
        } else {
            return repeatT;
        }
    }

    /**
     * Legt den Wert der repeatT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatT(Boolean value) {
        this.repeatT = value;
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
            return  1.0F;
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

}
