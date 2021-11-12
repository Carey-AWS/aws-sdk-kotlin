// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.AttributeValue
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.QueryResponse
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


internal class QueryOperationDeserializer: HttpDeserialize<QueryResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): QueryResponse {
        if (!response.status.isSuccess()) {
            throwQueryError(context, response)
        }
        val builder = QueryResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeQueryOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeQueryOperationBody(builder: QueryResponse.DslBuilder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val CONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ConsumedCapacity"))
    val COUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("Count"))
    val ITEMS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("Items"))
    val ITEMS_C0_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map)
    val LASTEVALUATEDKEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("LastEvaluatedKey"))
    val SCANNEDCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("ScannedCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONSUMEDCAPACITY_DESCRIPTOR)
        field(COUNT_DESCRIPTOR)
        field(ITEMS_DESCRIPTOR)
        field(LASTEVALUATEDKEY_DESCRIPTOR)
        field(SCANNEDCOUNT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONSUMEDCAPACITY_DESCRIPTOR.index -> builder.consumedCapacity = deserializeConsumedCapacityDocument(deserializer)
                COUNT_DESCRIPTOR.index -> builder.count = deserializeInt()
                ITEMS_DESCRIPTOR.index -> builder.items =
                    deserializer.deserializeList(ITEMS_DESCRIPTOR) {
                        val col0 = mutableListOf<Map<String, AttributeValue>>()
                        while (hasNextElement()) {
                            val el0 = deserializer.deserializeMap(ITEMS_C0_DESCRIPTOR) {
                                val map1 = mutableMapOf<String, AttributeValue>()
                                while (hasNextEntry()) {
                                    val k1 = key()
                                    val v1 = if (nextHasValue()) { deserializeAttributeValueDocument(deserializer) } else { deserializeNull(); continue }
                                    map1[k1] = v1
                                }
                                map1
                            }
                            col0.add(el0)
                        }
                        col0
                    }
                LASTEVALUATEDKEY_DESCRIPTOR.index -> builder.lastEvaluatedKey =
                    deserializer.deserializeMap(LASTEVALUATEDKEY_DESCRIPTOR) {
                        val map0 = mutableMapOf<String, AttributeValue>()
                        while (hasNextEntry()) {
                            val k0 = key()
                            val v0 = if (nextHasValue()) { deserializeAttributeValueDocument(deserializer) } else { deserializeNull(); continue }
                            map0[k0] = v0
                        }
                        map0
                    }
                SCANNEDCOUNT_DESCRIPTOR.index -> builder.scannedCount = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwQueryError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
