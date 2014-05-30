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
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}NurbsPatchSurface"/>
 *         &lt;element ref="{}NurbsSweptSurface"/>
 *         &lt;element ref="{}NurbsSwungSurface"/>
 *         &lt;element ref="{}NurbsTrimmedSurface"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tessellationScale" type="{}SFFloat" default="1.0" />
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface"
})
@XmlRootElement(name = "NurbsSet")
public class NurbsSet
    extends X3DChildNode
{

    @XmlElements({
        @XmlElement(name = "NurbsPatchSurface", type = NurbsPatchSurface.class),
        @XmlElement(name = "NurbsSweptSurface", type = NurbsSweptSurface.class),
        @XmlElement(name = "NurbsSwungSurface", type = NurbsSwungSurface.class),
        @XmlElement(name = "NurbsTrimmedSurface", type = NurbsTrimmedSurface.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface;
    @XmlAttribute(name = "tessellationScale")
    protected Float tessellationScale;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Gets the value of the nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NurbsPatchSurface }
     * {@link NurbsSweptSurface }
     * {@link NurbsSwungSurface }
     * {@link NurbsTrimmedSurface }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getNurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface() {
        if (nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface == null) {
            nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface = new ArrayList<Object>();
        }
        return this.nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface;
    }

    /**
     * Ruft den Wert der tessellationScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTessellationScale() {
        if (tessellationScale == null) {
            return  1.0F;
        } else {
            return tessellationScale;
        }
    }

    /**
     * Legt den Wert der tessellationScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTessellationScale(Float value) {
        this.tessellationScale = value;
    }

    /**
     * Ruft den Wert der bboxCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxCenter() {
        if (bboxCenter == null) {
            return "0 0 0";
        } else {
            return bboxCenter;
        }
    }

    /**
     * Legt den Wert der bboxCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxCenter(String value) {
        this.bboxCenter = value;
    }

    /**
     * Ruft den Wert der bboxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxSize() {
        if (bboxSize == null) {
            return "-1 -1 -1";
        } else {
            return bboxSize;
        }
    }

    /**
     * Legt den Wert der bboxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxSize(String value) {
        this.bboxSize = value;
    }

}
