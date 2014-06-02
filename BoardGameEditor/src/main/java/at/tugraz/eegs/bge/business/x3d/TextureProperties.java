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
 *       &lt;attribute name="anisotropicDegree" type="{}SFFloat" default="0" />
 *       &lt;attribute name="borderColor" type="{}SFColorRGBA" default="0 0 0 0" />
 *       &lt;attribute name="borderWidth" type="{}SFInt32" default="0" />
 *       &lt;attribute name="boundaryModeS" type="{}textureBoundaryModeValues" default="REPEAT" />
 *       &lt;attribute name="boundaryModeT" type="{}textureBoundaryModeValues" default="REPEAT" />
 *       &lt;attribute name="boundaryModeR" type="{}textureBoundaryModeValues" default="REPEAT" />
 *       &lt;attribute name="magnificationFilter" type="{}textureMagnificationModeValues" default="FASTEST" />
 *       &lt;attribute name="minificationFilter" type="{}textureMinificationModeValues" default="FASTEST" />
 *       &lt;attribute name="textureCompression" type="{}textureCompressionModeValues" default="FASTEST" />
 *       &lt;attribute name="texturePriority" type="{}SFFloat" default="0" />
 *       &lt;attribute name="generateMipMaps" type="{}SFBool" default="false" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="textureProperties" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TextureProperties")
public class TextureProperties
    extends X3DAppearanceChildNode
{

    @XmlAttribute(name = "anisotropicDegree")
    protected Float anisotropicDegree;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "borderWidth")
    protected BigInteger borderWidth;
    @XmlAttribute(name = "boundaryModeS")
    protected TextureBoundaryModeValues boundaryModeS;
    @XmlAttribute(name = "boundaryModeT")
    protected TextureBoundaryModeValues boundaryModeT;
    @XmlAttribute(name = "boundaryModeR")
    protected TextureBoundaryModeValues boundaryModeR;
    @XmlAttribute(name = "magnificationFilter")
    protected TextureMagnificationModeValues magnificationFilter;
    @XmlAttribute(name = "minificationFilter")
    protected TextureMinificationModeValues minificationFilter;
    @XmlAttribute(name = "textureCompression")
    protected TextureCompressionModeValues textureCompression;
    @XmlAttribute(name = "texturePriority")
    protected Float texturePriority;
    @XmlAttribute(name = "generateMipMaps")
    protected Boolean generateMipMaps;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der anisotropicDegree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAnisotropicDegree() {
        if (anisotropicDegree == null) {
            return  0.0F;
        } else {
            return anisotropicDegree;
        }
    }

    /**
     * Legt den Wert der anisotropicDegree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAnisotropicDegree(Float value) {
        this.anisotropicDegree = value;
    }

    /**
     * Ruft den Wert der borderColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        if (borderColor == null) {
            return "0 0 0 0";
        } else {
            return borderColor;
        }
    }

    /**
     * Legt den Wert der borderColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Ruft den Wert der borderWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorderWidth() {
        if (borderWidth == null) {
            return new BigInteger("0");
        } else {
            return borderWidth;
        }
    }

    /**
     * Legt den Wert der borderWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorderWidth(BigInteger value) {
        this.borderWidth = value;
    }

    /**
     * Ruft den Wert der boundaryModeS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public TextureBoundaryModeValues getBoundaryModeS() {
        if (boundaryModeS == null) {
            return TextureBoundaryModeValues.REPEAT;
        } else {
            return boundaryModeS;
        }
    }

    /**
     * Legt den Wert der boundaryModeS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public void setBoundaryModeS(TextureBoundaryModeValues value) {
        this.boundaryModeS = value;
    }

    /**
     * Ruft den Wert der boundaryModeT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public TextureBoundaryModeValues getBoundaryModeT() {
        if (boundaryModeT == null) {
            return TextureBoundaryModeValues.REPEAT;
        } else {
            return boundaryModeT;
        }
    }

    /**
     * Legt den Wert der boundaryModeT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public void setBoundaryModeT(TextureBoundaryModeValues value) {
        this.boundaryModeT = value;
    }

    /**
     * Ruft den Wert der boundaryModeR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public TextureBoundaryModeValues getBoundaryModeR() {
        if (boundaryModeR == null) {
            return TextureBoundaryModeValues.REPEAT;
        } else {
            return boundaryModeR;
        }
    }

    /**
     * Legt den Wert der boundaryModeR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureBoundaryModeValues }
     *     
     */
    public void setBoundaryModeR(TextureBoundaryModeValues value) {
        this.boundaryModeR = value;
    }

    /**
     * Ruft den Wert der magnificationFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureMagnificationModeValues }
     *     
     */
    public TextureMagnificationModeValues getMagnificationFilter() {
        if (magnificationFilter == null) {
            return TextureMagnificationModeValues.FASTEST;
        } else {
            return magnificationFilter;
        }
    }

    /**
     * Legt den Wert der magnificationFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureMagnificationModeValues }
     *     
     */
    public void setMagnificationFilter(TextureMagnificationModeValues value) {
        this.magnificationFilter = value;
    }

    /**
     * Ruft den Wert der minificationFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureMinificationModeValues }
     *     
     */
    public TextureMinificationModeValues getMinificationFilter() {
        if (minificationFilter == null) {
            return TextureMinificationModeValues.FASTEST;
        } else {
            return minificationFilter;
        }
    }

    /**
     * Legt den Wert der minificationFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureMinificationModeValues }
     *     
     */
    public void setMinificationFilter(TextureMinificationModeValues value) {
        this.minificationFilter = value;
    }

    /**
     * Ruft den Wert der textureCompression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureCompressionModeValues }
     *     
     */
    public TextureCompressionModeValues getTextureCompression() {
        if (textureCompression == null) {
            return TextureCompressionModeValues.FASTEST;
        } else {
            return textureCompression;
        }
    }

    /**
     * Legt den Wert der textureCompression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureCompressionModeValues }
     *     
     */
    public void setTextureCompression(TextureCompressionModeValues value) {
        this.textureCompression = value;
    }

    /**
     * Ruft den Wert der texturePriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getTexturePriority() {
        if (texturePriority == null) {
            return  0.0F;
        } else {
            return texturePriority;
        }
    }

    /**
     * Legt den Wert der texturePriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTexturePriority(Float value) {
        this.texturePriority = value;
    }

    /**
     * Ruft den Wert der generateMipMaps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateMipMaps() {
        if (generateMipMaps == null) {
            return false;
        } else {
            return generateMipMaps;
        }
    }

    /**
     * Legt den Wert der generateMipMaps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateMipMaps(Boolean value) {
        this.generateMipMaps = value;
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
            return "textureProperties";
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
