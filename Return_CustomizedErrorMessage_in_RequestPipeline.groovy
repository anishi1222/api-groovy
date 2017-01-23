// Return customized error if validation in Groovy Script Policy is failed.

def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def length = json.toString().length().toString()

// Content-Type is not required when using Content-Type which comes from Backend service
// Content-Length should be set
context.getClientResponse().withStatus(404).withBodyAsObject(json).withHeader("Content-Length",length).withHeader("Content-Type","application/json")

// The following method is required when subsequent activities in pipeline should not be executed
context.forceResponse()
