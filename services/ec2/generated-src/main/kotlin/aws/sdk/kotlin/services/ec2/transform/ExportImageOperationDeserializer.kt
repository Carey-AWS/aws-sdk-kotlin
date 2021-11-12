// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DiskImageFormat
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.ExportImageResponse
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


internal class ExportImageOperationDeserializer: HttpDeserialize<ExportImageResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ExportImageResponse {
        if (!response.status.isSuccess()) {
            throwExportImageError(context, response)
        }
        val builder = ExportImageResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeExportImageOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeExportImageOperationBody(builder: ExportImageResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val DISKIMAGEFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("diskImageFormat"))
    val EXPORTIMAGETASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("exportImageTaskId"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val ROLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("roleName"))
    val S3EXPORTLOCATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("s3ExportLocation"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("ExportImageResult"))
        field(DESCRIPTION_DESCRIPTOR)
        field(DISKIMAGEFORMAT_DESCRIPTOR)
        field(EXPORTIMAGETASKID_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(ROLENAME_DESCRIPTOR)
        field(S3EXPORTLOCATION_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                DISKIMAGEFORMAT_DESCRIPTOR.index -> builder.diskImageFormat = deserializeString().let { DiskImageFormat.fromValue(it) }
                EXPORTIMAGETASKID_DESCRIPTOR.index -> builder.exportImageTaskId = deserializeString()
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                ROLENAME_DESCRIPTOR.index -> builder.roleName = deserializeString()
                S3EXPORTLOCATION_DESCRIPTOR.index -> builder.s3ExportLocation = deserializeExportTaskS3LocationDocument(deserializer)
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString()
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
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

private suspend fun throwExportImageError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
