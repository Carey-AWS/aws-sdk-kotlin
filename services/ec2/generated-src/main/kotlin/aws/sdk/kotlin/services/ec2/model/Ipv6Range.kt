// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * &#91;EC2-VPC only&#93; Describes an IPv6 range.
 */
class Ipv6Range private constructor(builder: BuilderImpl) {
    /**
     * The IPv6 CIDR range. You can either specify a CIDR range or a source security group,
     * not both. To specify a single IPv6 address, use the /128 prefix length.
     */
    val cidrIpv6: String? = builder.cidrIpv6
    /**
     * A description for the security group rule that references this IPv6 address range.
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9,
     * spaces, and ._-:/()#,@&#91;&#93;+=&;{}!$*
     */
    val description: String? = builder.description

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Ipv6Range = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Ipv6Range(")
        append("cidrIpv6=$cidrIpv6,")
        append("description=$description)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrIpv6?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ipv6Range

        if (cidrIpv6 != other.cidrIpv6) return false
        if (description != other.description) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Ipv6Range = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Ipv6Range
        /**
         * The IPv6 CIDR range. You can either specify a CIDR range or a source security group,
         * not both. To specify a single IPv6 address, use the /128 prefix length.
         */
        fun cidrIpv6(cidrIpv6: String): FluentBuilder
        /**
         * A description for the security group rule that references this IPv6 address range.
         * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9,
         * spaces, and ._-:/()#,@&#91;&#93;+=&;{}!$*
         */
        fun description(description: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The IPv6 CIDR range. You can either specify a CIDR range or a source security group,
         * not both. To specify a single IPv6 address, use the /128 prefix length.
         */
        var cidrIpv6: String?
        /**
         * A description for the security group rule that references this IPv6 address range.
         * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9,
         * spaces, and ._-:/()#,@&#91;&#93;+=&;{}!$*
         */
        var description: String?

        fun build(): Ipv6Range
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var cidrIpv6: String? = null
        override var description: String? = null

        constructor(x: Ipv6Range) : this() {
            this.cidrIpv6 = x.cidrIpv6
            this.description = x.description
        }

        override fun build(): Ipv6Range = Ipv6Range(this)
        override fun cidrIpv6(cidrIpv6: String): FluentBuilder = apply { this.cidrIpv6 = cidrIpv6 }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
    }
}
