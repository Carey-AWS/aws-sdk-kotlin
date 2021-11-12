// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AlternatePathHint
import aws.sdk.kotlin.services.ec2.model.AnalysisStatus
import aws.sdk.kotlin.services.ec2.model.Explanation
import aws.sdk.kotlin.services.ec2.model.NetworkInsightsAnalysis
import aws.sdk.kotlin.services.ec2.model.PathComponent
import aws.sdk.kotlin.services.ec2.model.Tag
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeNetworkInsightsAnalysisDocument(deserializer: Deserializer): NetworkInsightsAnalysis {
    val builder = NetworkInsightsAnalysis.builder()
    val ALTERNATEPATHHINTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("alternatePathHintSet"), XmlCollectionName("item"))
    val EXPLANATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("explanationSet"), XmlCollectionName("item"))
    val FILTERINARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("filterInArnSet"), XmlCollectionName("item"))
    val FORWARDPATHCOMPONENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("forwardPathComponentSet"), XmlCollectionName("item"))
    val NETWORKINSIGHTSANALYSISARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInsightsAnalysisArn"))
    val NETWORKINSIGHTSANALYSISID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInsightsAnalysisId"))
    val NETWORKINSIGHTSPATHID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInsightsPathId"))
    val NETWORKPATHFOUND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("networkPathFound"))
    val RETURNPATHCOMPONENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("returnPathComponentSet"), XmlCollectionName("item"))
    val STARTDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("startDate"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInsightsAnalysis"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ALTERNATEPATHHINTS_DESCRIPTOR)
        field(EXPLANATIONS_DESCRIPTOR)
        field(FILTERINARNS_DESCRIPTOR)
        field(FORWARDPATHCOMPONENTS_DESCRIPTOR)
        field(NETWORKINSIGHTSANALYSISARN_DESCRIPTOR)
        field(NETWORKINSIGHTSANALYSISID_DESCRIPTOR)
        field(NETWORKINSIGHTSPATHID_DESCRIPTOR)
        field(NETWORKPATHFOUND_DESCRIPTOR)
        field(RETURNPATHCOMPONENTS_DESCRIPTOR)
        field(STARTDATE_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ALTERNATEPATHHINTS_DESCRIPTOR.index -> builder.alternatePathHints =
                    deserializer.deserializeList(ALTERNATEPATHHINTS_DESCRIPTOR) {
                        val col0 = mutableListOf<AlternatePathHint>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeAlternatePathHintDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                EXPLANATIONS_DESCRIPTOR.index -> builder.explanations =
                    deserializer.deserializeList(EXPLANATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<Explanation>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeExplanationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                FILTERINARNS_DESCRIPTOR.index -> builder.filterInArns =
                    deserializer.deserializeList(FILTERINARNS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                FORWARDPATHCOMPONENTS_DESCRIPTOR.index -> builder.forwardPathComponents =
                    deserializer.deserializeList(FORWARDPATHCOMPONENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<PathComponent>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePathComponentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NETWORKINSIGHTSANALYSISARN_DESCRIPTOR.index -> builder.networkInsightsAnalysisArn = deserializeString()
                NETWORKINSIGHTSANALYSISID_DESCRIPTOR.index -> builder.networkInsightsAnalysisId = deserializeString()
                NETWORKINSIGHTSPATHID_DESCRIPTOR.index -> builder.networkInsightsPathId = deserializeString()
                NETWORKPATHFOUND_DESCRIPTOR.index -> builder.networkPathFound = deserializeBoolean()
                RETURNPATHCOMPONENTS_DESCRIPTOR.index -> builder.returnPathComponents =
                    deserializer.deserializeList(RETURNPATHCOMPONENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<PathComponent>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePathComponentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                STARTDATE_DESCRIPTOR.index -> builder.startDate = deserializeString().let { Instant.fromIso8601(it) }
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { AnalysisStatus.fromValue(it) }
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
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
