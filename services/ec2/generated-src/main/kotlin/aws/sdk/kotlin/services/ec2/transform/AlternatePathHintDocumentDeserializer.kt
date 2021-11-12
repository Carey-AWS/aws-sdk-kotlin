// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AlternatePathHint
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


internal suspend fun deserializeAlternatePathHintDocument(deserializer: Deserializer): AlternatePathHint {
    val builder = AlternatePathHint.builder()
    val COMPONENTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("componentArn"))
    val COMPONENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("componentId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AlternatePathHint"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(COMPONENTARN_DESCRIPTOR)
        field(COMPONENTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                COMPONENTARN_DESCRIPTOR.index -> builder.componentArn = deserializeString()
                COMPONENTID_DESCRIPTOR.index -> builder.componentId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
