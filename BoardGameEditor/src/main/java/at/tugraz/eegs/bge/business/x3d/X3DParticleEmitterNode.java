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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DParticleEmitterNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DParticleEmitterNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;attribute name="speed" type="{}SFFloat" default="0" />
 *       &lt;attribute name="variation" type="{}SFFloat" default="0.25" />
 *       &lt;attribute name="mass" type="{}SFFloat" default="0" />
 *       &lt;attribute name="surfaceArea" type="{}SFFloat" default="0" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="emitter" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DParticleEmitterNode")
@XmlSeeAlso({
    VolumeEmitter.class,
    PointEmitter.class,
    ConeEmitter.class,
    SurfaceEmitter.class,
    PolylineEmitter.class,
    ExplosionEmitter.class
})
public abstract class X3DParticleEmitterNode
    extends X3DNode
{

    @XmlAttribute(name = "speed")
    protected Float speed;
    @XmlAttribute(name = "variation")
    protected Float variation;
    @XmlAttribute(name = "mass")
    protected Float mass;
    @XmlAttribute(name = "surfaceArea")
    protected Float surfaceArea;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

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
            return  0.0F;
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
     * Ruft den Wert der variation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getVariation() {
        if (variation == null) {
            return  0.25F;
        } else {
            return variation;
        }
    }

    /**
     * Legt den Wert der variation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVariation(Float value) {
        this.variation = value;
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
     * Ruft den Wert der surfaceArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSurfaceArea() {
        if (surfaceArea == null) {
            return  0.0F;
        } else {
            return surfaceArea;
        }
    }

    /**
     * Legt den Wert der surfaceArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSurfaceArea(Float value) {
        this.surfaceArea = value;
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
            return "emitter";
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
