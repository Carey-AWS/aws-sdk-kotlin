// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.Update
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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


internal fun serializeUpdateDocument(serializer: Serializer, input: Update) {
    val CONDITIONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ConditionExpression"))
    val EXPRESSIONATTRIBUTENAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeNames"))
    val EXPRESSIONATTRIBUTEVALUES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeValues"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Key"))
    val RETURNVALUESONCONDITIONCHECKFAILURE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnValuesOnConditionCheckFailure"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val UPDATEEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("UpdateExpression"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONDITIONEXPRESSION_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTEVALUES_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(RETURNVALUESONCONDITIONCHECKFAILURE_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
        field(UPDATEEXPRESSION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.key != null) {
            mapField(KEY_DESCRIPTOR) {
                input.key.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeAttributeValueDocument)) }
            }
        }
        input.updateExpression?.let { field(UPDATEEXPRESSION_DESCRIPTOR, it) }
        input.tableName?.let { field(TABLENAME_DESCRIPTOR, it) }
        input.conditionExpression?.let { field(CONDITIONEXPRESSION_DESCRIPTOR, it) }
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
        input.returnValuesOnConditionCheckFailure?.let { field(RETURNVALUESONCONDITIONCHECKFAILURE_DESCRIPTOR, it.value) }
    }
}
