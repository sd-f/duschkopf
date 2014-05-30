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
 *       &lt;attribute name="applied" type="{}SFBool" default="true" />
 *       &lt;attribute name="linetype" type="{}SFInt32" default="1" />
 *       &lt;attribute name="linewidthScaleFactor" type="{}SFFloat" default="0" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="lineProperties" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LineProperties")
public class LineProperties
    extends X3DAppearanceChildNode
{

    @XmlAttribute(name = "applied")
    protected Boolean applied;
    @XmlAttribute(name = "linetype")
    protected BigInteger linetype;
    @XmlAttribute(name = "linewidthScaleFactor")
    protected Float linewidthScaleFactor;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der applied-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isApplied() {
        if (applied == null) {
            return true;
        } else {
            return applied;
        }
    }

    /**
     * Legt den Wert der applied-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplied(Boolean value) {
        this.applied = value;
    }

    /**
     * Ruft den Wert der linetype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinetype() {
        if (linetype == null) {
            return new BigInteger("1");
        } else {
            return linetype;
        }
    }

    /**
     * Legt den Wert der linetype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinetype(BigInteger value) {
        this.linetype = value;
    }

    /**
     * Ruft den Wert der linewidthScaleFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getLinewidthScaleFactor() {
        if (linewidthScaleFactor == null) {
            return  0.0F;
        } else {
            return linewidthScaleFactor;
        }
    }

    /**
     * Legt den Wert der linewidthScaleFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLinewidthScaleFactor(Float value) {
        this.linewidthScaleFactor = value;
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
            return "lineProperties";
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
