// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderAzureCloudConfig {
    /**
     * @return The password of the client certificate for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    private @Nullable String aadClientCertPassword;
    /**
     * @return The path of a client certificate for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    private @Nullable String aadClientCertPath;
    /**
     * @return The ClientID for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    private String aadClientId;
    /**
     * @return The ClientSecret for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    private String aadClientSecret;
    /**
     * @return The cloud environment identifier. Takes values from https://github.com/Azure/go-autorest/blob/ec5f4903f77ed9927ac95b19ab8e44ada64c1356/autorest/azure/environments.go#L13
     * 
     */
    private @Nullable String cloud;
    /**
     * @return Enable exponential backoff to manage resource request retries
     * 
     */
    private @Nullable Boolean cloudProviderBackoff;
    /**
     * @return Backoff duration
     * 
     */
    private @Nullable Integer cloudProviderBackoffDuration;
    /**
     * @return Backoff exponent
     * 
     */
    private @Nullable Integer cloudProviderBackoffExponent;
    /**
     * @return Backoff jitter
     * 
     */
    private @Nullable Integer cloudProviderBackoffJitter;
    /**
     * @return Backoff retry limit
     * 
     */
    private @Nullable Integer cloudProviderBackoffRetries;
    /**
     * @return Enable rate limiting
     * 
     */
    private @Nullable Boolean cloudProviderRateLimit;
    private @Nullable Integer cloudProviderRateLimitBucket;
    /**
     * @return Rate limit QPS
     * 
     */
    private @Nullable Integer cloudProviderRateLimitQps;
    /**
     * @return Load balancer type (basic | standard). Must be standard for auto-scaling
     * 
     */
    private @Nullable String loadBalancerSku;
    /**
     * @return The location of the resource group that the cluster is deployed in
     * 
     */
    private @Nullable String location;
    /**
     * @return Maximum allowed LoadBalancer Rule Count is the limit enforced by Azure Load balancer
     * 
     */
    private @Nullable Integer maximumLoadBalancerRuleCount;
    /**
     * @return The name of the availability set that should be used as the load balancer backendIf this is set, the Azure cloudprovider will only add nodes from that availability set to the loadbalancer backend pool. If this is not set, and multiple agent pools (availability sets) are used, thenthe cloudprovider will try to add all nodes to a single backend pool which is forbidden.In other words, if you use multiple agent pools (availability sets), you MUST set this field.
     * 
     */
    private @Nullable String primaryAvailabilitySetName;
    /**
     * @return The name of the scale set that should be used as the load balancer backend.If this is set, the Azure cloudprovider will only add nodes from that scale set to the loadbalancer backend pool. If this is not set, and multiple agent pools (scale sets) are used, thenthe cloudprovider will try to add all nodes to a single backend pool which is forbidden.In other words, if you use multiple agent pools (scale sets), you MUST set this field.
     * 
     */
    private @Nullable String primaryScaleSetName;
    /**
     * @return The name of the resource group that the cluster is deployed in
     * 
     */
    private @Nullable String resourceGroup;
    /**
     * @return (Optional in 1.6) The name of the route table attached to the subnet that the cluster is deployed in
     * 
     */
    private @Nullable String routeTableName;
    /**
     * @return The name of the security group attached to the cluster&#39;s subnet
     * 
     */
    private @Nullable String securityGroupName;
    /**
     * @return The name of the Subnet that the cluster is deployed in
     * 
     */
    private @Nullable String subnetName;
    /**
     * @return The ID of the Azure Subscription that the cluster is deployed in
     * 
     */
    private String subscriptionId;
    /**
     * @return The AAD Tenant ID for the Subscription that the cluster is deployed in
     * 
     */
    private String tenantId;
    /**
     * @return Use instance metadata service where possible
     * 
     */
    private @Nullable Boolean useInstanceMetadata;
    /**
     * @return Use managed service identity for the virtual machine to access Azure ARM APIs
     * 
     */
    private @Nullable Boolean useManagedIdentityExtension;
    /**
     * @return The type of azure nodes. If not set, it will be default to standard.
     * 
     */
    private @Nullable String vmType;
    /**
     * @return The name of the VNet that the cluster is deployed in
     * 
     */
    private @Nullable String vnetName;
    /**
     * @return The name of the resource group that the Vnet is deployed in
     * 
     */
    private @Nullable String vnetResourceGroup;

    private ClusterCloudProviderAzureCloudConfig() {}
    /**
     * @return The password of the client certificate for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    public Optional<String> aadClientCertPassword() {
        return Optional.ofNullable(this.aadClientCertPassword);
    }
    /**
     * @return The path of a client certificate for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    public Optional<String> aadClientCertPath() {
        return Optional.ofNullable(this.aadClientCertPath);
    }
    /**
     * @return The ClientID for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    public String aadClientId() {
        return this.aadClientId;
    }
    /**
     * @return The ClientSecret for an AAD application with RBAC access to talk to Azure RM APIs
     * 
     */
    public String aadClientSecret() {
        return this.aadClientSecret;
    }
    /**
     * @return The cloud environment identifier. Takes values from https://github.com/Azure/go-autorest/blob/ec5f4903f77ed9927ac95b19ab8e44ada64c1356/autorest/azure/environments.go#L13
     * 
     */
    public Optional<String> cloud() {
        return Optional.ofNullable(this.cloud);
    }
    /**
     * @return Enable exponential backoff to manage resource request retries
     * 
     */
    public Optional<Boolean> cloudProviderBackoff() {
        return Optional.ofNullable(this.cloudProviderBackoff);
    }
    /**
     * @return Backoff duration
     * 
     */
    public Optional<Integer> cloudProviderBackoffDuration() {
        return Optional.ofNullable(this.cloudProviderBackoffDuration);
    }
    /**
     * @return Backoff exponent
     * 
     */
    public Optional<Integer> cloudProviderBackoffExponent() {
        return Optional.ofNullable(this.cloudProviderBackoffExponent);
    }
    /**
     * @return Backoff jitter
     * 
     */
    public Optional<Integer> cloudProviderBackoffJitter() {
        return Optional.ofNullable(this.cloudProviderBackoffJitter);
    }
    /**
     * @return Backoff retry limit
     * 
     */
    public Optional<Integer> cloudProviderBackoffRetries() {
        return Optional.ofNullable(this.cloudProviderBackoffRetries);
    }
    /**
     * @return Enable rate limiting
     * 
     */
    public Optional<Boolean> cloudProviderRateLimit() {
        return Optional.ofNullable(this.cloudProviderRateLimit);
    }
    public Optional<Integer> cloudProviderRateLimitBucket() {
        return Optional.ofNullable(this.cloudProviderRateLimitBucket);
    }
    /**
     * @return Rate limit QPS
     * 
     */
    public Optional<Integer> cloudProviderRateLimitQps() {
        return Optional.ofNullable(this.cloudProviderRateLimitQps);
    }
    /**
     * @return Load balancer type (basic | standard). Must be standard for auto-scaling
     * 
     */
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * @return The location of the resource group that the cluster is deployed in
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Maximum allowed LoadBalancer Rule Count is the limit enforced by Azure Load balancer
     * 
     */
    public Optional<Integer> maximumLoadBalancerRuleCount() {
        return Optional.ofNullable(this.maximumLoadBalancerRuleCount);
    }
    /**
     * @return The name of the availability set that should be used as the load balancer backendIf this is set, the Azure cloudprovider will only add nodes from that availability set to the loadbalancer backend pool. If this is not set, and multiple agent pools (availability sets) are used, thenthe cloudprovider will try to add all nodes to a single backend pool which is forbidden.In other words, if you use multiple agent pools (availability sets), you MUST set this field.
     * 
     */
    public Optional<String> primaryAvailabilitySetName() {
        return Optional.ofNullable(this.primaryAvailabilitySetName);
    }
    /**
     * @return The name of the scale set that should be used as the load balancer backend.If this is set, the Azure cloudprovider will only add nodes from that scale set to the loadbalancer backend pool. If this is not set, and multiple agent pools (scale sets) are used, thenthe cloudprovider will try to add all nodes to a single backend pool which is forbidden.In other words, if you use multiple agent pools (scale sets), you MUST set this field.
     * 
     */
    public Optional<String> primaryScaleSetName() {
        return Optional.ofNullable(this.primaryScaleSetName);
    }
    /**
     * @return The name of the resource group that the cluster is deployed in
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return (Optional in 1.6) The name of the route table attached to the subnet that the cluster is deployed in
     * 
     */
    public Optional<String> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }
    /**
     * @return The name of the security group attached to the cluster&#39;s subnet
     * 
     */
    public Optional<String> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }
    /**
     * @return The name of the Subnet that the cluster is deployed in
     * 
     */
    public Optional<String> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }
    /**
     * @return The ID of the Azure Subscription that the cluster is deployed in
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return The AAD Tenant ID for the Subscription that the cluster is deployed in
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Use instance metadata service where possible
     * 
     */
    public Optional<Boolean> useInstanceMetadata() {
        return Optional.ofNullable(this.useInstanceMetadata);
    }
    /**
     * @return Use managed service identity for the virtual machine to access Azure ARM APIs
     * 
     */
    public Optional<Boolean> useManagedIdentityExtension() {
        return Optional.ofNullable(this.useManagedIdentityExtension);
    }
    /**
     * @return The type of azure nodes. If not set, it will be default to standard.
     * 
     */
    public Optional<String> vmType() {
        return Optional.ofNullable(this.vmType);
    }
    /**
     * @return The name of the VNet that the cluster is deployed in
     * 
     */
    public Optional<String> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }
    /**
     * @return The name of the resource group that the Vnet is deployed in
     * 
     */
    public Optional<String> vnetResourceGroup() {
        return Optional.ofNullable(this.vnetResourceGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderAzureCloudConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aadClientCertPassword;
        private @Nullable String aadClientCertPath;
        private String aadClientId;
        private String aadClientSecret;
        private @Nullable String cloud;
        private @Nullable Boolean cloudProviderBackoff;
        private @Nullable Integer cloudProviderBackoffDuration;
        private @Nullable Integer cloudProviderBackoffExponent;
        private @Nullable Integer cloudProviderBackoffJitter;
        private @Nullable Integer cloudProviderBackoffRetries;
        private @Nullable Boolean cloudProviderRateLimit;
        private @Nullable Integer cloudProviderRateLimitBucket;
        private @Nullable Integer cloudProviderRateLimitQps;
        private @Nullable String loadBalancerSku;
        private @Nullable String location;
        private @Nullable Integer maximumLoadBalancerRuleCount;
        private @Nullable String primaryAvailabilitySetName;
        private @Nullable String primaryScaleSetName;
        private @Nullable String resourceGroup;
        private @Nullable String routeTableName;
        private @Nullable String securityGroupName;
        private @Nullable String subnetName;
        private String subscriptionId;
        private String tenantId;
        private @Nullable Boolean useInstanceMetadata;
        private @Nullable Boolean useManagedIdentityExtension;
        private @Nullable String vmType;
        private @Nullable String vnetName;
        private @Nullable String vnetResourceGroup;
        public Builder() {}
        public Builder(ClusterCloudProviderAzureCloudConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientCertPassword = defaults.aadClientCertPassword;
    	      this.aadClientCertPath = defaults.aadClientCertPath;
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadClientSecret = defaults.aadClientSecret;
    	      this.cloud = defaults.cloud;
    	      this.cloudProviderBackoff = defaults.cloudProviderBackoff;
    	      this.cloudProviderBackoffDuration = defaults.cloudProviderBackoffDuration;
    	      this.cloudProviderBackoffExponent = defaults.cloudProviderBackoffExponent;
    	      this.cloudProviderBackoffJitter = defaults.cloudProviderBackoffJitter;
    	      this.cloudProviderBackoffRetries = defaults.cloudProviderBackoffRetries;
    	      this.cloudProviderRateLimit = defaults.cloudProviderRateLimit;
    	      this.cloudProviderRateLimitBucket = defaults.cloudProviderRateLimitBucket;
    	      this.cloudProviderRateLimitQps = defaults.cloudProviderRateLimitQps;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.location = defaults.location;
    	      this.maximumLoadBalancerRuleCount = defaults.maximumLoadBalancerRuleCount;
    	      this.primaryAvailabilitySetName = defaults.primaryAvailabilitySetName;
    	      this.primaryScaleSetName = defaults.primaryScaleSetName;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.routeTableName = defaults.routeTableName;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.subnetName = defaults.subnetName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.useInstanceMetadata = defaults.useInstanceMetadata;
    	      this.useManagedIdentityExtension = defaults.useManagedIdentityExtension;
    	      this.vmType = defaults.vmType;
    	      this.vnetName = defaults.vnetName;
    	      this.vnetResourceGroup = defaults.vnetResourceGroup;
        }

        @CustomType.Setter
        public Builder aadClientCertPassword(@Nullable String aadClientCertPassword) {

            this.aadClientCertPassword = aadClientCertPassword;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientCertPath(@Nullable String aadClientCertPath) {

            this.aadClientCertPath = aadClientCertPath;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientId(String aadClientId) {
            if (aadClientId == null) {
              throw new MissingRequiredPropertyException("ClusterCloudProviderAzureCloudConfig", "aadClientId");
            }
            this.aadClientId = aadClientId;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientSecret(String aadClientSecret) {
            if (aadClientSecret == null) {
              throw new MissingRequiredPropertyException("ClusterCloudProviderAzureCloudConfig", "aadClientSecret");
            }
            this.aadClientSecret = aadClientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder cloud(@Nullable String cloud) {

            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoff(@Nullable Boolean cloudProviderBackoff) {

            this.cloudProviderBackoff = cloudProviderBackoff;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffDuration(@Nullable Integer cloudProviderBackoffDuration) {

            this.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffExponent(@Nullable Integer cloudProviderBackoffExponent) {

            this.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffJitter(@Nullable Integer cloudProviderBackoffJitter) {

            this.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffRetries(@Nullable Integer cloudProviderBackoffRetries) {

            this.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimit(@Nullable Boolean cloudProviderRateLimit) {

            this.cloudProviderRateLimit = cloudProviderRateLimit;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitBucket(@Nullable Integer cloudProviderRateLimitBucket) {

            this.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitQps(@Nullable Integer cloudProviderRateLimitQps) {

            this.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {

            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder maximumLoadBalancerRuleCount(@Nullable Integer maximumLoadBalancerRuleCount) {

            this.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            return this;
        }
        @CustomType.Setter
        public Builder primaryAvailabilitySetName(@Nullable String primaryAvailabilitySetName) {

            this.primaryAvailabilitySetName = primaryAvailabilitySetName;
            return this;
        }
        @CustomType.Setter
        public Builder primaryScaleSetName(@Nullable String primaryScaleSetName) {

            this.primaryScaleSetName = primaryScaleSetName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(@Nullable String resourceGroup) {

            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableName(@Nullable String routeTableName) {

            this.routeTableName = routeTableName;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupName(@Nullable String securityGroupName) {

            this.securityGroupName = securityGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder subnetName(@Nullable String subnetName) {

            this.subnetName = subnetName;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            if (subscriptionId == null) {
              throw new MissingRequiredPropertyException("ClusterCloudProviderAzureCloudConfig", "subscriptionId");
            }
            this.subscriptionId = subscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("ClusterCloudProviderAzureCloudConfig", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder useInstanceMetadata(@Nullable Boolean useInstanceMetadata) {

            this.useInstanceMetadata = useInstanceMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder useManagedIdentityExtension(@Nullable Boolean useManagedIdentityExtension) {

            this.useManagedIdentityExtension = useManagedIdentityExtension;
            return this;
        }
        @CustomType.Setter
        public Builder vmType(@Nullable String vmType) {

            this.vmType = vmType;
            return this;
        }
        @CustomType.Setter
        public Builder vnetName(@Nullable String vnetName) {

            this.vnetName = vnetName;
            return this;
        }
        @CustomType.Setter
        public Builder vnetResourceGroup(@Nullable String vnetResourceGroup) {

            this.vnetResourceGroup = vnetResourceGroup;
            return this;
        }
        public ClusterCloudProviderAzureCloudConfig build() {
            final var _resultValue = new ClusterCloudProviderAzureCloudConfig();
            _resultValue.aadClientCertPassword = aadClientCertPassword;
            _resultValue.aadClientCertPath = aadClientCertPath;
            _resultValue.aadClientId = aadClientId;
            _resultValue.aadClientSecret = aadClientSecret;
            _resultValue.cloud = cloud;
            _resultValue.cloudProviderBackoff = cloudProviderBackoff;
            _resultValue.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            _resultValue.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            _resultValue.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            _resultValue.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            _resultValue.cloudProviderRateLimit = cloudProviderRateLimit;
            _resultValue.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            _resultValue.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            _resultValue.loadBalancerSku = loadBalancerSku;
            _resultValue.location = location;
            _resultValue.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            _resultValue.primaryAvailabilitySetName = primaryAvailabilitySetName;
            _resultValue.primaryScaleSetName = primaryScaleSetName;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.routeTableName = routeTableName;
            _resultValue.securityGroupName = securityGroupName;
            _resultValue.subnetName = subnetName;
            _resultValue.subscriptionId = subscriptionId;
            _resultValue.tenantId = tenantId;
            _resultValue.useInstanceMetadata = useInstanceMetadata;
            _resultValue.useManagedIdentityExtension = useManagedIdentityExtension;
            _resultValue.vmType = vmType;
            _resultValue.vnetName = vnetName;
            _resultValue.vnetResourceGroup = vnetResourceGroup;
            return _resultValue;
        }
    }
}
