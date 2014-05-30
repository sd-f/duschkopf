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
 * <p>Java-Klasse für accessTypeNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="accessTypeNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="initializeOnly"/>
 *     &lt;enumeration value="inputOnly"/>
 *     &lt;enumeration value="outputOnly"/>
 *     &lt;enumeration value="inputOutput"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accessTypeNames")
@XmlEnum
public enum AccessTypeNames {

    @XmlEnumValue("initializeOnly")
    INITIALIZE_ONLY("initializeOnly"),
    @XmlEnumValue("inputOnly")
    INPUT_ONLY("inputOnly"),
    @XmlEnumValue("outputOnly")
    OUTPUT_ONLY("outputOnly"),
    @XmlEnumValue("inputOutput")
    INPUT_OUTPUT("inputOutput");
    private final String value;

    AccessTypeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessTypeNames fromValue(String v) {
        for (AccessTypeNames c: AccessTypeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
