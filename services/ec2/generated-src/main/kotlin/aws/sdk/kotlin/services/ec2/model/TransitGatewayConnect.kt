// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a transit gateway Connect attachment.
 */
class TransitGatewayConnect private constructor(builder: BuilderImpl) {
    /**
     * The creation time.
     */
    val creationTime: Instant? = builder.creationTime
    /**
     * The Connect attachment options.
     */
    val options: TransitGatewayConnectOptions? = builder.options
    /**
     * The state of the attachment.
     */
    val state: TransitGatewayAttachmentState? = builder.state
    /**
     * The tags for the attachment.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the Connect attachment.
     */
    val transitGatewayAttachmentId: String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway.
     */
    val transitGatewayId: String? = builder.transitGatewayId
    /**
     * The ID of the attachment from which the Connect attachment was created.
     */
    val transportTransitGatewayAttachmentId: String? = builder.transportTransitGatewayAttachmentId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TransitGatewayConnect = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayConnect(")
        append("creationTime=$creationTime,")
        append("options=$options,")
        append("state=$state,")
        append("tags=$tags,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayId=$transitGatewayId,")
        append("transportTransitGatewayAttachmentId=$transportTransitGatewayAttachmentId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = creationTime?.hashCode() ?: 0
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (transportTransitGatewayAttachmentId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TransitGatewayConnect

        if (creationTime != other.creationTime) return false
        if (options != other.options) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (transportTransitGatewayAttachmentId != other.transportTransitGatewayAttachmentId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TransitGatewayConnect = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TransitGatewayConnect
        /**
         * The creation time.
         */
        fun creationTime(creationTime: Instant): FluentBuilder
        /**
         * The Connect attachment options.
         */
        fun options(options: TransitGatewayConnectOptions): FluentBuilder
        /**
         * The state of the attachment.
         */
        fun state(state: TransitGatewayAttachmentState): FluentBuilder
        /**
         * The tags for the attachment.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * The ID of the Connect attachment.
         */
        fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder
        /**
         * The ID of the transit gateway.
         */
        fun transitGatewayId(transitGatewayId: String): FluentBuilder
        /**
         * The ID of the attachment from which the Connect attachment was created.
         */
        fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The creation time.
         */
        var creationTime: Instant?
        /**
         * The Connect attachment options.
         */
        var options: TransitGatewayConnectOptions?
        /**
         * The state of the attachment.
         */
        var state: TransitGatewayAttachmentState?
        /**
         * The tags for the attachment.
         */
        var tags: List<Tag>?
        /**
         * The ID of the Connect attachment.
         */
        var transitGatewayAttachmentId: String?
        /**
         * The ID of the transit gateway.
         */
        var transitGatewayId: String?
        /**
         * The ID of the attachment from which the Connect attachment was created.
         */
        var transportTransitGatewayAttachmentId: String?

        fun build(): TransitGatewayConnect
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectOptions] inside the given [block]
         */
        fun options(block: TransitGatewayConnectOptions.DslBuilder.() -> kotlin.Unit) {
            this.options = TransitGatewayConnectOptions.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var creationTime: Instant? = null
        override var options: TransitGatewayConnectOptions? = null
        override var state: TransitGatewayAttachmentState? = null
        override var tags: List<Tag>? = null
        override var transitGatewayAttachmentId: String? = null
        override var transitGatewayId: String? = null
        override var transportTransitGatewayAttachmentId: String? = null

        constructor(x: TransitGatewayConnect) : this() {
            this.creationTime = x.creationTime
            this.options = x.options
            this.state = x.state
            this.tags = x.tags
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayId = x.transitGatewayId
            this.transportTransitGatewayAttachmentId = x.transportTransitGatewayAttachmentId
        }

        override fun build(): TransitGatewayConnect = TransitGatewayConnect(this)
        override fun creationTime(creationTime: Instant): FluentBuilder = apply { this.creationTime = creationTime }
        override fun options(options: TransitGatewayConnectOptions): FluentBuilder = apply { this.options = options }
        override fun state(state: TransitGatewayAttachmentState): FluentBuilder = apply { this.state = state }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder = apply { this.transitGatewayAttachmentId = transitGatewayAttachmentId }
        override fun transitGatewayId(transitGatewayId: String): FluentBuilder = apply { this.transitGatewayId = transitGatewayId }
        override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String): FluentBuilder = apply { this.transportTransitGatewayAttachmentId = transportTransitGatewayAttachmentId }
    }
}
