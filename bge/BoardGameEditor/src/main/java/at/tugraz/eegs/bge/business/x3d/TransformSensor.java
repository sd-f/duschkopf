//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{}X3DEnvironmentalSensorNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}Anchor"/>
 *         &lt;element ref="{}Billboard"/>
 *         &lt;element ref="{}Collision"/>
 *         &lt;element ref="{}Group"/>
 *         &lt;element ref="{}LOD"/>
 *         &lt;element ref="{}Shape"/>
 *         &lt;element ref="{}StaticGroup"/>
 *         &lt;element ref="{}Switch"/>
 *         &lt;element ref="{}Transform"/>
 *         &lt;element ref="{}EspduTransform"/>
 *         &lt;element ref="{}ReceiverPdu"/>
 *         &lt;element ref="{}SignalPdu"/>
 *         &lt;element ref="{}TransmitterPdu"/>
 *         &lt;element ref="{}CADAssembly"/>
 *         &lt;element ref="{}CADLayer"/>
 *         &lt;element ref="{}CADPart"/>
 *         &lt;element ref="{}GeoLocation"/>
 *         &lt;element ref="{}GeoLOD"/>
 *         &lt;element ref="{}GeoTransform"/>
 *         &lt;element ref="{}HAnimJoint"/>
 *         &lt;element ref="{}HAnimSegment"/>
 *         &lt;element ref="{}HAnimSite"/>
 *         &lt;element ref="{}PickableGroup"/>
 *         &lt;element ref="{}ProtoInstance"/>
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
    "anchor",
    "billboard",
    "collision",
    "group",
    "lod",
    "shape",
    "staticGroup",
    "_switch",
    "transform",
    "espduTransform",
    "receiverPdu",
    "signalPdu",
    "transmitterPdu",
    "cadAssembly",
    "cadLayer",
    "cadPart",
    "geoLocation",
    "geoLOD",
    "geoTransform",
    "hAnimJoint",
    "hAnimSegment",
    "hAnimSite",
    "pickableGroup",
    "protoInstance"
})
@XmlRootElement(name = "TransformSensor")
public class TransformSensor
    extends X3DEnvironmentalSensorNode
{

    @XmlElement(name = "Anchor")
    protected Anchor anchor;
    @XmlElement(name = "Billboard")
    protected Billboard billboard;
    @XmlElement(name = "Collision")
    protected Collision collision;
    @XmlElement(name = "Group")
    protected Group group;
    @XmlElement(name = "LOD")
    protected LOD lod;
    @XmlElement(name = "Shape")
    protected Shape shape;
    @XmlElement(name = "StaticGroup")
    protected StaticGroup staticGroup;
    @XmlElement(name = "Switch")
    protected Switch _switch;
    @XmlElement(name = "Transform")
    protected Transform transform;
    @XmlElement(name = "EspduTransform")
    protected EspduTransform espduTransform;
    @XmlElement(name = "ReceiverPdu")
    protected ReceiverPdu receiverPdu;
    @XmlElement(name = "SignalPdu")
    protected SignalPdu signalPdu;
    @XmlElement(name = "TransmitterPdu")
    protected TransmitterPdu transmitterPdu;
    @XmlElement(name = "CADAssembly")
    protected CADAssembly cadAssembly;
    @XmlElement(name = "CADLayer")
    protected CADLayer cadLayer;
    @XmlElement(name = "CADPart")
    protected CADPart cadPart;
    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    @XmlElement(name = "GeoLOD")
    protected GeoLOD geoLOD;
    @XmlElement(name = "GeoTransform")
    protected GeoTransform geoTransform;
    @XmlElement(name = "HAnimJoint")
    protected HAnimJoint hAnimJoint;
    @XmlElement(name = "HAnimSegment")
    protected HAnimSegment hAnimSegment;
    @XmlElement(name = "HAnimSite")
    protected HAnimSite hAnimSite;
    @XmlElement(name = "PickableGroup")
    protected PickableGroup pickableGroup;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;

    /**
     * Ruft den Wert der anchor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Anchor }
     *     
     */
    public Anchor getAnchor() {
        return anchor;
    }

    /**
     * Legt den Wert der anchor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Anchor }
     *     
     */
    public void setAnchor(Anchor value) {
        this.anchor = value;
    }

    /**
     * Ruft den Wert der billboard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Billboard }
     *     
     */
    public Billboard getBillboard() {
        return billboard;
    }

    /**
     * Legt den Wert der billboard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Billboard }
     *     
     */
    public void setBillboard(Billboard value) {
        this.billboard = value;
    }

    /**
     * Ruft den Wert der collision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Collision }
     *     
     */
    public Collision getCollision() {
        return collision;
    }

    /**
     * Legt den Wert der collision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Collision }
     *     
     */
    public void setCollision(Collision value) {
        this.collision = value;
    }

    /**
     * Ruft den Wert der group-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Legt den Wert der group-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Ruft den Wert der lod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LOD }
     *     
     */
    public LOD getLOD() {
        return lod;
    }

    /**
     * Legt den Wert der lod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LOD }
     *     
     */
    public void setLOD(LOD value) {
        this.lod = value;
    }

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Shape }
     *     
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Shape }
     *     
     */
    public void setShape(Shape value) {
        this.shape = value;
    }

    /**
     * Ruft den Wert der staticGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StaticGroup }
     *     
     */
    public StaticGroup getStaticGroup() {
        return staticGroup;
    }

    /**
     * Legt den Wert der staticGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticGroup }
     *     
     */
    public void setStaticGroup(StaticGroup value) {
        this.staticGroup = value;
    }

    /**
     * Ruft den Wert der switch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Switch }
     *     
     */
    public Switch getSwitch() {
        return _switch;
    }

    /**
     * Legt den Wert der switch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Switch }
     *     
     */
    public void setSwitch(Switch value) {
        this._switch = value;
    }

    /**
     * Ruft den Wert der transform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Transform }
     *     
     */
    public Transform getTransform() {
        return transform;
    }

    /**
     * Legt den Wert der transform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Transform }
     *     
     */
    public void setTransform(Transform value) {
        this.transform = value;
    }

    /**
     * Ruft den Wert der espduTransform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EspduTransform }
     *     
     */
    public EspduTransform getEspduTransform() {
        return espduTransform;
    }

    /**
     * Legt den Wert der espduTransform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EspduTransform }
     *     
     */
    public void setEspduTransform(EspduTransform value) {
        this.espduTransform = value;
    }

    /**
     * Ruft den Wert der receiverPdu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverPdu }
     *     
     */
    public ReceiverPdu getReceiverPdu() {
        return receiverPdu;
    }

    /**
     * Legt den Wert der receiverPdu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverPdu }
     *     
     */
    public void setReceiverPdu(ReceiverPdu value) {
        this.receiverPdu = value;
    }

    /**
     * Ruft den Wert der signalPdu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignalPdu }
     *     
     */
    public SignalPdu getSignalPdu() {
        return signalPdu;
    }

    /**
     * Legt den Wert der signalPdu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPdu }
     *     
     */
    public void setSignalPdu(SignalPdu value) {
        this.signalPdu = value;
    }

    /**
     * Ruft den Wert der transmitterPdu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransmitterPdu }
     *     
     */
    public TransmitterPdu getTransmitterPdu() {
        return transmitterPdu;
    }

    /**
     * Legt den Wert der transmitterPdu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmitterPdu }
     *     
     */
    public void setTransmitterPdu(TransmitterPdu value) {
        this.transmitterPdu = value;
    }

    /**
     * Ruft den Wert der cadAssembly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CADAssembly }
     *     
     */
    public CADAssembly getCADAssembly() {
        return cadAssembly;
    }

    /**
     * Legt den Wert der cadAssembly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CADAssembly }
     *     
     */
    public void setCADAssembly(CADAssembly value) {
        this.cadAssembly = value;
    }

    /**
     * Ruft den Wert der cadLayer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CADLayer }
     *     
     */
    public CADLayer getCADLayer() {
        return cadLayer;
    }

    /**
     * Legt den Wert der cadLayer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CADLayer }
     *     
     */
    public void setCADLayer(CADLayer value) {
        this.cadLayer = value;
    }

    /**
     * Ruft den Wert der cadPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CADPart }
     *     
     */
    public CADPart getCADPart() {
        return cadPart;
    }

    /**
     * Legt den Wert der cadPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CADPart }
     *     
     */
    public void setCADPart(CADPart value) {
        this.cadPart = value;
    }

    /**
     * Ruft den Wert der geoLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Legt den Wert der geoLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Ruft den Wert der geoLOD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoLOD }
     *     
     */
    public GeoLOD getGeoLOD() {
        return geoLOD;
    }

    /**
     * Legt den Wert der geoLOD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLOD }
     *     
     */
    public void setGeoLOD(GeoLOD value) {
        this.geoLOD = value;
    }

    /**
     * Ruft den Wert der geoTransform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeoTransform }
     *     
     */
    public GeoTransform getGeoTransform() {
        return geoTransform;
    }

    /**
     * Legt den Wert der geoTransform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTransform }
     *     
     */
    public void setGeoTransform(GeoTransform value) {
        this.geoTransform = value;
    }

    /**
     * Ruft den Wert der hAnimJoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HAnimJoint }
     *     
     */
    public HAnimJoint getHAnimJoint() {
        return hAnimJoint;
    }

    /**
     * Legt den Wert der hAnimJoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HAnimJoint }
     *     
     */
    public void setHAnimJoint(HAnimJoint value) {
        this.hAnimJoint = value;
    }

    /**
     * Ruft den Wert der hAnimSegment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HAnimSegment }
     *     
     */
    public HAnimSegment getHAnimSegment() {
        return hAnimSegment;
    }

    /**
     * Legt den Wert der hAnimSegment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HAnimSegment }
     *     
     */
    public void setHAnimSegment(HAnimSegment value) {
        this.hAnimSegment = value;
    }

    /**
     * Ruft den Wert der hAnimSite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HAnimSite }
     *     
     */
    public HAnimSite getHAnimSite() {
        return hAnimSite;
    }

    /**
     * Legt den Wert der hAnimSite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HAnimSite }
     *     
     */
    public void setHAnimSite(HAnimSite value) {
        this.hAnimSite = value;
    }

    /**
     * Ruft den Wert der pickableGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickableGroup }
     *     
     */
    public PickableGroup getPickableGroup() {
        return pickableGroup;
    }

    /**
     * Legt den Wert der pickableGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickableGroup }
     *     
     */
    public void setPickableGroup(PickableGroup value) {
        this.pickableGroup = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

}
