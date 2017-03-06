def body = context.serviceResponse.getBody()
body.asJSONObject().remove("serviceID")

def length = body.asString().length().toString()

context.apiResponse.setBody(body).setHeader("Content-Length",length)
