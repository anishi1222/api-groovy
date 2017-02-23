// Remove HTTP Header

// Remove specified HTTP header in request pipeline
context.getSouthboundCallout().withoutHeader("X-AAAA")

// Remove specified HTTP Header in response pipeline
context.getClientResponse().withoutHeader("X-AAAA")

// Ignore all HTTP headers in request pipeline
context.getSouthboundCallout().ignoreAllRequestHeaders(true)

// Ignore all HTTP headers in response pipeline
context.getClientResponse().ignoreAllRequestHeaders(true)

