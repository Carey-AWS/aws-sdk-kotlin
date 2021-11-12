// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IPv6 CIDR block associated with a VPC.
 */
class VpcIpv6CidrBlockAssociation private constructor(builder: BuilderImpl) {
    /**
     * The association ID for the IPv6 CIDR block.
     */
    val associationId: String? = builder.associationId
    /**
     * The IPv6 CIDR block.
     */
    val ipv6CidrBlock: String? = builder.ipv6CidrBlock
    /**
     * Information about the state of the CIDR block.
     */
    val ipv6CidrBlockState: VpcCidrBlockState? = builder.ipv6CidrBlockState
    /**
     * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     */
    val ipv6Pool: String? = builder.ipv6Pool
    /**
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from
     * which Amazon Web Services advertises IP addresses, for example, us-east-1-wl1-bos-wlz-1.
     */
    val networkBorderGroup: String? = builder.networkBorderGroup

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): VpcIpv6CidrBlockAssociation = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("VpcIpv6CidrBlockAssociation(")
        append("associationId=$associationId,")
        append("ipv6CidrBlock=$ipv6CidrBlock,")
        append("ipv6CidrBlockState=$ipv6CidrBlockState,")
        append("ipv6Pool=$ipv6Pool,")
        append("networkBorderGroup=$networkBorderGroup)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (ipv6CidrBlock?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlockState?.hashCode() ?: 0)
        result = 31 * result + (ipv6Pool?.hashCode() ?: 0)
        result = 31 * result + (networkBorderGroup?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as VpcIpv6CidrBlockAssociation

        if (associationId != other.associationId) return false
        if (ipv6CidrBlock != other.ipv6CidrBlock) return false
        if (ipv6CidrBlockState != other.ipv6CidrBlockState) return false
        if (ipv6Pool != other.ipv6Pool) return false
        if (networkBorderGroup != other.networkBorderGroup) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): VpcIpv6CidrBlockAssociation = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): VpcIpv6CidrBlockAssociation
        /**
         * The association ID for the IPv6 CIDR block.
         */
        fun associationId(associationId: String): FluentBuilder
        /**
         * The IPv6 CIDR block.
         */
        fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder
        /**
         * Information about the state of the CIDR block.
         */
        fun ipv6CidrBlockState(ipv6CidrBlockState: VpcCidrBlockState): FluentBuilder
        /**
         * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
         */
        fun ipv6Pool(ipv6Pool: String): FluentBuilder
        /**
         * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from
         * which Amazon Web Services advertises IP addresses, for example, us-east-1-wl1-bos-wlz-1.
         */
        fun networkBorderGroup(networkBorderGroup: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The association ID for the IPv6 CIDR block.
         */
        var associationId: String?
        /**
         * The IPv6 CIDR block.
         */
        var ipv6CidrBlock: String?
        /**
         * Information about the state of the CIDR block.
         */
        var ipv6CidrBlockState: VpcCidrBlockState?
        /**
         * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
         */
        var ipv6Pool: String?
        /**
         * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from
         * which Amazon Web Services advertises IP addresses, for example, us-east-1-wl1-bos-wlz-1.
         */
        var networkBorderGroup: String?

        fun build(): VpcIpv6CidrBlockAssociation
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpcCidrBlockState] inside the given [block]
         */
        fun ipv6CidrBlockState(block: VpcCidrBlockState.DslBuilder.() -> kotlin.Unit) {
            this.ipv6CidrBlockState = VpcCidrBlockState.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationId: String? = null
        override var ipv6CidrBlock: String? = null
        override var ipv6CidrBlockState: VpcCidrBlockState? = null
        override var ipv6Pool: String? = null
        override var networkBorderGroup: String? = null

        constructor(x: VpcIpv6CidrBlockAssociation) : this() {
            this.associationId = x.associationId
            this.ipv6CidrBlock = x.ipv6CidrBlock
            this.ipv6CidrBlockState = x.ipv6CidrBlockState
            this.ipv6Pool = x.ipv6Pool
            this.networkBorderGroup = x.networkBorderGroup
        }

        override fun build(): VpcIpv6CidrBlockAssociation = VpcIpv6CidrBlockAssociation(this)
        override fun associationId(associationId: String): FluentBuilder = apply { this.associationId = associationId }
        override fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder = apply { this.ipv6CidrBlock = ipv6CidrBlock }
        override fun ipv6CidrBlockState(ipv6CidrBlockState: VpcCidrBlockState): FluentBuilder = apply { this.ipv6CidrBlockState = ipv6CidrBlockState }
        override fun ipv6Pool(ipv6Pool: String): FluentBuilder = apply { this.ipv6Pool = ipv6Pool }
        override fun networkBorderGroup(networkBorderGroup: String): FluentBuilder = apply { this.networkBorderGroup = networkBorderGroup }
    }
}
