// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RestoreManagedPrefixListVersionResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the prefix list.
     */
    val prefixList: ManagedPrefixList? = builder.prefixList

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RestoreManagedPrefixListVersionResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreManagedPrefixListVersionResponse(")
        append("prefixList=$prefixList)")
    }

    override fun hashCode(): kotlin.Int {
        var result = prefixList?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RestoreManagedPrefixListVersionResponse

        if (prefixList != other.prefixList) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RestoreManagedPrefixListVersionResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RestoreManagedPrefixListVersionResponse
        /**
         * Information about the prefix list.
         */
        fun prefixList(prefixList: ManagedPrefixList): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the prefix list.
         */
        var prefixList: ManagedPrefixList?

        fun build(): RestoreManagedPrefixListVersionResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ManagedPrefixList] inside the given [block]
         */
        fun prefixList(block: ManagedPrefixList.DslBuilder.() -> kotlin.Unit) {
            this.prefixList = ManagedPrefixList.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var prefixList: ManagedPrefixList? = null

        constructor(x: RestoreManagedPrefixListVersionResponse) : this() {
            this.prefixList = x.prefixList
        }

        override fun build(): RestoreManagedPrefixListVersionResponse = RestoreManagedPrefixListVersionResponse(this)
        override fun prefixList(prefixList: ManagedPrefixList): FluentBuilder = apply { this.prefixList = prefixList }
    }
}
