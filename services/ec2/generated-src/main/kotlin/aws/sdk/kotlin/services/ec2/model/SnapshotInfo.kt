// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Information about a snapshot.
 */
class SnapshotInfo private constructor(builder: BuilderImpl) {
    /**
     * Description specified by the CreateSnapshotRequest that has been applied to all
     * snapshots.
     */
    val description: String? = builder.description
    /**
     * Indicates whether the snapshot is encrypted.
     */
    val encrypted: Boolean? = builder.encrypted
    /**
     * The ARN of the Outpost on which the snapshot is stored. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on Outposts in the
     * Amazon Elastic Compute Cloud User Guide.
     */
    val outpostArn: String? = builder.outpostArn
    /**
     * Account id used when creating this snapshot.
     */
    val ownerId: String? = builder.ownerId
    /**
     * Progress this snapshot has made towards completing.
     */
    val progress: String? = builder.progress
    /**
     * Snapshot id that can be used to describe this snapshot.
     */
    val snapshotId: String? = builder.snapshotId
    /**
     * Time this snapshot was started. This is the same for all snapshots initiated by the
     * same request.
     */
    val startTime: Instant? = builder.startTime
    /**
     * Current state of the snapshot.
     */
    val state: SnapshotState? = builder.state
    /**
     * Tags associated with this snapshot.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * Source volume from which this snapshot was created.
     */
    val volumeId: String? = builder.volumeId
    /**
     * Size of the volume from which this snapshot was created.
     */
    val volumeSize: Int? = builder.volumeSize

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SnapshotInfo = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SnapshotInfo(")
        append("description=$description,")
        append("encrypted=$encrypted,")
        append("outpostArn=$outpostArn,")
        append("ownerId=$ownerId,")
        append("progress=$progress,")
        append("snapshotId=$snapshotId,")
        append("startTime=$startTime,")
        append("state=$state,")
        append("tags=$tags,")
        append("volumeId=$volumeId,")
        append("volumeSize=$volumeSize)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (outpostArn?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (progress?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (startTime?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        result = 31 * result + (volumeSize ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SnapshotInfo

        if (description != other.description) return false
        if (encrypted != other.encrypted) return false
        if (outpostArn != other.outpostArn) return false
        if (ownerId != other.ownerId) return false
        if (progress != other.progress) return false
        if (snapshotId != other.snapshotId) return false
        if (startTime != other.startTime) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (volumeId != other.volumeId) return false
        if (volumeSize != other.volumeSize) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): SnapshotInfo = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): SnapshotInfo
        /**
         * Description specified by the CreateSnapshotRequest that has been applied to all
         * snapshots.
         */
        fun description(description: String): FluentBuilder
        /**
         * Indicates whether the snapshot is encrypted.
         */
        fun encrypted(encrypted: Boolean): FluentBuilder
        /**
         * The ARN of the Outpost on which the snapshot is stored. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on Outposts in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        fun outpostArn(outpostArn: String): FluentBuilder
        /**
         * Account id used when creating this snapshot.
         */
        fun ownerId(ownerId: String): FluentBuilder
        /**
         * Progress this snapshot has made towards completing.
         */
        fun progress(progress: String): FluentBuilder
        /**
         * Snapshot id that can be used to describe this snapshot.
         */
        fun snapshotId(snapshotId: String): FluentBuilder
        /**
         * Time this snapshot was started. This is the same for all snapshots initiated by the
         * same request.
         */
        fun startTime(startTime: Instant): FluentBuilder
        /**
         * Current state of the snapshot.
         */
        fun state(state: SnapshotState): FluentBuilder
        /**
         * Tags associated with this snapshot.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * Source volume from which this snapshot was created.
         */
        fun volumeId(volumeId: String): FluentBuilder
        /**
         * Size of the volume from which this snapshot was created.
         */
        fun volumeSize(volumeSize: Int): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Description specified by the CreateSnapshotRequest that has been applied to all
         * snapshots.
         */
        var description: String?
        /**
         * Indicates whether the snapshot is encrypted.
         */
        var encrypted: Boolean?
        /**
         * The ARN of the Outpost on which the snapshot is stored. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on Outposts in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        var outpostArn: String?
        /**
         * Account id used when creating this snapshot.
         */
        var ownerId: String?
        /**
         * Progress this snapshot has made towards completing.
         */
        var progress: String?
        /**
         * Snapshot id that can be used to describe this snapshot.
         */
        var snapshotId: String?
        /**
         * Time this snapshot was started. This is the same for all snapshots initiated by the
         * same request.
         */
        var startTime: Instant?
        /**
         * Current state of the snapshot.
         */
        var state: SnapshotState?
        /**
         * Tags associated with this snapshot.
         */
        var tags: List<Tag>?
        /**
         * Source volume from which this snapshot was created.
         */
        var volumeId: String?
        /**
         * Size of the volume from which this snapshot was created.
         */
        var volumeSize: Int?

        fun build(): SnapshotInfo
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var description: String? = null
        override var encrypted: Boolean? = null
        override var outpostArn: String? = null
        override var ownerId: String? = null
        override var progress: String? = null
        override var snapshotId: String? = null
        override var startTime: Instant? = null
        override var state: SnapshotState? = null
        override var tags: List<Tag>? = null
        override var volumeId: String? = null
        override var volumeSize: Int? = null

        constructor(x: SnapshotInfo) : this() {
            this.description = x.description
            this.encrypted = x.encrypted
            this.outpostArn = x.outpostArn
            this.ownerId = x.ownerId
            this.progress = x.progress
            this.snapshotId = x.snapshotId
            this.startTime = x.startTime
            this.state = x.state
            this.tags = x.tags
            this.volumeId = x.volumeId
            this.volumeSize = x.volumeSize
        }

        override fun build(): SnapshotInfo = SnapshotInfo(this)
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun encrypted(encrypted: Boolean): FluentBuilder = apply { this.encrypted = encrypted }
        override fun outpostArn(outpostArn: String): FluentBuilder = apply { this.outpostArn = outpostArn }
        override fun ownerId(ownerId: String): FluentBuilder = apply { this.ownerId = ownerId }
        override fun progress(progress: String): FluentBuilder = apply { this.progress = progress }
        override fun snapshotId(snapshotId: String): FluentBuilder = apply { this.snapshotId = snapshotId }
        override fun startTime(startTime: Instant): FluentBuilder = apply { this.startTime = startTime }
        override fun state(state: SnapshotState): FluentBuilder = apply { this.state = state }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun volumeId(volumeId: String): FluentBuilder = apply { this.volumeId = volumeId }
        override fun volumeSize(volumeSize: Int): FluentBuilder = apply { this.volumeSize = volumeSize }
    }
}
