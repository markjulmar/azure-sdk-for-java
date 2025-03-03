// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Properties of integration runtime node. */
@Fluent
public final class ManagedIntegrationRuntimeNode {
    /*
     * The managed integration runtime node id.
     */
    @JsonProperty(value = "nodeId", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeId;

    /*
     * The managed integration runtime node status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedIntegrationRuntimeNodeStatus status;

    /*
     * The errors that occurred on this integration runtime node.
     */
    @JsonProperty(value = "errors")
    private List<ManagedIntegrationRuntimeError> errors;

    /*
     * Properties of integration runtime node.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the nodeId property: The managed integration runtime node id.
     *
     * @return the nodeId value.
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Get the status property: The managed integration runtime node status.
     *
     * @return the status value.
     */
    public ManagedIntegrationRuntimeNodeStatus status() {
        return this.status;
    }

    /**
     * Get the errors property: The errors that occurred on this integration runtime node.
     *
     * @return the errors value.
     */
    public List<ManagedIntegrationRuntimeError> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors that occurred on this integration runtime node.
     *
     * @param errors the errors value to set.
     * @return the ManagedIntegrationRuntimeNode object itself.
     */
    public ManagedIntegrationRuntimeNode withErrors(List<ManagedIntegrationRuntimeError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the additionalProperties property: Properties of integration runtime node.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Properties of integration runtime node.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ManagedIntegrationRuntimeNode object itself.
     */
    public ManagedIntegrationRuntimeNode withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
