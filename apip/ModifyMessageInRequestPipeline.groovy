def body = context.apiRequest.getBody()
body.asJSONObject().put("serviceID", "XXXX")

def length = body.asString().length().toString()

context.serviceRequest.setBody(body).setHeader("Content-Length",length)
