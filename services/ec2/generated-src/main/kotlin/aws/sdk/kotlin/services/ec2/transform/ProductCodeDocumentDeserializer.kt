// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ProductCode
import aws.sdk.kotlin.services.ec2.model.ProductCodeValues
import aws.smithy.kotlin.runtime.serde.Deserializer
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


internal fun deserializeProductCodeDocument(deserializer: Deserializer): ProductCode {
    val builder = ProductCode.builder()
    val PRODUCTCODEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("productCode"))
    val PRODUCTCODETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("type"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ProductCode"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(PRODUCTCODEID_DESCRIPTOR)
        field(PRODUCTCODETYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                PRODUCTCODEID_DESCRIPTOR.index -> builder.productCodeId = deserializeString()
                PRODUCTCODETYPE_DESCRIPTOR.index -> builder.productCodeType = deserializeString().let { ProductCodeValues.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
