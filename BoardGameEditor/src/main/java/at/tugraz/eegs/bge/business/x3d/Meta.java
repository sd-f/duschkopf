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
 *     &lt;extension base="{}SceneGraphStructureNodeType">
 *       &lt;attribute name="name" type="{}SFString" />
 *       &lt;attribute name="content" use="required" type="{}SFString" />
 *       &lt;attribute name="dir" type="{}metaDirectionValues" />
 *       &lt;attribute name="http-equiv" type="{}SFString" />
 *       &lt;attribute name="lang" type="{}SFString" />
 *       &lt;attribute name="scheme" type="{}SFString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "meta")
public class Meta
    extends SceneGraphStructureNodeType
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "content", required = true)
    protected String content;
    @XmlAttribute(name = "dir")
    protected MetaDirectionValues dir;
    @XmlAttribute(name = "http-equiv")
    protected String httpEquiv;
    @XmlAttribute(name = "lang")
    protected String lang;
    @XmlAttribute(name = "scheme")
    protected String scheme;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Ruft den Wert der dir-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaDirectionValues }
     *     
     */
    public MetaDirectionValues getDir() {
        return dir;
    }

    /**
     * Legt den Wert der dir-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDirectionValues }
     *     
     */
    public void setDir(MetaDirectionValues value) {
        this.dir = value;
    }

    /**
     * Ruft den Wert der httpEquiv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpEquiv() {
        return httpEquiv;
    }

    /**
     * Legt den Wert der httpEquiv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpEquiv(String value) {
        this.httpEquiv = value;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Ruft den Wert der scheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Legt den Wert der scheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

}
