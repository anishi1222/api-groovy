// In the only case of returning Error Message due to message validation error
def messageBody = ["errorcode": "XXXX"]
def json = groovy.json.JsonOutput.toJson(messageBody)
def errorId = "A001"
context.ApiResponse.setHeader("Content-Type","application/json")

throw new oracle.apiplatform.policies.sdk.exceptions.PolicyProcessingException(errorId, 400, json.toString())
