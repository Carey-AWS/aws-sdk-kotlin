// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.services.polly.model.Engine
import aws.sdk.kotlin.services.polly.model.Gender
import aws.sdk.kotlin.services.polly.model.LanguageCode
import aws.sdk.kotlin.services.polly.model.Voice
import aws.sdk.kotlin.services.polly.model.VoiceId
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
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


internal fun deserializeVoiceDocument(deserializer: Deserializer): Voice {
    val builder = Voice.builder()
    val ADDITIONALLANGUAGECODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("AdditionalLanguageCodes"))
    val GENDER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Gender"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Id"))
    val LANGUAGECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("LanguageCode"))
    val LANGUAGENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("LanguageName"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Name"))
    val SUPPORTEDENGINES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("SupportedEngines"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ADDITIONALLANGUAGECODES_DESCRIPTOR)
        field(GENDER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(LANGUAGECODE_DESCRIPTOR)
        field(LANGUAGENAME_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(SUPPORTEDENGINES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ADDITIONALLANGUAGECODES_DESCRIPTOR.index -> builder.additionalLanguageCodes =
                    deserializer.deserializeList(ADDITIONALLANGUAGECODES_DESCRIPTOR) {
                        val col0 = mutableListOf<LanguageCode>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { LanguageCode.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                GENDER_DESCRIPTOR.index -> builder.gender = deserializeString().let { Gender.fromValue(it) }
                ID_DESCRIPTOR.index -> builder.id = deserializeString().let { VoiceId.fromValue(it) }
                LANGUAGECODE_DESCRIPTOR.index -> builder.languageCode = deserializeString().let { LanguageCode.fromValue(it) }
                LANGUAGENAME_DESCRIPTOR.index -> builder.languageName = deserializeString()
                NAME_DESCRIPTOR.index -> builder.name = deserializeString()
                SUPPORTEDENGINES_DESCRIPTOR.index -> builder.supportedEngines =
                    deserializer.deserializeList(SUPPORTEDENGINES_DESCRIPTOR) {
                        val col0 = mutableListOf<Engine>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { Engine.fromValue(it) } } else { deserializeNull(); continue }
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
