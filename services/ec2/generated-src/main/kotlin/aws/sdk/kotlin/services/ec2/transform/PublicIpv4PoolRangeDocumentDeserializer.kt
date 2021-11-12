// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PublicIpv4PoolRange
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


internal fun deserializePublicIpv4PoolRangeDocument(deserializer: Deserializer): PublicIpv4PoolRange {
    val builder = PublicIpv4PoolRange.builder()
    val ADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("addressCount"))
    val AVAILABLEADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("availableAddressCount"))
    val FIRSTADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("firstAddress"))
    val LASTADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("lastAddress"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PublicIpv4PoolRange"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ADDRESSCOUNT_DESCRIPTOR)
        field(AVAILABLEADDRESSCOUNT_DESCRIPTOR)
        field(FIRSTADDRESS_DESCRIPTOR)
        field(LASTADDRESS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ADDRESSCOUNT_DESCRIPTOR.index -> builder.addressCount = deserializeInt()
                AVAILABLEADDRESSCOUNT_DESCRIPTOR.index -> builder.availableAddressCount = deserializeInt()
                FIRSTADDRESS_DESCRIPTOR.index -> builder.firstAddress = deserializeString()
                LASTADDRESS_DESCRIPTOR.index -> builder.lastAddress = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
