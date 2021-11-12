// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class AllocationState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    object PermanentFailure : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "permanent-failure"
        override fun toString(): kotlin.String = value
    }

    object Released : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "released"
        override fun toString(): kotlin.String = value
    }

    object ReleasedPermanentFailure : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "released-permanent-failure"
        override fun toString(): kotlin.String = value
    }

    object UnderAssessment : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override val value: kotlin.String = "under-assessment"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AllocationState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AllocationState = when(str) {
            "available" -> Available
            "pending" -> Pending
            "permanent-failure" -> PermanentFailure
            "released" -> Released
            "released-permanent-failure" -> ReleasedPermanentFailure
            "under-assessment" -> UnderAssessment
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AllocationState> = listOf(
            Available,
            Pending,
            PermanentFailure,
            Released,
            ReleasedPermanentFailure,
            UnderAssessment
        )
    }
}
