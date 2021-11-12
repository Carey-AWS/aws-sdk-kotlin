// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.BackupStatus
import aws.sdk.kotlin.services.dynamodb.model.BackupSummary
import aws.sdk.kotlin.services.dynamodb.model.BackupType
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


internal suspend fun deserializeBackupSummaryDocument(deserializer: Deserializer): BackupSummary {
    val builder = BackupSummary.builder()
    val BACKUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BackupArn"))
    val BACKUPCREATIONDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("BackupCreationDateTime"))
    val BACKUPEXPIRYDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("BackupExpiryDateTime"))
    val BACKUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BackupName"))
    val BACKUPSIZEBYTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("BackupSizeBytes"))
    val BACKUPSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BackupStatus"))
    val BACKUPTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BackupType"))
    val TABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableArn"))
    val TABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableId"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(BACKUPARN_DESCRIPTOR)
        field(BACKUPCREATIONDATETIME_DESCRIPTOR)
        field(BACKUPEXPIRYDATETIME_DESCRIPTOR)
        field(BACKUPNAME_DESCRIPTOR)
        field(BACKUPSIZEBYTES_DESCRIPTOR)
        field(BACKUPSTATUS_DESCRIPTOR)
        field(BACKUPTYPE_DESCRIPTOR)
        field(TABLEARN_DESCRIPTOR)
        field(TABLEID_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BACKUPARN_DESCRIPTOR.index -> builder.backupArn = deserializeString()
                BACKUPCREATIONDATETIME_DESCRIPTOR.index -> builder.backupCreationDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                BACKUPEXPIRYDATETIME_DESCRIPTOR.index -> builder.backupExpiryDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                BACKUPNAME_DESCRIPTOR.index -> builder.backupName = deserializeString()
                BACKUPSIZEBYTES_DESCRIPTOR.index -> builder.backupSizeBytes = deserializeLong()
                BACKUPSTATUS_DESCRIPTOR.index -> builder.backupStatus = deserializeString().let { BackupStatus.fromValue(it) }
                BACKUPTYPE_DESCRIPTOR.index -> builder.backupType = deserializeString().let { BackupType.fromValue(it) }
                TABLEARN_DESCRIPTOR.index -> builder.tableArn = deserializeString()
                TABLEID_DESCRIPTOR.index -> builder.tableId = deserializeString()
                TABLENAME_DESCRIPTOR.index -> builder.tableName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
