def body = context.ServiceResponse.getBody()
body.asJSONObject().put("serviceID","XXXX")

def length = body.asString().length().toString()

context.ApiResponse.setBody(body).setHeader("Content-Length", length)
