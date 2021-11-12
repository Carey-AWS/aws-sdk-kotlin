// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIdFormatRequest private constructor(builder: BuilderImpl) {
    /**
     * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options |
     * elastic-ip-allocation | elastic-ip-association |
     * export-task | flow-log | image |
     * import-task | internet-gateway | network-acl
     * | network-acl-association | network-interface |
     * network-interface-attachment | prefix-list |
     * route-table | route-table-association |
     * security-group | subnet |
     * subnet-cidr-block-association | vpc |
     * vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
     * Alternatively, use the all-current option to include all resource types that are
     * currently within their opt-in period for longer IDs.
     */
    val resource: String? = builder.resource
    /**
     * Indicate whether the resource should use longer IDs (17-character IDs).
     */
    val useLongIds: Boolean? = builder.useLongIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyIdFormatRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIdFormatRequest(")
        append("resource=$resource,")
        append("useLongIds=$useLongIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resource?.hashCode() ?: 0
        result = 31 * result + (useLongIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyIdFormatRequest

        if (resource != other.resource) return false
        if (useLongIds != other.useLongIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyIdFormatRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyIdFormatRequest
        /**
         * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | internet-gateway | network-acl
         * | network-acl-association | network-interface |
         * network-interface-attachment | prefix-list |
         * route-table | route-table-association |
         * security-group | subnet |
         * subnet-cidr-block-association | vpc |
         * vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
         * Alternatively, use the all-current option to include all resource types that are
         * currently within their opt-in period for longer IDs.
         */
        fun resource(resource: String): FluentBuilder
        /**
         * Indicate whether the resource should use longer IDs (17-character IDs).
         */
        fun useLongIds(useLongIds: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | internet-gateway | network-acl
         * | network-acl-association | network-interface |
         * network-interface-attachment | prefix-list |
         * route-table | route-table-association |
         * security-group | subnet |
         * subnet-cidr-block-association | vpc |
         * vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
         * Alternatively, use the all-current option to include all resource types that are
         * currently within their opt-in period for longer IDs.
         */
        var resource: String?
        /**
         * Indicate whether the resource should use longer IDs (17-character IDs).
         */
        var useLongIds: Boolean?

        fun build(): ModifyIdFormatRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var resource: String? = null
        override var useLongIds: Boolean? = null

        constructor(x: ModifyIdFormatRequest) : this() {
            this.resource = x.resource
            this.useLongIds = x.useLongIds
        }

        override fun build(): ModifyIdFormatRequest = ModifyIdFormatRequest(this)
        override fun resource(resource: String): FluentBuilder = apply { this.resource = resource }
        override fun useLongIds(useLongIds: Boolean): FluentBuilder = apply { this.useLongIds = useLongIds }
    }
}
