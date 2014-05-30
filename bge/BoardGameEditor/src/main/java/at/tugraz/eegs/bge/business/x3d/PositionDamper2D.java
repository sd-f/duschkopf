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
 *     &lt;extension base="{}X3DDamperNode">
 *       &lt;attribute name="initialDestination" type="{}SFVec2f" default="0 0" />
 *       &lt;attribute name="initialValue" type="{}SFVec2f" default="0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PositionDamper2D")
public class PositionDamper2D
    extends X3DDamperNode
{

    @XmlAttribute(name = "initialDestination")
    protected String initialDestination;
    @XmlAttribute(name = "initialValue")
    protected String initialValue;

    /**
     * Ruft den Wert der initialDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDestination() {
        if (initialDestination == null) {
            return "0 0";
        } else {
            return initialDestination;
        }
    }

    /**
     * Legt den Wert der initialDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDestination(String value) {
        this.initialDestination = value;
    }

    /**
     * Ruft den Wert der initialValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialValue() {
        if (initialValue == null) {
            return "0 0";
        } else {
            return initialValue;
        }
    }

    /**
     * Legt den Wert der initialValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialValue(String value) {
        this.initialValue = value;
    }

}
