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
 * <p>Java-Klasse für networkModeValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="networkModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="standAlone"/>
 *     &lt;enumeration value="networkReader"/>
 *     &lt;enumeration value="networkWriter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "networkModeValues")
@XmlEnum
public enum NetworkModeValues {

    @XmlEnumValue("standAlone")
    STAND_ALONE("standAlone"),
    @XmlEnumValue("networkReader")
    NETWORK_READER("networkReader"),
    @XmlEnumValue("networkWriter")
    NETWORK_WRITER("networkWriter");
    private final String value;

    NetworkModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkModeValues fromValue(String v) {
        for (NetworkModeValues c: NetworkModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
