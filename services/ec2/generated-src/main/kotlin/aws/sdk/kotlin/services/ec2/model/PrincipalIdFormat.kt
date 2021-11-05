// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * PrincipalIdFormat description
 */
class PrincipalIdFormat private constructor(builder: BuilderImpl) {
    /**
     * PrincipalIdFormatARN description
     */
    val arn: String? = builder.arn
    /**
     * PrincipalIdFormatStatuses description
     */
    val statuses: List<IdFormat>? = builder.statuses

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): PrincipalIdFormat = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("PrincipalIdFormat(")
        append("arn=$arn,")
        append("statuses=$statuses)")
    }

    override fun hashCode(): kotlin.Int {
        var result = arn?.hashCode() ?: 0
        result = 31 * result + (statuses?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PrincipalIdFormat

        if (arn != other.arn) return false
        if (statuses != other.statuses) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): PrincipalIdFormat = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): PrincipalIdFormat
        /**
         * PrincipalIdFormatARN description
         */
        fun arn(arn: String): FluentBuilder
        /**
         * PrincipalIdFormatStatuses description
         */
        fun statuses(statuses: List<IdFormat>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * PrincipalIdFormatARN description
         */
        var arn: String?
        /**
         * PrincipalIdFormatStatuses description
         */
        var statuses: List<IdFormat>?

        fun build(): PrincipalIdFormat
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var arn: String? = null
        override var statuses: List<IdFormat>? = null

        constructor(x: PrincipalIdFormat) : this() {
            this.arn = x.arn
            this.statuses = x.statuses
        }

        override fun build(): PrincipalIdFormat = PrincipalIdFormat(this)
        override fun arn(arn: String): FluentBuilder = apply { this.arn = arn }
        override fun statuses(statuses: List<IdFormat>): FluentBuilder = apply { this.statuses = statuses }
    }
}
