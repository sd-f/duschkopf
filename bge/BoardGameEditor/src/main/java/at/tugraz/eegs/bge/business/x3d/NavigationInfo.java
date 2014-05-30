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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DBindableNode">
 *       &lt;attribute name="avatarSize" type="{}MFFloat" default="0.25 1.6 0.75" />
 *       &lt;attribute name="headlight" type="{}SFBool" default="true" />
 *       &lt;attribute name="speed" type="{}SFFloat" default="1" />
 *       &lt;attribute name="type" type="{}MFString" default=""EXAMINE" "ANY"" />
 *       &lt;attribute name="transitionType" type="{}MFString" default=""LINEAR"" />
 *       &lt;attribute name="transitionTime" type="{}MFFloat" default="1.0" />
 *       &lt;attribute name="visibilityLimit" type="{}SFFloat" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NavigationInfo")
public class NavigationInfo
    extends X3DBindableNode
{

    @XmlAttribute(name = "avatarSize")
    protected String avatarSize;
    @XmlAttribute(name = "headlight")
    protected Boolean headlight;
    @XmlAttribute(name = "speed")
    protected Float speed;
    @XmlAttribute(name = "type")
    protected List<String> type;
    @XmlAttribute(name = "transitionType")
    protected List<String> transitionType;
    @XmlAttribute(name = "transitionTime")
    protected String transitionTime;
    @XmlAttribute(name = "visibilityLimit")
    protected Float visibilityLimit;

    /**
     * Ruft den Wert der avatarSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvatarSize() {
        if (avatarSize == null) {
            return "0.25 1.6 0.75";
        } else {
            return avatarSize;
        }
    }

    /**
     * Legt den Wert der avatarSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvatarSize(String value) {
        this.avatarSize = value;
    }

    /**
     * Ruft den Wert der headlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHeadlight() {
        if (headlight == null) {
            return true;
        } else {
            return headlight;
        }
    }

    /**
     * Legt den Wert der headlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadlight(Boolean value) {
        this.headlight = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSpeed() {
        if (speed == null) {
            return  1.0F;
        } else {
            return speed;
        }
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    /**
     * Gets the value of the transitionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransitionType() {
        if (transitionType == null) {
            transitionType = new ArrayList<String>();
        }
        return this.transitionType;
    }

    /**
     * Ruft den Wert der transitionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionTime() {
        if (transitionTime == null) {
            return "1.0";
        } else {
            return transitionTime;
        }
    }

    /**
     * Legt den Wert der transitionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionTime(String value) {
        this.transitionTime = value;
    }

    /**
     * Ruft den Wert der visibilityLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getVisibilityLimit() {
        if (visibilityLimit == null) {
            return  0.0F;
        } else {
            return visibilityLimit;
        }
    }

    /**
     * Legt den Wert der visibilityLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVisibilityLimit(Float value) {
        this.visibilityLimit = value;
    }

}
