// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output for DescribeNetworkInterfacePermissions.
 */
class DescribeNetworkInterfacePermissionsResponse private constructor(builder: BuilderImpl) {
    /**
     * The network interface permissions.
     */
    val networkInterfacePermissions: List<NetworkInterfacePermission>? = builder.networkInterfacePermissions
    /**
     * The token to use to retrieve the next page of results.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeNetworkInterfacePermissionsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkInterfacePermissionsResponse(")
        append("networkInterfacePermissions=$networkInterfacePermissions,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInterfacePermissions?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeNetworkInterfacePermissionsResponse

        if (networkInterfacePermissions != other.networkInterfacePermissions) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeNetworkInterfacePermissionsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeNetworkInterfacePermissionsResponse
        /**
         * The network interface permissions.
         */
        fun networkInterfacePermissions(networkInterfacePermissions: List<NetworkInterfacePermission>): FluentBuilder
        /**
         * The token to use to retrieve the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The network interface permissions.
         */
        var networkInterfacePermissions: List<NetworkInterfacePermission>?
        /**
         * The token to use to retrieve the next page of results.
         */
        var nextToken: String?

        fun build(): DescribeNetworkInterfacePermissionsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var networkInterfacePermissions: List<NetworkInterfacePermission>? = null
        override var nextToken: String? = null

        constructor(x: DescribeNetworkInterfacePermissionsResponse) : this() {
            this.networkInterfacePermissions = x.networkInterfacePermissions
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeNetworkInterfacePermissionsResponse = DescribeNetworkInterfacePermissionsResponse(this)
        override fun networkInterfacePermissions(networkInterfacePermissions: List<NetworkInterfacePermission>): FluentBuilder = apply { this.networkInterfacePermissions = networkInterfacePermissions }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
