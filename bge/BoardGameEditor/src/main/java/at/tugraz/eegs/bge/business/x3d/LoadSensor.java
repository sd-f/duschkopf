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
 *     &lt;extension base="{}X3DNetworkSensorNode">
 *       &lt;group ref="{}LoadSensorChildContentModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attribute name="timeOut" type="{}SFTime" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loadSensorChildContentModel"
})
@XmlRootElement(name = "LoadSensor")
public class LoadSensor
    extends X3DNetworkSensorNode
{

    @XmlElements({
        @XmlElement(name = "AudioClip", type = AudioClip.class),
        @XmlElement(name = "ImageCubeMapTexture", type = ImageCubeMapTexture.class),
        @XmlElement(name = "ImageTexture", type = ImageTexture.class),
        @XmlElement(name = "ImageTexture3D", type = ImageTexture3D.class),
        @XmlElement(name = "Inline", type = Inline.class),
        @XmlElement(name = "MovieTexture", type = MovieTexture.class),
        @XmlElement(name = "PackagedShader", type = PackagedShader.class),
        @XmlElement(name = "ShaderPart", type = ShaderPart.class),
        @XmlElement(name = "ShaderProgram", type = ShaderProgram.class)
    })
    protected List<Object> loadSensorChildContentModel;
    @XmlAttribute(name = "timeOut")
    protected String timeOut;

    /**
     * Gets the value of the loadSensorChildContentModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadSensorChildContentModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadSensorChildContentModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioClip }
     * {@link ImageCubeMapTexture }
     * {@link ImageTexture }
     * {@link ImageTexture3D }
     * {@link Inline }
     * {@link MovieTexture }
     * {@link PackagedShader }
     * {@link ShaderPart }
     * {@link ShaderProgram }
     * 
     * 
     */
    public List<Object> getLoadSensorChildContentModel() {
        if (loadSensorChildContentModel == null) {
            loadSensorChildContentModel = new ArrayList<Object>();
        }
        return this.loadSensorChildContentModel;
    }

    /**
     * Ruft den Wert der timeOut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOut() {
        if (timeOut == null) {
            return "0";
        } else {
            return timeOut;
        }
    }

    /**
     * Legt den Wert der timeOut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOut(String value) {
        this.timeOut = value;
    }

}
