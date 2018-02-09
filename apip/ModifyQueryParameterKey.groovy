def prevKey = 'dip'
def newKey = 'pid'
def queryParams = (Map)context.ApiRequest.getQueryParams()

// Change key of query parameter when target parameter is set
if( queryParams.isEmpty() || !queryParams.containsKey(prevKey)) {
    def val = (String)((List)queryParams.get(prevKey)).get(0);
    context.ServiceRequest.withoutQueryParam(prevKey).setQueryParam(newKey, val)
}
else {
    // No operation when no query parameter is set or specified parameter is not target one.
}
