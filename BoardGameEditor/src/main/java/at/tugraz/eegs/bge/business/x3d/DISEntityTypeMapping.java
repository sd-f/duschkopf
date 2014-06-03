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
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="mapping" />
 *       &lt;attribute name="url" type="{}MFString" />
 *       &lt;attribute name="category" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="country" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="65535"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="domain" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="extra" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="kind" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="specific" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="subcategory" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DISEntityTypeMapping")
public class DISEntityTypeMapping
    extends X3DNode
{

    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;
    @XmlAttribute(name = "url")
    protected List<String> url;
    @XmlAttribute(name = "category")
    protected Integer category;
    @XmlAttribute(name = "country")
    protected Integer country;
    @XmlAttribute(name = "domain")
    protected Integer domain;
    @XmlAttribute(name = "extra")
    protected Integer extra;
    @XmlAttribute(name = "kind")
    protected Integer kind;
    @XmlAttribute(name = "specific")
    protected Integer specific;
    @XmlAttribute(name = "subcategory")
    protected Integer subcategory;

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
            return "mapping";
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
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCategory() {
        if (category == null) {
            return  0;
        } else {
            return category;
        }
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategory(Integer value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCountry() {
        if (country == null) {
            return  0;
        } else {
            return country;
        }
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountry(Integer value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der domain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDomain() {
        if (domain == null) {
            return  0;
        } else {
            return domain;
        }
    }

    /**
     * Legt den Wert der domain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDomain(Integer value) {
        this.domain = value;
    }

    /**
     * Ruft den Wert der extra-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getExtra() {
        if (extra == null) {
            return  0;
        } else {
            return extra;
        }
    }

    /**
     * Legt den Wert der extra-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtra(Integer value) {
        this.extra = value;
    }

    /**
     * Ruft den Wert der kind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getKind() {
        if (kind == null) {
            return  0;
        } else {
            return kind;
        }
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKind(Integer value) {
        this.kind = value;
    }

    /**
     * Ruft den Wert der specific-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpecific() {
        if (specific == null) {
            return  0;
        } else {
            return specific;
        }
    }

    /**
     * Legt den Wert der specific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecific(Integer value) {
        this.specific = value;
    }

    /**
     * Ruft den Wert der subcategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSubcategory() {
        if (subcategory == null) {
            return  0;
        } else {
            return subcategory;
        }
    }

    /**
     * Legt den Wert der subcategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubcategory(Integer value) {
        this.subcategory = value;
    }

}
