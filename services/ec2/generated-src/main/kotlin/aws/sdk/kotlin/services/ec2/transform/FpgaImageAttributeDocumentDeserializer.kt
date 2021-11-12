// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute
import aws.sdk.kotlin.services.ec2.model.LoadPermission
import aws.sdk.kotlin.services.ec2.model.ProductCode
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeFpgaImageAttributeDocument(deserializer: Deserializer): FpgaImageAttribute {
    val builder = FpgaImageAttribute.builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val FPGAIMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("fpgaImageId"))
    val LOADPERMISSIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("loadPermissions"), XmlCollectionName("item"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("name"))
    val PRODUCTCODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("productCodes"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FpgaImageAttribute"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(FPGAIMAGEID_DESCRIPTOR)
        field(LOADPERMISSIONS_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(PRODUCTCODES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                FPGAIMAGEID_DESCRIPTOR.index -> builder.fpgaImageId = deserializeString()
                LOADPERMISSIONS_DESCRIPTOR.index -> builder.loadPermissions =
                    deserializer.deserializeList(LOADPERMISSIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<LoadPermission>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLoadPermissionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NAME_DESCRIPTOR.index -> builder.name = deserializeString()
                PRODUCTCODES_DESCRIPTOR.index -> builder.productCodes =
                    deserializer.deserializeList(PRODUCTCODES_DESCRIPTOR) {
                        val col0 = mutableListOf<ProductCode>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeProductCodeDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
