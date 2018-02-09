def body = context.ApiRequest.getBody()
body.asJSONObject().put("serviceID", "XXXX")

def length = body.asString().length().toString()

context.ServiceRequest.setBody(body).setHeader("Content-Length",length)
