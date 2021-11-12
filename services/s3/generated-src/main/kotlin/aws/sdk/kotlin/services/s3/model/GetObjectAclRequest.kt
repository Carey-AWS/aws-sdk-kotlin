// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetObjectAclRequest private constructor(builder: BuilderImpl) {
    /**
     * The bucket name that contains the object for which to get the ACL information.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     */
    val bucket: String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: String? = builder.expectedBucketOwner
    /**
     * The key of the object for which to get the ACL information.
     */
    val key: String? = builder.key
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: RequestPayer? = builder.requestPayer
    /**
     * VersionId used to reference a specific version of the object.
     */
    val versionId: String? = builder.versionId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetObjectAclRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetObjectAclRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("key=$key,")
        append("requestPayer=$requestPayer,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetObjectAclRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (key != other.key) return false
        if (requestPayer != other.requestPayer) return false
        if (versionId != other.versionId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetObjectAclRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetObjectAclRequest
        /**
         * The bucket name that contains the object for which to get the ACL information.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder
        /**
         * The key of the object for which to get the ACL information.
         */
        fun key(key: String): FluentBuilder
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        fun requestPayer(requestPayer: RequestPayer): FluentBuilder
        /**
         * VersionId used to reference a specific version of the object.
         */
        fun versionId(versionId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The bucket name that contains the object for which to get the ACL information.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         */
        var bucket: String?
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: String?
        /**
         * The key of the object for which to get the ACL information.
         */
        var key: String?
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: RequestPayer?
        /**
         * VersionId used to reference a specific version of the object.
         */
        var versionId: String?

        fun build(): GetObjectAclRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var expectedBucketOwner: String? = null
        override var key: String? = null
        override var requestPayer: RequestPayer? = null
        override var versionId: String? = null

        constructor(x: GetObjectAclRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
            this.key = x.key
            this.requestPayer = x.requestPayer
            this.versionId = x.versionId
        }

        override fun build(): GetObjectAclRequest = GetObjectAclRequest(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder = apply { this.expectedBucketOwner = expectedBucketOwner }
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun requestPayer(requestPayer: RequestPayer): FluentBuilder = apply { this.requestPayer = requestPayer }
        override fun versionId(versionId: String): FluentBuilder = apply { this.versionId = versionId }
    }
}
