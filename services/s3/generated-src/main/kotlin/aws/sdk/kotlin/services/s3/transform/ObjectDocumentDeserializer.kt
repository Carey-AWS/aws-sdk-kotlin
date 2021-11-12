// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Object
import aws.sdk.kotlin.services.s3.model.ObjectStorageClass
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


internal suspend fun deserializeObjectDocument(deserializer: Deserializer): Object {
    val builder = Object.builder()
    val ETAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ETag"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Key"))
    val LASTMODIFIED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("LastModified"))
    val OWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Owner"))
    val SIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("Size"))
    val STORAGECLASS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("StorageClass"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Object"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ETAG_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(LASTMODIFIED_DESCRIPTOR)
        field(OWNER_DESCRIPTOR)
        field(SIZE_DESCRIPTOR)
        field(STORAGECLASS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ETAG_DESCRIPTOR.index -> builder.eTag = deserializeString()
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                LASTMODIFIED_DESCRIPTOR.index -> builder.lastModified = deserializeString().let { Instant.fromIso8601(it) }
                OWNER_DESCRIPTOR.index -> builder.owner = deserializeOwnerDocument(deserializer)
                SIZE_DESCRIPTOR.index -> builder.size = deserializeLong()
                STORAGECLASS_DESCRIPTOR.index -> builder.storageClass = deserializeString().let { ObjectStorageClass.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
