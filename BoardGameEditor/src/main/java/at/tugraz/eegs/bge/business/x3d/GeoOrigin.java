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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *       &lt;attribute name="geoCoords" type="{}SFVec3d" default="0 0 0" />
 *       &lt;attribute name="rotateYUp" type="{}SFBool" default="false" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="geoOrigin" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GeoOrigin")
public class GeoOrigin
    extends X3DNode
{

    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "geoCoords")
    protected String geoCoords;
    @XmlAttribute(name = "rotateYUp")
    protected Boolean rotateYUp;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

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

    /**
     * Ruft den Wert der geoCoords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCoords() {
        if (geoCoords == null) {
            return "0 0 0";
        } else {
            return geoCoords;
        }
    }

    /**
     * Legt den Wert der geoCoords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCoords(String value) {
        this.geoCoords = value;
    }

    /**
     * Ruft den Wert der rotateYUp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRotateYUp() {
        if (rotateYUp == null) {
            return false;
        } else {
            return rotateYUp;
        }
    }

    /**
     * Legt den Wert der rotateYUp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotateYUp(Boolean value) {
        this.rotateYUp = value;
    }

    /**
     * Ruft den Wert der containerField-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerField() {
        if (containerField == null) {
            return "geoOrigin";
        } else {
            return containerField;
        }
    }

    /**
     * Legt den Wert der containerField-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerField(String value) {
        this.containerField = value;
    }

}
