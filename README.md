# Groovy Script for API Platform

- Some samples are not recommended to use since it is much easier and safer to use policys than scripts.
- As these are for sample use only, they contains non-performance-optimized and non-exception-handling codes.

## For APIPCS Groovy Policy
### Modify HTTP Header
1. [Add HTTP Header](apip/AddHTTPHeader.groovy)
2. [Remove HTTP Header](apip/RemoveHTTPHeader.groovy)

### Customized Error Message :
1. [Return Customized Error Message in Request Pipeline](apip/ReturnCustomizedErrorMessageInRequestPipeline.groovy)
2. [Return Customized Error Message in Response Pipeline](apip/ReturnCustomizedErrorMessageInResponsePipeline.groovy)

### Query Parameter
1. [Add Default Query Parameters](apip/AddDefaultQueryParameter.groovy)
2. [Modify Key Of Query Parameters](apip/ModifyQueryParameterKey.groovy)
3. [Modify Value for Query Parameter](apip/ModifyQueryParameterValue.groovy)
4. [Convert Path parameters to Query Parameters](apip/ConvertPathParam2QueryParam.groovy)

### Modify Message
1. Request Pipeline
    1. [Modify Message](apip/ModifyMessageInRequestPipeline.groovy)
    2. Remove some element from original API request
        1. [Element Redaction](apip/ElementRedaction_RemoveElementFromAPIRequest.groovy)
        2. [Remove JSON Array element(s) when some condition meets](apip/RemoveElementsFromJSONListInAPIRequest.groovy)
    3. [Leave only some element from original API resquest](apip/ElementRedaction_LeaveElementFromAPIRequest.groovy)
2. Response Pipeline
    1. [Modify Message](apip/ModifyMessageInResponsePipeline.groovy)
    2. Remove some element from original service response
        1. [Element Redaction](apip/ElementRedaction_RemoveElementFromServiceResponse.groovy)
        2. [Remove JSON Array element(s) when some condition meets](apip/RemoveElementsFromJSONListInServiceResponse.groovy)
    3. [Leave some element only from original service response](apip/ElementRedaction_LleaveElementFromServiceResponse.groovy)

### [Service Callout](apip/AsyncServiceCallout.groovy)

## For OCSG Groovy Action
### Modify HTTP Header
1. [Add HTTP Header](ocsg/AddHTTPHeader.groovy)
2. [Remove HTTP Header](ocsg/RemoveHTTPHeader.groovy)

### Customized Error Message
1. [Return Customized Error Message in Request Pipeline](ocsg/ReturnCustomizedErrorMessageInRequestPipeline.groovy)
2. [Return Customized Error Message in Response Pipeline](ocsg/ReturnCustomizedErrorMessageInResponsePipeline.groovy)

### Query Parameter
1. [Add Default Query Parameters](ocsg/AddDefaultQueryParameters.groovy)
2. [Modify Key Of Query Parameters](ocsg/ModifyQueryParameterKey.groovy)
3. [Modify Value for Query Parameter](ocsg/ModifyQueryParameterValue.groovy)

### Modify Message
1. Request Pipeline
    1. [Modify Message](ocsg/ModifyMessageInRequestPipeline.groovy)
    2. Remove some element from original API request
        1. [Element Redaction](ocsg/ElementRedaction_RemoveElementFromAPIRequest.groovy)
        2. [Remove JSON Array element(s) when some condition meets](ocsg/RemoveElementsFromJSONList.groovy)
    3. [Leave only some element from original API resquest](ocsg/ElementRedaction_LeaveElementFromAPIRequest.groovy)
2. Response Pipeline
    1. [Modify Message](ocsg/ModifyMessageInResponsePipeline.groovy)
    2. Remove some element from original service response
        1. [Element Redaction](ocsg/ElementRedaction_RemoveElementFromServiceResponse.groovy)
        2. [Remove JSON Array element(s) when some condition meets](ocsg/RemoveElementsFromJSONList.groovy)
    3. [Leave some element only from original service response](ocsg/ElementRedaction_LleaveElementFromServiceResponse.groovy)

### [Service Callout](ocsg/ServiceCallOut.groovy)
