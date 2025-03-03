// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Auto scale properties. */
@Fluent
public final class AutoScaleProperties {
    /*
     * The minNodeCount property.
     */
    @JsonProperty(value = "minNodeCount")
    private Integer minNodeCount;

    /*
     * The enabled property.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The maxNodeCount property.
     */
    @JsonProperty(value = "maxNodeCount")
    private Integer maxNodeCount;

    /**
     * Get the minNodeCount property: The minNodeCount property.
     *
     * @return the minNodeCount value.
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    /**
     * Set the minNodeCount property: The minNodeCount property.
     *
     * @param minNodeCount the minNodeCount value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * Get the enabled property: The enabled property.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     *
     * @param enabled the enabled value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the maxNodeCount property: The maxNodeCount property.
     *
     * @return the maxNodeCount value.
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Set the maxNodeCount property: The maxNodeCount property.
     *
     * @param maxNodeCount the maxNodeCount value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
