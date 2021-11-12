// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RejectVpcEndpointConnectionsResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the endpoints that were not rejected, if applicable.
     */
    val unsuccessful: List<UnsuccessfulItem>? = builder.unsuccessful

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RejectVpcEndpointConnectionsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RejectVpcEndpointConnectionsResponse(")
        append("unsuccessful=$unsuccessful)")
    }

    override fun hashCode(): kotlin.Int {
        var result = unsuccessful?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RejectVpcEndpointConnectionsResponse

        if (unsuccessful != other.unsuccessful) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RejectVpcEndpointConnectionsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RejectVpcEndpointConnectionsResponse
        /**
         * Information about the endpoints that were not rejected, if applicable.
         */
        fun unsuccessful(unsuccessful: List<UnsuccessfulItem>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the endpoints that were not rejected, if applicable.
         */
        var unsuccessful: List<UnsuccessfulItem>?

        fun build(): RejectVpcEndpointConnectionsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var unsuccessful: List<UnsuccessfulItem>? = null

        constructor(x: RejectVpcEndpointConnectionsResponse) : this() {
            this.unsuccessful = x.unsuccessful
        }

        override fun build(): RejectVpcEndpointConnectionsResponse = RejectVpcEndpointConnectionsResponse(this)
        override fun unsuccessful(unsuccessful: List<UnsuccessfulItem>): FluentBuilder = apply { this.unsuccessful = unsuccessful }
    }
}
