// Error Response (1)
// In case of using ordinal API response...
def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def body = new StringBodyImpl(json.toString(), "application/json")
def length = body.asString().length().toString()

context.ApiResponse.setStatusCode(400).setBody(body).setHeader("Content-Length",length).setHeader("Content-Type","application/json")

// Error Response (2)
// In case of using PolicyProcessingException...
def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def errorId = "XXXX"
context.ApiResponse.setBody(body).setHeader("Content-Length",length).setHeader("Content-Type","application/json")
throw new oracle.apiplatform.policies.sdk.exceptions.PolicyProcessingException(errorId, 400, "XXXX")
