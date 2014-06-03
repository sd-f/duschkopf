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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}Coordinate"/>
 *         &lt;element ref="{}CoordinateDouble"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="uDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="vDimension" type="{}SFInt32" default="0" />
 *       &lt;attribute name="uKnot" type="{}MFDouble" />
 *       &lt;attribute name="vKnot" type="{}MFDouble" />
 *       &lt;attribute name="uOrder" type="{}SFInt32" default="3" />
 *       &lt;attribute name="vOrder" type="{}SFInt32" default="3" />
 *       &lt;attribute name="weight" type="{}MFDouble" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coordinate",
    "coordinateDouble",
    "protoInstance"
})
@XmlRootElement(name = "NurbsSurfaceInterpolator")
public class NurbsSurfaceInterpolator
    extends X3DChildNode
{

    @XmlElement(name = "Coordinate")
    protected Coordinate coordinate;
    @XmlElement(name = "CoordinateDouble")
    protected CoordinateDouble coordinateDouble;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
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
    @XmlAttribute(name = "weight")
    protected String weight;

    /**
     * Ruft den Wert der coordinate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * Legt den Wert der coordinate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setCoordinate(Coordinate value) {
        this.coordinate = value;
    }

    /**
     * Ruft den Wert der coordinateDouble-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateDouble }
     *     
     */
    public CoordinateDouble getCoordinateDouble() {
        return coordinateDouble;
    }

    /**
     * Legt den Wert der coordinateDouble-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateDouble }
     *     
     */
    public void setCoordinateDouble(CoordinateDouble value) {
        this.coordinateDouble = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
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

}
