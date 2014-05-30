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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *     &lt;extension base="{}X3DGeometryNode">
 *       &lt;group ref="{}ColorCoordinateContentModel" minOccurs="0"/>
 *       &lt;attribute name="colorPerVertex" type="{}SFBool" default="true" />
 *       &lt;attribute name="colorIndex" type="{}MFInt32" />
 *       &lt;attribute name="coordIndex" type="{}MFInt32" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rest"
})
@XmlRootElement(name = "IndexedLineSet")
public class IndexedLineSet
    extends X3DGeometryNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "ColorRGBA", type = ColorRGBA.class, required = false),
        @XmlElementRef(name = "Color", type = Color.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "CoordinateDouble", type = CoordinateDouble.class, required = false),
        @XmlElementRef(name = "Coordinate", type = Coordinate.class, required = false),
        @XmlElementRef(name = "GeoCoordinate", type = GeoCoordinate.class, required = false)
    })
    protected List<Object> rest;
    @XmlAttribute(name = "colorPerVertex")
    protected Boolean colorPerVertex;
    @XmlAttribute(name = "colorIndex")
    protected String colorIndex;
    @XmlAttribute(name = "coordIndex")
    protected String coordIndex;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Coordinate" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2657 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 2645 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorRGBA }
     * {@link ProtoInstance }
     * {@link Coordinate }
     * {@link CoordinateDouble }
     * {@link GeoCoordinate }
     * {@link Color }
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

    /**
     * Ruft den Wert der colorPerVertex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isColorPerVertex() {
        if (colorPerVertex == null) {
            return true;
        } else {
            return colorPerVertex;
        }
    }

    /**
     * Legt den Wert der colorPerVertex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorPerVertex(Boolean value) {
        this.colorPerVertex = value;
    }

    /**
     * Ruft den Wert der colorIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorIndex() {
        return colorIndex;
    }

    /**
     * Legt den Wert der colorIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorIndex(String value) {
        this.colorIndex = value;
    }

    /**
     * Ruft den Wert der coordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordIndex() {
        return coordIndex;
    }

    /**
     * Legt den Wert der coordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordIndex(String value) {
        this.coordIndex = value;
    }

}
