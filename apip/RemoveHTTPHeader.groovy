// Remove specified HTTP Header from API Request (i.e. the HTTP Header is not sent with Service Request)
context.ServiceRequest.withoutHeader("X-AAAA")

// Remove specified HTTP Header from Service Response (i.e. the HTTP Header is not sent with API Response)
context.ApiResponse.withoutHeader("X-AAAA“)
