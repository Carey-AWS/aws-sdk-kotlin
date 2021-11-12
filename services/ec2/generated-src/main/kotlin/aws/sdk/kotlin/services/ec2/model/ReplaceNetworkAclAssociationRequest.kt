// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceNetworkAclAssociationRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the current association between the original network ACL and the subnet.
     */
    val associationId: String? = builder.associationId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the new network ACL to associate with the subnet.
     */
    val networkAclId: String? = builder.networkAclId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplaceNetworkAclAssociationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceNetworkAclAssociationRequest(")
        append("associationId=$associationId,")
        append("dryRun=$dryRun,")
        append("networkAclId=$networkAclId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (networkAclId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplaceNetworkAclAssociationRequest

        if (associationId != other.associationId) return false
        if (dryRun != other.dryRun) return false
        if (networkAclId != other.networkAclId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplaceNetworkAclAssociationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplaceNetworkAclAssociationRequest
        /**
         * The ID of the current association between the original network ACL and the subnet.
         */
        fun associationId(associationId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the new network ACL to associate with the subnet.
         */
        fun networkAclId(networkAclId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the current association between the original network ACL and the subnet.
         */
        var associationId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the new network ACL to associate with the subnet.
         */
        var networkAclId: String?

        fun build(): ReplaceNetworkAclAssociationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationId: String? = null
        override var dryRun: Boolean? = null
        override var networkAclId: String? = null

        constructor(x: ReplaceNetworkAclAssociationRequest) : this() {
            this.associationId = x.associationId
            this.dryRun = x.dryRun
            this.networkAclId = x.networkAclId
        }

        override fun build(): ReplaceNetworkAclAssociationRequest = ReplaceNetworkAclAssociationRequest(this)
        override fun associationId(associationId: String): FluentBuilder = apply { this.associationId = associationId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun networkAclId(networkAclId: String): FluentBuilder = apply { this.networkAclId = networkAclId }
    }
}
