// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FpgaDeviceInfo
import aws.sdk.kotlin.services.ec2.model.FpgaInfo
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


internal suspend fun deserializeFpgaInfoDocument(deserializer: Deserializer): FpgaInfo {
    val builder = FpgaInfo.builder()
    val FPGAS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("fpgas"), XmlCollectionName("item"))
    val TOTALFPGAMEMORYINMIB_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalFpgaMemoryInMiB"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FpgaInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(FPGAS_DESCRIPTOR)
        field(TOTALFPGAMEMORYINMIB_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FPGAS_DESCRIPTOR.index -> builder.fpgas =
                    deserializer.deserializeList(FPGAS_DESCRIPTOR) {
                        val col0 = mutableListOf<FpgaDeviceInfo>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeFpgaDeviceInfoDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TOTALFPGAMEMORYINMIB_DESCRIPTOR.index -> builder.totalFpgaMemoryInMib = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
