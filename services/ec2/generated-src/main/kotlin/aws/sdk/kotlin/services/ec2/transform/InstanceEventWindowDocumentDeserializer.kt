// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceEventWindow
import aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState
import aws.sdk.kotlin.services.ec2.model.InstanceEventWindowTimeRange
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


internal fun deserializeInstanceEventWindowDocument(deserializer: Deserializer): InstanceEventWindow {
    val builder = InstanceEventWindow.builder()
    val ASSOCIATIONTARGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("associationTarget"))
    val CRONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cronExpression"))
    val INSTANCEEVENTWINDOWID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceEventWindowId"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("name"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TIMERANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("timeRangeSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceEventWindow"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATIONTARGET_DESCRIPTOR)
        field(CRONEXPRESSION_DESCRIPTOR)
        field(INSTANCEEVENTWINDOWID_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TIMERANGES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATIONTARGET_DESCRIPTOR.index -> builder.associationTarget = deserializeInstanceEventWindowAssociationTargetDocument(deserializer)
                CRONEXPRESSION_DESCRIPTOR.index -> builder.cronExpression = deserializeString()
                INSTANCEEVENTWINDOWID_DESCRIPTOR.index -> builder.instanceEventWindowId = deserializeString()
                NAME_DESCRIPTOR.index -> builder.name = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { InstanceEventWindowState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TIMERANGES_DESCRIPTOR.index -> builder.timeRanges =
                    deserializer.deserializeList(TIMERANGES_DESCRIPTOR) {
                        val col0 = mutableListOf<InstanceEventWindowTimeRange>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceEventWindowTimeRangeDocument(deserializer) } else { deserializeNull(); continue }
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
