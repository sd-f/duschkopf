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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}IS" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}MetadataDouble"/>
 *           &lt;element ref="{}MetadataFloat"/>
 *           &lt;element ref="{}MetadataInteger"/>
 *           &lt;element ref="{}MetadataSet"/>
 *           &lt;element ref="{}MetadataString"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DEF" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="shellType" type="{}XvlShell.shellTypes" />
 *       &lt;attribute name="numberOfDivisions" type="{}SFInt32" />
 *       &lt;attribute name="vertexRound" type="{}MFFloat" />
 *       &lt;attribute name="edgeBeginCoordIndex" type="{}MFInt32" />
 *       &lt;attribute name="edgeEndCoordIndex" type="{}MFInt32" />
 *       &lt;attribute name="edgeRound" type="{}MFFloat" />
 *       &lt;attribute name="edgeBeginVector" type="{}MFVec3f" />
 *       &lt;attribute name="edgeEndVector" type="{}MFVec3f" />
 *       &lt;attribute name="faceCoordIndex" type="{}MFInt32" />
 *       &lt;attribute name="faceTexCoordIndex" type="{}MFInt32" />
 *       &lt;attribute name="faceEmpty" type="{}MFBool" />
 *       &lt;attribute name="faceHidden" type="{}MFBool" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="geometry" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "is",
    "metadataDouble",
    "metadataFloat",
    "metadataInteger",
    "metadataSet",
    "metadataString"
})
@XmlRootElement(name = "XvlShell")
public class XvlShell {

    @XmlElement(name = "IS")
    protected IS is;
    @XmlElement(name = "MetadataDouble")
    protected MetadataDouble metadataDouble;
    @XmlElement(name = "MetadataFloat")
    protected MetadataFloat metadataFloat;
    @XmlElement(name = "MetadataInteger")
    protected MetadataInteger metadataInteger;
    @XmlElement(name = "MetadataSet")
    protected MetadataSet metadataSet;
    @XmlElement(name = "MetadataString")
    protected MetadataString metadataString;
    @XmlAttribute(name = "DEF")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String def;
    @XmlAttribute(name = "USE")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object use;
    @XmlAttribute(name = "shellType")
    protected XvlShellShellTypes shellType;
    @XmlAttribute(name = "numberOfDivisions")
    protected BigInteger numberOfDivisions;
    @XmlAttribute(name = "vertexRound")
    protected String vertexRound;
    @XmlAttribute(name = "edgeBeginCoordIndex")
    protected String edgeBeginCoordIndex;
    @XmlAttribute(name = "edgeEndCoordIndex")
    protected String edgeEndCoordIndex;
    @XmlAttribute(name = "edgeRound")
    protected String edgeRound;
    @XmlAttribute(name = "edgeBeginVector")
    protected String edgeBeginVector;
    @XmlAttribute(name = "edgeEndVector")
    protected String edgeEndVector;
    @XmlAttribute(name = "faceCoordIndex")
    protected String faceCoordIndex;
    @XmlAttribute(name = "faceTexCoordIndex")
    protected String faceTexCoordIndex;
    @XmlAttribute(name = "faceEmpty")
    protected List<Boolean> faceEmpty;
    @XmlAttribute(name = "faceHidden")
    protected List<Boolean> faceHidden;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der is-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IS }
     *     
     */
    public IS getIS() {
        return is;
    }

    /**
     * Legt den Wert der is-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IS }
     *     
     */
    public void setIS(IS value) {
        this.is = value;
    }

    /**
     * Ruft den Wert der metadataDouble-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDouble }
     *     
     */
    public MetadataDouble getMetadataDouble() {
        return metadataDouble;
    }

    /**
     * Legt den Wert der metadataDouble-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDouble }
     *     
     */
    public void setMetadataDouble(MetadataDouble value) {
        this.metadataDouble = value;
    }

    /**
     * Ruft den Wert der metadataFloat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataFloat }
     *     
     */
    public MetadataFloat getMetadataFloat() {
        return metadataFloat;
    }

    /**
     * Legt den Wert der metadataFloat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataFloat }
     *     
     */
    public void setMetadataFloat(MetadataFloat value) {
        this.metadataFloat = value;
    }

    /**
     * Ruft den Wert der metadataInteger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataInteger }
     *     
     */
    public MetadataInteger getMetadataInteger() {
        return metadataInteger;
    }

    /**
     * Legt den Wert der metadataInteger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataInteger }
     *     
     */
    public void setMetadataInteger(MetadataInteger value) {
        this.metadataInteger = value;
    }

    /**
     * Ruft den Wert der metadataSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataSet }
     *     
     */
    public MetadataSet getMetadataSet() {
        return metadataSet;
    }

    /**
     * Legt den Wert der metadataSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataSet }
     *     
     */
    public void setMetadataSet(MetadataSet value) {
        this.metadataSet = value;
    }

    /**
     * Ruft den Wert der metadataString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataString }
     *     
     */
    public MetadataString getMetadataString() {
        return metadataString;
    }

    /**
     * Legt den Wert der metadataString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataString }
     *     
     */
    public void setMetadataString(MetadataString value) {
        this.metadataString = value;
    }

    /**
     * Ruft den Wert der def-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEF() {
        return def;
    }

    /**
     * Legt den Wert der def-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEF(String value) {
        this.def = value;
    }

    /**
     * Ruft den Wert der use-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUSE() {
        return use;
    }

    /**
     * Legt den Wert der use-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUSE(Object value) {
        this.use = value;
    }

    /**
     * Ruft den Wert der shellType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XvlShellShellTypes }
     *     
     */
    public XvlShellShellTypes getShellType() {
        return shellType;
    }

    /**
     * Legt den Wert der shellType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XvlShellShellTypes }
     *     
     */
    public void setShellType(XvlShellShellTypes value) {
        this.shellType = value;
    }

    /**
     * Ruft den Wert der numberOfDivisions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDivisions() {
        return numberOfDivisions;
    }

    /**
     * Legt den Wert der numberOfDivisions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDivisions(BigInteger value) {
        this.numberOfDivisions = value;
    }

    /**
     * Ruft den Wert der vertexRound-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertexRound() {
        return vertexRound;
    }

    /**
     * Legt den Wert der vertexRound-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertexRound(String value) {
        this.vertexRound = value;
    }

    /**
     * Ruft den Wert der edgeBeginCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeBeginCoordIndex() {
        return edgeBeginCoordIndex;
    }

    /**
     * Legt den Wert der edgeBeginCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeBeginCoordIndex(String value) {
        this.edgeBeginCoordIndex = value;
    }

    /**
     * Ruft den Wert der edgeEndCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeEndCoordIndex() {
        return edgeEndCoordIndex;
    }

    /**
     * Legt den Wert der edgeEndCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeEndCoordIndex(String value) {
        this.edgeEndCoordIndex = value;
    }

    /**
     * Ruft den Wert der edgeRound-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeRound() {
        return edgeRound;
    }

    /**
     * Legt den Wert der edgeRound-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeRound(String value) {
        this.edgeRound = value;
    }

    /**
     * Ruft den Wert der edgeBeginVector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeBeginVector() {
        return edgeBeginVector;
    }

    /**
     * Legt den Wert der edgeBeginVector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeBeginVector(String value) {
        this.edgeBeginVector = value;
    }

    /**
     * Ruft den Wert der edgeEndVector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeEndVector() {
        return edgeEndVector;
    }

    /**
     * Legt den Wert der edgeEndVector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeEndVector(String value) {
        this.edgeEndVector = value;
    }

    /**
     * Ruft den Wert der faceCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceCoordIndex() {
        return faceCoordIndex;
    }

    /**
     * Legt den Wert der faceCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceCoordIndex(String value) {
        this.faceCoordIndex = value;
    }

    /**
     * Ruft den Wert der faceTexCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceTexCoordIndex() {
        return faceTexCoordIndex;
    }

    /**
     * Legt den Wert der faceTexCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceTexCoordIndex(String value) {
        this.faceTexCoordIndex = value;
    }

    /**
     * Gets the value of the faceEmpty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faceEmpty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaceEmpty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getFaceEmpty() {
        if (faceEmpty == null) {
            faceEmpty = new ArrayList<Boolean>();
        }
        return this.faceEmpty;
    }

    /**
     * Gets the value of the faceHidden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faceHidden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaceHidden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getFaceHidden() {
        if (faceHidden == null) {
            faceHidden = new ArrayList<Boolean>();
        }
        return this.faceHidden;
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
            return "geometry";
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
