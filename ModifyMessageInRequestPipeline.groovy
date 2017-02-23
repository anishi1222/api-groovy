// Modify messages in request pipeline

def body = context.getClientRequest().getBodyAsType(String.class)
def slurper = new groovy.json.JsonSlurper()

def messageBody = (Map)slurper.parseText(body)
messageBody["serviceID"] = "XXXX"

def json = groovy.json.JsonOutput.toJson(messageBody)
def length = json.toString().length().toString()

// Content-Length should be set
context.getSouthboundCallout().withBodyAsObject(json).withHeader("Content-Length",length)
