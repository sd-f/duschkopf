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
 *     &lt;extension base="{}X3DParticleEmitterNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}Coordinate"/>
 *         &lt;element ref="{}CoordinateDouble"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="coordIndex" type="{}MFInt32" default="-1" />
 *       &lt;attribute name="direction" type="{}SFVec3f" default="0 1 0" />
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
@XmlRootElement(name = "PolylineEmitter")
public class PolylineEmitter
    extends X3DParticleEmitterNode
{

    @XmlElement(name = "Coordinate")
    protected Coordinate coordinate;
    @XmlElement(name = "CoordinateDouble")
    protected CoordinateDouble coordinateDouble;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "coordIndex")
    protected String coordIndex;
    @XmlAttribute(name = "direction")
    protected String direction;

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
     * Ruft den Wert der coordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordIndex() {
        if (coordIndex == null) {
            return "-1";
        } else {
            return coordIndex;
        }
    }

    /**
     * Legt den Wert der coordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordIndex(String value) {
        this.coordIndex = value;
    }

    /**
     * Ruft den Wert der direction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "0 1 0";
        } else {
            return direction;
        }
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
