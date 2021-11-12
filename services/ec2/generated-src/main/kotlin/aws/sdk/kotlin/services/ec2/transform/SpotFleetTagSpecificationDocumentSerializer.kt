// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SpotFleetTagSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeSpotFleetTagSpecificationDocument(serializer: Serializer, input: SpotFleetTagSpecification) {
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ResourceType"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Tag"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SpotFleetTagSpecification"))
        field(RESOURCETYPE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.resourceType?.let { field(RESOURCETYPE_DESCRIPTOR, it.value) }
        if (input.tags != null) {
            listField(TAGS_DESCRIPTOR) {
                for (el0 in input.tags) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagDocument))
                }
            }
        }
    }
}
