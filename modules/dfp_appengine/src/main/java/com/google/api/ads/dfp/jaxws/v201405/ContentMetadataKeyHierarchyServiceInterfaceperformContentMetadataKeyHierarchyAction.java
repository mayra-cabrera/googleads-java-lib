
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link ContentMetadataKeyHierarchy} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param contentMetadataKeyHierarchyAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of hierarchies
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performContentMetadataKeyHierarchyAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performContentMetadataKeyHierarchyAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="contentMetadataKeyHierarchyAction" type="{https://www.google.com/apis/ads/publisher/v201405}ContentMetadataKeyHierarchyAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201405}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentMetadataKeyHierarchyAction",
    "filterStatement"
})
@XmlRootElement(name = "performContentMetadataKeyHierarchyAction")
public class ContentMetadataKeyHierarchyServiceInterfaceperformContentMetadataKeyHierarchyAction {

    protected ContentMetadataKeyHierarchyAction contentMetadataKeyHierarchyAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the contentMetadataKeyHierarchyAction property.
     * 
     * @return
     *     possible object is
     *     {@link ContentMetadataKeyHierarchyAction }
     *     
     */
    public ContentMetadataKeyHierarchyAction getContentMetadataKeyHierarchyAction() {
        return contentMetadataKeyHierarchyAction;
    }

    /**
     * Sets the value of the contentMetadataKeyHierarchyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMetadataKeyHierarchyAction }
     *     
     */
    public void setContentMetadataKeyHierarchyAction(ContentMetadataKeyHierarchyAction value) {
        this.contentMetadataKeyHierarchyAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
