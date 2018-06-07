// In the only case of returning Error Message due to message validation error
def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def body = new StringBodyImpl(json.toString(), "application/json")
def length = body.asString().length().toString()

def errorId = "A001"

// In case of previous version of PolicyProcessingException, 3rd parameter accepts JSON.
// But after 17.4.5, 3rd parameter accepts only String, and JSON is transformed into String.
// Therefore, we have to create ApiResponse object if sending response message is required.

context.ApiResponse.setBody(body).setHeader("Content-Length",length).setHeader("Content-Type","application/json")
throw new oracle.apiplatform.policies.sdk.exceptions.PolicyProcessingException(errorId, 400, "Exception message")
