// Method mapping is easier way than this script.
// We recommend using method mapping rather than Groovy script.

def prevKey = 'dip'
def newKey = 'pid'
def queryParams = (Map)context.getClientRequest().getQueryParameters()

// Change key of query parameter when target query parameter is found.
if( queryParams != null && queryParams.get(prevKey) != null) {
    def val = (String)queryParams.get(prevKey);
    context.getSouthboundCallout().withoutQueryParameter(prevKey)
    context.getSouthboundCallout().withQueryParameter(newKey, val)
}
else {
    // No operate when an query parameter is not passed, or when target query parameter is not passed.
}
