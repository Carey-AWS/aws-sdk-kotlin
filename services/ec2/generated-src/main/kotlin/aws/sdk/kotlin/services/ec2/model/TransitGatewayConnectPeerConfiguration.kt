// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Connect peer details.
 */
class TransitGatewayConnectPeerConfiguration private constructor(builder: BuilderImpl) {
    /**
     * The BGP configuration details.
     */
    val bgpConfigurations: List<TransitGatewayAttachmentBgpConfiguration>? = builder.bgpConfigurations
    /**
     * The range of interior BGP peer IP addresses.
     */
    val insideCidrBlocks: List<String>? = builder.insideCidrBlocks
    /**
     * The Connect peer IP address on the appliance side of the tunnel.
     */
    val peerAddress: String? = builder.peerAddress
    /**
     * The tunnel protocol.
     */
    val protocol: ProtocolValue? = builder.protocol
    /**
     * The Connect peer IP address on the transit gateway side of the tunnel.
     */
    val transitGatewayAddress: String? = builder.transitGatewayAddress

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TransitGatewayConnectPeerConfiguration = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayConnectPeerConfiguration(")
        append("bgpConfigurations=$bgpConfigurations,")
        append("insideCidrBlocks=$insideCidrBlocks,")
        append("peerAddress=$peerAddress,")
        append("protocol=$protocol,")
        append("transitGatewayAddress=$transitGatewayAddress)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bgpConfigurations?.hashCode() ?: 0
        result = 31 * result + (insideCidrBlocks?.hashCode() ?: 0)
        result = 31 * result + (peerAddress?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAddress?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TransitGatewayConnectPeerConfiguration

        if (bgpConfigurations != other.bgpConfigurations) return false
        if (insideCidrBlocks != other.insideCidrBlocks) return false
        if (peerAddress != other.peerAddress) return false
        if (protocol != other.protocol) return false
        if (transitGatewayAddress != other.transitGatewayAddress) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TransitGatewayConnectPeerConfiguration = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TransitGatewayConnectPeerConfiguration
        /**
         * The BGP configuration details.
         */
        fun bgpConfigurations(bgpConfigurations: List<TransitGatewayAttachmentBgpConfiguration>): FluentBuilder
        /**
         * The range of interior BGP peer IP addresses.
         */
        fun insideCidrBlocks(insideCidrBlocks: List<String>): FluentBuilder
        /**
         * The Connect peer IP address on the appliance side of the tunnel.
         */
        fun peerAddress(peerAddress: String): FluentBuilder
        /**
         * The tunnel protocol.
         */
        fun protocol(protocol: ProtocolValue): FluentBuilder
        /**
         * The Connect peer IP address on the transit gateway side of the tunnel.
         */
        fun transitGatewayAddress(transitGatewayAddress: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The BGP configuration details.
         */
        var bgpConfigurations: List<TransitGatewayAttachmentBgpConfiguration>?
        /**
         * The range of interior BGP peer IP addresses.
         */
        var insideCidrBlocks: List<String>?
        /**
         * The Connect peer IP address on the appliance side of the tunnel.
         */
        var peerAddress: String?
        /**
         * The tunnel protocol.
         */
        var protocol: ProtocolValue?
        /**
         * The Connect peer IP address on the transit gateway side of the tunnel.
         */
        var transitGatewayAddress: String?

        fun build(): TransitGatewayConnectPeerConfiguration
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bgpConfigurations: List<TransitGatewayAttachmentBgpConfiguration>? = null
        override var insideCidrBlocks: List<String>? = null
        override var peerAddress: String? = null
        override var protocol: ProtocolValue? = null
        override var transitGatewayAddress: String? = null

        constructor(x: TransitGatewayConnectPeerConfiguration) : this() {
            this.bgpConfigurations = x.bgpConfigurations
            this.insideCidrBlocks = x.insideCidrBlocks
            this.peerAddress = x.peerAddress
            this.protocol = x.protocol
            this.transitGatewayAddress = x.transitGatewayAddress
        }

        override fun build(): TransitGatewayConnectPeerConfiguration = TransitGatewayConnectPeerConfiguration(this)
        override fun bgpConfigurations(bgpConfigurations: List<TransitGatewayAttachmentBgpConfiguration>): FluentBuilder = apply { this.bgpConfigurations = bgpConfigurations }
        override fun insideCidrBlocks(insideCidrBlocks: List<String>): FluentBuilder = apply { this.insideCidrBlocks = insideCidrBlocks }
        override fun peerAddress(peerAddress: String): FluentBuilder = apply { this.peerAddress = peerAddress }
        override fun protocol(protocol: ProtocolValue): FluentBuilder = apply { this.protocol = protocol }
        override fun transitGatewayAddress(transitGatewayAddress: String): FluentBuilder = apply { this.transitGatewayAddress = transitGatewayAddress }
    }
}
