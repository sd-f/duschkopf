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
 * <p>Java-Klasse für initializeOnlyAccessTypes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="initializeOnlyAccessTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bboxCenter"/>
 *     &lt;enumeration value="bboxSize"/>
 *     &lt;enumeration value="beginCap"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="bottomRadius"/>
 *     &lt;enumeration value="category"/>
 *     &lt;enumeration value="ccw"/>
 *     &lt;enumeration value="child1Url"/>
 *     &lt;enumeration value="child2Url"/>
 *     &lt;enumeration value="child3Url"/>
 *     &lt;enumeration value="child4Url"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="closureType"/>
 *     &lt;enumeration value="colorKey"/>
 *     &lt;enumeration value="colorIndex"/>
 *     &lt;enumeration value="colorPerVertex"/>
 *     &lt;enumeration value="convex"/>
 *     &lt;enumeration value="coordIndex"/>
 *     &lt;enumeration value="country"/>
 *     &lt;enumeration value="creaseAngle"/>
 *     &lt;enumeration value="crossSection"/>
 *     &lt;enumeration value="directOutput"/>
 *     &lt;enumeration value="domain"/>
 *     &lt;enumeration value="duration"/>
 *     &lt;enumeration value="endCap"/>
 *     &lt;enumeration value="endAngle"/>
 *     &lt;enumeration value="extra"/>
 *     &lt;enumeration value="forceTransitions"/>
 *     &lt;enumeration value="generateMipMaps"/>
 *     &lt;enumeration value="geoGridOrigin"/>
 *     &lt;enumeration value="geometryType"/>
 *     &lt;enumeration value="geoSystem"/>
 *     &lt;enumeration value="height"/>
 *     &lt;enumeration value="horizontal"/>
 *     &lt;enumeration value="index"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="initialDestination"/>
 *     &lt;enumeration value="initialValue"/>
 *     &lt;enumeration value="innerRadius"/>
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="intersectionType"/>
 *     &lt;enumeration value="justify"/>
 *     &lt;enumeration value="kind"/>
 *     &lt;enumeration value="knot"/>
 *     &lt;enumeration value="language"/>
 *     &lt;enumeration value="leftToRight"/>
 *     &lt;enumeration value="lineSegments"/>
 *     &lt;enumeration value="mustEvaluate"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="normalIndex"/>
 *     &lt;enumeration value="normalPerVertex"/>
 *     &lt;enumeration value="numComponents"/>
 *     &lt;enumeration value="order"/>
 *     &lt;enumeration value="outerRadius"/>
 *     &lt;enumeration value="orientation"/>
 *     &lt;enumeration value="pointSize"/>
 *     &lt;enumeration value="radius"/>
 *     &lt;enumeration value="range"/>
 *     &lt;enumeration value="repeatR"/>
 *     &lt;enumeration value="repeatS"/>
 *     &lt;enumeration value="repeatT"/>
 *     &lt;enumeration value="rootUrl"/>
 *     &lt;enumeration value="rotateYUp"/>
 *     &lt;enumeration value="rtpHeaderExpected"/>
 *     &lt;enumeration value="side"/>
 *     &lt;enumeration value="size"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="sortOrder"/>
 *     &lt;enumeration value="spacing"/>
 *     &lt;enumeration value="spatialize"/>
 *     &lt;enumeration value="specific"/>
 *     &lt;enumeration value="speedFactor"/>
 *     &lt;enumeration value="spine"/>
 *     &lt;enumeration value="startAngle"/>
 *     &lt;enumeration value="style"/>
 *     &lt;enumeration value="subcategory"/>
 *     &lt;enumeration value="surfaceArea"/>
 *     &lt;enumeration value="texCoordIndex"/>
 *     &lt;enumeration value="texCoordKey"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="topToBottom"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="uClosed"/>
 *     &lt;enumeration value="uDimension"/>
 *     &lt;enumeration value="uKnot"/>
 *     &lt;enumeration value="uOrder"/>
 *     &lt;enumeration value="vClosed"/>
 *     &lt;enumeration value="vDimension"/>
 *     &lt;enumeration value="vKnot"/>
 *     &lt;enumeration value="vOrder"/>
 *     &lt;enumeration value="xDimension"/>
 *     &lt;enumeration value="xSpacing"/>
 *     &lt;enumeration value="zDimension"/>
 *     &lt;enumeration value="zSpacing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "initializeOnlyAccessTypes")
@XmlEnum
public enum InitializeOnlyAccessTypes {

    @XmlEnumValue("bboxCenter")
    BBOX_CENTER("bboxCenter"),
    @XmlEnumValue("bboxSize")
    BBOX_SIZE("bboxSize"),
    @XmlEnumValue("beginCap")
    BEGIN_CAP("beginCap"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("bottomRadius")
    BOTTOM_RADIUS("bottomRadius"),
    @XmlEnumValue("category")
    CATEGORY("category"),
    @XmlEnumValue("ccw")
    CCW("ccw"),
    @XmlEnumValue("child1Url")
    CHILD_1_URL("child1Url"),
    @XmlEnumValue("child2Url")
    CHILD_2_URL("child2Url"),
    @XmlEnumValue("child3Url")
    CHILD_3_URL("child3Url"),
    @XmlEnumValue("child4Url")
    CHILD_4_URL("child4Url"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("closureType")
    CLOSURE_TYPE("closureType"),
    @XmlEnumValue("colorKey")
    COLOR_KEY("colorKey"),
    @XmlEnumValue("colorIndex")
    COLOR_INDEX("colorIndex"),
    @XmlEnumValue("colorPerVertex")
    COLOR_PER_VERTEX("colorPerVertex"),
    @XmlEnumValue("convex")
    CONVEX("convex"),
    @XmlEnumValue("coordIndex")
    COORD_INDEX("coordIndex"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("creaseAngle")
    CREASE_ANGLE("creaseAngle"),
    @XmlEnumValue("crossSection")
    CROSS_SECTION("crossSection"),
    @XmlEnumValue("directOutput")
    DIRECT_OUTPUT("directOutput"),
    @XmlEnumValue("domain")
    DOMAIN("domain"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    @XmlEnumValue("endCap")
    END_CAP("endCap"),
    @XmlEnumValue("endAngle")
    END_ANGLE("endAngle"),
    @XmlEnumValue("extra")
    EXTRA("extra"),
    @XmlEnumValue("forceTransitions")
    FORCE_TRANSITIONS("forceTransitions"),
    @XmlEnumValue("generateMipMaps")
    GENERATE_MIP_MAPS("generateMipMaps"),
    @XmlEnumValue("geoGridOrigin")
    GEO_GRID_ORIGIN("geoGridOrigin"),
    @XmlEnumValue("geometryType")
    GEOMETRY_TYPE("geometryType"),
    @XmlEnumValue("geoSystem")
    GEO_SYSTEM("geoSystem"),
    @XmlEnumValue("height")
    HEIGHT("height"),
    @XmlEnumValue("horizontal")
    HORIZONTAL("horizontal"),
    @XmlEnumValue("index")
    INDEX("index"),
    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("initialDestination")
    INITIAL_DESTINATION("initialDestination"),
    @XmlEnumValue("initialValue")
    INITIAL_VALUE("initialValue"),
    @XmlEnumValue("innerRadius")
    INNER_RADIUS("innerRadius"),
    @XmlEnumValue("internal")
    INTERNAL("internal"),
    @XmlEnumValue("intersectionType")
    INTERSECTION_TYPE("intersectionType"),
    @XmlEnumValue("justify")
    JUSTIFY("justify"),
    @XmlEnumValue("kind")
    KIND("kind"),
    @XmlEnumValue("knot")
    KNOT("knot"),
    @XmlEnumValue("language")
    LANGUAGE("language"),
    @XmlEnumValue("leftToRight")
    LEFT_TO_RIGHT("leftToRight"),
    @XmlEnumValue("lineSegments")
    LINE_SEGMENTS("lineSegments"),
    @XmlEnumValue("mustEvaluate")
    MUST_EVALUATE("mustEvaluate"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("normalIndex")
    NORMAL_INDEX("normalIndex"),
    @XmlEnumValue("normalPerVertex")
    NORMAL_PER_VERTEX("normalPerVertex"),
    @XmlEnumValue("numComponents")
    NUM_COMPONENTS("numComponents"),
    @XmlEnumValue("order")
    ORDER("order"),
    @XmlEnumValue("outerRadius")
    OUTER_RADIUS("outerRadius"),
    @XmlEnumValue("orientation")
    ORIENTATION("orientation"),
    @XmlEnumValue("pointSize")
    POINT_SIZE("pointSize"),
    @XmlEnumValue("radius")
    RADIUS("radius"),
    @XmlEnumValue("range")
    RANGE("range"),
    @XmlEnumValue("repeatR")
    REPEAT_R("repeatR"),
    @XmlEnumValue("repeatS")
    REPEAT_S("repeatS"),
    @XmlEnumValue("repeatT")
    REPEAT_T("repeatT"),
    @XmlEnumValue("rootUrl")
    ROOT_URL("rootUrl"),
    @XmlEnumValue("rotateYUp")
    ROTATE_Y_UP("rotateYUp"),
    @XmlEnumValue("rtpHeaderExpected")
    RTP_HEADER_EXPECTED("rtpHeaderExpected"),
    @XmlEnumValue("side")
    SIDE("side"),
    @XmlEnumValue("size")
    SIZE("size"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder"),
    @XmlEnumValue("spacing")
    SPACING("spacing"),
    @XmlEnumValue("spatialize")
    SPATIALIZE("spatialize"),
    @XmlEnumValue("specific")
    SPECIFIC("specific"),
    @XmlEnumValue("speedFactor")
    SPEED_FACTOR("speedFactor"),
    @XmlEnumValue("spine")
    SPINE("spine"),
    @XmlEnumValue("startAngle")
    START_ANGLE("startAngle"),
    @XmlEnumValue("style")
    STYLE("style"),
    @XmlEnumValue("subcategory")
    SUBCATEGORY("subcategory"),
    @XmlEnumValue("surfaceArea")
    SURFACE_AREA("surfaceArea"),
    @XmlEnumValue("texCoordIndex")
    TEX_COORD_INDEX("texCoordIndex"),
    @XmlEnumValue("texCoordKey")
    TEX_COORD_KEY("texCoordKey"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("topToBottom")
    TOP_TO_BOTTOM("topToBottom"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("uClosed")
    U_CLOSED("uClosed"),
    @XmlEnumValue("uDimension")
    U_DIMENSION("uDimension"),
    @XmlEnumValue("uKnot")
    U_KNOT("uKnot"),
    @XmlEnumValue("uOrder")
    U_ORDER("uOrder"),
    @XmlEnumValue("vClosed")
    V_CLOSED("vClosed"),
    @XmlEnumValue("vDimension")
    V_DIMENSION("vDimension"),
    @XmlEnumValue("vKnot")
    V_KNOT("vKnot"),
    @XmlEnumValue("vOrder")
    V_ORDER("vOrder"),
    @XmlEnumValue("xDimension")
    X_DIMENSION("xDimension"),
    @XmlEnumValue("xSpacing")
    X_SPACING("xSpacing"),
    @XmlEnumValue("zDimension")
    Z_DIMENSION("zDimension"),
    @XmlEnumValue("zSpacing")
    Z_SPACING("zSpacing");
    private final String value;

    InitializeOnlyAccessTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeOnlyAccessTypes fromValue(String v) {
        for (InitializeOnlyAccessTypes c: InitializeOnlyAccessTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
