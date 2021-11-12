// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeElasticGpusRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The Elastic Graphics accelerator IDs.
     */
    val elasticGpuIds: List<String>? = builder.elasticGpuIds
    /**
     * The filters.
     * availability-zone - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * elastic-gpu-health - The status of the Elastic Graphics accelerator
     * (OK | IMPAIRED).
     * elastic-gpu-state - The state of the Elastic Graphics accelerator
     * (ATTACHED).
     * elastic-gpu-type - The type of Elastic Graphics accelerator; for example,
     * eg1.medium.
     * instance-id - The ID of the instance to which the
     * Elastic Graphics accelerator is associated.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining
     * results, make another call with the returned NextToken value. This value
     * can be between 5 and 1000.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token to request the next page of results.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeElasticGpusRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeElasticGpusRequest(")
        append("dryRun=$dryRun,")
        append("elasticGpuIds=$elasticGpuIds,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (elasticGpuIds?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeElasticGpusRequest

        if (dryRun != other.dryRun) return false
        if (elasticGpuIds != other.elasticGpuIds) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeElasticGpusRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeElasticGpusRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The Elastic Graphics accelerator IDs.
         */
        fun elasticGpuIds(elasticGpuIds: List<String>): FluentBuilder
        /**
         * The filters.
         * availability-zone - The Availability Zone in which the
         * Elastic Graphics accelerator resides.
         * elastic-gpu-health - The status of the Elastic Graphics accelerator
         * (OK | IMPAIRED).
         * elastic-gpu-state - The state of the Elastic Graphics accelerator
         * (ATTACHED).
         * elastic-gpu-type - The type of Elastic Graphics accelerator; for example,
         * eg1.medium.
         * instance-id - The ID of the instance to which the
         * Elastic Graphics accelerator is associated.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining
         * results, make another call with the returned NextToken value. This value
         * can be between 5 and 1000.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token to request the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The Elastic Graphics accelerator IDs.
         */
        var elasticGpuIds: List<String>?
        /**
         * The filters.
         * availability-zone - The Availability Zone in which the
         * Elastic Graphics accelerator resides.
         * elastic-gpu-health - The status of the Elastic Graphics accelerator
         * (OK | IMPAIRED).
         * elastic-gpu-state - The state of the Elastic Graphics accelerator
         * (ATTACHED).
         * elastic-gpu-type - The type of Elastic Graphics accelerator; for example,
         * eg1.medium.
         * instance-id - The ID of the instance to which the
         * Elastic Graphics accelerator is associated.
         */
        var filters: List<Filter>?
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining
         * results, make another call with the returned NextToken value. This value
         * can be between 5 and 1000.
         */
        var maxResults: Int?
        /**
         * The token to request the next page of results.
         */
        var nextToken: String?

        fun build(): DescribeElasticGpusRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var elasticGpuIds: List<String>? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null

        constructor(x: DescribeElasticGpusRequest) : this() {
            this.dryRun = x.dryRun
            this.elasticGpuIds = x.elasticGpuIds
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeElasticGpusRequest = DescribeElasticGpusRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun elasticGpuIds(elasticGpuIds: List<String>): FluentBuilder = apply { this.elasticGpuIds = elasticGpuIds }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
