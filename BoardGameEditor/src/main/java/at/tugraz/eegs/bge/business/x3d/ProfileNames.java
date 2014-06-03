//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für profileNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="profileNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Core"/>
 *     &lt;enumeration value="Interchange"/>
 *     &lt;enumeration value="CADInterchange"/>
 *     &lt;enumeration value="Interactive"/>
 *     &lt;enumeration value="Immersive"/>
 *     &lt;enumeration value="MPEG4Interactive"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "profileNames")
@XmlEnum
public enum ProfileNames {

    @XmlEnumValue("Core")
    CORE("Core"),
    @XmlEnumValue("Interchange")
    INTERCHANGE("Interchange"),
    @XmlEnumValue("CADInterchange")
    CAD_INTERCHANGE("CADInterchange"),
    @XmlEnumValue("Interactive")
    INTERACTIVE("Interactive"),
    @XmlEnumValue("Immersive")
    IMMERSIVE("Immersive"),
    @XmlEnumValue("MPEG4Interactive")
    MPEG_4_INTERACTIVE("MPEG4Interactive"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    ProfileNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileNames fromValue(String v) {
        for (ProfileNames c: ProfileNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
