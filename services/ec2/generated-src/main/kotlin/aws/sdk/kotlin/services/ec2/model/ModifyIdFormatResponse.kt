// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIdFormatResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyIdFormatResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIdFormatResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyIdFormatResponse

        return true
    }

    interface FluentBuilder {
        fun build(): ModifyIdFormatResponse
    }

    interface DslBuilder {

        fun build(): ModifyIdFormatResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: ModifyIdFormatResponse) : this() {
        }

        override fun build(): ModifyIdFormatResponse = ModifyIdFormatResponse(this)
    }
}
