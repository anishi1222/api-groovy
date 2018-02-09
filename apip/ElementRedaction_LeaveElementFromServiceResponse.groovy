// Retrieve the element "serviceID" from service response
def body = context.ServiceResponse.getBody()

def newMessage  = (Map)[:]
newMessage.put("serviceID", (String)context.ServiceResponse.getBody().asJSONObject().get("serviceID"))

def json = groovy.json.JsonOutput.toJson((Map)newMessage)
def newBody = new StringBodyImpl(json.toString(), "application/json")
def length = newBody.asString().length().toString()
context.ApiResponse.setBody(newBody).setHeader("Content-Length",length)
