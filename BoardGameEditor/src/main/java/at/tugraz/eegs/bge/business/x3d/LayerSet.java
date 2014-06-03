//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.math.BigInteger;
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
 *         &lt;element ref="{}Layer"/>
 *         &lt;element ref="{}LayoutLayer"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="activeLayer" type="{}SFInt32" default="0" />
 *       &lt;attribute name="order" type="{}MFInt32" default="0" />
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
    "layerOrLayoutLayerOrProtoInstance"
})
@XmlRootElement(name = "LayerSet")
public class LayerSet
    extends X3DNode
{

    @XmlElements({
        @XmlElement(name = "Layer", type = Layer.class),
        @XmlElement(name = "LayoutLayer", type = LayoutLayer.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class)
    })
    protected List<Object> layerOrLayoutLayerOrProtoInstance;
    @XmlAttribute(name = "activeLayer")
    protected BigInteger activeLayer;
    @XmlAttribute(name = "order")
    protected String order;
    @XmlAttribute(name = "containerField")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String containerField;

    /**
     * Gets the value of the layerOrLayoutLayerOrProtoInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerOrLayoutLayerOrProtoInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerOrLayoutLayerOrProtoInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Layer }
     * {@link LayoutLayer }
     * {@link ProtoInstance }
     * 
     * 
     */
    public List<Object> getLayerOrLayoutLayerOrProtoInstance() {
        if (layerOrLayoutLayerOrProtoInstance == null) {
            layerOrLayoutLayerOrProtoInstance = new ArrayList<Object>();
        }
        return this.layerOrLayoutLayerOrProtoInstance;
    }

    /**
     * Ruft den Wert der activeLayer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActiveLayer() {
        if (activeLayer == null) {
            return new BigInteger("0");
        } else {
            return activeLayer;
        }
    }

    /**
     * Legt den Wert der activeLayer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActiveLayer(BigInteger value) {
        this.activeLayer = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        if (order == null) {
            return "0";
        } else {
            return order;
        }
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
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
