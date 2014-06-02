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
 * <p>Java-Klasse für componentNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="componentNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Core"/>
 *     &lt;enumeration value="CADGeometry"/>
 *     &lt;enumeration value="CubeMapTexturing"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="EnvironmentalEffects"/>
 *     &lt;enumeration value="EnvironmentalSensor"/>
 *     &lt;enumeration value="EventUtilities"/>
 *     &lt;enumeration value="Followers"/>
 *     &lt;enumeration value="Geometry2D"/>
 *     &lt;enumeration value="Geometry3D"/>
 *     &lt;enumeration value="Geospatial"/>
 *     &lt;enumeration value="Grouping"/>
 *     &lt;enumeration value="H-Anim"/>
 *     &lt;enumeration value="Interpolation"/>
 *     &lt;enumeration value="KeyDeviceSensor"/>
 *     &lt;enumeration value="Layering"/>
 *     &lt;enumeration value="Layout"/>
 *     &lt;enumeration value="Lighting"/>
 *     &lt;enumeration value="Navigation"/>
 *     &lt;enumeration value="Networking"/>
 *     &lt;enumeration value="NURBS"/>
 *     &lt;enumeration value="ParticleSystems"/>
 *     &lt;enumeration value="PickingSensor"/>
 *     &lt;enumeration value="PointingDeviceSensor"/>
 *     &lt;enumeration value="Rendering"/>
 *     &lt;enumeration value="RigidBodyPhysics"/>
 *     &lt;enumeration value="Scripting"/>
 *     &lt;enumeration value="Shaders"/>
 *     &lt;enumeration value="Shape"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Texturing"/>
 *     &lt;enumeration value="Texturing3D"/>
 *     &lt;enumeration value="Time"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "componentNames")
@XmlEnum
public enum ComponentNames {

    @XmlEnumValue("Core")
    CORE("Core"),
    @XmlEnumValue("CADGeometry")
    CAD_GEOMETRY("CADGeometry"),
    @XmlEnumValue("CubeMapTexturing")
    CUBE_MAP_TEXTURING("CubeMapTexturing"),
    DIS("DIS"),
    @XmlEnumValue("EnvironmentalEffects")
    ENVIRONMENTAL_EFFECTS("EnvironmentalEffects"),
    @XmlEnumValue("EnvironmentalSensor")
    ENVIRONMENTAL_SENSOR("EnvironmentalSensor"),
    @XmlEnumValue("EventUtilities")
    EVENT_UTILITIES("EventUtilities"),
    @XmlEnumValue("Followers")
    FOLLOWERS("Followers"),
    @XmlEnumValue("Geometry2D")
    GEOMETRY_2_D("Geometry2D"),
    @XmlEnumValue("Geometry3D")
    GEOMETRY_3_D("Geometry3D"),
    @XmlEnumValue("Geospatial")
    GEOSPATIAL("Geospatial"),
    @XmlEnumValue("Grouping")
    GROUPING("Grouping"),
    @XmlEnumValue("H-Anim")
    H_ANIM("H-Anim"),
    @XmlEnumValue("Interpolation")
    INTERPOLATION("Interpolation"),
    @XmlEnumValue("KeyDeviceSensor")
    KEY_DEVICE_SENSOR("KeyDeviceSensor"),
    @XmlEnumValue("Layering")
    LAYERING("Layering"),
    @XmlEnumValue("Layout")
    LAYOUT("Layout"),
    @XmlEnumValue("Lighting")
    LIGHTING("Lighting"),
    @XmlEnumValue("Navigation")
    NAVIGATION("Navigation"),
    @XmlEnumValue("Networking")
    NETWORKING("Networking"),
    NURBS("NURBS"),
    @XmlEnumValue("ParticleSystems")
    PARTICLE_SYSTEMS("ParticleSystems"),
    @XmlEnumValue("PickingSensor")
    PICKING_SENSOR("PickingSensor"),
    @XmlEnumValue("PointingDeviceSensor")
    POINTING_DEVICE_SENSOR("PointingDeviceSensor"),
    @XmlEnumValue("Rendering")
    RENDERING("Rendering"),
    @XmlEnumValue("RigidBodyPhysics")
    RIGID_BODY_PHYSICS("RigidBodyPhysics"),
    @XmlEnumValue("Scripting")
    SCRIPTING("Scripting"),
    @XmlEnumValue("Shaders")
    SHADERS("Shaders"),
    @XmlEnumValue("Shape")
    SHAPE("Shape"),
    @XmlEnumValue("Sound")
    SOUND("Sound"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Texturing")
    TEXTURING("Texturing"),
    @XmlEnumValue("Texturing3D")
    TEXTURING_3_D("Texturing3D"),
    @XmlEnumValue("Time")
    TIME("Time");
    private final String value;

    ComponentNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentNames fromValue(String v) {
        for (ComponentNames c: ComponentNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
