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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DProductStructureChildNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}CADAssembly"/>
 *         &lt;element ref="{}CADPart"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *         &lt;element ref="{}Anchor"/>
 *         &lt;element ref="{}Billboard"/>
 *         &lt;element ref="{}Collision"/>
 *         &lt;element ref="{}Group"/>
 *         &lt;element ref="{}Inline"/>
 *         &lt;element ref="{}LOD"/>
 *         &lt;element ref="{}Transform"/>
 *         &lt;element ref="{}DirectionalLight"/>
 *         &lt;element ref="{}NavigationInfo"/>
 *         &lt;element ref="{}OrthoViewpoint"/>
 *         &lt;element ref="{}Viewpoint"/>
 *         &lt;element ref="{}ViewpointGroup"/>
 *         &lt;element ref="{}WorldInfo"/>
 *       &lt;/choice>
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cadAssemblyOrCADPartOrProtoInstance"
})
@XmlRootElement(name = "CADAssembly")
public class CADAssembly
    extends X3DProductStructureChildNode
{

    @XmlElements({
        @XmlElement(name = "CADAssembly", type = CADAssembly.class),
        @XmlElement(name = "CADPart", type = CADPart.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class),
        @XmlElement(name = "Anchor", type = Anchor.class),
        @XmlElement(name = "Billboard", type = Billboard.class),
        @XmlElement(name = "Collision", type = Collision.class),
        @XmlElement(name = "Group", type = Group.class),
        @XmlElement(name = "Inline", type = Inline.class),
        @XmlElement(name = "LOD", type = LOD.class),
        @XmlElement(name = "Transform", type = Transform.class),
        @XmlElement(name = "DirectionalLight", type = DirectionalLight.class),
        @XmlElement(name = "NavigationInfo", type = NavigationInfo.class),
        @XmlElement(name = "OrthoViewpoint", type = OrthoViewpoint.class),
        @XmlElement(name = "Viewpoint", type = Viewpoint.class),
        @XmlElement(name = "ViewpointGroup", type = ViewpointGroup.class),
        @XmlElement(name = "WorldInfo", type = WorldInfo.class)
    })
    protected List<Object> cadAssemblyOrCADPartOrProtoInstance;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Gets the value of the cadAssemblyOrCADPartOrProtoInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cadAssemblyOrCADPartOrProtoInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCADAssemblyOrCADPartOrProtoInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADAssembly }
     * {@link CADPart }
     * {@link ProtoInstance }
     * {@link Anchor }
     * {@link Billboard }
     * {@link Collision }
     * {@link Group }
     * {@link Inline }
     * {@link LOD }
     * {@link Transform }
     * {@link DirectionalLight }
     * {@link NavigationInfo }
     * {@link OrthoViewpoint }
     * {@link Viewpoint }
     * {@link ViewpointGroup }
     * {@link WorldInfo }
     * 
     * 
     */
    public List<Object> getCADAssemblyOrCADPartOrProtoInstance() {
        if (cadAssemblyOrCADPartOrProtoInstance == null) {
            cadAssemblyOrCADPartOrProtoInstance = new ArrayList<Object>();
        }
        return this.cadAssemblyOrCADPartOrProtoInstance;
    }

    /**
     * Ruft den Wert der bboxCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxCenter() {
        if (bboxCenter == null) {
            return "0 0 0";
        } else {
            return bboxCenter;
        }
    }

    /**
     * Legt den Wert der bboxCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxCenter(String value) {
        this.bboxCenter = value;
    }

    /**
     * Ruft den Wert der bboxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxSize() {
        if (bboxSize == null) {
            return "-1 -1 -1";
        } else {
            return bboxSize;
        }
    }

    /**
     * Legt den Wert der bboxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxSize(String value) {
        this.bboxSize = value;
    }

}
