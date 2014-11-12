
package com.caizhidao.jiaoyisuo.sim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.caizhidao.jiaoyisuo.sim package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OpenAndCheckMemberNo_QNAME = new QName("http://impl.service.ta.ctis.com", "memberNo");
    private final static QName _OpenAndCheckGender_QNAME = new QName("http://impl.service.ta.ctis.com", "gender");
    private final static QName _OpenAndCheckProvince_QNAME = new QName("http://impl.service.ta.ctis.com", "province");
    private final static QName _OpenAndCheckAddress_QNAME = new QName("http://impl.service.ta.ctis.com", "address");
    private final static QName _OpenAndCheckEmail_QNAME = new QName("http://impl.service.ta.ctis.com", "email");
    private final static QName _OpenAndCheckPapersNum_QNAME = new QName("http://impl.service.ta.ctis.com", "papersNum");
    private final static QName _OpenAndCheckBrokerageNo_QNAME = new QName("http://impl.service.ta.ctis.com", "brokerageNo");
    private final static QName _OpenAndCheckArea_QNAME = new QName("http://impl.service.ta.ctis.com", "area");
    private final static QName _OpenAndCheckPostcode_QNAME = new QName("http://impl.service.ta.ctis.com", "postcode");
    private final static QName _OpenAndCheckCity_QNAME = new QName("http://impl.service.ta.ctis.com", "city");
    private final static QName _OpenAndCheckTjpmeToken_QNAME = new QName("http://impl.service.ta.ctis.com", "tjpmeToken");
    private final static QName _OpenAndCheckTradePWD_QNAME = new QName("http://impl.service.ta.ctis.com", "tradePWD");
    private final static QName _OpenAndCheckOrganizationNo_QNAME = new QName("http://impl.service.ta.ctis.com", "organizationNo");
    private final static QName _OpenAndCheckCustomerNo_QNAME = new QName("http://impl.service.ta.ctis.com", "customerNo");
    private final static QName _OpenAndCheckPapersType_QNAME = new QName("http://impl.service.ta.ctis.com", "papersType");
    private final static QName _OpenAndCheckCustomerName_QNAME = new QName("http://impl.service.ta.ctis.com", "customerName");
    private final static QName _OpenAndCheckFax_QNAME = new QName("http://impl.service.ta.ctis.com", "fax");
    private final static QName _OpenAndCheckPhonePWD_QNAME = new QName("http://impl.service.ta.ctis.com", "phonePWD");
    private final static QName _OpenAndCheckPhone_QNAME = new QName("http://impl.service.ta.ctis.com", "phone");
    private final static QName _OpenAndCheckResponseReturn_QNAME = new QName("http://impl.service.ta.ctis.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.caizhidao.jiaoyisuo.sim
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenAndCheckResponse }
     * @return OpenAndCheckResponse
     */
    public OpenAndCheckResponse createOpenAndCheckResponse() {
        return new OpenAndCheckResponse();
    }

    /**
     * Create an instance of {@link OpenAndCheck }
     * @return OpenAndCheck
     */
    public OpenAndCheck createOpenAndCheck() {
        return new OpenAndCheck();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * @return JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "memberNo", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckMemberNo(String value) {
        return new JAXBElement<String>(_OpenAndCheckMemberNo_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "gender", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckGender(String value) {
        return new JAXBElement<String>(_OpenAndCheckGender_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "province", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckProvince(String value) {
        return new JAXBElement<String>(_OpenAndCheckProvince_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "address", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckAddress(String value) {
        return new JAXBElement<String>(_OpenAndCheckAddress_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "email", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckEmail(String value) {
        return new JAXBElement<String>(_OpenAndCheckEmail_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "papersNum", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckPapersNum(String value) {
        return new JAXBElement<String>(_OpenAndCheckPapersNum_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "brokerageNo", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckBrokerageNo(String value) {
        return new JAXBElement<String>(_OpenAndCheckBrokerageNo_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "area", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckArea(String value) {
        return new JAXBElement<String>(_OpenAndCheckArea_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "postcode", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckPostcode(String value) {
        return new JAXBElement<String>(_OpenAndCheckPostcode_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "city", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckCity(String value) {
        return new JAXBElement<String>(_OpenAndCheckCity_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "tjpmeToken", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckTjpmeToken(String value) {
        return new JAXBElement<String>(_OpenAndCheckTjpmeToken_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "tradePWD", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckTradePWD(String value) {
        return new JAXBElement<String>(_OpenAndCheckTradePWD_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "organizationNo", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckOrganizationNo(String value) {
        return new JAXBElement<String>(_OpenAndCheckOrganizationNo_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "customerNo", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckCustomerNo(String value) {
        return new JAXBElement<String>(_OpenAndCheckCustomerNo_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "papersType", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckPapersType(String value) {
        return new JAXBElement<String>(_OpenAndCheckPapersType_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "customerName", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckCustomerName(String value) {
        return new JAXBElement<String>(_OpenAndCheckCustomerName_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "fax", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckFax(String value) {
        return new JAXBElement<String>(_OpenAndCheckFax_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "phonePWD", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckPhonePWD(String value) {
        return new JAXBElement<String>(_OpenAndCheckPhonePWD_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "phone", scope = OpenAndCheck.class)
    public JAXBElement<String> createOpenAndCheckPhone(String value) {
        return new JAXBElement<String>(_OpenAndCheckPhone_QNAME, String.class, OpenAndCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * JAXBElement
     */
    @XmlElementDecl(namespace = "http://impl.service.ta.ctis.com", name = "return", scope = OpenAndCheckResponse.class)
    public JAXBElement<String> createOpenAndCheckResponseReturn(String value) {
        return new JAXBElement<String>(_OpenAndCheckResponseReturn_QNAME, String.class, OpenAndCheckResponse.class, value);
    }

}
