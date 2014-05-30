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
 *     &lt;extension base="{}X3DTextureCoordinateNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}TextureCoordinate"/>
 *         &lt;element ref="{}TextureCoordinateGenerator"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance"
})
@XmlRootElement(name = "MultiTextureCoordinate")
public class MultiTextureCoordinate
    extends X3DTextureCoordinateNode
{

    @XmlElements({
        @XmlElement(name = "TextureCoordinate", type = TextureCoordinate.class),
        @XmlElement(name = "TextureCoordinateGenerator", type = TextureCoordinateGenerator.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance;

    /**
     * Gets the value of the textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextureCoordinateOrTextureCoordinateGeneratorOrProtoInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextureCoordinate }
     * {@link TextureCoordinateGenerator }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getTextureCoordinateOrTextureCoordinateGeneratorOrProtoInstance() {
        if (textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance == null) {
            textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance = new ArrayList<Object>();
        }
        return this.textureCoordinateOrTextureCoordinateGeneratorOrProtoInstance;
    }

}
