// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class BundleTaskState {

    abstract val value: kotlin.String

    object Bundling : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "bundling"
        override fun toString(): kotlin.String = value
    }

    object Cancelling : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "cancelling"
        override fun toString(): kotlin.String = value
    }

    object Complete : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "complete"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    object Storing : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "storing"
        override fun toString(): kotlin.String = value
    }

    object WaitingForShutdown : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override val value: kotlin.String = "waiting-for-shutdown"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.BundleTaskState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.BundleTaskState = when(str) {
            "bundling" -> Bundling
            "cancelling" -> Cancelling
            "complete" -> Complete
            "failed" -> Failed
            "pending" -> Pending
            "storing" -> Storing
            "waiting-for-shutdown" -> WaitingForShutdown
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.BundleTaskState> = listOf(
            Bundling,
            Cancelling,
            Complete,
            Failed,
            Pending,
            Storing,
            WaitingForShutdown
        )
    }
}
