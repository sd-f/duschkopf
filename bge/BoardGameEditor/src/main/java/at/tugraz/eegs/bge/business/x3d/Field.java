//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}SceneGraphStructureNodeType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{}SceneGraphFragmentContentModel"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="accessType" use="required" type="{}accessTypeNames" />
 *       &lt;attribute name="type" use="required" type="{}fieldTypeName" />
 *       &lt;attribute name="value" type="{}SFString" />
 *       &lt;attribute name="appinfo" type="{}SFString" />
 *       &lt;attribute name="documentation" type="{}SFString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fillPropertiesOrLinePropertiesOrMaterial"
})
@XmlRootElement(name = "field")
public class Field
    extends SceneGraphStructureNodeType
{

    @XmlElements({
        @XmlElement(name = "FillProperties", type = FillProperties.class),
        @XmlElement(name = "LineProperties", type = LineProperties.class),
        @XmlElement(name = "Material", type = Material.class),
        @XmlElement(name = "TwoSidedMaterial", type = TwoSidedMaterial.class),
        @XmlElement(name = "ComposedShader", type = ComposedShader.class),
        @XmlElement(name = "PackagedShader", type = PackagedShader.class),
        @XmlElement(name = "ProgramShader", type = ProgramShader.class),
        @XmlElement(name = "ComposedCubeMapTexture", type = ComposedCubeMapTexture.class),
        @XmlElement(name = "ComposedTexture3D", type = ComposedTexture3D.class),
        @XmlElement(name = "ImageTexture", type = ImageTexture.class),
        @XmlElement(name = "ImageTexture3D", type = ImageTexture3D.class),
        @XmlElement(name = "MovieTexture", type = MovieTexture.class),
        @XmlElement(name = "MultiTexture", type = MultiTexture.class),
        @XmlElement(name = "PixelTexture", type = PixelTexture.class),
        @XmlElement(name = "PixelTexture3D", type = PixelTexture3D.class),
        @XmlElement(name = "GeneratedCubeMapTexture", type = GeneratedCubeMapTexture.class),
        @XmlElement(name = "ImageCubeMapTexture", type = ImageCubeMapTexture.class),
        @XmlElement(name = "MultiTextureTransform", type = MultiTextureTransform.class),
        @XmlElement(name = "TextureTransform", type = TextureTransform.class),
        @XmlElement(name = "TextureTransform3D", type = TextureTransform3D.class),
        @XmlElement(name = "TextureTransformMatrix3D", type = TextureTransformMatrix3D.class),
        @XmlElement(name = "MetadataDouble", type = MetadataDouble.class),
        @XmlElement(name = "MetadataFloat", type = MetadataFloat.class),
        @XmlElement(name = "MetadataInteger", type = MetadataInteger.class),
        @XmlElement(name = "MetadataSet", type = MetadataSet.class),
        @XmlElement(name = "MetadataString", type = MetadataString.class),
        @XmlElement(name = "Background", type = Background.class),
        @XmlElement(name = "ColorInterpolator", type = ColorInterpolator.class),
        @XmlElement(name = "CoordinateInterpolator", type = CoordinateInterpolator.class),
        @XmlElement(name = "DirectionalLight", type = DirectionalLight.class),
        @XmlElement(name = "Group", type = Group.class),
        @XmlElement(name = "NavigationInfo", type = NavigationInfo.class),
        @XmlElement(name = "NormalInterpolator", type = NormalInterpolator.class),
        @XmlElement(name = "OrientationInterpolator", type = OrientationInterpolator.class),
        @XmlElement(name = "PositionInterpolator", type = PositionInterpolator.class),
        @XmlElement(name = "ScalarInterpolator", type = ScalarInterpolator.class),
        @XmlElement(name = "Shape", type = Shape.class),
        @XmlElement(name = "TimeSensor", type = TimeSensor.class),
        @XmlElement(name = "Transform", type = Transform.class),
        @XmlElement(name = "Viewpoint", type = Viewpoint.class),
        @XmlElement(name = "WorldInfo", type = WorldInfo.class),
        @XmlElement(name = "Anchor", type = Anchor.class),
        @XmlElement(name = "BooleanFilter", type = BooleanFilter.class),
        @XmlElement(name = "BooleanSequencer", type = BooleanSequencer.class),
        @XmlElement(name = "BooleanToggle", type = BooleanToggle.class),
        @XmlElement(name = "BooleanTrigger", type = BooleanTrigger.class),
        @XmlElement(name = "CylinderSensor", type = CylinderSensor.class),
        @XmlElement(name = "Inline", type = Inline.class),
        @XmlElement(name = "IntegerSequencer", type = IntegerSequencer.class),
        @XmlElement(name = "IntegerTrigger", type = IntegerTrigger.class),
        @XmlElement(name = "KeySensor", type = KeySensor.class),
        @XmlElement(name = "PlaneSensor", type = PlaneSensor.class),
        @XmlElement(name = "PointLight", type = PointLight.class),
        @XmlElement(name = "ProximitySensor", type = ProximitySensor.class),
        @XmlElement(name = "SphereSensor", type = SphereSensor.class),
        @XmlElement(name = "SpotLight", type = SpotLight.class),
        @XmlElement(name = "StringSensor", type = StringSensor.class),
        @XmlElement(name = "Switch", type = Switch.class),
        @XmlElement(name = "TimeTrigger", type = TimeTrigger.class),
        @XmlElement(name = "TouchSensor", type = TouchSensor.class),
        @XmlElement(name = "AudioClip", type = AudioClip.class),
        @XmlElement(name = "Billboard", type = Billboard.class),
        @XmlElement(name = "Collision", type = Collision.class),
        @XmlElement(name = "Fog", type = Fog.class),
        @XmlElement(name = "LoadSensor", type = LoadSensor.class),
        @XmlElement(name = "LocalFog", type = LocalFog.class),
        @XmlElement(name = "LOD", type = LOD.class),
        @XmlElement(name = "Script", type = Script.class),
        @XmlElement(name = "Sound", type = Sound.class),
        @XmlElement(name = "VisibilitySensor", type = VisibilitySensor.class),
        @XmlElement(name = "CoordinateInterpolator2D", type = CoordinateInterpolator2D.class),
        @XmlElement(name = "PositionInterpolator2D", type = PositionInterpolator2D.class),
        @XmlElement(name = "ClipPlane", type = ClipPlane.class),
        @XmlElement(name = "EaseInEaseOut", type = EaseInEaseOut.class),
        @XmlElement(name = "LinePickSensor", type = LinePickSensor.class),
        @XmlElement(name = "PickableGroup", type = PickableGroup.class),
        @XmlElement(name = "PointPickSensor", type = PointPickSensor.class),
        @XmlElement(name = "PrimitivePickSensor", type = PrimitivePickSensor.class),
        @XmlElement(name = "VolumePickSensor", type = VolumePickSensor.class),
        @XmlElement(name = "SplinePositionInterpolator", type = SplinePositionInterpolator.class),
        @XmlElement(name = "SplinePositionInterpolator2D", type = SplinePositionInterpolator2D.class),
        @XmlElement(name = "SplineScalarInterpolator", type = SplineScalarInterpolator.class),
        @XmlElement(name = "SquadOrientationInterpolator", type = SquadOrientationInterpolator.class),
        @XmlElement(name = "StaticGroup", type = StaticGroup.class),
        @XmlElement(name = "CADAssembly", type = CADAssembly.class),
        @XmlElement(name = "CADLayer", type = CADLayer.class),
        @XmlElement(name = "CADPart", type = CADPart.class),
        @XmlElement(name = "OrthoViewpoint", type = OrthoViewpoint.class),
        @XmlElement(name = "ViewpointGroup", type = ViewpointGroup.class),
        @XmlElement(name = "ColorDamper", type = ColorDamper.class),
        @XmlElement(name = "CoordinateDamper", type = CoordinateDamper.class),
        @XmlElement(name = "OrientationChaser", type = OrientationChaser.class),
        @XmlElement(name = "OrientationDamper", type = OrientationDamper.class),
        @XmlElement(name = "PositionChaser", type = PositionChaser.class),
        @XmlElement(name = "PositionChaser2D", type = PositionChaser2D.class),
        @XmlElement(name = "PositionDamper", type = PositionDamper.class),
        @XmlElement(name = "PositionDamper2D", type = PositionDamper2D.class),
        @XmlElement(name = "ScalarChaser", type = ScalarChaser.class),
        @XmlElement(name = "TexCoordDamper2D", type = TexCoordDamper2D.class),
        @XmlElement(name = "TextureBackground", type = TextureBackground.class),
        @XmlElement(name = "CollidableShape", type = CollidableShape.class),
        @XmlElement(name = "CollisionSensor", type = CollisionSensor.class),
        @XmlElement(name = "RigidBodyCollection", type = RigidBodyCollection.class),
        @XmlElement(name = "LayerSet", type = LayerSet.class),
        @XmlElement(name = "ParticleSystem", type = ParticleSystem.class),
        @XmlElement(name = "TransformSensor", type = TransformSensor.class),
        @XmlElement(name = "EspduTransform", type = EspduTransform.class),
        @XmlElement(name = "ReceiverPdu", type = ReceiverPdu.class),
        @XmlElement(name = "SignalPdu", type = SignalPdu.class),
        @XmlElement(name = "TransmitterPdu", type = TransmitterPdu.class),
        @XmlElement(name = "DISEntityManager", type = DISEntityManager.class),
        @XmlElement(name = "GeoLocation", type = GeoLocation.class),
        @XmlElement(name = "GeoLOD", type = GeoLOD.class),
        @XmlElement(name = "GeoMetadata", type = GeoMetadata.class),
        @XmlElement(name = "GeoOrigin", type = GeoOrigin.class),
        @XmlElement(name = "GeoPositionInterpolator", type = GeoPositionInterpolator.class),
        @XmlElement(name = "GeoProximitySensor", type = GeoProximitySensor.class),
        @XmlElement(name = "GeoTouchSensor", type = GeoTouchSensor.class),
        @XmlElement(name = "GeoViewpoint", type = GeoViewpoint.class),
        @XmlElement(name = "GeoTransform", type = GeoTransform.class),
        @XmlElement(name = "HAnimHumanoid", type = HAnimHumanoid.class),
        @XmlElement(name = "HAnimJoint", type = HAnimJoint.class),
        @XmlElement(name = "HAnimSegment", type = HAnimSegment.class),
        @XmlElement(name = "HAnimSite", type = HAnimSite.class),
        @XmlElement(name = "NurbsOrientationInterpolator", type = NurbsOrientationInterpolator.class),
        @XmlElement(name = "NurbsPositionInterpolator", type = NurbsPositionInterpolator.class),
        @XmlElement(name = "NurbsSurfaceInterpolator", type = NurbsSurfaceInterpolator.class),
        @XmlElement(name = "NurbsSet", type = NurbsSet.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class),
        @XmlElement(name = "Box", type = Box.class),
        @XmlElement(name = "Cone", type = Cone.class),
        @XmlElement(name = "Cylinder", type = Cylinder.class),
        @XmlElement(name = "IndexedFaceSet", type = IndexedFaceSet.class),
        @XmlElement(name = "IndexedLineSet", type = IndexedLineSet.class),
        @XmlElement(name = "IndexedTriangleFanSet", type = IndexedTriangleFanSet.class),
        @XmlElement(name = "IndexedTriangleSet", type = IndexedTriangleSet.class),
        @XmlElement(name = "IndexedTriangleStripSet", type = IndexedTriangleStripSet.class),
        @XmlElement(name = "LineSet", type = LineSet.class),
        @XmlElement(name = "PointSet", type = PointSet.class),
        @XmlElement(name = "Sphere", type = Sphere.class),
        @XmlElement(name = "TriangleFanSet", type = TriangleFanSet.class),
        @XmlElement(name = "TriangleSet", type = TriangleSet.class),
        @XmlElement(name = "TriangleStripSet", type = TriangleStripSet.class),
        @XmlElement(name = "ElevationGrid", type = ElevationGrid.class),
        @XmlElement(name = "Polyline2D", type = Polyline2D.class),
        @XmlElement(name = "Polypoint2D", type = Polypoint2D.class),
        @XmlElement(name = "Rectangle2D", type = Rectangle2D.class),
        @XmlElement(name = "TriangleSet2D", type = TriangleSet2D.class),
        @XmlElement(name = "Extrusion", type = Extrusion.class),
        @XmlElement(name = "Text", type = Text.class),
        @XmlElement(name = "Arc2D", type = Arc2D.class),
        @XmlElement(name = "ArcClose2D", type = ArcClose2D.class),
        @XmlElement(name = "Circle2D", type = Circle2D.class),
        @XmlElement(name = "Disk2D", type = Disk2D.class),
        @XmlElement(name = "QuadSet", type = QuadSet.class),
        @XmlElement(name = "IndexedQuadSet", type = IndexedQuadSet.class),
        @XmlElement(name = "GeoElevationGrid", type = GeoElevationGrid.class),
        @XmlElement(name = "NurbsCurve", type = NurbsCurve.class),
        @XmlElement(name = "NurbsCurve2D", type = NurbsCurve2D.class),
        @XmlElement(name = "NurbsPatchSurface", type = NurbsPatchSurface.class),
        @XmlElement(name = "NurbsSweptSurface", type = NurbsSweptSurface.class),
        @XmlElement(name = "NurbsSwungSurface", type = NurbsSwungSurface.class),
        @XmlElement(name = "NurbsTrimmedSurface", type = NurbsTrimmedSurface.class),
        @XmlElement(name = "Color", type = Color.class),
        @XmlElement(name = "ColorRGBA", type = ColorRGBA.class),
        @XmlElement(name = "Coordinate", type = Coordinate.class),
        @XmlElement(name = "CoordinateDouble", type = CoordinateDouble.class),
        @XmlElement(name = "FontStyle", type = FontStyle.class),
        @XmlElement(name = "ScreenFontStyle", type = ScreenFontStyle.class),
        @XmlElement(name = "GeoCoordinate", type = GeoCoordinate.class),
        @XmlElement(name = "Normal", type = Normal.class),
        @XmlElement(name = "TextureCoordinate", type = TextureCoordinate.class),
        @XmlElement(name = "HAnimDisplacer", type = HAnimDisplacer.class),
        @XmlElement(name = "Contour2D", type = Contour2D.class),
        @XmlElement(name = "ContourPolyline2D", type = ContourPolyline2D.class),
        @XmlElement(name = "NurbsTextureCoordinate", type = NurbsTextureCoordinate.class),
        @XmlElement(name = "Layer", type = Layer.class),
        @XmlElement(name = "LayoutLayer", type = LayoutLayer.class),
        @XmlElement(name = "Viewport", type = Viewport.class),
        @XmlElement(name = "BallJoint", type = BallJoint.class),
        @XmlElement(name = "CollidableOffset", type = CollidableOffset.class),
        @XmlElement(name = "CollisionCollection", type = CollisionCollection.class),
        @XmlElement(name = "CollisionSpace", type = CollisionSpace.class),
        @XmlElement(name = "Contact", type = Contact.class),
        @XmlElement(name = "DoubleAxisHingeJoint", type = DoubleAxisHingeJoint.class),
        @XmlElement(name = "MotorJoint", type = MotorJoint.class),
        @XmlElement(name = "RigidBody", type = RigidBody.class),
        @XmlElement(name = "SingleAxisHingeJoint", type = SingleAxisHingeJoint.class),
        @XmlElement(name = "SliderJoint", type = SliderJoint.class),
        @XmlElement(name = "UniversalJoint", type = UniversalJoint.class)
    })
    protected List<Object> fillPropertiesOrLinePropertiesOrMaterial;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlAttribute(name = "accessType", required = true)
    protected AccessTypeNames accessType;
    @XmlAttribute(name = "type", required = true)
    protected FieldTypeName type;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "appinfo")
    protected String appinfo;
    @XmlAttribute(name = "documentation")
    protected String documentation;

    /**
     * Gets the value of the fillPropertiesOrLinePropertiesOrMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fillPropertiesOrLinePropertiesOrMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFillPropertiesOrLinePropertiesOrMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillProperties }
     * {@link LineProperties }
     * {@link Material }
     * {@link TwoSidedMaterial }
     * {@link ComposedShader }
     * {@link PackagedShader }
     * {@link ProgramShader }
     * {@link ComposedCubeMapTexture }
     * {@link ComposedTexture3D }
     * {@link ImageTexture }
     * {@link ImageTexture3D }
     * {@link MovieTexture }
     * {@link MultiTexture }
     * {@link PixelTexture }
     * {@link PixelTexture3D }
     * {@link GeneratedCubeMapTexture }
     * {@link ImageCubeMapTexture }
     * {@link MultiTextureTransform }
     * {@link TextureTransform }
     * {@link TextureTransform3D }
     * {@link TextureTransformMatrix3D }
     * {@link MetadataDouble }
     * {@link MetadataFloat }
     * {@link MetadataInteger }
     * {@link MetadataSet }
     * {@link MetadataString }
     * {@link Background }
     * {@link ColorInterpolator }
     * {@link CoordinateInterpolator }
     * {@link DirectionalLight }
     * {@link Group }
     * {@link NavigationInfo }
     * {@link NormalInterpolator }
     * {@link OrientationInterpolator }
     * {@link PositionInterpolator }
     * {@link ScalarInterpolator }
     * {@link Shape }
     * {@link TimeSensor }
     * {@link Transform }
     * {@link Viewpoint }
     * {@link WorldInfo }
     * {@link Anchor }
     * {@link BooleanFilter }
     * {@link BooleanSequencer }
     * {@link BooleanToggle }
     * {@link BooleanTrigger }
     * {@link CylinderSensor }
     * {@link Inline }
     * {@link IntegerSequencer }
     * {@link IntegerTrigger }
     * {@link KeySensor }
     * {@link PlaneSensor }
     * {@link PointLight }
     * {@link ProximitySensor }
     * {@link SphereSensor }
     * {@link SpotLight }
     * {@link StringSensor }
     * {@link Switch }
     * {@link TimeTrigger }
     * {@link TouchSensor }
     * {@link AudioClip }
     * {@link Billboard }
     * {@link Collision }
     * {@link Fog }
     * {@link LoadSensor }
     * {@link LocalFog }
     * {@link LOD }
     * {@link Script }
     * {@link Sound }
     * {@link VisibilitySensor }
     * {@link CoordinateInterpolator2D }
     * {@link PositionInterpolator2D }
     * {@link ClipPlane }
     * {@link EaseInEaseOut }
     * {@link LinePickSensor }
     * {@link PickableGroup }
     * {@link PointPickSensor }
     * {@link PrimitivePickSensor }
     * {@link VolumePickSensor }
     * {@link SplinePositionInterpolator }
     * {@link SplinePositionInterpolator2D }
     * {@link SplineScalarInterpolator }
     * {@link SquadOrientationInterpolator }
     * {@link StaticGroup }
     * {@link CADAssembly }
     * {@link CADLayer }
     * {@link CADPart }
     * {@link OrthoViewpoint }
     * {@link ViewpointGroup }
     * {@link ColorDamper }
     * {@link CoordinateDamper }
     * {@link OrientationChaser }
     * {@link OrientationDamper }
     * {@link PositionChaser }
     * {@link PositionChaser2D }
     * {@link PositionDamper }
     * {@link PositionDamper2D }
     * {@link ScalarChaser }
     * {@link TexCoordDamper2D }
     * {@link TextureBackground }
     * {@link CollidableShape }
     * {@link CollisionSensor }
     * {@link RigidBodyCollection }
     * {@link LayerSet }
     * {@link ParticleSystem }
     * {@link TransformSensor }
     * {@link EspduTransform }
     * {@link ReceiverPdu }
     * {@link SignalPdu }
     * {@link TransmitterPdu }
     * {@link DISEntityManager }
     * {@link GeoLocation }
     * {@link GeoLOD }
     * {@link GeoMetadata }
     * {@link GeoOrigin }
     * {@link GeoPositionInterpolator }
     * {@link GeoProximitySensor }
     * {@link GeoTouchSensor }
     * {@link GeoViewpoint }
     * {@link GeoTransform }
     * {@link HAnimHumanoid }
     * {@link HAnimJoint }
     * {@link HAnimSegment }
     * {@link HAnimSite }
     * {@link NurbsOrientationInterpolator }
     * {@link NurbsPositionInterpolator }
     * {@link NurbsSurfaceInterpolator }
     * {@link NurbsSet }
     * {@link ProtoInstance }
     * {@link Box }
     * {@link Cone }
     * {@link Cylinder }
     * {@link IndexedFaceSet }
     * {@link IndexedLineSet }
     * {@link IndexedTriangleFanSet }
     * {@link IndexedTriangleSet }
     * {@link IndexedTriangleStripSet }
     * {@link LineSet }
     * {@link PointSet }
     * {@link Sphere }
     * {@link TriangleFanSet }
     * {@link TriangleSet }
     * {@link TriangleStripSet }
     * {@link ElevationGrid }
     * {@link Polyline2D }
     * {@link Polypoint2D }
     * {@link Rectangle2D }
     * {@link TriangleSet2D }
     * {@link Extrusion }
     * {@link Text }
     * {@link Arc2D }
     * {@link ArcClose2D }
     * {@link Circle2D }
     * {@link Disk2D }
     * {@link QuadSet }
     * {@link IndexedQuadSet }
     * {@link GeoElevationGrid }
     * {@link NurbsCurve }
     * {@link NurbsCurve2D }
     * {@link NurbsPatchSurface }
     * {@link NurbsSweptSurface }
     * {@link NurbsSwungSurface }
     * {@link NurbsTrimmedSurface }
     * {@link Color }
     * {@link ColorRGBA }
     * {@link Coordinate }
     * {@link CoordinateDouble }
     * {@link FontStyle }
     * {@link ScreenFontStyle }
     * {@link GeoCoordinate }
     * {@link Normal }
     * {@link TextureCoordinate }
     * {@link HAnimDisplacer }
     * {@link Contour2D }
     * {@link ContourPolyline2D }
     * {@link NurbsTextureCoordinate }
     * {@link Layer }
     * {@link LayoutLayer }
     * {@link Viewport }
     * {@link BallJoint }
     * {@link CollidableOffset }
     * {@link CollisionCollection }
     * {@link CollisionSpace }
     * {@link Contact }
     * {@link DoubleAxisHingeJoint }
     * {@link MotorJoint }
     * {@link RigidBody }
     * {@link SingleAxisHingeJoint }
     * {@link SliderJoint }
     * {@link UniversalJoint }
     * 
     * 
     */
    public List<Object> getFillPropertiesOrLinePropertiesOrMaterial() {
        if (fillPropertiesOrLinePropertiesOrMaterial == null) {
            fillPropertiesOrLinePropertiesOrMaterial = new ArrayList<Object>();
        }
        return this.fillPropertiesOrLinePropertiesOrMaterial;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der accessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessTypeNames }
     *     
     */
    public AccessTypeNames getAccessType() {
        return accessType;
    }

    /**
     * Legt den Wert der accessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessTypeNames }
     *     
     */
    public void setAccessType(AccessTypeNames value) {
        this.accessType = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeName }
     *     
     */
    public FieldTypeName getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeName }
     *     
     */
    public void setType(FieldTypeName value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der appinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppinfo() {
        return appinfo;
    }

    /**
     * Legt den Wert der appinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppinfo(String value) {
        this.appinfo = value;
    }

    /**
     * Ruft den Wert der documentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

}
