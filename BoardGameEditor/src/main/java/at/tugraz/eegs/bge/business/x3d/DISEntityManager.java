//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}DISEntityTypeMapping"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="address" type="{}SFString" default="localhost" />
 *       &lt;attribute name="applicationID" type="{}SFInt32" default="1" />
 *       &lt;attribute name="port" type="{}SFInt32" default="0" />
 *       &lt;attribute name="siteID" type="{}SFInt32" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disEntityTypeMappingOrProtoInstance"
})
@XmlRootElement(name = "DISEntityManager")
public class DISEntityManager
    extends X3DChildNode
{

    @XmlElements({
        @XmlElement(name = "DISEntityTypeMapping", type = DISEntityTypeMapping.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> disEntityTypeMappingOrProtoInstance;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "applicationID")
    protected BigInteger applicationID;
    @XmlAttribute(name = "port")
    protected BigInteger port;
    @XmlAttribute(name = "siteID")
    protected BigInteger siteID;

    /**
     * Gets the value of the disEntityTypeMappingOrProtoInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disEntityTypeMappingOrProtoInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISEntityTypeMappingOrProtoInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISEntityTypeMapping }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getDISEntityTypeMappingOrProtoInstance() {
        if (disEntityTypeMappingOrProtoInstance == null) {
            disEntityTypeMappingOrProtoInstance = new ArrayList<Object>();
        }
        return this.disEntityTypeMappingOrProtoInstance;
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

}
