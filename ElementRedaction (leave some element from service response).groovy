// Leave some element of response message received from backend service.
// Redaction policy is much easier than this script. We strongly recommend using the Redaction policy.
// 
// Original message 
//  {
//    "account_number": "4859634",
//    "name": "Sam",
//    "gas_usage": "20,005 Btu",
//    "gas_cost": "¥ 46,896",
//    "electricity_usage": "3,430 kW",
//    "electricity_cost": "¥ 12,932",
//    "environment": "Japan 1",
//    "serviceID": "7777"
//  }
//

// Retrieve the element "serviceID" from service response
def body = context.getSouthboundResponse().getBodyAsType(String.class)
def slurper = new groovy.json.JsonSlurper()

def messageBody = (Map)slurper.parseText(body)
def newMessage  = (Map)[:]

newMessage.add("serviceID", messageBody["serviceID"])

def json = groovy.json.JsonOutput.toJson(newMessage)
def length = json.toString().length().toString()

context.getClientResponse().withBodyAsObject(json).withHeader("Content-Length",length)
