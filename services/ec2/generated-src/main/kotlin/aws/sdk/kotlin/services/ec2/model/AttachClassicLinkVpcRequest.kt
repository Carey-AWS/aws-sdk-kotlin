// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AttachClassicLinkVpcRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     */
    val groups: List<String>? = builder.groups
    /**
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     */
    val instanceId: String? = builder.instanceId
    /**
     * The ID of a ClassicLink-enabled VPC.
     */
    val vpcId: String? = builder.vpcId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AttachClassicLinkVpcRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AttachClassicLinkVpcRequest(")
        append("dryRun=$dryRun,")
        append("groups=$groups,")
        append("instanceId=$instanceId,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groups?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AttachClassicLinkVpcRequest

        if (dryRun != other.dryRun) return false
        if (groups != other.groups) return false
        if (instanceId != other.instanceId) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AttachClassicLinkVpcRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AttachClassicLinkVpcRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
         */
        fun groups(groups: List<String>): FluentBuilder
        /**
         * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
         */
        fun instanceId(instanceId: String): FluentBuilder
        /**
         * The ID of a ClassicLink-enabled VPC.
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
         * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
         */
        var groups: List<String>?
        /**
         * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
         */
        var instanceId: String?
        /**
         * The ID of a ClassicLink-enabled VPC.
         */
        var vpcId: String?

        fun build(): AttachClassicLinkVpcRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var groups: List<String>? = null
        override var instanceId: String? = null
        override var vpcId: String? = null

        constructor(x: AttachClassicLinkVpcRequest) : this() {
            this.dryRun = x.dryRun
            this.groups = x.groups
            this.instanceId = x.instanceId
            this.vpcId = x.vpcId
        }

        override fun build(): AttachClassicLinkVpcRequest = AttachClassicLinkVpcRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun groups(groups: List<String>): FluentBuilder = apply { this.groups = groups }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
        override fun vpcId(vpcId: String): FluentBuilder = apply { this.vpcId = vpcId }
    }
}
