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
 * <p>Java-Klasse für outputOnlyAccessTypes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOnlyAccessTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="actionKeyPress"/>
 *     &lt;enumeration value="actionKeyRelease"/>
 *     &lt;enumeration value="altKey"/>
 *     &lt;enumeration value="angle"/>
 *     &lt;enumeration value="angleRate"/>
 *     &lt;enumeration value="articulationParameterValue0_changed"/>
 *     &lt;enumeration value="articulationParameterValue1_changed"/>
 *     &lt;enumeration value="articulationParameterValue2_changed"/>
 *     &lt;enumeration value="articulationParameterValue3_changed"/>
 *     &lt;enumeration value="articulationParameterValue4_changed"/>
 *     &lt;enumeration value="articulationParameterValue5_changed"/>
 *     &lt;enumeration value="articulationParameterValue6_changed"/>
 *     &lt;enumeration value="articulationParameterValue7_changed"/>
 *     &lt;enumeration value="bindTime"/>
 *     &lt;enumeration value="body1AnchorPoint"/>
 *     &lt;enumeration value="body1Axis"/>
 *     &lt;enumeration value="body2AnchorPoint"/>
 *     &lt;enumeration value="body2Axis"/>
 *     &lt;enumeration value="centerOfRotation_changed"/>
 *     &lt;enumeration value="collideTime"/>
 *     &lt;enumeration value="controlKey"/>
 *     &lt;enumeration value="cycleTime"/>
 *     &lt;enumeration value="detonateTime"/>
 *     &lt;enumeration value="duration_changed"/>
 *     &lt;enumeration value="elapsedTime"/>
 *     &lt;enumeration value="enteredText"/>
 *     &lt;enumeration value="enterTime"/>
 *     &lt;enumeration value="exitTime"/>
 *     &lt;enumeration value="finalText"/>
 *     &lt;enumeration value="firedTime"/>
 *     &lt;enumeration value="fraction_changed"/>
 *     &lt;enumeration value="geovalue_changed"/>
 *     &lt;enumeration value="hinge1Angle"/>
 *     &lt;enumeration value="hinge1AngleRate"/>
 *     &lt;enumeration value="hinge2Angle"/>
 *     &lt;enumeration value="hinge2AngleRate"/>
 *     &lt;enumeration value="hitGeoCoord_changed"/>
 *     &lt;enumeration value="hitNormal_changed"/>
 *     &lt;enumeration value="hitPoint_changed"/>
 *     &lt;enumeration value="hitTexCoord_changed"/>
 *     &lt;enumeration value="inputFalse"/>
 *     &lt;enumeration value="inputNegate"/>
 *     &lt;enumeration value="inputTrue"/>
 *     &lt;enumeration value="isActive"/>
 *     &lt;enumeration value="isBound"/>
 *     &lt;enumeration value="isCollided"/>
 *     &lt;enumeration value="isDetonated"/>
 *     &lt;enumeration value="isLoaded"/>
 *     &lt;enumeration value="isOver"/>
 *     &lt;enumeration value="isPaused"/>
 *     &lt;enumeration value="isNetworkReader"/>
 *     &lt;enumeration value="isNetworkWriter"/>
 *     &lt;enumeration value="isRtpHeaderHeard"/>
 *     &lt;enumeration value="isSelected"/>
 *     &lt;enumeration value="isStandAlone"/>
 *     &lt;enumeration value="isValid"/>
 *     &lt;enumeration value="keyPress"/>
 *     &lt;enumeration value="keyRelease"/>
 *     &lt;enumeration value="level_changed"/>
 *     &lt;enumeration value="lineBounds"/>
 *     &lt;enumeration value="loadTime"/>
 *     &lt;enumeration value="modifiedFraction_changed"/>
 *     &lt;enumeration value="motor1Angle"/>
 *     &lt;enumeration value="motor1AngleRate"/>
 *     &lt;enumeration value="motor2Angle"/>
 *     &lt;enumeration value="motor2AngleRate"/>
 *     &lt;enumeration value="motor3Angle"/>
 *     &lt;enumeration value="motor3AngleRate"/>
 *     &lt;enumeration value="next"/>
 *     &lt;enumeration value="normal_changed"/>
 *     &lt;enumeration value="orientation_changed"/>
 *     &lt;enumeration value="pickedGeometry"/>
 *     &lt;enumeration value="pickedNormal"/>
 *     &lt;enumeration value="pickedPoint"/>
 *     &lt;enumeration value="pickedTextureCoordinate"/>
 *     &lt;enumeration value="position_changed"/>
 *     &lt;enumeration value="previous"/>
 *     &lt;enumeration value="progress"/>
 *     &lt;enumeration value="rotation_changed"/>
 *     &lt;enumeration value="separation"/>
 *     &lt;enumeration value="separationRate"/>
 *     &lt;enumeration value="shiftKey"/>
 *     &lt;enumeration value="textBounds"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="timestamp"/>
 *     &lt;enumeration value="touchTime"/>
 *     &lt;enumeration value="trackPoint_changed"/>
 *     &lt;enumeration value="transitionComplete"/>
 *     &lt;enumeration value="translation_changed"/>
 *     &lt;enumeration value="triggerTime"/>
 *     &lt;enumeration value="triggerTrue"/>
 *     &lt;enumeration value="triggerValue"/>
 *     &lt;enumeration value="value_changed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOnlyAccessTypes")
@XmlEnum
public enum OutputOnlyAccessTypes {

    @XmlEnumValue("actionKeyPress")
    ACTION_KEY_PRESS("actionKeyPress"),
    @XmlEnumValue("actionKeyRelease")
    ACTION_KEY_RELEASE("actionKeyRelease"),
    @XmlEnumValue("altKey")
    ALT_KEY("altKey"),
    @XmlEnumValue("angle")
    ANGLE("angle"),
    @XmlEnumValue("angleRate")
    ANGLE_RATE("angleRate"),
    @XmlEnumValue("articulationParameterValue0_changed")
    ARTICULATION_PARAMETER_VALUE_0_CHANGED("articulationParameterValue0_changed"),
    @XmlEnumValue("articulationParameterValue1_changed")
    ARTICULATION_PARAMETER_VALUE_1_CHANGED("articulationParameterValue1_changed"),
    @XmlEnumValue("articulationParameterValue2_changed")
    ARTICULATION_PARAMETER_VALUE_2_CHANGED("articulationParameterValue2_changed"),
    @XmlEnumValue("articulationParameterValue3_changed")
    ARTICULATION_PARAMETER_VALUE_3_CHANGED("articulationParameterValue3_changed"),
    @XmlEnumValue("articulationParameterValue4_changed")
    ARTICULATION_PARAMETER_VALUE_4_CHANGED("articulationParameterValue4_changed"),
    @XmlEnumValue("articulationParameterValue5_changed")
    ARTICULATION_PARAMETER_VALUE_5_CHANGED("articulationParameterValue5_changed"),
    @XmlEnumValue("articulationParameterValue6_changed")
    ARTICULATION_PARAMETER_VALUE_6_CHANGED("articulationParameterValue6_changed"),
    @XmlEnumValue("articulationParameterValue7_changed")
    ARTICULATION_PARAMETER_VALUE_7_CHANGED("articulationParameterValue7_changed"),
    @XmlEnumValue("bindTime")
    BIND_TIME("bindTime"),
    @XmlEnumValue("body1AnchorPoint")
    BODY_1_ANCHOR_POINT("body1AnchorPoint"),
    @XmlEnumValue("body1Axis")
    BODY_1_AXIS("body1Axis"),
    @XmlEnumValue("body2AnchorPoint")
    BODY_2_ANCHOR_POINT("body2AnchorPoint"),
    @XmlEnumValue("body2Axis")
    BODY_2_AXIS("body2Axis"),
    @XmlEnumValue("centerOfRotation_changed")
    CENTER_OF_ROTATION_CHANGED("centerOfRotation_changed"),
    @XmlEnumValue("collideTime")
    COLLIDE_TIME("collideTime"),
    @XmlEnumValue("controlKey")
    CONTROL_KEY("controlKey"),
    @XmlEnumValue("cycleTime")
    CYCLE_TIME("cycleTime"),
    @XmlEnumValue("detonateTime")
    DETONATE_TIME("detonateTime"),
    @XmlEnumValue("duration_changed")
    DURATION_CHANGED("duration_changed"),
    @XmlEnumValue("elapsedTime")
    ELAPSED_TIME("elapsedTime"),
    @XmlEnumValue("enteredText")
    ENTERED_TEXT("enteredText"),
    @XmlEnumValue("enterTime")
    ENTER_TIME("enterTime"),
    @XmlEnumValue("exitTime")
    EXIT_TIME("exitTime"),
    @XmlEnumValue("finalText")
    FINAL_TEXT("finalText"),
    @XmlEnumValue("firedTime")
    FIRED_TIME("firedTime"),
    @XmlEnumValue("fraction_changed")
    FRACTION_CHANGED("fraction_changed"),
    @XmlEnumValue("geovalue_changed")
    GEOVALUE_CHANGED("geovalue_changed"),
    @XmlEnumValue("hinge1Angle")
    HINGE_1_ANGLE("hinge1Angle"),
    @XmlEnumValue("hinge1AngleRate")
    HINGE_1_ANGLE_RATE("hinge1AngleRate"),
    @XmlEnumValue("hinge2Angle")
    HINGE_2_ANGLE("hinge2Angle"),
    @XmlEnumValue("hinge2AngleRate")
    HINGE_2_ANGLE_RATE("hinge2AngleRate"),
    @XmlEnumValue("hitGeoCoord_changed")
    HIT_GEO_COORD_CHANGED("hitGeoCoord_changed"),
    @XmlEnumValue("hitNormal_changed")
    HIT_NORMAL_CHANGED("hitNormal_changed"),
    @XmlEnumValue("hitPoint_changed")
    HIT_POINT_CHANGED("hitPoint_changed"),
    @XmlEnumValue("hitTexCoord_changed")
    HIT_TEX_COORD_CHANGED("hitTexCoord_changed"),
    @XmlEnumValue("inputFalse")
    INPUT_FALSE("inputFalse"),
    @XmlEnumValue("inputNegate")
    INPUT_NEGATE("inputNegate"),
    @XmlEnumValue("inputTrue")
    INPUT_TRUE("inputTrue"),
    @XmlEnumValue("isActive")
    IS_ACTIVE("isActive"),
    @XmlEnumValue("isBound")
    IS_BOUND("isBound"),
    @XmlEnumValue("isCollided")
    IS_COLLIDED("isCollided"),
    @XmlEnumValue("isDetonated")
    IS_DETONATED("isDetonated"),
    @XmlEnumValue("isLoaded")
    IS_LOADED("isLoaded"),
    @XmlEnumValue("isOver")
    IS_OVER("isOver"),
    @XmlEnumValue("isPaused")
    IS_PAUSED("isPaused"),
    @XmlEnumValue("isNetworkReader")
    IS_NETWORK_READER("isNetworkReader"),
    @XmlEnumValue("isNetworkWriter")
    IS_NETWORK_WRITER("isNetworkWriter"),
    @XmlEnumValue("isRtpHeaderHeard")
    IS_RTP_HEADER_HEARD("isRtpHeaderHeard"),
    @XmlEnumValue("isSelected")
    IS_SELECTED("isSelected"),
    @XmlEnumValue("isStandAlone")
    IS_STAND_ALONE("isStandAlone"),
    @XmlEnumValue("isValid")
    IS_VALID("isValid"),
    @XmlEnumValue("keyPress")
    KEY_PRESS("keyPress"),
    @XmlEnumValue("keyRelease")
    KEY_RELEASE("keyRelease"),
    @XmlEnumValue("level_changed")
    LEVEL_CHANGED("level_changed"),
    @XmlEnumValue("lineBounds")
    LINE_BOUNDS("lineBounds"),
    @XmlEnumValue("loadTime")
    LOAD_TIME("loadTime"),
    @XmlEnumValue("modifiedFraction_changed")
    MODIFIED_FRACTION_CHANGED("modifiedFraction_changed"),
    @XmlEnumValue("motor1Angle")
    MOTOR_1_ANGLE("motor1Angle"),
    @XmlEnumValue("motor1AngleRate")
    MOTOR_1_ANGLE_RATE("motor1AngleRate"),
    @XmlEnumValue("motor2Angle")
    MOTOR_2_ANGLE("motor2Angle"),
    @XmlEnumValue("motor2AngleRate")
    MOTOR_2_ANGLE_RATE("motor2AngleRate"),
    @XmlEnumValue("motor3Angle")
    MOTOR_3_ANGLE("motor3Angle"),
    @XmlEnumValue("motor3AngleRate")
    MOTOR_3_ANGLE_RATE("motor3AngleRate"),
    @XmlEnumValue("next")
    NEXT("next"),
    @XmlEnumValue("normal_changed")
    NORMAL_CHANGED("normal_changed"),
    @XmlEnumValue("orientation_changed")
    ORIENTATION_CHANGED("orientation_changed"),
    @XmlEnumValue("pickedGeometry")
    PICKED_GEOMETRY("pickedGeometry"),
    @XmlEnumValue("pickedNormal")
    PICKED_NORMAL("pickedNormal"),
    @XmlEnumValue("pickedPoint")
    PICKED_POINT("pickedPoint"),
    @XmlEnumValue("pickedTextureCoordinate")
    PICKED_TEXTURE_COORDINATE("pickedTextureCoordinate"),
    @XmlEnumValue("position_changed")
    POSITION_CHANGED("position_changed"),
    @XmlEnumValue("previous")
    PREVIOUS("previous"),
    @XmlEnumValue("progress")
    PROGRESS("progress"),
    @XmlEnumValue("rotation_changed")
    ROTATION_CHANGED("rotation_changed"),
    @XmlEnumValue("separation")
    SEPARATION("separation"),
    @XmlEnumValue("separationRate")
    SEPARATION_RATE("separationRate"),
    @XmlEnumValue("shiftKey")
    SHIFT_KEY("shiftKey"),
    @XmlEnumValue("textBounds")
    TEXT_BOUNDS("textBounds"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("timestamp")
    TIMESTAMP("timestamp"),
    @XmlEnumValue("touchTime")
    TOUCH_TIME("touchTime"),
    @XmlEnumValue("trackPoint_changed")
    TRACK_POINT_CHANGED("trackPoint_changed"),
    @XmlEnumValue("transitionComplete")
    TRANSITION_COMPLETE("transitionComplete"),
    @XmlEnumValue("translation_changed")
    TRANSLATION_CHANGED("translation_changed"),
    @XmlEnumValue("triggerTime")
    TRIGGER_TIME("triggerTime"),
    @XmlEnumValue("triggerTrue")
    TRIGGER_TRUE("triggerTrue"),
    @XmlEnumValue("triggerValue")
    TRIGGER_VALUE("triggerValue"),
    @XmlEnumValue("value_changed")
    VALUE_CHANGED("value_changed");
    private final String value;

    OutputOnlyAccessTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOnlyAccessTypes fromValue(String v) {
        for (OutputOnlyAccessTypes c: OutputOnlyAccessTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
