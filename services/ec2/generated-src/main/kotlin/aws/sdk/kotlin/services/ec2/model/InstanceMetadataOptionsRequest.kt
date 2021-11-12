// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The metadata options for the instance.
 */
class InstanceMetadataOptionsRequest private constructor(builder: BuilderImpl) {
    /**
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is enabled.
     * If you specify a value of disabled, you will not be able to access your
     * instance metadata.
     */
    val httpEndpoint: InstanceMetadataEndpointState? = builder.httpEndpoint
    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     */
    val httpProtocolIpv6: InstanceMetadataProtocolState? = builder.httpProtocolIpv6
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
     * number, the further instance metadata requests can travel.
     * Default: 1
     * Possible values: Integers from 1 to 64
     */
    val httpPutResponseHopLimit: Int? = builder.httpPutResponseHopLimit
    /**
     * The state of token usage for your instance metadata requests. If the parameter is not
     * specified in the request, the default state is optional.
     * If the state is optional, you can choose to retrieve instance metadata
     * with or without a signed token header on your request. If you retrieve the IAM role
     * credentials without a token, the version 1.0 role credentials are returned. If you
     * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
     * credentials are returned.
     * If the state is required, you must send a signed token header with any
     * instance metadata retrieval requests. In this state, retrieving the IAM role credentials
     * always returns the version 2.0 credentials; the version 1.0 credentials are not
     * available.
     */
    val httpTokens: HttpTokensState? = builder.httpTokens

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): InstanceMetadataOptionsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceMetadataOptionsRequest(")
        append("httpEndpoint=$httpEndpoint,")
        append("httpProtocolIpv6=$httpProtocolIpv6,")
        append("httpPutResponseHopLimit=$httpPutResponseHopLimit,")
        append("httpTokens=$httpTokens)")
    }

    override fun hashCode(): kotlin.Int {
        var result = httpEndpoint?.hashCode() ?: 0
        result = 31 * result + (httpProtocolIpv6?.hashCode() ?: 0)
        result = 31 * result + (httpPutResponseHopLimit ?: 0)
        result = 31 * result + (httpTokens?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InstanceMetadataOptionsRequest

        if (httpEndpoint != other.httpEndpoint) return false
        if (httpProtocolIpv6 != other.httpProtocolIpv6) return false
        if (httpPutResponseHopLimit != other.httpPutResponseHopLimit) return false
        if (httpTokens != other.httpTokens) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): InstanceMetadataOptionsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): InstanceMetadataOptionsRequest
        /**
         * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
         * specified, the default state is enabled.
         * If you specify a value of disabled, you will not be able to access your
         * instance metadata.
         */
        fun httpEndpoint(httpEndpoint: InstanceMetadataEndpointState): FluentBuilder
        /**
         * Enables or disables the IPv6 endpoint for the instance metadata service.
         */
        fun httpProtocolIpv6(httpProtocolIpv6: InstanceMetadataProtocolState): FluentBuilder
        /**
         * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
         * number, the further instance metadata requests can travel.
         * Default: 1
         * Possible values: Integers from 1 to 64
         */
        fun httpPutResponseHopLimit(httpPutResponseHopLimit: Int): FluentBuilder
        /**
         * The state of token usage for your instance metadata requests. If the parameter is not
         * specified in the request, the default state is optional.
         * If the state is optional, you can choose to retrieve instance metadata
         * with or without a signed token header on your request. If you retrieve the IAM role
         * credentials without a token, the version 1.0 role credentials are returned. If you
         * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
         * credentials are returned.
         * If the state is required, you must send a signed token header with any
         * instance metadata retrieval requests. In this state, retrieving the IAM role credentials
         * always returns the version 2.0 credentials; the version 1.0 credentials are not
         * available.
         */
        fun httpTokens(httpTokens: HttpTokensState): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
         * specified, the default state is enabled.
         * If you specify a value of disabled, you will not be able to access your
         * instance metadata.
         */
        var httpEndpoint: InstanceMetadataEndpointState?
        /**
         * Enables or disables the IPv6 endpoint for the instance metadata service.
         */
        var httpProtocolIpv6: InstanceMetadataProtocolState?
        /**
         * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
         * number, the further instance metadata requests can travel.
         * Default: 1
         * Possible values: Integers from 1 to 64
         */
        var httpPutResponseHopLimit: Int?
        /**
         * The state of token usage for your instance metadata requests. If the parameter is not
         * specified in the request, the default state is optional.
         * If the state is optional, you can choose to retrieve instance metadata
         * with or without a signed token header on your request. If you retrieve the IAM role
         * credentials without a token, the version 1.0 role credentials are returned. If you
         * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
         * credentials are returned.
         * If the state is required, you must send a signed token header with any
         * instance metadata retrieval requests. In this state, retrieving the IAM role credentials
         * always returns the version 2.0 credentials; the version 1.0 credentials are not
         * available.
         */
        var httpTokens: HttpTokensState?

        fun build(): InstanceMetadataOptionsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var httpEndpoint: InstanceMetadataEndpointState? = null
        override var httpProtocolIpv6: InstanceMetadataProtocolState? = null
        override var httpPutResponseHopLimit: Int? = null
        override var httpTokens: HttpTokensState? = null

        constructor(x: InstanceMetadataOptionsRequest) : this() {
            this.httpEndpoint = x.httpEndpoint
            this.httpProtocolIpv6 = x.httpProtocolIpv6
            this.httpPutResponseHopLimit = x.httpPutResponseHopLimit
            this.httpTokens = x.httpTokens
        }

        override fun build(): InstanceMetadataOptionsRequest = InstanceMetadataOptionsRequest(this)
        override fun httpEndpoint(httpEndpoint: InstanceMetadataEndpointState): FluentBuilder = apply { this.httpEndpoint = httpEndpoint }
        override fun httpProtocolIpv6(httpProtocolIpv6: InstanceMetadataProtocolState): FluentBuilder = apply { this.httpProtocolIpv6 = httpProtocolIpv6 }
        override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Int): FluentBuilder = apply { this.httpPutResponseHopLimit = httpPutResponseHopLimit }
        override fun httpTokens(httpTokens: HttpTokensState): FluentBuilder = apply { this.httpTokens = httpTokens }
    }
}
