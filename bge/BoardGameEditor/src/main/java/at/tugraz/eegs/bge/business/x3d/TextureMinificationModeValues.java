//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für textureMinificationModeValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="textureMinificationModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AVG_PIXEL"/>
 *     &lt;enumeration value="AVG_PIXEL_AVG_MIPMAP"/>
 *     &lt;enumeration value="AVG_PIXEL_NEAREST_MIPMAP"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="FASTEST"/>
 *     &lt;enumeration value="NEAREST_PIXEL"/>
 *     &lt;enumeration value="NEAREST_PIXEL_AVG_MIPMAP"/>
 *     &lt;enumeration value="NEAREST_PIXEL_NEAREST_MIPMAP"/>
 *     &lt;enumeration value="NICEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textureMinificationModeValues")
@XmlEnum
public enum TextureMinificationModeValues {

    AVG_PIXEL,
    AVG_PIXEL_AVG_MIPMAP,
    AVG_PIXEL_NEAREST_MIPMAP,
    DEFAULT,
    FASTEST,
    NEAREST_PIXEL,
    NEAREST_PIXEL_AVG_MIPMAP,
    NEAREST_PIXEL_NEAREST_MIPMAP,
    NICEST;

    public String value() {
        return name();
    }

    public static TextureMinificationModeValues fromValue(String v) {
        return valueOf(v);
    }

}
