// Retrieve the element "serviceID" from API Request
def newMessage  = (Map)[:]
newMessage.put("serviceID", (String)context.ApiRequest.getBody().asJSONObject().get("serviceID"))

def json = groovy.json.JsonOutput.toJson((Map)newMessage)
def newBody = new StringBodyImpl(json.toString(), "application/json")
def length = newBody.asString().length().toString()
context.ApiResponse.setBody(newBody).setHeader("Content-Length",length)
