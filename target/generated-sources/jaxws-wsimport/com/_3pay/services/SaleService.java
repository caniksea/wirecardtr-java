
package com._3pay.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SaleService", targetNamespace = "http://www.3pay.com/services/", wsdlLocation = "https://www.3pay.com/services/saleservice.asmx?WSDL")
public class SaleService
    extends Service
{

    private final static URL SALESERVICE_WSDL_LOCATION;
    private final static WebServiceException SALESERVICE_EXCEPTION;
    private final static QName SALESERVICE_QNAME = new QName("http://www.3pay.com/services/", "SaleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.3pay.com/services/saleservice.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SALESERVICE_WSDL_LOCATION = url;
        SALESERVICE_EXCEPTION = e;
    }

    public SaleService() {
        super(__getWsdlLocation(), SALESERVICE_QNAME);
    }

    public SaleService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SALESERVICE_QNAME, features);
    }

    public SaleService(URL wsdlLocation) {
        super(wsdlLocation, SALESERVICE_QNAME);
    }

    public SaleService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SALESERVICE_QNAME, features);
    }

    public SaleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SaleService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SaleServiceSoap
     */
    @WebEndpoint(name = "SaleServiceSoap")
    public SaleServiceSoap getSaleServiceSoap() {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceSoap"), SaleServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SaleServiceSoap
     */
    @WebEndpoint(name = "SaleServiceSoap")
    public SaleServiceSoap getSaleServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceSoap"), SaleServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns SaleServiceSoap
     */
    @WebEndpoint(name = "SaleServiceSoap12")
    public SaleServiceSoap getSaleServiceSoap12() {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceSoap12"), SaleServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SaleServiceSoap
     */
    @WebEndpoint(name = "SaleServiceSoap12")
    public SaleServiceSoap getSaleServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceSoap12"), SaleServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns SaleServiceHttpGet
     */
    @WebEndpoint(name = "SaleServiceHttpGet")
    public SaleServiceHttpGet getSaleServiceHttpGet() {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceHttpGet"), SaleServiceHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SaleServiceHttpGet
     */
    @WebEndpoint(name = "SaleServiceHttpGet")
    public SaleServiceHttpGet getSaleServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceHttpGet"), SaleServiceHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns SaleServiceHttpPost
     */
    @WebEndpoint(name = "SaleServiceHttpPost")
    public SaleServiceHttpPost getSaleServiceHttpPost() {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceHttpPost"), SaleServiceHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SaleServiceHttpPost
     */
    @WebEndpoint(name = "SaleServiceHttpPost")
    public SaleServiceHttpPost getSaleServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.3pay.com/services/", "SaleServiceHttpPost"), SaleServiceHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SALESERVICE_EXCEPTION!= null) {
            throw SALESERVICE_EXCEPTION;
        }
        return SALESERVICE_WSDL_LOCATION;
    }

}