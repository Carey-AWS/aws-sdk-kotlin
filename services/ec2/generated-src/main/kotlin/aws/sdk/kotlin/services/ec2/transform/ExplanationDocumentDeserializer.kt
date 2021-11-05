// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AnalysisComponent
import aws.sdk.kotlin.services.ec2.model.Explanation
import aws.sdk.kotlin.services.ec2.model.PortRange
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


internal suspend fun deserializeExplanationDocument(deserializer: Deserializer): Explanation {
    val builder = Explanation.builder()
    val ACL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("acl"))
    val ACLRULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("aclRule"))
    val ADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("address"))
    val ADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("addressSet"), XmlCollectionName("item"))
    val ATTACHEDTO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("attachedTo"))
    val AVAILABILITYZONES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("availabilityZoneSet"), XmlCollectionName("item"))
    val CIDRS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("cidrSet"), XmlCollectionName("item"))
    val CLASSICLOADBALANCERLISTENER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("classicLoadBalancerListener"))
    val COMPONENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("component"))
    val CUSTOMERGATEWAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("customerGateway"))
    val DESTINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("destination"))
    val DESTINATIONVPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("destinationVpc"))
    val DIRECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("direction"))
    val ELASTICLOADBALANCERLISTENER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("elasticLoadBalancerListener"))
    val EXPLANATIONCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("explanationCode"))
    val INGRESSROUTETABLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ingressRouteTable"))
    val INTERNETGATEWAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("internetGateway"))
    val LOADBALANCERARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("loadBalancerArn"))
    val LOADBALANCERLISTENERPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("loadBalancerListenerPort"))
    val LOADBALANCERTARGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("loadBalancerTarget"))
    val LOADBALANCERTARGETGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("loadBalancerTargetGroup"))
    val LOADBALANCERTARGETGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("loadBalancerTargetGroupSet"), XmlCollectionName("item"))
    val LOADBALANCERTARGETPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("loadBalancerTargetPort"))
    val MISSINGCOMPONENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("missingComponent"))
    val NATGATEWAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("natGateway"))
    val NETWORKINTERFACE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("networkInterface"))
    val PACKETFIELD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("packetField"))
    val PORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("port"))
    val PORTRANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("portRangeSet"), XmlCollectionName("item"))
    val PREFIXLIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("prefixList"))
    val PROTOCOLS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("protocolSet"), XmlCollectionName("item"))
    val ROUTETABLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("routeTable"))
    val ROUTETABLEROUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("routeTableRoute"))
    val SECURITYGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("securityGroup"))
    val SECURITYGROUPRULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("securityGroupRule"))
    val SECURITYGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("securityGroupSet"), XmlCollectionName("item"))
    val SOURCEVPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("sourceVpc"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val SUBNET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("subnet"))
    val SUBNETROUTETABLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("subnetRouteTable"))
    val VPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpc"))
    val VPCENDPOINT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpcEndpoint"))
    val VPCPEERINGCONNECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpcPeeringConnection"))
    val VPNCONNECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpnConnection"))
    val VPNGATEWAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpnGateway"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Explanation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACL_DESCRIPTOR)
        field(ACLRULE_DESCRIPTOR)
        field(ADDRESS_DESCRIPTOR)
        field(ADDRESSES_DESCRIPTOR)
        field(ATTACHEDTO_DESCRIPTOR)
        field(AVAILABILITYZONES_DESCRIPTOR)
        field(CIDRS_DESCRIPTOR)
        field(CLASSICLOADBALANCERLISTENER_DESCRIPTOR)
        field(COMPONENT_DESCRIPTOR)
        field(CUSTOMERGATEWAY_DESCRIPTOR)
        field(DESTINATION_DESCRIPTOR)
        field(DESTINATIONVPC_DESCRIPTOR)
        field(DIRECTION_DESCRIPTOR)
        field(ELASTICLOADBALANCERLISTENER_DESCRIPTOR)
        field(EXPLANATIONCODE_DESCRIPTOR)
        field(INGRESSROUTETABLE_DESCRIPTOR)
        field(INTERNETGATEWAY_DESCRIPTOR)
        field(LOADBALANCERARN_DESCRIPTOR)
        field(LOADBALANCERLISTENERPORT_DESCRIPTOR)
        field(LOADBALANCERTARGET_DESCRIPTOR)
        field(LOADBALANCERTARGETGROUP_DESCRIPTOR)
        field(LOADBALANCERTARGETGROUPS_DESCRIPTOR)
        field(LOADBALANCERTARGETPORT_DESCRIPTOR)
        field(MISSINGCOMPONENT_DESCRIPTOR)
        field(NATGATEWAY_DESCRIPTOR)
        field(NETWORKINTERFACE_DESCRIPTOR)
        field(PACKETFIELD_DESCRIPTOR)
        field(PORT_DESCRIPTOR)
        field(PORTRANGES_DESCRIPTOR)
        field(PREFIXLIST_DESCRIPTOR)
        field(PROTOCOLS_DESCRIPTOR)
        field(ROUTETABLE_DESCRIPTOR)
        field(ROUTETABLEROUTE_DESCRIPTOR)
        field(SECURITYGROUP_DESCRIPTOR)
        field(SECURITYGROUPRULE_DESCRIPTOR)
        field(SECURITYGROUPS_DESCRIPTOR)
        field(SOURCEVPC_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(SUBNET_DESCRIPTOR)
        field(SUBNETROUTETABLE_DESCRIPTOR)
        field(VPC_DESCRIPTOR)
        field(VPCENDPOINT_DESCRIPTOR)
        field(VPCPEERINGCONNECTION_DESCRIPTOR)
        field(VPNCONNECTION_DESCRIPTOR)
        field(VPNGATEWAY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACL_DESCRIPTOR.index -> builder.acl = deserializeAnalysisComponentDocument(deserializer)
                ACLRULE_DESCRIPTOR.index -> builder.aclRule = deserializeAnalysisAclRuleDocument(deserializer)
                ADDRESS_DESCRIPTOR.index -> builder.address = deserializeString()
                ADDRESSES_DESCRIPTOR.index -> builder.addresses =
                    deserializer.deserializeList(ADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ATTACHEDTO_DESCRIPTOR.index -> builder.attachedTo = deserializeAnalysisComponentDocument(deserializer)
                AVAILABILITYZONES_DESCRIPTOR.index -> builder.availabilityZones =
                    deserializer.deserializeList(AVAILABILITYZONES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CIDRS_DESCRIPTOR.index -> builder.cidrs =
                    deserializer.deserializeList(CIDRS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CLASSICLOADBALANCERLISTENER_DESCRIPTOR.index -> builder.classicLoadBalancerListener = deserializeAnalysisLoadBalancerListenerDocument(deserializer)
                COMPONENT_DESCRIPTOR.index -> builder.component = deserializeAnalysisComponentDocument(deserializer)
                CUSTOMERGATEWAY_DESCRIPTOR.index -> builder.customerGateway = deserializeAnalysisComponentDocument(deserializer)
                DESTINATION_DESCRIPTOR.index -> builder.destination = deserializeAnalysisComponentDocument(deserializer)
                DESTINATIONVPC_DESCRIPTOR.index -> builder.destinationVpc = deserializeAnalysisComponentDocument(deserializer)
                DIRECTION_DESCRIPTOR.index -> builder.direction = deserializeString()
                ELASTICLOADBALANCERLISTENER_DESCRIPTOR.index -> builder.elasticLoadBalancerListener = deserializeAnalysisComponentDocument(deserializer)
                EXPLANATIONCODE_DESCRIPTOR.index -> builder.explanationCode = deserializeString()
                INGRESSROUTETABLE_DESCRIPTOR.index -> builder.ingressRouteTable = deserializeAnalysisComponentDocument(deserializer)
                INTERNETGATEWAY_DESCRIPTOR.index -> builder.internetGateway = deserializeAnalysisComponentDocument(deserializer)
                LOADBALANCERARN_DESCRIPTOR.index -> builder.loadBalancerArn = deserializeString()
                LOADBALANCERLISTENERPORT_DESCRIPTOR.index -> builder.loadBalancerListenerPort = deserializeInt()
                LOADBALANCERTARGET_DESCRIPTOR.index -> builder.loadBalancerTarget = deserializeAnalysisLoadBalancerTargetDocument(deserializer)
                LOADBALANCERTARGETGROUP_DESCRIPTOR.index -> builder.loadBalancerTargetGroup = deserializeAnalysisComponentDocument(deserializer)
                LOADBALANCERTARGETGROUPS_DESCRIPTOR.index -> builder.loadBalancerTargetGroups =
                    deserializer.deserializeList(LOADBALANCERTARGETGROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<AnalysisComponent>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeAnalysisComponentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                LOADBALANCERTARGETPORT_DESCRIPTOR.index -> builder.loadBalancerTargetPort = deserializeInt()
                MISSINGCOMPONENT_DESCRIPTOR.index -> builder.missingComponent = deserializeString()
                NATGATEWAY_DESCRIPTOR.index -> builder.natGateway = deserializeAnalysisComponentDocument(deserializer)
                NETWORKINTERFACE_DESCRIPTOR.index -> builder.networkInterface = deserializeAnalysisComponentDocument(deserializer)
                PACKETFIELD_DESCRIPTOR.index -> builder.packetField = deserializeString()
                PORT_DESCRIPTOR.index -> builder.port = deserializeInt()
                PORTRANGES_DESCRIPTOR.index -> builder.portRanges =
                    deserializer.deserializeList(PORTRANGES_DESCRIPTOR) {
                        val col0 = mutableListOf<PortRange>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePortRangeDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PREFIXLIST_DESCRIPTOR.index -> builder.prefixList = deserializeAnalysisComponentDocument(deserializer)
                PROTOCOLS_DESCRIPTOR.index -> builder.protocols =
                    deserializer.deserializeList(PROTOCOLS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ROUTETABLE_DESCRIPTOR.index -> builder.routeTable = deserializeAnalysisComponentDocument(deserializer)
                ROUTETABLEROUTE_DESCRIPTOR.index -> builder.routeTableRoute = deserializeAnalysisRouteTableRouteDocument(deserializer)
                SECURITYGROUP_DESCRIPTOR.index -> builder.securityGroup = deserializeAnalysisComponentDocument(deserializer)
                SECURITYGROUPRULE_DESCRIPTOR.index -> builder.securityGroupRule = deserializeAnalysisSecurityGroupRuleDocument(deserializer)
                SECURITYGROUPS_DESCRIPTOR.index -> builder.securityGroups =
                    deserializer.deserializeList(SECURITYGROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<AnalysisComponent>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeAnalysisComponentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SOURCEVPC_DESCRIPTOR.index -> builder.sourceVpc = deserializeAnalysisComponentDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString()
                SUBNET_DESCRIPTOR.index -> builder.subnet = deserializeAnalysisComponentDocument(deserializer)
                SUBNETROUTETABLE_DESCRIPTOR.index -> builder.subnetRouteTable = deserializeAnalysisComponentDocument(deserializer)
                VPC_DESCRIPTOR.index -> builder.vpc = deserializeAnalysisComponentDocument(deserializer)
                VPCENDPOINT_DESCRIPTOR.index -> builder.vpcEndpoint = deserializeAnalysisComponentDocument(deserializer)
                VPCPEERINGCONNECTION_DESCRIPTOR.index -> builder.vpcPeeringConnection = deserializeAnalysisComponentDocument(deserializer)
                VPNCONNECTION_DESCRIPTOR.index -> builder.vpnConnection = deserializeAnalysisComponentDocument(deserializer)
                VPNGATEWAY_DESCRIPTOR.index -> builder.vpnGateway = deserializeAnalysisComponentDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
