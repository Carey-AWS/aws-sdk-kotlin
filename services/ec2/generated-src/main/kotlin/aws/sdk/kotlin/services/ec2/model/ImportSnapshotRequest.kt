// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ImportSnapshotRequest private constructor(builder: BuilderImpl) {
    /**
     * The client-specific data.
     */
    val clientData: ClientData? = builder.clientData
    /**
     * Token to enable idempotency for VM import requests.
     */
    val clientToken: String? = builder.clientToken
    /**
     * The description string for the import snapshot task.
     */
    val description: String? = builder.description
    /**
     * Information about the disk container.
     */
    val diskContainer: SnapshotDiskContainer? = builder.diskContainer
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is
     * used unless you specify a non-default KMS key using KmsKeyId. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption in the
     * Amazon Elastic Compute Cloud User Guide.
     */
    val encrypted: Boolean? = builder.encrypted
    /**
     * An identifier for the symmetric KMS key to use when creating the
     * encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this
     * parameter is not specified, the default KMS key for EBS is used. If a KmsKeyId is
     * specified, the Encrypted flag must also be set.
     * The KMS key identifier may be provided in any of the following formats:
     * Key ID
     * Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the key namespace, and then the key ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.
     * ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * Amazon Web Services parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. This action will eventually report failure.
     * The specified KMS key must exist in the Region that the snapshot is being copied to.
     * Amazon EBS does not support asymmetric KMS keys.
     */
    val kmsKeyId: String? = builder.kmsKeyId
    /**
     * The name of the role to use when not using the default role, 'vmimport'.
     */
    val roleName: String? = builder.roleName
    /**
     * The tags to apply to the import snapshot task during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ImportSnapshotRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ImportSnapshotRequest(")
        append("clientData=$clientData,")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("diskContainer=$diskContainer,")
        append("dryRun=$dryRun,")
        append("encrypted=$encrypted,")
        append("kmsKeyId=$kmsKeyId,")
        append("roleName=$roleName,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientData?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (diskContainer?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (roleName?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ImportSnapshotRequest

        if (clientData != other.clientData) return false
        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (diskContainer != other.diskContainer) return false
        if (dryRun != other.dryRun) return false
        if (encrypted != other.encrypted) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (roleName != other.roleName) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ImportSnapshotRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ImportSnapshotRequest
        /**
         * The client-specific data.
         */
        fun clientData(clientData: ClientData): FluentBuilder
        /**
         * Token to enable idempotency for VM import requests.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * The description string for the import snapshot task.
         */
        fun description(description: String): FluentBuilder
        /**
         * Information about the disk container.
         */
        fun diskContainer(diskContainer: SnapshotDiskContainer): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is
         * used unless you specify a non-default KMS key using KmsKeyId. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        fun encrypted(encrypted: Boolean): FluentBuilder
        /**
         * An identifier for the symmetric KMS key to use when creating the
         * encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this
         * parameter is not specified, the default KMS key for EBS is used. If a KmsKeyId is
         * specified, the Encrypted flag must also be set.
         * The KMS key identifier may be provided in any of the following formats:
         * Key ID
         * Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the key namespace, and then the key ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.
         * ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * Amazon Web Services parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even
         * though you provided an invalid identifier. This action will eventually report failure.
         * The specified KMS key must exist in the Region that the snapshot is being copied to.
         * Amazon EBS does not support asymmetric KMS keys.
         */
        fun kmsKeyId(kmsKeyId: String): FluentBuilder
        /**
         * The name of the role to use when not using the default role, 'vmimport'.
         */
        fun roleName(roleName: String): FluentBuilder
        /**
         * The tags to apply to the import snapshot task during creation.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The client-specific data.
         */
        var clientData: ClientData?
        /**
         * Token to enable idempotency for VM import requests.
         */
        var clientToken: String?
        /**
         * The description string for the import snapshot task.
         */
        var description: String?
        /**
         * Information about the disk container.
         */
        var diskContainer: SnapshotDiskContainer?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is
         * used unless you specify a non-default KMS key using KmsKeyId. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        var encrypted: Boolean?
        /**
         * An identifier for the symmetric KMS key to use when creating the
         * encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this
         * parameter is not specified, the default KMS key for EBS is used. If a KmsKeyId is
         * specified, the Encrypted flag must also be set.
         * The KMS key identifier may be provided in any of the following formats:
         * Key ID
         * Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the key namespace, and then the key ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.
         * ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * Amazon Web Services parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even
         * though you provided an invalid identifier. This action will eventually report failure.
         * The specified KMS key must exist in the Region that the snapshot is being copied to.
         * Amazon EBS does not support asymmetric KMS keys.
         */
        var kmsKeyId: String?
        /**
         * The name of the role to use when not using the default role, 'vmimport'.
         */
        var roleName: String?
        /**
         * The tags to apply to the import snapshot task during creation.
         */
        var tagSpecifications: List<TagSpecification>?

        fun build(): ImportSnapshotRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientData] inside the given [block]
         */
        fun clientData(block: ClientData.DslBuilder.() -> kotlin.Unit) {
            this.clientData = ClientData.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer] inside the given [block]
         */
        fun diskContainer(block: SnapshotDiskContainer.DslBuilder.() -> kotlin.Unit) {
            this.diskContainer = SnapshotDiskContainer.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientData: ClientData? = null
        override var clientToken: String? = null
        override var description: String? = null
        override var diskContainer: SnapshotDiskContainer? = null
        override var dryRun: Boolean? = null
        override var encrypted: Boolean? = null
        override var kmsKeyId: String? = null
        override var roleName: String? = null
        override var tagSpecifications: List<TagSpecification>? = null

        constructor(x: ImportSnapshotRequest) : this() {
            this.clientData = x.clientData
            this.clientToken = x.clientToken
            this.description = x.description
            this.diskContainer = x.diskContainer
            this.dryRun = x.dryRun
            this.encrypted = x.encrypted
            this.kmsKeyId = x.kmsKeyId
            this.roleName = x.roleName
            this.tagSpecifications = x.tagSpecifications
        }

        override fun build(): ImportSnapshotRequest = ImportSnapshotRequest(this)
        override fun clientData(clientData: ClientData): FluentBuilder = apply { this.clientData = clientData }
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun diskContainer(diskContainer: SnapshotDiskContainer): FluentBuilder = apply { this.diskContainer = diskContainer }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun encrypted(encrypted: Boolean): FluentBuilder = apply { this.encrypted = encrypted }
        override fun kmsKeyId(kmsKeyId: String): FluentBuilder = apply { this.kmsKeyId = kmsKeyId }
        override fun roleName(roleName: String): FluentBuilder = apply { this.roleName = roleName }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
    }
}
