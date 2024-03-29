//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.22 at 05:17:04 PM BRST 
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
 *         &lt;element name="CodigoRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Localizador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Agrupador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GPerfil" type="{http://spring.io/guides/gs-producing-web-service}ArrayOfJavaLangstring_literal"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AvisoSenha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codigoRetorno",
    "descricaoRetorno",
    "localizador",
    "agrupador",
    "gPerfil",
    "empresa",
    "sistema",
    "avisoSenha",
    "nome",
    "cpf"
})
@XmlRootElement(name = "loginNovoFrontResponse")
public class LoginNovoFrontResponse {

    @XmlElement(name = "CodigoRetorno", required = true)
    protected String codigoRetorno;
    @XmlElement(name = "DescricaoRetorno", required = true)
    protected String descricaoRetorno;
    @XmlElement(name = "Localizador", required = true)
    protected String localizador;
    @XmlElement(name = "Agrupador", required = true)
    protected String agrupador;
    @XmlElement(name = "GPerfil", required = true)
    protected ArrayOfJavaLangstringLiteral gPerfil;
    @XmlElement(name = "Empresa", required = true)
    protected String empresa;
    @XmlElement(name = "Sistema", required = true)
    protected String sistema;
    @XmlElement(name = "AvisoSenha", required = true)
    protected String avisoSenha;
    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "Cpf", required = true)
    protected String cpf;

    /**
     * Gets the value of the codigoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Sets the value of the codigoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRetorno(String value) {
        this.codigoRetorno = value;
    }

    /**
     * Gets the value of the descricaoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoRetorno() {
        return descricaoRetorno;
    }

    /**
     * Sets the value of the descricaoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoRetorno(String value) {
        this.descricaoRetorno = value;
    }

    /**
     * Gets the value of the localizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Sets the value of the localizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Gets the value of the agrupador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrupador() {
        return agrupador;
    }

    /**
     * Sets the value of the agrupador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrupador(String value) {
        this.agrupador = value;
    }

    /**
     * Gets the value of the gPerfil property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJavaLangstringLiteral }
     *     
     */
    public ArrayOfJavaLangstringLiteral getGPerfil() {
        return gPerfil;
    }

    /**
     * Sets the value of the gPerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJavaLangstringLiteral }
     *     
     */
    public void setGPerfil(ArrayOfJavaLangstringLiteral value) {
        this.gPerfil = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the avisoSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisoSenha() {
        return avisoSenha;
    }

    /**
     * Sets the value of the avisoSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisoSenha(String value) {
        this.avisoSenha = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

}
