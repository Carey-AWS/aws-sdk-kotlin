// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ScheduledInstancesLaunchSpecification
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


internal fun serializeScheduledInstancesLaunchSpecificationDocument(serializer: Serializer, input: ScheduledInstancesLaunchSpecification) {
    val BLOCKDEVICEMAPPINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("BlockDeviceMapping"), FormUrlFlattened)
    val EBSOPTIMIZED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EbsOptimized"))
    val IAMINSTANCEPROFILE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("IamInstanceProfile"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImageId"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceType"))
    val KERNELID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KernelId"))
    val KEYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KeyName"))
    val MONITORING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Monitoring"))
    val NETWORKINTERFACES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkInterface"), FormUrlFlattened)
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Placement"))
    val RAMDISKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RamdiskId"))
    val SECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SecurityGroupId"), FormUrlFlattened)
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val USERDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("UserData"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ScheduledInstancesLaunchSpecification"))
        field(BLOCKDEVICEMAPPINGS_DESCRIPTOR)
        field(EBSOPTIMIZED_DESCRIPTOR)
        field(IAMINSTANCEPROFILE_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(KERNELID_DESCRIPTOR)
        field(KEYNAME_DESCRIPTOR)
        field(MONITORING_DESCRIPTOR)
        field(NETWORKINTERFACES_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(RAMDISKID_DESCRIPTOR)
        field(SECURITYGROUPIDS_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(USERDATA_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.blockDeviceMappings != null) {
            listField(BLOCKDEVICEMAPPINGS_DESCRIPTOR) {
                for (el0 in input.blockDeviceMappings) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeScheduledInstancesBlockDeviceMappingDocument))
                }
            }
        }
        input.ebsOptimized?.let { field(EBSOPTIMIZED_DESCRIPTOR, it) }
        input.iamInstanceProfile?.let { field(IAMINSTANCEPROFILE_DESCRIPTOR, it, ::serializeScheduledInstancesIamInstanceProfileDocument) }
        input.imageId?.let { field(IMAGEID_DESCRIPTOR, it) }
        input.instanceType?.let { field(INSTANCETYPE_DESCRIPTOR, it) }
        input.kernelId?.let { field(KERNELID_DESCRIPTOR, it) }
        input.keyName?.let { field(KEYNAME_DESCRIPTOR, it) }
        input.monitoring?.let { field(MONITORING_DESCRIPTOR, it, ::serializeScheduledInstancesMonitoringDocument) }
        if (input.networkInterfaces != null) {
            listField(NETWORKINTERFACES_DESCRIPTOR) {
                for (el0 in input.networkInterfaces) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeScheduledInstancesNetworkInterfaceDocument))
                }
            }
        }
        input.placement?.let { field(PLACEMENT_DESCRIPTOR, it, ::serializeScheduledInstancesPlacementDocument) }
        input.ramdiskId?.let { field(RAMDISKID_DESCRIPTOR, it) }
        if (input.securityGroupIds != null) {
            listField(SECURITYGROUPIDS_DESCRIPTOR) {
                for (el0 in input.securityGroupIds) {
                    serializeString(el0)
                }
            }
        }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
        input.userData?.let { field(USERDATA_DESCRIPTOR, it) }
    }
}
