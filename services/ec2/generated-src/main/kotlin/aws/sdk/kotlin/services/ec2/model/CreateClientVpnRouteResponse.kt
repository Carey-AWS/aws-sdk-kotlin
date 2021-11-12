// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateClientVpnRouteResponse private constructor(builder: BuilderImpl) {
    /**
     * The current state of the route.
     */
    val status: ClientVpnRouteStatus? = builder.status

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateClientVpnRouteResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateClientVpnRouteResponse(")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = status?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateClientVpnRouteResponse

        if (status != other.status) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateClientVpnRouteResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateClientVpnRouteResponse
        /**
         * The current state of the route.
         */
        fun status(status: ClientVpnRouteStatus): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The current state of the route.
         */
        var status: ClientVpnRouteStatus?

        fun build(): CreateClientVpnRouteResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatus] inside the given [block]
         */
        fun status(block: ClientVpnRouteStatus.DslBuilder.() -> kotlin.Unit) {
            this.status = ClientVpnRouteStatus.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var status: ClientVpnRouteStatus? = null

        constructor(x: CreateClientVpnRouteResponse) : this() {
            this.status = x.status
        }

        override fun build(): CreateClientVpnRouteResponse = CreateClientVpnRouteResponse(this)
        override fun status(status: ClientVpnRouteStatus): FluentBuilder = apply { this.status = status }
    }
}
