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
 *     &lt;extension base="{}X3DFontStyleNode">
 *       &lt;attribute name="family" type="{}MFString" default=""SERIF"" />
 *       &lt;attribute name="horizontal" type="{}SFBool" default="true" />
 *       &lt;attribute name="justify" type="{}MFString" default=""BEGIN"" />
 *       &lt;attribute name="language" type="{}SFString" />
 *       &lt;attribute name="leftToRight" type="{}SFBool" default="true" />
 *       &lt;attribute name="size" type="{}SFFloat" default="1.0" />
 *       &lt;attribute name="spacing" type="{}SFFloat" default="1.0" />
 *       &lt;attribute name="style" type="{}fontStyleValues" default="PLAIN" />
 *       &lt;attribute name="topToBottom" type="{}SFBool" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FontStyle")
public class FontStyle
    extends X3DFontStyleNode
{

    @XmlAttribute(name = "family")
    protected List<String> family;
    @XmlAttribute(name = "horizontal")
    protected Boolean horizontal;
    @XmlAttribute(name = "justify")
    protected List<String> justify;
    @XmlAttribute(name = "language")
    protected String language;
    @XmlAttribute(name = "leftToRight")
    protected Boolean leftToRight;
    @XmlAttribute(name = "size")
    protected Float size;
    @XmlAttribute(name = "spacing")
    protected Float spacing;
    @XmlAttribute(name = "style")
    protected FontStyleValues style;
    @XmlAttribute(name = "topToBottom")
    protected Boolean topToBottom;

    /**
     * Gets the value of the family property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the family property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFamily() {
        if (family == null) {
            family = new ArrayList<String>();
        }
        return this.family;
    }

    /**
     * Ruft den Wert der horizontal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHorizontal() {
        if (horizontal == null) {
            return true;
        } else {
            return horizontal;
        }
    }

    /**
     * Legt den Wert der horizontal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHorizontal(Boolean value) {
        this.horizontal = value;
    }

    /**
     * Gets the value of the justify property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justify property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustify().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJustify() {
        if (justify == null) {
            justify = new ArrayList<String>();
        }
        return this.justify;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der leftToRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeftToRight() {
        if (leftToRight == null) {
            return true;
        } else {
            return leftToRight;
        }
    }

    /**
     * Legt den Wert der leftToRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftToRight(Boolean value) {
        this.leftToRight = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSize() {
        if (size == null) {
            return  1.0F;
        } else {
            return size;
        }
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSize(Float value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der spacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getSpacing() {
        if (spacing == null) {
            return  1.0F;
        } else {
            return spacing;
        }
    }

    /**
     * Legt den Wert der spacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpacing(Float value) {
        this.spacing = value;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontStyleValues }
     *     
     */
    public FontStyleValues getStyle() {
        if (style == null) {
            return FontStyleValues.PLAIN;
        } else {
            return style;
        }
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyleValues }
     *     
     */
    public void setStyle(FontStyleValues value) {
        this.style = value;
    }

    /**
     * Ruft den Wert der topToBottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTopToBottom() {
        if (topToBottom == null) {
            return true;
        } else {
            return topToBottom;
        }
    }

    /**
     * Legt den Wert der topToBottom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopToBottom(Boolean value) {
        this.topToBottom = value;
    }

}
