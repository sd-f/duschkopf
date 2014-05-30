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
 *     &lt;extension base="{}X3DBindableNode">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}GeoOrigin"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *       &lt;attribute name="fieldOfView" type="{}SFFloat" default="0.7854" />
 *       &lt;attribute name="jump" type="{}SFBool" default="true" />
 *       &lt;attribute name="orientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="position" type="{}SFVec3d" default="0 0 100000" />
 *       &lt;attribute name="description" type="{}SFString" />
 *       &lt;attribute name="headlight" type="{}SFBool" default="true" />
 *       &lt;attribute name="navType" type="{}MFString" default=""EXAMINE" "ANY"" />
 *       &lt;attribute name="speedFactor" type="{}SFFloat" default="1.0" />
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
@XmlRootElement(name = "GeoViewpoint")
public class GeoViewpoint
    extends X3DBindableNode
{

    @XmlElement(name = "GeoOrigin")
    protected GeoOrigin geoOrigin;
    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "fieldOfView")
    protected Float fieldOfView;
    @XmlAttribute(name = "jump")
    protected Boolean jump;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "headlight")
    protected Boolean headlight;
    @XmlAttribute(name = "navType")
    protected List<String> navType;
    @XmlAttribute(name = "speedFactor")
    protected Float speedFactor;

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

    /**
     * Ruft den Wert der fieldOfView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getFieldOfView() {
        if (fieldOfView == null) {
            return  0.7854F;
        } else {
            return fieldOfView;
        }
    }

    /**
     * Legt den Wert der fieldOfView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFieldOfView(Float value) {
        this.fieldOfView = value;
    }

    /**
     * Ruft den Wert der jump-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isJump() {
        if (jump == null) {
            return true;
        } else {
            return jump;
        }
    }

    /**
     * Legt den Wert der jump-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJump(Boolean value) {
        this.jump = value;
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "0 0 1 0";
        } else {
            return orientation;
        }
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "0 0 100000";
        } else {
            return position;
        }
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

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
     * Ruft den Wert der headlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHeadlight() {
        if (headlight == null) {
            return true;
        } else {
            return headlight;
        }
    }

    /**
     * Legt den Wert der headlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadlight(Boolean value) {
        this.headlight = value;
    }

    /**
     * Gets the value of the navType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNavType() {
        if (navType == null) {
            navType = new ArrayList<String>();
        }
        return this.navType;
    }

    /**
     * Ruft den Wert der speedFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSpeedFactor() {
        if (speedFactor == null) {
            return  1.0F;
        } else {
            return speedFactor;
        }
    }

    /**
     * Legt den Wert der speedFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeedFactor(Float value) {
        this.speedFactor = value;
    }

}
