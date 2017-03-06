def body = context.serviceResponse.getBody()
body.asJSONObject().put("serviceID","XXXX")

def length = body.asString().length().toString()

context.apiResponse.setBody(body).setHeader("Content-Length", length)
