// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateRouteTableRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The tags to assign to the route table.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the VPC.
     */
    val vpcId: String? = builder.vpcId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateRouteTableRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateRouteTableRequest(")
        append("dryRun=$dryRun,")
        append("tagSpecifications=$tagSpecifications,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateRouteTableRequest

        if (dryRun != other.dryRun) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateRouteTableRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateRouteTableRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The tags to assign to the route table.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
        /**
         * The ID of the VPC.
         */
        fun vpcId(vpcId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The tags to assign to the route table.
         */
        var tagSpecifications: List<TagSpecification>?
        /**
         * The ID of the VPC.
         */
        var vpcId: String?

        fun build(): CreateRouteTableRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var tagSpecifications: List<TagSpecification>? = null
        override var vpcId: String? = null

        constructor(x: CreateRouteTableRequest) : this() {
            this.dryRun = x.dryRun
            this.tagSpecifications = x.tagSpecifications
            this.vpcId = x.vpcId
        }

        override fun build(): CreateRouteTableRequest = CreateRouteTableRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
        override fun vpcId(vpcId: String): FluentBuilder = apply { this.vpcId = vpcId }
    }
}
