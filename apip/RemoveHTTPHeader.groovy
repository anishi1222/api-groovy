// Remove specified HTTP Header from API Request (i.e. the HTTP Header is not sent with Service Request)
context.serviceRequest.withoutHeader("X-AAAA")

// Remove specified HTTP Header from Service Response (i.e. the HTTP Header is not sent with API Response)
context.apiResponse.withoutHeader("X-AAAA“)
