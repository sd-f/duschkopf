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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}IS" minOccurs="0"/>
 *         &lt;group ref="{}ChildContentModelCore" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}globalAttributes"/>
 *       &lt;attGroup ref="{}DEF_USE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DNode", propOrder = {
    "is",
    "metadataDouble",
    "metadataFloat",
    "metadataInteger",
    "metadataSet",
    "metadataString"
})
@XmlSeeAlso({
    X3DFogObject.class,
    X3DPrototypeInstanceNode.class,
    WildcardNodeType.class,
    X3DParticlePhysicsModelNode.class,
    DISEntityTypeMapping.class,
    X3DLayerNode.class,
    LayerSet.class,
    X3DRigidJointNode.class,
    RigidBody.class,
    X3DNBodyCollisionSpaceNode.class,
    LayoutGroup.class,
    ViewpointGroup.class,
    Contour2D.class,
    X3DNurbsControlCurveNode.class,
    X3DFontStyleNode.class,
    GeoOrigin.class,
    X3DAppearanceNode.class,
    X3DAppearanceChildNode.class,
    X3DParticleEmitterNode.class,
    X3DChildNode.class,
    X3DGeometricPropertyNode.class,
    X3DGeometryNode.class,
    X3DMetadataObject.class
})
public abstract class X3DNode {

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
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazz;
    @XmlAttribute(name = "DEF")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String def;
    @XmlAttribute(name = "USE")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object use;

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

}
