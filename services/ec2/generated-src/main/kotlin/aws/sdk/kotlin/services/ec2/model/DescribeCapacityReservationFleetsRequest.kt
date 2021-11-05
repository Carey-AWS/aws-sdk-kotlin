// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeCapacityReservationFleetsRequest private constructor(builder: BuilderImpl) {
    /**
     * The IDs of the Capacity Reservation Fleets to describe.
     */
    val capacityReservationFleetIds: List<String>? = builder.capacityReservationFleetIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters.
     * state - The state of the Fleet (submitted | modifying | active |
     * partially_fulfilled | expiring | expired | cancelling |
     * cancelled | failed).
     * instance-match-criteria - The instance matching criteria for the Fleet. Only open is supported.
     * tenancy - The tenancy of the Fleet (default | dedicated).
     * allocation-strategy - The allocation strategy used by the Fleet. Only prioritized is supported.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token to use to retrieve the next page of results.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeCapacityReservationFleetsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeCapacityReservationFleetsRequest(")
        append("capacityReservationFleetIds=$capacityReservationFleetIds,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityReservationFleetIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeCapacityReservationFleetsRequest

        if (capacityReservationFleetIds != other.capacityReservationFleetIds) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeCapacityReservationFleetsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeCapacityReservationFleetsRequest
        /**
         * The IDs of the Capacity Reservation Fleets to describe.
         */
        fun capacityReservationFleetIds(capacityReservationFleetIds: List<String>): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters.
         * state - The state of the Fleet (submitted | modifying | active |
         * partially_fulfilled | expiring | expired | cancelling |
         * cancelled | failed).
         * instance-match-criteria - The instance matching criteria for the Fleet. Only open is supported.
         * tenancy - The tenancy of the Fleet (default | dedicated).
         * allocation-strategy - The allocation strategy used by the Fleet. Only prioritized is supported.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token to use to retrieve the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The IDs of the Capacity Reservation Fleets to describe.
         */
        var capacityReservationFleetIds: List<String>?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * One or more filters.
         * state - The state of the Fleet (submitted | modifying | active |
         * partially_fulfilled | expiring | expired | cancelling |
         * cancelled | failed).
         * instance-match-criteria - The instance matching criteria for the Fleet. Only open is supported.
         * tenancy - The tenancy of the Fleet (default | dedicated).
         * allocation-strategy - The allocation strategy used by the Fleet. Only prioritized is supported.
         */
        var filters: List<Filter>?
        /**
         * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
         */
        var maxResults: Int?
        /**
         * The token to use to retrieve the next page of results.
         */
        var nextToken: String?

        fun build(): DescribeCapacityReservationFleetsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var capacityReservationFleetIds: List<String>? = null
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null

        constructor(x: DescribeCapacityReservationFleetsRequest) : this() {
            this.capacityReservationFleetIds = x.capacityReservationFleetIds
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeCapacityReservationFleetsRequest = DescribeCapacityReservationFleetsRequest(this)
        override fun capacityReservationFleetIds(capacityReservationFleetIds: List<String>): FluentBuilder = apply { this.capacityReservationFleetIds = capacityReservationFleetIds }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
