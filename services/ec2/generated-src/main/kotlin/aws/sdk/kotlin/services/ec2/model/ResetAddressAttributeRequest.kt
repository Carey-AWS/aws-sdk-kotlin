// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetAddressAttributeRequest private constructor(builder: BuilderImpl) {
    /**
     * &#91;EC2-VPC&#93; The allocation ID.
     */
    val allocationId: String? = builder.allocationId
    /**
     * The attribute of the IP address.
     */
    val attribute: AddressAttributeName? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ResetAddressAttributeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ResetAddressAttributeRequest(")
        append("allocationId=$allocationId,")
        append("attribute=$attribute,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (attribute?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResetAddressAttributeRequest

        if (allocationId != other.allocationId) return false
        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ResetAddressAttributeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ResetAddressAttributeRequest
        /**
         * &#91;EC2-VPC&#93; The allocation ID.
         */
        fun allocationId(allocationId: String): FluentBuilder
        /**
         * The attribute of the IP address.
         */
        fun attribute(attribute: AddressAttributeName): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * &#91;EC2-VPC&#93; The allocation ID.
         */
        var allocationId: String?
        /**
         * The attribute of the IP address.
         */
        var attribute: AddressAttributeName?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?

        fun build(): ResetAddressAttributeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var allocationId: String? = null
        override var attribute: AddressAttributeName? = null
        override var dryRun: Boolean? = null

        constructor(x: ResetAddressAttributeRequest) : this() {
            this.allocationId = x.allocationId
            this.attribute = x.attribute
            this.dryRun = x.dryRun
        }

        override fun build(): ResetAddressAttributeRequest = ResetAddressAttributeRequest(this)
        override fun allocationId(allocationId: String): FluentBuilder = apply { this.allocationId = allocationId }
        override fun attribute(attribute: AddressAttributeName): FluentBuilder = apply { this.attribute = attribute }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
    }
}
