# Azure Cognitive Service - Form Recognizer for Java

> see https://aka.ms/autorest

### Setup
```ps
Fork and clone https://github.com/Azure/autorest.java 
git checkout v4
git submodule update --init --recursive
mvn package -Dlocal
npm install
npm install -g autorest
```

### Generation
```ps
cd <swagger-folder>
autorest --java --use=C:/work/autorest.java
```

### Code generation settings
``` yaml
input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs-pr/181d0d178029b86140802835d11b0e47318a43e9/specification/cognitiveservices/data-plane/FormRecognizer/preview/2022-06-30-preview/FormRecognizer.json?token=GHSAT0AAAAAABJXDFRONLXHQWPPCNNJOISMYUXZFBA
java: true
output-folder: ..\
generate-client-as-impl: true
namespace: com.azure.ai.formrecognizer
generate-client-interfaces: false
sync-methods: all
license-header: MICROSOFT_MIT_SMALL
add-context-parameter: true
models-subpackage: implementation.models
context-client-method-parameter: true
custom-types-subpackage: models
service-interface-as-public: true
custom-strongly-typed-header-deserialization: true
generic-response-type: true
```

### Change GetOperationResponse result from Object to ModelInfo

``` yaml $(java)
directive:
  - from: swagger-document
    where: $.definitions.GetOperationResponse
    transform: >
      delete $.properties.result.type;
      $.properties.result["$ref"] = "#/definitions/ModelInfo"; 
```

