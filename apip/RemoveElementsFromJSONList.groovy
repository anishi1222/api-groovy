/*****
  Sample JSON message
{
  "products": [
    {
      "pid": "AUTO-201",
      "base_info": {
        "category": "AUTO",
        "product_name": "AAAA“
      }
    },
    {
      "pid": "AUTO-123",
      "base_info": {
        "category": "AUTO",
        "product_name": "BBBB"
      }
    },
    {
      "pid": "MARINE-100",
      "base_info": {
        "category": "MARINE",
        "product_name": "CCCC"
      }
    }
  ]
}
*****/

def body = context.apiRequest.getBody()
def count = body.asJSONObject().getJSONArray("products").length()

for(int i=0 ; i < count ; i++ ) {
    if( body.asJSONObject()
            .getJSONArray("products")
            .getJSONObject(i)
            .getJSONObject("base_info")
            .getString("category") != “AUTO" ) {
        body.asJSONObject().getJSONArray("products").remove(i)
    }
} 

def length = body.asString().length().toString()
context.serviceRequest.setBody(body).setHeader("Content-Length", length)
