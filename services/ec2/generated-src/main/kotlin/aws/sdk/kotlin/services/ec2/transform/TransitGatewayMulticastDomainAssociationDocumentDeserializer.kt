// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType
import aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociation
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


internal fun deserializeTransitGatewayMulticastDomainAssociationDocument(deserializer: Deserializer): TransitGatewayMulticastDomainAssociation {
    val builder = TransitGatewayMulticastDomainAssociation.builder()
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val RESOURCEOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceOwnerId"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceType"))
    val SUBNET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("subnet"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayMulticastDomainAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCEOWNERID_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
        field(SUBNET_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                RESOURCEOWNERID_DESCRIPTOR.index -> builder.resourceOwnerId = deserializeString()
                RESOURCETYPE_DESCRIPTOR.index -> builder.resourceType = deserializeString().let { TransitGatewayAttachmentResourceType.fromValue(it) }
                SUBNET_DESCRIPTOR.index -> builder.subnet = deserializeSubnetAssociationDocument(deserializer)
                TRANSITGATEWAYATTACHMENTID_DESCRIPTOR.index -> builder.transitGatewayAttachmentId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
