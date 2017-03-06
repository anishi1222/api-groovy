def body = context.ApiRequest.getBody()
body.asJSONObject().remove("serviceID")

def length = body.asString().length().toString()

context.serviceRequest.setBody(body).setHeader("Content-Length",length)
