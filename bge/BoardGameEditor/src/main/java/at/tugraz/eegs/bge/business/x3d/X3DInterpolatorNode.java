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
 * <p>Java-Klasse für X3DInterpolatorNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DInterpolatorNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;attribute name="key" type="{}MFFloat" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DInterpolatorNode")
@XmlSeeAlso({
    GeoPositionInterpolator.class,
    SquadOrientationInterpolator.class,
    SplineScalarInterpolator.class,
    SplinePositionInterpolator2D.class,
    SplinePositionInterpolator.class,
    PositionInterpolator2D.class,
    CoordinateInterpolator2D.class,
    PositionInterpolator.class,
    OrientationInterpolator.class,
    NormalInterpolator.class,
    CoordinateInterpolator.class,
    ColorInterpolator.class,
    ScalarInterpolator.class
})
public abstract class X3DInterpolatorNode
    extends X3DChildNode
{

    @XmlAttribute(name = "key")
    protected String key;

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
