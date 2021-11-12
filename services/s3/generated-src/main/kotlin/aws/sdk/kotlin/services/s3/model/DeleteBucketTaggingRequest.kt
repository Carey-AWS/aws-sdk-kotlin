// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketTaggingRequest private constructor(builder: BuilderImpl) {
    /**
     * The bucket that has the tag set to be removed.
     */
    val bucket: String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: String? = builder.expectedBucketOwner

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteBucketTaggingRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketTaggingRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteBucketTaggingRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteBucketTaggingRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteBucketTaggingRequest
        /**
         * The bucket that has the tag set to be removed.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The bucket that has the tag set to be removed.
         */
        var bucket: String?
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: String?

        fun build(): DeleteBucketTaggingRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var expectedBucketOwner: String? = null

        constructor(x: DeleteBucketTaggingRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        override fun build(): DeleteBucketTaggingRequest = DeleteBucketTaggingRequest(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder = apply { this.expectedBucketOwner = expectedBucketOwner }
    }
}
