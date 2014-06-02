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
 *         &lt;element ref="{}CollidableOffset"/>
 *         &lt;element ref="{}CollidableShape"/>
 *         &lt;element ref="{}CollisionSpace"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="appliedParameters" type="{}MFString" default="BOUNCE" />
 *       &lt;attribute name="bounce" type="{}SFFloat" default="0" />
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="frictionCoefficients" type="{}SFVec2f" default="0 0" />
 *       &lt;attribute name="minBounceSpeed" type="{}SFFloat" default="0.1" />
 *       &lt;attribute name="slipFactors" type="{}SFVec2f" default="0 0" />
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
    "collidableOffsetOrCollidableShapeOrCollisionSpace"
})
@XmlRootElement(name = "CollisionCollection")
public class CollisionCollection
    extends X3DChildNode
{

    @XmlElements({
        @XmlElement(name = "CollidableOffset", type = CollidableOffset.class),
        @XmlElement(name = "CollidableShape", type = CollidableShape.class),
        @XmlElement(name = "CollisionSpace", type = CollisionSpace.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> collidableOffsetOrCollidableShapeOrCollisionSpace;
    @XmlAttribute(name = "appliedParameters")
    protected List<String> appliedParameters;
    @XmlAttribute(name = "bounce")
    protected Float bounce;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "frictionCoefficients")
    protected String frictionCoefficients;
    @XmlAttribute(name = "minBounceSpeed")
    protected Float minBounceSpeed;
    @XmlAttribute(name = "slipFactors")
    protected String slipFactors;
    @XmlAttribute(name = "softnessConstantForceMix")
    protected Float softnessConstantForceMix;
    @XmlAttribute(name = "softnessErrorCorrection")
    protected Float softnessErrorCorrection;
    @XmlAttribute(name = "surfaceSpeed")
    protected String surfaceSpeed;

    /**
     * Gets the value of the collidableOffsetOrCollidableShapeOrCollisionSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collidableOffsetOrCollidableShapeOrCollisionSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollidableOffsetOrCollidableShapeOrCollisionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollidableOffset }
     * {@link CollidableShape }
     * {@link CollisionSpace }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getCollidableOffsetOrCollidableShapeOrCollisionSpace() {
        if (collidableOffsetOrCollidableShapeOrCollisionSpace == null) {
            collidableOffsetOrCollidableShapeOrCollisionSpace = new ArrayList<Object>();
        }
        return this.collidableOffsetOrCollidableShapeOrCollisionSpace;
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
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
     * Ruft den Wert der minBounceSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinBounceSpeed() {
        if (minBounceSpeed == null) {
            return  0.1F;
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
     * Ruft den Wert der slipFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipFactors() {
        if (slipFactors == null) {
            return "0 0";
        } else {
            return slipFactors;
        }
    }

    /**
     * Legt den Wert der slipFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipFactors(String value) {
        this.slipFactors = value;
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
