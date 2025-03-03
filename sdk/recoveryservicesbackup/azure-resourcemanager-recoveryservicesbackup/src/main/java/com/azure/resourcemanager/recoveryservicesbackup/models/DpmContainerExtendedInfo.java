// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Additional information of the DPMContainer. */
@Fluent
public final class DpmContainerExtendedInfo {
    /*
     * Last refresh time of the DPMContainer.
     */
    @JsonProperty(value = "lastRefreshedAt")
    private OffsetDateTime lastRefreshedAt;

    /**
     * Get the lastRefreshedAt property: Last refresh time of the DPMContainer.
     *
     * @return the lastRefreshedAt value.
     */
    public OffsetDateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set the lastRefreshedAt property: Last refresh time of the DPMContainer.
     *
     * @param lastRefreshedAt the lastRefreshedAt value to set.
     * @return the DpmContainerExtendedInfo object itself.
     */
    public DpmContainerExtendedInfo withLastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
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
