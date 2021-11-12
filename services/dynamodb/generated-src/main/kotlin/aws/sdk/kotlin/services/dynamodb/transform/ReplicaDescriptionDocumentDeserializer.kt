// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ReplicaDescription
import aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexDescription
import aws.sdk.kotlin.services.dynamodb.model.ReplicaStatus
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


internal fun deserializeReplicaDescriptionDocument(deserializer: Deserializer): ReplicaDescription {
    val builder = ReplicaDescription.builder()
    val GLOBALSECONDARYINDEXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("GlobalSecondaryIndexes"))
    val KMSMASTERKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("KMSMasterKeyId"))
    val PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ProvisionedThroughputOverride"))
    val REGIONNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("RegionName"))
    val REPLICAINACCESSIBLEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("ReplicaInaccessibleDateTime"))
    val REPLICASTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReplicaStatus"))
    val REPLICASTATUSDESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReplicaStatusDescription"))
    val REPLICASTATUSPERCENTPROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReplicaStatusPercentProgress"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALSECONDARYINDEXES_DESCRIPTOR)
        field(KMSMASTERKEYID_DESCRIPTOR)
        field(PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR)
        field(REGIONNAME_DESCRIPTOR)
        field(REPLICAINACCESSIBLEDATETIME_DESCRIPTOR)
        field(REPLICASTATUS_DESCRIPTOR)
        field(REPLICASTATUSDESCRIPTION_DESCRIPTOR)
        field(REPLICASTATUSPERCENTPROGRESS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GLOBALSECONDARYINDEXES_DESCRIPTOR.index -> builder.globalSecondaryIndexes =
                    deserializer.deserializeList(GLOBALSECONDARYINDEXES_DESCRIPTOR) {
                        val col0 = mutableListOf<ReplicaGlobalSecondaryIndexDescription>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeReplicaGlobalSecondaryIndexDescriptionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                KMSMASTERKEYID_DESCRIPTOR.index -> builder.kmsMasterKeyId = deserializeString()
                PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR.index -> builder.provisionedThroughputOverride = deserializeProvisionedThroughputOverrideDocument(deserializer)
                REGIONNAME_DESCRIPTOR.index -> builder.regionName = deserializeString()
                REPLICAINACCESSIBLEDATETIME_DESCRIPTOR.index -> builder.replicaInaccessibleDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                REPLICASTATUS_DESCRIPTOR.index -> builder.replicaStatus = deserializeString().let { ReplicaStatus.fromValue(it) }
                REPLICASTATUSDESCRIPTION_DESCRIPTOR.index -> builder.replicaStatusDescription = deserializeString()
                REPLICASTATUSPERCENTPROGRESS_DESCRIPTOR.index -> builder.replicaStatusPercentProgress = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
