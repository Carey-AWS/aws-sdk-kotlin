// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



sealed class FileHeaderInfo {

    abstract val value: kotlin.String

    object Ignore : aws.sdk.kotlin.services.s3.model.FileHeaderInfo() {
        override val value: kotlin.String = "IGNORE"
        override fun toString(): kotlin.String = value
    }

    object None : aws.sdk.kotlin.services.s3.model.FileHeaderInfo() {
        override val value: kotlin.String = "NONE"
        override fun toString(): kotlin.String = value
    }

    object Use : aws.sdk.kotlin.services.s3.model.FileHeaderInfo() {
        override val value: kotlin.String = "USE"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.FileHeaderInfo() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.FileHeaderInfo = when(str) {
            "IGNORE" -> Ignore
            "NONE" -> None
            "USE" -> Use
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.FileHeaderInfo> = listOf(
            Ignore,
            None,
            Use
        )
    }
}
