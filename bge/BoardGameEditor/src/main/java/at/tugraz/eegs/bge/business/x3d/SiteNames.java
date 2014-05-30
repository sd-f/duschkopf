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
 * <p>Java-Klasse für siteNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="siteNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cervicale"/>
 *     &lt;enumeration value="crotch"/>
 *     &lt;enumeration value="l_acromion"/>
 *     &lt;enumeration value="l_asis"/>
 *     &lt;enumeration value="l_axilla_ant"/>
 *     &lt;enumeration value="l_axilla_post"/>
 *     &lt;enumeration value="l_calcaneous_post"/>
 *     &lt;enumeration value="l_clavicale"/>
 *     &lt;enumeration value="l_dactylion"/>
 *     &lt;enumeration value="l_digit2"/>
 *     &lt;enumeration value="l_femoral_lateral_epicn"/>
 *     &lt;enumeration value="l_femoral_medial_epicn"/>
 *     &lt;enumeration value="l_forefoot_tip"/>
 *     &lt;enumeration value="l_gonion"/>
 *     &lt;enumeration value="l_hand_tip"/>
 *     &lt;enumeration value="l_humeral_lateral_epicn"/>
 *     &lt;enumeration value="l_humeral_medial_epicn"/>
 *     &lt;enumeration value="l_iliocristale"/>
 *     &lt;enumeration value="l_index_distal_tip"/>
 *     &lt;enumeration value="l_infraorbitale"/>
 *     &lt;enumeration value="l_knee_crease"/>
 *     &lt;enumeration value="l_lateral_malleolus"/>
 *     &lt;enumeration value="l_medial_malleolus"/>
 *     &lt;enumeration value="l_metacarpal_pha2"/>
 *     &lt;enumeration value="l_metacarpal_pha5"/>
 *     &lt;enumeration value="l_metatarsal_pha1"/>
 *     &lt;enumeration value="l_metatarsal_pha5"/>
 *     &lt;enumeration value="l_middle_distal_tip"/>
 *     &lt;enumeration value="l_neck_base"/>
 *     &lt;enumeration value="l_olecranon"/>
 *     &lt;enumeration value="l_pinky_distal_tip"/>
 *     &lt;enumeration value="l_psis"/>
 *     &lt;enumeration value="l_radial_styloid"/>
 *     &lt;enumeration value="l_radiale"/>
 *     &lt;enumeration value="l_rib10"/>
 *     &lt;enumeration value="l_ring_distal_tip"/>
 *     &lt;enumeration value="l_sphyrion"/>
 *     &lt;enumeration value="l_thelion"/>
 *     &lt;enumeration value="l_thumb_distal_tip"/>
 *     &lt;enumeration value="l_tragion"/>
 *     &lt;enumeration value="l_trochanterion"/>
 *     &lt;enumeration value="l_ulnar_styloid"/>
 *     &lt;enumeration value="navel"/>
 *     &lt;enumeration value="nuchale"/>
 *     &lt;enumeration value="r_acromion"/>
 *     &lt;enumeration value="r_asis"/>
 *     &lt;enumeration value="r_axilla_ant"/>
 *     &lt;enumeration value="r_axilla_post"/>
 *     &lt;enumeration value="r_calcaneous_post"/>
 *     &lt;enumeration value="r_clavicale"/>
 *     &lt;enumeration value="r_dactylion"/>
 *     &lt;enumeration value="r_digit2"/>
 *     &lt;enumeration value="r_femoral_lateral_epicn"/>
 *     &lt;enumeration value="r_femoral_medial_epicn"/>
 *     &lt;enumeration value="r_forefoot_tip"/>
 *     &lt;enumeration value="r_gonion"/>
 *     &lt;enumeration value="r_hand_tip"/>
 *     &lt;enumeration value="r_humeral_lateral_epicn"/>
 *     &lt;enumeration value="r_humeral_medial_epicn"/>
 *     &lt;enumeration value="r_iliocristale"/>
 *     &lt;enumeration value="r_index_distal_tip"/>
 *     &lt;enumeration value="r_infraorbitale"/>
 *     &lt;enumeration value="r_knee_crease"/>
 *     &lt;enumeration value="r_lateral_malleolus"/>
 *     &lt;enumeration value="r_medial_malleolus"/>
 *     &lt;enumeration value="r_metacarpal_pha2"/>
 *     &lt;enumeration value="r_metacarpal_pha5"/>
 *     &lt;enumeration value="r_metatarsal_pha1"/>
 *     &lt;enumeration value="r_metatarsal_pha5"/>
 *     &lt;enumeration value="r_middle_distal_tip"/>
 *     &lt;enumeration value="r_neck_base"/>
 *     &lt;enumeration value="r_olecranon"/>
 *     &lt;enumeration value="r_pinky_distal_tip"/>
 *     &lt;enumeration value="r_psis"/>
 *     &lt;enumeration value="r_radial_styloid"/>
 *     &lt;enumeration value="r_radiale"/>
 *     &lt;enumeration value="r_rib10"/>
 *     &lt;enumeration value="r_ring_distal_tip"/>
 *     &lt;enumeration value="r_sphyrion"/>
 *     &lt;enumeration value="r_thelion"/>
 *     &lt;enumeration value="r_thumb_distal_tip"/>
 *     &lt;enumeration value="r_tragion"/>
 *     &lt;enumeration value="r_trochanterion"/>
 *     &lt;enumeration value="r_ulnar_styloid"/>
 *     &lt;enumeration value="rib10_midspine"/>
 *     &lt;enumeration value="sellion"/>
 *     &lt;enumeration value="skull_tip"/>
 *     &lt;enumeration value="substernale"/>
 *     &lt;enumeration value="supramenton"/>
 *     &lt;enumeration value="suprasternale"/>
 *     &lt;enumeration value="waist_preferred_post"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "siteNames")
@XmlEnum
public enum SiteNames {

    @XmlEnumValue("cervicale")
    CERVICALE("cervicale"),
    @XmlEnumValue("crotch")
    CROTCH("crotch"),
    @XmlEnumValue("l_acromion")
    L_ACROMION("l_acromion"),
    @XmlEnumValue("l_asis")
    L_ASIS("l_asis"),
    @XmlEnumValue("l_axilla_ant")
    L_AXILLA_ANT("l_axilla_ant"),
    @XmlEnumValue("l_axilla_post")
    L_AXILLA_POST("l_axilla_post"),
    @XmlEnumValue("l_calcaneous_post")
    L_CALCANEOUS_POST("l_calcaneous_post"),
    @XmlEnumValue("l_clavicale")
    L_CLAVICALE("l_clavicale"),
    @XmlEnumValue("l_dactylion")
    L_DACTYLION("l_dactylion"),
    @XmlEnumValue("l_digit2")
    L_DIGIT_2("l_digit2"),
    @XmlEnumValue("l_femoral_lateral_epicn")
    L_FEMORAL_LATERAL_EPICN("l_femoral_lateral_epicn"),
    @XmlEnumValue("l_femoral_medial_epicn")
    L_FEMORAL_MEDIAL_EPICN("l_femoral_medial_epicn"),
    @XmlEnumValue("l_forefoot_tip")
    L_FOREFOOT_TIP("l_forefoot_tip"),
    @XmlEnumValue("l_gonion")
    L_GONION("l_gonion"),
    @XmlEnumValue("l_hand_tip")
    L_HAND_TIP("l_hand_tip"),
    @XmlEnumValue("l_humeral_lateral_epicn")
    L_HUMERAL_LATERAL_EPICN("l_humeral_lateral_epicn"),
    @XmlEnumValue("l_humeral_medial_epicn")
    L_HUMERAL_MEDIAL_EPICN("l_humeral_medial_epicn"),
    @XmlEnumValue("l_iliocristale")
    L_ILIOCRISTALE("l_iliocristale"),
    @XmlEnumValue("l_index_distal_tip")
    L_INDEX_DISTAL_TIP("l_index_distal_tip"),
    @XmlEnumValue("l_infraorbitale")
    L_INFRAORBITALE("l_infraorbitale"),
    @XmlEnumValue("l_knee_crease")
    L_KNEE_CREASE("l_knee_crease"),
    @XmlEnumValue("l_lateral_malleolus")
    L_LATERAL_MALLEOLUS("l_lateral_malleolus"),
    @XmlEnumValue("l_medial_malleolus")
    L_MEDIAL_MALLEOLUS("l_medial_malleolus"),
    @XmlEnumValue("l_metacarpal_pha2")
    L_METACARPAL_PHA_2("l_metacarpal_pha2"),
    @XmlEnumValue("l_metacarpal_pha5")
    L_METACARPAL_PHA_5("l_metacarpal_pha5"),
    @XmlEnumValue("l_metatarsal_pha1")
    L_METATARSAL_PHA_1("l_metatarsal_pha1"),
    @XmlEnumValue("l_metatarsal_pha5")
    L_METATARSAL_PHA_5("l_metatarsal_pha5"),
    @XmlEnumValue("l_middle_distal_tip")
    L_MIDDLE_DISTAL_TIP("l_middle_distal_tip"),
    @XmlEnumValue("l_neck_base")
    L_NECK_BASE("l_neck_base"),
    @XmlEnumValue("l_olecranon")
    L_OLECRANON("l_olecranon"),
    @XmlEnumValue("l_pinky_distal_tip")
    L_PINKY_DISTAL_TIP("l_pinky_distal_tip"),
    @XmlEnumValue("l_psis")
    L_PSIS("l_psis"),
    @XmlEnumValue("l_radial_styloid")
    L_RADIAL_STYLOID("l_radial_styloid"),
    @XmlEnumValue("l_radiale")
    L_RADIALE("l_radiale"),
    @XmlEnumValue("l_rib10")
    L_RIB_10("l_rib10"),
    @XmlEnumValue("l_ring_distal_tip")
    L_RING_DISTAL_TIP("l_ring_distal_tip"),
    @XmlEnumValue("l_sphyrion")
    L_SPHYRION("l_sphyrion"),
    @XmlEnumValue("l_thelion")
    L_THELION("l_thelion"),
    @XmlEnumValue("l_thumb_distal_tip")
    L_THUMB_DISTAL_TIP("l_thumb_distal_tip"),
    @XmlEnumValue("l_tragion")
    L_TRAGION("l_tragion"),
    @XmlEnumValue("l_trochanterion")
    L_TROCHANTERION("l_trochanterion"),
    @XmlEnumValue("l_ulnar_styloid")
    L_ULNAR_STYLOID("l_ulnar_styloid"),
    @XmlEnumValue("navel")
    NAVEL("navel"),
    @XmlEnumValue("nuchale")
    NUCHALE("nuchale"),
    @XmlEnumValue("r_acromion")
    R_ACROMION("r_acromion"),
    @XmlEnumValue("r_asis")
    R_ASIS("r_asis"),
    @XmlEnumValue("r_axilla_ant")
    R_AXILLA_ANT("r_axilla_ant"),
    @XmlEnumValue("r_axilla_post")
    R_AXILLA_POST("r_axilla_post"),
    @XmlEnumValue("r_calcaneous_post")
    R_CALCANEOUS_POST("r_calcaneous_post"),
    @XmlEnumValue("r_clavicale")
    R_CLAVICALE("r_clavicale"),
    @XmlEnumValue("r_dactylion")
    R_DACTYLION("r_dactylion"),
    @XmlEnumValue("r_digit2")
    R_DIGIT_2("r_digit2"),
    @XmlEnumValue("r_femoral_lateral_epicn")
    R_FEMORAL_LATERAL_EPICN("r_femoral_lateral_epicn"),
    @XmlEnumValue("r_femoral_medial_epicn")
    R_FEMORAL_MEDIAL_EPICN("r_femoral_medial_epicn"),
    @XmlEnumValue("r_forefoot_tip")
    R_FOREFOOT_TIP("r_forefoot_tip"),
    @XmlEnumValue("r_gonion")
    R_GONION("r_gonion"),
    @XmlEnumValue("r_hand_tip")
    R_HAND_TIP("r_hand_tip"),
    @XmlEnumValue("r_humeral_lateral_epicn")
    R_HUMERAL_LATERAL_EPICN("r_humeral_lateral_epicn"),
    @XmlEnumValue("r_humeral_medial_epicn")
    R_HUMERAL_MEDIAL_EPICN("r_humeral_medial_epicn"),
    @XmlEnumValue("r_iliocristale")
    R_ILIOCRISTALE("r_iliocristale"),
    @XmlEnumValue("r_index_distal_tip")
    R_INDEX_DISTAL_TIP("r_index_distal_tip"),
    @XmlEnumValue("r_infraorbitale")
    R_INFRAORBITALE("r_infraorbitale"),
    @XmlEnumValue("r_knee_crease")
    R_KNEE_CREASE("r_knee_crease"),
    @XmlEnumValue("r_lateral_malleolus")
    R_LATERAL_MALLEOLUS("r_lateral_malleolus"),
    @XmlEnumValue("r_medial_malleolus")
    R_MEDIAL_MALLEOLUS("r_medial_malleolus"),
    @XmlEnumValue("r_metacarpal_pha2")
    R_METACARPAL_PHA_2("r_metacarpal_pha2"),
    @XmlEnumValue("r_metacarpal_pha5")
    R_METACARPAL_PHA_5("r_metacarpal_pha5"),
    @XmlEnumValue("r_metatarsal_pha1")
    R_METATARSAL_PHA_1("r_metatarsal_pha1"),
    @XmlEnumValue("r_metatarsal_pha5")
    R_METATARSAL_PHA_5("r_metatarsal_pha5"),
    @XmlEnumValue("r_middle_distal_tip")
    R_MIDDLE_DISTAL_TIP("r_middle_distal_tip"),
    @XmlEnumValue("r_neck_base")
    R_NECK_BASE("r_neck_base"),
    @XmlEnumValue("r_olecranon")
    R_OLECRANON("r_olecranon"),
    @XmlEnumValue("r_pinky_distal_tip")
    R_PINKY_DISTAL_TIP("r_pinky_distal_tip"),
    @XmlEnumValue("r_psis")
    R_PSIS("r_psis"),
    @XmlEnumValue("r_radial_styloid")
    R_RADIAL_STYLOID("r_radial_styloid"),
    @XmlEnumValue("r_radiale")
    R_RADIALE("r_radiale"),
    @XmlEnumValue("r_rib10")
    R_RIB_10("r_rib10"),
    @XmlEnumValue("r_ring_distal_tip")
    R_RING_DISTAL_TIP("r_ring_distal_tip"),
    @XmlEnumValue("r_sphyrion")
    R_SPHYRION("r_sphyrion"),
    @XmlEnumValue("r_thelion")
    R_THELION("r_thelion"),
    @XmlEnumValue("r_thumb_distal_tip")
    R_THUMB_DISTAL_TIP("r_thumb_distal_tip"),
    @XmlEnumValue("r_tragion")
    R_TRAGION("r_tragion"),
    @XmlEnumValue("r_trochanterion")
    R_TROCHANTERION("r_trochanterion"),
    @XmlEnumValue("r_ulnar_styloid")
    R_ULNAR_STYLOID("r_ulnar_styloid"),
    @XmlEnumValue("rib10_midspine")
    RIB_10_MIDSPINE("rib10_midspine"),
    @XmlEnumValue("sellion")
    SELLION("sellion"),
    @XmlEnumValue("skull_tip")
    SKULL_TIP("skull_tip"),
    @XmlEnumValue("substernale")
    SUBSTERNALE("substernale"),
    @XmlEnumValue("supramenton")
    SUPRAMENTON("supramenton"),
    @XmlEnumValue("suprasternale")
    SUPRASTERNALE("suprasternale"),
    @XmlEnumValue("waist_preferred_post")
    WAIST_PREFERRED_POST("waist_preferred_post");
    private final String value;

    SiteNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteNames fromValue(String v) {
        for (SiteNames c: SiteNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
