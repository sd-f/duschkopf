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
 *     &lt;extension base="{}X3DParametricGeometryNode">
 *       &lt;choice maxOccurs="2" minOccurs="0">
 *         &lt;element ref="{}ContourPolyline2D"/>
 *         &lt;element ref="{}NurbsCurve2D"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="ccw" type="{}SFBool" default="true" />
 *       &lt;attribute name="solid" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contourPolyline2DOrNurbsCurve2DOrProtoInstance"
})
@XmlRootElement(name = "NurbsSwungSurface")
public class NurbsSwungSurface
    extends X3DParametricGeometryNode
{

    @XmlElements({
        @XmlElement(name = "ContourPolyline2D", type = ContourPolyline2D.class),
        @XmlElement(name = "NurbsCurve2D", type = NurbsCurve2D.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> contourPolyline2DOrNurbsCurve2DOrProtoInstance;
    @XmlAttribute(name = "ccw")
    protected Boolean ccw;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

    /**
     * Gets the value of the contourPolyline2DOrNurbsCurve2DOrProtoInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contourPolyline2DOrNurbsCurve2DOrProtoInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContourPolyline2DOrNurbsCurve2DOrProtoInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContourPolyline2D }
     * {@link NurbsCurve2D }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getContourPolyline2DOrNurbsCurve2DOrProtoInstance() {
        if (contourPolyline2DOrNurbsCurve2DOrProtoInstance == null) {
            contourPolyline2DOrNurbsCurve2DOrProtoInstance = new ArrayList<Object>();
        }
        return this.contourPolyline2DOrNurbsCurve2DOrProtoInstance;
    }

    /**
     * Ruft den Wert der ccw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCcw() {
        if (ccw == null) {
            return true;
        } else {
            return ccw;
        }
    }

    /**
     * Legt den Wert der ccw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcw(Boolean value) {
        this.ccw = value;
    }

    /**
     * Ruft den Wert der solid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolid() {
        if (solid == null) {
            return true;
        } else {
            return solid;
        }
    }

    /**
     * Legt den Wert der solid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolid(Boolean value) {
        this.solid = value;
    }

}
