def targetKey = 'c'
def prevVal = 'AUTO'
def newVal = 'MARINE'
def queryParams = (Map)context.ApiRequest.getQueryParams()

// Change value of query parameter in case of meeting conditions.
if( queryParams.isEmpty() || !queryParams.containsKey(targetKey)) {
    def val = (String)((List)queryParams.get(targetKey)).get(0)
    if(val == prevVal) {
        context.ServiceRequest.setQueryParam(targetKey, newVal)
    }
}
else {
    // No operation when no query parameter is set or value for target query parameter is not expected value.
}
