// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a single element of a key schema. A key schema specifies the attributes
 * that make up the primary key of a table, or the key attributes of an index.
 * A KeySchemaElement represents exactly one attribute of the primary key. For example, a
 * simple primary key would be represented by one KeySchemaElement (for the partition key). A composite
 * primary key would require one KeySchemaElement for the partition key, and another
 * KeySchemaElement for the sort key.
 * A KeySchemaElement must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary.  The attribute cannot be nested within a List or a Map.
 */
class KeySchemaElement private constructor(builder: BuilderImpl) {
    /**
     * The name of a key attribute.
     */
    val attributeName: String? = builder.attributeName
    /**
     * The role that this key attribute will assume:
     * HASH - partition key
     * RANGE - sort key
     * The partition key of an item is also known as its hash attribute.  The
     * term "hash attribute" derives from DynamoDB's usage of an internal hash function to
     * evenly distribute data items across partitions, based on their partition key values.
     * The sort key of an item is also known as its range attribute.
     * The term "range attribute" derives from the way DynamoDB stores items with the same
     * partition key physically close together, in sorted order by the sort key value.
     */
    val keyType: KeyType? = builder.keyType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): KeySchemaElement = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("KeySchemaElement(")
        append("attributeName=$attributeName,")
        append("keyType=$keyType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attributeName?.hashCode() ?: 0
        result = 31 * result + (keyType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KeySchemaElement

        if (attributeName != other.attributeName) return false
        if (keyType != other.keyType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): KeySchemaElement = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): KeySchemaElement
        /**
         * The name of a key attribute.
         */
        fun attributeName(attributeName: String): FluentBuilder
        /**
         * The role that this key attribute will assume:
         * HASH - partition key
         * RANGE - sort key
         * The partition key of an item is also known as its hash attribute.  The
         * term "hash attribute" derives from DynamoDB's usage of an internal hash function to
         * evenly distribute data items across partitions, based on their partition key values.
         * The sort key of an item is also known as its range attribute.
         * The term "range attribute" derives from the way DynamoDB stores items with the same
         * partition key physically close together, in sorted order by the sort key value.
         */
        fun keyType(keyType: KeyType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The name of a key attribute.
         */
        var attributeName: String?
        /**
         * The role that this key attribute will assume:
         * HASH - partition key
         * RANGE - sort key
         * The partition key of an item is also known as its hash attribute.  The
         * term "hash attribute" derives from DynamoDB's usage of an internal hash function to
         * evenly distribute data items across partitions, based on their partition key values.
         * The sort key of an item is also known as its range attribute.
         * The term "range attribute" derives from the way DynamoDB stores items with the same
         * partition key physically close together, in sorted order by the sort key value.
         */
        var keyType: KeyType?

        fun build(): KeySchemaElement
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var attributeName: String? = null
        override var keyType: KeyType? = null

        constructor(x: KeySchemaElement) : this() {
            this.attributeName = x.attributeName
            this.keyType = x.keyType
        }

        override fun build(): KeySchemaElement = KeySchemaElement(this)
        override fun attributeName(attributeName: String): FluentBuilder = apply { this.attributeName = attributeName }
        override fun keyType(keyType: KeyType): FluentBuilder = apply { this.keyType = keyType }
    }
}
