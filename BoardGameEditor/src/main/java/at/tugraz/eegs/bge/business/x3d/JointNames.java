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
 * <p>Java-Klasse für jointNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="jointNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HumanoidRoot"/>
 *     &lt;enumeration value="sacroiliac"/>
 *     &lt;enumeration value="l_hip"/>
 *     &lt;enumeration value="l_knee"/>
 *     &lt;enumeration value="l_ankle"/>
 *     &lt;enumeration value="l_subtalar"/>
 *     &lt;enumeration value="l_midtarsal"/>
 *     &lt;enumeration value="l_metatarsal"/>
 *     &lt;enumeration value="r_hip"/>
 *     &lt;enumeration value="r_knee"/>
 *     &lt;enumeration value="r_ankle"/>
 *     &lt;enumeration value="r_subtalar"/>
 *     &lt;enumeration value="r_midtarsal"/>
 *     &lt;enumeration value="r_metatarsal"/>
 *     &lt;enumeration value="vl5"/>
 *     &lt;enumeration value="vl4"/>
 *     &lt;enumeration value="vl3"/>
 *     &lt;enumeration value="vl2"/>
 *     &lt;enumeration value="vl1"/>
 *     &lt;enumeration value="vt12"/>
 *     &lt;enumeration value="vt11"/>
 *     &lt;enumeration value="vt10"/>
 *     &lt;enumeration value="vt9"/>
 *     &lt;enumeration value="vt8"/>
 *     &lt;enumeration value="vt7"/>
 *     &lt;enumeration value="vt6"/>
 *     &lt;enumeration value="vt5"/>
 *     &lt;enumeration value="vt4"/>
 *     &lt;enumeration value="vt3"/>
 *     &lt;enumeration value="vt2"/>
 *     &lt;enumeration value="vt1"/>
 *     &lt;enumeration value="vc7"/>
 *     &lt;enumeration value="vc6"/>
 *     &lt;enumeration value="vc5"/>
 *     &lt;enumeration value="vc4"/>
 *     &lt;enumeration value="vc3"/>
 *     &lt;enumeration value="vc2"/>
 *     &lt;enumeration value="vc1"/>
 *     &lt;enumeration value="skullbase"/>
 *     &lt;enumeration value="l_eyelid_joint"/>
 *     &lt;enumeration value="r_eyelid_joint"/>
 *     &lt;enumeration value="l_eyeball_joint"/>
 *     &lt;enumeration value="r_eyeball_joint"/>
 *     &lt;enumeration value="l_eyebrow_joint"/>
 *     &lt;enumeration value="r_eyebrow_joint"/>
 *     &lt;enumeration value="temporomandibular"/>
 *     &lt;enumeration value="l_sternoclavicular"/>
 *     &lt;enumeration value="l_acromioclavicular"/>
 *     &lt;enumeration value="l_shoulder"/>
 *     &lt;enumeration value="l_elbow"/>
 *     &lt;enumeration value="l_wrist"/>
 *     &lt;enumeration value="l_thumb1"/>
 *     &lt;enumeration value="l_thumb2"/>
 *     &lt;enumeration value="l_thumb3"/>
 *     &lt;enumeration value="l_index0"/>
 *     &lt;enumeration value="l_index1"/>
 *     &lt;enumeration value="l_index2"/>
 *     &lt;enumeration value="l_index3"/>
 *     &lt;enumeration value="l_middle0"/>
 *     &lt;enumeration value="l_middle1"/>
 *     &lt;enumeration value="l_middle2"/>
 *     &lt;enumeration value="l_middle3"/>
 *     &lt;enumeration value="l_ring0"/>
 *     &lt;enumeration value="l_ring1"/>
 *     &lt;enumeration value="l_ring2"/>
 *     &lt;enumeration value="l_ring3"/>
 *     &lt;enumeration value="l_pinky0"/>
 *     &lt;enumeration value="l_pinky1"/>
 *     &lt;enumeration value="l_pinky2"/>
 *     &lt;enumeration value="l_pinky3"/>
 *     &lt;enumeration value="r_sternoclavicular"/>
 *     &lt;enumeration value="r_acromioclavicular"/>
 *     &lt;enumeration value="r_shoulder"/>
 *     &lt;enumeration value="r_elbow"/>
 *     &lt;enumeration value="r_wrist"/>
 *     &lt;enumeration value="r_thumb1"/>
 *     &lt;enumeration value="r_thumb2"/>
 *     &lt;enumeration value="r_thumb3"/>
 *     &lt;enumeration value="r_index0"/>
 *     &lt;enumeration value="r_index1"/>
 *     &lt;enumeration value="r_index2"/>
 *     &lt;enumeration value="r_index3"/>
 *     &lt;enumeration value="r_middle0"/>
 *     &lt;enumeration value="r_middle1"/>
 *     &lt;enumeration value="r_middle2"/>
 *     &lt;enumeration value="r_middle3"/>
 *     &lt;enumeration value="r_ring0"/>
 *     &lt;enumeration value="r_ring1"/>
 *     &lt;enumeration value="r_ring2"/>
 *     &lt;enumeration value="r_ring3"/>
 *     &lt;enumeration value="r_pinky0"/>
 *     &lt;enumeration value="r_pinky1"/>
 *     &lt;enumeration value="r_pinky2"/>
 *     &lt;enumeration value="r_pinky3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jointNames")
@XmlEnum
public enum JointNames {

    @XmlEnumValue("HumanoidRoot")
    HUMANOID_ROOT("HumanoidRoot"),
    @XmlEnumValue("sacroiliac")
    SACROILIAC("sacroiliac"),
    @XmlEnumValue("l_hip")
    L_HIP("l_hip"),
    @XmlEnumValue("l_knee")
    L_KNEE("l_knee"),
    @XmlEnumValue("l_ankle")
    L_ANKLE("l_ankle"),
    @XmlEnumValue("l_subtalar")
    L_SUBTALAR("l_subtalar"),
    @XmlEnumValue("l_midtarsal")
    L_MIDTARSAL("l_midtarsal"),
    @XmlEnumValue("l_metatarsal")
    L_METATARSAL("l_metatarsal"),
    @XmlEnumValue("r_hip")
    R_HIP("r_hip"),
    @XmlEnumValue("r_knee")
    R_KNEE("r_knee"),
    @XmlEnumValue("r_ankle")
    R_ANKLE("r_ankle"),
    @XmlEnumValue("r_subtalar")
    R_SUBTALAR("r_subtalar"),
    @XmlEnumValue("r_midtarsal")
    R_MIDTARSAL("r_midtarsal"),
    @XmlEnumValue("r_metatarsal")
    R_METATARSAL("r_metatarsal"),
    @XmlEnumValue("vl5")
    VL_5("vl5"),
    @XmlEnumValue("vl4")
    VL_4("vl4"),
    @XmlEnumValue("vl3")
    VL_3("vl3"),
    @XmlEnumValue("vl2")
    VL_2("vl2"),
    @XmlEnumValue("vl1")
    VL_1("vl1"),
    @XmlEnumValue("vt12")
    VT_12("vt12"),
    @XmlEnumValue("vt11")
    VT_11("vt11"),
    @XmlEnumValue("vt10")
    VT_10("vt10"),
    @XmlEnumValue("vt9")
    VT_9("vt9"),
    @XmlEnumValue("vt8")
    VT_8("vt8"),
    @XmlEnumValue("vt7")
    VT_7("vt7"),
    @XmlEnumValue("vt6")
    VT_6("vt6"),
    @XmlEnumValue("vt5")
    VT_5("vt5"),
    @XmlEnumValue("vt4")
    VT_4("vt4"),
    @XmlEnumValue("vt3")
    VT_3("vt3"),
    @XmlEnumValue("vt2")
    VT_2("vt2"),
    @XmlEnumValue("vt1")
    VT_1("vt1"),
    @XmlEnumValue("vc7")
    VC_7("vc7"),
    @XmlEnumValue("vc6")
    VC_6("vc6"),
    @XmlEnumValue("vc5")
    VC_5("vc5"),
    @XmlEnumValue("vc4")
    VC_4("vc4"),
    @XmlEnumValue("vc3")
    VC_3("vc3"),
    @XmlEnumValue("vc2")
    VC_2("vc2"),
    @XmlEnumValue("vc1")
    VC_1("vc1"),
    @XmlEnumValue("skullbase")
    SKULLBASE("skullbase"),
    @XmlEnumValue("l_eyelid_joint")
    L_EYELID_JOINT("l_eyelid_joint"),
    @XmlEnumValue("r_eyelid_joint")
    R_EYELID_JOINT("r_eyelid_joint"),
    @XmlEnumValue("l_eyeball_joint")
    L_EYEBALL_JOINT("l_eyeball_joint"),
    @XmlEnumValue("r_eyeball_joint")
    R_EYEBALL_JOINT("r_eyeball_joint"),
    @XmlEnumValue("l_eyebrow_joint")
    L_EYEBROW_JOINT("l_eyebrow_joint"),
    @XmlEnumValue("r_eyebrow_joint")
    R_EYEBROW_JOINT("r_eyebrow_joint"),
    @XmlEnumValue("temporomandibular")
    TEMPOROMANDIBULAR("temporomandibular"),
    @XmlEnumValue("l_sternoclavicular")
    L_STERNOCLAVICULAR("l_sternoclavicular"),
    @XmlEnumValue("l_acromioclavicular")
    L_ACROMIOCLAVICULAR("l_acromioclavicular"),
    @XmlEnumValue("l_shoulder")
    L_SHOULDER("l_shoulder"),
    @XmlEnumValue("l_elbow")
    L_ELBOW("l_elbow"),
    @XmlEnumValue("l_wrist")
    L_WRIST("l_wrist"),
    @XmlEnumValue("l_thumb1")
    L_THUMB_1("l_thumb1"),
    @XmlEnumValue("l_thumb2")
    L_THUMB_2("l_thumb2"),
    @XmlEnumValue("l_thumb3")
    L_THUMB_3("l_thumb3"),
    @XmlEnumValue("l_index0")
    L_INDEX_0("l_index0"),
    @XmlEnumValue("l_index1")
    L_INDEX_1("l_index1"),
    @XmlEnumValue("l_index2")
    L_INDEX_2("l_index2"),
    @XmlEnumValue("l_index3")
    L_INDEX_3("l_index3"),
    @XmlEnumValue("l_middle0")
    L_MIDDLE_0("l_middle0"),
    @XmlEnumValue("l_middle1")
    L_MIDDLE_1("l_middle1"),
    @XmlEnumValue("l_middle2")
    L_MIDDLE_2("l_middle2"),
    @XmlEnumValue("l_middle3")
    L_MIDDLE_3("l_middle3"),
    @XmlEnumValue("l_ring0")
    L_RING_0("l_ring0"),
    @XmlEnumValue("l_ring1")
    L_RING_1("l_ring1"),
    @XmlEnumValue("l_ring2")
    L_RING_2("l_ring2"),
    @XmlEnumValue("l_ring3")
    L_RING_3("l_ring3"),
    @XmlEnumValue("l_pinky0")
    L_PINKY_0("l_pinky0"),
    @XmlEnumValue("l_pinky1")
    L_PINKY_1("l_pinky1"),
    @XmlEnumValue("l_pinky2")
    L_PINKY_2("l_pinky2"),
    @XmlEnumValue("l_pinky3")
    L_PINKY_3("l_pinky3"),
    @XmlEnumValue("r_sternoclavicular")
    R_STERNOCLAVICULAR("r_sternoclavicular"),
    @XmlEnumValue("r_acromioclavicular")
    R_ACROMIOCLAVICULAR("r_acromioclavicular"),
    @XmlEnumValue("r_shoulder")
    R_SHOULDER("r_shoulder"),
    @XmlEnumValue("r_elbow")
    R_ELBOW("r_elbow"),
    @XmlEnumValue("r_wrist")
    R_WRIST("r_wrist"),
    @XmlEnumValue("r_thumb1")
    R_THUMB_1("r_thumb1"),
    @XmlEnumValue("r_thumb2")
    R_THUMB_2("r_thumb2"),
    @XmlEnumValue("r_thumb3")
    R_THUMB_3("r_thumb3"),
    @XmlEnumValue("r_index0")
    R_INDEX_0("r_index0"),
    @XmlEnumValue("r_index1")
    R_INDEX_1("r_index1"),
    @XmlEnumValue("r_index2")
    R_INDEX_2("r_index2"),
    @XmlEnumValue("r_index3")
    R_INDEX_3("r_index3"),
    @XmlEnumValue("r_middle0")
    R_MIDDLE_0("r_middle0"),
    @XmlEnumValue("r_middle1")
    R_MIDDLE_1("r_middle1"),
    @XmlEnumValue("r_middle2")
    R_MIDDLE_2("r_middle2"),
    @XmlEnumValue("r_middle3")
    R_MIDDLE_3("r_middle3"),
    @XmlEnumValue("r_ring0")
    R_RING_0("r_ring0"),
    @XmlEnumValue("r_ring1")
    R_RING_1("r_ring1"),
    @XmlEnumValue("r_ring2")
    R_RING_2("r_ring2"),
    @XmlEnumValue("r_ring3")
    R_RING_3("r_ring3"),
    @XmlEnumValue("r_pinky0")
    R_PINKY_0("r_pinky0"),
    @XmlEnumValue("r_pinky1")
    R_PINKY_1("r_pinky1"),
    @XmlEnumValue("r_pinky2")
    R_PINKY_2("r_pinky2"),
    @XmlEnumValue("r_pinky3")
    R_PINKY_3("r_pinky3");
    private final String value;

    JointNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JointNames fromValue(String v) {
        for (JointNames c: JointNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
