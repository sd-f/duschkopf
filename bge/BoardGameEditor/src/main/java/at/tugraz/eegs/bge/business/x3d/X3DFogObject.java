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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DFogObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DFogObject">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;attribute name="color" type="{}SFColor" default="1 1 1" />
 *       &lt;attribute name="fogType" type="{}fogTypeValues" default="LINEAR" />
 *       &lt;attribute name="visibilityRange" type="{}SFFloat" default="0" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="children" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DFogObject")
public abstract class X3DFogObject
    extends X3DNode
{

    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "fogType")
    protected FogTypeValues fogType;
    @XmlAttribute(name = "visibilityRange")
    protected Float visibilityRange;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        if (color == null) {
            return "1 1 1";
        } else {
            return color;
        }
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Ruft den Wert der fogType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FogTypeValues }
     *     
     */
    public FogTypeValues getFogType() {
        if (fogType == null) {
            return FogTypeValues.LINEAR;
        } else {
            return fogType;
        }
    }

    /**
     * Legt den Wert der fogType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FogTypeValues }
     *     
     */
    public void setFogType(FogTypeValues value) {
        this.fogType = value;
    }

    /**
     * Ruft den Wert der visibilityRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getVisibilityRange() {
        if (visibilityRange == null) {
            return  0.0F;
        } else {
            return visibilityRange;
        }
    }

    /**
     * Legt den Wert der visibilityRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVisibilityRange(Float value) {
        this.visibilityRange = value;
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
            return "children";
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
