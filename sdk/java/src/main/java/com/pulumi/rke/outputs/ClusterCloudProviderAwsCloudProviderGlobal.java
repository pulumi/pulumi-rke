// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudProviderAwsCloudProviderGlobal {
    /**
     * @return Disables the automatic ingress creation. Default `false` (bool)
     * 
     */
    private @Nullable Boolean disableSecurityGroupIngress;
    /**
     * @return Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
     * 
     */
    private @Nullable Boolean disableStrictZoneCheck;
    /**
     * @return Use these ELB security groups instead create new (string)
     * 
     */
    private @Nullable String elbSecurityGroup;
    /**
     * @return The cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    private @Nullable String kubernetesClusterId;
    /**
     * @return Legacy cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    private @Nullable String kubernetesClusterTag;
    /**
     * @return IAM role to assume when interaction with AWS APIs (string)
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return Enables using a specific RouteTable (string)
     * 
     */
    private @Nullable String routeTableId;
    /**
     * @return (string)
     * 
     */
    private @Nullable String subnetId;
    /**
     * @return The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
     * 
     */
    private @Nullable String vpc;
    /**
     * @return The AWS zone (string)
     * 
     */
    private @Nullable String zone;

    private ClusterCloudProviderAwsCloudProviderGlobal() {}
    /**
     * @return Disables the automatic ingress creation. Default `false` (bool)
     * 
     */
    public Optional<Boolean> disableSecurityGroupIngress() {
        return Optional.ofNullable(this.disableSecurityGroupIngress);
    }
    /**
     * @return Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
     * 
     */
    public Optional<Boolean> disableStrictZoneCheck() {
        return Optional.ofNullable(this.disableStrictZoneCheck);
    }
    /**
     * @return Use these ELB security groups instead create new (string)
     * 
     */
    public Optional<String> elbSecurityGroup() {
        return Optional.ofNullable(this.elbSecurityGroup);
    }
    /**
     * @return The cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    public Optional<String> kubernetesClusterId() {
        return Optional.ofNullable(this.kubernetesClusterId);
    }
    /**
     * @return Legacy cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    public Optional<String> kubernetesClusterTag() {
        return Optional.ofNullable(this.kubernetesClusterTag);
    }
    /**
     * @return IAM role to assume when interaction with AWS APIs (string)
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Enables using a specific RouteTable (string)
     * 
     */
    public Optional<String> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
     * 
     */
    public Optional<String> vpc() {
        return Optional.ofNullable(this.vpc);
    }
    /**
     * @return The AWS zone (string)
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudProviderAwsCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableSecurityGroupIngress;
        private @Nullable Boolean disableStrictZoneCheck;
        private @Nullable String elbSecurityGroup;
        private @Nullable String kubernetesClusterId;
        private @Nullable String kubernetesClusterTag;
        private @Nullable String roleArn;
        private @Nullable String routeTableId;
        private @Nullable String subnetId;
        private @Nullable String vpc;
        private @Nullable String zone;
        public Builder() {}
        public Builder(ClusterCloudProviderAwsCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSecurityGroupIngress = defaults.disableSecurityGroupIngress;
    	      this.disableStrictZoneCheck = defaults.disableStrictZoneCheck;
    	      this.elbSecurityGroup = defaults.elbSecurityGroup;
    	      this.kubernetesClusterId = defaults.kubernetesClusterId;
    	      this.kubernetesClusterTag = defaults.kubernetesClusterTag;
    	      this.roleArn = defaults.roleArn;
    	      this.routeTableId = defaults.routeTableId;
    	      this.subnetId = defaults.subnetId;
    	      this.vpc = defaults.vpc;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder disableSecurityGroupIngress(@Nullable Boolean disableSecurityGroupIngress) {

            this.disableSecurityGroupIngress = disableSecurityGroupIngress;
            return this;
        }
        @CustomType.Setter
        public Builder disableStrictZoneCheck(@Nullable Boolean disableStrictZoneCheck) {

            this.disableStrictZoneCheck = disableStrictZoneCheck;
            return this;
        }
        @CustomType.Setter
        public Builder elbSecurityGroup(@Nullable String elbSecurityGroup) {

            this.elbSecurityGroup = elbSecurityGroup;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesClusterId(@Nullable String kubernetesClusterId) {

            this.kubernetesClusterId = kubernetesClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesClusterTag(@Nullable String kubernetesClusterTag) {

            this.kubernetesClusterTag = kubernetesClusterTag;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(@Nullable String routeTableId) {

            this.routeTableId = routeTableId;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {

            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder vpc(@Nullable String vpc) {

            this.vpc = vpc;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public ClusterCloudProviderAwsCloudProviderGlobal build() {
            final var _resultValue = new ClusterCloudProviderAwsCloudProviderGlobal();
            _resultValue.disableSecurityGroupIngress = disableSecurityGroupIngress;
            _resultValue.disableStrictZoneCheck = disableStrictZoneCheck;
            _resultValue.elbSecurityGroup = elbSecurityGroup;
            _resultValue.kubernetesClusterId = kubernetesClusterId;
            _resultValue.kubernetesClusterTag = kubernetesClusterTag;
            _resultValue.roleArn = roleArn;
            _resultValue.routeTableId = routeTableId;
            _resultValue.subnetId = subnetId;
            _resultValue.vpc = vpc;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
