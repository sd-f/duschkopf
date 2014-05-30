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
 *     &lt;extension base="{}X3DPrototype">
 *       &lt;sequence>
 *         &lt;element ref="{}ProtoInterface" minOccurs="0"/>
 *         &lt;element ref="{}ProtoBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="appinfo" type="{}SFString" />
 *       &lt;attribute name="documentation" type="{}SFString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "protoInterface",
    "protoBody"
})
@XmlRootElement(name = "ProtoDeclare")
public class ProtoDeclare
    extends X3DPrototype
{

    @XmlElement(name = "ProtoInterface")
    protected ProtoInterface protoInterface;
    @XmlElement(name = "ProtoBody", required = true)
    protected ProtoBody protoBody;
    @XmlAttribute(name = "appinfo")
    protected String appinfo;
    @XmlAttribute(name = "documentation")
    protected String documentation;

    /**
     * Ruft den Wert der protoInterface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtoInterface }
     *     
     */
    public ProtoInterface getProtoInterface() {
        return protoInterface;
    }

    /**
     * Legt den Wert der protoInterface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInterface }
     *     
     */
    public void setProtoInterface(ProtoInterface value) {
        this.protoInterface = value;
    }

    /**
     * Ruft den Wert der protoBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtoBody }
     *     
     */
    public ProtoBody getProtoBody() {
        return protoBody;
    }

    /**
     * Legt den Wert der protoBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoBody }
     *     
     */
    public void setProtoBody(ProtoBody value) {
        this.protoBody = value;
    }

    /**
     * Ruft den Wert der appinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppinfo() {
        return appinfo;
    }

    /**
     * Legt den Wert der appinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppinfo(String value) {
        this.appinfo = value;
    }

    /**
     * Ruft den Wert der documentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

}
