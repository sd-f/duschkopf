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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DViewpointNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DViewpointNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DBindableNode">
 *       &lt;attribute name="centerOfRotation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="description" type="{}SFString" />
 *       &lt;attribute name="jump" type="{}SFBool" default="true" />
 *       &lt;attribute name="orientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="position" type="{}SFVec3f" default="0 0 10" />
 *       &lt;attribute name="retainUserOffsets" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DViewpointNode")
@XmlSeeAlso({
    OrthoViewpoint.class,
    Viewpoint.class
})
public abstract class X3DViewpointNode
    extends X3DBindableNode
{

    @XmlAttribute(name = "centerOfRotation")
    protected String centerOfRotation;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "jump")
    protected Boolean jump;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "retainUserOffsets")
    protected Boolean retainUserOffsets;

    /**
     * Ruft den Wert der centerOfRotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterOfRotation() {
        if (centerOfRotation == null) {
            return "0 0 0";
        } else {
            return centerOfRotation;
        }
    }

    /**
     * Legt den Wert der centerOfRotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterOfRotation(String value) {
        this.centerOfRotation = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der jump-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isJump() {
        if (jump == null) {
            return true;
        } else {
            return jump;
        }
    }

    /**
     * Legt den Wert der jump-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJump(Boolean value) {
        this.jump = value;
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "0 0 1 0";
        } else {
            return orientation;
        }
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "0 0 10";
        } else {
            return position;
        }
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der retainUserOffsets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetainUserOffsets() {
        if (retainUserOffsets == null) {
            return false;
        } else {
            return retainUserOffsets;
        }
    }

    /**
     * Legt den Wert der retainUserOffsets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetainUserOffsets(Boolean value) {
        this.retainUserOffsets = value;
    }

}
