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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{}X3DTextureNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}ImageTexture"/>
 *         &lt;element ref="{}MovieTexture"/>
 *         &lt;element ref="{}PixelTexture"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="alpha" type="{}SFFloat" default="1" />
 *       &lt;attribute name="color" type="{}SFColor" default="1 1 1" />
 *       &lt;attribute name="function" type="{}MFString" />
 *       &lt;attribute name="mode" type="{}MFString" />
 *       &lt;attribute name="source" type="{}MFString" />
 *       &lt;attribute name="transparent" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imageTextureOrMovieTextureOrPixelTexture"
})
@XmlRootElement(name = "MultiTexture")
public class MultiTexture
    extends X3DTextureNode
{

    @XmlElements({
        @XmlElement(name = "ImageTexture", type = ImageTexture.class),
        @XmlElement(name = "MovieTexture", type = MovieTexture.class),
        @XmlElement(name = "PixelTexture", type = PixelTexture.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> imageTextureOrMovieTextureOrPixelTexture;
    @XmlAttribute(name = "alpha")
    protected Float alpha;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "function")
    protected List<String> function;
    @XmlAttribute(name = "mode")
    protected List<String> mode;
    @XmlAttribute(name = "source")
    protected List<String> source;
    @XmlAttribute(name = "transparent")
    protected Boolean transparent;

    /**
     * Gets the value of the imageTextureOrMovieTextureOrPixelTexture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageTextureOrMovieTextureOrPixelTexture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageTextureOrMovieTextureOrPixelTexture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageTexture }
     * {@link MovieTexture }
     * {@link PixelTexture }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getImageTextureOrMovieTextureOrPixelTexture() {
        if (imageTextureOrMovieTextureOrPixelTexture == null) {
            imageTextureOrMovieTextureOrPixelTexture = new ArrayList<Object>();
        }
        return this.imageTextureOrMovieTextureOrPixelTexture;
    }

    /**
     * Ruft den Wert der alpha-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAlpha() {
        if (alpha == null) {
            return  1.0F;
        } else {
            return alpha;
        }
    }

    /**
     * Legt den Wert der alpha-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAlpha(Float value) {
        this.alpha = value;
    }

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
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFunction() {
        if (function == null) {
            function = new ArrayList<String>();
        }
        return this.function;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMode() {
        if (mode == null) {
            mode = new ArrayList<String>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSource() {
        if (source == null) {
            source = new ArrayList<String>();
        }
        return this.source;
    }

    /**
     * Ruft den Wert der transparent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTransparent() {
        if (transparent == null) {
            return false;
        } else {
            return transparent;
        }
    }

    /**
     * Legt den Wert der transparent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransparent(Boolean value) {
        this.transparent = value;
    }

}
