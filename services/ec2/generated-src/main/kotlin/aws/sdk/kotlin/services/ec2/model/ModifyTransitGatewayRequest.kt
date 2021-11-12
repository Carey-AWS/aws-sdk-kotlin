// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayRequest private constructor(builder: BuilderImpl) {
    /**
     * The description for the transit gateway.
     */
    val description: String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The options to modify.
     */
    val options: ModifyTransitGatewayOptions? = builder.options
    /**
     * The ID of the transit gateway.
     */
    val transitGatewayId: String? = builder.transitGatewayId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyTransitGatewayRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayRequest(")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("transitGatewayId=$transitGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyTransitGatewayRequest

        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (transitGatewayId != other.transitGatewayId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyTransitGatewayRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyTransitGatewayRequest
        /**
         * The description for the transit gateway.
         */
        fun description(description: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The options to modify.
         */
        fun options(options: ModifyTransitGatewayOptions): FluentBuilder
        /**
         * The ID of the transit gateway.
         */
        fun transitGatewayId(transitGatewayId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The description for the transit gateway.
         */
        var description: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The options to modify.
         */
        var options: ModifyTransitGatewayOptions?
        /**
         * The ID of the transit gateway.
         */
        var transitGatewayId: String?

        fun build(): ModifyTransitGatewayRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions] inside the given [block]
         */
        fun options(block: ModifyTransitGatewayOptions.DslBuilder.() -> kotlin.Unit) {
            this.options = ModifyTransitGatewayOptions.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var description: String? = null
        override var dryRun: Boolean? = null
        override var options: ModifyTransitGatewayOptions? = null
        override var transitGatewayId: String? = null

        constructor(x: ModifyTransitGatewayRequest) : this() {
            this.description = x.description
            this.dryRun = x.dryRun
            this.options = x.options
            this.transitGatewayId = x.transitGatewayId
        }

        override fun build(): ModifyTransitGatewayRequest = ModifyTransitGatewayRequest(this)
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun options(options: ModifyTransitGatewayOptions): FluentBuilder = apply { this.options = options }
        override fun transitGatewayId(transitGatewayId: String): FluentBuilder = apply { this.transitGatewayId = transitGatewayId }
    }
}
