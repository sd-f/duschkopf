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
 * <p>Java-Klasse für fieldTypeName.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldTypeName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SFBool"/>
 *     &lt;enumeration value="MFBool"/>
 *     &lt;enumeration value="SFColor"/>
 *     &lt;enumeration value="MFColor"/>
 *     &lt;enumeration value="SFColorRGBA"/>
 *     &lt;enumeration value="MFColorRGBA"/>
 *     &lt;enumeration value="SFDouble"/>
 *     &lt;enumeration value="MFDouble"/>
 *     &lt;enumeration value="SFFloat"/>
 *     &lt;enumeration value="MFFloat"/>
 *     &lt;enumeration value="SFImage"/>
 *     &lt;enumeration value="MFImage"/>
 *     &lt;enumeration value="SFInt32"/>
 *     &lt;enumeration value="SFNode"/>
 *     &lt;enumeration value="MFNode"/>
 *     &lt;enumeration value="MFInt32"/>
 *     &lt;enumeration value="SFRotation"/>
 *     &lt;enumeration value="MFRotation"/>
 *     &lt;enumeration value="SFString"/>
 *     &lt;enumeration value="MFString"/>
 *     &lt;enumeration value="SFTime"/>
 *     &lt;enumeration value="MFTime"/>
 *     &lt;enumeration value="SFVec2d"/>
 *     &lt;enumeration value="MFVec2d"/>
 *     &lt;enumeration value="SFVec2f"/>
 *     &lt;enumeration value="MFVec2f"/>
 *     &lt;enumeration value="SFVec3d"/>
 *     &lt;enumeration value="MFVec3d"/>
 *     &lt;enumeration value="SFVec3f"/>
 *     &lt;enumeration value="MFVec3f"/>
 *     &lt;enumeration value="SFVec4d"/>
 *     &lt;enumeration value="MFVec4d"/>
 *     &lt;enumeration value="SFVec4f"/>
 *     &lt;enumeration value="MFVec4f"/>
 *     &lt;enumeration value="SFMatrix3d"/>
 *     &lt;enumeration value="MFMatrix3d"/>
 *     &lt;enumeration value="SFMatrix3f"/>
 *     &lt;enumeration value="MFMatrix3f"/>
 *     &lt;enumeration value="SFMatrix4d"/>
 *     &lt;enumeration value="MFMatrix4d"/>
 *     &lt;enumeration value="SFMatrix4f"/>
 *     &lt;enumeration value="MFMatrix4f"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fieldTypeName")
@XmlEnum
public enum FieldTypeName {

    @XmlEnumValue("SFBool")
    SF_BOOL("SFBool"),
    @XmlEnumValue("MFBool")
    MF_BOOL("MFBool"),
    @XmlEnumValue("SFColor")
    SF_COLOR("SFColor"),
    @XmlEnumValue("MFColor")
    MF_COLOR("MFColor"),
    @XmlEnumValue("SFColorRGBA")
    SF_COLOR_RGBA("SFColorRGBA"),
    @XmlEnumValue("MFColorRGBA")
    MF_COLOR_RGBA("MFColorRGBA"),
    @XmlEnumValue("SFDouble")
    SF_DOUBLE("SFDouble"),
    @XmlEnumValue("MFDouble")
    MF_DOUBLE("MFDouble"),
    @XmlEnumValue("SFFloat")
    SF_FLOAT("SFFloat"),
    @XmlEnumValue("MFFloat")
    MF_FLOAT("MFFloat"),
    @XmlEnumValue("SFImage")
    SF_IMAGE("SFImage"),
    @XmlEnumValue("MFImage")
    MF_IMAGE("MFImage"),
    @XmlEnumValue("SFInt32")
    SF_INT_32("SFInt32"),
    @XmlEnumValue("SFNode")
    SF_NODE("SFNode"),
    @XmlEnumValue("MFNode")
    MF_NODE("MFNode"),
    @XmlEnumValue("MFInt32")
    MF_INT_32("MFInt32"),
    @XmlEnumValue("SFRotation")
    SF_ROTATION("SFRotation"),
    @XmlEnumValue("MFRotation")
    MF_ROTATION("MFRotation"),
    @XmlEnumValue("SFString")
    SF_STRING("SFString"),
    @XmlEnumValue("MFString")
    MF_STRING("MFString"),
    @XmlEnumValue("SFTime")
    SF_TIME("SFTime"),
    @XmlEnumValue("MFTime")
    MF_TIME("MFTime"),
    @XmlEnumValue("SFVec2d")
    SF_VEC_2_D("SFVec2d"),
    @XmlEnumValue("MFVec2d")
    MF_VEC_2_D("MFVec2d"),
    @XmlEnumValue("SFVec2f")
    SF_VEC_2_F("SFVec2f"),
    @XmlEnumValue("MFVec2f")
    MF_VEC_2_F("MFVec2f"),
    @XmlEnumValue("SFVec3d")
    SF_VEC_3_D("SFVec3d"),
    @XmlEnumValue("MFVec3d")
    MF_VEC_3_D("MFVec3d"),
    @XmlEnumValue("SFVec3f")
    SF_VEC_3_F("SFVec3f"),
    @XmlEnumValue("MFVec3f")
    MF_VEC_3_F("MFVec3f"),
    @XmlEnumValue("SFVec4d")
    SF_VEC_4_D("SFVec4d"),
    @XmlEnumValue("MFVec4d")
    MF_VEC_4_D("MFVec4d"),
    @XmlEnumValue("SFVec4f")
    SF_VEC_4_F("SFVec4f"),
    @XmlEnumValue("MFVec4f")
    MF_VEC_4_F("MFVec4f"),
    @XmlEnumValue("SFMatrix3d")
    SF_MATRIX_3_D("SFMatrix3d"),
    @XmlEnumValue("MFMatrix3d")
    MF_MATRIX_3_D("MFMatrix3d"),
    @XmlEnumValue("SFMatrix3f")
    SF_MATRIX_3_F("SFMatrix3f"),
    @XmlEnumValue("MFMatrix3f")
    MF_MATRIX_3_F("MFMatrix3f"),
    @XmlEnumValue("SFMatrix4d")
    SF_MATRIX_4_D("SFMatrix4d"),
    @XmlEnumValue("MFMatrix4d")
    MF_MATRIX_4_D("MFMatrix4d"),
    @XmlEnumValue("SFMatrix4f")
    SF_MATRIX_4_F("SFMatrix4f"),
    @XmlEnumValue("MFMatrix4f")
    MF_MATRIX_4_F("MFMatrix4f");
    private final String value;

    FieldTypeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldTypeName fromValue(String v) {
        for (FieldTypeName c: FieldTypeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
