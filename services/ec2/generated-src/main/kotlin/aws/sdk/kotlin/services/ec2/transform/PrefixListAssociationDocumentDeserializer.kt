// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PrefixListAssociation
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


internal fun deserializePrefixListAssociationDocument(deserializer: Deserializer): PrefixListAssociation {
    val builder = PrefixListAssociation.builder()
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val RESOURCEOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceOwner"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PrefixListAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCEOWNER_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                RESOURCEOWNER_DESCRIPTOR.index -> builder.resourceOwner = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
