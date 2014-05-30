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
 *     &lt;extension base="{}X3DLayoutNode">
 *       &lt;attribute name="align" type="{}MFString" default=""CENTER" "CENTER"" />
 *       &lt;attribute name="offset" type="{}MFFloat" default="0 0" />
 *       &lt;attribute name="offsetUnits" type="{}MFString" default=""WORLD" "WORLD"" />
 *       &lt;attribute name="scaleMode" type="{}MFString" default=""NONE" "NONE"" />
 *       &lt;attribute name="size" type="{}MFFloat" default="1 1" />
 *       &lt;attribute name="sizeUnits" type="{}MFString" default=""WORLD" "WORLD"" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Layout")
public class Layout
    extends X3DLayoutNode
{

    @XmlAttribute(name = "align")
    protected List<String> align;
    @XmlAttribute(name = "offset")
    protected String offset;
    @XmlAttribute(name = "offsetUnits")
    protected List<String> offsetUnits;
    @XmlAttribute(name = "scaleMode")
    protected List<String> scaleMode;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "sizeUnits")
    protected List<String> sizeUnits;

    /**
     * Gets the value of the align property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the align property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlign() {
        if (align == null) {
            align = new ArrayList<String>();
        }
        return this.align;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        if (offset == null) {
            return "0 0";
        } else {
            return offset;
        }
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the offsetUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOffsetUnits() {
        if (offsetUnits == null) {
            offsetUnits = new ArrayList<String>();
        }
        return this.offsetUnits;
    }

    /**
     * Gets the value of the scaleMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaleMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaleMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScaleMode() {
        if (scaleMode == null) {
            scaleMode = new ArrayList<String>();
        }
        return this.scaleMode;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        if (size == null) {
            return "1 1";
        } else {
            return size;
        }
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizeUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSizeUnits() {
        if (sizeUnits == null) {
            sizeUnits = new ArrayList<String>();
        }
        return this.sizeUnits;
    }

}
