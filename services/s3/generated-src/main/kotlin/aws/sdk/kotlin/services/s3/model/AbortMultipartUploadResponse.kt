// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class AbortMultipartUploadResponse private constructor(builder: BuilderImpl) {
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: RequestCharged? = builder.requestCharged

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AbortMultipartUploadResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AbortMultipartUploadResponse(")
        append("requestCharged=$requestCharged)")
    }

    override fun hashCode(): kotlin.Int {
        var result = requestCharged?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AbortMultipartUploadResponse

        if (requestCharged != other.requestCharged) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AbortMultipartUploadResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AbortMultipartUploadResponse
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        fun requestCharged(requestCharged: RequestCharged): FluentBuilder
    }

    interface DslBuilder {
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: RequestCharged?

        fun build(): AbortMultipartUploadResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var requestCharged: RequestCharged? = null

        constructor(x: AbortMultipartUploadResponse) : this() {
            this.requestCharged = x.requestCharged
        }

        override fun build(): AbortMultipartUploadResponse = AbortMultipartUploadResponse(this)
        override fun requestCharged(requestCharged: RequestCharged): FluentBuilder = apply { this.requestCharged = requestCharged }
    }
}
