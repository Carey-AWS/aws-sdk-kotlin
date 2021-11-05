// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteVpcEndpointConnectionNotificationsRequest private constructor(builder: BuilderImpl) {
    /**
     * One or more notification IDs.
     */
    val connectionNotificationIds: List<String>? = builder.connectionNotificationIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteVpcEndpointConnectionNotificationsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpcEndpointConnectionNotificationsRequest(")
        append("connectionNotificationIds=$connectionNotificationIds,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = connectionNotificationIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteVpcEndpointConnectionNotificationsRequest

        if (connectionNotificationIds != other.connectionNotificationIds) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteVpcEndpointConnectionNotificationsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteVpcEndpointConnectionNotificationsRequest
        /**
         * One or more notification IDs.
         */
        fun connectionNotificationIds(connectionNotificationIds: List<String>): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * One or more notification IDs.
         */
        var connectionNotificationIds: List<String>?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?

        fun build(): DeleteVpcEndpointConnectionNotificationsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var connectionNotificationIds: List<String>? = null
        override var dryRun: Boolean? = null

        constructor(x: DeleteVpcEndpointConnectionNotificationsRequest) : this() {
            this.connectionNotificationIds = x.connectionNotificationIds
            this.dryRun = x.dryRun
        }

        override fun build(): DeleteVpcEndpointConnectionNotificationsRequest = DeleteVpcEndpointConnectionNotificationsRequest(this)
        override fun connectionNotificationIds(connectionNotificationIds: List<String>): FluentBuilder = apply { this.connectionNotificationIds = connectionNotificationIds }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
    }
}
