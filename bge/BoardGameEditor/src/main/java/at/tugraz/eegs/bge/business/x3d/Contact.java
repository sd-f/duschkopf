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
 *     &lt;extension base="{}X3DNBodyCollisionSpaceNode">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}RigidBody"/>
 *           &lt;element ref="{}RigidBody" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{}CollidableOffset"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element ref="{}CollidableOffset"/>
 *               &lt;element ref="{}CollidableShape"/>
 *               &lt;element ref="{}ProtoInstance"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}CollidableShape"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element ref="{}CollidableOffset"/>
 *               &lt;element ref="{}CollidableShape"/>
 *               &lt;element ref="{}ProtoInstance"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}ProtoInstance"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element ref="{}CollidableOffset"/>
 *               &lt;element ref="{}CollidableShape"/>
 *               &lt;element ref="{}ProtoInstance"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="appliedParameters" type="{}MFString" default="BOUNCE" />
 *       &lt;attribute name="bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="contactNormal" type="{}SFVec3f" default="0 1 0" />
 *       &lt;attribute name="depth" type="{}SFFloat" default="0" />
 *       &lt;attribute name="frictionCoefficients" type="{}SFVec2f" default="0 0" />
 *       &lt;attribute name="frictionDirection" type="{}SFVec3f" default="0 1 0" />
 *       &lt;attribute name="minBounceSpeed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="position" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="slipCoefficients" type="{}SFVec2f" default="0 0" />
 *       &lt;attribute name="softnessConstantForceMix" type="{}SFFloat" default="0.0001" />
 *       &lt;attribute name="softnessErrorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="surfaceSpeed" type="{}SFVec2f" default="0 0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rest"
})
@XmlRootElement(name = "Contact")
public class Contact
    extends X3DNBodyCollisionSpaceNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "CollidableShape", type = CollidableShape.class, required = false),
        @XmlElementRef(name = "CollidableOffset", type = CollidableOffset.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "RigidBody", type = RigidBody.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "appliedParameters")
    protected List<String> appliedParameters;
    @XmlAttribute(name = "bounce")
    protected Float bounce;
    @XmlAttribute(name = "contactNormal")
    protected String contactNormal;
    @XmlAttribute(name = "depth")
    protected Float depth;
    @XmlAttribute(name = "frictionCoefficients")
    protected String frictionCoefficients;
    @XmlAttribute(name = "frictionDirection")
    protected String frictionDirection;
    @XmlAttribute(name = "minBounceSpeed")
    protected Float minBounceSpeed;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "slipCoefficients")
    protected String slipCoefficients;
    @XmlAttribute(name = "softnessConstantForceMix")
    protected Float softnessConstantForceMix;
    @XmlAttribute(name = "softnessErrorCorrection")
    protected Float softnessErrorCorrection;
    @XmlAttribute(name = "surfaceSpeed")
    protected String surfaceSpeed;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "RigidBody" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 11517 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 11512 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollidableShape }
     * {@link ProtoInstance }
     * {@link RigidBody }
     * {@link CollidableOffset }
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the appliedParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAppliedParameters() {
        if (appliedParameters == null) {
            appliedParameters = new ArrayList<String>();
        }
        return this.appliedParameters;
    }

    /**
     * Ruft den Wert der bounce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getBounce() {
        if (bounce == null) {
            return  0.0F;
        } else {
            return bounce;
        }
    }

    /**
     * Legt den Wert der bounce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBounce(Float value) {
        this.bounce = value;
    }

    /**
     * Ruft den Wert der contactNormal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNormal() {
        if (contactNormal == null) {
            return "0 1 0";
        } else {
            return contactNormal;
        }
    }

    /**
     * Legt den Wert der contactNormal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNormal(String value) {
        this.contactNormal = value;
    }

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDepth() {
        if (depth == null) {
            return  0.0F;
        } else {
            return depth;
        }
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepth(Float value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der frictionCoefficients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrictionCoefficients() {
        if (frictionCoefficients == null) {
            return "0 0";
        } else {
            return frictionCoefficients;
        }
    }

    /**
     * Legt den Wert der frictionCoefficients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrictionCoefficients(String value) {
        this.frictionCoefficients = value;
    }

    /**
     * Ruft den Wert der frictionDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrictionDirection() {
        if (frictionDirection == null) {
            return "0 1 0";
        } else {
            return frictionDirection;
        }
    }

    /**
     * Legt den Wert der frictionDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrictionDirection(String value) {
        this.frictionDirection = value;
    }

    /**
     * Ruft den Wert der minBounceSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinBounceSpeed() {
        if (minBounceSpeed == null) {
            return  0.0F;
        } else {
            return minBounceSpeed;
        }
    }

    /**
     * Legt den Wert der minBounceSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinBounceSpeed(Float value) {
        this.minBounceSpeed = value;
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
            return "0 0 0";
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
     * Ruft den Wert der slipCoefficients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipCoefficients() {
        if (slipCoefficients == null) {
            return "0 0";
        } else {
            return slipCoefficients;
        }
    }

    /**
     * Legt den Wert der slipCoefficients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipCoefficients(String value) {
        this.slipCoefficients = value;
    }

    /**
     * Ruft den Wert der softnessConstantForceMix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSoftnessConstantForceMix() {
        if (softnessConstantForceMix == null) {
            return  1.0E-4F;
        } else {
            return softnessConstantForceMix;
        }
    }

    /**
     * Legt den Wert der softnessConstantForceMix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSoftnessConstantForceMix(Float value) {
        this.softnessConstantForceMix = value;
    }

    /**
     * Ruft den Wert der softnessErrorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSoftnessErrorCorrection() {
        if (softnessErrorCorrection == null) {
            return  0.8F;
        } else {
            return softnessErrorCorrection;
        }
    }

    /**
     * Legt den Wert der softnessErrorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSoftnessErrorCorrection(Float value) {
        this.softnessErrorCorrection = value;
    }

    /**
     * Ruft den Wert der surfaceSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceSpeed() {
        if (surfaceSpeed == null) {
            return "0 0";
        } else {
            return surfaceSpeed;
        }
    }

    /**
     * Legt den Wert der surfaceSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceSpeed(String value) {
        this.surfaceSpeed = value;
    }

}
