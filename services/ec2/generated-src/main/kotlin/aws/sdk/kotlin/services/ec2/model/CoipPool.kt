// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a customer-owned address pool.
 */
class CoipPool private constructor(builder: BuilderImpl) {
    /**
     * The ID of the local gateway route table.
     */
    val localGatewayRouteTableId: String? = builder.localGatewayRouteTableId
    /**
     * The ARN of the address pool.
     */
    val poolArn: String? = builder.poolArn
    /**
     * The address ranges of the address pool.
     */
    val poolCidrs: List<String>? = builder.poolCidrs
    /**
     * The ID of the address pool.
     */
    val poolId: String? = builder.poolId
    /**
     * The tags.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CoipPool = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CoipPool(")
        append("localGatewayRouteTableId=$localGatewayRouteTableId,")
        append("poolArn=$poolArn,")
        append("poolCidrs=$poolCidrs,")
        append("poolId=$poolId,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = localGatewayRouteTableId?.hashCode() ?: 0
        result = 31 * result + (poolArn?.hashCode() ?: 0)
        result = 31 * result + (poolCidrs?.hashCode() ?: 0)
        result = 31 * result + (poolId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CoipPool

        if (localGatewayRouteTableId != other.localGatewayRouteTableId) return false
        if (poolArn != other.poolArn) return false
        if (poolCidrs != other.poolCidrs) return false
        if (poolId != other.poolId) return false
        if (tags != other.tags) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CoipPool = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CoipPool
        /**
         * The ID of the local gateway route table.
         */
        fun localGatewayRouteTableId(localGatewayRouteTableId: String): FluentBuilder
        /**
         * The ARN of the address pool.
         */
        fun poolArn(poolArn: String): FluentBuilder
        /**
         * The address ranges of the address pool.
         */
        fun poolCidrs(poolCidrs: List<String>): FluentBuilder
        /**
         * The ID of the address pool.
         */
        fun poolId(poolId: String): FluentBuilder
        /**
         * The tags.
         */
        fun tags(tags: List<Tag>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the local gateway route table.
         */
        var localGatewayRouteTableId: String?
        /**
         * The ARN of the address pool.
         */
        var poolArn: String?
        /**
         * The address ranges of the address pool.
         */
        var poolCidrs: List<String>?
        /**
         * The ID of the address pool.
         */
        var poolId: String?
        /**
         * The tags.
         */
        var tags: List<Tag>?

        fun build(): CoipPool
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var localGatewayRouteTableId: String? = null
        override var poolArn: String? = null
        override var poolCidrs: List<String>? = null
        override var poolId: String? = null
        override var tags: List<Tag>? = null

        constructor(x: CoipPool) : this() {
            this.localGatewayRouteTableId = x.localGatewayRouteTableId
            this.poolArn = x.poolArn
            this.poolCidrs = x.poolCidrs
            this.poolId = x.poolId
            this.tags = x.tags
        }

        override fun build(): CoipPool = CoipPool(this)
        override fun localGatewayRouteTableId(localGatewayRouteTableId: String): FluentBuilder = apply { this.localGatewayRouteTableId = localGatewayRouteTableId }
        override fun poolArn(poolArn: String): FluentBuilder = apply { this.poolArn = poolArn }
        override fun poolCidrs(poolCidrs: List<String>): FluentBuilder = apply { this.poolCidrs = poolCidrs }
        override fun poolId(poolId: String): FluentBuilder = apply { this.poolId = poolId }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
    }
}
