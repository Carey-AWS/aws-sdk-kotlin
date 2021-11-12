// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FpgaImage
import aws.sdk.kotlin.services.ec2.model.ProductCode
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
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeFpgaImageDocument(deserializer: Deserializer): FpgaImage {
    val builder = FpgaImage.builder()
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val DATARETENTIONSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("dataRetentionSupport"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val FPGAIMAGEGLOBALID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("fpgaImageGlobalId"))
    val FPGAIMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("fpgaImageId"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("name"))
    val OWNERALIAS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerAlias"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PCIID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("pciId"))
    val PRODUCTCODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("productCodes"), XmlCollectionName("item"))
    val PUBLIC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("public"))
    val SHELLVERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("shellVersion"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tags"), XmlCollectionName("item"))
    val UPDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("updateTime"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FpgaImage"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CREATETIME_DESCRIPTOR)
        field(DATARETENTIONSUPPORT_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(FPGAIMAGEGLOBALID_DESCRIPTOR)
        field(FPGAIMAGEID_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(OWNERALIAS_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PCIID_DESCRIPTOR)
        field(PRODUCTCODES_DESCRIPTOR)
        field(PUBLIC_DESCRIPTOR)
        field(SHELLVERSION_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(UPDATETIME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                DATARETENTIONSUPPORT_DESCRIPTOR.index -> builder.dataRetentionSupport = deserializeBoolean()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                FPGAIMAGEGLOBALID_DESCRIPTOR.index -> builder.fpgaImageGlobalId = deserializeString()
                FPGAIMAGEID_DESCRIPTOR.index -> builder.fpgaImageId = deserializeString()
                NAME_DESCRIPTOR.index -> builder.name = deserializeString()
                OWNERALIAS_DESCRIPTOR.index -> builder.ownerAlias = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PCIID_DESCRIPTOR.index -> builder.pciId = deserializePciIdDocument(deserializer)
                PRODUCTCODES_DESCRIPTOR.index -> builder.productCodes =
                    deserializer.deserializeList(PRODUCTCODES_DESCRIPTOR) {
                        val col0 = mutableListOf<ProductCode>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeProductCodeDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PUBLIC_DESCRIPTOR.index -> builder.public = deserializeBoolean()
                SHELLVERSION_DESCRIPTOR.index -> builder.shellVersion = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeFpgaImageStateDocument(deserializer)
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                UPDATETIME_DESCRIPTOR.index -> builder.updateTime = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
