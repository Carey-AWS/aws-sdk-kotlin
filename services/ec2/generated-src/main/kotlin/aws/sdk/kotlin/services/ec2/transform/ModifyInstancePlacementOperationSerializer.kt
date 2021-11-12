// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyInstancePlacementRequest
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


internal class ModifyInstancePlacementOperationSerializer: HttpSerialize<ModifyInstancePlacementRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyInstancePlacementRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyInstancePlacementOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyInstancePlacementOperationBody(context: ExecutionContext, input: ModifyInstancePlacementRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AFFINITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Affinity"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("GroupName"))
    val HOSTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HostId"))
    val HOSTRESOURCEGROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HostResourceGroupArn"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceId"))
    val PARTITIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("PartitionNumber"))
    val TENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Tenancy"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyInstancePlacementRequest"))
        trait(QueryLiteral("Action", "ModifyInstancePlacement"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AFFINITY_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(HOSTID_DESCRIPTOR)
        field(HOSTRESOURCEGROUPARN_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(PARTITIONNUMBER_DESCRIPTOR)
        field(TENANCY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.affinity?.let { field(AFFINITY_DESCRIPTOR, it.value) }
        input.groupName?.let { field(GROUPNAME_DESCRIPTOR, it) }
        input.hostId?.let { field(HOSTID_DESCRIPTOR, it) }
        input.hostResourceGroupArn?.let { field(HOSTRESOURCEGROUPARN_DESCRIPTOR, it) }
        input.instanceId?.let { field(INSTANCEID_DESCRIPTOR, it) }
        input.partitionNumber?.let { field(PARTITIONNUMBER_DESCRIPTOR, it) }
        input.tenancy?.let { field(TENANCY_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
