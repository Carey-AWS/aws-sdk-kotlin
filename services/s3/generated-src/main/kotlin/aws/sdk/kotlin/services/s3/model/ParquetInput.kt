// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for Parquet.
 */
class ParquetInput private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ParquetInput = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ParquetInput(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ParquetInput

        return true
    }

    interface FluentBuilder {
        fun build(): ParquetInput
    }

    interface DslBuilder {

        fun build(): ParquetInput
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: ParquetInput) : this() {
        }

        override fun build(): ParquetInput = ParquetInput(this)
    }
}
