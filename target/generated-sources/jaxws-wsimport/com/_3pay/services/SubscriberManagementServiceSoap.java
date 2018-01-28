
package com._3pay.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SubscriberManagementServiceSoap", targetNamespace = "http://www.3pay.com/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SubscriberManagementServiceSoap {


    /**
     * 
     * @param subscriberId
     * @param token
     * @return
     *     returns com._3pay.services.MOperationOutput
     */
    @WebMethod(operationName = "DeactivateSubscriber", action = "http://www.3pay.com/services/DeactivateSubscriber")
    @WebResult(name = "DeactivateSubscriberResult", targetNamespace = "http://www.3pay.com/services/")
    @RequestWrapper(localName = "DeactivateSubscriber", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.DeactivateSubscriber")
    @ResponseWrapper(localName = "DeactivateSubscriberResponse", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.DeactivateSubscriberResponse")
    public MOperationOutput deactivateSubscriber(
        @WebParam(name = "token", targetNamespace = "http://www.3pay.com/services/")
        MAuthToken token,
        @WebParam(name = "subscriberId", targetNamespace = "http://www.3pay.com/services/")
        String subscriberId);

    /**
     * 
     * @param subscriberId
     * @param token
     * @return
     *     returns com._3pay.services.MOperationOutput
     */
    @WebMethod(operationName = "DeleteSubscriber", action = "http://www.3pay.com/services/DeleteSubscriber")
    @WebResult(name = "DeleteSubscriberResult", targetNamespace = "http://www.3pay.com/services/")
    @RequestWrapper(localName = "DeleteSubscriber", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.DeleteSubscriber")
    @ResponseWrapper(localName = "DeleteSubscriberResponse", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.DeleteSubscriberResponse")
    public MOperationOutput deleteSubscriber(
        @WebParam(name = "token", targetNamespace = "http://www.3pay.com/services/")
        MAuthToken token,
        @WebParam(name = "subscriberId", targetNamespace = "http://www.3pay.com/services/")
        String subscriberId);

    /**
     * 
     * @param input
     * @param token
     * @return
     *     returns com._3pay.services.MSelectSubscriberOutput
     */
    @WebMethod(operationName = "SelectSubscriber", action = "http://www.3pay.com/services/SelectSubscriber")
    @WebResult(name = "SelectSubscriberResult", targetNamespace = "http://www.3pay.com/services/")
    @RequestWrapper(localName = "SelectSubscriber", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.SelectSubscriber")
    @ResponseWrapper(localName = "SelectSubscriberResponse", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.SelectSubscriberResponse")
    public MSelectSubscriberOutput selectSubscriber(
        @WebParam(name = "token", targetNamespace = "http://www.3pay.com/services/")
        MAuthToken token,
        @WebParam(name = "input", targetNamespace = "http://www.3pay.com/services/")
        MSelectSubscriberInput input);

    /**
     * 
     * @param subscriberId
     * @param token
     * @return
     *     returns com._3pay.services.MSubscriberDetailOutput
     */
    @WebMethod(operationName = "SelectSubscriberDetail", action = "http://www.3pay.com/services/SelectSubscriberDetail")
    @WebResult(name = "SelectSubscriberDetailResult", targetNamespace = "http://www.3pay.com/services/")
    @RequestWrapper(localName = "SelectSubscriberDetail", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.SelectSubscriberDetail")
    @ResponseWrapper(localName = "SelectSubscriberDetailResponse", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.SelectSubscriberDetailResponse")
    public MSubscriberDetailOutput selectSubscriberDetail(
        @WebParam(name = "token", targetNamespace = "http://www.3pay.com/services/")
        MAuthToken token,
        @WebParam(name = "subscriberId", targetNamespace = "http://www.3pay.com/services/")
        String subscriberId);

    /**
     * 
     * @param description
     * @param validFrom
     * @param serviceSubscriberId
     * @param newPrice
     * @param token
     * @return
     *     returns com._3pay.services.MResult
     */
    @WebMethod(operationName = "UpdateSubscriberPriceByIdandDate", action = "http://www.3pay.com/services/UpdateSubscriberPriceByIdandDate")
    @WebResult(name = "UpdateSubscriberPriceByIdandDateResult", targetNamespace = "http://www.3pay.com/services/")
    @RequestWrapper(localName = "UpdateSubscriberPriceByIdandDate", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.UpdateSubscriberPriceByIdandDate")
    @ResponseWrapper(localName = "UpdateSubscriberPriceByIdandDateResponse", targetNamespace = "http://www.3pay.com/services/", className = "com._3pay.services.UpdateSubscriberPriceByIdandDateResponse")
    public MResult updateSubscriberPriceByIdandDate(
        @WebParam(name = "token", targetNamespace = "http://www.3pay.com/services/")
        MAuthToken token,
        @WebParam(name = "serviceSubscriberId", targetNamespace = "http://www.3pay.com/services/")
        String serviceSubscriberId,
        @WebParam(name = "validFrom", targetNamespace = "http://www.3pay.com/services/")
        XMLGregorianCalendar validFrom,
        @WebParam(name = "newPrice", targetNamespace = "http://www.3pay.com/services/")
        double newPrice,
        @WebParam(name = "description", targetNamespace = "http://www.3pay.com/services/")
        String description);

}