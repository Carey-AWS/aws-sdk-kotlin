// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RevokeSecurityGroupEgressResponse private constructor(builder: BuilderImpl) {
    /**
     * Returns true if the request succeeds; otherwise, returns an error.
     */
    val `return`: Boolean? = builder.`return`
    /**
     * The outbound rules that were unknown to the service. In some cases,
     * unknownIpPermissionSet might be in a different format from the request
     * parameter.
     */
    val unknownIpPermissions: List<IpPermission>? = builder.unknownIpPermissions

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RevokeSecurityGroupEgressResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RevokeSecurityGroupEgressResponse(")
        append("return=$`return`,")
        append("unknownIpPermissions=$unknownIpPermissions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = `return`?.hashCode() ?: 0
        result = 31 * result + (unknownIpPermissions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RevokeSecurityGroupEgressResponse

        if (`return` != other.`return`) return false
        if (unknownIpPermissions != other.unknownIpPermissions) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RevokeSecurityGroupEgressResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RevokeSecurityGroupEgressResponse
        /**
         * Returns true if the request succeeds; otherwise, returns an error.
         */
        fun `return`(`return`: Boolean): FluentBuilder
        /**
         * The outbound rules that were unknown to the service. In some cases,
         * unknownIpPermissionSet might be in a different format from the request
         * parameter.
         */
        fun unknownIpPermissions(unknownIpPermissions: List<IpPermission>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Returns true if the request succeeds; otherwise, returns an error.
         */
        var `return`: Boolean?
        /**
         * The outbound rules that were unknown to the service. In some cases,
         * unknownIpPermissionSet might be in a different format from the request
         * parameter.
         */
        var unknownIpPermissions: List<IpPermission>?

        fun build(): RevokeSecurityGroupEgressResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var `return`: Boolean? = null
        override var unknownIpPermissions: List<IpPermission>? = null

        constructor(x: RevokeSecurityGroupEgressResponse) : this() {
            this.`return` = x.`return`
            this.unknownIpPermissions = x.unknownIpPermissions
        }

        override fun build(): RevokeSecurityGroupEgressResponse = RevokeSecurityGroupEgressResponse(this)
        override fun `return`(`return`: Boolean): FluentBuilder = apply { this.`return` = `return` }
        override fun unknownIpPermissions(unknownIpPermissions: List<IpPermission>): FluentBuilder = apply { this.unknownIpPermissions = unknownIpPermissions }
    }
}
