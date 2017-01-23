// Return customized error in response pipeline if returned error from backend service should be masked.

def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def length = json.toString().length().toString()

// Content-Type is not required when using Content-Type which comes from Backend service
// Content-Length should be set when modifying a response message.
context.getClientResponse().withStatus(404).withBodyAsObject(json).withHeader("Content-Length",length)

// The following method is required when you don't want subsequent activities in pipeline to be executed.
context.forceResponse()
