// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class EnaSupport {

    abstract val value: kotlin.String

    object Required : aws.sdk.kotlin.services.ec2.model.EnaSupport() {
        override val value: kotlin.String = "required"
        override fun toString(): kotlin.String = value
    }

    object Supported : aws.sdk.kotlin.services.ec2.model.EnaSupport() {
        override val value: kotlin.String = "supported"
        override fun toString(): kotlin.String = value
    }

    object Unsupported : aws.sdk.kotlin.services.ec2.model.EnaSupport() {
        override val value: kotlin.String = "unsupported"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.EnaSupport() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.EnaSupport = when(str) {
            "required" -> Required
            "supported" -> Supported
            "unsupported" -> Unsupported
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.EnaSupport> = listOf(
            Required,
            Supported,
            Unsupported
        )
    }
}
