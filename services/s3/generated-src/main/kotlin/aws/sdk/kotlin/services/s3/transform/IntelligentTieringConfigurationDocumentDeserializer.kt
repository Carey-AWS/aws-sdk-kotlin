// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration
import aws.sdk.kotlin.services.s3.model.IntelligentTieringStatus
import aws.sdk.kotlin.services.s3.model.Tiering
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeIntelligentTieringConfigurationDocument(deserializer: Deserializer): IntelligentTieringConfiguration {
    val builder = IntelligentTieringConfiguration.builder()
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Id"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val TIERINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Tiering"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("IntelligentTieringConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(TIERINGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FILTER_DESCRIPTOR.index -> builder.filter = deserializeIntelligentTieringFilterDocument(deserializer)
                ID_DESCRIPTOR.index -> builder.id = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { IntelligentTieringStatus.fromValue(it) }
                TIERINGS_DESCRIPTOR.index -> builder.tierings =
                    deserializer.deserializeList(TIERINGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tiering>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTieringDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
