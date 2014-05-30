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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DSoundSourceNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DSoundSourceNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DTimeDependentNode">
 *       &lt;attribute name="pitch" type="{}SFFloat" default="1.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DSoundSourceNode")
@XmlSeeAlso({
    MovieTexture.class,
    AudioClip.class
})
public abstract class X3DSoundSourceNode
    extends X3DTimeDependentNode
{

    @XmlAttribute(name = "pitch")
    protected Float pitch;

    /**
     * Ruft den Wert der pitch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getPitch() {
        if (pitch == null) {
            return  1.0F;
        } else {
            return pitch;
        }
    }

    /**
     * Legt den Wert der pitch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPitch(Float value) {
        this.pitch = value;
    }

}
