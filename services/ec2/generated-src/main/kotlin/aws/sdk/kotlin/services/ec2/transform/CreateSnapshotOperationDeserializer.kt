// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CreateSnapshotResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.SnapshotState
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


internal class CreateSnapshotOperationDeserializer: HttpDeserialize<CreateSnapshotResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CreateSnapshotResponse {
        if (!response.status.isSuccess()) {
            throwCreateSnapshotError(context, response)
        }
        val builder = CreateSnapshotResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCreateSnapshotOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeCreateSnapshotOperationBody(builder: CreateSnapshotResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val DATAENCRYPTIONKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("dataEncryptionKeyId"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kmsKeyId"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val OWNERALIAS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerAlias"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("startTime"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATEMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val VOLUMESIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("volumeSize"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("CreateSnapshotResult"))
        field(DATAENCRYPTIONKEYID_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(OWNERALIAS_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATEMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
        field(VOLUMESIZE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DATAENCRYPTIONKEYID_DESCRIPTOR.index -> builder.dataEncryptionKeyId = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                KMSKEYID_DESCRIPTOR.index -> builder.kmsKeyId = deserializeString()
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                OWNERALIAS_DESCRIPTOR.index -> builder.ownerAlias = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString().let { Instant.fromIso8601(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { SnapshotState.fromValue(it) }
                STATEMESSAGE_DESCRIPTOR.index -> builder.stateMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                VOLUMESIZE_DESCRIPTOR.index -> builder.volumeSize = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwCreateSnapshotError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
