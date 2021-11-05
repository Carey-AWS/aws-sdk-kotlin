// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the output of a DescribeLimits operation.
 */
class DescribeLimitsResponse private constructor(builder: BuilderImpl) {
    /**
     * The maximum total read capacity units that your account allows you to provision across
     * all of your tables in this Region.
     */
    val accountMaxReadCapacityUnits: Long? = builder.accountMaxReadCapacityUnits
    /**
     * The maximum total write capacity units that your account allows you to provision across
     * all of your tables in this Region.
     */
    val accountMaxWriteCapacityUnits: Long? = builder.accountMaxWriteCapacityUnits
    /**
     * The maximum read capacity units that your account allows you to provision for a new
     * table that you are creating in this Region, including the read capacity units
     * provisioned for its global secondary indexes (GSIs).
     */
    val tableMaxReadCapacityUnits: Long? = builder.tableMaxReadCapacityUnits
    /**
     * The maximum write capacity units that your account allows you to provision for a new
     * table that you are creating in this Region, including the write capacity units
     * provisioned for its global secondary indexes (GSIs).
     */
    val tableMaxWriteCapacityUnits: Long? = builder.tableMaxWriteCapacityUnits

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeLimitsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLimitsResponse(")
        append("accountMaxReadCapacityUnits=$accountMaxReadCapacityUnits,")
        append("accountMaxWriteCapacityUnits=$accountMaxWriteCapacityUnits,")
        append("tableMaxReadCapacityUnits=$tableMaxReadCapacityUnits,")
        append("tableMaxWriteCapacityUnits=$tableMaxWriteCapacityUnits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accountMaxReadCapacityUnits?.hashCode() ?: 0
        result = 31 * result + (accountMaxWriteCapacityUnits?.hashCode() ?: 0)
        result = 31 * result + (tableMaxReadCapacityUnits?.hashCode() ?: 0)
        result = 31 * result + (tableMaxWriteCapacityUnits?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeLimitsResponse

        if (accountMaxReadCapacityUnits != other.accountMaxReadCapacityUnits) return false
        if (accountMaxWriteCapacityUnits != other.accountMaxWriteCapacityUnits) return false
        if (tableMaxReadCapacityUnits != other.tableMaxReadCapacityUnits) return false
        if (tableMaxWriteCapacityUnits != other.tableMaxWriteCapacityUnits) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeLimitsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeLimitsResponse
        /**
         * The maximum total read capacity units that your account allows you to provision across
         * all of your tables in this Region.
         */
        fun accountMaxReadCapacityUnits(accountMaxReadCapacityUnits: Long): FluentBuilder
        /**
         * The maximum total write capacity units that your account allows you to provision across
         * all of your tables in this Region.
         */
        fun accountMaxWriteCapacityUnits(accountMaxWriteCapacityUnits: Long): FluentBuilder
        /**
         * The maximum read capacity units that your account allows you to provision for a new
         * table that you are creating in this Region, including the read capacity units
         * provisioned for its global secondary indexes (GSIs).
         */
        fun tableMaxReadCapacityUnits(tableMaxReadCapacityUnits: Long): FluentBuilder
        /**
         * The maximum write capacity units that your account allows you to provision for a new
         * table that you are creating in this Region, including the write capacity units
         * provisioned for its global secondary indexes (GSIs).
         */
        fun tableMaxWriteCapacityUnits(tableMaxWriteCapacityUnits: Long): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The maximum total read capacity units that your account allows you to provision across
         * all of your tables in this Region.
         */
        var accountMaxReadCapacityUnits: Long?
        /**
         * The maximum total write capacity units that your account allows you to provision across
         * all of your tables in this Region.
         */
        var accountMaxWriteCapacityUnits: Long?
        /**
         * The maximum read capacity units that your account allows you to provision for a new
         * table that you are creating in this Region, including the read capacity units
         * provisioned for its global secondary indexes (GSIs).
         */
        var tableMaxReadCapacityUnits: Long?
        /**
         * The maximum write capacity units that your account allows you to provision for a new
         * table that you are creating in this Region, including the write capacity units
         * provisioned for its global secondary indexes (GSIs).
         */
        var tableMaxWriteCapacityUnits: Long?

        fun build(): DescribeLimitsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var accountMaxReadCapacityUnits: Long? = null
        override var accountMaxWriteCapacityUnits: Long? = null
        override var tableMaxReadCapacityUnits: Long? = null
        override var tableMaxWriteCapacityUnits: Long? = null

        constructor(x: DescribeLimitsResponse) : this() {
            this.accountMaxReadCapacityUnits = x.accountMaxReadCapacityUnits
            this.accountMaxWriteCapacityUnits = x.accountMaxWriteCapacityUnits
            this.tableMaxReadCapacityUnits = x.tableMaxReadCapacityUnits
            this.tableMaxWriteCapacityUnits = x.tableMaxWriteCapacityUnits
        }

        override fun build(): DescribeLimitsResponse = DescribeLimitsResponse(this)
        override fun accountMaxReadCapacityUnits(accountMaxReadCapacityUnits: Long): FluentBuilder = apply { this.accountMaxReadCapacityUnits = accountMaxReadCapacityUnits }
        override fun accountMaxWriteCapacityUnits(accountMaxWriteCapacityUnits: Long): FluentBuilder = apply { this.accountMaxWriteCapacityUnits = accountMaxWriteCapacityUnits }
        override fun tableMaxReadCapacityUnits(tableMaxReadCapacityUnits: Long): FluentBuilder = apply { this.tableMaxReadCapacityUnits = tableMaxReadCapacityUnits }
        override fun tableMaxWriteCapacityUnits(tableMaxWriteCapacityUnits: Long): FluentBuilder = apply { this.tableMaxWriteCapacityUnits = tableMaxWriteCapacityUnits }
    }
}
