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
 *     &lt;extension base="{}X3DBackgroundNode">
 *       &lt;attribute name="backUrl" type="{}MFString" />
 *       &lt;attribute name="bottomUrl" type="{}MFString" />
 *       &lt;attribute name="frontUrl" type="{}MFString" />
 *       &lt;attribute name="leftUrl" type="{}MFString" />
 *       &lt;attribute name="rightUrl" type="{}MFString" />
 *       &lt;attribute name="topUrl" type="{}MFString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Background")
public class Background
    extends X3DBackgroundNode
{

    @XmlAttribute(name = "backUrl")
    protected List<String> backUrl;
    @XmlAttribute(name = "bottomUrl")
    protected List<String> bottomUrl;
    @XmlAttribute(name = "frontUrl")
    protected List<String> frontUrl;
    @XmlAttribute(name = "leftUrl")
    protected List<String> leftUrl;
    @XmlAttribute(name = "rightUrl")
    protected List<String> rightUrl;
    @XmlAttribute(name = "topUrl")
    protected List<String> topUrl;

    /**
     * Gets the value of the backUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBackUrl() {
        if (backUrl == null) {
            backUrl = new ArrayList<String>();
        }
        return this.backUrl;
    }

    /**
     * Gets the value of the bottomUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bottomUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBottomUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBottomUrl() {
        if (bottomUrl == null) {
            bottomUrl = new ArrayList<String>();
        }
        return this.bottomUrl;
    }

    /**
     * Gets the value of the frontUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrontUrl() {
        if (frontUrl == null) {
            frontUrl = new ArrayList<String>();
        }
        return this.frontUrl;
    }

    /**
     * Gets the value of the leftUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leftUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeftUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLeftUrl() {
        if (leftUrl == null) {
            leftUrl = new ArrayList<String>();
        }
        return this.leftUrl;
    }

    /**
     * Gets the value of the rightUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRightUrl() {
        if (rightUrl == null) {
            rightUrl = new ArrayList<String>();
        }
        return this.rightUrl;
    }

    /**
     * Gets the value of the topUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopUrl() {
        if (topUrl == null) {
            topUrl = new ArrayList<String>();
        }
        return this.topUrl;
    }

}
