// Error Response (1)
def body = new StringBodyImpl("{\"errorcode\": \"XXXX\"}", "application/json")
def length = body.asString().length().toString()

context.ApiResponse.setStatus(404).setBody(body).setHeader("Content-Length",length).setHeader("Content-Type","application/json")

// Error Response (2)
def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def errorId = "XXXX"
context.ApiResponse.setHeader("Content-Type","application/json")

throw new oracle.apiplatform.policies.sdk.exceptions.PolicyProcessingException(errorId, 400, json.toString())
