// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * A source table with the name TableName does not currently exist within the subscriber's account.
 */
class TableNotFoundException private constructor(builder: BuilderImpl) : DynamoDbException() {

    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TableNotFoundException = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TableNotFoundException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TableNotFoundException

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TableNotFoundException = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TableNotFoundException
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        var message: String?

        fun build(): TableNotFoundException
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: TableNotFoundException) : this() {
            this.message = x.message
        }

        override fun build(): TableNotFoundException = TableNotFoundException(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
