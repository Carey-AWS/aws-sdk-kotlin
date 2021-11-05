// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeprovisionByoipCidrResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the address range.
     */
    val byoipCidr: ByoipCidr? = builder.byoipCidr

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeprovisionByoipCidrResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeprovisionByoipCidrResponse(")
        append("byoipCidr=$byoipCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = byoipCidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeprovisionByoipCidrResponse

        if (byoipCidr != other.byoipCidr) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeprovisionByoipCidrResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeprovisionByoipCidrResponse
        /**
         * Information about the address range.
         */
        fun byoipCidr(byoipCidr: ByoipCidr): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the address range.
         */
        var byoipCidr: ByoipCidr?

        fun build(): DeprovisionByoipCidrResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ByoipCidr] inside the given [block]
         */
        fun byoipCidr(block: ByoipCidr.DslBuilder.() -> kotlin.Unit) {
            this.byoipCidr = ByoipCidr.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var byoipCidr: ByoipCidr? = null

        constructor(x: DeprovisionByoipCidrResponse) : this() {
            this.byoipCidr = x.byoipCidr
        }

        override fun build(): DeprovisionByoipCidrResponse = DeprovisionByoipCidrResponse(this)
        override fun byoipCidr(byoipCidr: ByoipCidr): FluentBuilder = apply { this.byoipCidr = byoipCidr }
    }
}
