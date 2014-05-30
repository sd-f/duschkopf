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
 * <p>Java-Klasse für metadataContainerFieldValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="metadataContainerFieldValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="metadata"/>
 *     &lt;enumeration value="value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "metadataContainerFieldValues")
@XmlEnum
public enum MetadataContainerFieldValues {

    @XmlEnumValue("metadata")
    METADATA("metadata"),
    @XmlEnumValue("value")
    VALUE("value");
    private final String value;

    MetadataContainerFieldValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataContainerFieldValues fromValue(String v) {
        for (MetadataContainerFieldValues c: MetadataContainerFieldValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
