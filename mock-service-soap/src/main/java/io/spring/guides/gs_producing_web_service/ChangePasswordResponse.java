//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.02 at 11:33:24 AM BRT 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="password" type="{http://spring.io/guides/gs-producing-web-service}ArrayOfJavaLangstring_literal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "password"
})
@XmlRootElement(name = "changePasswordResponse")
public class ChangePasswordResponse {

    @XmlElement(required = true)
    protected ArrayOfJavaLangstringLiteral password;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJavaLangstringLiteral }
     *     
     */
    public ArrayOfJavaLangstringLiteral getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJavaLangstringLiteral }
     *     
     */
    public void setPassword(ArrayOfJavaLangstringLiteral value) {
        this.password = value;
    }

}