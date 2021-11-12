// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetManagedPrefixListAssociationsRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: String? = builder.nextToken
    /**
     * The ID of the prefix list.
     */
    val prefixListId: String? = builder.prefixListId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetManagedPrefixListAssociationsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetManagedPrefixListAssociationsRequest(")
        append("dryRun=$dryRun,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("prefixListId=$prefixListId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetManagedPrefixListAssociationsRequest

        if (dryRun != other.dryRun) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (prefixListId != other.prefixListId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetManagedPrefixListAssociationsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetManagedPrefixListAssociationsRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token for the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * The ID of the prefix list.
         */
        fun prefixListId(prefixListId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: Int?
        /**
         * The token for the next page of results.
         */
        var nextToken: String?
        /**
         * The ID of the prefix list.
         */
        var prefixListId: String?

        fun build(): GetManagedPrefixListAssociationsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var prefixListId: String? = null

        constructor(x: GetManagedPrefixListAssociationsRequest) : this() {
            this.dryRun = x.dryRun
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.prefixListId = x.prefixListId
        }

        override fun build(): GetManagedPrefixListAssociationsRequest = GetManagedPrefixListAssociationsRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun prefixListId(prefixListId: String): FluentBuilder = apply { this.prefixListId = prefixListId }
    }
}
