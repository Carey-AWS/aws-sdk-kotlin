// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a BatchWriteItem operation.
 */
class BatchWriteItemRequest private constructor(builder: BuilderImpl) {
    /**
     * A map of one or more table names and, for each table, a list of operations to be performed
     * (DeleteRequest or PutRequest). Each element in the map consists of the
     * following:
     * DeleteRequest - Perform a DeleteItem operation on the specified item. The
     * item to be deleted is identified by a Key subelement:
     * Key - A map of primary key attribute values that uniquely identify the item.
     * Each entry in this map consists of an attribute name and an attribute value. For each
     * primary key, you must provide all of the key attributes. For example, with a
     * simple primary key, you only need to provide a value for the partition key. For a
     * composite primary key, you must provide values for both the partition key and the sort key.
     * PutRequest - Perform a PutItem operation on the specified item. The item to
     * be put is identified by an Item subelement:
     * Item - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values are rejected with a
     * ValidationException exception.
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
     */
    val requestItems: Map<String, List<WriteRequest>>? = builder.requestItems
    /**
     * Determines the level of detail about provisioned throughput consumption that is returned in the response:
     * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
     * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
     * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
     * NONE - No ConsumedCapacity details are included in the response.
     */
    val returnConsumedCapacity: ReturnConsumedCapacity? = builder.returnConsumedCapacity
    /**
     * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
     */
    val returnItemCollectionMetrics: ReturnItemCollectionMetrics? = builder.returnItemCollectionMetrics

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): BatchWriteItemRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("BatchWriteItemRequest(")
        append("requestItems=$requestItems,")
        append("returnConsumedCapacity=$returnConsumedCapacity,")
        append("returnItemCollectionMetrics=$returnItemCollectionMetrics)")
    }

    override fun hashCode(): kotlin.Int {
        var result = requestItems?.hashCode() ?: 0
        result = 31 * result + (returnConsumedCapacity?.hashCode() ?: 0)
        result = 31 * result + (returnItemCollectionMetrics?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BatchWriteItemRequest

        if (requestItems != other.requestItems) return false
        if (returnConsumedCapacity != other.returnConsumedCapacity) return false
        if (returnItemCollectionMetrics != other.returnItemCollectionMetrics) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): BatchWriteItemRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): BatchWriteItemRequest
        /**
         * A map of one or more table names and, for each table, a list of operations to be performed
         * (DeleteRequest or PutRequest). Each element in the map consists of the
         * following:
         * DeleteRequest - Perform a DeleteItem operation on the specified item. The
         * item to be deleted is identified by a Key subelement:
         * Key - A map of primary key attribute values that uniquely identify the item.
         * Each entry in this map consists of an attribute name and an attribute value. For each
         * primary key, you must provide all of the key attributes. For example, with a
         * simple primary key, you only need to provide a value for the partition key. For a
         * composite primary key, you must provide values for both the partition key and the sort key.
         * PutRequest - Perform a PutItem operation on the specified item. The item to
         * be put is identified by an Item subelement:
         * Item - A map of attributes and their values. Each entry in
         * this map consists of an attribute name and an attribute value. Attribute
         * values must not be null; string and binary type attributes must have
         * lengths greater than zero; and set type attributes must not be empty.
         * Requests that contain empty values are rejected with a
         * ValidationException exception.
         * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
         */
        fun requestItems(requestItems: Map<String, List<WriteRequest>>): FluentBuilder
        /**
         * Determines the level of detail about provisioned throughput consumption that is returned in the response:
         * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
         * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
         * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
         * NONE - No ConsumedCapacity details are included in the response.
         */
        fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder
        /**
         * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
         * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
         */
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: ReturnItemCollectionMetrics): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A map of one or more table names and, for each table, a list of operations to be performed
         * (DeleteRequest or PutRequest). Each element in the map consists of the
         * following:
         * DeleteRequest - Perform a DeleteItem operation on the specified item. The
         * item to be deleted is identified by a Key subelement:
         * Key - A map of primary key attribute values that uniquely identify the item.
         * Each entry in this map consists of an attribute name and an attribute value. For each
         * primary key, you must provide all of the key attributes. For example, with a
         * simple primary key, you only need to provide a value for the partition key. For a
         * composite primary key, you must provide values for both the partition key and the sort key.
         * PutRequest - Perform a PutItem operation on the specified item. The item to
         * be put is identified by an Item subelement:
         * Item - A map of attributes and their values. Each entry in
         * this map consists of an attribute name and an attribute value. Attribute
         * values must not be null; string and binary type attributes must have
         * lengths greater than zero; and set type attributes must not be empty.
         * Requests that contain empty values are rejected with a
         * ValidationException exception.
         * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
         */
        var requestItems: Map<String, List<WriteRequest>>?
        /**
         * Determines the level of detail about provisioned throughput consumption that is returned in the response:
         * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
         * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
         * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
         * NONE - No ConsumedCapacity details are included in the response.
         */
        var returnConsumedCapacity: ReturnConsumedCapacity?
        /**
         * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
         * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
         */
        var returnItemCollectionMetrics: ReturnItemCollectionMetrics?

        fun build(): BatchWriteItemRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var requestItems: Map<String, List<WriteRequest>>? = null
        override var returnConsumedCapacity: ReturnConsumedCapacity? = null
        override var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null

        constructor(x: BatchWriteItemRequest) : this() {
            this.requestItems = x.requestItems
            this.returnConsumedCapacity = x.returnConsumedCapacity
            this.returnItemCollectionMetrics = x.returnItemCollectionMetrics
        }

        override fun build(): BatchWriteItemRequest = BatchWriteItemRequest(this)
        override fun requestItems(requestItems: Map<String, List<WriteRequest>>): FluentBuilder = apply { this.requestItems = requestItems }
        override fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder = apply { this.returnConsumedCapacity = returnConsumedCapacity }
        override fun returnItemCollectionMetrics(returnItemCollectionMetrics: ReturnItemCollectionMetrics): FluentBuilder = apply { this.returnItemCollectionMetrics = returnItemCollectionMetrics }
    }
}
