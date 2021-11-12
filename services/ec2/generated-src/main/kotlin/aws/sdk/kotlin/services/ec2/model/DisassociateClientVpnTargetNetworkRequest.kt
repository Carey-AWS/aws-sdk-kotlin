// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateClientVpnTargetNetworkRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the target network association.
     */
    val associationId: String? = builder.associationId
    /**
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     */
    val clientVpnEndpointId: String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisassociateClientVpnTargetNetworkRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateClientVpnTargetNetworkRequest(")
        append("associationId=$associationId,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisassociateClientVpnTargetNetworkRequest

        if (associationId != other.associationId) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisassociateClientVpnTargetNetworkRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisassociateClientVpnTargetNetworkRequest
        /**
         * The ID of the target network association.
         */
        fun associationId(associationId: String): FluentBuilder
        /**
         * The ID of the Client VPN endpoint from which to disassociate the target network.
         */
        fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the target network association.
         */
        var associationId: String?
        /**
         * The ID of the Client VPN endpoint from which to disassociate the target network.
         */
        var clientVpnEndpointId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?

        fun build(): DisassociateClientVpnTargetNetworkRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationId: String? = null
        override var clientVpnEndpointId: String? = null
        override var dryRun: Boolean? = null

        constructor(x: DisassociateClientVpnTargetNetworkRequest) : this() {
            this.associationId = x.associationId
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.dryRun = x.dryRun
        }

        override fun build(): DisassociateClientVpnTargetNetworkRequest = DisassociateClientVpnTargetNetworkRequest(this)
        override fun associationId(associationId: String): FluentBuilder = apply { this.associationId = associationId }
        override fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder = apply { this.clientVpnEndpointId = clientVpnEndpointId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
    }
}
