// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes association information for an Elastic IP address (IPv4).
 */
class InstanceNetworkInterfaceAssociation private constructor(builder: BuilderImpl) {
    /**
     * The carrier IP address associated with the network interface.
     */
    val carrierIp: String? = builder.carrierIp
    /**
     * The ID of the owner of the Elastic IP address.
     */
    val ipOwnerId: String? = builder.ipOwnerId
    /**
     * The public DNS name.
     */
    val publicDnsName: String? = builder.publicDnsName
    /**
     * The public IP address or Elastic IP address bound to the network interface.
     */
    val publicIp: String? = builder.publicIp

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): InstanceNetworkInterfaceAssociation = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceNetworkInterfaceAssociation(")
        append("carrierIp=$carrierIp,")
        append("ipOwnerId=$ipOwnerId,")
        append("publicDnsName=$publicDnsName,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = carrierIp?.hashCode() ?: 0
        result = 31 * result + (ipOwnerId?.hashCode() ?: 0)
        result = 31 * result + (publicDnsName?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InstanceNetworkInterfaceAssociation

        if (carrierIp != other.carrierIp) return false
        if (ipOwnerId != other.ipOwnerId) return false
        if (publicDnsName != other.publicDnsName) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): InstanceNetworkInterfaceAssociation = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): InstanceNetworkInterfaceAssociation
        /**
         * The carrier IP address associated with the network interface.
         */
        fun carrierIp(carrierIp: String): FluentBuilder
        /**
         * The ID of the owner of the Elastic IP address.
         */
        fun ipOwnerId(ipOwnerId: String): FluentBuilder
        /**
         * The public DNS name.
         */
        fun publicDnsName(publicDnsName: String): FluentBuilder
        /**
         * The public IP address or Elastic IP address bound to the network interface.
         */
        fun publicIp(publicIp: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The carrier IP address associated with the network interface.
         */
        var carrierIp: String?
        /**
         * The ID of the owner of the Elastic IP address.
         */
        var ipOwnerId: String?
        /**
         * The public DNS name.
         */
        var publicDnsName: String?
        /**
         * The public IP address or Elastic IP address bound to the network interface.
         */
        var publicIp: String?

        fun build(): InstanceNetworkInterfaceAssociation
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var carrierIp: String? = null
        override var ipOwnerId: String? = null
        override var publicDnsName: String? = null
        override var publicIp: String? = null

        constructor(x: InstanceNetworkInterfaceAssociation) : this() {
            this.carrierIp = x.carrierIp
            this.ipOwnerId = x.ipOwnerId
            this.publicDnsName = x.publicDnsName
            this.publicIp = x.publicIp
        }

        override fun build(): InstanceNetworkInterfaceAssociation = InstanceNetworkInterfaceAssociation(this)
        override fun carrierIp(carrierIp: String): FluentBuilder = apply { this.carrierIp = carrierIp }
        override fun ipOwnerId(ipOwnerId: String): FluentBuilder = apply { this.ipOwnerId = ipOwnerId }
        override fun publicDnsName(publicDnsName: String): FluentBuilder = apply { this.publicDnsName = publicDnsName }
        override fun publicIp(publicIp: String): FluentBuilder = apply { this.publicIp = publicIp }
    }
}
