// Add a default query parameter when this parameter is not passed.

def key = 'pid'      // Key of QueryParameter
def val = 'AUTO-123' // Value of QueryParameter
def queryParams = (Map)context.getClientRequest().getQueryParameters()

if( queryParams != null && queryParams.get(key) != null) {
    // No operate when default query parameters have been already passed.
}
else {
    // If any of query parameters are not passed, add query paramters
    context.getSouthboundCallout().withQueryParameter(key, val)
}
