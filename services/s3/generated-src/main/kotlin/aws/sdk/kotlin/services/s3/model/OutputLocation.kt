// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes the location where the restore job's output is stored.
 */
class OutputLocation private constructor(builder: BuilderImpl) {
    /**
     * Describes an S3 location that will receive the results of the restore request.
     */
    val s3: S3Location? = builder.s3

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): OutputLocation = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("OutputLocation(")
        append("s3=$s3)")
    }

    override fun hashCode(): kotlin.Int {
        var result = s3?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OutputLocation

        if (s3 != other.s3) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): OutputLocation = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): OutputLocation
        /**
         * Describes an S3 location that will receive the results of the restore request.
         */
        fun s3(s3: S3Location): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Describes an S3 location that will receive the results of the restore request.
         */
        var s3: S3Location?

        fun build(): OutputLocation
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.S3Location] inside the given [block]
         */
        fun s3(block: S3Location.DslBuilder.() -> kotlin.Unit) {
            this.s3 = S3Location.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var s3: S3Location? = null

        constructor(x: OutputLocation) : this() {
            this.s3 = x.s3
        }

        override fun build(): OutputLocation = OutputLocation(this)
        override fun s3(s3: S3Location): FluentBuilder = apply { this.s3 = s3 }
    }
}
