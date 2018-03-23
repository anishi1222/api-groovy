// This is supported in 18.1.5 or after

ExternalServiceCallout callout = context.newCallout()
ExternalServiceCallout.Callback callback = new ExternalServiceCallout.Callback() {
 
        boolean onCompleted(ServiceResponse response)
            throws PolicyProcessingException {
 
            System.out.println("-----> onCompleted()");
            System.out.println("Response: " + response.getBody().asString());
            return true;
 
        }
 
        boolean onThrowable(Throwable throwable)
            throws PolicyProcessingException {
 
            System.out.println("-----> onThrowable()");
            return true;
 
       }
}

// Configure URL and Method as you like
callout.setRequestURL("URL").setMethod("Method");
callout.sendAsync(callback);
