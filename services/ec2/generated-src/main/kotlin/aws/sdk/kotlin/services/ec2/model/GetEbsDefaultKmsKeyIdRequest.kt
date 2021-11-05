// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetEbsDefaultKmsKeyIdRequest private constructor(builder: BuilderImpl) {
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

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetEbsDefaultKmsKeyIdRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetEbsDefaultKmsKeyIdRequest(")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetEbsDefaultKmsKeyIdRequest

        if (dryRun != other.dryRun) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetEbsDefaultKmsKeyIdRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetEbsDefaultKmsKeyIdRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?

        fun build(): GetEbsDefaultKmsKeyIdRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null

        constructor(x: GetEbsDefaultKmsKeyIdRequest) : this() {
            this.dryRun = x.dryRun
        }

        override fun build(): GetEbsDefaultKmsKeyIdRequest = GetEbsDefaultKmsKeyIdRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
    }
}
