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
 *     &lt;extension base="{}X3DNBodyCollisionSpaceNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}CollidableOffset"/>
 *         &lt;element ref="{}CollidableShape"/>
 *         &lt;element ref="{}CollisionSpace"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="useGeometry" type="{}SFBool" default="false" />
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
@XmlRootElement(name = "CollisionSpace")
public class CollisionSpace
    extends X3DNBodyCollisionSpaceNode
{

    @XmlElements({
        @XmlElement(name = "CollidableOffset", type = CollidableOffset.class),
        @XmlElement(name = "CollidableShape", type = CollidableShape.class),
        @XmlElement(name = "CollisionSpace", type = CollisionSpace.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> collidableOffsetOrCollidableShapeOrCollisionSpace;
    @XmlAttribute(name = "useGeometry")
    protected Boolean useGeometry;

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
     * Ruft den Wert der useGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseGeometry() {
        if (useGeometry == null) {
            return false;
        } else {
            return useGeometry;
        }
    }

    /**
     * Legt den Wert der useGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGeometry(Boolean value) {
        this.useGeometry = value;
    }

}
