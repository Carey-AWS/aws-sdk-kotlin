// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.GetTransitGatewayRouteTableAssociationsResponse
import aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableAssociation
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


internal class GetTransitGatewayRouteTableAssociationsOperationDeserializer: HttpDeserialize<GetTransitGatewayRouteTableAssociationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetTransitGatewayRouteTableAssociationsResponse {
        if (!response.status.isSuccess()) {
            throwGetTransitGatewayRouteTableAssociationsError(context, response)
        }
        val builder = GetTransitGatewayRouteTableAssociationsResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetTransitGatewayRouteTableAssociationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeGetTransitGatewayRouteTableAssociationsOperationBody(builder: GetTransitGatewayRouteTableAssociationsResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ASSOCIATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("associations"), XmlCollectionName("item"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("GetTransitGatewayRouteTableAssociationsResult"))
        field(ASSOCIATIONS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATIONS_DESCRIPTOR.index -> builder.associations =
                    deserializer.deserializeList(ASSOCIATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<TransitGatewayRouteTableAssociation>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTransitGatewayRouteTableAssociationDocument(deserializer) } else { deserializeNull(); continue }
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

private suspend fun throwGetTransitGatewayRouteTableAssociationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
