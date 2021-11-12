// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.KeyPairInfo
import aws.sdk.kotlin.services.ec2.model.KeyType
import aws.sdk.kotlin.services.ec2.model.Tag
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


internal fun deserializeKeyPairInfoDocument(deserializer: Deserializer): KeyPairInfo {
    val builder = KeyPairInfo.builder()
    val KEYFINGERPRINT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyFingerprint"))
    val KEYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyName"))
    val KEYPAIRID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyPairId"))
    val KEYTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyType"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("KeyPairInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(KEYFINGERPRINT_DESCRIPTOR)
        field(KEYNAME_DESCRIPTOR)
        field(KEYPAIRID_DESCRIPTOR)
        field(KEYTYPE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                KEYFINGERPRINT_DESCRIPTOR.index -> builder.keyFingerprint = deserializeString()
                KEYNAME_DESCRIPTOR.index -> builder.keyName = deserializeString()
                KEYPAIRID_DESCRIPTOR.index -> builder.keyPairId = deserializeString()
                KEYTYPE_DESCRIPTOR.index -> builder.keyType = deserializeString().let { KeyType.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
