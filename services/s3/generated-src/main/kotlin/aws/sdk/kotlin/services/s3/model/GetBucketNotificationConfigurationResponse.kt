// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for specifying the notification configuration of the bucket. If this element
 * is empty, notifications are turned off for the bucket.
 */
class GetBucketNotificationConfigurationResponse private constructor(builder: BuilderImpl) {
    /**
     * Describes the Lambda functions to invoke and the events for which to invoke
     * them.
     */
    val lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>? = builder.lambdaFunctionConfigurations
    /**
     * The Amazon Simple Queue Service queues to publish messages to and the events for which
     * to publish messages.
     */
    val queueConfigurations: List<QueueConfiguration>? = builder.queueConfigurations
    /**
     * The topic to which notifications are sent and the events for which notifications are
     * generated.
     */
    val topicConfigurations: List<TopicConfiguration>? = builder.topicConfigurations

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketNotificationConfigurationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketNotificationConfigurationResponse(")
        append("lambdaFunctionConfigurations=$lambdaFunctionConfigurations,")
        append("queueConfigurations=$queueConfigurations,")
        append("topicConfigurations=$topicConfigurations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = lambdaFunctionConfigurations?.hashCode() ?: 0
        result = 31 * result + (queueConfigurations?.hashCode() ?: 0)
        result = 31 * result + (topicConfigurations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBucketNotificationConfigurationResponse

        if (lambdaFunctionConfigurations != other.lambdaFunctionConfigurations) return false
        if (queueConfigurations != other.queueConfigurations) return false
        if (topicConfigurations != other.topicConfigurations) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketNotificationConfigurationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketNotificationConfigurationResponse
        /**
         * Describes the Lambda functions to invoke and the events for which to invoke
         * them.
         */
        fun lambdaFunctionConfigurations(lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>): FluentBuilder
        /**
         * The Amazon Simple Queue Service queues to publish messages to and the events for which
         * to publish messages.
         */
        fun queueConfigurations(queueConfigurations: List<QueueConfiguration>): FluentBuilder
        /**
         * The topic to which notifications are sent and the events for which notifications are
         * generated.
         */
        fun topicConfigurations(topicConfigurations: List<TopicConfiguration>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Describes the Lambda functions to invoke and the events for which to invoke
         * them.
         */
        var lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>?
        /**
         * The Amazon Simple Queue Service queues to publish messages to and the events for which
         * to publish messages.
         */
        var queueConfigurations: List<QueueConfiguration>?
        /**
         * The topic to which notifications are sent and the events for which notifications are
         * generated.
         */
        var topicConfigurations: List<TopicConfiguration>?

        fun build(): GetBucketNotificationConfigurationResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>? = null
        override var queueConfigurations: List<QueueConfiguration>? = null
        override var topicConfigurations: List<TopicConfiguration>? = null

        constructor(x: GetBucketNotificationConfigurationResponse) : this() {
            this.lambdaFunctionConfigurations = x.lambdaFunctionConfigurations
            this.queueConfigurations = x.queueConfigurations
            this.topicConfigurations = x.topicConfigurations
        }

        override fun build(): GetBucketNotificationConfigurationResponse = GetBucketNotificationConfigurationResponse(this)
        override fun lambdaFunctionConfigurations(lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>): FluentBuilder = apply { this.lambdaFunctionConfigurations = lambdaFunctionConfigurations }
        override fun queueConfigurations(queueConfigurations: List<QueueConfiguration>): FluentBuilder = apply { this.queueConfigurations = queueConfigurations }
        override fun topicConfigurations(topicConfigurations: List<TopicConfiguration>): FluentBuilder = apply { this.topicConfigurations = topicConfigurations }
    }
}
