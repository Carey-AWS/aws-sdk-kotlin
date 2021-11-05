// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes an event in the history of an EC2 Fleet.
 */
class HistoryRecordEntry private constructor(builder: BuilderImpl) {
    /**
     * Information about the event.
     */
    val eventInformation: EventInformation? = builder.eventInformation
    /**
     * The event type.
     */
    val eventType: FleetEventType? = builder.eventType
    /**
     * The date and time of the event, in UTC format (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     */
    val timestamp: Instant? = builder.timestamp

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): HistoryRecordEntry = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("HistoryRecordEntry(")
        append("eventInformation=$eventInformation,")
        append("eventType=$eventType,")
        append("timestamp=$timestamp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eventInformation?.hashCode() ?: 0
        result = 31 * result + (eventType?.hashCode() ?: 0)
        result = 31 * result + (timestamp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HistoryRecordEntry

        if (eventInformation != other.eventInformation) return false
        if (eventType != other.eventType) return false
        if (timestamp != other.timestamp) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): HistoryRecordEntry = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): HistoryRecordEntry
        /**
         * Information about the event.
         */
        fun eventInformation(eventInformation: EventInformation): FluentBuilder
        /**
         * The event type.
         */
        fun eventType(eventType: FleetEventType): FluentBuilder
        /**
         * The date and time of the event, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         */
        fun timestamp(timestamp: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the event.
         */
        var eventInformation: EventInformation?
        /**
         * The event type.
         */
        var eventType: FleetEventType?
        /**
         * The date and time of the event, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         */
        var timestamp: Instant?

        fun build(): HistoryRecordEntry
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.EventInformation] inside the given [block]
         */
        fun eventInformation(block: EventInformation.DslBuilder.() -> kotlin.Unit) {
            this.eventInformation = EventInformation.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var eventInformation: EventInformation? = null
        override var eventType: FleetEventType? = null
        override var timestamp: Instant? = null

        constructor(x: HistoryRecordEntry) : this() {
            this.eventInformation = x.eventInformation
            this.eventType = x.eventType
            this.timestamp = x.timestamp
        }

        override fun build(): HistoryRecordEntry = HistoryRecordEntry(this)
        override fun eventInformation(eventInformation: EventInformation): FluentBuilder = apply { this.eventInformation = eventInformation }
        override fun eventType(eventType: FleetEventType): FluentBuilder = apply { this.eventType = eventType }
        override fun timestamp(timestamp: Instant): FluentBuilder = apply { this.timestamp = timestamp }
    }
}
