package com.caizhidao.jiaoyisuo.sim;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-06-08T16:08:57.268+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://impl.service.ta.ctis.com", name = "openMiAccountForUnitServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface OpenMiAccountForUnitServicePortType {

    @WebResult(name = "return", targetNamespace = "http://impl.service.ta.ctis.com")
    @Action(input = "urn:openAndCheck", output = "urn:openAndCheckResponse")
    @RequestWrapper(localName = "openAndCheck", targetNamespace = "http://impl.service.ta.ctis.com", className = "com.caizhidao.jiaoyisuo.sim.OpenAndCheck")
    @WebMethod(action = "urn:openAndCheck")
    @ResponseWrapper(localName = "openAndCheckResponse", targetNamespace = "http://impl.service.ta.ctis.com", className = "com.caizhidao.jiaoyisuo.sim.OpenAndCheckResponse")
    public java.lang.String openAndCheck(
        @WebParam(name = "tjpmeToken", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String tjpmeToken,
        @WebParam(name = "memberNo", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String memberNo,
        @WebParam(name = "customerNo", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String customerNo,
        @WebParam(name = "customerName", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String customerName,
        @WebParam(name = "papersType", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String papersType,
        @WebParam(name = "papersNum", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String papersNum,
        @WebParam(name = "gender", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String gender,
        @WebParam(name = "province", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String province,
        @WebParam(name = "city", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String city,
        @WebParam(name = "area", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String area,
        @WebParam(name = "tradePWD", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String tradePWD,
        @WebParam(name = "phonePWD", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String phonePWD,
        @WebParam(name = "phone", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String phone,
        @WebParam(name = "fax", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String fax,
        @WebParam(name = "postcode", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String postcode,
        @WebParam(name = "email", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String email,
        @WebParam(name = "address", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String address,
        @WebParam(name = "brokerageNo", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String brokerageNo,
        @WebParam(name = "organizationNo", targetNamespace = "http://impl.service.ta.ctis.com")
        java.lang.String organizationNo
    );
}
