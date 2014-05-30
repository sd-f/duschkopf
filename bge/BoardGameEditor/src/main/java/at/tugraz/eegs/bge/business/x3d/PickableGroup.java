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
 *     &lt;extension base="{}X3DGroupingNode">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}NurbsPatchSurface"/>
 *         &lt;element ref="{}NurbsSweptSurface"/>
 *         &lt;element ref="{}NurbsSwungSurface"/>
 *         &lt;element ref="{}NurbsTrimmedSurface"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectType" type="{}MFString" default="ALL" />
 *       &lt;attribute name="pickable" type="{}SFBool" default="true" />
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
@XmlRootElement(name = "PickableGroup")
public class PickableGroup
    extends X3DGroupingNode
{

    @XmlElements({
        @XmlElement(name = "NurbsPatchSurface", type = NurbsPatchSurface.class),
        @XmlElement(name = "NurbsSweptSurface", type = NurbsSweptSurface.class),
        @XmlElement(name = "NurbsSwungSurface", type = NurbsSwungSurface.class),
        @XmlElement(name = "NurbsTrimmedSurface", type = NurbsTrimmedSurface.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> nurbsPatchSurfaceAndNurbsSweptSurfaceAndNurbsSwungSurface;
    @XmlAttribute(name = "objectType")
    protected List<String> objectType;
    @XmlAttribute(name = "pickable")
    protected Boolean pickable;

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
     * Gets the value of the objectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectType() {
        if (objectType == null) {
            objectType = new ArrayList<String>();
        }
        return this.objectType;
    }

    /**
     * Ruft den Wert der pickable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPickable() {
        if (pickable == null) {
            return true;
        } else {
            return pickable;
        }
    }

    /**
     * Legt den Wert der pickable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickable(Boolean value) {
        this.pickable = value;
    }

}
