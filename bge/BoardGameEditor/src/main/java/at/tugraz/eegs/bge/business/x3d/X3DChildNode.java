//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für X3DChildNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DChildNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DNode">
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="children" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DChildNode")
@XmlSeeAlso({
    X3DTriggerNode.class,
    NurbsSurfaceInterpolator.class,
    NurbsPositionInterpolator.class,
    NurbsOrientationInterpolator.class,
    X3DHumanoidNode.class,
    DISEntityManager.class,
    RigidBodyCollection.class,
    CollisionCollection.class,
    CollisionSensor.class,
    X3DNBodyCollidableNode.class,
    X3DLayoutNode.class,
    X3DProductStructureChildNode.class,
    NurbsSet.class,
    HAnimJoint.class,
    EaseInEaseOut.class,
    ClipPlane.class,
    X3DSoundNode.class,
    TimeTrigger.class,
    IntegerTrigger.class,
    Inline.class,
    X3DSensorNode.class,
    BooleanTrigger.class,
    BooleanToggle.class,
    X3DSequencerNode.class,
    X3DInfoNode.class,
    X3DShapeNode.class,
    X3DGroupingNode.class,
    X3DLightNode.class,
    X3DBindableNode.class,
    X3DInterpolatorNode.class,
    X3DTimeDependentNode.class,
    BooleanFilter.class,
    X3DFollowerNode.class
})
public abstract class X3DChildNode
    extends X3DNode
{

    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Ruft den Wert der containerField-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerField() {
        if (containerField == null) {
            return "children";
        } else {
            return containerField;
        }
    }

    /**
     * Legt den Wert der containerField-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerField(String value) {
        this.containerField = value;
    }

}
