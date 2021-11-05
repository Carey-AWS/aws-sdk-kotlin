// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class MoveAddressToVpcResponse private constructor(builder: BuilderImpl) {
    /**
     * The allocation ID for the Elastic IP address.
     */
    val allocationId: String? = builder.allocationId
    /**
     * The status of the move of the IP address.
     */
    val status: Status? = builder.status

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): MoveAddressToVpcResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("MoveAddressToVpcResponse(")
        append("allocationId=$allocationId,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MoveAddressToVpcResponse

        if (allocationId != other.allocationId) return false
        if (status != other.status) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): MoveAddressToVpcResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): MoveAddressToVpcResponse
        /**
         * The allocation ID for the Elastic IP address.
         */
        fun allocationId(allocationId: String): FluentBuilder
        /**
         * The status of the move of the IP address.
         */
        fun status(status: Status): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The allocation ID for the Elastic IP address.
         */
        var allocationId: String?
        /**
         * The status of the move of the IP address.
         */
        var status: Status?

        fun build(): MoveAddressToVpcResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var allocationId: String? = null
        override var status: Status? = null

        constructor(x: MoveAddressToVpcResponse) : this() {
            this.allocationId = x.allocationId
            this.status = x.status
        }

        override fun build(): MoveAddressToVpcResponse = MoveAddressToVpcResponse(this)
        override fun allocationId(allocationId: String): FluentBuilder = apply { this.allocationId = allocationId }
        override fun status(status: Status): FluentBuilder = apply { this.status = status }
    }
}
