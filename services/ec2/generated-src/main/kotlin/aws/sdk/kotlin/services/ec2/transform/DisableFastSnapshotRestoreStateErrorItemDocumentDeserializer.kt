// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DisableFastSnapshotRestoreStateErrorItem
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeDisableFastSnapshotRestoreStateErrorItemDocument(deserializer: Deserializer): DisableFastSnapshotRestoreStateErrorItem {
    val builder = DisableFastSnapshotRestoreStateErrorItem.builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val ERROR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("error"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DisableFastSnapshotRestoreStateErrorItem"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(ERROR_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                ERROR_DESCRIPTOR.index -> builder.error = deserializeDisableFastSnapshotRestoreStateErrorDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
