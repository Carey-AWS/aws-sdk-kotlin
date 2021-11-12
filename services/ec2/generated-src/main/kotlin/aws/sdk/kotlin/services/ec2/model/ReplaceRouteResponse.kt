// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceRouteResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplaceRouteResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceRouteResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplaceRouteResponse

        return true
    }

    interface FluentBuilder {
        fun build(): ReplaceRouteResponse
    }

    interface DslBuilder {

        fun build(): ReplaceRouteResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: ReplaceRouteResponse) : this() {
        }

        override fun build(): ReplaceRouteResponse = ReplaceRouteResponse(this)
    }
}
