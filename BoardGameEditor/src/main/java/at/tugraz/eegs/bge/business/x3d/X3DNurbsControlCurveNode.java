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
 * <p>Java-Klasse für X3DNurbsControlCurveNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DNurbsControlCurveNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;attribute name="controlPoint" type="{}MFVec2d" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DNurbsControlCurveNode")
@XmlSeeAlso({
    ContourPolyline2D.class,
    NurbsCurve2D.class
})
public abstract class X3DNurbsControlCurveNode
    extends X3DNode
{

    @XmlAttribute(name = "controlPoint")
    protected String controlPoint;

    /**
     * Ruft den Wert der controlPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlPoint() {
        return controlPoint;
    }

    /**
     * Legt den Wert der controlPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlPoint(String value) {
        this.controlPoint = value;
    }

}
