// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.models.ConnectionStatus;
import com.azure.resourcemanager.network.models.ConnectivityHop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information on the connectivity status. */
@Immutable
public final class ConnectivityInformationInner {
    /*
     * List of hops between the source and the destination.
     */
    @JsonProperty(value = "hops", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityHop> hops;

    /*
     * The connection status.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionStatus connectionStatus;

    /*
     * Average latency in milliseconds.
     */
    @JsonProperty(value = "avgLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer avgLatencyInMs;

    /*
     * Minimum latency in milliseconds.
     */
    @JsonProperty(value = "minLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minLatencyInMs;

    /*
     * Maximum latency in milliseconds.
     */
    @JsonProperty(value = "maxLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxLatencyInMs;

    /*
     * Total number of probes sent.
     */
    @JsonProperty(value = "probesSent", access = JsonProperty.Access.WRITE_ONLY)
    private Integer probesSent;

    /*
     * Number of failed probes.
     */
    @JsonProperty(value = "probesFailed", access = JsonProperty.Access.WRITE_ONLY)
    private Integer probesFailed;

    /**
     * Get the hops property: List of hops between the source and the destination.
     *
     * @return the hops value.
     */
    public List<ConnectivityHop> hops() {
        return this.hops;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public ConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the avgLatencyInMs property: Average latency in milliseconds.
     *
     * @return the avgLatencyInMs value.
     */
    public Integer avgLatencyInMs() {
        return this.avgLatencyInMs;
    }

    /**
     * Get the minLatencyInMs property: Minimum latency in milliseconds.
     *
     * @return the minLatencyInMs value.
     */
    public Integer minLatencyInMs() {
        return this.minLatencyInMs;
    }

    /**
     * Get the maxLatencyInMs property: Maximum latency in milliseconds.
     *
     * @return the maxLatencyInMs value.
     */
    public Integer maxLatencyInMs() {
        return this.maxLatencyInMs;
    }

    /**
     * Get the probesSent property: Total number of probes sent.
     *
     * @return the probesSent value.
     */
    public Integer probesSent() {
        return this.probesSent;
    }

    /**
     * Get the probesFailed property: Number of failed probes.
     *
     * @return the probesFailed value.
     */
    public Integer probesFailed() {
        return this.probesFailed;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hops() != null) {
            hops().forEach(e -> e.validate());
        }
    }
}
