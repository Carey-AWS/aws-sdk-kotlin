// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the amount of provisioned throughput capacity consumed on a table or an index.
 */
class Capacity private constructor(builder: BuilderImpl) {
    /**
     * The total number of capacity units consumed on a table or an index.
     */
    val capacityUnits: Double? = builder.capacityUnits
    /**
     * The total number of read capacity units consumed on a table or an index.
     */
    val readCapacityUnits: Double? = builder.readCapacityUnits
    /**
     * The total number of write capacity units consumed on a table or an index.
     */
    val writeCapacityUnits: Double? = builder.writeCapacityUnits

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Capacity = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Capacity(")
        append("capacityUnits=$capacityUnits,")
        append("readCapacityUnits=$readCapacityUnits,")
        append("writeCapacityUnits=$writeCapacityUnits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityUnits?.hashCode() ?: 0
        result = 31 * result + (readCapacityUnits?.hashCode() ?: 0)
        result = 31 * result + (writeCapacityUnits?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Capacity

        if (capacityUnits != other.capacityUnits) return false
        if (readCapacityUnits != other.readCapacityUnits) return false
        if (writeCapacityUnits != other.writeCapacityUnits) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Capacity = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Capacity
        /**
         * The total number of capacity units consumed on a table or an index.
         */
        fun capacityUnits(capacityUnits: Double): FluentBuilder
        /**
         * The total number of read capacity units consumed on a table or an index.
         */
        fun readCapacityUnits(readCapacityUnits: Double): FluentBuilder
        /**
         * The total number of write capacity units consumed on a table or an index.
         */
        fun writeCapacityUnits(writeCapacityUnits: Double): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The total number of capacity units consumed on a table or an index.
         */
        var capacityUnits: Double?
        /**
         * The total number of read capacity units consumed on a table or an index.
         */
        var readCapacityUnits: Double?
        /**
         * The total number of write capacity units consumed on a table or an index.
         */
        var writeCapacityUnits: Double?

        fun build(): Capacity
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var capacityUnits: Double? = null
        override var readCapacityUnits: Double? = null
        override var writeCapacityUnits: Double? = null

        constructor(x: Capacity) : this() {
            this.capacityUnits = x.capacityUnits
            this.readCapacityUnits = x.readCapacityUnits
            this.writeCapacityUnits = x.writeCapacityUnits
        }

        override fun build(): Capacity = Capacity(this)
        override fun capacityUnits(capacityUnits: Double): FluentBuilder = apply { this.capacityUnits = capacityUnits }
        override fun readCapacityUnits(readCapacityUnits: Double): FluentBuilder = apply { this.readCapacityUnits = readCapacityUnits }
        override fun writeCapacityUnits(writeCapacityUnits: Double): FluentBuilder = apply { this.writeCapacityUnits = writeCapacityUnits }
    }
}
