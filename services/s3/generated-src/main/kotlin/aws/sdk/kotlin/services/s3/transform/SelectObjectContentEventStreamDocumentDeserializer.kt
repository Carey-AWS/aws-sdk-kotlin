// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.SelectObjectContentEventStream
import aws.smithy.kotlin.runtime.serde.DeserializationException
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


internal suspend fun deserializeSelectObjectContentEventStreamDocument(deserializer: Deserializer): SelectObjectContentEventStream {
    var value: SelectObjectContentEventStream? = null
    val CONT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Cont"))
    val END_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("End"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Progress"))
    val RECORDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Records"))
    val STATS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Stats"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SelectObjectContentEventStream"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(CONT_DESCRIPTOR)
        field(END_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(RECORDS_DESCRIPTOR)
        field(STATS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while(true) {
            when(findNextFieldIndex()) {
                CONT_DESCRIPTOR.index -> value = SelectObjectContentEventStream.Cont(deserializeContinuationEventDocument(deserializer))
                END_DESCRIPTOR.index -> value = SelectObjectContentEventStream.End(deserializeEndEventDocument(deserializer))
                PROGRESS_DESCRIPTOR.index -> value = SelectObjectContentEventStream.Progress(deserializeProgressEventDocument(deserializer))
                RECORDS_DESCRIPTOR.index -> value = SelectObjectContentEventStream.Records(deserializeRecordsEventDocument(deserializer))
                STATS_DESCRIPTOR.index -> value = SelectObjectContentEventStream.Stats(deserializeStatsEventDocument(deserializer))
                null -> break@loop
                else -> value = SelectObjectContentEventStream.SdkUnknown.also { skipValue() }
            }
        }
    }
    return value ?: throw DeserializationException("Deserialized value unexpectedly null: SelectObjectContentEventStream")
}
