// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ServiceConfiguration
import aws.sdk.kotlin.services.ec2.model.ServiceState
import aws.sdk.kotlin.services.ec2.model.ServiceTypeDetail
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


internal fun deserializeServiceConfigurationDocument(deserializer: Deserializer): ServiceConfiguration {
    val builder = ServiceConfiguration.builder()
    val ACCEPTANCEREQUIRED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("acceptanceRequired"))
    val AVAILABILITYZONES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("availabilityZoneSet"), XmlCollectionName("item"))
    val BASEENDPOINTDNSNAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("baseEndpointDnsNameSet"), XmlCollectionName("item"))
    val GATEWAYLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("gatewayLoadBalancerArnSet"), XmlCollectionName("item"))
    val MANAGESVPCENDPOINTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("managesVpcEndpoints"))
    val NETWORKLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("networkLoadBalancerArnSet"), XmlCollectionName("item"))
    val PRIVATEDNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateDnsName"))
    val PRIVATEDNSNAMECONFIGURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("privateDnsNameConfiguration"))
    val SERVICEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("serviceId"))
    val SERVICENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("serviceName"))
    val SERVICESTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("serviceState"))
    val SERVICETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("serviceType"), XmlCollectionName("item"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ServiceConfiguration"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACCEPTANCEREQUIRED_DESCRIPTOR)
        field(AVAILABILITYZONES_DESCRIPTOR)
        field(BASEENDPOINTDNSNAMES_DESCRIPTOR)
        field(GATEWAYLOADBALANCERARNS_DESCRIPTOR)
        field(MANAGESVPCENDPOINTS_DESCRIPTOR)
        field(NETWORKLOADBALANCERARNS_DESCRIPTOR)
        field(PRIVATEDNSNAME_DESCRIPTOR)
        field(PRIVATEDNSNAMECONFIGURATION_DESCRIPTOR)
        field(SERVICEID_DESCRIPTOR)
        field(SERVICENAME_DESCRIPTOR)
        field(SERVICESTATE_DESCRIPTOR)
        field(SERVICETYPE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCEPTANCEREQUIRED_DESCRIPTOR.index -> builder.acceptanceRequired = deserializeBoolean()
                AVAILABILITYZONES_DESCRIPTOR.index -> builder.availabilityZones =
                    deserializer.deserializeList(AVAILABILITYZONES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                BASEENDPOINTDNSNAMES_DESCRIPTOR.index -> builder.baseEndpointDnsNames =
                    deserializer.deserializeList(BASEENDPOINTDNSNAMES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                GATEWAYLOADBALANCERARNS_DESCRIPTOR.index -> builder.gatewayLoadBalancerArns =
                    deserializer.deserializeList(GATEWAYLOADBALANCERARNS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                MANAGESVPCENDPOINTS_DESCRIPTOR.index -> builder.managesVpcEndpoints = deserializeBoolean()
                NETWORKLOADBALANCERARNS_DESCRIPTOR.index -> builder.networkLoadBalancerArns =
                    deserializer.deserializeList(NETWORKLOADBALANCERARNS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PRIVATEDNSNAME_DESCRIPTOR.index -> builder.privateDnsName = deserializeString()
                PRIVATEDNSNAMECONFIGURATION_DESCRIPTOR.index -> builder.privateDnsNameConfiguration = deserializePrivateDnsNameConfigurationDocument(deserializer)
                SERVICEID_DESCRIPTOR.index -> builder.serviceId = deserializeString()
                SERVICENAME_DESCRIPTOR.index -> builder.serviceName = deserializeString()
                SERVICESTATE_DESCRIPTOR.index -> builder.serviceState = deserializeString().let { ServiceState.fromValue(it) }
                SERVICETYPE_DESCRIPTOR.index -> builder.serviceType =
                    deserializer.deserializeList(SERVICETYPE_DESCRIPTOR) {
                        val col0 = mutableListOf<ServiceTypeDetail>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeServiceTypeDetailDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
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
