// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCloudProviderAwsCloudConfigGlobalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCloudProviderAwsCloudConfigGlobalArgs Empty = new ClusterCloudProviderAwsCloudConfigGlobalArgs();

    /**
     * Disables the automatic ingress creation. Default `false` (bool)
     * 
     */
    @Import(name="disableSecurityGroupIngress")
    private @Nullable Output<Boolean> disableSecurityGroupIngress;

    /**
     * @return Disables the automatic ingress creation. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> disableSecurityGroupIngress() {
        return Optional.ofNullable(this.disableSecurityGroupIngress);
    }

    /**
     * Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
     * 
     */
    @Import(name="disableStrictZoneCheck")
    private @Nullable Output<Boolean> disableStrictZoneCheck;

    /**
     * @return Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> disableStrictZoneCheck() {
        return Optional.ofNullable(this.disableStrictZoneCheck);
    }

    /**
     * Use these ELB security groups instead create new (string)
     * 
     */
    @Import(name="elbSecurityGroup")
    private @Nullable Output<String> elbSecurityGroup;

    /**
     * @return Use these ELB security groups instead create new (string)
     * 
     */
    public Optional<Output<String>> elbSecurityGroup() {
        return Optional.ofNullable(this.elbSecurityGroup);
    }

    /**
     * The cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    @Import(name="kubernetesClusterId")
    private @Nullable Output<String> kubernetesClusterId;

    /**
     * @return The cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    public Optional<Output<String>> kubernetesClusterId() {
        return Optional.ofNullable(this.kubernetesClusterId);
    }

    /**
     * Legacy cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    @Import(name="kubernetesClusterTag")
    private @Nullable Output<String> kubernetesClusterTag;

    /**
     * @return Legacy cluster id we&#39;ll use to identify our cluster resources (string)
     * 
     */
    public Optional<Output<String>> kubernetesClusterTag() {
        return Optional.ofNullable(this.kubernetesClusterTag);
    }

    /**
     * IAM role to assume when interaction with AWS APIs (string)
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return IAM role to assume when interaction with AWS APIs (string)
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Enables using a specific RouteTable (string)
     * 
     */
    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    /**
     * @return Enables using a specific RouteTable (string)
     * 
     */
    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * (string)
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<String> vpc;

    /**
     * @return The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
     * 
     */
    public Optional<Output<String>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    /**
     * The AWS zone (string)
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The AWS zone (string)
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ClusterCloudProviderAwsCloudConfigGlobalArgs() {}

    private ClusterCloudProviderAwsCloudConfigGlobalArgs(ClusterCloudProviderAwsCloudConfigGlobalArgs $) {
        this.disableSecurityGroupIngress = $.disableSecurityGroupIngress;
        this.disableStrictZoneCheck = $.disableStrictZoneCheck;
        this.elbSecurityGroup = $.elbSecurityGroup;
        this.kubernetesClusterId = $.kubernetesClusterId;
        this.kubernetesClusterTag = $.kubernetesClusterTag;
        this.roleArn = $.roleArn;
        this.routeTableId = $.routeTableId;
        this.subnetId = $.subnetId;
        this.vpc = $.vpc;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCloudProviderAwsCloudConfigGlobalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCloudProviderAwsCloudConfigGlobalArgs $;

        public Builder() {
            $ = new ClusterCloudProviderAwsCloudConfigGlobalArgs();
        }

        public Builder(ClusterCloudProviderAwsCloudConfigGlobalArgs defaults) {
            $ = new ClusterCloudProviderAwsCloudConfigGlobalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableSecurityGroupIngress Disables the automatic ingress creation. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableSecurityGroupIngress(@Nullable Output<Boolean> disableSecurityGroupIngress) {
            $.disableSecurityGroupIngress = disableSecurityGroupIngress;
            return this;
        }

        /**
         * @param disableSecurityGroupIngress Disables the automatic ingress creation. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableSecurityGroupIngress(Boolean disableSecurityGroupIngress) {
            return disableSecurityGroupIngress(Output.of(disableSecurityGroupIngress));
        }

        /**
         * @param disableStrictZoneCheck Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableStrictZoneCheck(@Nullable Output<Boolean> disableStrictZoneCheck) {
            $.disableStrictZoneCheck = disableStrictZoneCheck;
            return this;
        }

        /**
         * @param disableStrictZoneCheck Setting this to true will disable the check and provide a warning that the check was skipped. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableStrictZoneCheck(Boolean disableStrictZoneCheck) {
            return disableStrictZoneCheck(Output.of(disableStrictZoneCheck));
        }

        /**
         * @param elbSecurityGroup Use these ELB security groups instead create new (string)
         * 
         * @return builder
         * 
         */
        public Builder elbSecurityGroup(@Nullable Output<String> elbSecurityGroup) {
            $.elbSecurityGroup = elbSecurityGroup;
            return this;
        }

        /**
         * @param elbSecurityGroup Use these ELB security groups instead create new (string)
         * 
         * @return builder
         * 
         */
        public Builder elbSecurityGroup(String elbSecurityGroup) {
            return elbSecurityGroup(Output.of(elbSecurityGroup));
        }

        /**
         * @param kubernetesClusterId The cluster id we&#39;ll use to identify our cluster resources (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(@Nullable Output<String> kubernetesClusterId) {
            $.kubernetesClusterId = kubernetesClusterId;
            return this;
        }

        /**
         * @param kubernetesClusterId The cluster id we&#39;ll use to identify our cluster resources (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(String kubernetesClusterId) {
            return kubernetesClusterId(Output.of(kubernetesClusterId));
        }

        /**
         * @param kubernetesClusterTag Legacy cluster id we&#39;ll use to identify our cluster resources (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterTag(@Nullable Output<String> kubernetesClusterTag) {
            $.kubernetesClusterTag = kubernetesClusterTag;
            return this;
        }

        /**
         * @param kubernetesClusterTag Legacy cluster id we&#39;ll use to identify our cluster resources (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterTag(String kubernetesClusterTag) {
            return kubernetesClusterTag(Output.of(kubernetesClusterTag));
        }

        /**
         * @param roleArn IAM role to assume when interaction with AWS APIs (string)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn IAM role to assume when interaction with AWS APIs (string)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param routeTableId Enables using a specific RouteTable (string)
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId Enables using a specific RouteTable (string)
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param subnetId (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vpc The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc The AWS VPC flag enables the possibility to run the master components on a different aws account, on a different cloud provider or on-premises. If the flag is set also the KubernetesClusterTag must be provided (string)
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        /**
         * @param zone The AWS zone (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The AWS zone (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ClusterCloudProviderAwsCloudConfigGlobalArgs build() {
            return $;
        }
    }

}