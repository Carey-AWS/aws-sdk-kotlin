// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a storage location in Amazon S3.
 */
class StorageLocation private constructor(builder: BuilderImpl) {
    /**
     * The name of the S3 bucket.
     */
    val bucket: String? = builder.bucket
    /**
     * The key.
     */
    val key: String? = builder.key

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): StorageLocation = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("StorageLocation(")
        append("bucket=$bucket,")
        append("key=$key)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (key?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StorageLocation

        if (bucket != other.bucket) return false
        if (key != other.key) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): StorageLocation = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): StorageLocation
        /**
         * The name of the S3 bucket.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * The key.
         */
        fun key(key: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The name of the S3 bucket.
         */
        var bucket: String?
        /**
         * The key.
         */
        var key: String?

        fun build(): StorageLocation
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var key: String? = null

        constructor(x: StorageLocation) : this() {
            this.bucket = x.bucket
            this.key = x.key
        }

        override fun build(): StorageLocation = StorageLocation(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun key(key: String): FluentBuilder = apply { this.key = key }
    }
}
