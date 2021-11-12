// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeConversionTasksRequest private constructor(builder: BuilderImpl) {
    /**
     * The conversion task IDs.
     */
    val conversionTaskIds: List<String>? = builder.conversionTaskIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeConversionTasksRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeConversionTasksRequest(")
        append("conversionTaskIds=$conversionTaskIds,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conversionTaskIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeConversionTasksRequest

        if (conversionTaskIds != other.conversionTaskIds) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeConversionTasksRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeConversionTasksRequest
        /**
         * The conversion task IDs.
         */
        fun conversionTaskIds(conversionTaskIds: List<String>): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The conversion task IDs.
         */
        var conversionTaskIds: List<String>?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?

        fun build(): DescribeConversionTasksRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var conversionTaskIds: List<String>? = null
        override var dryRun: Boolean? = null

        constructor(x: DescribeConversionTasksRequest) : this() {
            this.conversionTaskIds = x.conversionTaskIds
            this.dryRun = x.dryRun
        }

        override fun build(): DescribeConversionTasksRequest = DescribeConversionTasksRequest(this)
        override fun conversionTaskIds(conversionTaskIds: List<String>): FluentBuilder = apply { this.conversionTaskIds = conversionTaskIds }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
    }
}
