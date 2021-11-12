// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



sealed class ReturnValue {

    abstract val value: kotlin.String

    object AllNew : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override val value: kotlin.String = "ALL_NEW"
        override fun toString(): kotlin.String = value
    }

    object AllOld : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override val value: kotlin.String = "ALL_OLD"
        override fun toString(): kotlin.String = value
    }

    object None : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override val value: kotlin.String = "NONE"
        override fun toString(): kotlin.String = value
    }

    object UpdatedNew : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override val value: kotlin.String = "UPDATED_NEW"
        override fun toString(): kotlin.String = value
    }

    object UpdatedOld : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override val value: kotlin.String = "UPDATED_OLD"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.ReturnValue() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.ReturnValue = when(str) {
            "ALL_NEW" -> AllNew
            "ALL_OLD" -> AllOld
            "NONE" -> None
            "UPDATED_NEW" -> UpdatedNew
            "UPDATED_OLD" -> UpdatedOld
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.ReturnValue> = listOf(
            AllNew,
            AllOld,
            None,
            UpdatedNew,
            UpdatedOld
        )
    }
}
