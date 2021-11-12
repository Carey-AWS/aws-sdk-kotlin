// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription
import aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryStatus
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializePointInTimeRecoveryDescriptionDocument(deserializer: Deserializer): PointInTimeRecoveryDescription {
    val builder = PointInTimeRecoveryDescription.builder()
    val EARLIESTRESTORABLEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("EarliestRestorableDateTime"))
    val LATESTRESTORABLEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("LatestRestorableDateTime"))
    val POINTINTIMERECOVERYSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("PointInTimeRecoveryStatus"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(EARLIESTRESTORABLEDATETIME_DESCRIPTOR)
        field(LATESTRESTORABLEDATETIME_DESCRIPTOR)
        field(POINTINTIMERECOVERYSTATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EARLIESTRESTORABLEDATETIME_DESCRIPTOR.index -> builder.earliestRestorableDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                LATESTRESTORABLEDATETIME_DESCRIPTOR.index -> builder.latestRestorableDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                POINTINTIMERECOVERYSTATUS_DESCRIPTOR.index -> builder.pointInTimeRecoveryStatus = deserializeString().let { PointInTimeRecoveryStatus.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
