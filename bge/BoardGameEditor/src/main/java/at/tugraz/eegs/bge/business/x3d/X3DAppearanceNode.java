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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DAppearanceNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DAppearanceNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;group ref="{}AppearanceChildContentModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="appearance" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DAppearanceNode", propOrder = {
    "appearanceChildContentModel"
})
@XmlSeeAlso({
    Appearance.class
})
public class X3DAppearanceNode
    extends X3DNode
{

    @XmlElements({
        @XmlElement(name = "FillProperties", type = FillProperties.class),
        @XmlElement(name = "LineProperties", type = LineProperties.class),
        @XmlElement(name = "Material", type = Material.class),
        @XmlElement(name = "TwoSidedMaterial", type = TwoSidedMaterial.class),
        @XmlElement(name = "ComposedShader", type = ComposedShader.class),
        @XmlElement(name = "PackagedShader", type = PackagedShader.class),
        @XmlElement(name = "ProgramShader", type = ProgramShader.class),
        @XmlElement(name = "ComposedCubeMapTexture", type = ComposedCubeMapTexture.class),
        @XmlElement(name = "ComposedTexture3D", type = ComposedTexture3D.class),
        @XmlElement(name = "ImageTexture", type = ImageTexture.class),
        @XmlElement(name = "ImageTexture3D", type = ImageTexture3D.class),
        @XmlElement(name = "MovieTexture", type = MovieTexture.class),
        @XmlElement(name = "MultiTexture", type = MultiTexture.class),
        @XmlElement(name = "PixelTexture", type = PixelTexture.class),
        @XmlElement(name = "PixelTexture3D", type = PixelTexture3D.class),
        @XmlElement(name = "GeneratedCubeMapTexture", type = GeneratedCubeMapTexture.class),
        @XmlElement(name = "ImageCubeMapTexture", type = ImageCubeMapTexture.class),
        @XmlElement(name = "MultiTextureTransform", type = MultiTextureTransform.class),
        @XmlElement(name = "TextureTransform", type = TextureTransform.class),
        @XmlElement(name = "TextureTransform3D", type = TextureTransform3D.class),
        @XmlElement(name = "TextureTransformMatrix3D", type = TextureTransformMatrix3D.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> appearanceChildContentModel;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Gets the value of the appearanceChildContentModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceChildContentModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceChildContentModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillProperties }
     * {@link LineProperties }
     * {@link Material }
     * {@link TwoSidedMaterial }
     * {@link ComposedShader }
     * {@link PackagedShader }
     * {@link ProgramShader }
     * {@link ComposedCubeMapTexture }
     * {@link ComposedTexture3D }
     * {@link ImageTexture }
     * {@link ImageTexture3D }
     * {@link MovieTexture }
     * {@link MultiTexture }
     * {@link PixelTexture }
     * {@link PixelTexture3D }
     * {@link GeneratedCubeMapTexture }
     * {@link ImageCubeMapTexture }
     * {@link MultiTextureTransform }
     * {@link TextureTransform }
     * {@link TextureTransform3D }
     * {@link TextureTransformMatrix3D }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getAppearanceChildContentModel() {
        if (appearanceChildContentModel == null) {
            appearanceChildContentModel = new ArrayList<Object>();
        }
        return this.appearanceChildContentModel;
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
            return "appearance";
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
