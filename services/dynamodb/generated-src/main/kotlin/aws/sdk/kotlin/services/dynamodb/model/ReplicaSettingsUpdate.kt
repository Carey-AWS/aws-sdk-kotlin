// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the settings for a global table in a Region that will be modified.
 */
class ReplicaSettingsUpdate private constructor(builder: BuilderImpl) {
    /**
     * The Region of the replica to be added.
     */
    val regionName: String? = builder.regionName
    /**
     * Represents the settings of a global secondary index for a global table that will be modified.
     */
    val replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>? = builder.replicaGlobalSecondaryIndexSettingsUpdate
    /**
     * Auto scaling settings for managing a global table replica's read capacity units.
     */
    val replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate? = builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
    /**
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
     * For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write
     * Requirements in the Amazon DynamoDB Developer Guide.
     */
    val replicaProvisionedReadCapacityUnits: Long? = builder.replicaProvisionedReadCapacityUnits

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplicaSettingsUpdate = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaSettingsUpdate(")
        append("regionName=$regionName,")
        append("replicaGlobalSecondaryIndexSettingsUpdate=$replicaGlobalSecondaryIndexSettingsUpdate,")
        append("replicaProvisionedReadCapacityAutoScalingSettingsUpdate=$replicaProvisionedReadCapacityAutoScalingSettingsUpdate,")
        append("replicaProvisionedReadCapacityUnits=$replicaProvisionedReadCapacityUnits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = regionName?.hashCode() ?: 0
        result = 31 * result + (replicaGlobalSecondaryIndexSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedReadCapacityAutoScalingSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedReadCapacityUnits?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplicaSettingsUpdate

        if (regionName != other.regionName) return false
        if (replicaGlobalSecondaryIndexSettingsUpdate != other.replicaGlobalSecondaryIndexSettingsUpdate) return false
        if (replicaProvisionedReadCapacityAutoScalingSettingsUpdate != other.replicaProvisionedReadCapacityAutoScalingSettingsUpdate) return false
        if (replicaProvisionedReadCapacityUnits != other.replicaProvisionedReadCapacityUnits) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplicaSettingsUpdate = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplicaSettingsUpdate
        /**
         * The Region of the replica to be added.
         */
        fun regionName(regionName: String): FluentBuilder
        /**
         * Represents the settings of a global secondary index for a global table that will be modified.
         */
        fun replicaGlobalSecondaryIndexSettingsUpdate(replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>): FluentBuilder
        /**
         * Auto scaling settings for managing a global table replica's read capacity units.
         */
        fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate): FluentBuilder
        /**
         * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
         * For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write
         * Requirements in the Amazon DynamoDB Developer Guide.
         */
        fun replicaProvisionedReadCapacityUnits(replicaProvisionedReadCapacityUnits: Long): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Region of the replica to be added.
         */
        var regionName: String?
        /**
         * Represents the settings of a global secondary index for a global table that will be modified.
         */
        var replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>?
        /**
         * Auto scaling settings for managing a global table replica's read capacity units.
         */
        var replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
        /**
         * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
         * For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write
         * Requirements in the Amazon DynamoDB Developer Guide.
         */
        var replicaProvisionedReadCapacityUnits: Long?

        fun build(): ReplicaSettingsUpdate
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate] inside the given [block]
         */
        fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(block: AutoScalingSettingsUpdate.DslBuilder.() -> kotlin.Unit) {
            this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = AutoScalingSettingsUpdate.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var regionName: String? = null
        override var replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>? = null
        override var replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate? = null
        override var replicaProvisionedReadCapacityUnits: Long? = null

        constructor(x: ReplicaSettingsUpdate) : this() {
            this.regionName = x.regionName
            this.replicaGlobalSecondaryIndexSettingsUpdate = x.replicaGlobalSecondaryIndexSettingsUpdate
            this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = x.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
            this.replicaProvisionedReadCapacityUnits = x.replicaProvisionedReadCapacityUnits
        }

        override fun build(): ReplicaSettingsUpdate = ReplicaSettingsUpdate(this)
        override fun regionName(regionName: String): FluentBuilder = apply { this.regionName = regionName }
        override fun replicaGlobalSecondaryIndexSettingsUpdate(replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>): FluentBuilder = apply { this.replicaGlobalSecondaryIndexSettingsUpdate = replicaGlobalSecondaryIndexSettingsUpdate }
        override fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate): FluentBuilder = apply { this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaProvisionedReadCapacityAutoScalingSettingsUpdate }
        override fun replicaProvisionedReadCapacityUnits(replicaProvisionedReadCapacityUnits: Long): FluentBuilder = apply { this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits }
    }
}
