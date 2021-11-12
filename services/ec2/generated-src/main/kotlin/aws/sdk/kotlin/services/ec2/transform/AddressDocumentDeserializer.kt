// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Address
import aws.sdk.kotlin.services.ec2.model.DomainType
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


internal fun deserializeAddressDocument(deserializer: Deserializer): Address {
    val builder = Address.builder()
    val ALLOCATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("allocationId"))
    val ASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("associationId"))
    val CARRIERIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("carrierIp"))
    val CUSTOMEROWNEDIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("customerOwnedIp"))
    val CUSTOMEROWNEDIPV4POOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("customerOwnedIpv4Pool"))
    val DOMAIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("domain"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val NETWORKBORDERGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkBorderGroup"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val NETWORKINTERFACEOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceOwnerId"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateIpAddress"))
    val PUBLICIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("publicIp"))
    val PUBLICIPV4POOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("publicIpv4Pool"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Address"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ALLOCATIONID_DESCRIPTOR)
        field(ASSOCIATIONID_DESCRIPTOR)
        field(CARRIERIP_DESCRIPTOR)
        field(CUSTOMEROWNEDIP_DESCRIPTOR)
        field(CUSTOMEROWNEDIPV4POOL_DESCRIPTOR)
        field(DOMAIN_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(NETWORKBORDERGROUP_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(NETWORKINTERFACEOWNERID_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
        field(PUBLICIP_DESCRIPTOR)
        field(PUBLICIPV4POOL_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ALLOCATIONID_DESCRIPTOR.index -> builder.allocationId = deserializeString()
                ASSOCIATIONID_DESCRIPTOR.index -> builder.associationId = deserializeString()
                CARRIERIP_DESCRIPTOR.index -> builder.carrierIp = deserializeString()
                CUSTOMEROWNEDIP_DESCRIPTOR.index -> builder.customerOwnedIp = deserializeString()
                CUSTOMEROWNEDIPV4POOL_DESCRIPTOR.index -> builder.customerOwnedIpv4Pool = deserializeString()
                DOMAIN_DESCRIPTOR.index -> builder.domain = deserializeString().let { DomainType.fromValue(it) }
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                NETWORKBORDERGROUP_DESCRIPTOR.index -> builder.networkBorderGroup = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                NETWORKINTERFACEOWNERID_DESCRIPTOR.index -> builder.networkInterfaceOwnerId = deserializeString()
                PRIVATEIPADDRESS_DESCRIPTOR.index -> builder.privateIpAddress = deserializeString()
                PUBLICIP_DESCRIPTOR.index -> builder.publicIp = deserializeString()
                PUBLICIPV4POOL_DESCRIPTOR.index -> builder.publicIpv4Pool = deserializeString()
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
