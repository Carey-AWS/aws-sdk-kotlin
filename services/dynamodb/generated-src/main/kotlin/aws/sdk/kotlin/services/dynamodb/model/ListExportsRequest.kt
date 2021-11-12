// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class ListExportsRequest private constructor(builder: BuilderImpl) {
    /**
     * Maximum number of results to return per page.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * An optional string that, if supplied, must be copied from the output of a previous
     * call to ListExports. When provided in this manner, the API fetches the next
     * page of results.
     */
    val nextToken: String? = builder.nextToken
    /**
     * The Amazon Resource Name (ARN) associated with the exported table.
     */
    val tableArn: String? = builder.tableArn

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ListExportsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ListExportsRequest(")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("tableArn=$tableArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = maxResults ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (tableArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListExportsRequest

        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (tableArn != other.tableArn) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ListExportsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ListExportsRequest
        /**
         * Maximum number of results to return per page.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * An optional string that, if supplied, must be copied from the output of a previous
         * call to ListExports. When provided in this manner, the API fetches the next
         * page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * The Amazon Resource Name (ARN) associated with the exported table.
         */
        fun tableArn(tableArn: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Maximum number of results to return per page.
         */
        var maxResults: Int?
        /**
         * An optional string that, if supplied, must be copied from the output of a previous
         * call to ListExports. When provided in this manner, the API fetches the next
         * page of results.
         */
        var nextToken: String?
        /**
         * The Amazon Resource Name (ARN) associated with the exported table.
         */
        var tableArn: String?

        fun build(): ListExportsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var tableArn: String? = null

        constructor(x: ListExportsRequest) : this() {
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.tableArn = x.tableArn
        }

        override fun build(): ListExportsRequest = ListExportsRequest(this)
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun tableArn(tableArn: String): FluentBuilder = apply { this.tableArn = tableArn }
    }
}
