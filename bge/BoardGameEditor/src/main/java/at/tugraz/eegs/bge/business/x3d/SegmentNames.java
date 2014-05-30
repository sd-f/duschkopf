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
 * <p>Java-Klasse für segmentNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="segmentNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sacrum"/>
 *     &lt;enumeration value="pelvis"/>
 *     &lt;enumeration value="l_thigh"/>
 *     &lt;enumeration value="l_calf"/>
 *     &lt;enumeration value="l_hindfoot"/>
 *     &lt;enumeration value="l_midproximal"/>
 *     &lt;enumeration value="l_middistal"/>
 *     &lt;enumeration value="l_forefoot"/>
 *     &lt;enumeration value="r_thigh"/>
 *     &lt;enumeration value="r_calf"/>
 *     &lt;enumeration value="r_hindfoot"/>
 *     &lt;enumeration value="r_midproximal"/>
 *     &lt;enumeration value="r_middistal"/>
 *     &lt;enumeration value="r_forefoot"/>
 *     &lt;enumeration value="l5"/>
 *     &lt;enumeration value="l4"/>
 *     &lt;enumeration value="l3"/>
 *     &lt;enumeration value="l2"/>
 *     &lt;enumeration value="l1"/>
 *     &lt;enumeration value="t12"/>
 *     &lt;enumeration value="t11"/>
 *     &lt;enumeration value="t10"/>
 *     &lt;enumeration value="t9"/>
 *     &lt;enumeration value="t8"/>
 *     &lt;enumeration value="t7"/>
 *     &lt;enumeration value="t6"/>
 *     &lt;enumeration value="t5"/>
 *     &lt;enumeration value="t4"/>
 *     &lt;enumeration value="t3"/>
 *     &lt;enumeration value="t2"/>
 *     &lt;enumeration value="t1"/>
 *     &lt;enumeration value="c7"/>
 *     &lt;enumeration value="c6"/>
 *     &lt;enumeration value="c5"/>
 *     &lt;enumeration value="c4"/>
 *     &lt;enumeration value="c3"/>
 *     &lt;enumeration value="c2"/>
 *     &lt;enumeration value="c1"/>
 *     &lt;enumeration value="skull"/>
 *     &lt;enumeration value="l_eyelid"/>
 *     &lt;enumeration value="r_eyelid"/>
 *     &lt;enumeration value="l_eyeball"/>
 *     &lt;enumeration value="r_eyeball"/>
 *     &lt;enumeration value="l_eyebrow"/>
 *     &lt;enumeration value="r_eyebrow"/>
 *     &lt;enumeration value="jaw"/>
 *     &lt;enumeration value="l_clavicle"/>
 *     &lt;enumeration value="l_scapula"/>
 *     &lt;enumeration value="l_upperarm"/>
 *     &lt;enumeration value="l_forearm"/>
 *     &lt;enumeration value="l_hand"/>
 *     &lt;enumeration value="l_thumb_metacarpal"/>
 *     &lt;enumeration value="l_thumb_proximal"/>
 *     &lt;enumeration value="l_thumb_distal"/>
 *     &lt;enumeration value="l_index_metacarpal"/>
 *     &lt;enumeration value="l_index_proximal"/>
 *     &lt;enumeration value="l_index_middle"/>
 *     &lt;enumeration value="l_index_distal"/>
 *     &lt;enumeration value="l_middle_metacarpal"/>
 *     &lt;enumeration value="l_middle_proximal"/>
 *     &lt;enumeration value="l_middle_middle"/>
 *     &lt;enumeration value="l_middle_distal"/>
 *     &lt;enumeration value="l_ring_metacarpal"/>
 *     &lt;enumeration value="l_ring_proximal"/>
 *     &lt;enumeration value="l_ring_middle"/>
 *     &lt;enumeration value="l_ring_distal"/>
 *     &lt;enumeration value="l_pinky_metacarpal"/>
 *     &lt;enumeration value="l_pinky_proximal"/>
 *     &lt;enumeration value="l_pinky_middle"/>
 *     &lt;enumeration value="l_pinky_distal"/>
 *     &lt;enumeration value="r_clavicle"/>
 *     &lt;enumeration value="r_scapula"/>
 *     &lt;enumeration value="r_upperarm"/>
 *     &lt;enumeration value="r_forearm"/>
 *     &lt;enumeration value="r_hand"/>
 *     &lt;enumeration value="r_thumb_metacarpal"/>
 *     &lt;enumeration value="r_thumb_proximal"/>
 *     &lt;enumeration value="r_thumb_distal"/>
 *     &lt;enumeration value="r_index_metacarpal"/>
 *     &lt;enumeration value="r_index_proximal"/>
 *     &lt;enumeration value="r_index_middle"/>
 *     &lt;enumeration value="r_index_distal"/>
 *     &lt;enumeration value="r_middle_metacarpal"/>
 *     &lt;enumeration value="r_middle_proximal"/>
 *     &lt;enumeration value="r_middle_middle"/>
 *     &lt;enumeration value="r_middle_distal"/>
 *     &lt;enumeration value="r_ring_metacarpal"/>
 *     &lt;enumeration value="r_ring_proximal"/>
 *     &lt;enumeration value="r_ring_middle"/>
 *     &lt;enumeration value="r_ring_distal"/>
 *     &lt;enumeration value="r_pinky_metacarpal"/>
 *     &lt;enumeration value="r_pinky_proximal"/>
 *     &lt;enumeration value="r_pinky_middle"/>
 *     &lt;enumeration value="r_pinky_distal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "segmentNames")
@XmlEnum
public enum SegmentNames {

    @XmlEnumValue("sacrum")
    SACRUM("sacrum"),
    @XmlEnumValue("pelvis")
    PELVIS("pelvis"),
    @XmlEnumValue("l_thigh")
    L_THIGH("l_thigh"),
    @XmlEnumValue("l_calf")
    L_CALF("l_calf"),
    @XmlEnumValue("l_hindfoot")
    L_HINDFOOT("l_hindfoot"),
    @XmlEnumValue("l_midproximal")
    L_MIDPROXIMAL("l_midproximal"),
    @XmlEnumValue("l_middistal")
    L_MIDDISTAL("l_middistal"),
    @XmlEnumValue("l_forefoot")
    L_FOREFOOT("l_forefoot"),
    @XmlEnumValue("r_thigh")
    R_THIGH("r_thigh"),
    @XmlEnumValue("r_calf")
    R_CALF("r_calf"),
    @XmlEnumValue("r_hindfoot")
    R_HINDFOOT("r_hindfoot"),
    @XmlEnumValue("r_midproximal")
    R_MIDPROXIMAL("r_midproximal"),
    @XmlEnumValue("r_middistal")
    R_MIDDISTAL("r_middistal"),
    @XmlEnumValue("r_forefoot")
    R_FOREFOOT("r_forefoot"),
    @XmlEnumValue("l5")
    L_5("l5"),
    @XmlEnumValue("l4")
    L_4("l4"),
    @XmlEnumValue("l3")
    L_3("l3"),
    @XmlEnumValue("l2")
    L_2("l2"),
    @XmlEnumValue("l1")
    L_1("l1"),
    @XmlEnumValue("t12")
    T_12("t12"),
    @XmlEnumValue("t11")
    T_11("t11"),
    @XmlEnumValue("t10")
    T_10("t10"),
    @XmlEnumValue("t9")
    T_9("t9"),
    @XmlEnumValue("t8")
    T_8("t8"),
    @XmlEnumValue("t7")
    T_7("t7"),
    @XmlEnumValue("t6")
    T_6("t6"),
    @XmlEnumValue("t5")
    T_5("t5"),
    @XmlEnumValue("t4")
    T_4("t4"),
    @XmlEnumValue("t3")
    T_3("t3"),
    @XmlEnumValue("t2")
    T_2("t2"),
    @XmlEnumValue("t1")
    T_1("t1"),
    @XmlEnumValue("c7")
    C_7("c7"),
    @XmlEnumValue("c6")
    C_6("c6"),
    @XmlEnumValue("c5")
    C_5("c5"),
    @XmlEnumValue("c4")
    C_4("c4"),
    @XmlEnumValue("c3")
    C_3("c3"),
    @XmlEnumValue("c2")
    C_2("c2"),
    @XmlEnumValue("c1")
    C_1("c1"),
    @XmlEnumValue("skull")
    SKULL("skull"),
    @XmlEnumValue("l_eyelid")
    L_EYELID("l_eyelid"),
    @XmlEnumValue("r_eyelid")
    R_EYELID("r_eyelid"),
    @XmlEnumValue("l_eyeball")
    L_EYEBALL("l_eyeball"),
    @XmlEnumValue("r_eyeball")
    R_EYEBALL("r_eyeball"),
    @XmlEnumValue("l_eyebrow")
    L_EYEBROW("l_eyebrow"),
    @XmlEnumValue("r_eyebrow")
    R_EYEBROW("r_eyebrow"),
    @XmlEnumValue("jaw")
    JAW("jaw"),
    @XmlEnumValue("l_clavicle")
    L_CLAVICLE("l_clavicle"),
    @XmlEnumValue("l_scapula")
    L_SCAPULA("l_scapula"),
    @XmlEnumValue("l_upperarm")
    L_UPPERARM("l_upperarm"),
    @XmlEnumValue("l_forearm")
    L_FOREARM("l_forearm"),
    @XmlEnumValue("l_hand")
    L_HAND("l_hand"),
    @XmlEnumValue("l_thumb_metacarpal")
    L_THUMB_METACARPAL("l_thumb_metacarpal"),
    @XmlEnumValue("l_thumb_proximal")
    L_THUMB_PROXIMAL("l_thumb_proximal"),
    @XmlEnumValue("l_thumb_distal")
    L_THUMB_DISTAL("l_thumb_distal"),
    @XmlEnumValue("l_index_metacarpal")
    L_INDEX_METACARPAL("l_index_metacarpal"),
    @XmlEnumValue("l_index_proximal")
    L_INDEX_PROXIMAL("l_index_proximal"),
    @XmlEnumValue("l_index_middle")
    L_INDEX_MIDDLE("l_index_middle"),
    @XmlEnumValue("l_index_distal")
    L_INDEX_DISTAL("l_index_distal"),
    @XmlEnumValue("l_middle_metacarpal")
    L_MIDDLE_METACARPAL("l_middle_metacarpal"),
    @XmlEnumValue("l_middle_proximal")
    L_MIDDLE_PROXIMAL("l_middle_proximal"),
    @XmlEnumValue("l_middle_middle")
    L_MIDDLE_MIDDLE("l_middle_middle"),
    @XmlEnumValue("l_middle_distal")
    L_MIDDLE_DISTAL("l_middle_distal"),
    @XmlEnumValue("l_ring_metacarpal")
    L_RING_METACARPAL("l_ring_metacarpal"),
    @XmlEnumValue("l_ring_proximal")
    L_RING_PROXIMAL("l_ring_proximal"),
    @XmlEnumValue("l_ring_middle")
    L_RING_MIDDLE("l_ring_middle"),
    @XmlEnumValue("l_ring_distal")
    L_RING_DISTAL("l_ring_distal"),
    @XmlEnumValue("l_pinky_metacarpal")
    L_PINKY_METACARPAL("l_pinky_metacarpal"),
    @XmlEnumValue("l_pinky_proximal")
    L_PINKY_PROXIMAL("l_pinky_proximal"),
    @XmlEnumValue("l_pinky_middle")
    L_PINKY_MIDDLE("l_pinky_middle"),
    @XmlEnumValue("l_pinky_distal")
    L_PINKY_DISTAL("l_pinky_distal"),
    @XmlEnumValue("r_clavicle")
    R_CLAVICLE("r_clavicle"),
    @XmlEnumValue("r_scapula")
    R_SCAPULA("r_scapula"),
    @XmlEnumValue("r_upperarm")
    R_UPPERARM("r_upperarm"),
    @XmlEnumValue("r_forearm")
    R_FOREARM("r_forearm"),
    @XmlEnumValue("r_hand")
    R_HAND("r_hand"),
    @XmlEnumValue("r_thumb_metacarpal")
    R_THUMB_METACARPAL("r_thumb_metacarpal"),
    @XmlEnumValue("r_thumb_proximal")
    R_THUMB_PROXIMAL("r_thumb_proximal"),
    @XmlEnumValue("r_thumb_distal")
    R_THUMB_DISTAL("r_thumb_distal"),
    @XmlEnumValue("r_index_metacarpal")
    R_INDEX_METACARPAL("r_index_metacarpal"),
    @XmlEnumValue("r_index_proximal")
    R_INDEX_PROXIMAL("r_index_proximal"),
    @XmlEnumValue("r_index_middle")
    R_INDEX_MIDDLE("r_index_middle"),
    @XmlEnumValue("r_index_distal")
    R_INDEX_DISTAL("r_index_distal"),
    @XmlEnumValue("r_middle_metacarpal")
    R_MIDDLE_METACARPAL("r_middle_metacarpal"),
    @XmlEnumValue("r_middle_proximal")
    R_MIDDLE_PROXIMAL("r_middle_proximal"),
    @XmlEnumValue("r_middle_middle")
    R_MIDDLE_MIDDLE("r_middle_middle"),
    @XmlEnumValue("r_middle_distal")
    R_MIDDLE_DISTAL("r_middle_distal"),
    @XmlEnumValue("r_ring_metacarpal")
    R_RING_METACARPAL("r_ring_metacarpal"),
    @XmlEnumValue("r_ring_proximal")
    R_RING_PROXIMAL("r_ring_proximal"),
    @XmlEnumValue("r_ring_middle")
    R_RING_MIDDLE("r_ring_middle"),
    @XmlEnumValue("r_ring_distal")
    R_RING_DISTAL("r_ring_distal"),
    @XmlEnumValue("r_pinky_metacarpal")
    R_PINKY_METACARPAL("r_pinky_metacarpal"),
    @XmlEnumValue("r_pinky_proximal")
    R_PINKY_PROXIMAL("r_pinky_proximal"),
    @XmlEnumValue("r_pinky_middle")
    R_PINKY_MIDDLE("r_pinky_middle"),
    @XmlEnumValue("r_pinky_distal")
    R_PINKY_DISTAL("r_pinky_distal");
    private final String value;

    SegmentNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SegmentNames fromValue(String v) {
        for (SegmentNames c: SegmentNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
