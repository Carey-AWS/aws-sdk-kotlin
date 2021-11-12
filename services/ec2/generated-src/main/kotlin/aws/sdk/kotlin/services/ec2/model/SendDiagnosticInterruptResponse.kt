// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class SendDiagnosticInterruptResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SendDiagnosticInterruptResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SendDiagnosticInterruptResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SendDiagnosticInterruptResponse

        return true
    }

    interface FluentBuilder {
        fun build(): SendDiagnosticInterruptResponse
    }

    interface DslBuilder {

        fun build(): SendDiagnosticInterruptResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: SendDiagnosticInterruptResponse) : this() {
        }

        override fun build(): SendDiagnosticInterruptResponse = SendDiagnosticInterruptResponse(this)
    }
}
