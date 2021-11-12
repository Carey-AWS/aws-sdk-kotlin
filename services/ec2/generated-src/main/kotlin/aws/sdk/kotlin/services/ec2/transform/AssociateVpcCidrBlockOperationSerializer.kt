// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssociateVpcCidrBlockRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class AssociateVpcCidrBlockOperationSerializer: HttpSerialize<AssociateVpcCidrBlockRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AssociateVpcCidrBlockRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAssociateVpcCidrBlockOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeAssociateVpcCidrBlockOperationBody(context: ExecutionContext, input: AssociateVpcCidrBlockRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AmazonProvidedIpv6CidrBlock"))
    val CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CidrBlock"))
    val IPV6CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6CidrBlock"))
    val IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6CidrBlockNetworkBorderGroup"))
    val IPV6POOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6Pool"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AssociateVpcCidrBlockRequest"))
        trait(QueryLiteral("Action", "AssociateVpcCidrBlock"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR)
        field(CIDRBLOCK_DESCRIPTOR)
        field(IPV6CIDRBLOCK_DESCRIPTOR)
        field(IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR)
        field(IPV6POOL_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.amazonProvidedIpv6CidrBlock?.let { field(AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR, it) }
        input.cidrBlock?.let { field(CIDRBLOCK_DESCRIPTOR, it) }
        input.ipv6CidrBlock?.let { field(IPV6CIDRBLOCK_DESCRIPTOR, it) }
        input.ipv6CidrBlockNetworkBorderGroup?.let { field(IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR, it) }
        input.ipv6Pool?.let { field(IPV6POOL_DESCRIPTOR, it) }
        input.vpcId?.let { field(VPCID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
