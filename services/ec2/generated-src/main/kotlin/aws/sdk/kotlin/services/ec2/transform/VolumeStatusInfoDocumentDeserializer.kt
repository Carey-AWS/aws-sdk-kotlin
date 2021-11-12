// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.VolumeStatusDetails
import aws.sdk.kotlin.services.ec2.model.VolumeStatusInfo
import aws.sdk.kotlin.services.ec2.model.VolumeStatusInfoStatus
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


internal suspend fun deserializeVolumeStatusInfoDocument(deserializer: Deserializer): VolumeStatusInfo {
    val builder = VolumeStatusInfo.builder()
    val DETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("details"), XmlCollectionName("item"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VolumeStatusInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DETAILS_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DETAILS_DESCRIPTOR.index -> builder.details =
                    deserializer.deserializeList(DETAILS_DESCRIPTOR) {
                        val col0 = mutableListOf<VolumeStatusDetails>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeVolumeStatusDetailsDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { VolumeStatusInfoStatus.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
