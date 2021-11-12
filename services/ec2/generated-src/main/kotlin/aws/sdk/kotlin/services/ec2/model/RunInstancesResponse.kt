// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a launch request for one or more instances, and includes
 * owner, requester, and security group information that applies to all
 * instances in the launch request.
 */
class RunInstancesResponse private constructor(builder: BuilderImpl) {
    /**
     * &#91;EC2-Classic only&#93; The security groups.
     */
    val groups: List<GroupIdentifier>? = builder.groups
    /**
     * The instances.
     */
    val instances: List<Instance>? = builder.instances
    /**
     * The ID of the Amazon Web Services account that owns the reservation.
     */
    val ownerId: String? = builder.ownerId
    /**
     * The ID of the requester that launched the instances on your behalf (for example,
     * Amazon Web Services Management Console or Auto Scaling).
     */
    val requesterId: String? = builder.requesterId
    /**
     * The ID of the reservation.
     */
    val reservationId: String? = builder.reservationId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RunInstancesResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RunInstancesResponse(")
        append("groups=$groups,")
        append("instances=$instances,")
        append("ownerId=$ownerId,")
        append("requesterId=$requesterId,")
        append("reservationId=$reservationId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groups?.hashCode() ?: 0
        result = 31 * result + (instances?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (requesterId?.hashCode() ?: 0)
        result = 31 * result + (reservationId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RunInstancesResponse

        if (groups != other.groups) return false
        if (instances != other.instances) return false
        if (ownerId != other.ownerId) return false
        if (requesterId != other.requesterId) return false
        if (reservationId != other.reservationId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RunInstancesResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RunInstancesResponse
        /**
         * &#91;EC2-Classic only&#93; The security groups.
         */
        fun groups(groups: List<GroupIdentifier>): FluentBuilder
        /**
         * The instances.
         */
        fun instances(instances: List<Instance>): FluentBuilder
        /**
         * The ID of the Amazon Web Services account that owns the reservation.
         */
        fun ownerId(ownerId: String): FluentBuilder
        /**
         * The ID of the requester that launched the instances on your behalf (for example,
         * Amazon Web Services Management Console or Auto Scaling).
         */
        fun requesterId(requesterId: String): FluentBuilder
        /**
         * The ID of the reservation.
         */
        fun reservationId(reservationId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * &#91;EC2-Classic only&#93; The security groups.
         */
        var groups: List<GroupIdentifier>?
        /**
         * The instances.
         */
        var instances: List<Instance>?
        /**
         * The ID of the Amazon Web Services account that owns the reservation.
         */
        var ownerId: String?
        /**
         * The ID of the requester that launched the instances on your behalf (for example,
         * Amazon Web Services Management Console or Auto Scaling).
         */
        var requesterId: String?
        /**
         * The ID of the reservation.
         */
        var reservationId: String?

        fun build(): RunInstancesResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var groups: List<GroupIdentifier>? = null
        override var instances: List<Instance>? = null
        override var ownerId: String? = null
        override var requesterId: String? = null
        override var reservationId: String? = null

        constructor(x: RunInstancesResponse) : this() {
            this.groups = x.groups
            this.instances = x.instances
            this.ownerId = x.ownerId
            this.requesterId = x.requesterId
            this.reservationId = x.reservationId
        }

        override fun build(): RunInstancesResponse = RunInstancesResponse(this)
        override fun groups(groups: List<GroupIdentifier>): FluentBuilder = apply { this.groups = groups }
        override fun instances(instances: List<Instance>): FluentBuilder = apply { this.instances = instances }
        override fun ownerId(ownerId: String): FluentBuilder = apply { this.ownerId = ownerId }
        override fun requesterId(requesterId: String): FluentBuilder = apply { this.requesterId = requesterId }
        override fun reservationId(reservationId: String): FluentBuilder = apply { this.reservationId = reservationId }
    }
}
