def key = 'pid'      // QueryParameterのkey
def val = 'AUTO-123' // QueryParameterのValue
def queryParams = (Map)context.apiRequest.getQueryParam()

// No operation when default query parameters are specified
if( queryParams != null && queryParams.get(key) != null) {
}
else {
    // Add default query parameters unless default query parameters are not specified
    context.serviceRequest.setQueryParam(key, val)
}
