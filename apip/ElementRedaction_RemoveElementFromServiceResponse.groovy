def body = context.ServiceResponse.getBody()
body.asJSONObject().remove("serviceID")

def length = body.asString().length().toString()

context.ApiResponse.setBody(body).setHeader("Content-Length",length)
