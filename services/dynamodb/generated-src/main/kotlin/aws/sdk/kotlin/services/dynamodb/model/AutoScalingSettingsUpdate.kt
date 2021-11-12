// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the auto scaling settings to be modified for a global table or global
 * secondary index.
 */
class AutoScalingSettingsUpdate private constructor(builder: BuilderImpl) {
    /**
     * Disabled auto scaling for this global table or global secondary index.
     */
    val autoScalingDisabled: Boolean? = builder.autoScalingDisabled
    /**
     * Role ARN used for configuring auto scaling policy.
     */
    val autoScalingRoleArn: String? = builder.autoScalingRoleArn
    /**
     * The maximum capacity units that a global table or global secondary index should be scaled up to.
     */
    val maximumUnits: Long? = builder.maximumUnits
    /**
     * The minimum capacity units that a global table or global secondary index should be scaled down to.
     */
    val minimumUnits: Long? = builder.minimumUnits
    /**
     * The scaling policy to apply for scaling target global table or global secondary index capacity units.
     */
    val scalingPolicyUpdate: AutoScalingPolicyUpdate? = builder.scalingPolicyUpdate

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AutoScalingSettingsUpdate = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AutoScalingSettingsUpdate(")
        append("autoScalingDisabled=$autoScalingDisabled,")
        append("autoScalingRoleArn=$autoScalingRoleArn,")
        append("maximumUnits=$maximumUnits,")
        append("minimumUnits=$minimumUnits,")
        append("scalingPolicyUpdate=$scalingPolicyUpdate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = autoScalingDisabled?.hashCode() ?: 0
        result = 31 * result + (autoScalingRoleArn?.hashCode() ?: 0)
        result = 31 * result + (maximumUnits?.hashCode() ?: 0)
        result = 31 * result + (minimumUnits?.hashCode() ?: 0)
        result = 31 * result + (scalingPolicyUpdate?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AutoScalingSettingsUpdate

        if (autoScalingDisabled != other.autoScalingDisabled) return false
        if (autoScalingRoleArn != other.autoScalingRoleArn) return false
        if (maximumUnits != other.maximumUnits) return false
        if (minimumUnits != other.minimumUnits) return false
        if (scalingPolicyUpdate != other.scalingPolicyUpdate) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AutoScalingSettingsUpdate = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AutoScalingSettingsUpdate
        /**
         * Disabled auto scaling for this global table or global secondary index.
         */
        fun autoScalingDisabled(autoScalingDisabled: Boolean): FluentBuilder
        /**
         * Role ARN used for configuring auto scaling policy.
         */
        fun autoScalingRoleArn(autoScalingRoleArn: String): FluentBuilder
        /**
         * The maximum capacity units that a global table or global secondary index should be scaled up to.
         */
        fun maximumUnits(maximumUnits: Long): FluentBuilder
        /**
         * The minimum capacity units that a global table or global secondary index should be scaled down to.
         */
        fun minimumUnits(minimumUnits: Long): FluentBuilder
        /**
         * The scaling policy to apply for scaling target global table or global secondary index capacity units.
         */
        fun scalingPolicyUpdate(scalingPolicyUpdate: AutoScalingPolicyUpdate): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Disabled auto scaling for this global table or global secondary index.
         */
        var autoScalingDisabled: Boolean?
        /**
         * Role ARN used for configuring auto scaling policy.
         */
        var autoScalingRoleArn: String?
        /**
         * The maximum capacity units that a global table or global secondary index should be scaled up to.
         */
        var maximumUnits: Long?
        /**
         * The minimum capacity units that a global table or global secondary index should be scaled down to.
         */
        var minimumUnits: Long?
        /**
         * The scaling policy to apply for scaling target global table or global secondary index capacity units.
         */
        var scalingPolicyUpdate: AutoScalingPolicyUpdate?

        fun build(): AutoScalingSettingsUpdate
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingPolicyUpdate] inside the given [block]
         */
        fun scalingPolicyUpdate(block: AutoScalingPolicyUpdate.DslBuilder.() -> kotlin.Unit) {
            this.scalingPolicyUpdate = AutoScalingPolicyUpdate.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var autoScalingDisabled: Boolean? = null
        override var autoScalingRoleArn: String? = null
        override var maximumUnits: Long? = null
        override var minimumUnits: Long? = null
        override var scalingPolicyUpdate: AutoScalingPolicyUpdate? = null

        constructor(x: AutoScalingSettingsUpdate) : this() {
            this.autoScalingDisabled = x.autoScalingDisabled
            this.autoScalingRoleArn = x.autoScalingRoleArn
            this.maximumUnits = x.maximumUnits
            this.minimumUnits = x.minimumUnits
            this.scalingPolicyUpdate = x.scalingPolicyUpdate
        }

        override fun build(): AutoScalingSettingsUpdate = AutoScalingSettingsUpdate(this)
        override fun autoScalingDisabled(autoScalingDisabled: Boolean): FluentBuilder = apply { this.autoScalingDisabled = autoScalingDisabled }
        override fun autoScalingRoleArn(autoScalingRoleArn: String): FluentBuilder = apply { this.autoScalingRoleArn = autoScalingRoleArn }
        override fun maximumUnits(maximumUnits: Long): FluentBuilder = apply { this.maximumUnits = maximumUnits }
        override fun minimumUnits(minimumUnits: Long): FluentBuilder = apply { this.minimumUnits = minimumUnits }
        override fun scalingPolicyUpdate(scalingPolicyUpdate: AutoScalingPolicyUpdate): FluentBuilder = apply { this.scalingPolicyUpdate = scalingPolicyUpdate }
    }
}
