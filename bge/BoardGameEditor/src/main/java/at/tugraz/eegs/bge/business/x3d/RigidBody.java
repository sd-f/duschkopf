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
 *     &lt;extension base="{}X3DNode">
 *       &lt;group ref="{}RigidBodyContentModel" minOccurs="0"/>
 *       &lt;attribute name="angularDampingFactor" type="{}SFFloat" default="0.001" />
 *       &lt;attribute name="angularVelocity" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="autoDamp" type="{}SFBool" default="false" />
 *       &lt;attribute name="autoDisable" type="{}SFBool" default="false" />
 *       &lt;attribute name="centerOfMass" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="disableAngularSpeed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="disableLinearSpeed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="disableTime" type="{}SFTime" default="0" />
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="finiteRotationAxis" type="{}SFVec3f" default="0 1 0" />
 *       &lt;attribute name="fixed" type="{}SFBool" default="false" />
 *       &lt;attribute name="forces" type="{}MFVec3f" />
 *       &lt;attribute name="inertia" type="{}SFMatrix3f" default="1 0 0 0 1 0 0 0 1" />
 *       &lt;attribute name="linearDampingFactor" type="{}SFFloat" default="0.001" />
 *       &lt;attribute name="linearVelocity" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="mass" type="{}SFFloat" default="1" />
 *       &lt;attribute name="position" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="orientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="torques" type="{}MFVec3f" />
 *       &lt;attribute name="useFiniteRotation" type="{}SFBool" default="false" />
 *       &lt;attribute name="useGlobalGravity" type="{}SFBool" default="true" />
 *       &lt;attribute name="containerField" default="bodies">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="body1"/>
 *             &lt;enumeration value="body2"/>
 *             &lt;enumeration value="bodies"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlRootElement(name = "RigidBody")
public class RigidBody
    extends X3DNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "CollidableShape", type = CollidableShape.class, required = false),
        @XmlElementRef(name = "CollidableOffset", type = CollidableOffset.class, required = false),
        @XmlElementRef(name = "Sphere", type = Sphere.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "Box", type = Box.class, required = false),
        @XmlElementRef(name = "Cone", type = Cone.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "angularDampingFactor")
    protected Float angularDampingFactor;
    @XmlAttribute(name = "angularVelocity")
    protected String angularVelocity;
    @XmlAttribute(name = "autoDamp")
    protected Boolean autoDamp;
    @XmlAttribute(name = "autoDisable")
    protected Boolean autoDisable;
    @XmlAttribute(name = "centerOfMass")
    protected String centerOfMass;
    @XmlAttribute(name = "disableAngularSpeed")
    protected Float disableAngularSpeed;
    @XmlAttribute(name = "disableLinearSpeed")
    protected Float disableLinearSpeed;
    @XmlAttribute(name = "disableTime")
    protected String disableTime;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "finiteRotationAxis")
    protected String finiteRotationAxis;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAttribute(name = "forces")
    protected String forces;
    @XmlAttribute(name = "inertia")
    protected String inertia;
    @XmlAttribute(name = "linearDampingFactor")
    protected Float linearDampingFactor;
    @XmlAttribute(name = "linearVelocity")
    protected String linearVelocity;
    @XmlAttribute(name = "mass")
    protected Float mass;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "torques")
    protected String torques;
    @XmlAttribute(name = "useFiniteRotation")
    protected Boolean useFiniteRotation;
    @XmlAttribute(name = "useGlobalGravity")
    protected Boolean useGlobalGravity;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containerField;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Sphere" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 10979 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 10931 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
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
     * {@link ProtoInstance }
     * {@link CollidableShape }
     * {@link CollidableOffset }
     * {@link Box }
     * {@link Cone }
     * {@link Sphere }
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
     * Ruft den Wert der angularDampingFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAngularDampingFactor() {
        if (angularDampingFactor == null) {
            return  0.001F;
        } else {
            return angularDampingFactor;
        }
    }

    /**
     * Legt den Wert der angularDampingFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAngularDampingFactor(Float value) {
        this.angularDampingFactor = value;
    }

    /**
     * Ruft den Wert der angularVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngularVelocity() {
        if (angularVelocity == null) {
            return "0 0 0";
        } else {
            return angularVelocity;
        }
    }

    /**
     * Legt den Wert der angularVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngularVelocity(String value) {
        this.angularVelocity = value;
    }

    /**
     * Ruft den Wert der autoDamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoDamp() {
        if (autoDamp == null) {
            return false;
        } else {
            return autoDamp;
        }
    }

    /**
     * Legt den Wert der autoDamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDamp(Boolean value) {
        this.autoDamp = value;
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
     * Ruft den Wert der finiteRotationAxis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiniteRotationAxis() {
        if (finiteRotationAxis == null) {
            return "0 1 0";
        } else {
            return finiteRotationAxis;
        }
    }

    /**
     * Legt den Wert der finiteRotationAxis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiniteRotationAxis(String value) {
        this.finiteRotationAxis = value;
    }

    /**
     * Ruft den Wert der fixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFixed() {
        if (fixed == null) {
            return false;
        } else {
            return fixed;
        }
    }

    /**
     * Legt den Wert der fixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * Ruft den Wert der forces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForces() {
        return forces;
    }

    /**
     * Legt den Wert der forces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForces(String value) {
        this.forces = value;
    }

    /**
     * Ruft den Wert der inertia-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInertia() {
        if (inertia == null) {
            return "1 0 0 0 1 0 0 0 1";
        } else {
            return inertia;
        }
    }

    /**
     * Legt den Wert der inertia-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInertia(String value) {
        this.inertia = value;
    }

    /**
     * Ruft den Wert der linearDampingFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getLinearDampingFactor() {
        if (linearDampingFactor == null) {
            return  0.001F;
        } else {
            return linearDampingFactor;
        }
    }

    /**
     * Legt den Wert der linearDampingFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLinearDampingFactor(Float value) {
        this.linearDampingFactor = value;
    }

    /**
     * Ruft den Wert der linearVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearVelocity() {
        if (linearVelocity == null) {
            return "0 0 0";
        } else {
            return linearVelocity;
        }
    }

    /**
     * Legt den Wert der linearVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearVelocity(String value) {
        this.linearVelocity = value;
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
            return  1.0F;
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
     * Ruft den Wert der torques-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorques() {
        return torques;
    }

    /**
     * Legt den Wert der torques-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorques(String value) {
        this.torques = value;
    }

    /**
     * Ruft den Wert der useFiniteRotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseFiniteRotation() {
        if (useFiniteRotation == null) {
            return false;
        } else {
            return useFiniteRotation;
        }
    }

    /**
     * Legt den Wert der useFiniteRotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFiniteRotation(Boolean value) {
        this.useFiniteRotation = value;
    }

    /**
     * Ruft den Wert der useGlobalGravity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseGlobalGravity() {
        if (useGlobalGravity == null) {
            return true;
        } else {
            return useGlobalGravity;
        }
    }

    /**
     * Legt den Wert der useGlobalGravity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGlobalGravity(Boolean value) {
        this.useGlobalGravity = value;
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
            return "bodies";
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
