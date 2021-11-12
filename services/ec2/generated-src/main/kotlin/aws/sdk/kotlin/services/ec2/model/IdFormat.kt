// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the ID format for a resource.
 */
class IdFormat private constructor(builder: BuilderImpl) {
    /**
     * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
     */
    val deadline: Instant? = builder.deadline
    /**
     * The type of resource.
     */
    val resource: String? = builder.resource
    /**
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     */
    val useLongIds: Boolean? = builder.useLongIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): IdFormat = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("IdFormat(")
        append("deadline=$deadline,")
        append("resource=$resource,")
        append("useLongIds=$useLongIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deadline?.hashCode() ?: 0
        result = 31 * result + (resource?.hashCode() ?: 0)
        result = 31 * result + (useLongIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IdFormat

        if (deadline != other.deadline) return false
        if (resource != other.resource) return false
        if (useLongIds != other.useLongIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): IdFormat = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): IdFormat
        /**
         * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
         */
        fun deadline(deadline: Instant): FluentBuilder
        /**
         * The type of resource.
         */
        fun resource(resource: String): FluentBuilder
        /**
         * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
         */
        fun useLongIds(useLongIds: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
         */
        var deadline: Instant?
        /**
         * The type of resource.
         */
        var resource: String?
        /**
         * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
         */
        var useLongIds: Boolean?

        fun build(): IdFormat
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var deadline: Instant? = null
        override var resource: String? = null
        override var useLongIds: Boolean? = null

        constructor(x: IdFormat) : this() {
            this.deadline = x.deadline
            this.resource = x.resource
            this.useLongIds = x.useLongIds
        }

        override fun build(): IdFormat = IdFormat(this)
        override fun deadline(deadline: Instant): FluentBuilder = apply { this.deadline = deadline }
        override fun resource(resource: String): FluentBuilder = apply { this.resource = resource }
        override fun useLongIds(useLongIds: Boolean): FluentBuilder = apply { this.useLongIds = useLongIds }
    }
}
