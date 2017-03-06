def targetKey = 'c'
def prevVal = 'AUTO'
def newVal = 'MARINE'
def queryParams = (Map)context.apiRequest.getQueryParams()

// Change value of query parameter in case of meeting conditions.
if( queryParams != null && queryParams.get(targetKey) != null) {
    def val = (String)queryParams.get(targetKey).get(0);
    if(val == prevVal) {
        context.serviceRequest.setQueryParam(targetKey, newVal)
    }
}
else {
    // No operation when no query parameter is set or value for target query parameter is not expected value.
}
