// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteVpnGatewayResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteVpnGatewayResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpnGatewayResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteVpnGatewayResponse

        return true
    }

    interface FluentBuilder {
        fun build(): DeleteVpnGatewayResponse
    }

    interface DslBuilder {

        fun build(): DeleteVpnGatewayResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DeleteVpnGatewayResponse) : this() {
        }

        override fun build(): DeleteVpnGatewayResponse = DeleteVpnGatewayResponse(this)
    }
}
