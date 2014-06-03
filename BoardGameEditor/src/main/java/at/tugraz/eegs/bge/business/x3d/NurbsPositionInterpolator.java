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
 *       &lt;attribute name="knot" type="{}MFDouble" />
 *       &lt;attribute name="order" type="{}SFInt32" default="3" />
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
@XmlRootElement(name = "NurbsPositionInterpolator")
public class NurbsPositionInterpolator
    extends X3DChildNode
{

    @XmlElement(name = "Coordinate")
    protected Coordinate coordinate;
    @XmlElement(name = "CoordinateDouble")
    protected CoordinateDouble coordinateDouble;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "knot")
    protected String knot;
    @XmlAttribute(name = "order")
    protected BigInteger order;
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
     * Ruft den Wert der knot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnot() {
        return knot;
    }

    /**
     * Legt den Wert der knot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnot(String value) {
        this.knot = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        if (order == null) {
            return new BigInteger("3");
        } else {
            return order;
        }
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
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
