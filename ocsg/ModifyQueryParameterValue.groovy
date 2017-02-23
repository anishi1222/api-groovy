// When Query parameter is set 'c' and its value is 'AUTO', change value to 'MARINE.

def targetKey = 'c'
def prevVal = 'AUTO'
def newVal = 'MARINE'
def queryParams = (Map)context.getClientRequest().getQueryParameters()

if( queryParams != null && queryParams.get(targetKey) != null) {
    def val = (String)queryParams.get(targetKey);
    if(val == prevVal) {
            context.getSouthboundCallout().withQueryParameter(targetKey, newVal)
    }
}
else {
    // No operation if neither query parameters nor condition does not meet...
}
