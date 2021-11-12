// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ExportEnvironment
import aws.sdk.kotlin.services.ec2.model.InstanceExportDetails
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


internal fun deserializeInstanceExportDetailsDocument(deserializer: Deserializer): InstanceExportDetails {
    val builder = InstanceExportDetails.builder()
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val TARGETENVIRONMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("targetEnvironment"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceExportDetails"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(INSTANCEID_DESCRIPTOR)
        field(TARGETENVIRONMENT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                TARGETENVIRONMENT_DESCRIPTOR.index -> builder.targetEnvironment = deserializeString().let { ExportEnvironment.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
