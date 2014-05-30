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
 *     &lt;extension base="{}SceneGraphStructureNodeType">
 *       &lt;sequence>
 *         &lt;element ref="{}head" minOccurs="0"/>
 *         &lt;element ref="{}Scene"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{}x3dVersion" />
 *       &lt;attribute name="profile" use="required" type="{}profileNames" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "scene"
})
@XmlRootElement(name = "X3D")
public class X3D
    extends SceneGraphStructureNodeType
{

    protected Head head;
    @XmlElement(name = "Scene", required = true)
    protected Scene scene;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "profile", required = true)
    protected ProfileNames profile;

    /**
     * Ruft den Wert der head-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Legt den Wert der head-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Ruft den Wert der scene-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Scene }
     *     
     */
    public Scene getScene() {
        return scene;
    }

    /**
     * Legt den Wert der scene-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Scene }
     *     
     */
    public void setScene(Scene value) {
        this.scene = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der profile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileNames }
     *     
     */
    public ProfileNames getProfile() {
        return profile;
    }

    /**
     * Legt den Wert der profile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileNames }
     *     
     */
    public void setProfile(ProfileNames value) {
        this.profile = value;
    }

}
