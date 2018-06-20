// --------------------------------------------------------------------
//  (API request)     {host}:{port}/api/v1/airports/{From}/{To}
//  (Backend Service) {host}:{port}/airports?from={From}&to={To}
// --------------------------------------------------------------------

// set Path Info to variable (pathInfo)
def pathInfo = context.ApiRequest.getPathInfo()

// split pathInfo into tokens with "/"
def token = pathInfo.split('/')

// if length of token (array) is not equal to 6, raise 404.
if( token.length != 6 ) {
    def errorId = "A001"
    context.ApiResponse.setHeader("Content-Type","application/json")
    throw new oracle.apiplatform.policies.sdk.exceptions.PolicyProcessingException(errorId, 
                                                                                   400, 
                                                                                   "MANDATORY_ITEMS_MISSING", 
                                                                                   "Both items (From, To) are mandatory.")
}
// set query parameters for backend service
// To avoid passing path parameters, PathInfo should be initialized using setPathInfo()
context.ServiceRequest.setPathInfo("").setQueryParam("from", token[4]).setQueryParam("to", token[5])
