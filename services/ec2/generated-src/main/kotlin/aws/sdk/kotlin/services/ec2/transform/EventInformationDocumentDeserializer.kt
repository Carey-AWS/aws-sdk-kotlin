// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EventInformation
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


internal suspend fun deserializeEventInformationDocument(deserializer: Deserializer): EventInformation {
    val builder = EventInformation.builder()
    val EVENTDESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("eventDescription"))
    val EVENTSUBTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("eventSubType"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("EventInformation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(EVENTDESCRIPTION_DESCRIPTOR)
        field(EVENTSUBTYPE_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EVENTDESCRIPTION_DESCRIPTOR.index -> builder.eventDescription = deserializeString()
                EVENTSUBTYPE_DESCRIPTOR.index -> builder.eventSubType = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
