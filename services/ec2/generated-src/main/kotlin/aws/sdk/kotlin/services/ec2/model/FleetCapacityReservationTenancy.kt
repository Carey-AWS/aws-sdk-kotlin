// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class FleetCapacityReservationTenancy {

    abstract val value: kotlin.String

    object Default : aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy() {
        override val value: kotlin.String = "default"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy = when(str) {
            "default" -> Default
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy> = listOf(
            Default
        )
    }
}
