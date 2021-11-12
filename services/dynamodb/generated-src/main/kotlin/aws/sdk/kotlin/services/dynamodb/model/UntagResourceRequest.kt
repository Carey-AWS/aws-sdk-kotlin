// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class UntagResourceRequest private constructor(builder: BuilderImpl) {
    /**
     * The DynamoDB resource that the tags will be removed from. This value is an Amazon
     * Resource Name (ARN).
     */
    val resourceArn: String? = builder.resourceArn
    /**
     * A list of tag keys. Existing tags of the resource whose keys are members of this list
     * will be removed from the DynamoDB resource.
     */
    val tagKeys: List<String>? = builder.tagKeys

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): UntagResourceRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("UntagResourceRequest(")
        append("resourceArn=$resourceArn,")
        append("tagKeys=$tagKeys)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceArn?.hashCode() ?: 0
        result = 31 * result + (tagKeys?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UntagResourceRequest

        if (resourceArn != other.resourceArn) return false
        if (tagKeys != other.tagKeys) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): UntagResourceRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): UntagResourceRequest
        /**
         * The DynamoDB resource that the tags will be removed from. This value is an Amazon
         * Resource Name (ARN).
         */
        fun resourceArn(resourceArn: String): FluentBuilder
        /**
         * A list of tag keys. Existing tags of the resource whose keys are members of this list
         * will be removed from the DynamoDB resource.
         */
        fun tagKeys(tagKeys: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The DynamoDB resource that the tags will be removed from. This value is an Amazon
         * Resource Name (ARN).
         */
        var resourceArn: String?
        /**
         * A list of tag keys. Existing tags of the resource whose keys are members of this list
         * will be removed from the DynamoDB resource.
         */
        var tagKeys: List<String>?

        fun build(): UntagResourceRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var resourceArn: String? = null
        override var tagKeys: List<String>? = null

        constructor(x: UntagResourceRequest) : this() {
            this.resourceArn = x.resourceArn
            this.tagKeys = x.tagKeys
        }

        override fun build(): UntagResourceRequest = UntagResourceRequest(this)
        override fun resourceArn(resourceArn: String): FluentBuilder = apply { this.resourceArn = resourceArn }
        override fun tagKeys(tagKeys: List<String>): FluentBuilder = apply { this.tagKeys = tagKeys }
    }
}
