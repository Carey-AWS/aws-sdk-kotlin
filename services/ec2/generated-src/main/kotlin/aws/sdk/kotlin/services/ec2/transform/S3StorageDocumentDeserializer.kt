// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.S3Storage
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
import aws.smithy.kotlin.runtime.util.decodeBase64Bytes


internal fun deserializeS3StorageDocument(deserializer: Deserializer): S3Storage {
    val builder = S3Storage.builder()
    val AWSACCESSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("AWSAccessKeyId"))
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("bucket"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("prefix"))
    val UPLOADPOLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Blob, XmlSerialName("uploadPolicy"))
    val UPLOADPOLICYSIGNATURE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("uploadPolicySignature"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("S3Storage"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AWSACCESSKEYID_DESCRIPTOR)
        field(BUCKET_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(UPLOADPOLICY_DESCRIPTOR)
        field(UPLOADPOLICYSIGNATURE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AWSACCESSKEYID_DESCRIPTOR.index -> builder.awsAccessKeyId = deserializeString()
                BUCKET_DESCRIPTOR.index -> builder.bucket = deserializeString()
                PREFIX_DESCRIPTOR.index -> builder.prefix = deserializeString()
                UPLOADPOLICY_DESCRIPTOR.index -> builder.uploadPolicy = deserializeString().decodeBase64Bytes()
                UPLOADPOLICYSIGNATURE_DESCRIPTOR.index -> builder.uploadPolicySignature = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
