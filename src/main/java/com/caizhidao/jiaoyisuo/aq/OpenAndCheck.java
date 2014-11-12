
package com.caizhidao.jiaoyisuo.aq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tjpmeToken",
    "memberNo",
    "customerNo",
    "customerName",
    "papersType",
    "papersNum",
    "gender",
    "province",
    "city",
    "area",
    "tradePWD",
    "phonePWD",
    "phone",
    "fax",
    "postcode",
    "email",
    "address",
    "brokerageNo",
    "organizationNo",
    "idType",
    "bankAcc",
    "checkBankCard"
})
@XmlRootElement(name = "openAndCheck")
public class OpenAndCheck {

    @XmlElementRef(name = "tjpmeToken", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tjpmeToken;
    @XmlElementRef(name = "memberNo", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberNo;
    @XmlElementRef(name = "customerNo", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerNo;
    @XmlElementRef(name = "customerName", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "papersType", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> papersType;
    @XmlElementRef(name = "papersNum", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> papersNum;
    @XmlElementRef(name = "gender", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "province", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> province;
    @XmlElementRef(name = "city", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "area", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> area;
    @XmlElementRef(name = "tradePWD", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradePWD;
    @XmlElementRef(name = "phonePWD", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phonePWD;
    @XmlElementRef(name = "phone", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "fax", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "postcode", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "email", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "address", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "brokerageNo", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerageNo;
    @XmlElementRef(name = "organizationNo", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationNo;
    @XmlElementRef(name = "IDType", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idType;
    @XmlElementRef(name = "bankAcc", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAcc;
    @XmlElementRef(name = "checkBankCard", namespace = "http://impl.service.ta.ctis.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkBankCard;

    /**
     * tjpmeToken
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTjpmeToken() {
        return tjpmeToken;
    }

    /**
     * tjpmeToken
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTjpmeToken(JAXBElement<String> value) {
        this.tjpmeToken = value;
    }

    /**
     * memberNo
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberNo() {
        return memberNo;
    }

    /**
     * memberNo
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberNo(JAXBElement<String> value) {
        this.memberNo = value;
    }

    /**
     * customerNo
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerNo() {
        return customerNo;
    }

    /**
     * customerNo
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerNo(JAXBElement<String> value) {
        this.customerNo = value;
    }

    /**
     * customerName
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * customerName
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * papersType
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPapersType() {
        return papersType;
    }

    /**
     * papersType
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPapersType(JAXBElement<String> value) {
        this.papersType = value;
    }

    /**
     * papersNum
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPapersNum() {
        return papersNum;
    }

    /**
     * papersNum
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPapersNum(JAXBElement<String> value) {
        this.papersNum = value;
    }

    /**
     * gender
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * gender
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * province
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvince() {
        return province;
    }

    /**
     * province
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvince(JAXBElement<String> value) {
        this.province = value;
    }

    /**
     * city
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * city
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * area
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea() {
        return area;
    }

    /**
     * area
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea(JAXBElement<String> value) {
        this.area = value;
    }

    /**
     * tradePWD
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradePWD() {
        return tradePWD;
    }

    /**
     * tradePWD
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradePWD(JAXBElement<String> value) {
        this.tradePWD = value;
    }

    /**
     * phonePWD
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhonePWD() {
        return phonePWD;
    }

    /**
     * phonePWD
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhonePWD(JAXBElement<String> value) {
        this.phonePWD = value;
    }

    /**
     * phone
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * phone
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * fax
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * fax
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
    }

    /**
     * postcode
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostcode() {
        return postcode;
    }

    /**
     * postcode
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostcode(JAXBElement<String> value) {
        this.postcode = value;
    }

    /**
     * email
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * email
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * address
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * address
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * brokerageNo
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerageNo() {
        return brokerageNo;
    }

    /**
     * brokerageNo
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerageNo(JAXBElement<String> value) {
        this.brokerageNo = value;
    }

    /**
     * organizationNo
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationNo() {
        return organizationNo;
    }

    /**
     * organizationNo
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationNo(JAXBElement<String> value) {
        this.organizationNo = value;
    }

    /**
     * idType
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDType() {
        return idType;
    }

    /**
     * idType
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDType(JAXBElement<String> value) {
        this.idType = value;
    }

    /**
     * bankAcc
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAcc() {
        return bankAcc;
    }

    /**
     * bankAcc
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAcc(JAXBElement<String> value) {
        this.bankAcc = value;
    }

    /**
     * checkBankCard
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckBankCard() {
        return checkBankCard;
    }

    /**
     * checkBankCard
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckBankCard(JAXBElement<String> value) {
        this.checkBankCard = value;
    }

}
