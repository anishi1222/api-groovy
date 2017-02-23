// Add HTTP Header

// Add HTTP Header to Service Request in Request pipeline
context.getSouthboundCallout().withHeader("X-ServiceRequest", "XXXX")

// Add HTTP Header to API Request in REsponse pipeline
context.getClientResponse().withHeader("X-API_Response", "XXXX")
