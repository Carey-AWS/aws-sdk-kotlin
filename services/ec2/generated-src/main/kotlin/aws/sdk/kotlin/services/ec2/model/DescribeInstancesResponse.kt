// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeInstancesResponse private constructor(builder: BuilderImpl) {
    /**
     * The token to use to retrieve the next page of results. This value is null
     * when there are no more results to return.
     */
    val nextToken: String? = builder.nextToken
    /**
     * Information about the reservations.
     */
    val reservations: List<Reservation>? = builder.reservations

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeInstancesResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeInstancesResponse(")
        append("nextToken=$nextToken,")
        append("reservations=$reservations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (reservations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeInstancesResponse

        if (nextToken != other.nextToken) return false
        if (reservations != other.reservations) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeInstancesResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeInstancesResponse
        /**
         * The token to use to retrieve the next page of results. This value is null
         * when there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * Information about the reservations.
         */
        fun reservations(reservations: List<Reservation>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The token to use to retrieve the next page of results. This value is null
         * when there are no more results to return.
         */
        var nextToken: String?
        /**
         * Information about the reservations.
         */
        var reservations: List<Reservation>?

        fun build(): DescribeInstancesResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var nextToken: String? = null
        override var reservations: List<Reservation>? = null

        constructor(x: DescribeInstancesResponse) : this() {
            this.nextToken = x.nextToken
            this.reservations = x.reservations
        }

        override fun build(): DescribeInstancesResponse = DescribeInstancesResponse(this)
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun reservations(reservations: List<Reservation>): FluentBuilder = apply { this.reservations = reservations }
    }
}
