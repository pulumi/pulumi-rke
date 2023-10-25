# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 debug: Optional[pulumi.Input[bool]] = None,
                 log_file: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            debug=debug,
            log_file=log_file,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             debug: Optional[pulumi.Input[bool]] = None,
             log_file: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if log_file is None and 'logFile' in kwargs:
            log_file = kwargs['logFile']

        if debug is None:
            debug = (_utilities.get_env_bool('RKE_DEBUG') or False)
        if debug is not None:
            _setter("debug", debug)
        if log_file is None:
            log_file = _utilities.get_env('RKE_LOG_FILE')
        if log_file is not None:
            _setter("log_file", log_file)

    @property
    @pulumi.getter
    def debug(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "debug")

    @debug.setter
    def debug(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "debug", value)

    @property
    @pulumi.getter(name="logFile")
    def log_file(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "log_file")

    @log_file.setter
    def log_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_file", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 debug: Optional[pulumi.Input[bool]] = None,
                 log_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the rke package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the rke package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 debug: Optional[pulumi.Input[bool]] = None,
                 log_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            if debug is None:
                debug = (_utilities.get_env_bool('RKE_DEBUG') or False)
            __props__.__dict__["debug"] = pulumi.Output.from_input(debug).apply(pulumi.runtime.to_json) if debug is not None else None
            if log_file is None:
                log_file = _utilities.get_env('RKE_LOG_FILE')
            __props__.__dict__["log_file"] = log_file
        super(Provider, __self__).__init__(
            'rke',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="logFile")
    def log_file(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "log_file")

