// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The container element for specifying the default Object Lock retention settings for new
 * objects placed in the specified bucket.
 * The DefaultRetention settings require both a mode and a
 * period.
 * The DefaultRetention period can be either Days
 * or Years but you must select one. You cannot specify Days
 * and Years at the same time.
 */
class DefaultRetention private constructor(builder: BuilderImpl) {
    /**
     * The number of days that you want to specify for the default retention period. Must be
     * used with Mode.
     */
    val days: Int = builder.days
    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the
     * specified bucket. Must be used with either Days or Years.
     */
    val mode: ObjectLockRetentionMode? = builder.mode
    /**
     * The number of years that you want to specify for the default retention period. Must be
     * used with Mode.
     */
    val years: Int = builder.years

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DefaultRetention = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DefaultRetention(")
        append("days=$days,")
        append("mode=$mode,")
        append("years=$years)")
    }

    override fun hashCode(): kotlin.Int {
        var result = days
        result = 31 * result + (mode?.hashCode() ?: 0)
        result = 31 * result + (years)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DefaultRetention

        if (days != other.days) return false
        if (mode != other.mode) return false
        if (years != other.years) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DefaultRetention = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DefaultRetention
        /**
         * The number of days that you want to specify for the default retention period. Must be
         * used with Mode.
         */
        fun days(days: Int): FluentBuilder
        /**
         * The default Object Lock retention mode you want to apply to new objects placed in the
         * specified bucket. Must be used with either Days or Years.
         */
        fun mode(mode: ObjectLockRetentionMode): FluentBuilder
        /**
         * The number of years that you want to specify for the default retention period. Must be
         * used with Mode.
         */
        fun years(years: Int): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The number of days that you want to specify for the default retention period. Must be
         * used with Mode.
         */
        var days: Int
        /**
         * The default Object Lock retention mode you want to apply to new objects placed in the
         * specified bucket. Must be used with either Days or Years.
         */
        var mode: ObjectLockRetentionMode?
        /**
         * The number of years that you want to specify for the default retention period. Must be
         * used with Mode.
         */
        var years: Int

        fun build(): DefaultRetention
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var days: Int = 0
        override var mode: ObjectLockRetentionMode? = null
        override var years: Int = 0

        constructor(x: DefaultRetention) : this() {
            this.days = x.days
            this.mode = x.mode
            this.years = x.years
        }

        override fun build(): DefaultRetention = DefaultRetention(this)
        override fun days(days: Int): FluentBuilder = apply { this.days = days }
        override fun mode(mode: ObjectLockRetentionMode): FluentBuilder = apply { this.mode = mode }
        override fun years(years: Int): FluentBuilder = apply { this.years = years }
    }
}
