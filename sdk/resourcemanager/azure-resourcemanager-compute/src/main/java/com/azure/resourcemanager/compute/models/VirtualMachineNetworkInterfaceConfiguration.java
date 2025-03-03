// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineNetworkInterfaceConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine network interface configurations. */
@Fluent
public final class VirtualMachineNetworkInterfaceConfiguration {
    /*
     * The network interface configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a virtual machine network profile's IP configuration.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineNetworkInterfaceConfigurationProperties innerProperties;

    /**
     * Get the name property: The network interface configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The network interface configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machine network profile's IP configuration.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineNetworkInterfaceConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     *
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAcceleratedNetworking();
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withEnableAcceleratedNetworking(
        Boolean enableAcceleratedNetworking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFpga();
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withEnableFpga(Boolean enableFpga) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withEnableFpga(enableFpga);
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpForwarding();
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withEnableIpForwarding(Boolean enableIpForwarding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withEnableIpForwarding(enableIpForwarding);
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     *
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroup();
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withDnsSettings(
        VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the ipConfigurations property: Specifies the IP configurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: Specifies the IP configurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withIpConfigurations(
        List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the dscpConfiguration property: The dscpConfiguration property.
     *
     * @return the dscpConfiguration value.
     */
    public SubResource dscpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dscpConfiguration();
    }

    /**
     * Set the dscpConfiguration property: The dscpConfiguration property.
     *
     * @param dscpConfiguration the dscpConfiguration value to set.
     * @return the VirtualMachineNetworkInterfaceConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceConfiguration withDscpConfiguration(SubResource dscpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceConfigurationProperties();
        }
        this.innerProperties().withDscpConfiguration(dscpConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model VirtualMachineNetworkInterfaceConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineNetworkInterfaceConfiguration.class);
}
