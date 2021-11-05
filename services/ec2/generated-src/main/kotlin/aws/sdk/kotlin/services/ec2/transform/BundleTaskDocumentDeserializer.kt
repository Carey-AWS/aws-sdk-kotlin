// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BundleTask
import aws.sdk.kotlin.services.ec2.model.BundleTaskState
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
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeBundleTaskDocument(deserializer: Deserializer): BundleTask {
    val builder = BundleTask.builder()
    val BUNDLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("bundleId"))
    val BUNDLETASKERROR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("error"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("startTime"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STORAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("storage"))
    val UPDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("updateTime"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("BundleTask"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(BUNDLEID_DESCRIPTOR)
        field(BUNDLETASKERROR_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STORAGE_DESCRIPTOR)
        field(UPDATETIME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BUNDLEID_DESCRIPTOR.index -> builder.bundleId = deserializeString()
                BUNDLETASKERROR_DESCRIPTOR.index -> builder.bundleTaskError = deserializeBundleTaskErrorDocument(deserializer)
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString().let { Instant.fromIso8601(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { BundleTaskState.fromValue(it) }
                STORAGE_DESCRIPTOR.index -> builder.storage = deserializeStorageDocument(deserializer)
                UPDATETIME_DESCRIPTOR.index -> builder.updateTime = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
