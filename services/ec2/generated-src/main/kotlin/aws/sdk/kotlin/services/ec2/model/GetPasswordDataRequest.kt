// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetPasswordDataRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the Windows instance.
     */
    val instanceId: String? = builder.instanceId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetPasswordDataRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetPasswordDataRequest(")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetPasswordDataRequest

        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetPasswordDataRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetPasswordDataRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the Windows instance.
         */
        fun instanceId(instanceId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the Windows instance.
         */
        var instanceId: String?

        fun build(): GetPasswordDataRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var instanceId: String? = null

        constructor(x: GetPasswordDataRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
        }

        override fun build(): GetPasswordDataRequest = GetPasswordDataRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
    }
}
