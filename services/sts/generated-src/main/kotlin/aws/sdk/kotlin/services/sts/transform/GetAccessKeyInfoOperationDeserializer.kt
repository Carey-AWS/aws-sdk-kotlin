// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseRestXmlErrorResponse
import aws.sdk.kotlin.services.sts.model.GetAccessKeyInfoResponse
import aws.sdk.kotlin.services.sts.model.StsException
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.DeserializationException
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class GetAccessKeyInfoOperationDeserializer: HttpDeserialize<GetAccessKeyInfoResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetAccessKeyInfoResponse {
        if (!response.status.isSuccess()) {
            throwGetAccessKeyInfoError(context, response)
        }
        val builder = GetAccessKeyInfoResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetAccessKeyInfoOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeGetAccessKeyInfoOperationBody(builder: GetAccessKeyInfoResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)

    val resultDescriptor = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("GetAccessKeyInfoResult"))
    val wrapperDescriptor = SdkObjectDescriptor.build {
        trait(XmlSerialName("GetAccessKeyInfoResponse"))
        field(resultDescriptor)
    }

    val wrapper = deserializer.deserializeStruct(wrapperDescriptor)
    if (wrapper.findNextFieldIndex() != resultDescriptor.index) {
        throw DeserializationException("failed to unwrap GetAccessKeyInfo response")
    }

    val ACCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Account"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        trait(XmlSerialName("GetAccessKeyInfoResult"))
        field(ACCOUNT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCOUNT_DESCRIPTOR.index -> builder.account = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwGetAccessKeyInfoError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseRestXmlErrorResponse(payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as awsQuery error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw StsException(errorDetails.message)
}
