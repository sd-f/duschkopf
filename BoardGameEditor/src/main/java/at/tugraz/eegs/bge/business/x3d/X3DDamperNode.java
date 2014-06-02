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
 * <p>Java-Klasse für X3DDamperNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DDamperNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DFollowerNode">
 *       &lt;attribute name="tau" type="{}SFTime" default="0.3" />
 *       &lt;attribute name="tolerance" type="{}SFFloat" default="-1" />
 *       &lt;attribute name="order" default="3">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFInt32">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DDamperNode")
@XmlSeeAlso({
    TexCoordDamper2D.class,
    PositionDamper2D.class,
    OrientationDamper.class,
    CoordinateDamper.class,
    ColorDamper.class,
    PositionDamper.class
})
public abstract class X3DDamperNode
    extends X3DFollowerNode
{

    @XmlAttribute(name = "tau")
    protected String tau;
    @XmlAttribute(name = "tolerance")
    protected Float tolerance;
    @XmlAttribute(name = "order")
    protected Integer order;

    /**
     * Ruft den Wert der tau-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTau() {
        if (tau == null) {
            return "0.3";
        } else {
            return tau;
        }
    }

    /**
     * Legt den Wert der tau-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTau(String value) {
        this.tau = value;
    }

    /**
     * Ruft den Wert der tolerance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTolerance() {
        if (tolerance == null) {
            return -1.0F;
        } else {
            return tolerance;
        }
    }

    /**
     * Legt den Wert der tolerance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTolerance(Float value) {
        this.tolerance = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOrder() {
        if (order == null) {
            return  3;
        } else {
            return order;
        }
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

}
