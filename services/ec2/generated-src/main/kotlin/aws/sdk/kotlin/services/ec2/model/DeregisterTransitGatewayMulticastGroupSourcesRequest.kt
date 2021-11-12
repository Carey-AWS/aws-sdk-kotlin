// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeregisterTransitGatewayMulticastGroupSourcesRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The IP address assigned to the  transit gateway multicast group.
     */
    val groupIpAddress: String? = builder.groupIpAddress
    /**
     * The IDs of the group sources' network interfaces.
     */
    val networkInterfaceIds: List<String>? = builder.networkInterfaceIds
    /**
     * The ID of the transit gateway multicast domain.
     */
    val transitGatewayMulticastDomainId: String? = builder.transitGatewayMulticastDomainId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeregisterTransitGatewayMulticastGroupSourcesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeregisterTransitGatewayMulticastGroupSourcesRequest(")
        append("dryRun=$dryRun,")
        append("groupIpAddress=$groupIpAddress,")
        append("networkInterfaceIds=$networkInterfaceIds,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groupIpAddress?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceIds?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeregisterTransitGatewayMulticastGroupSourcesRequest

        if (dryRun != other.dryRun) return false
        if (groupIpAddress != other.groupIpAddress) return false
        if (networkInterfaceIds != other.networkInterfaceIds) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeregisterTransitGatewayMulticastGroupSourcesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeregisterTransitGatewayMulticastGroupSourcesRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The IP address assigned to the  transit gateway multicast group.
         */
        fun groupIpAddress(groupIpAddress: String): FluentBuilder
        /**
         * The IDs of the group sources' network interfaces.
         */
        fun networkInterfaceIds(networkInterfaceIds: List<String>): FluentBuilder
        /**
         * The ID of the transit gateway multicast domain.
         */
        fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The IP address assigned to the  transit gateway multicast group.
         */
        var groupIpAddress: String?
        /**
         * The IDs of the group sources' network interfaces.
         */
        var networkInterfaceIds: List<String>?
        /**
         * The ID of the transit gateway multicast domain.
         */
        var transitGatewayMulticastDomainId: String?

        fun build(): DeregisterTransitGatewayMulticastGroupSourcesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var groupIpAddress: String? = null
        override var networkInterfaceIds: List<String>? = null
        override var transitGatewayMulticastDomainId: String? = null

        constructor(x: DeregisterTransitGatewayMulticastGroupSourcesRequest) : this() {
            this.dryRun = x.dryRun
            this.groupIpAddress = x.groupIpAddress
            this.networkInterfaceIds = x.networkInterfaceIds
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        override fun build(): DeregisterTransitGatewayMulticastGroupSourcesRequest = DeregisterTransitGatewayMulticastGroupSourcesRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun groupIpAddress(groupIpAddress: String): FluentBuilder = apply { this.groupIpAddress = groupIpAddress }
        override fun networkInterfaceIds(networkInterfaceIds: List<String>): FluentBuilder = apply { this.networkInterfaceIds = networkInterfaceIds }
        override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder = apply { this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId }
    }
}
