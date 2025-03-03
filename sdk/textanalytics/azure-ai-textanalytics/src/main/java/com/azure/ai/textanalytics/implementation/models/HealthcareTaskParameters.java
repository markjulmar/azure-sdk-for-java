// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported parameters for a Healthcare task. */
@Fluent
public final class HealthcareTaskParameters extends PreBuiltTaskParameters {
    /*
     * The FHIR Spec version that the result will use to format the fhirBundle.
     * For additional information see https://www.hl7.org/fhir/overview.html.
     */
    @JsonProperty(value = "fhirVersion")
    private FhirVersion fhirVersion;

    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional
     * information see https://aka.ms/text-analytics-offsets.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /**
     * Get the fhirVersion property: The FHIR Spec version that the result will use to format the fhirBundle. For
     * additional information see https://www.hl7.org/fhir/overview.html.
     *
     * @return the fhirVersion value.
     */
    public FhirVersion getFhirVersion() {
        return this.fhirVersion;
    }

    /**
     * Set the fhirVersion property: The FHIR Spec version that the result will use to format the fhirBundle. For
     * additional information see https://www.hl7.org/fhir/overview.html.
     *
     * @param fhirVersion the fhirVersion value to set.
     * @return the HealthcareTaskParameters object itself.
     */
    public HealthcareTaskParameters setFhirVersion(FhirVersion fhirVersion) {
        this.fhirVersion = fhirVersion;
        return this;
    }

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the HealthcareTaskParameters object itself.
     */
    public HealthcareTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}
