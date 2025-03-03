// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ItemLevelRecoveryConnectionsClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.IlrRequestResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ItemLevelRecoveryConnections;

public final class ItemLevelRecoveryConnectionsImpl implements ItemLevelRecoveryConnections {
    private static final ClientLogger LOGGER = new ClientLogger(ItemLevelRecoveryConnectionsImpl.class);

    private final ItemLevelRecoveryConnectionsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ItemLevelRecoveryConnectionsImpl(
        ItemLevelRecoveryConnectionsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void provision(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters) {
        this
            .serviceClient()
            .provision(
                vaultName,
                resourceGroupName,
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters);
    }

    public Response<Void> provisionWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters,
        Context context) {
        return this
            .serviceClient()
            .provisionWithResponse(
                vaultName,
                resourceGroupName,
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters,
                context);
    }

    public void revoke(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId) {
        this
            .serviceClient()
            .revoke(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId);
    }

    public Response<Void> revokeWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context) {
        return this
            .serviceClient()
            .revokeWithResponse(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, context);
    }

    private ItemLevelRecoveryConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
