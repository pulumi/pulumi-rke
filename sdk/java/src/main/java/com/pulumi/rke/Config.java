// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rke;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("rke");
    public Optional<Boolean> debug() {
        return Codegen.booleanProp("debug").config(config).env("RKE_DEBUG").def(false).get();
    }
    public Optional<String> logFile() {
        return Codegen.stringProp("logFile").config(config).env("RKE_LOG_FILE").get();
    }
}
