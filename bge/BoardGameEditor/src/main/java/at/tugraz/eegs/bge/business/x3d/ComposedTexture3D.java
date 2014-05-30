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
 *     &lt;extension base="{}X3DTexture3DNode">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}ImageTexture"/>
 *         &lt;element ref="{}PixelTexture"/>
 *         &lt;element ref="{}MovieTexture"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imageTextureAndPixelTextureAndMovieTexture"
})
@XmlRootElement(name = "ComposedTexture3D")
public class ComposedTexture3D
    extends X3DTexture3DNode
{

    @XmlElements({
        @XmlElement(name = "ImageTexture", type = ImageTexture.class),
        @XmlElement(name = "PixelTexture", type = PixelTexture.class),
        @XmlElement(name = "MovieTexture", type = MovieTexture.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> imageTextureAndPixelTextureAndMovieTexture;

    /**
     * Gets the value of the imageTextureAndPixelTextureAndMovieTexture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageTextureAndPixelTextureAndMovieTexture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageTextureAndPixelTextureAndMovieTexture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageTexture }
     * {@link PixelTexture }
     * {@link MovieTexture }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getImageTextureAndPixelTextureAndMovieTexture() {
        if (imageTextureAndPixelTextureAndMovieTexture == null) {
            imageTextureAndPixelTextureAndMovieTexture = new ArrayList<Object>();
        }
        return this.imageTextureAndPixelTextureAndMovieTexture;
    }

}
