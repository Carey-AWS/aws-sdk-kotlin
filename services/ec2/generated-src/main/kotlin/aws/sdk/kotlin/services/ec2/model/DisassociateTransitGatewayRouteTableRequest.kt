// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateTransitGatewayRouteTableRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the attachment.
     */
    val transitGatewayAttachmentId: String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway route table.
     */
    val transitGatewayRouteTableId: String? = builder.transitGatewayRouteTableId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisassociateTransitGatewayRouteTableRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateTransitGatewayRouteTableRequest(")
        append("dryRun=$dryRun,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayRouteTableId=$transitGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisassociateTransitGatewayRouteTableRequest

        if (dryRun != other.dryRun) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayRouteTableId != other.transitGatewayRouteTableId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisassociateTransitGatewayRouteTableRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisassociateTransitGatewayRouteTableRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the attachment.
         */
        fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder
        /**
         * The ID of the transit gateway route table.
         */
        fun transitGatewayRouteTableId(transitGatewayRouteTableId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the attachment.
         */
        var transitGatewayAttachmentId: String?
        /**
         * The ID of the transit gateway route table.
         */
        var transitGatewayRouteTableId: String?

        fun build(): DisassociateTransitGatewayRouteTableRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var transitGatewayAttachmentId: String? = null
        override var transitGatewayRouteTableId: String? = null

        constructor(x: DisassociateTransitGatewayRouteTableRequest) : this() {
            this.dryRun = x.dryRun
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayRouteTableId = x.transitGatewayRouteTableId
        }

        override fun build(): DisassociateTransitGatewayRouteTableRequest = DisassociateTransitGatewayRouteTableRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder = apply { this.transitGatewayAttachmentId = transitGatewayAttachmentId }
        override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String): FluentBuilder = apply { this.transitGatewayRouteTableId = transitGatewayRouteTableId }
    }
}
