// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeCustomerGateways.
 */
class DescribeCustomerGatewaysResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about one or more customer gateways.
     */
    val customerGateways: List<CustomerGateway>? = builder.customerGateways

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeCustomerGatewaysResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeCustomerGatewaysResponse(")
        append("customerGateways=$customerGateways)")
    }

    override fun hashCode(): kotlin.Int {
        var result = customerGateways?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeCustomerGatewaysResponse

        if (customerGateways != other.customerGateways) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeCustomerGatewaysResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeCustomerGatewaysResponse
        /**
         * Information about one or more customer gateways.
         */
        fun customerGateways(customerGateways: List<CustomerGateway>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about one or more customer gateways.
         */
        var customerGateways: List<CustomerGateway>?

        fun build(): DescribeCustomerGatewaysResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var customerGateways: List<CustomerGateway>? = null

        constructor(x: DescribeCustomerGatewaysResponse) : this() {
            this.customerGateways = x.customerGateways
        }

        override fun build(): DescribeCustomerGatewaysResponse = DescribeCustomerGatewaysResponse(this)
        override fun customerGateways(customerGateways: List<CustomerGateway>): FluentBuilder = apply { this.customerGateways = customerGateways }
    }
}
