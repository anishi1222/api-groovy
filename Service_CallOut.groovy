// Synchronous callout
HttpResponse response = context.createCallout()
                        .withRequestUrl("http://myurl.com")
                        .withRequestMethod("GET").build().send()
if( response.getStatus() != 200 ) {...}

// Asynchronous callout
context.createCallout().withRequestUrl("http://myurl.com")
                       .withRequestMethod("GET").build().send("storedResponse")
HttpResponse response = context.getAttribute("storedResponse");
if( response.getStatus() != 200 ) {...}
