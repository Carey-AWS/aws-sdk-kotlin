// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CancelCapacityReservationFleetsResponse
import aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetCancellationState
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.FailedCapacityReservationFleetCancellationResult
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


internal class CancelCapacityReservationFleetsOperationDeserializer: HttpDeserialize<CancelCapacityReservationFleetsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CancelCapacityReservationFleetsResponse {
        if (!response.status.isSuccess()) {
            throwCancelCapacityReservationFleetsError(context, response)
        }
        val builder = CancelCapacityReservationFleetsResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCancelCapacityReservationFleetsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeCancelCapacityReservationFleetsOperationBody(builder: CancelCapacityReservationFleetsResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val FAILEDFLEETCANCELLATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("failedFleetCancellationSet"), XmlCollectionName("item"))
    val SUCCESSFULFLEETCANCELLATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("successfulFleetCancellationSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("CancelCapacityReservationFleetsResult"))
        field(FAILEDFLEETCANCELLATIONS_DESCRIPTOR)
        field(SUCCESSFULFLEETCANCELLATIONS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FAILEDFLEETCANCELLATIONS_DESCRIPTOR.index -> builder.failedFleetCancellations =
                    deserializer.deserializeList(FAILEDFLEETCANCELLATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<FailedCapacityReservationFleetCancellationResult>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeFailedCapacityReservationFleetCancellationResultDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SUCCESSFULFLEETCANCELLATIONS_DESCRIPTOR.index -> builder.successfulFleetCancellations =
                    deserializer.deserializeList(SUCCESSFULFLEETCANCELLATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<CapacityReservationFleetCancellationState>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeCapacityReservationFleetCancellationStateDocument(deserializer) } else { deserializeNull(); continue }
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

private suspend fun throwCancelCapacityReservationFleetsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
