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
 *         &lt;element ref="{}HAnimJoint"/>
 *         &lt;element ref="{}HAnimSegment"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" type="{}jointNames" />
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="rotation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="scale" type="{}SFVec3f" default="1 1 1" />
 *       &lt;attribute name="scaleOrientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="translation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="skinCoordIndex" type="{}MFInt32" />
 *       &lt;attribute name="skinCoordWeight" type="{}MFFloat" />
 *       &lt;attribute name="llimit" type="{}MFFloat" />
 *       &lt;attribute name="ulimit" type="{}MFFloat" />
 *       &lt;attribute name="limitOrientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="stiffness" type="{}MFFloat" default="0 0 0" />
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
    "hAnimJointOrHAnimSegment"
})
@XmlRootElement(name = "HAnimJoint")
public class HAnimJoint
    extends X3DChildNode
{

    @XmlElements({
        @XmlElement(name = "HAnimJoint", type = HAnimJoint.class),
        @XmlElement(name = "HAnimSegment", type = HAnimSegment.class)
    })
    protected List<X3DChildNode> hAnimJointOrHAnimSegment;
    @XmlAttribute(name = "name")
    protected JointNames name;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "scale")
    protected String scale;
    @XmlAttribute(name = "scaleOrientation")
    protected String scaleOrientation;
    @XmlAttribute(name = "translation")
    protected String translation;
    @XmlAttribute(name = "skinCoordIndex")
    protected String skinCoordIndex;
    @XmlAttribute(name = "skinCoordWeight")
    protected String skinCoordWeight;
    @XmlAttribute(name = "llimit")
    protected String llimit;
    @XmlAttribute(name = "ulimit")
    protected String ulimit;
    @XmlAttribute(name = "limitOrientation")
    protected String limitOrientation;
    @XmlAttribute(name = "stiffness")
    protected String stiffness;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Gets the value of the hAnimJointOrHAnimSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hAnimJointOrHAnimSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHAnimJointOrHAnimSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HAnimJoint }
     * {@link HAnimSegment }
     * 
     * 
     */
    public List<X3DChildNode> getHAnimJointOrHAnimSegment() {
        if (hAnimJointOrHAnimSegment == null) {
            hAnimJointOrHAnimSegment = new ArrayList<X3DChildNode>();
        }
        return this.hAnimJointOrHAnimSegment;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JointNames }
     *     
     */
    public JointNames getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JointNames }
     *     
     */
    public void setName(JointNames value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der center-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        if (center == null) {
            return "0 0 0";
        } else {
            return center;
        }
    }

    /**
     * Legt den Wert der center-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        if (rotation == null) {
            return "0 0 1 0";
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        if (scale == null) {
            return "1 1 1";
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Ruft den Wert der scaleOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleOrientation() {
        if (scaleOrientation == null) {
            return "0 0 1 0";
        } else {
            return scaleOrientation;
        }
    }

    /**
     * Legt den Wert der scaleOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleOrientation(String value) {
        this.scaleOrientation = value;
    }

    /**
     * Ruft den Wert der translation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        if (translation == null) {
            return "0 0 0";
        } else {
            return translation;
        }
    }

    /**
     * Legt den Wert der translation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    /**
     * Ruft den Wert der skinCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkinCoordIndex() {
        return skinCoordIndex;
    }

    /**
     * Legt den Wert der skinCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkinCoordIndex(String value) {
        this.skinCoordIndex = value;
    }

    /**
     * Ruft den Wert der skinCoordWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkinCoordWeight() {
        return skinCoordWeight;
    }

    /**
     * Legt den Wert der skinCoordWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkinCoordWeight(String value) {
        this.skinCoordWeight = value;
    }

    /**
     * Ruft den Wert der llimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlimit() {
        return llimit;
    }

    /**
     * Legt den Wert der llimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlimit(String value) {
        this.llimit = value;
    }

    /**
     * Ruft den Wert der ulimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlimit() {
        return ulimit;
    }

    /**
     * Legt den Wert der ulimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlimit(String value) {
        this.ulimit = value;
    }

    /**
     * Ruft den Wert der limitOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitOrientation() {
        if (limitOrientation == null) {
            return "0 0 1 0";
        } else {
            return limitOrientation;
        }
    }

    /**
     * Legt den Wert der limitOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitOrientation(String value) {
        this.limitOrientation = value;
    }

    /**
     * Ruft den Wert der stiffness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStiffness() {
        if (stiffness == null) {
            return "0 0 0";
        } else {
            return stiffness;
        }
    }

    /**
     * Legt den Wert der stiffness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStiffness(String value) {
        this.stiffness = value;
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
