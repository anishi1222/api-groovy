ExternalServiceCallout callout = context.newCallout()
ExternalServiceCallout.Callback callback = new ExternalServiceCallout.Callback() {

    boolean onCompleted(ServiceResponse response) throws PolicyProcessingException {
        println "Response: " + response.getBody().asString()
        // If you want to use the response later, store the response using setAttribute() or setEdr() 
        context.setAttribute("response1", response)
        return true
    }

    boolean onThrowable(Throwable throwable) throws PolicyProcessingException {
        return true
    }
}

// As ExternalServiceCallout extends ServiceRequest, you can invoke any APIs even if request message is mandatory.
callout.setRequestURL("API URL").setMethod("HTTP Method")
callout.sendAsync(callback)

/* -----------------------------------
 *
 * Subsequent groovy script policy...
 *
 * -----------------------------------*/
ServiceResponse calloutResponse1 = (ServiceResponse)context.getAttribute("response1")
println calloutResponse1.getBody().getString()
println calloutResponse1.getStatusCode()
