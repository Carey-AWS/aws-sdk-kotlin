// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class PlacementGroupStrategy {

    abstract val value: kotlin.String

    object Cluster : aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy() {
        override val value: kotlin.String = "cluster"
        override fun toString(): kotlin.String = value
    }

    object Partition : aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy() {
        override val value: kotlin.String = "partition"
        override fun toString(): kotlin.String = value
    }

    object Spread : aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy() {
        override val value: kotlin.String = "spread"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy = when(str) {
            "cluster" -> Cluster
            "partition" -> Partition
            "spread" -> Spread
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy> = listOf(
            Cluster,
            Partition,
            Spread
        )
    }
}
