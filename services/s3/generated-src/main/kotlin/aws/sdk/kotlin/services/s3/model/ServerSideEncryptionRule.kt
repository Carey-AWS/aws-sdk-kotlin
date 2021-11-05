// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the default server-side encryption configuration.
 */
class ServerSideEncryptionRule private constructor(builder: BuilderImpl) {
    /**
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a
     * PUT Object request doesn't specify any server-side encryption, this default encryption will
     * be applied.
     */
    val applyServerSideEncryptionByDefault: ServerSideEncryptionByDefault? = builder.applyServerSideEncryptionByDefault
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys in the Amazon S3 User Guide.
     */
    val bucketKeyEnabled: Boolean = builder.bucketKeyEnabled

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ServerSideEncryptionRule = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ServerSideEncryptionRule(")
        append("applyServerSideEncryptionByDefault=$applyServerSideEncryptionByDefault,")
        append("bucketKeyEnabled=$bucketKeyEnabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = applyServerSideEncryptionByDefault?.hashCode() ?: 0
        result = 31 * result + (bucketKeyEnabled.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ServerSideEncryptionRule

        if (applyServerSideEncryptionByDefault != other.applyServerSideEncryptionByDefault) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ServerSideEncryptionRule = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ServerSideEncryptionRule
        /**
         * Specifies the default server-side encryption to apply to new objects in the bucket. If a
         * PUT Object request doesn't specify any server-side encryption, this default encryption will
         * be applied.
         */
        fun applyServerSideEncryptionByDefault(applyServerSideEncryptionByDefault: ServerSideEncryptionByDefault): FluentBuilder
        /**
         * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
         * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys in the Amazon S3 User Guide.
         */
        fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Specifies the default server-side encryption to apply to new objects in the bucket. If a
         * PUT Object request doesn't specify any server-side encryption, this default encryption will
         * be applied.
         */
        var applyServerSideEncryptionByDefault: ServerSideEncryptionByDefault?
        /**
         * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the BucketKeyEnabled element to true causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
         * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys in the Amazon S3 User Guide.
         */
        var bucketKeyEnabled: Boolean

        fun build(): ServerSideEncryptionRule
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ServerSideEncryptionByDefault] inside the given [block]
         */
        fun applyServerSideEncryptionByDefault(block: ServerSideEncryptionByDefault.DslBuilder.() -> kotlin.Unit) {
            this.applyServerSideEncryptionByDefault = ServerSideEncryptionByDefault.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var applyServerSideEncryptionByDefault: ServerSideEncryptionByDefault? = null
        override var bucketKeyEnabled: Boolean = false

        constructor(x: ServerSideEncryptionRule) : this() {
            this.applyServerSideEncryptionByDefault = x.applyServerSideEncryptionByDefault
            this.bucketKeyEnabled = x.bucketKeyEnabled
        }

        override fun build(): ServerSideEncryptionRule = ServerSideEncryptionRule(this)
        override fun applyServerSideEncryptionByDefault(applyServerSideEncryptionByDefault: ServerSideEncryptionByDefault): FluentBuilder = apply { this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault }
        override fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder = apply { this.bucketKeyEnabled = bucketKeyEnabled }
    }
}
