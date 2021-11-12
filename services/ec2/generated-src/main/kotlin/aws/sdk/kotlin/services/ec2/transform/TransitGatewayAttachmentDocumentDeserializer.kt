// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachment
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentState
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
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeTransitGatewayAttachmentDocument(deserializer: Deserializer): TransitGatewayAttachment {
    val builder = TransitGatewayAttachment.builder()
    val ASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("association"))
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val RESOURCEOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceOwnerId"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceType"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayId"))
    val TRANSITGATEWAYOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayOwnerId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayAttachment"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATION_DESCRIPTOR)
        field(CREATIONTIME_DESCRIPTOR)
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCEOWNERID_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(TRANSITGATEWAYOWNERID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATION_DESCRIPTOR.index -> builder.association = deserializeTransitGatewayAttachmentAssociationDocument(deserializer)
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                RESOURCEOWNERID_DESCRIPTOR.index -> builder.resourceOwnerId = deserializeString()
                RESOURCETYPE_DESCRIPTOR.index -> builder.resourceType = deserializeString().let { TransitGatewayAttachmentResourceType.fromValue(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayAttachmentState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRANSITGATEWAYATTACHMENTID_DESCRIPTOR.index -> builder.transitGatewayAttachmentId = deserializeString()
                TRANSITGATEWAYID_DESCRIPTOR.index -> builder.transitGatewayId = deserializeString()
                TRANSITGATEWAYOWNERID_DESCRIPTOR.index -> builder.transitGatewayOwnerId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
