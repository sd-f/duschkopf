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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DDragSensorNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DDragSensorNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DPointingDeviceSensorNode">
 *       &lt;attribute name="autoOffset" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DDragSensorNode")
@XmlSeeAlso({
    SphereSensor.class,
    PlaneSensor.class,
    CylinderSensor.class
})
public abstract class X3DDragSensorNode
    extends X3DPointingDeviceSensorNode
{

    @XmlAttribute(name = "autoOffset")
    protected Boolean autoOffset;

    /**
     * Ruft den Wert der autoOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoOffset() {
        if (autoOffset == null) {
            return true;
        } else {
            return autoOffset;
        }
    }

    /**
     * Legt den Wert der autoOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoOffset(Boolean value) {
        this.autoOffset = value;
    }

}
