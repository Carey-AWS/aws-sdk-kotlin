// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeSnapshotsRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The filters.
     * description - A description of the snapshot.
     * encrypted - Indicates whether the snapshot is encrypted
     * (true | false)
     * owner-alias - The owner alias, from an Amazon-maintained list
     * (amazon).
     * This is not the user-configured Amazon Web Services account alias set using the IAM console.
     * We recommend that you use the related parameter instead of this filter.
     * owner-id - The Amazon Web Services account ID of the owner. We recommend that
     * you use the related parameter instead of this filter.
     * progress - The progress of the snapshot, as a percentage (for example,
     * 80%).
     * snapshot-id - The snapshot ID.
     * start-time - The time stamp when the snapshot was initiated.
     * status - The status of the snapshot (pending |
     * completed | error).
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * volume-id - The ID of the volume the snapshot is for.
     * volume-size - The size of the volume, in GiB.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of snapshot results returned by DescribeSnapshots in
     * paginated output. When this parameter is used, DescribeSnapshots only returns
     * MaxResults results in a single page along with a NextToken
     * response element. The remaining results of the initial request can be seen by sending another
     * DescribeSnapshots request with the returned NextToken value. This
     * value can be between 5 and 1,000; if MaxResults is given a value larger than 1,000,
     * only 1,000 results are returned. If this parameter is not used, then
     * DescribeSnapshots returns all results. You cannot specify this parameter and
     * the snapshot IDs parameter in the same request.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The NextToken value returned from a previous paginated
     * DescribeSnapshots request where MaxResults was used and the
     * results exceeded the value of that parameter. Pagination continues from the end of the
     * previous results that returned the NextToken value. This value is
     * null when there are no more results to return.
     */
    val nextToken: String? = builder.nextToken
    /**
     * Scopes the results to snapshots with the specified owners. You can specify a combination of
     * Amazon Web Services account IDs, self, and amazon.
     */
    val ownerIds: List<String>? = builder.ownerIds
    /**
     * The IDs of the Amazon Web Services accounts that can create volumes from the snapshot.
     */
    val restorableByUserIds: List<String>? = builder.restorableByUserIds
    /**
     * The snapshot IDs.
     * Default: Describes the snapshots for which you have create volume permissions.
     */
    val snapshotIds: List<String>? = builder.snapshotIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeSnapshotsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeSnapshotsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("ownerIds=$ownerIds,")
        append("restorableByUserIds=$restorableByUserIds,")
        append("snapshotIds=$snapshotIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (ownerIds?.hashCode() ?: 0)
        result = 31 * result + (restorableByUserIds?.hashCode() ?: 0)
        result = 31 * result + (snapshotIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeSnapshotsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (ownerIds != other.ownerIds) return false
        if (restorableByUserIds != other.restorableByUserIds) return false
        if (snapshotIds != other.snapshotIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeSnapshotsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeSnapshotsRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The filters.
         * description - A description of the snapshot.
         * encrypted - Indicates whether the snapshot is encrypted
         * (true | false)
         * owner-alias - The owner alias, from an Amazon-maintained list
         * (amazon).
         * This is not the user-configured Amazon Web Services account alias set using the IAM console.
         * We recommend that you use the related parameter instead of this filter.
         * owner-id - The Amazon Web Services account ID of the owner. We recommend that
         * you use the related parameter instead of this filter.
         * progress - The progress of the snapshot, as a percentage (for example,
         * 80%).
         * snapshot-id - The snapshot ID.
         * start-time - The time stamp when the snapshot was initiated.
         * status - The status of the snapshot (pending |
         * completed | error).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * volume-id - The ID of the volume the snapshot is for.
         * volume-size - The size of the volume, in GiB.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of snapshot results returned by DescribeSnapshots in
         * paginated output. When this parameter is used, DescribeSnapshots only returns
         * MaxResults results in a single page along with a NextToken
         * response element. The remaining results of the initial request can be seen by sending another
         * DescribeSnapshots request with the returned NextToken value. This
         * value can be between 5 and 1,000; if MaxResults is given a value larger than 1,000,
         * only 1,000 results are returned. If this parameter is not used, then
         * DescribeSnapshots returns all results. You cannot specify this parameter and
         * the snapshot IDs parameter in the same request.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The NextToken value returned from a previous paginated
         * DescribeSnapshots request where MaxResults was used and the
         * results exceeded the value of that parameter. Pagination continues from the end of the
         * previous results that returned the NextToken value. This value is
         * null when there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * Scopes the results to snapshots with the specified owners. You can specify a combination of
         * Amazon Web Services account IDs, self, and amazon.
         */
        fun ownerIds(ownerIds: List<String>): FluentBuilder
        /**
         * The IDs of the Amazon Web Services accounts that can create volumes from the snapshot.
         */
        fun restorableByUserIds(restorableByUserIds: List<String>): FluentBuilder
        /**
         * The snapshot IDs.
         * Default: Describes the snapshots for which you have create volume permissions.
         */
        fun snapshotIds(snapshotIds: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The filters.
         * description - A description of the snapshot.
         * encrypted - Indicates whether the snapshot is encrypted
         * (true | false)
         * owner-alias - The owner alias, from an Amazon-maintained list
         * (amazon).
         * This is not the user-configured Amazon Web Services account alias set using the IAM console.
         * We recommend that you use the related parameter instead of this filter.
         * owner-id - The Amazon Web Services account ID of the owner. We recommend that
         * you use the related parameter instead of this filter.
         * progress - The progress of the snapshot, as a percentage (for example,
         * 80%).
         * snapshot-id - The snapshot ID.
         * start-time - The time stamp when the snapshot was initiated.
         * status - The status of the snapshot (pending |
         * completed | error).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * volume-id - The ID of the volume the snapshot is for.
         * volume-size - The size of the volume, in GiB.
         */
        var filters: List<Filter>?
        /**
         * The maximum number of snapshot results returned by DescribeSnapshots in
         * paginated output. When this parameter is used, DescribeSnapshots only returns
         * MaxResults results in a single page along with a NextToken
         * response element. The remaining results of the initial request can be seen by sending another
         * DescribeSnapshots request with the returned NextToken value. This
         * value can be between 5 and 1,000; if MaxResults is given a value larger than 1,000,
         * only 1,000 results are returned. If this parameter is not used, then
         * DescribeSnapshots returns all results. You cannot specify this parameter and
         * the snapshot IDs parameter in the same request.
         */
        var maxResults: Int?
        /**
         * The NextToken value returned from a previous paginated
         * DescribeSnapshots request where MaxResults was used and the
         * results exceeded the value of that parameter. Pagination continues from the end of the
         * previous results that returned the NextToken value. This value is
         * null when there are no more results to return.
         */
        var nextToken: String?
        /**
         * Scopes the results to snapshots with the specified owners. You can specify a combination of
         * Amazon Web Services account IDs, self, and amazon.
         */
        var ownerIds: List<String>?
        /**
         * The IDs of the Amazon Web Services accounts that can create volumes from the snapshot.
         */
        var restorableByUserIds: List<String>?
        /**
         * The snapshot IDs.
         * Default: Describes the snapshots for which you have create volume permissions.
         */
        var snapshotIds: List<String>?

        fun build(): DescribeSnapshotsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var ownerIds: List<String>? = null
        override var restorableByUserIds: List<String>? = null
        override var snapshotIds: List<String>? = null

        constructor(x: DescribeSnapshotsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.ownerIds = x.ownerIds
            this.restorableByUserIds = x.restorableByUserIds
            this.snapshotIds = x.snapshotIds
        }

        override fun build(): DescribeSnapshotsRequest = DescribeSnapshotsRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun ownerIds(ownerIds: List<String>): FluentBuilder = apply { this.ownerIds = ownerIds }
        override fun restorableByUserIds(restorableByUserIds: List<String>): FluentBuilder = apply { this.restorableByUserIds = restorableByUserIds }
        override fun snapshotIds(snapshotIds: List<String>): FluentBuilder = apply { this.snapshotIds = snapshotIds }
    }
}
