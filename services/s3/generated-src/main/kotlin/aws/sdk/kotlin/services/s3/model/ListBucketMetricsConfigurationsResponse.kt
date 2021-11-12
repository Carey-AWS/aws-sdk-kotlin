// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketMetricsConfigurationsResponse private constructor(builder: BuilderImpl) {
    /**
     * The marker that is used as a starting point for this metrics configuration list
     * response. This value is present if it was sent in the request.
     */
    val continuationToken: String? = builder.continuationToken
    /**
     * Indicates whether the returned list of metrics configurations is complete. A value of
     * true indicates that the list is not complete and the NextContinuationToken will be provided
     * for a subsequent request.
     */
    val isTruncated: Boolean = builder.isTruncated
    /**
     * The list of metrics configurations for a bucket.
     */
    val metricsConfigurationList: List<MetricsConfiguration>? = builder.metricsConfigurationList
    /**
     * The marker used to continue a metrics configuration listing that has been truncated. Use
     * the NextContinuationToken from a previously truncated list response to
     * continue the listing. The continuation token is an opaque value that Amazon S3
     * understands.
     */
    val nextContinuationToken: String? = builder.nextContinuationToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ListBucketMetricsConfigurationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketMetricsConfigurationsResponse(")
        append("continuationToken=$continuationToken,")
        append("isTruncated=$isTruncated,")
        append("metricsConfigurationList=$metricsConfigurationList,")
        append("nextContinuationToken=$nextContinuationToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = continuationToken?.hashCode() ?: 0
        result = 31 * result + (isTruncated.hashCode())
        result = 31 * result + (metricsConfigurationList?.hashCode() ?: 0)
        result = 31 * result + (nextContinuationToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListBucketMetricsConfigurationsResponse

        if (continuationToken != other.continuationToken) return false
        if (isTruncated != other.isTruncated) return false
        if (metricsConfigurationList != other.metricsConfigurationList) return false
        if (nextContinuationToken != other.nextContinuationToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ListBucketMetricsConfigurationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ListBucketMetricsConfigurationsResponse
        /**
         * The marker that is used as a starting point for this metrics configuration list
         * response. This value is present if it was sent in the request.
         */
        fun continuationToken(continuationToken: String): FluentBuilder
        /**
         * Indicates whether the returned list of metrics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        fun isTruncated(isTruncated: Boolean): FluentBuilder
        /**
         * The list of metrics configurations for a bucket.
         */
        fun metricsConfigurationList(metricsConfigurationList: List<MetricsConfiguration>): FluentBuilder
        /**
         * The marker used to continue a metrics configuration listing that has been truncated. Use
         * the NextContinuationToken from a previously truncated list response to
         * continue the listing. The continuation token is an opaque value that Amazon S3
         * understands.
         */
        fun nextContinuationToken(nextContinuationToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The marker that is used as a starting point for this metrics configuration list
         * response. This value is present if it was sent in the request.
         */
        var continuationToken: String?
        /**
         * Indicates whether the returned list of metrics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        var isTruncated: Boolean
        /**
         * The list of metrics configurations for a bucket.
         */
        var metricsConfigurationList: List<MetricsConfiguration>?
        /**
         * The marker used to continue a metrics configuration listing that has been truncated. Use
         * the NextContinuationToken from a previously truncated list response to
         * continue the listing. The continuation token is an opaque value that Amazon S3
         * understands.
         */
        var nextContinuationToken: String?

        fun build(): ListBucketMetricsConfigurationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var continuationToken: String? = null
        override var isTruncated: Boolean = false
        override var metricsConfigurationList: List<MetricsConfiguration>? = null
        override var nextContinuationToken: String? = null

        constructor(x: ListBucketMetricsConfigurationsResponse) : this() {
            this.continuationToken = x.continuationToken
            this.isTruncated = x.isTruncated
            this.metricsConfigurationList = x.metricsConfigurationList
            this.nextContinuationToken = x.nextContinuationToken
        }

        override fun build(): ListBucketMetricsConfigurationsResponse = ListBucketMetricsConfigurationsResponse(this)
        override fun continuationToken(continuationToken: String): FluentBuilder = apply { this.continuationToken = continuationToken }
        override fun isTruncated(isTruncated: Boolean): FluentBuilder = apply { this.isTruncated = isTruncated }
        override fun metricsConfigurationList(metricsConfigurationList: List<MetricsConfiguration>): FluentBuilder = apply { this.metricsConfigurationList = metricsConfigurationList }
        override fun nextContinuationToken(nextContinuationToken: String): FluentBuilder = apply { this.nextContinuationToken = nextContinuationToken }
    }
}
