// Elements which contains the value of "MARINE" as "category" are removed from the following original JSON message
// 
// {
//     "products": [
//         {
//             "pid": "AUTO-201",
//             "base_info": {
//                 "category": "AUTO",
//                 "product_name": "AAAA"
//             }
//         },
//         {
//             "pid": "AUTO-123",
//             "base_info": {
//                 "category": "AUTO",
//                 "product_name": "BBBB"
//             }
//         },
//         {
//             "pid": "MARINE-100",
//             "base_info": {
//                 "category": "MARINE",
//                 "product_name": "CCCC"
//             }
//         }
//     ]
// }

def body = context.getSouthboundResponse().getBodyAsType(String.class)
def slurper = new groovy.json.JsonSlurper()

def messageBody = (Map)slurper.parseText(body)
def products = (List)messageBody.products

messageBody.products = products.findAll{it["base_info"]["category"] != "MARINE" }

def json = groovy.json.JsonOutput.toJson(messageBody);
def length = json.toString().length().toString()

context.getClientResponse().withBodyAsObject(json).withHeader("Content-Length",length)
