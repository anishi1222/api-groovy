def body = context.apiRequest.getBody()
body.asJSONObject().remove("serviceID")

def length = body.asString().length().toString()

context.ServiceRequest.setBody(body).setHeader("Content-Length",length)
