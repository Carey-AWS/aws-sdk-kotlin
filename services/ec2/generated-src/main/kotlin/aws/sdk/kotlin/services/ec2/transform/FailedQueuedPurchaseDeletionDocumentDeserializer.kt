// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FailedQueuedPurchaseDeletion
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


internal suspend fun deserializeFailedQueuedPurchaseDeletionDocument(deserializer: Deserializer): FailedQueuedPurchaseDeletion {
    val builder = FailedQueuedPurchaseDeletion.builder()
    val ERROR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("error"))
    val RESERVEDINSTANCESID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservedInstancesId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FailedQueuedPurchaseDeletion"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ERROR_DESCRIPTOR)
        field(RESERVEDINSTANCESID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ERROR_DESCRIPTOR.index -> builder.error = deserializeDeleteQueuedReservedInstancesErrorDocument(deserializer)
                RESERVEDINSTANCESID_DESCRIPTOR.index -> builder.reservedInstancesId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
