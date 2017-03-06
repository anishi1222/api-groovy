// Retrieve the element "serviceID" from service response
def body = context.serviceResponse.getBody()

def newMessage  = (Map)[:]
newMessage.put("serviceID", (String)context.serviceResponse.getBody().asJSONObject().get("serviceID"))

def json = groovy.json.JsonOutput.toJson((Map)newMessage)
def newBody = new StringBodyImpl(json.toString(), "application/json")
def length = newBody.asString().length().toString()
context.apiResponse.setBody(newBody).setHeader("Content-Length",length)
