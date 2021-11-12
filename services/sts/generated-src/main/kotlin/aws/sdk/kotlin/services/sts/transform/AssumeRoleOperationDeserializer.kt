// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseRestXmlErrorResponse
import aws.sdk.kotlin.services.sts.model.AssumeRoleResponse
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


internal class AssumeRoleOperationDeserializer: HttpDeserialize<AssumeRoleResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): AssumeRoleResponse {
        if (!response.status.isSuccess()) {
            throwAssumeRoleError(context, response)
        }
        val builder = AssumeRoleResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeAssumeRoleOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeAssumeRoleOperationBody(builder: AssumeRoleResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)

    val resultDescriptor = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("AssumeRoleResult"))
    val wrapperDescriptor = SdkObjectDescriptor.build {
        trait(XmlSerialName("AssumeRoleResponse"))
        field(resultDescriptor)
    }

    val wrapper = deserializer.deserializeStruct(wrapperDescriptor)
    if (wrapper.findNextFieldIndex() != resultDescriptor.index) {
        throw DeserializationException("failed to unwrap AssumeRole response")
    }

    val ASSUMEDROLEUSER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("AssumedRoleUser"))
    val CREDENTIALS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Credentials"))
    val PACKEDPOLICYSIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("PackedPolicySize"))
    val SOURCEIDENTITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SourceIdentity"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        trait(XmlSerialName("AssumeRoleResult"))
        field(ASSUMEDROLEUSER_DESCRIPTOR)
        field(CREDENTIALS_DESCRIPTOR)
        field(PACKEDPOLICYSIZE_DESCRIPTOR)
        field(SOURCEIDENTITY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSUMEDROLEUSER_DESCRIPTOR.index -> builder.assumedRoleUser = deserializeAssumedRoleUserDocument(deserializer)
                CREDENTIALS_DESCRIPTOR.index -> builder.credentials = deserializeCredentialsDocument(deserializer)
                PACKEDPOLICYSIZE_DESCRIPTOR.index -> builder.packedPolicySize = deserializeInt()
                SOURCEIDENTITY_DESCRIPTOR.index -> builder.sourceIdentity = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwAssumeRoleError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "ExpiredTokenException" -> ExpiredTokenExceptionDeserializer()
        "MalformedPolicyDocument" -> MalformedPolicyDocumentExceptionDeserializer()
        "PackedPolicyTooLarge" -> PackedPolicyTooLargeExceptionDeserializer()
        "RegionDisabledException" -> RegionDisabledExceptionDeserializer()
        else -> throw StsException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
