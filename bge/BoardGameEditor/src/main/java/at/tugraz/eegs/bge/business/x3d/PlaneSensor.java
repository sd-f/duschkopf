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
 *     &lt;extension base="{}X3DDragSensorNode">
 *       &lt;attribute name="maxPosition" type="{}SFVec2f" default="-1 -1" />
 *       &lt;attribute name="minPosition" type="{}SFVec2f" default="0 0" />
 *       &lt;attribute name="offset" type="{}SFVec3f" default="0 0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PlaneSensor")
public class PlaneSensor
    extends X3DDragSensorNode
{

    @XmlAttribute(name = "maxPosition")
    protected String maxPosition;
    @XmlAttribute(name = "minPosition")
    protected String minPosition;
    @XmlAttribute(name = "offset")
    protected String offset;

    /**
     * Ruft den Wert der maxPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPosition() {
        if (maxPosition == null) {
            return "-1 -1";
        } else {
            return maxPosition;
        }
    }

    /**
     * Legt den Wert der maxPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPosition(String value) {
        this.maxPosition = value;
    }

    /**
     * Ruft den Wert der minPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPosition() {
        if (minPosition == null) {
            return "0 0";
        } else {
            return minPosition;
        }
    }

    /**
     * Legt den Wert der minPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPosition(String value) {
        this.minPosition = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        if (offset == null) {
            return "0 0 0";
        } else {
            return offset;
        }
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

}
