// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



sealed class BackupType {

    abstract val value: kotlin.String

    object AwsBackup : aws.sdk.kotlin.services.dynamodb.model.BackupType() {
        override val value: kotlin.String = "AWS_BACKUP"
        override fun toString(): kotlin.String = value
    }

    object System : aws.sdk.kotlin.services.dynamodb.model.BackupType() {
        override val value: kotlin.String = "SYSTEM"
        override fun toString(): kotlin.String = value
    }

    object User : aws.sdk.kotlin.services.dynamodb.model.BackupType() {
        override val value: kotlin.String = "USER"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.BackupType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.BackupType = when(str) {
            "AWS_BACKUP" -> AwsBackup
            "SYSTEM" -> System
            "USER" -> User
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.BackupType> = listOf(
            AwsBackup,
            System,
            User
        )
    }
}
