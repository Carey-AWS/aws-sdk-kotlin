// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteLocalGatewayRouteTableVpcAssociationResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the association.
     */
    val localGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation? = builder.localGatewayRouteTableVpcAssociation

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteLocalGatewayRouteTableVpcAssociationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteLocalGatewayRouteTableVpcAssociationResponse(")
        append("localGatewayRouteTableVpcAssociation=$localGatewayRouteTableVpcAssociation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = localGatewayRouteTableVpcAssociation?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteLocalGatewayRouteTableVpcAssociationResponse

        if (localGatewayRouteTableVpcAssociation != other.localGatewayRouteTableVpcAssociation) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteLocalGatewayRouteTableVpcAssociationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteLocalGatewayRouteTableVpcAssociationResponse
        /**
         * Information about the association.
         */
        fun localGatewayRouteTableVpcAssociation(localGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the association.
         */
        var localGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation?

        fun build(): DeleteLocalGatewayRouteTableVpcAssociationResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteTableVpcAssociation] inside the given [block]
         */
        fun localGatewayRouteTableVpcAssociation(block: LocalGatewayRouteTableVpcAssociation.DslBuilder.() -> kotlin.Unit) {
            this.localGatewayRouteTableVpcAssociation = LocalGatewayRouteTableVpcAssociation.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var localGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation? = null

        constructor(x: DeleteLocalGatewayRouteTableVpcAssociationResponse) : this() {
            this.localGatewayRouteTableVpcAssociation = x.localGatewayRouteTableVpcAssociation
        }

        override fun build(): DeleteLocalGatewayRouteTableVpcAssociationResponse = DeleteLocalGatewayRouteTableVpcAssociationResponse(this)
        override fun localGatewayRouteTableVpcAssociation(localGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation): FluentBuilder = apply { this.localGatewayRouteTableVpcAssociation = localGatewayRouteTableVpcAssociation }
    }
}
