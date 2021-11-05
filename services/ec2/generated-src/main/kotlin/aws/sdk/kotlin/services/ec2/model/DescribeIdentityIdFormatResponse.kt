// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIdentityIdFormatResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the ID format for the resources.
     */
    val statuses: List<IdFormat>? = builder.statuses

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeIdentityIdFormatResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIdentityIdFormatResponse(")
        append("statuses=$statuses)")
    }

    override fun hashCode(): kotlin.Int {
        var result = statuses?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeIdentityIdFormatResponse

        if (statuses != other.statuses) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeIdentityIdFormatResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeIdentityIdFormatResponse
        /**
         * Information about the ID format for the resources.
         */
        fun statuses(statuses: List<IdFormat>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the ID format for the resources.
         */
        var statuses: List<IdFormat>?

        fun build(): DescribeIdentityIdFormatResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var statuses: List<IdFormat>? = null

        constructor(x: DescribeIdentityIdFormatResponse) : this() {
            this.statuses = x.statuses
        }

        override fun build(): DescribeIdentityIdFormatResponse = DescribeIdentityIdFormatResponse(this)
        override fun statuses(statuses: List<IdFormat>): FluentBuilder = apply { this.statuses = statuses }
    }
}
