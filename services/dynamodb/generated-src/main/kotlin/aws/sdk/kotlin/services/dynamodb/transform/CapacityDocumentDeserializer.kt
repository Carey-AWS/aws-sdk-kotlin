// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.Capacity
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun deserializeCapacityDocument(deserializer: Deserializer): Capacity {
    val builder = Capacity.builder()
    val CAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, JsonSerialName("CapacityUnits"))
    val READCAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, JsonSerialName("ReadCapacityUnits"))
    val WRITECAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, JsonSerialName("WriteCapacityUnits"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CAPACITYUNITS_DESCRIPTOR)
        field(READCAPACITYUNITS_DESCRIPTOR)
        field(WRITECAPACITYUNITS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CAPACITYUNITS_DESCRIPTOR.index -> builder.capacityUnits = deserializeDouble()
                READCAPACITYUNITS_DESCRIPTOR.index -> builder.readCapacityUnits = deserializeDouble()
                WRITECAPACITYUNITS_DESCRIPTOR.index -> builder.writeCapacityUnits = deserializeDouble()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
