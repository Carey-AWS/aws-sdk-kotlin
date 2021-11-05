// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EbsEncryptionSupport
import aws.sdk.kotlin.services.ec2.model.EbsInfo
import aws.sdk.kotlin.services.ec2.model.EbsNvmeSupport
import aws.sdk.kotlin.services.ec2.model.EbsOptimizedSupport
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


internal suspend fun deserializeEbsInfoDocument(deserializer: Deserializer): EbsInfo {
    val builder = EbsInfo.builder()
    val EBSOPTIMIZEDINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ebsOptimizedInfo"))
    val EBSOPTIMIZEDSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ebsOptimizedSupport"))
    val ENCRYPTIONSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("encryptionSupport"))
    val NVMESUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nvmeSupport"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("EbsInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(EBSOPTIMIZEDINFO_DESCRIPTOR)
        field(EBSOPTIMIZEDSUPPORT_DESCRIPTOR)
        field(ENCRYPTIONSUPPORT_DESCRIPTOR)
        field(NVMESUPPORT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EBSOPTIMIZEDINFO_DESCRIPTOR.index -> builder.ebsOptimizedInfo = deserializeEbsOptimizedInfoDocument(deserializer)
                EBSOPTIMIZEDSUPPORT_DESCRIPTOR.index -> builder.ebsOptimizedSupport = deserializeString().let { EbsOptimizedSupport.fromValue(it) }
                ENCRYPTIONSUPPORT_DESCRIPTOR.index -> builder.encryptionSupport = deserializeString().let { EbsEncryptionSupport.fromValue(it) }
                NVMESUPPORT_DESCRIPTOR.index -> builder.nvmeSupport = deserializeString().let { EbsNvmeSupport.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
