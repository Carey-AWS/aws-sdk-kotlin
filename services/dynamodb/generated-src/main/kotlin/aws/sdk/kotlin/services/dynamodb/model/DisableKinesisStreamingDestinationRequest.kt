// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DisableKinesisStreamingDestinationRequest private constructor(builder: BuilderImpl) {
    /**
     * The ARN for a Kinesis data stream.
     */
    val streamArn: String? = builder.streamArn
    /**
     * The name of the DynamoDB table.
     */
    val tableName: String? = builder.tableName

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisableKinesisStreamingDestinationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisableKinesisStreamingDestinationRequest(")
        append("streamArn=$streamArn,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = streamArn?.hashCode() ?: 0
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisableKinesisStreamingDestinationRequest

        if (streamArn != other.streamArn) return false
        if (tableName != other.tableName) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisableKinesisStreamingDestinationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisableKinesisStreamingDestinationRequest
        /**
         * The ARN for a Kinesis data stream.
         */
        fun streamArn(streamArn: String): FluentBuilder
        /**
         * The name of the DynamoDB table.
         */
        fun tableName(tableName: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ARN for a Kinesis data stream.
         */
        var streamArn: String?
        /**
         * The name of the DynamoDB table.
         */
        var tableName: String?

        fun build(): DisableKinesisStreamingDestinationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var streamArn: String? = null
        override var tableName: String? = null

        constructor(x: DisableKinesisStreamingDestinationRequest) : this() {
            this.streamArn = x.streamArn
            this.tableName = x.tableName
        }

        override fun build(): DisableKinesisStreamingDestinationRequest = DisableKinesisStreamingDestinationRequest(this)
        override fun streamArn(streamArn: String): FluentBuilder = apply { this.streamArn = streamArn }
        override fun tableName(tableName: String): FluentBuilder = apply { this.tableName = tableName }
    }
}
