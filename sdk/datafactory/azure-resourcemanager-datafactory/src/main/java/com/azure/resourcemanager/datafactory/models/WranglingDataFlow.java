// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.PowerQueryTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Power Query data flow. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WranglingDataFlow")
@Fluent
public final class WranglingDataFlow extends DataFlow {
    /*
     * PowerQuery data flow type properties.
     */
    @JsonProperty(value = "typeProperties")
    private PowerQueryTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: PowerQuery data flow type properties.
     *
     * @return the innerTypeProperties value.
     */
    private PowerQueryTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WranglingDataFlow withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WranglingDataFlow withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WranglingDataFlow withFolder(DataFlowFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the sources property: List of sources in Power Query.
     *
     * @return the sources value.
     */
    public List<PowerQuerySource> sources() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sources();
    }

    /**
     * Set the sources property: List of sources in Power Query.
     *
     * @param sources the sources value to set.
     * @return the WranglingDataFlow object itself.
     */
    public WranglingDataFlow withSources(List<PowerQuerySource> sources) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new PowerQueryTypeProperties();
        }
        this.innerTypeProperties().withSources(sources);
        return this;
    }

    /**
     * Get the script property: Power query mashup script.
     *
     * @return the script value.
     */
    public String script() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().script();
    }

    /**
     * Set the script property: Power query mashup script.
     *
     * @param script the script value to set.
     * @return the WranglingDataFlow object itself.
     */
    public WranglingDataFlow withScript(String script) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new PowerQueryTypeProperties();
        }
        this.innerTypeProperties().withScript(script);
        return this;
    }

    /**
     * Get the documentLocale property: Locale of the Power query mashup document.
     *
     * @return the documentLocale value.
     */
    public String documentLocale() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().documentLocale();
    }

    /**
     * Set the documentLocale property: Locale of the Power query mashup document.
     *
     * @param documentLocale the documentLocale value to set.
     * @return the WranglingDataFlow object itself.
     */
    public WranglingDataFlow withDocumentLocale(String documentLocale) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new PowerQueryTypeProperties();
        }
        this.innerTypeProperties().withDocumentLocale(documentLocale);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
