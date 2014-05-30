//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
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
 *     &lt;extension base="{}X3DShapeNode">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Color"/>
 *           &lt;element ref="{}ColorRGBA"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}ConeEmitter"/>
 *           &lt;element ref="{}ExplosionEmitter"/>
 *           &lt;element ref="{}PointEmitter"/>
 *           &lt;element ref="{}PolylineEmitter"/>
 *           &lt;element ref="{}SurfaceEmitter"/>
 *           &lt;element ref="{}VolumeEmitter"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}BoundedPhysicsModel"/>
 *           &lt;element ref="{}ForcePhysicsModel"/>
 *           &lt;element ref="{}WindPhysicsModel"/>
 *           &lt;element ref="{}ProtoInstance"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}TextureCoordinate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="createParticles" type="{}SFBool" default="true" />
 *       &lt;attribute name="enabled" type="{}SFBool" default="true" />
 *       &lt;attribute name="lifetimeVariation" type="{}SFFloat" default="0.25" />
 *       &lt;attribute name="maxParticles" type="{}SFInt32" default="200" />
 *       &lt;attribute name="particleLifetime" type="{}SFFloat" default="5" />
 *       &lt;attribute name="particleSize" type="{}SFVec2f" default="0.02 0.02" />
 *       &lt;attribute name="colorKey" type="{}MFFloat" />
 *       &lt;attribute name="geometryType" type="{}SFString" default="QUAD" />
 *       &lt;attribute name="texCoordKey" type="{}MFFloat" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ParticleSystem")
public class ParticleSystem
    extends X3DShapeNode
{

    @XmlAttribute(name = "createParticles")
    protected Boolean createParticles;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "lifetimeVariation")
    protected Float lifetimeVariation;
    @XmlAttribute(name = "maxParticles")
    protected BigInteger maxParticles;
    @XmlAttribute(name = "particleLifetime")
    protected Float particleLifetime;
    @XmlAttribute(name = "particleSize")
    protected String particleSize;
    @XmlAttribute(name = "colorKey")
    protected String colorKey;
    @XmlAttribute(name = "geometryType")
    protected String geometryType;
    @XmlAttribute(name = "texCoordKey")
    protected String texCoordKey;

    /**
     * Ruft den Wert der createParticles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateParticles() {
        if (createParticles == null) {
            return true;
        } else {
            return createParticles;
        }
    }

    /**
     * Legt den Wert der createParticles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateParticles(Boolean value) {
        this.createParticles = value;
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
     * Ruft den Wert der lifetimeVariation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getLifetimeVariation() {
        if (lifetimeVariation == null) {
            return  0.25F;
        } else {
            return lifetimeVariation;
        }
    }

    /**
     * Legt den Wert der lifetimeVariation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLifetimeVariation(Float value) {
        this.lifetimeVariation = value;
    }

    /**
     * Ruft den Wert der maxParticles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxParticles() {
        if (maxParticles == null) {
            return new BigInteger("200");
        } else {
            return maxParticles;
        }
    }

    /**
     * Legt den Wert der maxParticles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxParticles(BigInteger value) {
        this.maxParticles = value;
    }

    /**
     * Ruft den Wert der particleLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getParticleLifetime() {
        if (particleLifetime == null) {
            return  5.0F;
        } else {
            return particleLifetime;
        }
    }

    /**
     * Legt den Wert der particleLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParticleLifetime(Float value) {
        this.particleLifetime = value;
    }

    /**
     * Ruft den Wert der particleSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticleSize() {
        if (particleSize == null) {
            return "0.02 0.02";
        } else {
            return particleSize;
        }
    }

    /**
     * Legt den Wert der particleSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticleSize(String value) {
        this.particleSize = value;
    }

    /**
     * Ruft den Wert der colorKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorKey() {
        return colorKey;
    }

    /**
     * Legt den Wert der colorKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorKey(String value) {
        this.colorKey = value;
    }

    /**
     * Ruft den Wert der geometryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryType() {
        if (geometryType == null) {
            return "QUAD";
        } else {
            return geometryType;
        }
    }

    /**
     * Legt den Wert der geometryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryType(String value) {
        this.geometryType = value;
    }

    /**
     * Ruft den Wert der texCoordKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexCoordKey() {
        return texCoordKey;
    }

    /**
     * Legt den Wert der texCoordKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexCoordKey(String value) {
        this.texCoordKey = value;
    }

}
