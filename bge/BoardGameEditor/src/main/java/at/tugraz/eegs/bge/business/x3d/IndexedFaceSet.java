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
 *     &lt;extension base="{}X3DComposedGeometryNode">
 *       &lt;attribute name="convex" type="{}SFBool" default="true" />
 *       &lt;attribute name="creaseAngle" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="colorIndex" type="{}MFInt32" />
 *       &lt;attribute name="coordIndex" type="{}MFInt32" />
 *       &lt;attribute name="normalIndex" type="{}MFInt32" />
 *       &lt;attribute name="texCoordIndex" type="{}MFInt32" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IndexedFaceSet")
public class IndexedFaceSet
    extends X3DComposedGeometryNode
{

    @XmlAttribute(name = "convex")
    protected Boolean convex;
    @XmlAttribute(name = "creaseAngle")
    protected Float creaseAngle;
    @XmlAttribute(name = "colorIndex")
    protected String colorIndex;
    @XmlAttribute(name = "coordIndex")
    protected String coordIndex;
    @XmlAttribute(name = "normalIndex")
    protected String normalIndex;
    @XmlAttribute(name = "texCoordIndex")
    protected String texCoordIndex;

    /**
     * Ruft den Wert der convex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConvex() {
        if (convex == null) {
            return true;
        } else {
            return convex;
        }
    }

    /**
     * Legt den Wert der convex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvex(Boolean value) {
        this.convex = value;
    }

    /**
     * Ruft den Wert der creaseAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getCreaseAngle() {
        if (creaseAngle == null) {
            return  0.0F;
        } else {
            return creaseAngle;
        }
    }

    /**
     * Legt den Wert der creaseAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCreaseAngle(Float value) {
        this.creaseAngle = value;
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

    /**
     * Ruft den Wert der normalIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalIndex() {
        return normalIndex;
    }

    /**
     * Legt den Wert der normalIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalIndex(String value) {
        this.normalIndex = value;
    }

    /**
     * Ruft den Wert der texCoordIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexCoordIndex() {
        return texCoordIndex;
    }

    /**
     * Legt den Wert der texCoordIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexCoordIndex(String value) {
        this.texCoordIndex = value;
    }

}
