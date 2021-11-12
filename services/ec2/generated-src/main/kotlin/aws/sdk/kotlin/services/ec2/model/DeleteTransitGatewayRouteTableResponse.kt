// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteTransitGatewayRouteTableResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the deleted transit gateway route table.
     */
    val transitGatewayRouteTable: TransitGatewayRouteTable? = builder.transitGatewayRouteTable

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteTransitGatewayRouteTableResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayRouteTableResponse(")
        append("transitGatewayRouteTable=$transitGatewayRouteTable)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayRouteTable?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteTransitGatewayRouteTableResponse

        if (transitGatewayRouteTable != other.transitGatewayRouteTable) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteTransitGatewayRouteTableResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteTransitGatewayRouteTableResponse
        /**
         * Information about the deleted transit gateway route table.
         */
        fun transitGatewayRouteTable(transitGatewayRouteTable: TransitGatewayRouteTable): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the deleted transit gateway route table.
         */
        var transitGatewayRouteTable: TransitGatewayRouteTable?

        fun build(): DeleteTransitGatewayRouteTableResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTable] inside the given [block]
         */
        fun transitGatewayRouteTable(block: TransitGatewayRouteTable.DslBuilder.() -> kotlin.Unit) {
            this.transitGatewayRouteTable = TransitGatewayRouteTable.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var transitGatewayRouteTable: TransitGatewayRouteTable? = null

        constructor(x: DeleteTransitGatewayRouteTableResponse) : this() {
            this.transitGatewayRouteTable = x.transitGatewayRouteTable
        }

        override fun build(): DeleteTransitGatewayRouteTableResponse = DeleteTransitGatewayRouteTableResponse(this)
        override fun transitGatewayRouteTable(transitGatewayRouteTable: TransitGatewayRouteTable): FluentBuilder = apply { this.transitGatewayRouteTable = transitGatewayRouteTable }
    }
}
