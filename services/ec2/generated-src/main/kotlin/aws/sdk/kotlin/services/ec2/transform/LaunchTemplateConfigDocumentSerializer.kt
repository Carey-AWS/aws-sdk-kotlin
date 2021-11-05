// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateConfig
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


internal fun serializeLaunchTemplateConfigDocument(serializer: Serializer, input: LaunchTemplateConfig) {
    val LAUNCHTEMPLATESPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("LaunchTemplateSpecification"))
    val OVERRIDES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Overrides"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateConfig"))
        field(LAUNCHTEMPLATESPECIFICATION_DESCRIPTOR)
        field(OVERRIDES_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.launchTemplateSpecification?.let { field(LAUNCHTEMPLATESPECIFICATION_DESCRIPTOR, it, ::serializeFleetLaunchTemplateSpecificationDocument) }
        if (input.overrides != null) {
            listField(OVERRIDES_DESCRIPTOR) {
                for (el0 in input.overrides) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLaunchTemplateOverridesDocument))
                }
            }
        }
    }
}
