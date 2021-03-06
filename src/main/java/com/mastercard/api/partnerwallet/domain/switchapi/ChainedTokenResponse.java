
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChainedTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChainedTokenResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerifierToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainedTokenResponse", propOrder = {
    "requestToken",
    "verifierToken",
    "extensionPoint"
})
public class ChainedTokenResponse {

    @XmlElement(name = "RequestToken", required = true)
    protected String requestToken;
    @XmlElement(name = "VerifierToken", required = true)
    protected String verifierToken;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the verifierToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifierToken() {
        return verifierToken;
    }

    /**
     * Sets the value of the verifierToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifierToken(String value) {
        this.verifierToken = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

}
