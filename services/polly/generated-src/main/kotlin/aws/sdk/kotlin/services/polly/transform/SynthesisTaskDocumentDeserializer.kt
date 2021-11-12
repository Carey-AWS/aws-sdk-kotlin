// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.services.polly.model.Engine
import aws.sdk.kotlin.services.polly.model.LanguageCode
import aws.sdk.kotlin.services.polly.model.OutputFormat
import aws.sdk.kotlin.services.polly.model.SpeechMarkType
import aws.sdk.kotlin.services.polly.model.SynthesisTask
import aws.sdk.kotlin.services.polly.model.TaskStatus
import aws.sdk.kotlin.services.polly.model.TextType
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeSynthesisTaskDocument(deserializer: Deserializer): SynthesisTask {
    val builder = SynthesisTask.builder()
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("CreationTime"))
    val ENGINE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Engine"))
    val LANGUAGECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("LanguageCode"))
    val LEXICONNAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("LexiconNames"))
    val OUTPUTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("OutputFormat"))
    val OUTPUTURI_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("OutputUri"))
    val REQUESTCHARACTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("RequestCharacters"))
    val SAMPLERATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("SampleRate"))
    val SNSTOPICARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("SnsTopicArn"))
    val SPEECHMARKTYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("SpeechMarkTypes"))
    val TASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TaskId"))
    val TASKSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TaskStatus"))
    val TASKSTATUSREASON_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TaskStatusReason"))
    val TEXTTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TextType"))
    val VOICEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("VoiceId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CREATIONTIME_DESCRIPTOR)
        field(ENGINE_DESCRIPTOR)
        field(LANGUAGECODE_DESCRIPTOR)
        field(LEXICONNAMES_DESCRIPTOR)
        field(OUTPUTFORMAT_DESCRIPTOR)
        field(OUTPUTURI_DESCRIPTOR)
        field(REQUESTCHARACTERS_DESCRIPTOR)
        field(SAMPLERATE_DESCRIPTOR)
        field(SNSTOPICARN_DESCRIPTOR)
        field(SPEECHMARKTYPES_DESCRIPTOR)
        field(TASKID_DESCRIPTOR)
        field(TASKSTATUS_DESCRIPTOR)
        field(TASKSTATUSREASON_DESCRIPTOR)
        field(TEXTTYPE_DESCRIPTOR)
        field(VOICEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                ENGINE_DESCRIPTOR.index -> builder.engine = deserializeString().let { Engine.fromValue(it) }
                LANGUAGECODE_DESCRIPTOR.index -> builder.languageCode = deserializeString().let { LanguageCode.fromValue(it) }
                LEXICONNAMES_DESCRIPTOR.index -> builder.lexiconNames =
                    deserializer.deserializeList(LEXICONNAMES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                OUTPUTFORMAT_DESCRIPTOR.index -> builder.outputFormat = deserializeString().let { OutputFormat.fromValue(it) }
                OUTPUTURI_DESCRIPTOR.index -> builder.outputUri = deserializeString()
                REQUESTCHARACTERS_DESCRIPTOR.index -> builder.requestCharacters = deserializeInt()
                SAMPLERATE_DESCRIPTOR.index -> builder.sampleRate = deserializeString()
                SNSTOPICARN_DESCRIPTOR.index -> builder.snsTopicArn = deserializeString()
                SPEECHMARKTYPES_DESCRIPTOR.index -> builder.speechMarkTypes =
                    deserializer.deserializeList(SPEECHMARKTYPES_DESCRIPTOR) {
                        val col0 = mutableListOf<SpeechMarkType>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { SpeechMarkType.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TASKID_DESCRIPTOR.index -> builder.taskId = deserializeString()
                TASKSTATUS_DESCRIPTOR.index -> builder.taskStatus = deserializeString().let { TaskStatus.fromValue(it) }
                TASKSTATUSREASON_DESCRIPTOR.index -> builder.taskStatusReason = deserializeString()
                TEXTTYPE_DESCRIPTOR.index -> builder.textType = deserializeString().let { TextType.fromValue(it) }
                VOICEID_DESCRIPTOR.index -> builder.voiceId = deserializeString().let { VoiceId.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
