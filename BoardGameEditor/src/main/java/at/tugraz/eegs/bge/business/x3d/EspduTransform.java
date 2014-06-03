//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
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
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="marking" type="{}SFString" />
 *       &lt;attribute name="siteID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="applicationID" type="{}SFInt32" default="1" />
 *       &lt;attribute name="entityID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="forceID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entityKind" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entityDomain" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entityCountry" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entityCategory" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entitySubCategory" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entitySpecific" type="{}SFInt32" default="0" />
 *       &lt;attribute name="entityExtra" type="{}SFInt32" default="0" />
 *       &lt;attribute name="readInterval" type="{}SFTime" default="0.1" />
 *       &lt;attribute name="writeInterval" type="{}SFTime" default="1.0" />
 *       &lt;attribute name="networkMode" type="{}networkModeValues" default="standAlone" />
 *       &lt;attribute name="translation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="rotation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="scale" type="{}SFVec3f" default="1 1 1" />
 *       &lt;attribute name="scaleOrientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="address" type="{}SFString" default="localhost" />
 *       &lt;attribute name="port" type="{}SFInt32" default="0" />
 *       &lt;attribute name="multicastRelayHost" type="{}SFString" />
 *       &lt;attribute name="multicastRelayPort" type="{}SFInt32" default="0" />
 *       &lt;attribute name="rtpHeaderExpected" type="{}SFBool" default="false" />
 *       &lt;attribute name="deadReckoning" type="{}SFInt32" default="0" />
 *       &lt;attribute name="linearVelocity" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="linearAcceleration" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="fired1" type="{}SFBool" default="false" />
 *       &lt;attribute name="fired2" type="{}SFBool" default="false" />
 *       &lt;attribute name="collisionType" type="{}SFInt32" default="0" />
 *       &lt;attribute name="detonationLocation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="detonationRelativeLocation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="detonationResult" type="{}SFInt32" default="0" />
 *       &lt;attribute name="eventApplicationID" type="{}SFInt32" default="1" />
 *       &lt;attribute name="eventEntityID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="eventNumber" type="{}SFInt32" default="0" />
 *       &lt;attribute name="eventSiteID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="munitionStartPoint" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="munitionEndPoint" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="munitionSiteID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="munitionApplicationID" type="{}SFInt32" default="1" />
 *       &lt;attribute name="munitionEntityID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="fireMissionIndex" type="{}SFInt32" default="0" />
 *       &lt;attribute name="warhead" type="{}SFInt32" default="0" />
 *       &lt;attribute name="fuse" type="{}SFInt32" default="0" />
 *       &lt;attribute name="munitionQuantity" type="{}SFInt32" default="0" />
 *       &lt;attribute name="firingRate" type="{}SFInt32" default="0" />
 *       &lt;attribute name="firingRange" type="{}SFFloat" default="0" />
 *       &lt;attribute name="articulationParameterCount" type="{}SFInt32" default="0" />
 *       &lt;attribute name="articulationParameterDesignatorArray" type="{}MFInt32" />
 *       &lt;attribute name="articulationParameterChangeIndicatorArray" type="{}MFInt32" />
 *       &lt;attribute name="articulationParameterIdPartAttachedToArray" type="{}MFInt32" />
 *       &lt;attribute name="articulationParameterTypeArray" type="{}MFInt32" />
 *       &lt;attribute name="articulationParameterArray" type="{}MFFloat" />
 *       &lt;attribute name="geoSystem" type="{}geoSystemType" default=""GD" "WE"" />
 *       &lt;attribute name="geoCoords" type="{}SFVec3d" default="0 0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EspduTransform")
public class EspduTransform
    extends X3DGroupingNode
{

    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "marking")
    protected String marking;
    @XmlAttribute(name = "siteID")
    protected BigInteger siteID;
    @XmlAttribute(name = "applicationID")
    protected BigInteger applicationID;
    @XmlAttribute(name = "entityID")
    protected BigInteger entityID;
    @XmlAttribute(name = "forceID")
    protected BigInteger forceID;
    @XmlAttribute(name = "entityKind")
    protected BigInteger entityKind;
    @XmlAttribute(name = "entityDomain")
    protected BigInteger entityDomain;
    @XmlAttribute(name = "entityCountry")
    protected BigInteger entityCountry;
    @XmlAttribute(name = "entityCategory")
    protected BigInteger entityCategory;
    @XmlAttribute(name = "entitySubCategory")
    protected BigInteger entitySubCategory;
    @XmlAttribute(name = "entitySpecific")
    protected BigInteger entitySpecific;
    @XmlAttribute(name = "entityExtra")
    protected BigInteger entityExtra;
    @XmlAttribute(name = "readInterval")
    protected String readInterval;
    @XmlAttribute(name = "writeInterval")
    protected String writeInterval;
    @XmlAttribute(name = "networkMode")
    protected NetworkModeValues networkMode;
    @XmlAttribute(name = "translation")
    protected String translation;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "scale")
    protected String scale;
    @XmlAttribute(name = "scaleOrientation")
    protected String scaleOrientation;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "port")
    protected BigInteger port;
    @XmlAttribute(name = "multicastRelayHost")
    protected String multicastRelayHost;
    @XmlAttribute(name = "multicastRelayPort")
    protected BigInteger multicastRelayPort;
    @XmlAttribute(name = "rtpHeaderExpected")
    protected Boolean rtpHeaderExpected;
    @XmlAttribute(name = "deadReckoning")
    protected BigInteger deadReckoning;
    @XmlAttribute(name = "linearVelocity")
    protected String linearVelocity;
    @XmlAttribute(name = "linearAcceleration")
    protected String linearAcceleration;
    @XmlAttribute(name = "fired1")
    protected Boolean fired1;
    @XmlAttribute(name = "fired2")
    protected Boolean fired2;
    @XmlAttribute(name = "collisionType")
    protected BigInteger collisionType;
    @XmlAttribute(name = "detonationLocation")
    protected String detonationLocation;
    @XmlAttribute(name = "detonationRelativeLocation")
    protected String detonationRelativeLocation;
    @XmlAttribute(name = "detonationResult")
    protected BigInteger detonationResult;
    @XmlAttribute(name = "eventApplicationID")
    protected BigInteger eventApplicationID;
    @XmlAttribute(name = "eventEntityID")
    protected BigInteger eventEntityID;
    @XmlAttribute(name = "eventNumber")
    protected BigInteger eventNumber;
    @XmlAttribute(name = "eventSiteID")
    protected BigInteger eventSiteID;
    @XmlAttribute(name = "munitionStartPoint")
    protected String munitionStartPoint;
    @XmlAttribute(name = "munitionEndPoint")
    protected String munitionEndPoint;
    @XmlAttribute(name = "munitionSiteID")
    protected BigInteger munitionSiteID;
    @XmlAttribute(name = "munitionApplicationID")
    protected BigInteger munitionApplicationID;
    @XmlAttribute(name = "munitionEntityID")
    protected BigInteger munitionEntityID;
    @XmlAttribute(name = "fireMissionIndex")
    protected BigInteger fireMissionIndex;
    @XmlAttribute(name = "warhead")
    protected BigInteger warhead;
    @XmlAttribute(name = "fuse")
    protected BigInteger fuse;
    @XmlAttribute(name = "munitionQuantity")
    protected BigInteger munitionQuantity;
    @XmlAttribute(name = "firingRate")
    protected BigInteger firingRate;
    @XmlAttribute(name = "firingRange")
    protected Float firingRange;
    @XmlAttribute(name = "articulationParameterCount")
    protected BigInteger articulationParameterCount;
    @XmlAttribute(name = "articulationParameterDesignatorArray")
    protected String articulationParameterDesignatorArray;
    @XmlAttribute(name = "articulationParameterChangeIndicatorArray")
    protected String articulationParameterChangeIndicatorArray;
    @XmlAttribute(name = "articulationParameterIdPartAttachedToArray")
    protected String articulationParameterIdPartAttachedToArray;
    @XmlAttribute(name = "articulationParameterTypeArray")
    protected String articulationParameterTypeArray;
    @XmlAttribute(name = "articulationParameterArray")
    protected String articulationParameterArray;
    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "geoCoords")
    protected String geoCoords;

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Ruft den Wert der marking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarking() {
        return marking;
    }

    /**
     * Legt den Wert der marking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarking(String value) {
        this.marking = value;
    }

    /**
     * Ruft den Wert der siteID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSiteID() {
        if (siteID == null) {
            return new BigInteger("0");
        } else {
            return siteID;
        }
    }

    /**
     * Legt den Wert der siteID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSiteID(BigInteger value) {
        this.siteID = value;
    }

    /**
     * Ruft den Wert der applicationID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationID() {
        if (applicationID == null) {
            return new BigInteger("1");
        } else {
            return applicationID;
        }
    }

    /**
     * Legt den Wert der applicationID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationID(BigInteger value) {
        this.applicationID = value;
    }

    /**
     * Ruft den Wert der entityID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityID() {
        if (entityID == null) {
            return new BigInteger("0");
        } else {
            return entityID;
        }
    }

    /**
     * Legt den Wert der entityID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityID(BigInteger value) {
        this.entityID = value;
    }

    /**
     * Ruft den Wert der forceID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getForceID() {
        if (forceID == null) {
            return new BigInteger("0");
        } else {
            return forceID;
        }
    }

    /**
     * Legt den Wert der forceID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setForceID(BigInteger value) {
        this.forceID = value;
    }

    /**
     * Ruft den Wert der entityKind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityKind() {
        if (entityKind == null) {
            return new BigInteger("0");
        } else {
            return entityKind;
        }
    }

    /**
     * Legt den Wert der entityKind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityKind(BigInteger value) {
        this.entityKind = value;
    }

    /**
     * Ruft den Wert der entityDomain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityDomain() {
        if (entityDomain == null) {
            return new BigInteger("0");
        } else {
            return entityDomain;
        }
    }

    /**
     * Legt den Wert der entityDomain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityDomain(BigInteger value) {
        this.entityDomain = value;
    }

    /**
     * Ruft den Wert der entityCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityCountry() {
        if (entityCountry == null) {
            return new BigInteger("0");
        } else {
            return entityCountry;
        }
    }

    /**
     * Legt den Wert der entityCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityCountry(BigInteger value) {
        this.entityCountry = value;
    }

    /**
     * Ruft den Wert der entityCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityCategory() {
        if (entityCategory == null) {
            return new BigInteger("0");
        } else {
            return entityCategory;
        }
    }

    /**
     * Legt den Wert der entityCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityCategory(BigInteger value) {
        this.entityCategory = value;
    }

    /**
     * Ruft den Wert der entitySubCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntitySubCategory() {
        if (entitySubCategory == null) {
            return new BigInteger("0");
        } else {
            return entitySubCategory;
        }
    }

    /**
     * Legt den Wert der entitySubCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntitySubCategory(BigInteger value) {
        this.entitySubCategory = value;
    }

    /**
     * Ruft den Wert der entitySpecific-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntitySpecific() {
        if (entitySpecific == null) {
            return new BigInteger("0");
        } else {
            return entitySpecific;
        }
    }

    /**
     * Legt den Wert der entitySpecific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntitySpecific(BigInteger value) {
        this.entitySpecific = value;
    }

    /**
     * Ruft den Wert der entityExtra-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityExtra() {
        if (entityExtra == null) {
            return new BigInteger("0");
        } else {
            return entityExtra;
        }
    }

    /**
     * Legt den Wert der entityExtra-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityExtra(BigInteger value) {
        this.entityExtra = value;
    }

    /**
     * Ruft den Wert der readInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadInterval() {
        if (readInterval == null) {
            return "0.1";
        } else {
            return readInterval;
        }
    }

    /**
     * Legt den Wert der readInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadInterval(String value) {
        this.readInterval = value;
    }

    /**
     * Ruft den Wert der writeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteInterval() {
        if (writeInterval == null) {
            return "1.0";
        } else {
            return writeInterval;
        }
    }

    /**
     * Legt den Wert der writeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteInterval(String value) {
        this.writeInterval = value;
    }

    /**
     * Ruft den Wert der networkMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModeValues }
     *     
     */
    public NetworkModeValues getNetworkMode() {
        if (networkMode == null) {
            return NetworkModeValues.STAND_ALONE;
        } else {
            return networkMode;
        }
    }

    /**
     * Legt den Wert der networkMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModeValues }
     *     
     */
    public void setNetworkMode(NetworkModeValues value) {
        this.networkMode = value;
    }

    /**
     * Ruft den Wert der translation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        if (translation == null) {
            return "0 0 0";
        } else {
            return translation;
        }
    }

    /**
     * Legt den Wert der translation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        if (rotation == null) {
            return "0 0 1 0";
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        if (scale == null) {
            return "1 1 1";
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Ruft den Wert der scaleOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleOrientation() {
        if (scaleOrientation == null) {
            return "0 0 1 0";
        } else {
            return scaleOrientation;
        }
    }

    /**
     * Legt den Wert der scaleOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleOrientation(String value) {
        this.scaleOrientation = value;
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
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        if (address == null) {
            return "localhost";
        } else {
            return address;
        }
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der port-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPort() {
        if (port == null) {
            return new BigInteger("0");
        } else {
            return port;
        }
    }

    /**
     * Legt den Wert der port-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPort(BigInteger value) {
        this.port = value;
    }

    /**
     * Ruft den Wert der multicastRelayHost-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastRelayHost() {
        return multicastRelayHost;
    }

    /**
     * Legt den Wert der multicastRelayHost-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastRelayHost(String value) {
        this.multicastRelayHost = value;
    }

    /**
     * Ruft den Wert der multicastRelayPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastRelayPort() {
        if (multicastRelayPort == null) {
            return new BigInteger("0");
        } else {
            return multicastRelayPort;
        }
    }

    /**
     * Legt den Wert der multicastRelayPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastRelayPort(BigInteger value) {
        this.multicastRelayPort = value;
    }

    /**
     * Ruft den Wert der rtpHeaderExpected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtpHeaderExpected() {
        if (rtpHeaderExpected == null) {
            return false;
        } else {
            return rtpHeaderExpected;
        }
    }

    /**
     * Legt den Wert der rtpHeaderExpected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtpHeaderExpected(Boolean value) {
        this.rtpHeaderExpected = value;
    }

    /**
     * Ruft den Wert der deadReckoning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadReckoning() {
        if (deadReckoning == null) {
            return new BigInteger("0");
        } else {
            return deadReckoning;
        }
    }

    /**
     * Legt den Wert der deadReckoning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadReckoning(BigInteger value) {
        this.deadReckoning = value;
    }

    /**
     * Ruft den Wert der linearVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearVelocity() {
        if (linearVelocity == null) {
            return "0 0 0";
        } else {
            return linearVelocity;
        }
    }

    /**
     * Legt den Wert der linearVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearVelocity(String value) {
        this.linearVelocity = value;
    }

    /**
     * Ruft den Wert der linearAcceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearAcceleration() {
        if (linearAcceleration == null) {
            return "0 0 0";
        } else {
            return linearAcceleration;
        }
    }

    /**
     * Legt den Wert der linearAcceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearAcceleration(String value) {
        this.linearAcceleration = value;
    }

    /**
     * Ruft den Wert der fired1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFired1() {
        if (fired1 == null) {
            return false;
        } else {
            return fired1;
        }
    }

    /**
     * Legt den Wert der fired1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFired1(Boolean value) {
        this.fired1 = value;
    }

    /**
     * Ruft den Wert der fired2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFired2() {
        if (fired2 == null) {
            return false;
        } else {
            return fired2;
        }
    }

    /**
     * Legt den Wert der fired2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFired2(Boolean value) {
        this.fired2 = value;
    }

    /**
     * Ruft den Wert der collisionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollisionType() {
        if (collisionType == null) {
            return new BigInteger("0");
        } else {
            return collisionType;
        }
    }

    /**
     * Legt den Wert der collisionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollisionType(BigInteger value) {
        this.collisionType = value;
    }

    /**
     * Ruft den Wert der detonationLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetonationLocation() {
        if (detonationLocation == null) {
            return "0 0 0";
        } else {
            return detonationLocation;
        }
    }

    /**
     * Legt den Wert der detonationLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetonationLocation(String value) {
        this.detonationLocation = value;
    }

    /**
     * Ruft den Wert der detonationRelativeLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetonationRelativeLocation() {
        if (detonationRelativeLocation == null) {
            return "0 0 0";
        } else {
            return detonationRelativeLocation;
        }
    }

    /**
     * Legt den Wert der detonationRelativeLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetonationRelativeLocation(String value) {
        this.detonationRelativeLocation = value;
    }

    /**
     * Ruft den Wert der detonationResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDetonationResult() {
        if (detonationResult == null) {
            return new BigInteger("0");
        } else {
            return detonationResult;
        }
    }

    /**
     * Legt den Wert der detonationResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDetonationResult(BigInteger value) {
        this.detonationResult = value;
    }

    /**
     * Ruft den Wert der eventApplicationID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventApplicationID() {
        if (eventApplicationID == null) {
            return new BigInteger("1");
        } else {
            return eventApplicationID;
        }
    }

    /**
     * Legt den Wert der eventApplicationID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventApplicationID(BigInteger value) {
        this.eventApplicationID = value;
    }

    /**
     * Ruft den Wert der eventEntityID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventEntityID() {
        if (eventEntityID == null) {
            return new BigInteger("0");
        } else {
            return eventEntityID;
        }
    }

    /**
     * Legt den Wert der eventEntityID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventEntityID(BigInteger value) {
        this.eventEntityID = value;
    }

    /**
     * Ruft den Wert der eventNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventNumber() {
        if (eventNumber == null) {
            return new BigInteger("0");
        } else {
            return eventNumber;
        }
    }

    /**
     * Legt den Wert der eventNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventNumber(BigInteger value) {
        this.eventNumber = value;
    }

    /**
     * Ruft den Wert der eventSiteID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventSiteID() {
        if (eventSiteID == null) {
            return new BigInteger("0");
        } else {
            return eventSiteID;
        }
    }

    /**
     * Legt den Wert der eventSiteID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventSiteID(BigInteger value) {
        this.eventSiteID = value;
    }

    /**
     * Ruft den Wert der munitionStartPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunitionStartPoint() {
        if (munitionStartPoint == null) {
            return "0 0 0";
        } else {
            return munitionStartPoint;
        }
    }

    /**
     * Legt den Wert der munitionStartPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunitionStartPoint(String value) {
        this.munitionStartPoint = value;
    }

    /**
     * Ruft den Wert der munitionEndPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunitionEndPoint() {
        if (munitionEndPoint == null) {
            return "0 0 0";
        } else {
            return munitionEndPoint;
        }
    }

    /**
     * Legt den Wert der munitionEndPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunitionEndPoint(String value) {
        this.munitionEndPoint = value;
    }

    /**
     * Ruft den Wert der munitionSiteID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunitionSiteID() {
        if (munitionSiteID == null) {
            return new BigInteger("0");
        } else {
            return munitionSiteID;
        }
    }

    /**
     * Legt den Wert der munitionSiteID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunitionSiteID(BigInteger value) {
        this.munitionSiteID = value;
    }

    /**
     * Ruft den Wert der munitionApplicationID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunitionApplicationID() {
        if (munitionApplicationID == null) {
            return new BigInteger("1");
        } else {
            return munitionApplicationID;
        }
    }

    /**
     * Legt den Wert der munitionApplicationID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunitionApplicationID(BigInteger value) {
        this.munitionApplicationID = value;
    }

    /**
     * Ruft den Wert der munitionEntityID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunitionEntityID() {
        if (munitionEntityID == null) {
            return new BigInteger("0");
        } else {
            return munitionEntityID;
        }
    }

    /**
     * Legt den Wert der munitionEntityID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunitionEntityID(BigInteger value) {
        this.munitionEntityID = value;
    }

    /**
     * Ruft den Wert der fireMissionIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFireMissionIndex() {
        if (fireMissionIndex == null) {
            return new BigInteger("0");
        } else {
            return fireMissionIndex;
        }
    }

    /**
     * Legt den Wert der fireMissionIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFireMissionIndex(BigInteger value) {
        this.fireMissionIndex = value;
    }

    /**
     * Ruft den Wert der warhead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWarhead() {
        if (warhead == null) {
            return new BigInteger("0");
        } else {
            return warhead;
        }
    }

    /**
     * Legt den Wert der warhead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWarhead(BigInteger value) {
        this.warhead = value;
    }

    /**
     * Ruft den Wert der fuse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFuse() {
        if (fuse == null) {
            return new BigInteger("0");
        } else {
            return fuse;
        }
    }

    /**
     * Legt den Wert der fuse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFuse(BigInteger value) {
        this.fuse = value;
    }

    /**
     * Ruft den Wert der munitionQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunitionQuantity() {
        if (munitionQuantity == null) {
            return new BigInteger("0");
        } else {
            return munitionQuantity;
        }
    }

    /**
     * Legt den Wert der munitionQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunitionQuantity(BigInteger value) {
        this.munitionQuantity = value;
    }

    /**
     * Ruft den Wert der firingRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiringRate() {
        if (firingRate == null) {
            return new BigInteger("0");
        } else {
            return firingRate;
        }
    }

    /**
     * Legt den Wert der firingRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiringRate(BigInteger value) {
        this.firingRate = value;
    }

    /**
     * Ruft den Wert der firingRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getFiringRange() {
        if (firingRange == null) {
            return  0.0F;
        } else {
            return firingRange;
        }
    }

    /**
     * Legt den Wert der firingRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFiringRange(Float value) {
        this.firingRange = value;
    }

    /**
     * Ruft den Wert der articulationParameterCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArticulationParameterCount() {
        if (articulationParameterCount == null) {
            return new BigInteger("0");
        } else {
            return articulationParameterCount;
        }
    }

    /**
     * Legt den Wert der articulationParameterCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArticulationParameterCount(BigInteger value) {
        this.articulationParameterCount = value;
    }

    /**
     * Ruft den Wert der articulationParameterDesignatorArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticulationParameterDesignatorArray() {
        return articulationParameterDesignatorArray;
    }

    /**
     * Legt den Wert der articulationParameterDesignatorArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticulationParameterDesignatorArray(String value) {
        this.articulationParameterDesignatorArray = value;
    }

    /**
     * Ruft den Wert der articulationParameterChangeIndicatorArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticulationParameterChangeIndicatorArray() {
        return articulationParameterChangeIndicatorArray;
    }

    /**
     * Legt den Wert der articulationParameterChangeIndicatorArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticulationParameterChangeIndicatorArray(String value) {
        this.articulationParameterChangeIndicatorArray = value;
    }

    /**
     * Ruft den Wert der articulationParameterIdPartAttachedToArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticulationParameterIdPartAttachedToArray() {
        return articulationParameterIdPartAttachedToArray;
    }

    /**
     * Legt den Wert der articulationParameterIdPartAttachedToArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticulationParameterIdPartAttachedToArray(String value) {
        this.articulationParameterIdPartAttachedToArray = value;
    }

    /**
     * Ruft den Wert der articulationParameterTypeArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticulationParameterTypeArray() {
        return articulationParameterTypeArray;
    }

    /**
     * Legt den Wert der articulationParameterTypeArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticulationParameterTypeArray(String value) {
        this.articulationParameterTypeArray = value;
    }

    /**
     * Ruft den Wert der articulationParameterArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticulationParameterArray() {
        return articulationParameterArray;
    }

    /**
     * Legt den Wert der articulationParameterArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticulationParameterArray(String value) {
        this.articulationParameterArray = value;
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

}
