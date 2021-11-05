// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The integrity algorithm for phase 2 IKE negotiations.
 */
class Phase2IntegrityAlgorithmsListValue private constructor(builder: BuilderImpl) {
    /**
     * The integrity algorithm.
     */
    val value: String? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Phase2IntegrityAlgorithmsListValue = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Phase2IntegrityAlgorithmsListValue(")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = value?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Phase2IntegrityAlgorithmsListValue

        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Phase2IntegrityAlgorithmsListValue = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Phase2IntegrityAlgorithmsListValue
        /**
         * The integrity algorithm.
         */
        fun value(value: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The integrity algorithm.
         */
        var value: String?

        fun build(): Phase2IntegrityAlgorithmsListValue
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var value: String? = null

        constructor(x: Phase2IntegrityAlgorithmsListValue) : this() {
            this.value = x.value
        }

        override fun build(): Phase2IntegrityAlgorithmsListValue = Phase2IntegrityAlgorithmsListValue(this)
        override fun value(value: String): FluentBuilder = apply { this.value = value }
    }
}
