// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTransitGatewayConnectPeerResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the Connect peer.
     */
    val transitGatewayConnectPeer: TransitGatewayConnectPeer? = builder.transitGatewayConnectPeer

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateTransitGatewayConnectPeerResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTransitGatewayConnectPeerResponse(")
        append("transitGatewayConnectPeer=$transitGatewayConnectPeer)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayConnectPeer?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateTransitGatewayConnectPeerResponse

        if (transitGatewayConnectPeer != other.transitGatewayConnectPeer) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateTransitGatewayConnectPeerResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateTransitGatewayConnectPeerResponse
        /**
         * Information about the Connect peer.
         */
        fun transitGatewayConnectPeer(transitGatewayConnectPeer: TransitGatewayConnectPeer): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the Connect peer.
         */
        var transitGatewayConnectPeer: TransitGatewayConnectPeer?

        fun build(): CreateTransitGatewayConnectPeerResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectPeer] inside the given [block]
         */
        fun transitGatewayConnectPeer(block: TransitGatewayConnectPeer.DslBuilder.() -> kotlin.Unit) {
            this.transitGatewayConnectPeer = TransitGatewayConnectPeer.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var transitGatewayConnectPeer: TransitGatewayConnectPeer? = null

        constructor(x: CreateTransitGatewayConnectPeerResponse) : this() {
            this.transitGatewayConnectPeer = x.transitGatewayConnectPeer
        }

        override fun build(): CreateTransitGatewayConnectPeerResponse = CreateTransitGatewayConnectPeerResponse(this)
        override fun transitGatewayConnectPeer(transitGatewayConnectPeer: TransitGatewayConnectPeer): FluentBuilder = apply { this.transitGatewayConnectPeer = transitGatewayConnectPeer }
    }
}
