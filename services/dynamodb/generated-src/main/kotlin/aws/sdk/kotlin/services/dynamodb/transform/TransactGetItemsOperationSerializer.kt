// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.TransactGetItemsRequest
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


internal class TransactGetItemsOperationSerializer: HttpSerialize<TransactGetItemsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: TransactGetItemsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeTransactGetItemsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeTransactGetItemsOperationBody(context: ExecutionContext, input: TransactGetItemsRequest): ByteArray {
    val serializer = JsonSerializer()
    val RETURNCONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnConsumedCapacity"))
    val TRANSACTITEMS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("TransactItems"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(RETURNCONSUMEDCAPACITY_DESCRIPTOR)
        field(TRANSACTITEMS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.returnConsumedCapacity?.let { field(RETURNCONSUMEDCAPACITY_DESCRIPTOR, it.value) }
        if (input.transactItems != null) {
            listField(TRANSACTITEMS_DESCRIPTOR) {
                for (el0 in input.transactItems) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTransactGetItemDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
