// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.RestoreTableFromBackupRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
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
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class RestoreTableFromBackupOperationSerializer: HttpSerialize<RestoreTableFromBackupRequest> {
    override suspend fun serialize(context: ExecutionContext, input: RestoreTableFromBackupRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeRestoreTableFromBackupOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeRestoreTableFromBackupOperationBody(context: ExecutionContext, input: RestoreTableFromBackupRequest): ByteArray {
    val serializer = JsonSerializer()
    val BACKUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BackupArn"))
    val BILLINGMODEOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("BillingModeOverride"))
    val GLOBALSECONDARYINDEXOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("GlobalSecondaryIndexOverride"))
    val LOCALSECONDARYINDEXOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("LocalSecondaryIndexOverride"))
    val PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ProvisionedThroughputOverride"))
    val SSESPECIFICATIONOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("SSESpecificationOverride"))
    val TARGETTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TargetTableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(BACKUPARN_DESCRIPTOR)
        field(BILLINGMODEOVERRIDE_DESCRIPTOR)
        field(GLOBALSECONDARYINDEXOVERRIDE_DESCRIPTOR)
        field(LOCALSECONDARYINDEXOVERRIDE_DESCRIPTOR)
        field(PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR)
        field(SSESPECIFICATIONOVERRIDE_DESCRIPTOR)
        field(TARGETTABLENAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.backupArn?.let { field(BACKUPARN_DESCRIPTOR, it) }
        input.billingModeOverride?.let { field(BILLINGMODEOVERRIDE_DESCRIPTOR, it.value) }
        if (input.globalSecondaryIndexOverride != null) {
            listField(GLOBALSECONDARYINDEXOVERRIDE_DESCRIPTOR) {
                for (el0 in input.globalSecondaryIndexOverride) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGlobalSecondaryIndexDocument))
                }
            }
        }
        if (input.localSecondaryIndexOverride != null) {
            listField(LOCALSECONDARYINDEXOVERRIDE_DESCRIPTOR) {
                for (el0 in input.localSecondaryIndexOverride) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLocalSecondaryIndexDocument))
                }
            }
        }
        input.provisionedThroughputOverride?.let { field(PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR, it, ::serializeProvisionedThroughputDocument) }
        input.sseSpecificationOverride?.let { field(SSESPECIFICATIONOVERRIDE_DESCRIPTOR, it, ::serializeSseSpecificationDocument) }
        input.targetTableName?.let { field(TARGETTABLENAME_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
