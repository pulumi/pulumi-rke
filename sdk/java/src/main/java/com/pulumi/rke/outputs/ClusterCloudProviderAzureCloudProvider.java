// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderAzureCloudProvider {
    /**
     * @return (string)
     * 
     */
    private @Nullable String aadClientCertPassword;
    /**
     * @return (string)
     * 
     */
    private @Nullable String aadClientCertPath;
    /**
     * @return (string)
     * 
     */
    private String aadClientId;
    /**
     * @return (string)
     * 
     */
    private String aadClientSecret;
    /**
     * @return (string)
     * 
     */
    private @Nullable String cloud;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean cloudProviderBackoff;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderBackoffDuration;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderBackoffExponent;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderBackoffJitter;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderBackoffRetries;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean cloudProviderRateLimit;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderRateLimitBucket;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer cloudProviderRateLimitQps;
    private @Nullable String loadBalancerSku;
    /**
     * @return (string)
     * 
     */
    private @Nullable String location;
    /**
     * @return (int)
     * 
     */
    private @Nullable Integer maximumLoadBalancerRuleCount;
    /**
     * @return (string)
     * 
     */
    private @Nullable String primaryAvailabilitySetName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String primaryScaleSetName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String resourceGroup;
    /**
     * @return (string)
     * 
     */
    private @Nullable String routeTableName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String securityGroupName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String subnetName;
    /**
     * @return (string)
     * 
     */
    private String subscriptionId;
    /**
     * @return Required if `tenant_name` not provided. (string)
     * 
     */
    private String tenantId;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean useInstanceMetadata;
    /**
     * @return (bool)
     * 
     */
    private @Nullable Boolean useManagedIdentityExtension;
    /**
     * @return (string)
     * 
     */
    private @Nullable String vmType;
    /**
     * @return (string)
     * 
     */
    private @Nullable String vnetName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String vnetResourceGroup;

    private ClusterCloudProviderAzureCloudProvider() {}
    /**
     * @return (string)
     * 
     */
    public Optional<String> aadClientCertPassword() {
        return Optional.ofNullable(this.aadClientCertPassword);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> aadClientCertPath() {
        return Optional.ofNullable(this.aadClientCertPath);
    }
    /**
     * @return (string)
     * 
     */
    public String aadClientId() {
        return this.aadClientId;
    }
    /**
     * @return (string)
     * 
     */
    public String aadClientSecret() {
        return this.aadClientSecret;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> cloud() {
        return Optional.ofNullable(this.cloud);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> cloudProviderBackoff() {
        return Optional.ofNullable(this.cloudProviderBackoff);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderBackoffDuration() {
        return Optional.ofNullable(this.cloudProviderBackoffDuration);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderBackoffExponent() {
        return Optional.ofNullable(this.cloudProviderBackoffExponent);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderBackoffJitter() {
        return Optional.ofNullable(this.cloudProviderBackoffJitter);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderBackoffRetries() {
        return Optional.ofNullable(this.cloudProviderBackoffRetries);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> cloudProviderRateLimit() {
        return Optional.ofNullable(this.cloudProviderRateLimit);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderRateLimitBucket() {
        return Optional.ofNullable(this.cloudProviderRateLimitBucket);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> cloudProviderRateLimitQps() {
        return Optional.ofNullable(this.cloudProviderRateLimitQps);
    }
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return (int)
     * 
     */
    public Optional<Integer> maximumLoadBalancerRuleCount() {
        return Optional.ofNullable(this.maximumLoadBalancerRuleCount);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> primaryAvailabilitySetName() {
        return Optional.ofNullable(this.primaryAvailabilitySetName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> primaryScaleSetName() {
        return Optional.ofNullable(this.primaryScaleSetName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }
    /**
     * @return (string)
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return Required if `tenant_name` not provided. (string)
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> useInstanceMetadata() {
        return Optional.ofNullable(this.useInstanceMetadata);
    }
    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> useManagedIdentityExtension() {
        return Optional.ofNullable(this.useManagedIdentityExtension);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> vmType() {
        return Optional.ofNullable(this.vmType);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> vnetResourceGroup() {
        return Optional.ofNullable(this.vnetResourceGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderAzureCloudProvider defaults) {
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
        public Builder(ClusterCloudProviderAzureCloudProvider defaults) {
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
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }
        @CustomType.Setter
        public Builder aadClientSecret(String aadClientSecret) {
            this.aadClientSecret = Objects.requireNonNull(aadClientSecret);
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
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
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
        public ClusterCloudProviderAzureCloudProvider build() {
            final var _resultValue = new ClusterCloudProviderAzureCloudProvider();
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
