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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DNurbsSurfaceGeometryNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DNurbsSurfaceGeometryNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DParametricGeometryNode">
 *       &lt;attribute name="uClosed" type="{}SFBool" default="false" />
 *       &lt;attribute name="vClosed" type="{}SFBool" default="false" />
 *       &lt;attribute name="uDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="vDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="uKnot" type="{}MFDouble" />
 *       &lt;attribute name="vKnot" type="{}MFDouble" />
 *       &lt;attribute name="uOrder" type="{}SFInt32" default="3" />
 *       &lt;attribute name="vOrder" type="{}SFInt32" default="3" />
 *       &lt;attribute name="uTessellation" type="{}SFInt32" default="0" />
 *       &lt;attribute name="vTessellation" type="{}SFInt32" default="0" />
 *       &lt;attribute name="weight" type="{}MFDouble" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DNurbsSurfaceGeometryNode")
@XmlSeeAlso({
    NurbsTrimmedSurface.class,
    NurbsPatchSurface.class
})
public abstract class X3DNurbsSurfaceGeometryNode
    extends X3DParametricGeometryNode
{

    @XmlAttribute(name = "uClosed")
    protected Boolean uClosed;
    @XmlAttribute(name = "vClosed")
    protected Boolean vClosed;
    @XmlAttribute(name = "uDimension")
    protected BigInteger uDimension;
    @XmlAttribute(name = "vDimension")
    protected BigInteger vDimension;
    @XmlAttribute(name = "uKnot")
    protected String uKnot;
    @XmlAttribute(name = "vKnot")
    protected String vKnot;
    @XmlAttribute(name = "uOrder")
    protected BigInteger uOrder;
    @XmlAttribute(name = "vOrder")
    protected BigInteger vOrder;
    @XmlAttribute(name = "uTessellation")
    protected BigInteger uTessellation;
    @XmlAttribute(name = "vTessellation")
    protected BigInteger vTessellation;
    @XmlAttribute(name = "weight")
    protected String weight;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

    /**
     * Ruft den Wert der uClosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUClosed() {
        if (uClosed == null) {
            return false;
        } else {
            return uClosed;
        }
    }

    /**
     * Legt den Wert der uClosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUClosed(Boolean value) {
        this.uClosed = value;
    }

    /**
     * Ruft den Wert der vClosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVClosed() {
        if (vClosed == null) {
            return false;
        } else {
            return vClosed;
        }
    }

    /**
     * Legt den Wert der vClosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVClosed(Boolean value) {
        this.vClosed = value;
    }

    /**
     * Ruft den Wert der uDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUDimension() {
        if (uDimension == null) {
            return new BigInteger("0");
        } else {
            return uDimension;
        }
    }

    /**
     * Legt den Wert der uDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUDimension(BigInteger value) {
        this.uDimension = value;
    }

    /**
     * Ruft den Wert der vDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVDimension() {
        if (vDimension == null) {
            return new BigInteger("0");
        } else {
            return vDimension;
        }
    }

    /**
     * Legt den Wert der vDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVDimension(BigInteger value) {
        this.vDimension = value;
    }

    /**
     * Ruft den Wert der uKnot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUKnot() {
        return uKnot;
    }

    /**
     * Legt den Wert der uKnot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUKnot(String value) {
        this.uKnot = value;
    }

    /**
     * Ruft den Wert der vKnot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKnot() {
        return vKnot;
    }

    /**
     * Legt den Wert der vKnot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKnot(String value) {
        this.vKnot = value;
    }

    /**
     * Ruft den Wert der uOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUOrder() {
        if (uOrder == null) {
            return new BigInteger("3");
        } else {
            return uOrder;
        }
    }

    /**
     * Legt den Wert der uOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUOrder(BigInteger value) {
        this.uOrder = value;
    }

    /**
     * Ruft den Wert der vOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVOrder() {
        if (vOrder == null) {
            return new BigInteger("3");
        } else {
            return vOrder;
        }
    }

    /**
     * Legt den Wert der vOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVOrder(BigInteger value) {
        this.vOrder = value;
    }

    /**
     * Ruft den Wert der uTessellation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUTessellation() {
        if (uTessellation == null) {
            return new BigInteger("0");
        } else {
            return uTessellation;
        }
    }

    /**
     * Legt den Wert der uTessellation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUTessellation(BigInteger value) {
        this.uTessellation = value;
    }

    /**
     * Ruft den Wert der vTessellation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVTessellation() {
        if (vTessellation == null) {
            return new BigInteger("0");
        } else {
            return vTessellation;
        }
    }

    /**
     * Legt den Wert der vTessellation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVTessellation(BigInteger value) {
        this.vTessellation = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der solid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolid() {
        if (solid == null) {
            return true;
        } else {
            return solid;
        }
    }

    /**
     * Legt den Wert der solid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolid(Boolean value) {
        this.solid = value;
    }

}
