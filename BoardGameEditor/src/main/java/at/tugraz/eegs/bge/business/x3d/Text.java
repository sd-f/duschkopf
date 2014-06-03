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
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{}TextChildContentModel"/>
 *       &lt;/sequence>
 *       &lt;attribute name="string" type="{}MFString" />
 *       &lt;attribute name="length" type="{}MFFloat" />
 *       &lt;attribute name="maxExtent" default="0.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{}SFFloat">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="solid" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fontStyle",
    "screenFontStyle",
    "protoInstance"
})
@XmlRootElement(name = "Text")
public class Text
    extends X3DGeometryNode
{

    @XmlElement(name = "FontStyle")
    protected FontStyle fontStyle;
    @XmlElement(name = "ScreenFontStyle")
    protected ScreenFontStyle screenFontStyle;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "string")
    protected List<String> string;
    @XmlAttribute(name = "length")
    protected String length;
    @XmlAttribute(name = "maxExtent")
    protected Float maxExtent;
    @XmlAttribute(name = "solid")
    protected Boolean solid;

    /**
     * Ruft den Wert der fontStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * Legt den Wert der fontStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyle(FontStyle value) {
        this.fontStyle = value;
    }

    /**
     * Ruft den Wert der screenFontStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScreenFontStyle }
     *     
     */
    public ScreenFontStyle getScreenFontStyle() {
        return screenFontStyle;
    }

    /**
     * Legt den Wert der screenFontStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenFontStyle }
     *     
     */
    public void setScreenFontStyle(ScreenFontStyle value) {
        this.screenFontStyle = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der maxExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getMaxExtent() {
        if (maxExtent == null) {
            return  0.0F;
        } else {
            return maxExtent;
        }
    }

    /**
     * Legt den Wert der maxExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxExtent(Float value) {
        this.maxExtent = value;
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
            return false;
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
