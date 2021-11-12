// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class MonitorInstancesRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The IDs of the instances.
     */
    val instanceIds: List<String>? = builder.instanceIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): MonitorInstancesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("MonitorInstancesRequest(")
        append("dryRun=$dryRun,")
        append("instanceIds=$instanceIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MonitorInstancesRequest

        if (dryRun != other.dryRun) return false
        if (instanceIds != other.instanceIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): MonitorInstancesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): MonitorInstancesRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The IDs of the instances.
         */
        fun instanceIds(instanceIds: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The IDs of the instances.
         */
        var instanceIds: List<String>?

        fun build(): MonitorInstancesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var instanceIds: List<String>? = null

        constructor(x: MonitorInstancesRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceIds = x.instanceIds
        }

        override fun build(): MonitorInstancesRequest = MonitorInstancesRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun instanceIds(instanceIds: List<String>): FluentBuilder = apply { this.instanceIds = instanceIds }
    }
}
