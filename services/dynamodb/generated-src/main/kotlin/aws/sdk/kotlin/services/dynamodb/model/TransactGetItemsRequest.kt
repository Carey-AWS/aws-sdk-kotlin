// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class TransactGetItemsRequest private constructor(builder: BuilderImpl) {
    /**
     * A value of TOTAL causes consumed capacity information
     * to be returned, and a value of NONE prevents that information
     * from being returned. No other value is valid.
     */
    val returnConsumedCapacity: ReturnConsumedCapacity? = builder.returnConsumedCapacity
    /**
     * An ordered array of up to 25 TransactGetItem objects,
     * each of which contains a Get structure.
     */
    val transactItems: List<TransactGetItem>? = builder.transactItems

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TransactGetItemsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TransactGetItemsRequest(")
        append("returnConsumedCapacity=$returnConsumedCapacity,")
        append("transactItems=$transactItems)")
    }

    override fun hashCode(): kotlin.Int {
        var result = returnConsumedCapacity?.hashCode() ?: 0
        result = 31 * result + (transactItems?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TransactGetItemsRequest

        if (returnConsumedCapacity != other.returnConsumedCapacity) return false
        if (transactItems != other.transactItems) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TransactGetItemsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TransactGetItemsRequest
        /**
         * A value of TOTAL causes consumed capacity information
         * to be returned, and a value of NONE prevents that information
         * from being returned. No other value is valid.
         */
        fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder
        /**
         * An ordered array of up to 25 TransactGetItem objects,
         * each of which contains a Get structure.
         */
        fun transactItems(transactItems: List<TransactGetItem>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A value of TOTAL causes consumed capacity information
         * to be returned, and a value of NONE prevents that information
         * from being returned. No other value is valid.
         */
        var returnConsumedCapacity: ReturnConsumedCapacity?
        /**
         * An ordered array of up to 25 TransactGetItem objects,
         * each of which contains a Get structure.
         */
        var transactItems: List<TransactGetItem>?

        fun build(): TransactGetItemsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var returnConsumedCapacity: ReturnConsumedCapacity? = null
        override var transactItems: List<TransactGetItem>? = null

        constructor(x: TransactGetItemsRequest) : this() {
            this.returnConsumedCapacity = x.returnConsumedCapacity
            this.transactItems = x.transactItems
        }

        override fun build(): TransactGetItemsRequest = TransactGetItemsRequest(this)
        override fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder = apply { this.returnConsumedCapacity = returnConsumedCapacity }
        override fun transactItems(transactItems: List<TransactGetItem>): FluentBuilder = apply { this.transactItems = transactItems }
    }
}
