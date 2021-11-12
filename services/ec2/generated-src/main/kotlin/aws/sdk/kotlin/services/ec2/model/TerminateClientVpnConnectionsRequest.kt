// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class TerminateClientVpnConnectionsRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the Client VPN endpoint to which the client is connected.
     */
    val clientVpnEndpointId: String? = builder.clientVpnEndpointId
    /**
     * The ID of the client connection to be terminated.
     */
    val connectionId: String? = builder.connectionId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The name of the user who initiated the connection. Use this option to terminate all active connections for
     * the specified user. This option can only be used if the user has established up to five connections.
     */
    val username: String? = builder.username

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TerminateClientVpnConnectionsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TerminateClientVpnConnectionsRequest(")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("connectionId=$connectionId,")
        append("dryRun=$dryRun,")
        append("username=$username)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientVpnEndpointId?.hashCode() ?: 0
        result = 31 * result + (connectionId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (username?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TerminateClientVpnConnectionsRequest

        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (connectionId != other.connectionId) return false
        if (dryRun != other.dryRun) return false
        if (username != other.username) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TerminateClientVpnConnectionsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TerminateClientVpnConnectionsRequest
        /**
         * The ID of the Client VPN endpoint to which the client is connected.
         */
        fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder
        /**
         * The ID of the client connection to be terminated.
         */
        fun connectionId(connectionId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The name of the user who initiated the connection. Use this option to terminate all active connections for
         * the specified user. This option can only be used if the user has established up to five connections.
         */
        fun username(username: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the Client VPN endpoint to which the client is connected.
         */
        var clientVpnEndpointId: String?
        /**
         * The ID of the client connection to be terminated.
         */
        var connectionId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The name of the user who initiated the connection. Use this option to terminate all active connections for
         * the specified user. This option can only be used if the user has established up to five connections.
         */
        var username: String?

        fun build(): TerminateClientVpnConnectionsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientVpnEndpointId: String? = null
        override var connectionId: String? = null
        override var dryRun: Boolean? = null
        override var username: String? = null

        constructor(x: TerminateClientVpnConnectionsRequest) : this() {
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.connectionId = x.connectionId
            this.dryRun = x.dryRun
            this.username = x.username
        }

        override fun build(): TerminateClientVpnConnectionsRequest = TerminateClientVpnConnectionsRequest(this)
        override fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder = apply { this.clientVpnEndpointId = clientVpnEndpointId }
        override fun connectionId(connectionId: String): FluentBuilder = apply { this.connectionId = connectionId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun username(username: String): FluentBuilder = apply { this.username = username }
    }
}
