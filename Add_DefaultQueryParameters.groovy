// Add Default Query Parameters when these parameters are not passed

def key = 'pid'      // Key of QueryParameter
def val = 'AUTO-123' // Value of QueryParameter
def queryParams = (Map)context.getClientRequest().getQueryParameters()

// No operate when default query parameters have been already passed.
if( queryParams != null && queryParams.get(key) != null) {
}
else {
    // If any of query parameters are not passed, add query paramters
    context.getSouthboundCallout().withQueryParameter(key, val)
}
