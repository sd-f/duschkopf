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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DTimeDependentNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DTimeDependentNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DChildNode">
 *       &lt;attribute name="loop" type="{}SFBool" default="false" />
 *       &lt;attribute name="pauseTime" type="{}SFTime" default="0" />
 *       &lt;attribute name="resumeTime" type="{}SFTime" default="0" />
 *       &lt;attribute name="startTime" type="{}SFTime" default="0" />
 *       &lt;attribute name="stopTime" type="{}SFTime" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DTimeDependentNode")
@XmlSeeAlso({
    TimeSensor.class,
    X3DSoundSourceNode.class
})
public abstract class X3DTimeDependentNode
    extends X3DChildNode
{

    @XmlAttribute(name = "loop")
    protected Boolean loop;
    @XmlAttribute(name = "pauseTime")
    protected String pauseTime;
    @XmlAttribute(name = "resumeTime")
    protected String resumeTime;
    @XmlAttribute(name = "startTime")
    protected String startTime;
    @XmlAttribute(name = "stopTime")
    protected String stopTime;

    /**
     * Ruft den Wert der loop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLoop() {
        if (loop == null) {
            return false;
        } else {
            return loop;
        }
    }

    /**
     * Legt den Wert der loop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoop(Boolean value) {
        this.loop = value;
    }

    /**
     * Ruft den Wert der pauseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseTime() {
        if (pauseTime == null) {
            return "0";
        } else {
            return pauseTime;
        }
    }

    /**
     * Legt den Wert der pauseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseTime(String value) {
        this.pauseTime = value;
    }

    /**
     * Ruft den Wert der resumeTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumeTime() {
        if (resumeTime == null) {
            return "0";
        } else {
            return resumeTime;
        }
    }

    /**
     * Legt den Wert der resumeTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumeTime(String value) {
        this.resumeTime = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        if (startTime == null) {
            return "0";
        } else {
            return startTime;
        }
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der stopTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopTime() {
        if (stopTime == null) {
            return "0";
        } else {
            return stopTime;
        }
    }

    /**
     * Legt den Wert der stopTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopTime(String value) {
        this.stopTime = value;
    }

}
