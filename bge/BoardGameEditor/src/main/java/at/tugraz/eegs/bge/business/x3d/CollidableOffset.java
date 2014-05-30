//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{}X3DNBodyCollidableNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}CollidableOffset"/>
 *         &lt;element ref="{}CollidableShape"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "collidableOffset",
    "collidableShape",
    "protoInstance"
})
@XmlRootElement(name = "CollidableOffset")
public class CollidableOffset
    extends X3DNBodyCollidableNode
{

    @XmlElement(name = "CollidableOffset")
    protected CollidableOffset collidableOffset;
    @XmlElement(name = "CollidableShape")
    protected CollidableShape collidableShape;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;

    /**
     * collidable
     * 
     * @return
     *     possible object is
     *     {@link CollidableOffset }
     *     
     */
    public CollidableOffset getCollidableOffset() {
        return collidableOffset;
    }

    /**
     * Legt den Wert der collidableOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollidableOffset }
     *     
     */
    public void setCollidableOffset(CollidableOffset value) {
        this.collidableOffset = value;
    }

    /**
     * collidable
     * 
     * @return
     *     possible object is
     *     {@link CollidableShape }
     *     
     */
    public CollidableShape getCollidableShape() {
        return collidableShape;
    }

    /**
     * Legt den Wert der collidableShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollidableShape }
     *     
     */
    public void setCollidableShape(CollidableShape value) {
        this.collidableShape = value;
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

}
