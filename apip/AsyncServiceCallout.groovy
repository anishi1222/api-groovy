ExternalServiceCallout callout = context.newCallout()
ExternalServiceCallout.Callback callback = new ExternalServiceCallout.Callback() {

    boolean onCompleted(ServiceResponse response) throws PolicyProcessingException {
        println "Response: " + response.getBody().asString()
        // If response is used later, response should be stored using setAttribute() or setEdr() 
        return true
    }

    boolean onThrowable(Throwable throwable) throws PolicyProcessingException {
        return true;
    }
}

// As ExternalServiceCallout extends ServiceRequest, you can invoke any APIs even if request message is mandatory.
callout.setRequestURL("API URL").setMethod("HTTP Method")
callout.sendAsync(callback)
