// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the registered  transit gateway multicast group members.
 */
class TransitGatewayMulticastRegisteredGroupMembers private constructor(builder: BuilderImpl) {
    /**
     * The IP address assigned to the  transit gateway multicast group.
     */
    val groupIpAddress: String? = builder.groupIpAddress
    /**
     * The ID of the registered network interfaces.
     */
    val registeredNetworkInterfaceIds: List<String>? = builder.registeredNetworkInterfaceIds
    /**
     * The ID of the transit gateway multicast domain.
     */
    val transitGatewayMulticastDomainId: String? = builder.transitGatewayMulticastDomainId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TransitGatewayMulticastRegisteredGroupMembers = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayMulticastRegisteredGroupMembers(")
        append("groupIpAddress=$groupIpAddress,")
        append("registeredNetworkInterfaceIds=$registeredNetworkInterfaceIds,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groupIpAddress?.hashCode() ?: 0
        result = 31 * result + (registeredNetworkInterfaceIds?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TransitGatewayMulticastRegisteredGroupMembers

        if (groupIpAddress != other.groupIpAddress) return false
        if (registeredNetworkInterfaceIds != other.registeredNetworkInterfaceIds) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TransitGatewayMulticastRegisteredGroupMembers = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TransitGatewayMulticastRegisteredGroupMembers
        /**
         * The IP address assigned to the  transit gateway multicast group.
         */
        fun groupIpAddress(groupIpAddress: String): FluentBuilder
        /**
         * The ID of the registered network interfaces.
         */
        fun registeredNetworkInterfaceIds(registeredNetworkInterfaceIds: List<String>): FluentBuilder
        /**
         * The ID of the transit gateway multicast domain.
         */
        fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The IP address assigned to the  transit gateway multicast group.
         */
        var groupIpAddress: String?
        /**
         * The ID of the registered network interfaces.
         */
        var registeredNetworkInterfaceIds: List<String>?
        /**
         * The ID of the transit gateway multicast domain.
         */
        var transitGatewayMulticastDomainId: String?

        fun build(): TransitGatewayMulticastRegisteredGroupMembers
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var groupIpAddress: String? = null
        override var registeredNetworkInterfaceIds: List<String>? = null
        override var transitGatewayMulticastDomainId: String? = null

        constructor(x: TransitGatewayMulticastRegisteredGroupMembers) : this() {
            this.groupIpAddress = x.groupIpAddress
            this.registeredNetworkInterfaceIds = x.registeredNetworkInterfaceIds
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        override fun build(): TransitGatewayMulticastRegisteredGroupMembers = TransitGatewayMulticastRegisteredGroupMembers(this)
        override fun groupIpAddress(groupIpAddress: String): FluentBuilder = apply { this.groupIpAddress = groupIpAddress }
        override fun registeredNetworkInterfaceIds(registeredNetworkInterfaceIds: List<String>): FluentBuilder = apply { this.registeredNetworkInterfaceIds = registeredNetworkInterfaceIds }
        override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder = apply { this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId }
    }
}
