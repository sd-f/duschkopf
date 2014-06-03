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
 *     &lt;extension base="{}X3DNetworkSensorNode">
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *       &lt;attribute name="whichGeometry" type="{}SFInt32" default="1" />
 *       &lt;attribute name="readInterval" type="{}SFTime" default="0.1" />
 *       &lt;attribute name="writeInterval" type="{}SFTime" default="1.0" />
 *       &lt;attribute name="networkMode" type="{}networkModeValues" default="standAlone" />
 *       &lt;attribute name="siteID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="applicationID" type="{}SFInt32" default="1" />
 *       &lt;attribute name="entityID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="address" type="{}SFString" default="localhost" />
 *       &lt;attribute name="port" type="{}SFInt32" default="0" />
 *       &lt;attribute name="multicastRelayHost" type="{}SFString" />
 *       &lt;attribute name="multicastRelayPort" type="{}SFInt32" default="0" />
 *       &lt;attribute name="rtpHeaderExpected" type="{}SFBool" default="false" />
 *       &lt;attribute name="radioID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="encodingScheme" type="{}SFInt32" default="0" />
 *       &lt;attribute name="tdlType" type="{}SFInt32" default="0" />
 *       &lt;attribute name="sampleRate" type="{}SFInt32" default="0" />
 *       &lt;attribute name="samples" type="{}SFInt32" default="0" />
 *       &lt;attribute name="dataLength" type="{}SFInt32" default="0" />
 *       &lt;attribute name="data" type="{}MFInt32" />
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
@XmlRootElement(name = "SignalPdu")
public class SignalPdu
    extends X3DNetworkSensorNode
{

    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;
    @XmlAttribute(name = "whichGeometry")
    protected BigInteger whichGeometry;
    @XmlAttribute(name = "readInterval")
    protected String readInterval;
    @XmlAttribute(name = "writeInterval")
    protected String writeInterval;
    @XmlAttribute(name = "networkMode")
    protected NetworkModeValues networkMode;
    @XmlAttribute(name = "siteID")
    protected BigInteger siteID;
    @XmlAttribute(name = "applicationID")
    protected BigInteger applicationID;
    @XmlAttribute(name = "entityID")
    protected BigInteger entityID;
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
    @XmlAttribute(name = "radioID")
    protected BigInteger radioID;
    @XmlAttribute(name = "encodingScheme")
    protected BigInteger encodingScheme;
    @XmlAttribute(name = "tdlType")
    protected BigInteger tdlType;
    @XmlAttribute(name = "sampleRate")
    protected BigInteger sampleRate;
    @XmlAttribute(name = "samples")
    protected BigInteger samples;
    @XmlAttribute(name = "dataLength")
    protected BigInteger dataLength;
    @XmlAttribute(name = "data")
    protected String data;
    @XmlAttribute(name = "geoSystem")
    protected String geoSystem;
    @XmlAttribute(name = "geoCoords")
    protected String geoCoords;

    /**
     * Ruft den Wert der bboxCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxCenter() {
        if (bboxCenter == null) {
            return "0 0 0";
        } else {
            return bboxCenter;
        }
    }

    /**
     * Legt den Wert der bboxCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxCenter(String value) {
        this.bboxCenter = value;
    }

    /**
     * Ruft den Wert der bboxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxSize() {
        if (bboxSize == null) {
            return "-1 -1 -1";
        } else {
            return bboxSize;
        }
    }

    /**
     * Legt den Wert der bboxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxSize(String value) {
        this.bboxSize = value;
    }

    /**
     * Ruft den Wert der whichGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWhichGeometry() {
        if (whichGeometry == null) {
            return new BigInteger("1");
        } else {
            return whichGeometry;
        }
    }

    /**
     * Legt den Wert der whichGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWhichGeometry(BigInteger value) {
        this.whichGeometry = value;
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
     * Ruft den Wert der radioID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioID() {
        if (radioID == null) {
            return new BigInteger("0");
        } else {
            return radioID;
        }
    }

    /**
     * Legt den Wert der radioID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioID(BigInteger value) {
        this.radioID = value;
    }

    /**
     * Ruft den Wert der encodingScheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncodingScheme() {
        if (encodingScheme == null) {
            return new BigInteger("0");
        } else {
            return encodingScheme;
        }
    }

    /**
     * Legt den Wert der encodingScheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncodingScheme(BigInteger value) {
        this.encodingScheme = value;
    }

    /**
     * Ruft den Wert der tdlType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTdlType() {
        if (tdlType == null) {
            return new BigInteger("0");
        } else {
            return tdlType;
        }
    }

    /**
     * Legt den Wert der tdlType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTdlType(BigInteger value) {
        this.tdlType = value;
    }

    /**
     * Ruft den Wert der sampleRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleRate() {
        if (sampleRate == null) {
            return new BigInteger("0");
        } else {
            return sampleRate;
        }
    }

    /**
     * Legt den Wert der sampleRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleRate(BigInteger value) {
        this.sampleRate = value;
    }

    /**
     * Ruft den Wert der samples-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSamples() {
        if (samples == null) {
            return new BigInteger("0");
        } else {
            return samples;
        }
    }

    /**
     * Legt den Wert der samples-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSamples(BigInteger value) {
        this.samples = value;
    }

    /**
     * Ruft den Wert der dataLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLength() {
        if (dataLength == null) {
            return new BigInteger("0");
        } else {
            return dataLength;
        }
    }

    /**
     * Legt den Wert der dataLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataLength(BigInteger value) {
        this.dataLength = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
