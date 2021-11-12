// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DestinationFileFormat
import aws.sdk.kotlin.services.ec2.model.DestinationOptionsResponse
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


internal fun deserializeDestinationOptionsResponseDocument(deserializer: Deserializer): DestinationOptionsResponse {
    val builder = DestinationOptionsResponse.builder()
    val FILEFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("fileFormat"))
    val HIVECOMPATIBLEPARTITIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("hiveCompatiblePartitions"))
    val PERHOURPARTITION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("perHourPartition"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DestinationOptionsResponse"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(FILEFORMAT_DESCRIPTOR)
        field(HIVECOMPATIBLEPARTITIONS_DESCRIPTOR)
        field(PERHOURPARTITION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FILEFORMAT_DESCRIPTOR.index -> builder.fileFormat = deserializeString().let { DestinationFileFormat.fromValue(it) }
                HIVECOMPATIBLEPARTITIONS_DESCRIPTOR.index -> builder.hiveCompatiblePartitions = deserializeBoolean()
                PERHOURPARTITION_DESCRIPTOR.index -> builder.perHourPartition = deserializeBoolean()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
