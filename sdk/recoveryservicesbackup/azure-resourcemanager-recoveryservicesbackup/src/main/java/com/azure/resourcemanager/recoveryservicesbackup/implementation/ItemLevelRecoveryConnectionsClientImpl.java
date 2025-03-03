// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ItemLevelRecoveryConnectionsClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.IlrRequestResource;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ItemLevelRecoveryConnectionsClient. */
public final class ItemLevelRecoveryConnectionsClientImpl implements ItemLevelRecoveryConnectionsClient {
    /** The proxy service used to perform REST calls. */
    private final ItemLevelRecoveryConnectionsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ItemLevelRecoveryConnectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ItemLevelRecoveryConnectionsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ItemLevelRecoveryConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientItemLevelRecoveryConnections to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface ItemLevelRecoveryConnectionsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems"
                + "/{protectedItemName}/recoveryPoints/{recoveryPointId}/provisionInstantItemRecovery")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> provision(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("containerName") String containerName,
            @PathParam("protectedItemName") String protectedItemName,
            @PathParam("recoveryPointId") String recoveryPointId,
            @BodyParam("application/json") IlrRequestResource parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems"
                + "/{protectedItemName}/recoveryPoints/{recoveryPointId}/revokeInstantItemRecovery")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> revoke(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("containerName") String containerName,
            @PathParam("protectedItemName") String protectedItemName,
            @PathParam("recoveryPointId") String recoveryPointId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> provisionWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .provision(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            containerName,
                            protectedItemName,
                            recoveryPointId,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> provisionWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .provision(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters,
                accept,
                context);
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> provisionAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters) {
        return provisionWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, parameters)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void provision(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters) {
        provisionAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, parameters)
            .block();
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> provisionWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters,
        Context context) {
        return provisionWithResponseAsync(
                vaultName,
                resourceGroupName,
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters,
                context)
            .block();
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> revokeWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .revoke(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            containerName,
                            protectedItemName,
                            recoveryPointId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> revokeWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .revoke(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                accept,
                context);
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> revokeAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId) {
        return revokeWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void revoke(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId) {
        revokeAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId)
            .block();
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> revokeWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context) {
        return revokeWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, context)
            .block();
    }
}
