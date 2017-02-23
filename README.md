#Groovy Script for API Platform

Some samples are not recommended to use since it is much easier and safer to use policys than scripts.

## For APIPCS Groovy Policy
### Modify HTTP Header
1. [Add HTTP Header](Add_HTTPHeader_apip.groovy)
2. [Remove HTTP Header](Remove_HTTPHeader_apip.groovy)

### Customized Error Message
1. [Return Customized Error Message in Request Pipeline](Return_CustomizedErrorMessage_in_RequestPipeline_apip.groovy)
2. [Return Customized Error Message in Response Pipeline](Return_CustomizedErrorMessage_in_ResponsePipeline_apip.groovy)

### Query Parameter
1. [Add Default Query Parameters](Add_DefaultQueryParameters_apip.groovy)
2. [Modify Key Of Query Parameters](Modify_KeyOfQueryParameters_apip.groovy)
3. [Modify Value for Query Parameter](Modify Query Parameter Value_apip.groovy)

### Modify Message
1. Request Pipeline
    1. [Modify Message](Modify_Message_in_RequestPipeline_apip.groovy)
    2. Remove some element from original API request
        1. [Element Redaction] (Element Redaction (remove some element from API request)_apip.groovy)
        2. [Remove JSON Array element(s) when some condition meets] (Remove Elements from JSON List_apip.groovy)
    3. [Leave some element only from original API resquest](Element Redaction (leave some element from API request)_apip.groovy)
2. Response Pipeline
    1. [Modify Message](Modify_Message_in_ResponsePipeline_apip.groovy)
    2. Remove some element from original service response
        1. [Element Redaction] (Element Redaction (remove some element from service response)_apip.groovy)
        2. [Remove JSON Array element(s) when some condition meets] (Remove Elements from JSON List_apip.groovy)
    3. [Leave some element only from original service response](Element Redaction (leave some element from service response)_apip.groovy)

## For OCSG Groovy Actions
### Modify HTTP Header
1. [Add HTTP Header](Add_HTTPHeader.groovy)
2. [Remove HTTP Header](Remove_HTTPHeader.groovy)

### Customized Error Message
1. [Return Customized Error Message in Request Pipeline](Return_CustomizedErrorMessage_in_RequestPipeline.groovy)
2. [Return Customized Error Message in Response Pipeline](Return_CustomizedErrorMessage_in_ResponsePipeline.groovy)

### Query Parameter
1. [Add Default Query Parameters](Add_DefaultQueryParameters.groovy)
2. [Modify Key Of Query Parameters](Modify_KeyOfQueryParameters.groovy)
3. [Modify Value for Query Parameter](Modify Query Parameter Value.groovy)

### Modify Message
1. Request Pipeline
    1. [Modify Message](Modify_Message_in_RequestPipeline.groovy)
    2. Remove some element from original API request
        1. [Element Redaction] (Element Redaction (remove some element from API request).groovy)
        2. [Remove JSON Array element(s) when some condition meets] (Remove Elements from JSON List.groovy)
    3. [Leave some element only from original API resquest](Element Redaction (leave some element from API request).groovy)
2. Response Pipeline
    1. [Modify Message](Modify_Message_in_ResponsePipeline.groovy)
    2. Remove some element from original service response
        1. [Element Redaction] (Element Redaction (remove some element from service response).groovy)
        2. [Remove JSON Array element(s) when some condition meets] (Remove Elements from JSON List.groovy)
    3. [Leave some element only from original service response](Element Redaction (leave some element from service response).groovy)

