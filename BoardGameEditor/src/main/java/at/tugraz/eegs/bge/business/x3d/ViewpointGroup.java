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
 *     &lt;extension base="{}X3DNode">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Viewpoint"/>
 *         &lt;element ref="{}OrthoViewpoint"/>
 *         &lt;element ref="{}ViewpointGroup"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="description" type="{}SFString" />
 *       &lt;attribute name="displayed" type="{}SFBool" default="true" />
 *       &lt;attribute name="retainUserOffsets" type="{}SFBool" default="false" />
 *       &lt;attribute name="size" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="containerField" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="children" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "viewpointOrOrthoViewpointOrViewpointGroup"
})
@XmlRootElement(name = "ViewpointGroup")
public class ViewpointGroup
    extends X3DNode
{

    @XmlElements({
        @XmlElement(name = "Viewpoint", type = Viewpoint.class),
        @XmlElement(name = "OrthoViewpoint", type = OrthoViewpoint.class),
        @XmlElement(name = "ViewpointGroup", type = ViewpointGroup.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> viewpointOrOrthoViewpointOrViewpointGroup;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "displayed")
    protected Boolean displayed;
    @XmlAttribute(name = "retainUserOffsets")
    protected Boolean retainUserOffsets;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Gets the value of the viewpointOrOrthoViewpointOrViewpointGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewpointOrOrthoViewpointOrViewpointGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewpointOrOrthoViewpointOrViewpointGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Viewpoint }
     * {@link OrthoViewpoint }
     * {@link ViewpointGroup }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getViewpointOrOrthoViewpointOrViewpointGroup() {
        if (viewpointOrOrthoViewpointOrViewpointGroup == null) {
            viewpointOrOrthoViewpointOrViewpointGroup = new ArrayList<Object>();
        }
        return this.viewpointOrOrthoViewpointOrViewpointGroup;
    }

    /**
     * Ruft den Wert der center-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        if (center == null) {
            return "0 0 0";
        } else {
            return center;
        }
    }

    /**
     * Legt den Wert der center-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der displayed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayed() {
        if (displayed == null) {
            return true;
        } else {
            return displayed;
        }
    }

    /**
     * Legt den Wert der displayed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayed(Boolean value) {
        this.displayed = value;
    }

    /**
     * Ruft den Wert der retainUserOffsets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetainUserOffsets() {
        if (retainUserOffsets == null) {
            return false;
        } else {
            return retainUserOffsets;
        }
    }

    /**
     * Legt den Wert der retainUserOffsets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetainUserOffsets(Boolean value) {
        this.retainUserOffsets = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        if (size == null) {
            return "0 0 0";
        } else {
            return size;
        }
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

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
