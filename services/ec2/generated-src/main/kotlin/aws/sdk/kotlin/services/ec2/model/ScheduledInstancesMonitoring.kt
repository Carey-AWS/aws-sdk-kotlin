// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes whether monitoring is enabled for a Scheduled Instance.
 */
class ScheduledInstancesMonitoring private constructor(builder: BuilderImpl) {
    /**
     * Indicates whether monitoring is enabled.
     */
    val enabled: Boolean? = builder.enabled

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ScheduledInstancesMonitoring = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ScheduledInstancesMonitoring(")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ScheduledInstancesMonitoring

        if (enabled != other.enabled) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ScheduledInstancesMonitoring = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ScheduledInstancesMonitoring
        /**
         * Indicates whether monitoring is enabled.
         */
        fun enabled(enabled: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Indicates whether monitoring is enabled.
         */
        var enabled: Boolean?

        fun build(): ScheduledInstancesMonitoring
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var enabled: Boolean? = null

        constructor(x: ScheduledInstancesMonitoring) : this() {
            this.enabled = x.enabled
        }

        override fun build(): ScheduledInstancesMonitoring = ScheduledInstancesMonitoring(this)
        override fun enabled(enabled: Boolean): FluentBuilder = apply { this.enabled = enabled }
    }
}
