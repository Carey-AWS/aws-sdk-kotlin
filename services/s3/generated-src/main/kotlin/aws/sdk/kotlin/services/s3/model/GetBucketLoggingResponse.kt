// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketLoggingResponse private constructor(builder: BuilderImpl) {
    /**
     * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys
     * for a bucket. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html">PUT Bucket logging in the
     * Amazon S3 API Reference.
     */
    val loggingEnabled: LoggingEnabled? = builder.loggingEnabled

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketLoggingResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketLoggingResponse(")
        append("loggingEnabled=$loggingEnabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = loggingEnabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBucketLoggingResponse

        if (loggingEnabled != other.loggingEnabled) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketLoggingResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketLoggingResponse
        /**
         * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys
         * for a bucket. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html">PUT Bucket logging in the
         * Amazon S3 API Reference.
         */
        fun loggingEnabled(loggingEnabled: LoggingEnabled): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys
         * for a bucket. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html">PUT Bucket logging in the
         * Amazon S3 API Reference.
         */
        var loggingEnabled: LoggingEnabled?

        fun build(): GetBucketLoggingResponse
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.LoggingEnabled] inside the given [block]
         */
        fun loggingEnabled(block: LoggingEnabled.DslBuilder.() -> kotlin.Unit) {
            this.loggingEnabled = LoggingEnabled.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var loggingEnabled: LoggingEnabled? = null

        constructor(x: GetBucketLoggingResponse) : this() {
            this.loggingEnabled = x.loggingEnabled
        }

        override fun build(): GetBucketLoggingResponse = GetBucketLoggingResponse(this)
        override fun loggingEnabled(loggingEnabled: LoggingEnabled): FluentBuilder = apply { this.loggingEnabled = loggingEnabled }
    }
}
