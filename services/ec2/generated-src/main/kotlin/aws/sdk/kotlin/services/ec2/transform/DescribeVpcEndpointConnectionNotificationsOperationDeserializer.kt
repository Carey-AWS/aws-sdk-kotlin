// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.ConnectionNotification
import aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
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
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class DescribeVpcEndpointConnectionNotificationsOperationDeserializer: HttpDeserialize<DescribeVpcEndpointConnectionNotificationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeVpcEndpointConnectionNotificationsResponse {
        if (!response.status.isSuccess()) {
            throwDescribeVpcEndpointConnectionNotificationsError(context, response)
        }
        val builder = DescribeVpcEndpointConnectionNotificationsResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeVpcEndpointConnectionNotificationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeDescribeVpcEndpointConnectionNotificationsOperationBody(builder: DescribeVpcEndpointConnectionNotificationsResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val CONNECTIONNOTIFICATIONSET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("connectionNotificationSet"), XmlCollectionName("item"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DescribeVpcEndpointConnectionNotificationsResult"))
        field(CONNECTIONNOTIFICATIONSET_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONNECTIONNOTIFICATIONSET_DESCRIPTOR.index -> builder.connectionNotificationSet =
                    deserializer.deserializeList(CONNECTIONNOTIFICATIONSET_DESCRIPTOR) {
                        val col0 = mutableListOf<ConnectionNotification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeConnectionNotificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwDescribeVpcEndpointConnectionNotificationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as ec2Query error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw Ec2Exception(errorDetails.message)
}
