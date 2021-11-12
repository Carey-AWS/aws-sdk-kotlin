// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride
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


internal suspend fun deserializeProvisionedThroughputOverrideDocument(deserializer: Deserializer): ProvisionedThroughputOverride {
    val builder = ProvisionedThroughputOverride.builder()
    val READCAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ReadCapacityUnits"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(READCAPACITYUNITS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                READCAPACITYUNITS_DESCRIPTOR.index -> builder.readCapacityUnits = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
