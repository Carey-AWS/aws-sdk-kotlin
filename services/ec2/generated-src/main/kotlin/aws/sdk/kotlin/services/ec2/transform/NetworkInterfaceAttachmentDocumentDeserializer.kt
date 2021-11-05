// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AttachmentStatus
import aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttachment
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
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeNetworkInterfaceAttachmentDocument(deserializer: Deserializer): NetworkInterfaceAttachment {
    val builder = NetworkInterfaceAttachment.builder()
    val ATTACHTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("attachTime"))
    val ATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("attachmentId"))
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("deleteOnTermination"))
    val DEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("deviceIndex"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val INSTANCEOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceOwnerId"))
    val NETWORKCARDINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("networkCardIndex"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInterfaceAttachment"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ATTACHTIME_DESCRIPTOR)
        field(ATTACHMENTID_DESCRIPTOR)
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(DEVICEINDEX_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(INSTANCEOWNERID_DESCRIPTOR)
        field(NETWORKCARDINDEX_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTACHTIME_DESCRIPTOR.index -> builder.attachTime = deserializeString().let { Instant.fromIso8601(it) }
                ATTACHMENTID_DESCRIPTOR.index -> builder.attachmentId = deserializeString()
                DELETEONTERMINATION_DESCRIPTOR.index -> builder.deleteOnTermination = deserializeBoolean()
                DEVICEINDEX_DESCRIPTOR.index -> builder.deviceIndex = deserializeInt()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                INSTANCEOWNERID_DESCRIPTOR.index -> builder.instanceOwnerId = deserializeString()
                NETWORKCARDINDEX_DESCRIPTOR.index -> builder.networkCardIndex = deserializeInt()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { AttachmentStatus.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
