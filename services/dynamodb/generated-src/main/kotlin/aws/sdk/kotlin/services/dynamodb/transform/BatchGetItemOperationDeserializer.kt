// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.AttributeValue
import aws.sdk.kotlin.services.dynamodb.model.BatchGetItemResponse
import aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.KeysAndAttributes
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class BatchGetItemOperationDeserializer: HttpDeserialize<BatchGetItemResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): BatchGetItemResponse {
        if (!response.status.isSuccess()) {
            throwBatchGetItemError(context, response)
        }
        val builder = BatchGetItemResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeBatchGetItemOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeBatchGetItemOperationBody(builder: BatchGetItemResponse.DslBuilder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val CONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ConsumedCapacity"))
    val RESPONSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Responses"))
    val RESPONSES_C0_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List)
    val RESPONSES_C1_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map)
    val UNPROCESSEDKEYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("UnprocessedKeys"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONSUMEDCAPACITY_DESCRIPTOR)
        field(RESPONSES_DESCRIPTOR)
        field(UNPROCESSEDKEYS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONSUMEDCAPACITY_DESCRIPTOR.index -> builder.consumedCapacity =
                    deserializer.deserializeList(CONSUMEDCAPACITY_DESCRIPTOR) {
                        val col0 = mutableListOf<ConsumedCapacity>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeConsumedCapacityDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                RESPONSES_DESCRIPTOR.index -> builder.responses =
                    deserializer.deserializeMap(RESPONSES_DESCRIPTOR) {
                        val map0 = mutableMapOf<String, List<Map<String, AttributeValue>>>()
                        while (hasNextEntry()) {
                            val k0 = key()
                            val v0 =
                                if (nextHasValue()) {
                                    deserializer.deserializeList(RESPONSES_C0_DESCRIPTOR) {
                                        val col1 = mutableListOf<Map<String, AttributeValue>>()
                                        while (hasNextElement()) {
                                            val el1 = deserializer.deserializeMap(RESPONSES_C1_DESCRIPTOR) {
                                                val map2 = mutableMapOf<String, AttributeValue>()
                                                while (hasNextEntry()) {
                                                    val k2 = key()
                                                    val v2 = if (nextHasValue()) { deserializeAttributeValueDocument(deserializer) } else { deserializeNull(); continue }
                                                    map2[k2] = v2
                                                }
                                                map2
                                            }
                                            col1.add(el1)
                                        }
                                        col1
                                    }
                                } else { deserializeNull(); continue }

                            map0[k0] = v0
                        }
                        map0
                    }
                UNPROCESSEDKEYS_DESCRIPTOR.index -> builder.unprocessedKeys =
                    deserializer.deserializeMap(UNPROCESSEDKEYS_DESCRIPTOR) {
                        val map0 = mutableMapOf<String, KeysAndAttributes>()
                        while (hasNextEntry()) {
                            val k0 = key()
                            val v0 = if (nextHasValue()) { deserializeKeysAndAttributesDocument(deserializer) } else { deserializeNull(); continue }
                            map0[k0] = v0
                        }
                        map0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwBatchGetItemError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        RestJsonErrorDeserializer.deserialize(response.headers, payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as awsJson1_0 error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "InternalServerError" -> InternalServerErrorDeserializer()
        "InvalidEndpointException" -> InvalidEndpointExceptionDeserializer()
        "ProvisionedThroughputExceededException" -> ProvisionedThroughputExceededExceptionDeserializer()
        "RequestLimitExceeded" -> RequestLimitExceededDeserializer()
        "ResourceNotFoundException" -> ResourceNotFoundExceptionDeserializer()
        else -> throw DynamoDbException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
