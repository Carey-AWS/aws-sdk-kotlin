// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseRestXmlErrorResponse
import aws.sdk.kotlin.services.sts.model.GetCallerIdentityResponse
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


internal class GetCallerIdentityOperationDeserializer: HttpDeserialize<GetCallerIdentityResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetCallerIdentityResponse {
        if (!response.status.isSuccess()) {
            throwGetCallerIdentityError(context, response)
        }
        val builder = GetCallerIdentityResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetCallerIdentityOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeGetCallerIdentityOperationBody(builder: GetCallerIdentityResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)

    val resultDescriptor = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("GetCallerIdentityResult"))
    val wrapperDescriptor = SdkObjectDescriptor.build {
        trait(XmlSerialName("GetCallerIdentityResponse"))
        field(resultDescriptor)
    }

    val wrapper = deserializer.deserializeStruct(wrapperDescriptor)
    if (wrapper.findNextFieldIndex() != resultDescriptor.index) {
        throw DeserializationException("failed to unwrap GetCallerIdentity response")
    }

    val ACCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Account"))
    val ARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Arn"))
    val USERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("UserId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        trait(XmlSerialName("GetCallerIdentityResult"))
        field(ACCOUNT_DESCRIPTOR)
        field(ARN_DESCRIPTOR)
        field(USERID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCOUNT_DESCRIPTOR.index -> builder.account = deserializeString()
                ARN_DESCRIPTOR.index -> builder.arn = deserializeString()
                USERID_DESCRIPTOR.index -> builder.userId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwGetCallerIdentityError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
