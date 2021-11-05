// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetHostReservationPurchasePreviewResponse private constructor(builder: BuilderImpl) {
    /**
     * The currency in which the totalUpfrontPrice and
     * totalHourlyPrice amounts are specified. At this time, the only
     * supported currency is USD.
     */
    val currencyCode: CurrencyCodeValues? = builder.currencyCode
    /**
     * The purchase information of the Dedicated Host reservation and the Dedicated Hosts
     * associated with it.
     */
    val purchase: List<Purchase>? = builder.purchase
    /**
     * The potential total hourly price of the reservation per hour.
     */
    val totalHourlyPrice: String? = builder.totalHourlyPrice
    /**
     * The potential total upfront price. This is billed immediately.
     */
    val totalUpfrontPrice: String? = builder.totalUpfrontPrice

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetHostReservationPurchasePreviewResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetHostReservationPurchasePreviewResponse(")
        append("currencyCode=$currencyCode,")
        append("purchase=$purchase,")
        append("totalHourlyPrice=$totalHourlyPrice,")
        append("totalUpfrontPrice=$totalUpfrontPrice)")
    }

    override fun hashCode(): kotlin.Int {
        var result = currencyCode?.hashCode() ?: 0
        result = 31 * result + (purchase?.hashCode() ?: 0)
        result = 31 * result + (totalHourlyPrice?.hashCode() ?: 0)
        result = 31 * result + (totalUpfrontPrice?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetHostReservationPurchasePreviewResponse

        if (currencyCode != other.currencyCode) return false
        if (purchase != other.purchase) return false
        if (totalHourlyPrice != other.totalHourlyPrice) return false
        if (totalUpfrontPrice != other.totalUpfrontPrice) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetHostReservationPurchasePreviewResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetHostReservationPurchasePreviewResponse
        /**
         * The currency in which the totalUpfrontPrice and
         * totalHourlyPrice amounts are specified. At this time, the only
         * supported currency is USD.
         */
        fun currencyCode(currencyCode: CurrencyCodeValues): FluentBuilder
        /**
         * The purchase information of the Dedicated Host reservation and the Dedicated Hosts
         * associated with it.
         */
        fun purchase(purchase: List<Purchase>): FluentBuilder
        /**
         * The potential total hourly price of the reservation per hour.
         */
        fun totalHourlyPrice(totalHourlyPrice: String): FluentBuilder
        /**
         * The potential total upfront price. This is billed immediately.
         */
        fun totalUpfrontPrice(totalUpfrontPrice: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The currency in which the totalUpfrontPrice and
         * totalHourlyPrice amounts are specified. At this time, the only
         * supported currency is USD.
         */
        var currencyCode: CurrencyCodeValues?
        /**
         * The purchase information of the Dedicated Host reservation and the Dedicated Hosts
         * associated with it.
         */
        var purchase: List<Purchase>?
        /**
         * The potential total hourly price of the reservation per hour.
         */
        var totalHourlyPrice: String?
        /**
         * The potential total upfront price. This is billed immediately.
         */
        var totalUpfrontPrice: String?

        fun build(): GetHostReservationPurchasePreviewResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var currencyCode: CurrencyCodeValues? = null
        override var purchase: List<Purchase>? = null
        override var totalHourlyPrice: String? = null
        override var totalUpfrontPrice: String? = null

        constructor(x: GetHostReservationPurchasePreviewResponse) : this() {
            this.currencyCode = x.currencyCode
            this.purchase = x.purchase
            this.totalHourlyPrice = x.totalHourlyPrice
            this.totalUpfrontPrice = x.totalUpfrontPrice
        }

        override fun build(): GetHostReservationPurchasePreviewResponse = GetHostReservationPurchasePreviewResponse(this)
        override fun currencyCode(currencyCode: CurrencyCodeValues): FluentBuilder = apply { this.currencyCode = currencyCode }
        override fun purchase(purchase: List<Purchase>): FluentBuilder = apply { this.purchase = purchase }
        override fun totalHourlyPrice(totalHourlyPrice: String): FluentBuilder = apply { this.totalHourlyPrice = totalHourlyPrice }
        override fun totalUpfrontPrice(totalUpfrontPrice: String): FluentBuilder = apply { this.totalUpfrontPrice = totalUpfrontPrice }
    }
}
