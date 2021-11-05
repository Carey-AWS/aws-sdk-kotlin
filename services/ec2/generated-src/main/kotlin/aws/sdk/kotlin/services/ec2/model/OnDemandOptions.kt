// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the configuration of On-Demand Instances in an EC2 Fleet.
 */
class OnDemandOptions private constructor(builder: BuilderImpl) {
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If
     * you specify lowest-price, EC2 Fleet uses price to determine the order, launching
     * the lowest price first. If you specify prioritized, EC2 Fleet uses the priority
     * that you assigned to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to lowest-price.
     */
    val allocationStrategy: FleetOnDemandAllocationStrategy? = builder.allocationStrategy
    /**
     * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
     * Supported only for fleets of type instant.
     */
    val capacityReservationOptions: CapacityReservationOptions? = builder.capacityReservationOptions
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay.
     */
    val maxTotalPrice: String? = builder.maxTotalPrice
    /**
     * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is
     * not reached, the fleet launches no instances.
     */
    val minTargetCapacity: Int? = builder.minTargetCapacity
    /**
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported
     * only for fleets of type instant.
     */
    val singleAvailabilityZone: Boolean? = builder.singleAvailabilityZone
    /**
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * Supported only for fleets of type instant.
     */
    val singleInstanceType: Boolean? = builder.singleInstanceType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): OnDemandOptions = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("OnDemandOptions(")
        append("allocationStrategy=$allocationStrategy,")
        append("capacityReservationOptions=$capacityReservationOptions,")
        append("maxTotalPrice=$maxTotalPrice,")
        append("minTargetCapacity=$minTargetCapacity,")
        append("singleAvailabilityZone=$singleAvailabilityZone,")
        append("singleInstanceType=$singleInstanceType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationStrategy?.hashCode() ?: 0
        result = 31 * result + (capacityReservationOptions?.hashCode() ?: 0)
        result = 31 * result + (maxTotalPrice?.hashCode() ?: 0)
        result = 31 * result + (minTargetCapacity ?: 0)
        result = 31 * result + (singleAvailabilityZone?.hashCode() ?: 0)
        result = 31 * result + (singleInstanceType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OnDemandOptions

        if (allocationStrategy != other.allocationStrategy) return false
        if (capacityReservationOptions != other.capacityReservationOptions) return false
        if (maxTotalPrice != other.maxTotalPrice) return false
        if (minTargetCapacity != other.minTargetCapacity) return false
        if (singleAvailabilityZone != other.singleAvailabilityZone) return false
        if (singleInstanceType != other.singleInstanceType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): OnDemandOptions = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): OnDemandOptions
        /**
         * The order of the launch template overrides to use in fulfilling On-Demand capacity. If
         * you specify lowest-price, EC2 Fleet uses price to determine the order, launching
         * the lowest price first. If you specify prioritized, EC2 Fleet uses the priority
         * that you assigned to each launch template override, launching the highest priority first.
         * If you do not specify a value, EC2 Fleet defaults to lowest-price.
         */
        fun allocationStrategy(allocationStrategy: FleetOnDemandAllocationStrategy): FluentBuilder
        /**
         * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
         * Supported only for fleets of type instant.
         */
        fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptions): FluentBuilder
        /**
         * The maximum amount per hour for On-Demand Instances that you're willing to pay.
         */
        fun maxTotalPrice(maxTotalPrice: String): FluentBuilder
        /**
         * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is
         * not reached, the fleet launches no instances.
         */
        fun minTargetCapacity(minTargetCapacity: Int): FluentBuilder
        /**
         * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported
         * only for fleets of type instant.
         */
        fun singleAvailabilityZone(singleAvailabilityZone: Boolean): FluentBuilder
        /**
         * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
         * Supported only for fleets of type instant.
         */
        fun singleInstanceType(singleInstanceType: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The order of the launch template overrides to use in fulfilling On-Demand capacity. If
         * you specify lowest-price, EC2 Fleet uses price to determine the order, launching
         * the lowest price first. If you specify prioritized, EC2 Fleet uses the priority
         * that you assigned to each launch template override, launching the highest priority first.
         * If you do not specify a value, EC2 Fleet defaults to lowest-price.
         */
        var allocationStrategy: FleetOnDemandAllocationStrategy?
        /**
         * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
         * Supported only for fleets of type instant.
         */
        var capacityReservationOptions: CapacityReservationOptions?
        /**
         * The maximum amount per hour for On-Demand Instances that you're willing to pay.
         */
        var maxTotalPrice: String?
        /**
         * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is
         * not reached, the fleet launches no instances.
         */
        var minTargetCapacity: Int?
        /**
         * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported
         * only for fleets of type instant.
         */
        var singleAvailabilityZone: Boolean?
        /**
         * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
         * Supported only for fleets of type instant.
         */
        var singleInstanceType: Boolean?

        fun build(): OnDemandOptions
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CapacityReservationOptions] inside the given [block]
         */
        fun capacityReservationOptions(block: CapacityReservationOptions.DslBuilder.() -> kotlin.Unit) {
            this.capacityReservationOptions = CapacityReservationOptions.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var allocationStrategy: FleetOnDemandAllocationStrategy? = null
        override var capacityReservationOptions: CapacityReservationOptions? = null
        override var maxTotalPrice: String? = null
        override var minTargetCapacity: Int? = null
        override var singleAvailabilityZone: Boolean? = null
        override var singleInstanceType: Boolean? = null

        constructor(x: OnDemandOptions) : this() {
            this.allocationStrategy = x.allocationStrategy
            this.capacityReservationOptions = x.capacityReservationOptions
            this.maxTotalPrice = x.maxTotalPrice
            this.minTargetCapacity = x.minTargetCapacity
            this.singleAvailabilityZone = x.singleAvailabilityZone
            this.singleInstanceType = x.singleInstanceType
        }

        override fun build(): OnDemandOptions = OnDemandOptions(this)
        override fun allocationStrategy(allocationStrategy: FleetOnDemandAllocationStrategy): FluentBuilder = apply { this.allocationStrategy = allocationStrategy }
        override fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptions): FluentBuilder = apply { this.capacityReservationOptions = capacityReservationOptions }
        override fun maxTotalPrice(maxTotalPrice: String): FluentBuilder = apply { this.maxTotalPrice = maxTotalPrice }
        override fun minTargetCapacity(minTargetCapacity: Int): FluentBuilder = apply { this.minTargetCapacity = minTargetCapacity }
        override fun singleAvailabilityZone(singleAvailabilityZone: Boolean): FluentBuilder = apply { this.singleAvailabilityZone = singleAvailabilityZone }
        override fun singleInstanceType(singleInstanceType: Boolean): FluentBuilder = apply { this.singleInstanceType = singleInstanceType }
    }
}
