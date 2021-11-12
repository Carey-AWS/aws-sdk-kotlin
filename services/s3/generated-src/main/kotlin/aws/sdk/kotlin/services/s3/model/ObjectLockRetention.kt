// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * A Retention configuration for an object.
 */
class ObjectLockRetention private constructor(builder: BuilderImpl) {
    /**
     * Indicates the Retention mode for the specified object.
     */
    val mode: ObjectLockRetentionMode? = builder.mode
    /**
     * The date on which this Object Lock Retention will expire.
     */
    val retainUntilDate: Instant? = builder.retainUntilDate

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ObjectLockRetention = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ObjectLockRetention(")
        append("mode=$mode,")
        append("retainUntilDate=$retainUntilDate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = mode?.hashCode() ?: 0
        result = 31 * result + (retainUntilDate?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ObjectLockRetention

        if (mode != other.mode) return false
        if (retainUntilDate != other.retainUntilDate) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ObjectLockRetention = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ObjectLockRetention
        /**
         * Indicates the Retention mode for the specified object.
         */
        fun mode(mode: ObjectLockRetentionMode): FluentBuilder
        /**
         * The date on which this Object Lock Retention will expire.
         */
        fun retainUntilDate(retainUntilDate: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Indicates the Retention mode for the specified object.
         */
        var mode: ObjectLockRetentionMode?
        /**
         * The date on which this Object Lock Retention will expire.
         */
        var retainUntilDate: Instant?

        fun build(): ObjectLockRetention
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var mode: ObjectLockRetentionMode? = null
        override var retainUntilDate: Instant? = null

        constructor(x: ObjectLockRetention) : this() {
            this.mode = x.mode
            this.retainUntilDate = x.retainUntilDate
        }

        override fun build(): ObjectLockRetention = ObjectLockRetention(this)
        override fun mode(mode: ObjectLockRetentionMode): FluentBuilder = apply { this.mode = mode }
        override fun retainUntilDate(retainUntilDate: Instant): FluentBuilder = apply { this.retainUntilDate = retainUntilDate }
    }
}
