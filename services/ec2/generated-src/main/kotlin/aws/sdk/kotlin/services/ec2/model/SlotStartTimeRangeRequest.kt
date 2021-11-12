// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the time period for a Scheduled Instance to start its first schedule.
 */
class SlotStartTimeRangeRequest private constructor(builder: BuilderImpl) {
    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     */
    val earliestTime: Instant? = builder.earliestTime
    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     */
    val latestTime: Instant? = builder.latestTime

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SlotStartTimeRangeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SlotStartTimeRangeRequest(")
        append("earliestTime=$earliestTime,")
        append("latestTime=$latestTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = earliestTime?.hashCode() ?: 0
        result = 31 * result + (latestTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SlotStartTimeRangeRequest

        if (earliestTime != other.earliestTime) return false
        if (latestTime != other.latestTime) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): SlotStartTimeRangeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): SlotStartTimeRangeRequest
        /**
         * The earliest date and time, in UTC, for the Scheduled Instance to start.
         */
        fun earliestTime(earliestTime: Instant): FluentBuilder
        /**
         * The latest date and time, in UTC, for the Scheduled Instance to start.
         */
        fun latestTime(latestTime: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The earliest date and time, in UTC, for the Scheduled Instance to start.
         */
        var earliestTime: Instant?
        /**
         * The latest date and time, in UTC, for the Scheduled Instance to start.
         */
        var latestTime: Instant?

        fun build(): SlotStartTimeRangeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var earliestTime: Instant? = null
        override var latestTime: Instant? = null

        constructor(x: SlotStartTimeRangeRequest) : this() {
            this.earliestTime = x.earliestTime
            this.latestTime = x.latestTime
        }

        override fun build(): SlotStartTimeRangeRequest = SlotStartTimeRangeRequest(this)
        override fun earliestTime(earliestTime: Instant): FluentBuilder = apply { this.earliestTime = earliestTime }
        override fun latestTime(latestTime: Instant): FluentBuilder = apply { this.latestTime = latestTime }
    }
}
