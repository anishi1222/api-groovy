ExternalServiceCallout callout = context.newCallout()
ExternalServiceCallout.Callback callback = new ExternalServiceCallout.Callback() {
 
        boolean onCompleted(ServiceResponse response) throws PolicyProcessingException {
            println "Response: " + response.getBody().asString()
            return true
        }
 
        boolean onThrowable(Throwable throwable) throws PolicyProcessingException {
            return true;
       }
}
callout.setRequestURL("https://reqres.in/api/users").setMethod("GET")
callout.sendAsync(callback)
