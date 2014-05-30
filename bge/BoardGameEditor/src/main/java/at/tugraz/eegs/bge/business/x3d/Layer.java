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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DLayerNode">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}Viewport"/>
 *           &lt;group ref="{}ChildContentModel" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{}ChildContentModel"/>
 *           &lt;element ref="{}Viewport" minOccurs="0"/>
 *           &lt;group ref="{}ChildContentModel" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rest"
})
@XmlRootElement(name = "Layer")
public class Layer
    extends X3DLayerNode
{

    @XmlElementRefs({
        @XmlElementRef(name = "PositionChaser", type = PositionChaser.class, required = false),
        @XmlElementRef(name = "NurbsSurfaceInterpolator", type = NurbsSurfaceInterpolator.class, required = false),
        @XmlElementRef(name = "LoadSensor", type = LoadSensor.class, required = false),
        @XmlElementRef(name = "VisibilitySensor", type = VisibilitySensor.class, required = false),
        @XmlElementRef(name = "DISEntityManager", type = DISEntityManager.class, required = false),
        @XmlElementRef(name = "StaticGroup", type = StaticGroup.class, required = false),
        @XmlElementRef(name = "BooleanToggle", type = BooleanToggle.class, required = false),
        @XmlElementRef(name = "PlaneSensor", type = PlaneSensor.class, required = false),
        @XmlElementRef(name = "Inline", type = Inline.class, required = false),
        @XmlElementRef(name = "OrientationDamper", type = OrientationDamper.class, required = false),
        @XmlElementRef(name = "BooleanSequencer", type = BooleanSequencer.class, required = false),
        @XmlElementRef(name = "CylinderSensor", type = CylinderSensor.class, required = false),
        @XmlElementRef(name = "GeoMetadata", type = GeoMetadata.class, required = false),
        @XmlElementRef(name = "GeoPositionInterpolator", type = GeoPositionInterpolator.class, required = false),
        @XmlElementRef(name = "EaseInEaseOut", type = EaseInEaseOut.class, required = false),
        @XmlElementRef(name = "BooleanTrigger", type = BooleanTrigger.class, required = false),
        @XmlElementRef(name = "RigidBodyCollection", type = RigidBodyCollection.class, required = false),
        @XmlElementRef(name = "HAnimSite", type = HAnimSite.class, required = false),
        @XmlElementRef(name = "Shape", type = Shape.class, required = false),
        @XmlElementRef(name = "NurbsOrientationInterpolator", type = NurbsOrientationInterpolator.class, required = false),
        @XmlElementRef(name = "Viewpoint", type = Viewpoint.class, required = false),
        @XmlElementRef(name = "LinePickSensor", type = LinePickSensor.class, required = false),
        @XmlElementRef(name = "NurbsSet", type = NurbsSet.class, required = false),
        @XmlElementRef(name = "ScalarInterpolator", type = ScalarInterpolator.class, required = false),
        @XmlElementRef(name = "StringSensor", type = StringSensor.class, required = false),
        @XmlElementRef(name = "OrientationChaser", type = OrientationChaser.class, required = false),
        @XmlElementRef(name = "Anchor", type = Anchor.class, required = false),
        @XmlElementRef(name = "PointPickSensor", type = PointPickSensor.class, required = false),
        @XmlElementRef(name = "PositionDamper2D", type = PositionDamper2D.class, required = false),
        @XmlElementRef(name = "ProtoInstance", type = ProtoInstance.class, required = false),
        @XmlElementRef(name = "PointLight", type = PointLight.class, required = false),
        @XmlElementRef(name = "SplineScalarInterpolator", type = SplineScalarInterpolator.class, required = false),
        @XmlElementRef(name = "SquadOrientationInterpolator", type = SquadOrientationInterpolator.class, required = false),
        @XmlElementRef(name = "ScalarChaser", type = ScalarChaser.class, required = false),
        @XmlElementRef(name = "CoordinateInterpolator", type = CoordinateInterpolator.class, required = false),
        @XmlElementRef(name = "GeoLocation", type = GeoLocation.class, required = false),
        @XmlElementRef(name = "Transform", type = Transform.class, required = false),
        @XmlElementRef(name = "IntegerSequencer", type = IntegerSequencer.class, required = false),
        @XmlElementRef(name = "SplinePositionInterpolator2D", type = SplinePositionInterpolator2D.class, required = false),
        @XmlElementRef(name = "PositionInterpolator", type = PositionInterpolator.class, required = false),
        @XmlElementRef(name = "TimeSensor", type = TimeSensor.class, required = false),
        @XmlElementRef(name = "CoordinateDamper", type = CoordinateDamper.class, required = false),
        @XmlElementRef(name = "ClipPlane", type = ClipPlane.class, required = false),
        @XmlElementRef(name = "Group", type = Group.class, required = false),
        @XmlElementRef(name = "Viewport", type = Viewport.class, required = false),
        @XmlElementRef(name = "GeoLOD", type = GeoLOD.class, required = false),
        @XmlElementRef(name = "DirectionalLight", type = DirectionalLight.class, required = false),
        @XmlElementRef(name = "IntegerTrigger", type = IntegerTrigger.class, required = false),
        @XmlElementRef(name = "LayerSet", type = LayerSet.class, required = false),
        @XmlElementRef(name = "Fog", type = Fog.class, required = false),
        @XmlElementRef(name = "ProximitySensor", type = ProximitySensor.class, required = false),
        @XmlElementRef(name = "SignalPdu", type = SignalPdu.class, required = false),
        @XmlElementRef(name = "GeoTouchSensor", type = GeoTouchSensor.class, required = false),
        @XmlElementRef(name = "TouchSensor", type = TouchSensor.class, required = false),
        @XmlElementRef(name = "CADLayer", type = CADLayer.class, required = false),
        @XmlElementRef(name = "CollisionSensor", type = CollisionSensor.class, required = false),
        @XmlElementRef(name = "GeoProximitySensor", type = GeoProximitySensor.class, required = false),
        @XmlElementRef(name = "NurbsPositionInterpolator", type = NurbsPositionInterpolator.class, required = false),
        @XmlElementRef(name = "ColorInterpolator", type = ColorInterpolator.class, required = false),
        @XmlElementRef(name = "PrimitivePickSensor", type = PrimitivePickSensor.class, required = false),
        @XmlElementRef(name = "ColorDamper", type = ColorDamper.class, required = false),
        @XmlElementRef(name = "CADPart", type = CADPart.class, required = false),
        @XmlElementRef(name = "LOD", type = LOD.class, required = false),
        @XmlElementRef(name = "LocalFog", type = LocalFog.class, required = false),
        @XmlElementRef(name = "WorldInfo", type = WorldInfo.class, required = false),
        @XmlElementRef(name = "OrthoViewpoint", type = OrthoViewpoint.class, required = false),
        @XmlElementRef(name = "ViewpointGroup", type = ViewpointGroup.class, required = false),
        @XmlElementRef(name = "PickableGroup", type = PickableGroup.class, required = false),
        @XmlElementRef(name = "SpotLight", type = SpotLight.class, required = false),
        @XmlElementRef(name = "Script", type = Script.class, required = false),
        @XmlElementRef(name = "KeySensor", type = KeySensor.class, required = false),
        @XmlElementRef(name = "Billboard", type = Billboard.class, required = false),
        @XmlElementRef(name = "Switch", type = Switch.class, required = false),
        @XmlElementRef(name = "Collision", type = Collision.class, required = false),
        @XmlElementRef(name = "GeoViewpoint", type = GeoViewpoint.class, required = false),
        @XmlElementRef(name = "ReceiverPdu", type = ReceiverPdu.class, required = false),
        @XmlElementRef(name = "CoordinateInterpolator2D", type = CoordinateInterpolator2D.class, required = false),
        @XmlElementRef(name = "HAnimSegment", type = HAnimSegment.class, required = false),
        @XmlElementRef(name = "Background", type = Background.class, required = false),
        @XmlElementRef(name = "NavigationInfo", type = NavigationInfo.class, required = false),
        @XmlElementRef(name = "TexCoordDamper2D", type = TexCoordDamper2D.class, required = false),
        @XmlElementRef(name = "AudioClip", type = AudioClip.class, required = false),
        @XmlElementRef(name = "HAnimHumanoid", type = HAnimHumanoid.class, required = false),
        @XmlElementRef(name = "ParticleSystem", type = ParticleSystem.class, required = false),
        @XmlElementRef(name = "OrientationInterpolator", type = OrientationInterpolator.class, required = false),
        @XmlElementRef(name = "Sound", type = Sound.class, required = false),
        @XmlElementRef(name = "TextureBackground", type = TextureBackground.class, required = false),
        @XmlElementRef(name = "TransmitterPdu", type = TransmitterPdu.class, required = false),
        @XmlElementRef(name = "GeoOrigin", type = GeoOrigin.class, required = false),
        @XmlElementRef(name = "CADAssembly", type = CADAssembly.class, required = false),
        @XmlElementRef(name = "EspduTransform", type = EspduTransform.class, required = false),
        @XmlElementRef(name = "GeoTransform", type = GeoTransform.class, required = false),
        @XmlElementRef(name = "PositionChaser2D", type = PositionChaser2D.class, required = false),
        @XmlElementRef(name = "CollidableShape", type = CollidableShape.class, required = false),
        @XmlElementRef(name = "TimeTrigger", type = TimeTrigger.class, required = false),
        @XmlElementRef(name = "SphereSensor", type = SphereSensor.class, required = false),
        @XmlElementRef(name = "PositionDamper", type = PositionDamper.class, required = false),
        @XmlElementRef(name = "NormalInterpolator", type = NormalInterpolator.class, required = false),
        @XmlElementRef(name = "TransformSensor", type = TransformSensor.class, required = false),
        @XmlElementRef(name = "PositionInterpolator2D", type = PositionInterpolator2D.class, required = false),
        @XmlElementRef(name = "BooleanFilter", type = BooleanFilter.class, required = false),
        @XmlElementRef(name = "SplinePositionInterpolator", type = SplinePositionInterpolator.class, required = false),
        @XmlElementRef(name = "HAnimJoint", type = HAnimJoint.class, required = false),
        @XmlElementRef(name = "VolumePickSensor", type = VolumePickSensor.class, required = false)
    })
    protected List<Object> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Background" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2447 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * Zeile 2447 von file:/D:/dev/workspace/duschkopf/bge/BoardGameEditor/src/main/xsd/x3d-3.2.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionChaser }
     * {@link NurbsSurfaceInterpolator }
     * {@link LoadSensor }
     * {@link VisibilitySensor }
     * {@link DISEntityManager }
     * {@link StaticGroup }
     * {@link BooleanToggle }
     * {@link PlaneSensor }
     * {@link Inline }
     * {@link OrientationDamper }
     * {@link BooleanSequencer }
     * {@link CylinderSensor }
     * {@link GeoMetadata }
     * {@link GeoPositionInterpolator }
     * {@link EaseInEaseOut }
     * {@link BooleanTrigger }
     * {@link RigidBodyCollection }
     * {@link HAnimSite }
     * {@link Shape }
     * {@link NurbsOrientationInterpolator }
     * {@link Viewpoint }
     * {@link LinePickSensor }
     * {@link NurbsSet }
     * {@link ScalarInterpolator }
     * {@link StringSensor }
     * {@link OrientationChaser }
     * {@link Anchor }
     * {@link PointPickSensor }
     * {@link PositionDamper2D }
     * {@link ProtoInstance }
     * {@link PointLight }
     * {@link SplineScalarInterpolator }
     * {@link SquadOrientationInterpolator }
     * {@link ScalarChaser }
     * {@link CoordinateInterpolator }
     * {@link GeoLocation }
     * {@link Transform }
     * {@link IntegerSequencer }
     * {@link SplinePositionInterpolator2D }
     * {@link PositionInterpolator }
     * {@link TimeSensor }
     * {@link CoordinateDamper }
     * {@link ClipPlane }
     * {@link Group }
     * {@link Viewport }
     * {@link GeoLOD }
     * {@link DirectionalLight }
     * {@link IntegerTrigger }
     * {@link LayerSet }
     * {@link Fog }
     * {@link ProximitySensor }
     * {@link SignalPdu }
     * {@link GeoTouchSensor }
     * {@link TouchSensor }
     * {@link CADLayer }
     * {@link CollisionSensor }
     * {@link GeoProximitySensor }
     * {@link NurbsPositionInterpolator }
     * {@link ColorInterpolator }
     * {@link PrimitivePickSensor }
     * {@link ColorDamper }
     * {@link CADPart }
     * {@link LOD }
     * {@link LocalFog }
     * {@link WorldInfo }
     * {@link OrthoViewpoint }
     * {@link ViewpointGroup }
     * {@link PickableGroup }
     * {@link SpotLight }
     * {@link Script }
     * {@link KeySensor }
     * {@link Billboard }
     * {@link Switch }
     * {@link Collision }
     * {@link GeoViewpoint }
     * {@link ReceiverPdu }
     * {@link CoordinateInterpolator2D }
     * {@link HAnimSegment }
     * {@link Background }
     * {@link NavigationInfo }
     * {@link TexCoordDamper2D }
     * {@link AudioClip }
     * {@link HAnimHumanoid }
     * {@link ParticleSystem }
     * {@link OrientationInterpolator }
     * {@link Sound }
     * {@link TextureBackground }
     * {@link TransmitterPdu }
     * {@link GeoOrigin }
     * {@link CADAssembly }
     * {@link EspduTransform }
     * {@link GeoTransform }
     * {@link PositionChaser2D }
     * {@link CollidableShape }
     * {@link TimeTrigger }
     * {@link PositionDamper }
     * {@link SphereSensor }
     * {@link NormalInterpolator }
     * {@link TransformSensor }
     * {@link PositionInterpolator2D }
     * {@link BooleanFilter }
     * {@link SplinePositionInterpolator }
     * {@link HAnimJoint }
     * {@link VolumePickSensor }
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

}
