//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DAppearanceChildNode">
 *       &lt;attribute name="filled" type="{}SFBool" default="true" />
 *       &lt;attribute name="hatched" type="{}SFBool" default="true" />
 *       &lt;attribute name="hatchStyle" type="{}SFInt32" default="1" />
 *       &lt;attribute name="hatchColor" type="{}SFColor" default="1 1 1" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="fillProperties" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FillProperties")
public class FillProperties
    extends X3DAppearanceChildNode
{

    @XmlAttribute(name = "filled")
    protected Boolean filled;
    @XmlAttribute(name = "hatched")
    protected Boolean hatched;
    @XmlAttribute(name = "hatchStyle")
    protected BigInteger hatchStyle;
    @XmlAttribute(name = "hatchColor")
    protected String hatchColor;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der filled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilled() {
        if (filled == null) {
            return true;
        } else {
            return filled;
        }
    }

    /**
     * Legt den Wert der filled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilled(Boolean value) {
        this.filled = value;
    }

    /**
     * Ruft den Wert der hatched-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHatched() {
        if (hatched == null) {
            return true;
        } else {
            return hatched;
        }
    }

    /**
     * Legt den Wert der hatched-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHatched(Boolean value) {
        this.hatched = value;
    }

    /**
     * Ruft den Wert der hatchStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHatchStyle() {
        if (hatchStyle == null) {
            return new BigInteger("1");
        } else {
            return hatchStyle;
        }
    }

    /**
     * Legt den Wert der hatchStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHatchStyle(BigInteger value) {
        this.hatchStyle = value;
    }

    /**
     * Ruft den Wert der hatchColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHatchColor() {
        if (hatchColor == null) {
            return "1 1 1";
        } else {
            return hatchColor;
        }
    }

    /**
     * Legt den Wert der hatchColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHatchColor(String value) {
        this.hatchColor = value;
    }

    /**
     * Ruft den Wert der containerField-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerField() {
        if (containerField == null) {
            return "fillProperties";
        } else {
            return containerField;
        }
    }

    /**
     * Legt den Wert der containerField-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerField(String value) {
        this.containerField = value;
    }

}
