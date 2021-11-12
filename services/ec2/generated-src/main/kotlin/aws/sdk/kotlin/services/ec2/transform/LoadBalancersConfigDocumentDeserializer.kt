// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig
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


internal fun deserializeLoadBalancersConfigDocument(deserializer: Deserializer): LoadBalancersConfig {
    val builder = LoadBalancersConfig.builder()
    val CLASSICLOADBALANCERSCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("classicLoadBalancersConfig"))
    val TARGETGROUPSCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("targetGroupsConfig"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LoadBalancersConfig"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CLASSICLOADBALANCERSCONFIG_DESCRIPTOR)
        field(TARGETGROUPSCONFIG_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLASSICLOADBALANCERSCONFIG_DESCRIPTOR.index -> builder.classicLoadBalancersConfig = deserializeClassicLoadBalancersConfigDocument(deserializer)
                TARGETGROUPSCONFIG_DESCRIPTOR.index -> builder.targetGroupsConfig = deserializeTargetGroupsConfigDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
