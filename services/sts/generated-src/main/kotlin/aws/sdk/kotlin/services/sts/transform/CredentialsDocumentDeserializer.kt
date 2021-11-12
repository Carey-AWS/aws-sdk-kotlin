// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.services.sts.model.Credentials
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


internal suspend fun deserializeCredentialsDocument(deserializer: Deserializer): Credentials {
    val builder = Credentials.builder()
    val ACCESSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("AccessKeyId"))
    val EXPIRATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("Expiration"))
    val SECRETACCESSKEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SecretAccessKey"))
    val SESSIONTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SessionToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Credentials"))
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        field(ACCESSKEYID_DESCRIPTOR)
        field(EXPIRATION_DESCRIPTOR)
        field(SECRETACCESSKEY_DESCRIPTOR)
        field(SESSIONTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCESSKEYID_DESCRIPTOR.index -> builder.accessKeyId = deserializeString()
                EXPIRATION_DESCRIPTOR.index -> builder.expiration = deserializeString().let { Instant.fromIso8601(it) }
                SECRETACCESSKEY_DESCRIPTOR.index -> builder.secretAccessKey = deserializeString()
                SESSIONTOKEN_DESCRIPTOR.index -> builder.sessionToken = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
