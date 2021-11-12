// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.UpdateItemRequest
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


internal class UpdateItemOperationSerializer: HttpSerialize<UpdateItemRequest> {
    override suspend fun serialize(context: ExecutionContext, input: UpdateItemRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeUpdateItemOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeUpdateItemOperationBody(context: ExecutionContext, input: UpdateItemRequest): ByteArray {
    val serializer = JsonSerializer()
    val ATTRIBUTEUPDATES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("AttributeUpdates"))
    val CONDITIONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ConditionExpression"))
    val CONDITIONALOPERATOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ConditionalOperator"))
    val EXPECTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Expected"))
    val EXPRESSIONATTRIBUTENAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeNames"))
    val EXPRESSIONATTRIBUTEVALUES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeValues"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Key"))
    val RETURNCONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnConsumedCapacity"))
    val RETURNITEMCOLLECTIONMETRICS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnItemCollectionMetrics"))
    val RETURNVALUES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnValues"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val UPDATEEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("UpdateExpression"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTEUPDATES_DESCRIPTOR)
        field(CONDITIONEXPRESSION_DESCRIPTOR)
        field(CONDITIONALOPERATOR_DESCRIPTOR)
        field(EXPECTED_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTEVALUES_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(RETURNCONSUMEDCAPACITY_DESCRIPTOR)
        field(RETURNITEMCOLLECTIONMETRICS_DESCRIPTOR)
        field(RETURNVALUES_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
        field(UPDATEEXPRESSION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.attributeUpdates != null) {
            mapField(ATTRIBUTEUPDATES_DESCRIPTOR) {
                input.attributeUpdates.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeAttributeValueUpdateDocument)) }
            }
        }
        input.conditionExpression?.let { field(CONDITIONEXPRESSION_DESCRIPTOR, it) }
        input.conditionalOperator?.let { field(CONDITIONALOPERATOR_DESCRIPTOR, it.value) }
        if (input.expected != null) {
            mapField(EXPECTED_DESCRIPTOR) {
                input.expected.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeExpectedAttributeValueDocument)) }
            }
        }
        if (input.expressionAttributeNames != null) {
            mapField(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR) {
                input.expressionAttributeNames.forEach { (key, value) -> entry(key, value) }
            }
        }
        if (input.expressionAttributeValues != null) {
            mapField(EXPRESSIONATTRIBUTEVALUES_DESCRIPTOR) {
                input.expressionAttributeValues.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeAttributeValueDocument)) }
            }
        }
        if (input.key != null) {
            mapField(KEY_DESCRIPTOR) {
                input.key.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeAttributeValueDocument)) }
            }
        }
        input.returnConsumedCapacity?.let { field(RETURNCONSUMEDCAPACITY_DESCRIPTOR, it.value) }
        input.returnItemCollectionMetrics?.let { field(RETURNITEMCOLLECTIONMETRICS_DESCRIPTOR, it.value) }
        input.returnValues?.let { field(RETURNVALUES_DESCRIPTOR, it.value) }
        input.tableName?.let { field(TABLENAME_DESCRIPTOR, it) }
        input.updateExpression?.let { field(UPDATEEXPRESSION_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
