// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.IdFormat
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


internal fun deserializeIdFormatDocument(deserializer: Deserializer): IdFormat {
    val builder = IdFormat.builder()
    val DEADLINE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("deadline"))
    val RESOURCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resource"))
    val USELONGIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("useLongIds"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("IdFormat"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DEADLINE_DESCRIPTOR)
        field(RESOURCE_DESCRIPTOR)
        field(USELONGIDS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DEADLINE_DESCRIPTOR.index -> builder.deadline = deserializeString().let { Instant.fromIso8601(it) }
                RESOURCE_DESCRIPTOR.index -> builder.resource = deserializeString()
                USELONGIDS_DESCRIPTOR.index -> builder.useLongIds = deserializeBoolean()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
