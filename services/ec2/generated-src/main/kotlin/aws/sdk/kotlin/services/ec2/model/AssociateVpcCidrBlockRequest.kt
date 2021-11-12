// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateVpcCidrBlockRequest private constructor(builder: BuilderImpl) {
    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
     */
    val amazonProvidedIpv6CidrBlock: Boolean? = builder.amazonProvidedIpv6CidrBlock
    /**
     * An IPv4 CIDR block to associate with the VPC.
     */
    val cidrBlock: String? = builder.cidrBlock
    /**
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */
    val ipv6CidrBlock: String? = builder.ipv6CidrBlock
    /**
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter
     * to limit the CIDR block to this location.
     * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
     * You can have one IPv6 CIDR block association per network border group.
     */
    val ipv6CidrBlockNetworkBorderGroup: String? = builder.ipv6CidrBlockNetworkBorderGroup
    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */
    val ipv6Pool: String? = builder.ipv6Pool
    /**
     * The ID of the VPC.
     */
    val vpcId: String? = builder.vpcId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AssociateVpcCidrBlockRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateVpcCidrBlockRequest(")
        append("amazonProvidedIpv6CidrBlock=$amazonProvidedIpv6CidrBlock,")
        append("cidrBlock=$cidrBlock,")
        append("ipv6CidrBlock=$ipv6CidrBlock,")
        append("ipv6CidrBlockNetworkBorderGroup=$ipv6CidrBlockNetworkBorderGroup,")
        append("ipv6Pool=$ipv6Pool,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amazonProvidedIpv6CidrBlock?.hashCode() ?: 0
        result = 31 * result + (cidrBlock?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlock?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlockNetworkBorderGroup?.hashCode() ?: 0)
        result = 31 * result + (ipv6Pool?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AssociateVpcCidrBlockRequest

        if (amazonProvidedIpv6CidrBlock != other.amazonProvidedIpv6CidrBlock) return false
        if (cidrBlock != other.cidrBlock) return false
        if (ipv6CidrBlock != other.ipv6CidrBlock) return false
        if (ipv6CidrBlockNetworkBorderGroup != other.ipv6CidrBlockNetworkBorderGroup) return false
        if (ipv6Pool != other.ipv6Pool) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AssociateVpcCidrBlockRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AssociateVpcCidrBlockRequest
        /**
         * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
         */
        fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean): FluentBuilder
        /**
         * An IPv4 CIDR block to associate with the VPC.
         */
        fun cidrBlock(cidrBlock: String): FluentBuilder
        /**
         * An IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
         * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
         */
        fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder
        /**
         * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter
         * to limit the CIDR block to this location.
         * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
         * You can have one IPv6 CIDR block association per network border group.
         */
        fun ipv6CidrBlockNetworkBorderGroup(ipv6CidrBlockNetworkBorderGroup: String): FluentBuilder
        /**
         * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
         */
        fun ipv6Pool(ipv6Pool: String): FluentBuilder
        /**
         * The ID of the VPC.
         */
        fun vpcId(vpcId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
         */
        var amazonProvidedIpv6CidrBlock: Boolean?
        /**
         * An IPv4 CIDR block to associate with the VPC.
         */
        var cidrBlock: String?
        /**
         * An IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
         * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
         */
        var ipv6CidrBlock: String?
        /**
         * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter
         * to limit the CIDR block to this location.
         * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
         * You can have one IPv6 CIDR block association per network border group.
         */
        var ipv6CidrBlockNetworkBorderGroup: String?
        /**
         * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
         */
        var ipv6Pool: String?
        /**
         * The ID of the VPC.
         */
        var vpcId: String?

        fun build(): AssociateVpcCidrBlockRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var amazonProvidedIpv6CidrBlock: Boolean? = null
        override var cidrBlock: String? = null
        override var ipv6CidrBlock: String? = null
        override var ipv6CidrBlockNetworkBorderGroup: String? = null
        override var ipv6Pool: String? = null
        override var vpcId: String? = null

        constructor(x: AssociateVpcCidrBlockRequest) : this() {
            this.amazonProvidedIpv6CidrBlock = x.amazonProvidedIpv6CidrBlock
            this.cidrBlock = x.cidrBlock
            this.ipv6CidrBlock = x.ipv6CidrBlock
            this.ipv6CidrBlockNetworkBorderGroup = x.ipv6CidrBlockNetworkBorderGroup
            this.ipv6Pool = x.ipv6Pool
            this.vpcId = x.vpcId
        }

        override fun build(): AssociateVpcCidrBlockRequest = AssociateVpcCidrBlockRequest(this)
        override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean): FluentBuilder = apply { this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock }
        override fun cidrBlock(cidrBlock: String): FluentBuilder = apply { this.cidrBlock = cidrBlock }
        override fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder = apply { this.ipv6CidrBlock = ipv6CidrBlock }
        override fun ipv6CidrBlockNetworkBorderGroup(ipv6CidrBlockNetworkBorderGroup: String): FluentBuilder = apply { this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup }
        override fun ipv6Pool(ipv6Pool: String): FluentBuilder = apply { this.ipv6Pool = ipv6Pool }
        override fun vpcId(vpcId: String): FluentBuilder = apply { this.vpcId = vpcId }
    }
}
