// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Protocol
import aws.sdk.kotlin.services.s3.model.Redirect
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


internal fun deserializeRedirectDocument(deserializer: Deserializer): Redirect {
    val builder = Redirect.builder()
    val HOSTNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("HostName"))
    val HTTPREDIRECTCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("HttpRedirectCode"))
    val PROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Protocol"))
    val REPLACEKEYPREFIXWITH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ReplaceKeyPrefixWith"))
    val REPLACEKEYWITH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ReplaceKeyWith"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Redirect"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(HOSTNAME_DESCRIPTOR)
        field(HTTPREDIRECTCODE_DESCRIPTOR)
        field(PROTOCOL_DESCRIPTOR)
        field(REPLACEKEYPREFIXWITH_DESCRIPTOR)
        field(REPLACEKEYWITH_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                HOSTNAME_DESCRIPTOR.index -> builder.hostName = deserializeString()
                HTTPREDIRECTCODE_DESCRIPTOR.index -> builder.httpRedirectCode = deserializeString()
                PROTOCOL_DESCRIPTOR.index -> builder.protocol = deserializeString().let { Protocol.fromValue(it) }
                REPLACEKEYPREFIXWITH_DESCRIPTOR.index -> builder.replaceKeyPrefixWith = deserializeString()
                REPLACEKEYWITH_DESCRIPTOR.index -> builder.replaceKeyWith = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
