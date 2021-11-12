// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssociatedNetworkType
import aws.sdk.kotlin.services.ec2.model.AssociatedTargetNetwork
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


internal suspend fun deserializeAssociatedTargetNetworkDocument(deserializer: Deserializer): AssociatedTargetNetwork {
    val builder = AssociatedTargetNetwork.builder()
    val NETWORKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkId"))
    val NETWORKTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AssociatedTargetNetwork"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(NETWORKID_DESCRIPTOR)
        field(NETWORKTYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NETWORKID_DESCRIPTOR.index -> builder.networkId = deserializeString()
                NETWORKTYPE_DESCRIPTOR.index -> builder.networkType = deserializeString().let { AssociatedNetworkType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
