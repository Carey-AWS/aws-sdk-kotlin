// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the configuration settings for the modified Reserved Instances.
 */
class ReservedInstancesConfiguration private constructor(builder: BuilderImpl) {
    /**
     * The Availability Zone for the modified Reserved Instances.
     */
    val availabilityZone: String? = builder.availabilityZone
    /**
     * The number of modified Reserved Instances.
     * This is a required field for a request.
     */
    val instanceCount: Int? = builder.instanceCount
    /**
     * The instance type for the modified Reserved Instances.
     */
    val instanceType: InstanceType? = builder.instanceType
    /**
     * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     */
    val platform: String? = builder.platform
    /**
     * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
     */
    val scope: Scope? = builder.scope

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReservedInstancesConfiguration = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReservedInstancesConfiguration(")
        append("availabilityZone=$availabilityZone,")
        append("instanceCount=$instanceCount,")
        append("instanceType=$instanceType,")
        append("platform=$platform,")
        append("scope=$scope)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (instanceCount ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (platform?.hashCode() ?: 0)
        result = 31 * result + (scope?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReservedInstancesConfiguration

        if (availabilityZone != other.availabilityZone) return false
        if (instanceCount != other.instanceCount) return false
        if (instanceType != other.instanceType) return false
        if (platform != other.platform) return false
        if (scope != other.scope) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReservedInstancesConfiguration = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReservedInstancesConfiguration
        /**
         * The Availability Zone for the modified Reserved Instances.
         */
        fun availabilityZone(availabilityZone: String): FluentBuilder
        /**
         * The number of modified Reserved Instances.
         * This is a required field for a request.
         */
        fun instanceCount(instanceCount: Int): FluentBuilder
        /**
         * The instance type for the modified Reserved Instances.
         */
        fun instanceType(instanceType: InstanceType): FluentBuilder
        /**
         * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
         */
        fun platform(platform: String): FluentBuilder
        /**
         * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
         */
        fun scope(scope: Scope): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Availability Zone for the modified Reserved Instances.
         */
        var availabilityZone: String?
        /**
         * The number of modified Reserved Instances.
         * This is a required field for a request.
         */
        var instanceCount: Int?
        /**
         * The instance type for the modified Reserved Instances.
         */
        var instanceType: InstanceType?
        /**
         * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
         */
        var platform: String?
        /**
         * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
         */
        var scope: Scope?

        fun build(): ReservedInstancesConfiguration
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var availabilityZone: String? = null
        override var instanceCount: Int? = null
        override var instanceType: InstanceType? = null
        override var platform: String? = null
        override var scope: Scope? = null

        constructor(x: ReservedInstancesConfiguration) : this() {
            this.availabilityZone = x.availabilityZone
            this.instanceCount = x.instanceCount
            this.instanceType = x.instanceType
            this.platform = x.platform
            this.scope = x.scope
        }

        override fun build(): ReservedInstancesConfiguration = ReservedInstancesConfiguration(this)
        override fun availabilityZone(availabilityZone: String): FluentBuilder = apply { this.availabilityZone = availabilityZone }
        override fun instanceCount(instanceCount: Int): FluentBuilder = apply { this.instanceCount = instanceCount }
        override fun instanceType(instanceType: InstanceType): FluentBuilder = apply { this.instanceType = instanceType }
        override fun platform(platform: String): FluentBuilder = apply { this.platform = platform }
        override fun scope(scope: Scope): FluentBuilder = apply { this.scope = scope }
    }
}
