// Retrieve the element "serviceID" from API Request
def newMessage  = (Map)[:]
newMessage.put("serviceID", (String)context.apiRequest.getBody().asJSONObject().get("serviceID"))

def json = groovy.json.JsonOutput.toJson((Map)newMessage)
def newBody = new StringBodyImpl(json.toString(), "application/json")
def length = newBody.asString().length().toString()
context.apiResponse.setBody(newBody).setHeader("Content-Length",length)
