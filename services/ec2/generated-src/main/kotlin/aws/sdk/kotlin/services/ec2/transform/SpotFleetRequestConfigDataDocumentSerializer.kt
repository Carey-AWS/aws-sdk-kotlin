// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal fun serializeSpotFleetRequestConfigDataDocument(serializer: Serializer, input: SpotFleetRequestConfigData) {
    val ALLOCATIONSTRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AllocationStrategy"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val CONTEXT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Context"))
    val EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ExcessCapacityTerminationPolicy"))
    val FULFILLEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("FulfilledCapacity"))
    val IAMFLEETROLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IamFleetRole"))
    val INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceInterruptionBehavior"))
    val INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("InstancePoolsToUseCount"))
    val LAUNCHSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LaunchSpecifications"), FormUrlFlattened)
    val LAUNCHTEMPLATECONFIGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LaunchTemplateConfigs"), FormUrlFlattened)
    val LOADBALANCERSCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("LoadBalancersConfig"))
    val ONDEMANDALLOCATIONSTRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OnDemandAllocationStrategy"))
    val ONDEMANDFULFILLEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("OnDemandFulfilledCapacity"))
    val ONDEMANDMAXTOTALPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OnDemandMaxTotalPrice"))
    val ONDEMANDTARGETCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("OnDemandTargetCapacity"))
    val REPLACEUNHEALTHYINSTANCES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("ReplaceUnhealthyInstances"))
    val SPOTMAINTENANCESTRATEGIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("SpotMaintenanceStrategies"))
    val SPOTMAXTOTALPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SpotMaxTotalPrice"))
    val SPOTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SpotPrice"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val TARGETCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("TargetCapacity"))
    val TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("TerminateInstancesWithExpiration"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Type"))
    val VALIDFROM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("ValidFrom"))
    val VALIDUNTIL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("ValidUntil"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SpotFleetRequestConfigData"))
        field(ALLOCATIONSTRATEGY_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(CONTEXT_DESCRIPTOR)
        field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR)
        field(FULFILLEDCAPACITY_DESCRIPTOR)
        field(IAMFLEETROLE_DESCRIPTOR)
        field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR)
        field(INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR)
        field(LAUNCHSPECIFICATIONS_DESCRIPTOR)
        field(LAUNCHTEMPLATECONFIGS_DESCRIPTOR)
        field(LOADBALANCERSCONFIG_DESCRIPTOR)
        field(ONDEMANDALLOCATIONSTRATEGY_DESCRIPTOR)
        field(ONDEMANDFULFILLEDCAPACITY_DESCRIPTOR)
        field(ONDEMANDMAXTOTALPRICE_DESCRIPTOR)
        field(ONDEMANDTARGETCAPACITY_DESCRIPTOR)
        field(REPLACEUNHEALTHYINSTANCES_DESCRIPTOR)
        field(SPOTMAINTENANCESTRATEGIES_DESCRIPTOR)
        field(SPOTMAXTOTALPRICE_DESCRIPTOR)
        field(SPOTPRICE_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(TARGETCAPACITY_DESCRIPTOR)
        field(TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
        field(VALIDFROM_DESCRIPTOR)
        field(VALIDUNTIL_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.allocationStrategy?.let { field(ALLOCATIONSTRATEGY_DESCRIPTOR, it.value) }
        input.onDemandAllocationStrategy?.let { field(ONDEMANDALLOCATIONSTRATEGY_DESCRIPTOR, it.value) }
        input.spotMaintenanceStrategies?.let { field(SPOTMAINTENANCESTRATEGIES_DESCRIPTOR, it, ::serializeSpotMaintenanceStrategiesDocument) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.excessCapacityTerminationPolicy?.let { field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR, it.value) }
        input.fulfilledCapacity?.let { field(FULFILLEDCAPACITY_DESCRIPTOR, it) }
        input.onDemandFulfilledCapacity?.let { field(ONDEMANDFULFILLEDCAPACITY_DESCRIPTOR, it) }
        input.iamFleetRole?.let { field(IAMFLEETROLE_DESCRIPTOR, it) }
        if (input.launchSpecifications != null) {
            listField(LAUNCHSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.launchSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeSpotFleetLaunchSpecificationDocument))
                }
            }
        }
        if (input.launchTemplateConfigs != null) {
            listField(LAUNCHTEMPLATECONFIGS_DESCRIPTOR) {
                for (el0 in input.launchTemplateConfigs) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLaunchTemplateConfigDocument))
                }
            }
        }
        input.spotPrice?.let { field(SPOTPRICE_DESCRIPTOR, it) }
        input.targetCapacity?.let { field(TARGETCAPACITY_DESCRIPTOR, it) }
        input.onDemandTargetCapacity?.let { field(ONDEMANDTARGETCAPACITY_DESCRIPTOR, it) }
        input.onDemandMaxTotalPrice?.let { field(ONDEMANDMAXTOTALPRICE_DESCRIPTOR, it) }
        input.spotMaxTotalPrice?.let { field(SPOTMAXTOTALPRICE_DESCRIPTOR, it) }
        input.terminateInstancesWithExpiration?.let { field(TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR, it) }
        input.type?.let { field(TYPE_DESCRIPTOR, it.value) }
        input.validFrom?.let { field(VALIDFROM_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.validUntil?.let { field(VALIDUNTIL_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.replaceUnhealthyInstances?.let { field(REPLACEUNHEALTHYINSTANCES_DESCRIPTOR, it) }
        input.instanceInterruptionBehavior?.let { field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR, it.value) }
        input.loadBalancersConfig?.let { field(LOADBALANCERSCONFIG_DESCRIPTOR, it, ::serializeLoadBalancersConfigDocument) }
        input.instancePoolsToUseCount?.let { field(INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR, it) }
        input.context?.let { field(CONTEXT_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
    }
}
