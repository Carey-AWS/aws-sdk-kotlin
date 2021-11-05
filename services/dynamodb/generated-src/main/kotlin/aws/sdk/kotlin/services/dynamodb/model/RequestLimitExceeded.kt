// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * Throughput exceeds the current throughput quota for your account. Please contact AWS Support at <a href="https://aws.amazon.com/support">AWS Support to request a quota increase.
 */
class RequestLimitExceeded private constructor(builder: BuilderImpl) : DynamoDbException() {

    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RequestLimitExceeded = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RequestLimitExceeded(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RequestLimitExceeded

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RequestLimitExceeded = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RequestLimitExceeded
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        var message: String?

        fun build(): RequestLimitExceeded
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: RequestLimitExceeded) : this() {
            this.message = x.message
        }

        override fun build(): RequestLimitExceeded = RequestLimitExceeded(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
