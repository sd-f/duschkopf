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
 *     &lt;extension base="{}X3DInfoNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}GeoCoordinate"/>
 *         &lt;element ref="{}GeoElevationGrid"/>
 *         &lt;element ref="{}GeoLocation"/>
 *         &lt;element ref="{}GeoOrigin"/>
 *         &lt;element ref="{}GeoLOD"/>
 *         &lt;element ref="{}GeoPositionInterpolator"/>
 *         &lt;element ref="{}GeoProximitySensor"/>
 *         &lt;element ref="{}GeoTouchSensor"/>
 *         &lt;element ref="{}GeoTransform"/>
 *         &lt;element ref="{}GeoViewpoint"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="url" type="{}MFString" />
 *       &lt;attribute name="summary" type="{}MFString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geoCoordinate",
    "geoElevationGrid",
    "geoLocation",
    "geoOrigin",
    "geoLOD",
    "geoPositionInterpolator",
    "geoProximitySensor",
    "geoTouchSensor",
    "geoTransform",
    "geoViewpoint",
    "protoInstance"
})
@XmlRootElement(name = "GeoMetadata")
public class GeoMetadata
    extends X3DInfoNode
{

    @XmlElement(name = "GeoCoordinate")
    protected GeoCoordinate geoCoordinate;
    @XmlElement(name = "GeoElevationGrid")
    protected GeoElevationGrid geoElevationGrid;
    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    @XmlElement(name = "GeoOrigin")
    protected GeoOrigin geoOrigin;
    @XmlElement(name = "GeoLOD")
    protected GeoLOD geoLOD;
    @XmlElement(name = "GeoPositionInterpolator")
    protected GeoPositionInterpolator geoPositionInterpolator;
    @XmlElement(name = "GeoProximitySensor")
    protected GeoProximitySensor geoProximitySensor;
    @XmlElement(name = "GeoTouchSensor")
    protected GeoTouchSensor geoTouchSensor;
    @XmlElement(name = "GeoTransform")
    protected GeoTransform geoTransform;
    @XmlElement(name = "GeoViewpoint")
    protected GeoViewpoint geoViewpoint;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "url")
    protected List<String> url;
    @XmlAttribute(name = "summary")
    protected List<String> summary;

    /**
     * Ruft den Wert der geoCoordinate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinate }
     *     
     */
    public GeoCoordinate getGeoCoordinate() {
        return geoCoordinate;
    }

    /**
     * Legt den Wert der geoCoordinate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinate }
     *     
     */
    public void setGeoCoordinate(GeoCoordinate value) {
        this.geoCoordinate = value;
    }

    /**
     * Ruft den Wert der geoElevationGrid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoElevationGrid }
     *     
     */
    public GeoElevationGrid getGeoElevationGrid() {
        return geoElevationGrid;
    }

    /**
     * Legt den Wert der geoElevationGrid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoElevationGrid }
     *     
     */
    public void setGeoElevationGrid(GeoElevationGrid value) {
        this.geoElevationGrid = value;
    }

    /**
     * Ruft den Wert der geoLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Legt den Wert der geoLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

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
     * Ruft den Wert der geoLOD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLOD }
     *     
     */
    public GeoLOD getGeoLOD() {
        return geoLOD;
    }

    /**
     * Legt den Wert der geoLOD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLOD }
     *     
     */
    public void setGeoLOD(GeoLOD value) {
        this.geoLOD = value;
    }

    /**
     * Ruft den Wert der geoPositionInterpolator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoPositionInterpolator }
     *     
     */
    public GeoPositionInterpolator getGeoPositionInterpolator() {
        return geoPositionInterpolator;
    }

    /**
     * Legt den Wert der geoPositionInterpolator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPositionInterpolator }
     *     
     */
    public void setGeoPositionInterpolator(GeoPositionInterpolator value) {
        this.geoPositionInterpolator = value;
    }

    /**
     * Ruft den Wert der geoProximitySensor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoProximitySensor }
     *     
     */
    public GeoProximitySensor getGeoProximitySensor() {
        return geoProximitySensor;
    }

    /**
     * Legt den Wert der geoProximitySensor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoProximitySensor }
     *     
     */
    public void setGeoProximitySensor(GeoProximitySensor value) {
        this.geoProximitySensor = value;
    }

    /**
     * Ruft den Wert der geoTouchSensor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoTouchSensor }
     *     
     */
    public GeoTouchSensor getGeoTouchSensor() {
        return geoTouchSensor;
    }

    /**
     * Legt den Wert der geoTouchSensor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTouchSensor }
     *     
     */
    public void setGeoTouchSensor(GeoTouchSensor value) {
        this.geoTouchSensor = value;
    }

    /**
     * Ruft den Wert der geoTransform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoTransform }
     *     
     */
    public GeoTransform getGeoTransform() {
        return geoTransform;
    }

    /**
     * Legt den Wert der geoTransform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTransform }
     *     
     */
    public void setGeoTransform(GeoTransform value) {
        this.geoTransform = value;
    }

    /**
     * Ruft den Wert der geoViewpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoViewpoint }
     *     
     */
    public GeoViewpoint getGeoViewpoint() {
        return geoViewpoint;
    }

    /**
     * Legt den Wert der geoViewpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoViewpoint }
     *     
     */
    public void setGeoViewpoint(GeoViewpoint value) {
        this.geoViewpoint = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
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
     * Gets the value of the summary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSummary() {
        if (summary == null) {
            summary = new ArrayList<String>();
        }
        return this.summary;
    }

}
