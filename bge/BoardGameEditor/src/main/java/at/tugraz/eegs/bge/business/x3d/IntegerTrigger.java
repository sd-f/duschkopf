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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;attribute name="integerKey" type="{}SFInt32" default="-1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IntegerTrigger")
public class IntegerTrigger
    extends X3DChildNode
{

    @XmlAttribute(name = "integerKey")
    protected BigInteger integerKey;

    /**
     * Ruft den Wert der integerKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerKey() {
        if (integerKey == null) {
            return new BigInteger("-1");
        } else {
            return integerKey;
        }
    }

    /**
     * Legt den Wert der integerKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerKey(BigInteger value) {
        this.integerKey = value;
    }

}
