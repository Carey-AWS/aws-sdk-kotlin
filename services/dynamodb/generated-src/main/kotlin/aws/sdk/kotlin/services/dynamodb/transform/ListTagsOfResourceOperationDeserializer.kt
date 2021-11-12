// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.ListTagsOfResourceResponse
import aws.sdk.kotlin.services.dynamodb.model.Tag
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


internal class ListTagsOfResourceOperationDeserializer: HttpDeserialize<ListTagsOfResourceResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListTagsOfResourceResponse {
        if (!response.status.isSuccess()) {
            throwListTagsOfResourceError(context, response)
        }
        val builder = ListTagsOfResourceResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListTagsOfResourceOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeListTagsOfResourceOperationBody(builder: ListTagsOfResourceResponse.DslBuilder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("NextToken"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("Tags"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(NEXTTOKEN_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
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
}

private suspend fun throwListTagsOfResourceError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
        "ResourceNotFoundException" -> ResourceNotFoundExceptionDeserializer()
        else -> throw DynamoDbException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
