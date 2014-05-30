//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DSoundNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DSoundNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;group ref="{}SoundChildContentModel" minOccurs="0"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DSoundNode", propOrder = {
    "audioClip",
    "movieTexture",
    "protoInstance"
})
@XmlSeeAlso({
    Sound.class
})
public abstract class X3DSoundNode
    extends X3DChildNode
{

    @XmlElement(name = "AudioClip")
    protected AudioClip audioClip;
    @XmlElement(name = "MovieTexture")
    protected MovieTexture movieTexture;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;

    /**
     * Ruft den Wert der audioClip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioClip }
     *     
     */
    public AudioClip getAudioClip() {
        return audioClip;
    }

    /**
     * Legt den Wert der audioClip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioClip }
     *     
     */
    public void setAudioClip(AudioClip value) {
        this.audioClip = value;
    }

    /**
     * Ruft den Wert der movieTexture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MovieTexture }
     *     
     */
    public MovieTexture getMovieTexture() {
        return movieTexture;
    }

    /**
     * Legt den Wert der movieTexture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieTexture }
     *     
     */
    public void setMovieTexture(MovieTexture value) {
        this.movieTexture = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

}
