// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DiskInfo
import aws.sdk.kotlin.services.ec2.model.EphemeralNvmeSupport
import aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport
import aws.sdk.kotlin.services.ec2.model.InstanceStorageInfo
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeInstanceStorageInfoDocument(deserializer: Deserializer): InstanceStorageInfo {
    val builder = InstanceStorageInfo.builder()
    val DISKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("disks"), XmlCollectionName("item"))
    val ENCRYPTIONSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("encryptionSupport"))
    val NVMESUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nvmeSupport"))
    val TOTALSIZEINGB_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("totalSizeInGB"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceStorageInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DISKS_DESCRIPTOR)
        field(ENCRYPTIONSUPPORT_DESCRIPTOR)
        field(NVMESUPPORT_DESCRIPTOR)
        field(TOTALSIZEINGB_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DISKS_DESCRIPTOR.index -> builder.disks =
                    deserializer.deserializeList(DISKS_DESCRIPTOR) {
                        val col0 = mutableListOf<DiskInfo>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeDiskInfoDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ENCRYPTIONSUPPORT_DESCRIPTOR.index -> builder.encryptionSupport = deserializeString().let { InstanceStorageEncryptionSupport.fromValue(it) }
                NVMESUPPORT_DESCRIPTOR.index -> builder.nvmeSupport = deserializeString().let { EphemeralNvmeSupport.fromValue(it) }
                TOTALSIZEINGB_DESCRIPTOR.index -> builder.totalSizeInGb = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
