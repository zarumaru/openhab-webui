/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 06:25:15 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for rrd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rrd"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="yaxis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="scaling" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="steps" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="fill" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="style"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="lines"/&gt;
 *             &lt;enumeration value="bars"/&gt;
 *             &lt;enumeration value="points"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="barWidth" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute ref="{}align"/&gt;
 *       &lt;attribute name="datasourceIndex" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute ref="{}consolidationFunction default="AVERAGE""/&gt;
 *       &lt;attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rrd", propOrder = {
    "value"
})
public class Rrd {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "yaxis")
    protected String yaxis;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "scaling")
    protected BigDecimal scaling;
    @XmlAttribute(name = "steps")
    protected Boolean steps;
    @XmlAttribute(name = "fill")
    protected Boolean fill;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "barWidth")
    protected BigInteger barWidth;
    @XmlAttribute(name = "align")
    protected String align;
    @XmlAttribute(name = "datasourceIndex")
    protected BigInteger datasourceIndex;
    @XmlAttribute(name = "consolidationFunction")
    protected String consolidationFunction;
    @XmlAttribute(name = "resolution")
    protected BigInteger resolution;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;

    /**
     * Gets the value of the value property.
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
     * Sets the value of the value property.
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
     * Gets the value of the yaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYaxis() {
        return yaxis;
    }

    /**
     * Sets the value of the yaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYaxis(String value) {
        this.yaxis = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the scaling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaling() {
        return scaling;
    }

    /**
     * Sets the value of the scaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaling(BigDecimal value) {
        this.scaling = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSteps(Boolean value) {
        this.steps = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFill(Boolean value) {
        this.fill = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the barWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBarWidth() {
        return barWidth;
    }

    /**
     * Sets the value of the barWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBarWidth(BigInteger value) {
        this.barWidth = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the datasourceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDatasourceIndex() {
        if (datasourceIndex == null) {
            return new BigInteger("0");
        } else {
            return datasourceIndex;
        }
    }

    /**
     * Sets the value of the datasourceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDatasourceIndex(BigInteger value) {
        this.datasourceIndex = value;
    }

    /**
     * Auswählen einer der verfügbaren Consolidation Functions des RRDTools (http://rrdtool.org).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidationFunction() {
        if (consolidationFunction == null) {
            return "AVERAGE";
        } else {
            return consolidationFunction;
        }
    }

    /**
     * Sets the value of the consolidationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidationFunction(String value) {
        this.consolidationFunction = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolution(BigInteger value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

}