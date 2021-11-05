// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketLocationRequest private constructor(builder: BuilderImpl) {
    /**
     * The name of the bucket for which to get the location.
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

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketLocationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketLocationRequest(")
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

        other as GetBucketLocationRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketLocationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketLocationRequest
        /**
         * The name of the bucket for which to get the location.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The name of the bucket for which to get the location.
         */
        var bucket: String?
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: String?

        fun build(): GetBucketLocationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var expectedBucketOwner: String? = null

        constructor(x: GetBucketLocationRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        override fun build(): GetBucketLocationRequest = GetBucketLocationRequest(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder = apply { this.expectedBucketOwner = expectedBucketOwner }
    }
}
