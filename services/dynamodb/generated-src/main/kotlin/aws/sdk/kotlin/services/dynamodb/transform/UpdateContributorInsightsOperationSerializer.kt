// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsRequest
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
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class UpdateContributorInsightsOperationSerializer: HttpSerialize<UpdateContributorInsightsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: UpdateContributorInsightsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeUpdateContributorInsightsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeUpdateContributorInsightsOperationBody(context: ExecutionContext, input: UpdateContributorInsightsRequest): ByteArray {
    val serializer = JsonSerializer()
    val CONTRIBUTORINSIGHTSACTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ContributorInsightsAction"))
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONTRIBUTORINSIGHTSACTION_DESCRIPTOR)
        field(INDEXNAME_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.contributorInsightsAction?.let { field(CONTRIBUTORINSIGHTSACTION_DESCRIPTOR, it.value) }
        input.indexName?.let { field(INDEXNAME_DESCRIPTOR, it) }
        input.tableName?.let { field(TABLENAME_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
