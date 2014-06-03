//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

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
 *     &lt;extension base="{}X3DGeometricPropertyNode">
 *       &lt;attribute name="name" type="{}featurePointNames" />
 *       &lt;attribute name="coordIndex" type="{}MFInt32" />
 *       &lt;attribute name="displacements" type="{}MFVec3f" />
 *       &lt;attribute name="weight" type="{}SFFloat" default="0.0" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="displacers" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HAnimDisplacer")
public class HAnimDisplacer
    extends X3DGeometricPropertyNode
{

    @XmlAttribute(name = "name")
    protected FeaturePointNames name;
    @XmlAttribute(name = "coordIndex")
    protected String coordIndex;
    @XmlAttribute(name = "displacements")
    protected String displacements;
    @XmlAttribute(name = "weight")
    protected Float weight;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePointNames }
     *     
     */
    public FeaturePointNames getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePointNames }
     *     
     */
    public void setName(FeaturePointNames value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der coordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordIndex() {
        return coordIndex;
    }

    /**
     * Legt den Wert der coordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordIndex(String value) {
        this.coordIndex = value;
    }

    /**
     * Ruft den Wert der displacements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplacements() {
        return displacements;
    }

    /**
     * Legt den Wert der displacements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplacements(String value) {
        this.displacements = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getWeight() {
        if (weight == null) {
            return  0.0F;
        } else {
            return weight;
        }
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
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
            return "displacers";
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
