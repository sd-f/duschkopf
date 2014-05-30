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
 *     &lt;extension base="{}X3DInterpolatorNode">
 *       &lt;attribute name="closed" type="{}SFBool" default="false" />
 *       &lt;attribute name="keyValue" type="{}MFFloat" />
 *       &lt;attribute name="keyVelocity" type="{}MFFloat" />
 *       &lt;attribute name="normalizeVelocity" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SplineScalarInterpolator")
public class SplineScalarInterpolator
    extends X3DInterpolatorNode
{

    @XmlAttribute(name = "closed")
    protected Boolean closed;
    @XmlAttribute(name = "keyValue")
    protected String keyValue;
    @XmlAttribute(name = "keyVelocity")
    protected String keyVelocity;
    @XmlAttribute(name = "normalizeVelocity")
    protected Boolean normalizeVelocity;

    /**
     * Ruft den Wert der closed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosed() {
        if (closed == null) {
            return false;
        } else {
            return closed;
        }
    }

    /**
     * Legt den Wert der closed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Ruft den Wert der keyValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * Legt den Wert der keyValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyValue(String value) {
        this.keyValue = value;
    }

    /**
     * Ruft den Wert der keyVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVelocity() {
        return keyVelocity;
    }

    /**
     * Legt den Wert der keyVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyVelocity(String value) {
        this.keyVelocity = value;
    }

    /**
     * Ruft den Wert der normalizeVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalizeVelocity() {
        if (normalizeVelocity == null) {
            return false;
        } else {
            return normalizeVelocity;
        }
    }

    /**
     * Legt den Wert der normalizeVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalizeVelocity(Boolean value) {
        this.normalizeVelocity = value;
    }

}
