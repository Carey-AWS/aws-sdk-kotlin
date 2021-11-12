// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketAnalyticsConfigurationsResponse private constructor(builder: BuilderImpl) {
    /**
     * The list of analytics configurations for a bucket.
     */
    val analyticsConfigurationList: List<AnalyticsConfiguration>? = builder.analyticsConfigurationList
    /**
     * The marker that is used as a starting point for this analytics configuration list
     * response. This value is present if it was sent in the request.
     */
    val continuationToken: String? = builder.continuationToken
    /**
     * Indicates whether the returned list of analytics configurations is complete. A value of
     * true indicates that the list is not complete and the NextContinuationToken will be provided
     * for a subsequent request.
     */
    val isTruncated: Boolean = builder.isTruncated
    /**
     * NextContinuationToken is sent when isTruncated is true, which
     * indicates that there are more analytics configurations to list. The next request must
     * include this NextContinuationToken. The token is obfuscated and is not a
     * usable value.
     */
    val nextContinuationToken: String? = builder.nextContinuationToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ListBucketAnalyticsConfigurationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketAnalyticsConfigurationsResponse(")
        append("analyticsConfigurationList=$analyticsConfigurationList,")
        append("continuationToken=$continuationToken,")
        append("isTruncated=$isTruncated,")
        append("nextContinuationToken=$nextContinuationToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = analyticsConfigurationList?.hashCode() ?: 0
        result = 31 * result + (continuationToken?.hashCode() ?: 0)
        result = 31 * result + (isTruncated.hashCode())
        result = 31 * result + (nextContinuationToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListBucketAnalyticsConfigurationsResponse

        if (analyticsConfigurationList != other.analyticsConfigurationList) return false
        if (continuationToken != other.continuationToken) return false
        if (isTruncated != other.isTruncated) return false
        if (nextContinuationToken != other.nextContinuationToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ListBucketAnalyticsConfigurationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ListBucketAnalyticsConfigurationsResponse
        /**
         * The list of analytics configurations for a bucket.
         */
        fun analyticsConfigurationList(analyticsConfigurationList: List<AnalyticsConfiguration>): FluentBuilder
        /**
         * The marker that is used as a starting point for this analytics configuration list
         * response. This value is present if it was sent in the request.
         */
        fun continuationToken(continuationToken: String): FluentBuilder
        /**
         * Indicates whether the returned list of analytics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        fun isTruncated(isTruncated: Boolean): FluentBuilder
        /**
         * NextContinuationToken is sent when isTruncated is true, which
         * indicates that there are more analytics configurations to list. The next request must
         * include this NextContinuationToken. The token is obfuscated and is not a
         * usable value.
         */
        fun nextContinuationToken(nextContinuationToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The list of analytics configurations for a bucket.
         */
        var analyticsConfigurationList: List<AnalyticsConfiguration>?
        /**
         * The marker that is used as a starting point for this analytics configuration list
         * response. This value is present if it was sent in the request.
         */
        var continuationToken: String?
        /**
         * Indicates whether the returned list of analytics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        var isTruncated: Boolean
        /**
         * NextContinuationToken is sent when isTruncated is true, which
         * indicates that there are more analytics configurations to list. The next request must
         * include this NextContinuationToken. The token is obfuscated and is not a
         * usable value.
         */
        var nextContinuationToken: String?

        fun build(): ListBucketAnalyticsConfigurationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var analyticsConfigurationList: List<AnalyticsConfiguration>? = null
        override var continuationToken: String? = null
        override var isTruncated: Boolean = false
        override var nextContinuationToken: String? = null

        constructor(x: ListBucketAnalyticsConfigurationsResponse) : this() {
            this.analyticsConfigurationList = x.analyticsConfigurationList
            this.continuationToken = x.continuationToken
            this.isTruncated = x.isTruncated
            this.nextContinuationToken = x.nextContinuationToken
        }

        override fun build(): ListBucketAnalyticsConfigurationsResponse = ListBucketAnalyticsConfigurationsResponse(this)
        override fun analyticsConfigurationList(analyticsConfigurationList: List<AnalyticsConfiguration>): FluentBuilder = apply { this.analyticsConfigurationList = analyticsConfigurationList }
        override fun continuationToken(continuationToken: String): FluentBuilder = apply { this.continuationToken = continuationToken }
        override fun isTruncated(isTruncated: Boolean): FluentBuilder = apply { this.isTruncated = isTruncated }
        override fun nextContinuationToken(nextContinuationToken: String): FluentBuilder = apply { this.nextContinuationToken = nextContinuationToken }
    }
}
