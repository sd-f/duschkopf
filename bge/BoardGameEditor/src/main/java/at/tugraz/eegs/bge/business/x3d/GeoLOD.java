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
 *     &lt;extension base="{}X3DGroupingNode">
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *       &lt;attribute name="rootUrl" type="{}MFString" />
 *       &lt;attribute name="child1Url" type="{}MFString" />
 *       &lt;attribute name="child2Url" type="{}MFString" />
 *       &lt;attribute name="child3Url" type="{}MFString" />
 *       &lt;attribute name="child4Url" type="{}MFString" />
 *       &lt;attribute name="center" type="{}SFVec3d" default="0 0 0" />
 *       &lt;attribute name="range" type="{}SFFloat" default="10" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GeoLOD")
public class GeoLOD
    extends X3DGroupingNode
{

    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "rootUrl")
    protected List<String> rootUrl;
    @XmlAttribute(name = "child1Url")
    protected List<String> child1Url;
    @XmlAttribute(name = "child2Url")
    protected List<String> child2Url;
    @XmlAttribute(name = "child3Url")
    protected List<String> child3Url;
    @XmlAttribute(name = "child4Url")
    protected List<String> child4Url;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "range")
    protected Float range;

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
     * Gets the value of the rootUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRootUrl() {
        if (rootUrl == null) {
            rootUrl = new ArrayList<String>();
        }
        return this.rootUrl;
    }

    /**
     * Gets the value of the child1Url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child1Url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild1Url().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChild1Url() {
        if (child1Url == null) {
            child1Url = new ArrayList<String>();
        }
        return this.child1Url;
    }

    /**
     * Gets the value of the child2Url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child2Url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild2Url().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChild2Url() {
        if (child2Url == null) {
            child2Url = new ArrayList<String>();
        }
        return this.child2Url;
    }

    /**
     * Gets the value of the child3Url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child3Url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild3Url().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChild3Url() {
        if (child3Url == null) {
            child3Url = new ArrayList<String>();
        }
        return this.child3Url;
    }

    /**
     * Gets the value of the child4Url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child4Url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild4Url().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChild4Url() {
        if (child4Url == null) {
            child4Url = new ArrayList<String>();
        }
        return this.child4Url;
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
     *     {@link Float }
     *     
     */
    public float getRange() {
        if (range == null) {
            return  10.0F;
        } else {
            return range;
        }
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRange(Float value) {
        this.range = value;
    }

}
