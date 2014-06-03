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
 *     &lt;extension base="{}X3DGroupingNode">
 *       &lt;attribute name="forceTransitions" type="{}SFBool" default="false" />
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="range" type="{}MFFloat" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LOD")
public class LOD
    extends X3DGroupingNode
{

    @XmlAttribute(name = "forceTransitions")
    protected Boolean forceTransitions;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "range")
    protected String range;

    /**
     * Ruft den Wert der forceTransitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceTransitions() {
        if (forceTransitions == null) {
            return false;
        } else {
            return forceTransitions;
        }
    }

    /**
     * Legt den Wert der forceTransitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceTransitions(Boolean value) {
        this.forceTransitions = value;
    }

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
     * Ruft den Wert der range-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

}
