// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * A condition specified in the operation could not be evaluated.
 */
class ConditionalCheckFailedException private constructor(builder: BuilderImpl) : DynamoDbException() {

    /**
     * The conditional request failed.
     */
    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ConditionalCheckFailedException = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ConditionalCheckFailedException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ConditionalCheckFailedException

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ConditionalCheckFailedException = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ConditionalCheckFailedException
        /**
         * The conditional request failed.
         */
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The conditional request failed.
         */
        var message: String?

        fun build(): ConditionalCheckFailedException
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: ConditionalCheckFailedException) : this() {
            this.message = x.message
        }

        override fun build(): ConditionalCheckFailedException = ConditionalCheckFailedException(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
