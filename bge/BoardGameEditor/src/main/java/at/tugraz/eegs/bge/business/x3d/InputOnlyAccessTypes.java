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
 * <p>Java-Klasse für inputOnlyAccessTypes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="inputOnlyAccessTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="activate"/>
 *     &lt;enumeration value="set_articulationParameterValue0"/>
 *     &lt;enumeration value="set_articulationParameterValue1"/>
 *     &lt;enumeration value="set_articulationParameterValue2"/>
 *     &lt;enumeration value="set_articulationParameterValue3"/>
 *     &lt;enumeration value="set_articulationParameterValue4"/>
 *     &lt;enumeration value="set_articulationParameterValue5"/>
 *     &lt;enumeration value="set_articulationParameterValue6"/>
 *     &lt;enumeration value="set_articulationParameterValue7"/>
 *     &lt;enumeration value="set_boolean"/>
 *     &lt;enumeration value="set_bind"/>
 *     &lt;enumeration value="set_colorIndex"/>
 *     &lt;enumeration value="set_contacts"/>
 *     &lt;enumeration value="set_coordinate"/>
 *     &lt;enumeration value="set_coordIndex"/>
 *     &lt;enumeration value="set_crossSection"/>
 *     &lt;enumeration value="set_destination"/>
 *     &lt;enumeration value="set_fraction"/>
 *     &lt;enumeration value="set_height"/>
 *     &lt;enumeration value="set_index"/>
 *     &lt;enumeration value="set_normalIndex"/>
 *     &lt;enumeration value="set_orientation"/>
 *     &lt;enumeration value="set_position"/>
 *     &lt;enumeration value="set_scale"/>
 *     &lt;enumeration value="set_spine"/>
 *     &lt;enumeration value="set_texCoordIndex"/>
 *     &lt;enumeration value="set_triggerTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "inputOnlyAccessTypes")
@XmlEnum
public enum InputOnlyAccessTypes {

    @XmlEnumValue("activate")
    ACTIVATE("activate"),
    @XmlEnumValue("set_articulationParameterValue0")
    SET_ARTICULATION_PARAMETER_VALUE_0("set_articulationParameterValue0"),
    @XmlEnumValue("set_articulationParameterValue1")
    SET_ARTICULATION_PARAMETER_VALUE_1("set_articulationParameterValue1"),
    @XmlEnumValue("set_articulationParameterValue2")
    SET_ARTICULATION_PARAMETER_VALUE_2("set_articulationParameterValue2"),
    @XmlEnumValue("set_articulationParameterValue3")
    SET_ARTICULATION_PARAMETER_VALUE_3("set_articulationParameterValue3"),
    @XmlEnumValue("set_articulationParameterValue4")
    SET_ARTICULATION_PARAMETER_VALUE_4("set_articulationParameterValue4"),
    @XmlEnumValue("set_articulationParameterValue5")
    SET_ARTICULATION_PARAMETER_VALUE_5("set_articulationParameterValue5"),
    @XmlEnumValue("set_articulationParameterValue6")
    SET_ARTICULATION_PARAMETER_VALUE_6("set_articulationParameterValue6"),
    @XmlEnumValue("set_articulationParameterValue7")
    SET_ARTICULATION_PARAMETER_VALUE_7("set_articulationParameterValue7"),
    @XmlEnumValue("set_boolean")
    SET_BOOLEAN("set_boolean"),
    @XmlEnumValue("set_bind")
    SET_BIND("set_bind"),
    @XmlEnumValue("set_colorIndex")
    SET_COLOR_INDEX("set_colorIndex"),
    @XmlEnumValue("set_contacts")
    SET_CONTACTS("set_contacts"),
    @XmlEnumValue("set_coordinate")
    SET_COORDINATE("set_coordinate"),
    @XmlEnumValue("set_coordIndex")
    SET_COORD_INDEX("set_coordIndex"),
    @XmlEnumValue("set_crossSection")
    SET_CROSS_SECTION("set_crossSection"),
    @XmlEnumValue("set_destination")
    SET_DESTINATION("set_destination"),
    @XmlEnumValue("set_fraction")
    SET_FRACTION("set_fraction"),
    @XmlEnumValue("set_height")
    SET_HEIGHT("set_height"),
    @XmlEnumValue("set_index")
    SET_INDEX("set_index"),
    @XmlEnumValue("set_normalIndex")
    SET_NORMAL_INDEX("set_normalIndex"),
    @XmlEnumValue("set_orientation")
    SET_ORIENTATION("set_orientation"),
    @XmlEnumValue("set_position")
    SET_POSITION("set_position"),
    @XmlEnumValue("set_scale")
    SET_SCALE("set_scale"),
    @XmlEnumValue("set_spine")
    SET_SPINE("set_spine"),
    @XmlEnumValue("set_texCoordIndex")
    SET_TEX_COORD_INDEX("set_texCoordIndex"),
    @XmlEnumValue("set_triggerTime")
    SET_TRIGGER_TIME("set_triggerTime");
    private final String value;

    InputOnlyAccessTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputOnlyAccessTypes fromValue(String v) {
        for (InputOnlyAccessTypes c: InputOnlyAccessTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
