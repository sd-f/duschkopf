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
 *       &lt;attribute name="antennaLocation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="antennaPatternLength" type="{}SFInt32" default="0" />
 *       &lt;attribute name="antennaPatternType" type="{}SFInt32" default="0" />
 *       &lt;attribute name="cryptoKeyID" type="{}SFInt32" default="0" />
 *       &lt;attribute name="cryptoSystem" type="{}SFInt32" default="0" />
 *       &lt;attribute name="frequency" type="{}SFInt32" default="0" />
 *       &lt;attribute name="inputSource" type="{}SFInt32" default="0" />
 *       &lt;attribute name="lengthOfModulationParameters" type="{}SFInt32" default="0" />
 *       &lt;attribute name="modulationTypeDetail" type="{}SFInt32" default="0" />
 *       &lt;attribute name="modulationTypeMajor" type="{}SFInt32" default="0" />
 *       &lt;attribute name="modulationTypeSpreadSpectrum" type="{}SFInt32" default="0" />
 *       &lt;attribute name="modulationTypeSystem" type="{}SFInt32" default="0" />
 *       &lt;attribute name="power" type="{}SFFloat" default="0.0" />
 *       &lt;attribute name="radioEntityTypeCategory" type="{}SFInt32" default="0" />
 *       &lt;attribute name="radioEntityTypeCountry" type="{}SFInt32" default="0" />
 *       &lt;attribute name="radioEntityTypeDomain" type="{}SFInt32" default="0" />
 *       &lt;attribute name="radioEntityTypeKind" type="{}SFInt32" default="0" />
 *       &lt;attribute name="radioEntityTypeNomenclature" type="{}SFInt32" default="0" />
 *       &lt;attribute name="radioEntityTypeNomenclatureVersion" type="{}SFInt32" default="0" />
 *       &lt;attribute name="relativeAntennaLocation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="transmitFrequencyBandwidth" type="{}SFFloat" default="0" />
 *       &lt;attribute name="transmitState" type="{}SFInt32" default="0" />
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
@XmlRootElement(name = "TransmitterPdu")
public class TransmitterPdu
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
    @XmlAttribute(name = "antennaLocation")
    protected String antennaLocation;
    @XmlAttribute(name = "antennaPatternLength")
    protected BigInteger antennaPatternLength;
    @XmlAttribute(name = "antennaPatternType")
    protected BigInteger antennaPatternType;
    @XmlAttribute(name = "cryptoKeyID")
    protected BigInteger cryptoKeyID;
    @XmlAttribute(name = "cryptoSystem")
    protected BigInteger cryptoSystem;
    @XmlAttribute(name = "frequency")
    protected BigInteger frequency;
    @XmlAttribute(name = "inputSource")
    protected BigInteger inputSource;
    @XmlAttribute(name = "lengthOfModulationParameters")
    protected BigInteger lengthOfModulationParameters;
    @XmlAttribute(name = "modulationTypeDetail")
    protected BigInteger modulationTypeDetail;
    @XmlAttribute(name = "modulationTypeMajor")
    protected BigInteger modulationTypeMajor;
    @XmlAttribute(name = "modulationTypeSpreadSpectrum")
    protected BigInteger modulationTypeSpreadSpectrum;
    @XmlAttribute(name = "modulationTypeSystem")
    protected BigInteger modulationTypeSystem;
    @XmlAttribute(name = "power")
    protected Float power;
    @XmlAttribute(name = "radioEntityTypeCategory")
    protected BigInteger radioEntityTypeCategory;
    @XmlAttribute(name = "radioEntityTypeCountry")
    protected BigInteger radioEntityTypeCountry;
    @XmlAttribute(name = "radioEntityTypeDomain")
    protected BigInteger radioEntityTypeDomain;
    @XmlAttribute(name = "radioEntityTypeKind")
    protected BigInteger radioEntityTypeKind;
    @XmlAttribute(name = "radioEntityTypeNomenclature")
    protected BigInteger radioEntityTypeNomenclature;
    @XmlAttribute(name = "radioEntityTypeNomenclatureVersion")
    protected BigInteger radioEntityTypeNomenclatureVersion;
    @XmlAttribute(name = "relativeAntennaLocation")
    protected String relativeAntennaLocation;
    @XmlAttribute(name = "transmitFrequencyBandwidth")
    protected Float transmitFrequencyBandwidth;
    @XmlAttribute(name = "transmitState")
    protected BigInteger transmitState;
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
     * Ruft den Wert der antennaLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaLocation() {
        if (antennaLocation == null) {
            return "0 0 0";
        } else {
            return antennaLocation;
        }
    }

    /**
     * Legt den Wert der antennaLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaLocation(String value) {
        this.antennaLocation = value;
    }

    /**
     * Ruft den Wert der antennaPatternLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAntennaPatternLength() {
        if (antennaPatternLength == null) {
            return new BigInteger("0");
        } else {
            return antennaPatternLength;
        }
    }

    /**
     * Legt den Wert der antennaPatternLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAntennaPatternLength(BigInteger value) {
        this.antennaPatternLength = value;
    }

    /**
     * Ruft den Wert der antennaPatternType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAntennaPatternType() {
        if (antennaPatternType == null) {
            return new BigInteger("0");
        } else {
            return antennaPatternType;
        }
    }

    /**
     * Legt den Wert der antennaPatternType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAntennaPatternType(BigInteger value) {
        this.antennaPatternType = value;
    }

    /**
     * Ruft den Wert der cryptoKeyID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCryptoKeyID() {
        if (cryptoKeyID == null) {
            return new BigInteger("0");
        } else {
            return cryptoKeyID;
        }
    }

    /**
     * Legt den Wert der cryptoKeyID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCryptoKeyID(BigInteger value) {
        this.cryptoKeyID = value;
    }

    /**
     * Ruft den Wert der cryptoSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCryptoSystem() {
        if (cryptoSystem == null) {
            return new BigInteger("0");
        } else {
            return cryptoSystem;
        }
    }

    /**
     * Legt den Wert der cryptoSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCryptoSystem(BigInteger value) {
        this.cryptoSystem = value;
    }

    /**
     * Ruft den Wert der frequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequency() {
        if (frequency == null) {
            return new BigInteger("0");
        } else {
            return frequency;
        }
    }

    /**
     * Legt den Wert der frequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequency(BigInteger value) {
        this.frequency = value;
    }

    /**
     * Ruft den Wert der inputSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInputSource() {
        if (inputSource == null) {
            return new BigInteger("0");
        } else {
            return inputSource;
        }
    }

    /**
     * Legt den Wert der inputSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInputSource(BigInteger value) {
        this.inputSource = value;
    }

    /**
     * Ruft den Wert der lengthOfModulationParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthOfModulationParameters() {
        if (lengthOfModulationParameters == null) {
            return new BigInteger("0");
        } else {
            return lengthOfModulationParameters;
        }
    }

    /**
     * Legt den Wert der lengthOfModulationParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthOfModulationParameters(BigInteger value) {
        this.lengthOfModulationParameters = value;
    }

    /**
     * Ruft den Wert der modulationTypeDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModulationTypeDetail() {
        if (modulationTypeDetail == null) {
            return new BigInteger("0");
        } else {
            return modulationTypeDetail;
        }
    }

    /**
     * Legt den Wert der modulationTypeDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModulationTypeDetail(BigInteger value) {
        this.modulationTypeDetail = value;
    }

    /**
     * Ruft den Wert der modulationTypeMajor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModulationTypeMajor() {
        if (modulationTypeMajor == null) {
            return new BigInteger("0");
        } else {
            return modulationTypeMajor;
        }
    }

    /**
     * Legt den Wert der modulationTypeMajor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModulationTypeMajor(BigInteger value) {
        this.modulationTypeMajor = value;
    }

    /**
     * Ruft den Wert der modulationTypeSpreadSpectrum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModulationTypeSpreadSpectrum() {
        if (modulationTypeSpreadSpectrum == null) {
            return new BigInteger("0");
        } else {
            return modulationTypeSpreadSpectrum;
        }
    }

    /**
     * Legt den Wert der modulationTypeSpreadSpectrum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModulationTypeSpreadSpectrum(BigInteger value) {
        this.modulationTypeSpreadSpectrum = value;
    }

    /**
     * Ruft den Wert der modulationTypeSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModulationTypeSystem() {
        if (modulationTypeSystem == null) {
            return new BigInteger("0");
        } else {
            return modulationTypeSystem;
        }
    }

    /**
     * Legt den Wert der modulationTypeSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModulationTypeSystem(BigInteger value) {
        this.modulationTypeSystem = value;
    }

    /**
     * Ruft den Wert der power-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getPower() {
        if (power == null) {
            return  0.0F;
        } else {
            return power;
        }
    }

    /**
     * Legt den Wert der power-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPower(Float value) {
        this.power = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeCategory() {
        if (radioEntityTypeCategory == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeCategory;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeCategory(BigInteger value) {
        this.radioEntityTypeCategory = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeCountry() {
        if (radioEntityTypeCountry == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeCountry;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeCountry(BigInteger value) {
        this.radioEntityTypeCountry = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeDomain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeDomain() {
        if (radioEntityTypeDomain == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeDomain;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeDomain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeDomain(BigInteger value) {
        this.radioEntityTypeDomain = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeKind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeKind() {
        if (radioEntityTypeKind == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeKind;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeKind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeKind(BigInteger value) {
        this.radioEntityTypeKind = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeNomenclature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeNomenclature() {
        if (radioEntityTypeNomenclature == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeNomenclature;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeNomenclature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeNomenclature(BigInteger value) {
        this.radioEntityTypeNomenclature = value;
    }

    /**
     * Ruft den Wert der radioEntityTypeNomenclatureVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadioEntityTypeNomenclatureVersion() {
        if (radioEntityTypeNomenclatureVersion == null) {
            return new BigInteger("0");
        } else {
            return radioEntityTypeNomenclatureVersion;
        }
    }

    /**
     * Legt den Wert der radioEntityTypeNomenclatureVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadioEntityTypeNomenclatureVersion(BigInteger value) {
        this.radioEntityTypeNomenclatureVersion = value;
    }

    /**
     * Ruft den Wert der relativeAntennaLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeAntennaLocation() {
        if (relativeAntennaLocation == null) {
            return "0 0 0";
        } else {
            return relativeAntennaLocation;
        }
    }

    /**
     * Legt den Wert der relativeAntennaLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeAntennaLocation(String value) {
        this.relativeAntennaLocation = value;
    }

    /**
     * Ruft den Wert der transmitFrequencyBandwidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTransmitFrequencyBandwidth() {
        if (transmitFrequencyBandwidth == null) {
            return  0.0F;
        } else {
            return transmitFrequencyBandwidth;
        }
    }

    /**
     * Legt den Wert der transmitFrequencyBandwidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransmitFrequencyBandwidth(Float value) {
        this.transmitFrequencyBandwidth = value;
    }

    /**
     * Ruft den Wert der transmitState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransmitState() {
        if (transmitState == null) {
            return new BigInteger("0");
        } else {
            return transmitState;
        }
    }

    /**
     * Legt den Wert der transmitState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransmitState(BigInteger value) {
        this.transmitState = value;
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
