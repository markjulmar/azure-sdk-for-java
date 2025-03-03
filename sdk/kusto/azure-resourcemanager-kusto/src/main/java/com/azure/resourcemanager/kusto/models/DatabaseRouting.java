// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DatabaseRouting. */
public final class DatabaseRouting extends ExpandableStringEnum<DatabaseRouting> {
    /** Static value Single for DatabaseRouting. */
    public static final DatabaseRouting SINGLE = fromString("Single");

    /** Static value Multi for DatabaseRouting. */
    public static final DatabaseRouting MULTI = fromString("Multi");

    /**
     * Creates or finds a DatabaseRouting from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatabaseRouting.
     */
    @JsonCreator
    public static DatabaseRouting fromString(String name) {
        return fromString(name, DatabaseRouting.class);
    }

    /** @return known DatabaseRouting values. */
    public static Collection<DatabaseRouting> values() {
        return values(DatabaseRouting.class);
    }
}
