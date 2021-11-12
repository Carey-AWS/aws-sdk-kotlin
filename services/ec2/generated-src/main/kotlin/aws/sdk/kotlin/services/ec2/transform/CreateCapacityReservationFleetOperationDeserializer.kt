// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState
import aws.sdk.kotlin.services.ec2.model.CreateCapacityReservationFleetResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.FleetCapacityReservation
import aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy
import aws.sdk.kotlin.services.ec2.model.FleetInstanceMatchCriteria
import aws.sdk.kotlin.services.ec2.model.Tag
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
import aws.smithy.kotlin.runtime.time.Instant


internal class CreateCapacityReservationFleetOperationDeserializer: HttpDeserialize<CreateCapacityReservationFleetResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CreateCapacityReservationFleetResponse {
        if (!response.status.isSuccess()) {
            throwCreateCapacityReservationFleetError(context, response)
        }
        val builder = CreateCapacityReservationFleetResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCreateCapacityReservationFleetOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeCreateCapacityReservationFleetOperationBody(builder: CreateCapacityReservationFleetResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ALLOCATIONSTRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("allocationStrategy"))
    val CAPACITYRESERVATIONFLEETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("capacityReservationFleetId"))
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val ENDDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("endDate"))
    val FLEETCAPACITYRESERVATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("fleetCapacityReservationSet"), XmlCollectionName("item"))
    val INSTANCEMATCHCRITERIA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceMatchCriteria"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("tenancy"))
    val TOTALFULFILLEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, XmlSerialName("totalFulfilledCapacity"))
    val TOTALTARGETCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalTargetCapacity"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("CreateCapacityReservationFleetResult"))
        field(ALLOCATIONSTRATEGY_DESCRIPTOR)
        field(CAPACITYRESERVATIONFLEETID_DESCRIPTOR)
        field(CREATETIME_DESCRIPTOR)
        field(ENDDATE_DESCRIPTOR)
        field(FLEETCAPACITYRESERVATIONS_DESCRIPTOR)
        field(INSTANCEMATCHCRITERIA_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TENANCY_DESCRIPTOR)
        field(TOTALFULFILLEDCAPACITY_DESCRIPTOR)
        field(TOTALTARGETCAPACITY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ALLOCATIONSTRATEGY_DESCRIPTOR.index -> builder.allocationStrategy = deserializeString()
                CAPACITYRESERVATIONFLEETID_DESCRIPTOR.index -> builder.capacityReservationFleetId = deserializeString()
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                ENDDATE_DESCRIPTOR.index -> builder.endDate = deserializeString().let { Instant.fromIso8601(it) }
                FLEETCAPACITYRESERVATIONS_DESCRIPTOR.index -> builder.fleetCapacityReservations =
                    deserializer.deserializeList(FLEETCAPACITYRESERVATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<FleetCapacityReservation>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeFleetCapacityReservationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INSTANCEMATCHCRITERIA_DESCRIPTOR.index -> builder.instanceMatchCriteria = deserializeString().let { FleetInstanceMatchCriteria.fromValue(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { CapacityReservationFleetState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TENANCY_DESCRIPTOR.index -> builder.tenancy = deserializeString().let { FleetCapacityReservationTenancy.fromValue(it) }
                TOTALFULFILLEDCAPACITY_DESCRIPTOR.index -> builder.totalFulfilledCapacity = deserializeDouble()
                TOTALTARGETCAPACITY_DESCRIPTOR.index -> builder.totalTargetCapacity = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwCreateCapacityReservationFleetError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
