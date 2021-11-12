// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.SseSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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


internal fun serializeSseSpecificationDocument(serializer: Serializer, input: SseSpecification) {
    val ENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, JsonSerialName("Enabled"))
    val KMSMASTERKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("KMSMasterKeyId"))
    val SSETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("SSEType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ENABLED_DESCRIPTOR)
        field(KMSMASTERKEYID_DESCRIPTOR)
        field(SSETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.enabled?.let { field(ENABLED_DESCRIPTOR, it) }
        input.sseType?.let { field(SSETYPE_DESCRIPTOR, it.value) }
        input.kmsMasterKeyId?.let { field(KMSMASTERKEYID_DESCRIPTOR, it) }
    }
}
