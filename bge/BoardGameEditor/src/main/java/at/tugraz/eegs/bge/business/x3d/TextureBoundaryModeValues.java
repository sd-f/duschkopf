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
 * <p>Java-Klasse für textureBoundaryModeValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="textureBoundaryModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CLAMP"/>
 *     &lt;enumeration value="CLAMP_TO_EDGE"/>
 *     &lt;enumeration value="CLAMP_TO_BOUNDARY"/>
 *     &lt;enumeration value="MIRRORED_REPEAT"/>
 *     &lt;enumeration value="REPEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textureBoundaryModeValues")
@XmlEnum
public enum TextureBoundaryModeValues {

    CLAMP,
    CLAMP_TO_EDGE,
    CLAMP_TO_BOUNDARY,
    MIRRORED_REPEAT,
    REPEAT;

    public String value() {
        return name();
    }

    public static TextureBoundaryModeValues fromValue(String v) {
        return valueOf(v);
    }

}
