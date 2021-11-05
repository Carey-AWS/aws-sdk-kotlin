// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The tags for a Spot Fleet resource.
 */
class SpotFleetTagSpecification private constructor(builder: BuilderImpl) {
    /**
     * The type of resource. Currently, the only resource type that is supported is
     * instance. To tag the Spot Fleet request on creation, use the
     * TagSpecifications parameter in <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
     * SpotFleetRequestConfigData
     * .
     */
    val resourceType: ResourceType? = builder.resourceType
    /**
     * The tags.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SpotFleetTagSpecification = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SpotFleetTagSpecification(")
        append("resourceType=$resourceType,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceType?.hashCode() ?: 0
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SpotFleetTagSpecification

        if (resourceType != other.resourceType) return false
        if (tags != other.tags) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): SpotFleetTagSpecification = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): SpotFleetTagSpecification
        /**
         * The type of resource. Currently, the only resource type that is supported is
         * instance. To tag the Spot Fleet request on creation, use the
         * TagSpecifications parameter in <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
         * SpotFleetRequestConfigData
         * .
         */
        fun resourceType(resourceType: ResourceType): FluentBuilder
        /**
         * The tags.
         */
        fun tags(tags: List<Tag>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The type of resource. Currently, the only resource type that is supported is
         * instance. To tag the Spot Fleet request on creation, use the
         * TagSpecifications parameter in <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html">
         * SpotFleetRequestConfigData
         * .
         */
        var resourceType: ResourceType?
        /**
         * The tags.
         */
        var tags: List<Tag>?

        fun build(): SpotFleetTagSpecification
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var resourceType: ResourceType? = null
        override var tags: List<Tag>? = null

        constructor(x: SpotFleetTagSpecification) : this() {
            this.resourceType = x.resourceType
            this.tags = x.tags
        }

        override fun build(): SpotFleetTagSpecification = SpotFleetTagSpecification(this)
        override fun resourceType(resourceType: ResourceType): FluentBuilder = apply { this.resourceType = resourceType }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
    }
}
