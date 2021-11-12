// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteKeyPairRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The name of the key pair.
     */
    val keyName: String? = builder.keyName
    /**
     * The ID of the key pair.
     */
    val keyPairId: String? = builder.keyPairId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteKeyPairRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteKeyPairRequest(")
        append("dryRun=$dryRun,")
        append("keyName=$keyName,")
        append("keyPairId=$keyPairId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (keyPairId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteKeyPairRequest

        if (dryRun != other.dryRun) return false
        if (keyName != other.keyName) return false
        if (keyPairId != other.keyPairId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteKeyPairRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteKeyPairRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The name of the key pair.
         */
        fun keyName(keyName: String): FluentBuilder
        /**
         * The ID of the key pair.
         */
        fun keyPairId(keyPairId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The name of the key pair.
         */
        var keyName: String?
        /**
         * The ID of the key pair.
         */
        var keyPairId: String?

        fun build(): DeleteKeyPairRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var keyName: String? = null
        override var keyPairId: String? = null

        constructor(x: DeleteKeyPairRequest) : this() {
            this.dryRun = x.dryRun
            this.keyName = x.keyName
            this.keyPairId = x.keyPairId
        }

        override fun build(): DeleteKeyPairRequest = DeleteKeyPairRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun keyName(keyName: String): FluentBuilder = apply { this.keyName = keyName }
        override fun keyPairId(keyPairId: String): FluentBuilder = apply { this.keyPairId = keyPairId }
    }
}
