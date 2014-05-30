//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
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
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;group ref="{}RigidBodyCollectionContentModel" minOccurs="0"/>
 *       &lt;attribute name="autoDisable" type="{}SFBool" default="false" />
 *       &lt;attribute name="constantForceMix" type="{}SFFloat" default="0.0001" />
 *       &lt;attribute name="contactSurfaceThickness" type="{}SFFloat" default="0" />
 *       &lt;attribute name="disableAngularSpeed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="disableLinearSpeed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="disableTime" type="{}SFTime" default="0" />
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="errorCorrection" type="{}SFFloat" default="0.8" />
 *       &lt;attribute name="gravity" type="{}SFVec3f" default="0 -9.8 0" />
 *       &lt;attribute name="iterations" type="{}SFInt32" default="10" />
 *       &lt;attribute name="maxCorrectionSpeed" type="{}SFFloat" default="-1" />
 *       &lt;attribute name="preferAccuracy" type="{}SFBool" default="false" />
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
@XmlRootElement(name = "RigidBodyCollection")
public class RigidBodyCollection
    extends X3DChildNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "CollisionCollection", type = CollisionCollection.class, required = false),
        @XmlElementRef(name = "BallJoint", type = BallJoint.class, required = false),
        @XmlElementRef(name = "UniversalJoint", type = UniversalJoint.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "SingleAxisHingeJoint", type = SingleAxisHingeJoint.class, required = false),
        @XmlElementRef(name = "RigidBody", type = RigidBody.class, required = false),
        @XmlElementRef(name = "SliderJoint", type = SliderJoint.class, required = false),
        @XmlElementRef(name = "MotorJoint", type = MotorJoint.class, required = false),
        @XmlElementRef(name = "DoubleAxisHingeJoint", type = DoubleAxisHingeJoint.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "autoDisable")
    protected Boolean autoDisable;
    @XmlAttribute(name = "constantForceMix")
    protected Float constantForceMix;
    @XmlAttribute(name = "contactSurfaceThickness")
    protected Float contactSurfaceThickness;
    @XmlAttribute(name = "disableAngularSpeed")
    protected Float disableAngularSpeed;
    @XmlAttribute(name = "disableLinearSpeed")
    protected Float disableLinearSpeed;
    @XmlAttribute(name = "disableTime")
    protected String disableTime;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "errorCorrection")
    protected Float errorCorrection;
    @XmlAttribute(name = "gravity")
    protected String gravity;
    @XmlAttribute(name = "iterations")
    protected BigInteger iterations;
    @XmlAttribute(name = "maxCorrectionSpeed")
    protected Float maxCorrectionSpeed;
    @XmlAttribute(name = "preferAccuracy")
    protected Boolean preferAccuracy;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "CollisionCollection" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 11168 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 11052 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
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
     * {@link CollisionCollection }
     * {@link BallJoint }
     * {@link UniversalJoint }
     * {@link ProtoInstance }
     * {@link RigidBody }
     * {@link SingleAxisHingeJoint }
     * {@link SliderJoint }
     * {@link MotorJoint }
     * {@link DoubleAxisHingeJoint }
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
     * Ruft den Wert der autoDisable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoDisable() {
        if (autoDisable == null) {
            return false;
        } else {
            return autoDisable;
        }
    }

    /**
     * Legt den Wert der autoDisable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDisable(Boolean value) {
        this.autoDisable = value;
    }

    /**
     * Ruft den Wert der constantForceMix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getConstantForceMix() {
        if (constantForceMix == null) {
            return  1.0E-4F;
        } else {
            return constantForceMix;
        }
    }

    /**
     * Legt den Wert der constantForceMix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstantForceMix(Float value) {
        this.constantForceMix = value;
    }

    /**
     * Ruft den Wert der contactSurfaceThickness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getContactSurfaceThickness() {
        if (contactSurfaceThickness == null) {
            return  0.0F;
        } else {
            return contactSurfaceThickness;
        }
    }

    /**
     * Legt den Wert der contactSurfaceThickness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setContactSurfaceThickness(Float value) {
        this.contactSurfaceThickness = value;
    }

    /**
     * Ruft den Wert der disableAngularSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDisableAngularSpeed() {
        if (disableAngularSpeed == null) {
            return  0.0F;
        } else {
            return disableAngularSpeed;
        }
    }

    /**
     * Legt den Wert der disableAngularSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisableAngularSpeed(Float value) {
        this.disableAngularSpeed = value;
    }

    /**
     * Ruft den Wert der disableLinearSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDisableLinearSpeed() {
        if (disableLinearSpeed == null) {
            return  0.0F;
        } else {
            return disableLinearSpeed;
        }
    }

    /**
     * Legt den Wert der disableLinearSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisableLinearSpeed(Float value) {
        this.disableLinearSpeed = value;
    }

    /**
     * Ruft den Wert der disableTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableTime() {
        if (disableTime == null) {
            return "0";
        } else {
            return disableTime;
        }
    }

    /**
     * Legt den Wert der disableTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableTime(String value) {
        this.disableTime = value;
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
     * Ruft den Wert der errorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getErrorCorrection() {
        if (errorCorrection == null) {
            return  0.8F;
        } else {
            return errorCorrection;
        }
    }

    /**
     * Legt den Wert der errorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setErrorCorrection(Float value) {
        this.errorCorrection = value;
    }

    /**
     * Ruft den Wert der gravity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGravity() {
        if (gravity == null) {
            return "0 -9.8 0";
        } else {
            return gravity;
        }
    }

    /**
     * Legt den Wert der gravity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGravity(String value) {
        this.gravity = value;
    }

    /**
     * Ruft den Wert der iterations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIterations() {
        if (iterations == null) {
            return new BigInteger("10");
        } else {
            return iterations;
        }
    }

    /**
     * Legt den Wert der iterations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIterations(BigInteger value) {
        this.iterations = value;
    }

    /**
     * Ruft den Wert der maxCorrectionSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxCorrectionSpeed() {
        if (maxCorrectionSpeed == null) {
            return -1.0F;
        } else {
            return maxCorrectionSpeed;
        }
    }

    /**
     * Legt den Wert der maxCorrectionSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxCorrectionSpeed(Float value) {
        this.maxCorrectionSpeed = value;
    }

    /**
     * Ruft den Wert der preferAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferAccuracy() {
        if (preferAccuracy == null) {
            return false;
        } else {
            return preferAccuracy;
        }
    }

    /**
     * Legt den Wert der preferAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferAccuracy(Boolean value) {
        this.preferAccuracy = value;
    }

}
