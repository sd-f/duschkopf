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
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{}X3DTouchSensorNode">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}GeoOrigin"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geoOrigin"
})
@XmlRootElement(name = "GeoTouchSensor")
public class GeoTouchSensor
    extends X3DTouchSensorNode
{

    @XmlElement(name = "GeoOrigin")
    protected GeoOrigin geoOrigin;
    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;

    /**
     * Ruft den Wert der geoOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoOrigin }
     *     
     */
    public GeoOrigin getGeoOrigin() {
        return geoOrigin;
    }

    /**
     * Legt den Wert der geoOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoOrigin }
     *     
     */
    public void setGeoOrigin(GeoOrigin value) {
        this.geoOrigin = value;
    }

    /**
     * Ruft den Wert der geoSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoSystem() {
        if (geoSystem == null) {
            return "\"GD\" \"WE\"";
        } else {
            return geoSystem;
        }
    }

    /**
     * Legt den Wert der geoSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoSystem(String value) {
        this.geoSystem = value;
    }

}
