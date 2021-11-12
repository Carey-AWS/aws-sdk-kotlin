// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a security group rule.
 * You must specify exactly one of the following parameters, based on the rule type:
 * CidrIpv4
 * CidrIpv6
 * PrefixListId
 * ReferencedGroupId
 * When you modify a rule, you cannot change the rule type. For example, if the rule
 * uses an IPv4 address range, you must use CidrIpv4 to specify a new IPv4
 * address range.
 */
class SecurityGroupRuleRequest private constructor(builder: BuilderImpl) {
    /**
     * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     */
    val cidrIpv4: String? = builder.cidrIpv4
    /**
     * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     */
    val cidrIpv6: String? = builder.cidrIpv6
    /**
     * The description of the security group rule.
     */
    val description: String? = builder.description
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */
    val fromPort: Int? = builder.fromPort
    /**
     * The IP protocol name (tcp, udp, icmp,
     * icmpv6) or number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers).
     * Use -1 to specify all protocols.
     */
    val ipProtocol: String? = builder.ipProtocol
    /**
     * The ID of the prefix list.
     */
    val prefixListId: String? = builder.prefixListId
    /**
     * The ID of the security group that is referenced in the security group rule.
     */
    val referencedGroupId: String? = builder.referencedGroupId
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */
    val toPort: Int? = builder.toPort

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SecurityGroupRuleRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SecurityGroupRuleRequest(")
        append("cidrIpv4=$cidrIpv4,")
        append("cidrIpv6=$cidrIpv6,")
        append("description=$description,")
        append("fromPort=$fromPort,")
        append("ipProtocol=$ipProtocol,")
        append("prefixListId=$prefixListId,")
        append("referencedGroupId=$referencedGroupId,")
        append("toPort=$toPort)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrIpv4?.hashCode() ?: 0
        result = 31 * result + (cidrIpv6?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (fromPort ?: 0)
        result = 31 * result + (ipProtocol?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (referencedGroupId?.hashCode() ?: 0)
        result = 31 * result + (toPort ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SecurityGroupRuleRequest

        if (cidrIpv4 != other.cidrIpv4) return false
        if (cidrIpv6 != other.cidrIpv6) return false
        if (description != other.description) return false
        if (fromPort != other.fromPort) return false
        if (ipProtocol != other.ipProtocol) return false
        if (prefixListId != other.prefixListId) return false
        if (referencedGroupId != other.referencedGroupId) return false
        if (toPort != other.toPort) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): SecurityGroupRuleRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): SecurityGroupRuleRequest
        /**
         * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
         */
        fun cidrIpv4(cidrIpv4: String): FluentBuilder
        /**
         * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
         */
        fun cidrIpv6(cidrIpv6: String): FluentBuilder
        /**
         * The description of the security group rule.
         */
        fun description(description: String): FluentBuilder
        /**
         * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
         */
        fun fromPort(fromPort: Int): FluentBuilder
        /**
         * The IP protocol name (tcp, udp, icmp,
         * icmpv6) or number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers).
         * Use -1 to specify all protocols.
         */
        fun ipProtocol(ipProtocol: String): FluentBuilder
        /**
         * The ID of the prefix list.
         */
        fun prefixListId(prefixListId: String): FluentBuilder
        /**
         * The ID of the security group that is referenced in the security group rule.
         */
        fun referencedGroupId(referencedGroupId: String): FluentBuilder
        /**
         * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
         */
        fun toPort(toPort: Int): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
         */
        var cidrIpv4: String?
        /**
         * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
         */
        var cidrIpv6: String?
        /**
         * The description of the security group rule.
         */
        var description: String?
        /**
         * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
         */
        var fromPort: Int?
        /**
         * The IP protocol name (tcp, udp, icmp,
         * icmpv6) or number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers).
         * Use -1 to specify all protocols.
         */
        var ipProtocol: String?
        /**
         * The ID of the prefix list.
         */
        var prefixListId: String?
        /**
         * The ID of the security group that is referenced in the security group rule.
         */
        var referencedGroupId: String?
        /**
         * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
         */
        var toPort: Int?

        fun build(): SecurityGroupRuleRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var cidrIpv4: String? = null
        override var cidrIpv6: String? = null
        override var description: String? = null
        override var fromPort: Int? = null
        override var ipProtocol: String? = null
        override var prefixListId: String? = null
        override var referencedGroupId: String? = null
        override var toPort: Int? = null

        constructor(x: SecurityGroupRuleRequest) : this() {
            this.cidrIpv4 = x.cidrIpv4
            this.cidrIpv6 = x.cidrIpv6
            this.description = x.description
            this.fromPort = x.fromPort
            this.ipProtocol = x.ipProtocol
            this.prefixListId = x.prefixListId
            this.referencedGroupId = x.referencedGroupId
            this.toPort = x.toPort
        }

        override fun build(): SecurityGroupRuleRequest = SecurityGroupRuleRequest(this)
        override fun cidrIpv4(cidrIpv4: String): FluentBuilder = apply { this.cidrIpv4 = cidrIpv4 }
        override fun cidrIpv6(cidrIpv6: String): FluentBuilder = apply { this.cidrIpv6 = cidrIpv6 }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun fromPort(fromPort: Int): FluentBuilder = apply { this.fromPort = fromPort }
        override fun ipProtocol(ipProtocol: String): FluentBuilder = apply { this.ipProtocol = ipProtocol }
        override fun prefixListId(prefixListId: String): FluentBuilder = apply { this.prefixListId = prefixListId }
        override fun referencedGroupId(referencedGroupId: String): FluentBuilder = apply { this.referencedGroupId = referencedGroupId }
        override fun toPort(toPort: Int): FluentBuilder = apply { this.toPort = toPort }
    }
}
