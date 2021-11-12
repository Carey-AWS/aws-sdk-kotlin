// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcEndpointServiceConfigurationResponse private constructor(builder: BuilderImpl) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     */
    val clientToken: String? = builder.clientToken
    /**
     * Information about the service configuration.
     */
    val serviceConfiguration: ServiceConfiguration? = builder.serviceConfiguration

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateVpcEndpointServiceConfigurationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcEndpointServiceConfigurationResponse(")
        append("clientToken=$clientToken,")
        append("serviceConfiguration=$serviceConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (serviceConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateVpcEndpointServiceConfigurationResponse

        if (clientToken != other.clientToken) return false
        if (serviceConfiguration != other.serviceConfiguration) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateVpcEndpointServiceConfigurationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateVpcEndpointServiceConfigurationResponse
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * Information about the service configuration.
         */
        fun serviceConfiguration(serviceConfiguration: ServiceConfiguration): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request.
         */
        var clientToken: String?
        /**
         * Information about the service configuration.
         */
        var serviceConfiguration: ServiceConfiguration?

        fun build(): CreateVpcEndpointServiceConfigurationResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ServiceConfiguration] inside the given [block]
         */
        fun serviceConfiguration(block: ServiceConfiguration.DslBuilder.() -> kotlin.Unit) {
            this.serviceConfiguration = ServiceConfiguration.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientToken: String? = null
        override var serviceConfiguration: ServiceConfiguration? = null

        constructor(x: CreateVpcEndpointServiceConfigurationResponse) : this() {
            this.clientToken = x.clientToken
            this.serviceConfiguration = x.serviceConfiguration
        }

        override fun build(): CreateVpcEndpointServiceConfigurationResponse = CreateVpcEndpointServiceConfigurationResponse(this)
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun serviceConfiguration(serviceConfiguration: ServiceConfiguration): FluentBuilder = apply { this.serviceConfiguration = serviceConfiguration }
    }
}
