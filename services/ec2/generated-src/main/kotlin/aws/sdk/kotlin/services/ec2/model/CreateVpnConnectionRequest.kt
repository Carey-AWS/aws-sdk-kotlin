// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for CreateVpnConnection.
 */
class CreateVpnConnectionRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the customer gateway.
     */
    val customerGatewayId: String? = builder.customerGatewayId
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The options for the VPN connection.
     */
    val options: VpnConnectionOptionsSpecification? = builder.options
    /**
     * The tags to apply to the VPN connection.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
     * gateway.
     */
    val transitGatewayId: String? = builder.transitGatewayId
    /**
     * The type of VPN connection (ipsec.1).
     */
    val type: String? = builder.type
    /**
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you
     * cannot specify a transit gateway.
     */
    val vpnGatewayId: String? = builder.vpnGatewayId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateVpnConnectionRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpnConnectionRequest(")
        append("customerGatewayId=$customerGatewayId,")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("tagSpecifications=$tagSpecifications,")
        append("transitGatewayId=$transitGatewayId,")
        append("type=$type,")
        append("vpnGatewayId=$vpnGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = customerGatewayId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (vpnGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateVpnConnectionRequest

        if (customerGatewayId != other.customerGatewayId) return false
        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (type != other.type) return false
        if (vpnGatewayId != other.vpnGatewayId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateVpnConnectionRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateVpnConnectionRequest
        /**
         * The ID of the customer gateway.
         */
        fun customerGatewayId(customerGatewayId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The options for the VPN connection.
         */
        fun options(options: VpnConnectionOptionsSpecification): FluentBuilder
        /**
         * The tags to apply to the VPN connection.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
        /**
         * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
         * gateway.
         */
        fun transitGatewayId(transitGatewayId: String): FluentBuilder
        /**
         * The type of VPN connection (ipsec.1).
         */
        fun type(type: String): FluentBuilder
        /**
         * The ID of the virtual private gateway. If you specify a virtual private gateway, you
         * cannot specify a transit gateway.
         */
        fun vpnGatewayId(vpnGatewayId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the customer gateway.
         */
        var customerGatewayId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The options for the VPN connection.
         */
        var options: VpnConnectionOptionsSpecification?
        /**
         * The tags to apply to the VPN connection.
         */
        var tagSpecifications: List<TagSpecification>?
        /**
         * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
         * gateway.
         */
        var transitGatewayId: String?
        /**
         * The type of VPN connection (ipsec.1).
         */
        var type: String?
        /**
         * The ID of the virtual private gateway. If you specify a virtual private gateway, you
         * cannot specify a transit gateway.
         */
        var vpnGatewayId: String?

        fun build(): CreateVpnConnectionRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification] inside the given [block]
         */
        fun options(block: VpnConnectionOptionsSpecification.DslBuilder.() -> kotlin.Unit) {
            this.options = VpnConnectionOptionsSpecification.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var customerGatewayId: String? = null
        override var dryRun: Boolean? = null
        override var options: VpnConnectionOptionsSpecification? = null
        override var tagSpecifications: List<TagSpecification>? = null
        override var transitGatewayId: String? = null
        override var type: String? = null
        override var vpnGatewayId: String? = null

        constructor(x: CreateVpnConnectionRequest) : this() {
            this.customerGatewayId = x.customerGatewayId
            this.dryRun = x.dryRun
            this.options = x.options
            this.tagSpecifications = x.tagSpecifications
            this.transitGatewayId = x.transitGatewayId
            this.type = x.type
            this.vpnGatewayId = x.vpnGatewayId
        }

        override fun build(): CreateVpnConnectionRequest = CreateVpnConnectionRequest(this)
        override fun customerGatewayId(customerGatewayId: String): FluentBuilder = apply { this.customerGatewayId = customerGatewayId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun options(options: VpnConnectionOptionsSpecification): FluentBuilder = apply { this.options = options }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
        override fun transitGatewayId(transitGatewayId: String): FluentBuilder = apply { this.transitGatewayId = transitGatewayId }
        override fun type(type: String): FluentBuilder = apply { this.type = type }
        override fun vpnGatewayId(vpnGatewayId: String): FluentBuilder = apply { this.vpnGatewayId = vpnGatewayId }
    }
}
