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
 *     &lt;extension base="{}X3DDragSensorNode">
 *       &lt;attribute name="diskAngle" type="{}SFFloat" default="0.26179167" />
 *       &lt;attribute name="maxAngle" type="{}SFFloat" default="-1" />
 *       &lt;attribute name="minAngle" type="{}SFFloat" default="0" />
 *       &lt;attribute name="offset" type="{}SFFloat" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CylinderSensor")
public class CylinderSensor
    extends X3DDragSensorNode
{

    @XmlAttribute(name = "diskAngle")
    protected Float diskAngle;
    @XmlAttribute(name = "maxAngle")
    protected Float maxAngle;
    @XmlAttribute(name = "minAngle")
    protected Float minAngle;
    @XmlAttribute(name = "offset")
    protected Float offset;

    /**
     * Ruft den Wert der diskAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDiskAngle() {
        if (diskAngle == null) {
            return  0.26179168F;
        } else {
            return diskAngle;
        }
    }

    /**
     * Legt den Wert der diskAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiskAngle(Float value) {
        this.diskAngle = value;
    }

    /**
     * Ruft den Wert der maxAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxAngle() {
        if (maxAngle == null) {
            return -1.0F;
        } else {
            return maxAngle;
        }
    }

    /**
     * Legt den Wert der maxAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAngle(Float value) {
        this.maxAngle = value;
    }

    /**
     * Ruft den Wert der minAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMinAngle() {
        if (minAngle == null) {
            return  0.0F;
        } else {
            return minAngle;
        }
    }

    /**
     * Legt den Wert der minAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinAngle(Float value) {
        this.minAngle = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getOffset() {
        if (offset == null) {
            return  0.0F;
        } else {
            return offset;
        }
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOffset(Float value) {
        this.offset = value;
    }

}
