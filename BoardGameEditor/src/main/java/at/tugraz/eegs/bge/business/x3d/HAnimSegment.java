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
 *     &lt;extension base="{}X3DGroupingNode">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}HAnimDisplacer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{}segmentNames" />
 *       &lt;attribute name="mass" type="{}SFFloat" default="0" />
 *       &lt;attribute name="centerOfMass" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="momentsOfInertia" type="{}MFFloat" default="0 0 0 0 0 0 0 0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hAnimDisplacer"
})
@XmlRootElement(name = "HAnimSegment")
public class HAnimSegment
    extends X3DGroupingNode
{

    @XmlElement(name = "HAnimDisplacer")
    protected List<HAnimDisplacer> hAnimDisplacer;
    @XmlAttribute(name = "name")
    protected SegmentNames name;
    @XmlAttribute(name = "mass")
    protected Float mass;
    @XmlAttribute(name = "centerOfMass")
    protected String centerOfMass;
    @XmlAttribute(name = "momentsOfInertia")
    protected String momentsOfInertia;

    /**
     * Gets the value of the hAnimDisplacer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hAnimDisplacer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHAnimDisplacer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HAnimDisplacer }
     * 
     * 
     */
    public List<HAnimDisplacer> getHAnimDisplacer() {
        if (hAnimDisplacer == null) {
            hAnimDisplacer = new ArrayList<HAnimDisplacer>();
        }
        return this.hAnimDisplacer;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentNames }
     *     
     */
    public SegmentNames getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentNames }
     *     
     */
    public void setName(SegmentNames value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der mass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMass() {
        if (mass == null) {
            return  0.0F;
        } else {
            return mass;
        }
    }

    /**
     * Legt den Wert der mass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMass(Float value) {
        this.mass = value;
    }

    /**
     * Ruft den Wert der centerOfMass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterOfMass() {
        if (centerOfMass == null) {
            return "0 0 0";
        } else {
            return centerOfMass;
        }
    }

    /**
     * Legt den Wert der centerOfMass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterOfMass(String value) {
        this.centerOfMass = value;
    }

    /**
     * Ruft den Wert der momentsOfInertia-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomentsOfInertia() {
        if (momentsOfInertia == null) {
            return "0 0 0 0 0 0 0 0 0";
        } else {
            return momentsOfInertia;
        }
    }

    /**
     * Legt den Wert der momentsOfInertia-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomentsOfInertia(String value) {
        this.momentsOfInertia = value;
    }

}
