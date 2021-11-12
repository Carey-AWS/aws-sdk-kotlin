// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ResourceType
import aws.sdk.kotlin.services.ec2.model.TagDescription
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


internal suspend fun deserializeTagDescriptionDocument(deserializer: Deserializer): TagDescription {
    val builder = TagDescription.builder()
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("key"))
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceType"))
    val VALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("value"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TagDescription"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(KEY_DESCRIPTOR)
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
        field(VALUE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                RESOURCETYPE_DESCRIPTOR.index -> builder.resourceType = deserializeString().let { ResourceType.fromValue(it) }
                VALUE_DESCRIPTOR.index -> builder.value = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
