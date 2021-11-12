// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget
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


internal suspend fun deserializeAnalysisLoadBalancerTargetDocument(deserializer: Deserializer): AnalysisLoadBalancerTarget {
    val builder = AnalysisLoadBalancerTarget.builder()
    val ADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("address"))
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val INSTANCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instance"))
    val PORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("port"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AnalysisLoadBalancerTarget"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ADDRESS_DESCRIPTOR)
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(INSTANCE_DESCRIPTOR)
        field(PORT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ADDRESS_DESCRIPTOR.index -> builder.address = deserializeString()
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                INSTANCE_DESCRIPTOR.index -> builder.instance = deserializeAnalysisComponentDocument(deserializer)
                PORT_DESCRIPTOR.index -> builder.port = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
