// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Databricks Delta Lake sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeSink")
@Fluent
public final class AzureDatabricksDeltaLakeSink extends CopySink {
    /*
     * SQL pre-copy script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * Azure Databricks Delta Lake import settings.
     */
    @JsonProperty(value = "importSettings")
    private AzureDatabricksDeltaLakeImportCommand importSettings;

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set.
     * @return the AzureDatabricksDeltaLakeSink object itself.
     */
    public AzureDatabricksDeltaLakeSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the importSettings property: Azure Databricks Delta Lake import settings.
     *
     * @return the importSettings value.
     */
    public AzureDatabricksDeltaLakeImportCommand getImportSettings() {
        return this.importSettings;
    }

    /**
     * Set the importSettings property: Azure Databricks Delta Lake import settings.
     *
     * @param importSettings the importSettings value to set.
     * @return the AzureDatabricksDeltaLakeSink object itself.
     */
    public AzureDatabricksDeltaLakeSink setImportSettings(AzureDatabricksDeltaLakeImportCommand importSettings) {
        this.importSettings = importSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
