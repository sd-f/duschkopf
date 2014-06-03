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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DProgrammableShaderObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DProgrammableShaderObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IS" minOccurs="0"/>
 *         &lt;group ref="{}ChildContentModelCore" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}DEF_USE"/>
 *       &lt;attGroup ref="{}globalAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DProgrammableShaderObject", propOrder = {
    "content"
})
@XmlSeeAlso({
    ComposedShader.class,
    ShaderProgram.class,
    PackagedShader.class
})
public abstract class X3DProgrammableShaderObject {

    @XmlElementRefs({
        @XmlElementRef(name = "MetadataInteger", type = MetadataInteger.class, required = false),
        @XmlElementRef(name = "field", type = Field.class, required = false),
        @XmlElementRef(name = "MetadataFloat", type = MetadataFloat.class, required = false),
        @XmlElementRef(name = "IS", type = IS.class, required = false),
        @XmlElementRef(name = "MetadataString", type = MetadataString.class, required = false),
        @XmlElementRef(name = "MetadataSet", type = MetadataSet.class, required = false),
        @XmlElementRef(name = "MetadataDouble", type = MetadataDouble.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "DEF")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String def;
    @XmlAttribute(name = "USE")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object use;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazz;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataInteger }
     * {@link Field }
     * {@link MetadataFloat }
     * {@link IS }
     * {@link String }
     * {@link MetadataString }
     * {@link MetadataDouble }
     * {@link MetadataSet }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<String>();
        }
        return this.clazz;
    }

}
