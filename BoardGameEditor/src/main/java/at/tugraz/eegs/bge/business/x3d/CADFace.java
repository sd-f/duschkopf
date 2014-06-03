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
 *     &lt;extension base="{}X3DProductStructureChildNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}Shape"/>
 *         &lt;element ref="{}LOD"/>
 *         &lt;element ref="{}Transform"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shape",
    "lod",
    "transform",
    "protoInstance"
})
@XmlRootElement(name = "CADFace")
public class CADFace
    extends X3DProductStructureChildNode
{

    @XmlElement(name = "Shape")
    protected Shape shape;
    @XmlElement(name = "LOD")
    protected LOD lod;
    @XmlElement(name = "Transform")
    protected Transform transform;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Shape }
     *     
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Shape }
     *     
     */
    public void setShape(Shape value) {
        this.shape = value;
    }

    /**
     * Ruft den Wert der lod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LOD }
     *     
     */
    public LOD getLOD() {
        return lod;
    }

    /**
     * Legt den Wert der lod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LOD }
     *     
     */
    public void setLOD(LOD value) {
        this.lod = value;
    }

    /**
     * Ruft den Wert der transform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Transform }
     *     
     */
    public Transform getTransform() {
        return transform;
    }

    /**
     * Legt den Wert der transform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Transform }
     *     
     */
    public void setTransform(Transform value) {
        this.transform = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

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

}
