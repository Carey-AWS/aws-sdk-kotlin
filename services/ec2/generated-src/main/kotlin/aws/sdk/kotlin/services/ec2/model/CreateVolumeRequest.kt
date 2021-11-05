// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVolumeRequest private constructor(builder: BuilderImpl) {
    /**
     * The Availability Zone in which to create the volume.
     */
    val availabilityZone: String? = builder.availabilityZone
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency
     * of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     * Idempotency.
     */
    val clientToken: String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * Indicates whether the volume should be encrypted.
     * The effect of setting the encryption state to true depends on
     * the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by default
     * in the Amazon Elastic Compute Cloud User Guide.
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances">Supported
     * instance types.
     */
    val encrypted: Boolean? = builder.encrypted
    /**
     * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this represents
     * the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline
     * performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
     * The following are the supported values for each volume type:
     * gp3: 3,000-16,000 IOPS
     * io1: 100-64,000 IOPS
     * io2: 100-64,000 IOPS
     * io1 and io2 volumes support up to 64,000 IOPS only on
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families support performance
     * up to 32,000 IOPS.
     * This parameter is required for io1 and io2 volumes.
     * The default for gp3 volumes is 3,000 IOPS.
     * This parameter is not supported for gp2, st1, sc1, or standard volumes.
     */
    val iops: Int? = builder.iops
    /**
     * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption.
     * If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is
     * specified, the encrypted state must be true.
     * You can specify the KMS key using any of the following:
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * Key alias. For example, alias/ExampleAlias.
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid,
     * the action can appear to complete, but eventually fails.
     */
    val kmsKeyId: String? = builder.kmsKeyId
    /**
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
     * volume to up to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System in the same Availability Zone. This parameter is
     * supported with io1 and io2 volumes only. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html">
     * Amazon EBS Multi-Attach in the Amazon Elastic Compute Cloud User Guide.
     */
    val multiAttachEnabled: Boolean? = builder.multiAttachEnabled
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     */
    val outpostArn: String? = builder.outpostArn
    /**
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * If you specify a snapshot, the default is the snapshot size. You can specify a volume
     * size that is equal to or larger than the snapshot size.
     * The following are the supported volumes sizes for each volume type:
     * gp2 and gp3: 1-16,384
     * io1 and io2: 4-16,384
     * st1 and sc1: 125-16,384
     * standard: 1-1,024
     */
    val size: Int? = builder.size
    /**
     * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     */
    val snapshotId: String? = builder.snapshotId
    /**
     * The tags to apply to the volume during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * This parameter is valid only for gp3 volumes.
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    val throughput: Int? = builder.throughput
    /**
     * The volume type. This parameter can be one of the following values:
     * General Purpose SSD: gp2 | gp3
     * Provisioned IOPS SSD: io1 | io2
     * Throughput Optimized HDD: st1
     * Cold HDD: sc1
     * Magnetic: standard
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
     * Amazon Elastic Compute Cloud User Guide.
     * Default: gp2
     */
    val volumeType: VolumeType? = builder.volumeType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateVolumeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVolumeRequest(")
        append("availabilityZone=$availabilityZone,")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("encrypted=$encrypted,")
        append("iops=$iops,")
        append("kmsKeyId=$kmsKeyId,")
        append("multiAttachEnabled=$multiAttachEnabled,")
        append("outpostArn=$outpostArn,")
        append("size=$size,")
        append("snapshotId=$snapshotId,")
        append("tagSpecifications=$tagSpecifications,")
        append("throughput=$throughput,")
        append("volumeType=$volumeType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (iops ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (multiAttachEnabled?.hashCode() ?: 0)
        result = 31 * result + (outpostArn?.hashCode() ?: 0)
        result = 31 * result + (size ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (throughput ?: 0)
        result = 31 * result + (volumeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateVolumeRequest

        if (availabilityZone != other.availabilityZone) return false
        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (encrypted != other.encrypted) return false
        if (iops != other.iops) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (multiAttachEnabled != other.multiAttachEnabled) return false
        if (outpostArn != other.outpostArn) return false
        if (size != other.size) return false
        if (snapshotId != other.snapshotId) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (throughput != other.throughput) return false
        if (volumeType != other.volumeType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateVolumeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateVolumeRequest
        /**
         * The Availability Zone in which to create the volume.
         */
        fun availabilityZone(availabilityZone: String): FluentBuilder
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency
         * of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
         * Idempotency.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * Indicates whether the volume should be encrypted.
         * The effect of setting the encryption state to true depends on
         * the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by default
         * in the Amazon Elastic Compute Cloud User Guide.
         * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances">Supported
         * instance types.
         */
        fun encrypted(encrypted: Boolean): FluentBuilder
        /**
         * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this represents
         * the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline
         * performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
         * The following are the supported values for each volume type:
         * gp3: 3,000-16,000 IOPS
         * io1: 100-64,000 IOPS
         * io2: 100-64,000 IOPS
         * io1 and io2 volumes support up to 64,000 IOPS only on
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families support performance
         * up to 32,000 IOPS.
         * This parameter is required for io1 and io2 volumes.
         * The default for gp3 volumes is 3,000 IOPS.
         * This parameter is not supported for gp2, st1, sc1, or standard volumes.
         */
        fun iops(iops: Int): FluentBuilder
        /**
         * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption.
         * If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is
         * specified, the encrypted state must be true.
         * You can specify the KMS key using any of the following:
         * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
         * Key alias. For example, alias/ExampleAlias.
         * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
         * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid,
         * the action can appear to complete, but eventually fails.
         */
        fun kmsKeyId(kmsKeyId: String): FluentBuilder
        /**
         * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
         * volume to up to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System in the same Availability Zone. This parameter is
         * supported with io1 and io2 volumes only. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html">
         * Amazon EBS Multi-Attach in the Amazon Elastic Compute Cloud User Guide.
         */
        fun multiAttachEnabled(multiAttachEnabled: Boolean): FluentBuilder
        /**
         * The Amazon Resource Name (ARN) of the Outpost.
         */
        fun outpostArn(outpostArn: String): FluentBuilder
        /**
         * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
         * If you specify a snapshot, the default is the snapshot size. You can specify a volume
         * size that is equal to or larger than the snapshot size.
         * The following are the supported volumes sizes for each volume type:
         * gp2 and gp3: 1-16,384
         * io1 and io2: 4-16,384
         * st1 and sc1: 125-16,384
         * standard: 1-1,024
         */
        fun size(size: Int): FluentBuilder
        /**
         * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
         */
        fun snapshotId(snapshotId: String): FluentBuilder
        /**
         * The tags to apply to the volume during creation.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
        /**
         * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
         * This parameter is valid only for gp3 volumes.
         * Valid Range: Minimum value of 125. Maximum value of 1000.
         */
        fun throughput(throughput: Int): FluentBuilder
        /**
         * The volume type. This parameter can be one of the following values:
         * General Purpose SSD: gp2 | gp3
         * Provisioned IOPS SSD: io1 | io2
         * Throughput Optimized HDD: st1
         * Cold HDD: sc1
         * Magnetic: standard
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
         * Amazon Elastic Compute Cloud User Guide.
         * Default: gp2
         */
        fun volumeType(volumeType: VolumeType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Availability Zone in which to create the volume.
         */
        var availabilityZone: String?
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency
         * of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
         * Idempotency.
         */
        var clientToken: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * Indicates whether the volume should be encrypted.
         * The effect of setting the encryption state to true depends on
         * the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by default
         * in the Amazon Elastic Compute Cloud User Guide.
         * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances">Supported
         * instance types.
         */
        var encrypted: Boolean?
        /**
         * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this represents
         * the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline
         * performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
         * The following are the supported values for each volume type:
         * gp3: 3,000-16,000 IOPS
         * io1: 100-64,000 IOPS
         * io2: 100-64,000 IOPS
         * io1 and io2 volumes support up to 64,000 IOPS only on
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families support performance
         * up to 32,000 IOPS.
         * This parameter is required for io1 and io2 volumes.
         * The default for gp3 volumes is 3,000 IOPS.
         * This parameter is not supported for gp2, st1, sc1, or standard volumes.
         */
        var iops: Int?
        /**
         * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption.
         * If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is
         * specified, the encrypted state must be true.
         * You can specify the KMS key using any of the following:
         * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
         * Key alias. For example, alias/ExampleAlias.
         * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
         * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid,
         * the action can appear to complete, but eventually fails.
         */
        var kmsKeyId: String?
        /**
         * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
         * volume to up to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System in the same Availability Zone. This parameter is
         * supported with io1 and io2 volumes only. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html">
         * Amazon EBS Multi-Attach in the Amazon Elastic Compute Cloud User Guide.
         */
        var multiAttachEnabled: Boolean?
        /**
         * The Amazon Resource Name (ARN) of the Outpost.
         */
        var outpostArn: String?
        /**
         * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
         * If you specify a snapshot, the default is the snapshot size. You can specify a volume
         * size that is equal to or larger than the snapshot size.
         * The following are the supported volumes sizes for each volume type:
         * gp2 and gp3: 1-16,384
         * io1 and io2: 4-16,384
         * st1 and sc1: 125-16,384
         * standard: 1-1,024
         */
        var size: Int?
        /**
         * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
         */
        var snapshotId: String?
        /**
         * The tags to apply to the volume during creation.
         */
        var tagSpecifications: List<TagSpecification>?
        /**
         * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
         * This parameter is valid only for gp3 volumes.
         * Valid Range: Minimum value of 125. Maximum value of 1000.
         */
        var throughput: Int?
        /**
         * The volume type. This parameter can be one of the following values:
         * General Purpose SSD: gp2 | gp3
         * Provisioned IOPS SSD: io1 | io2
         * Throughput Optimized HDD: st1
         * Cold HDD: sc1
         * Magnetic: standard
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
         * Amazon Elastic Compute Cloud User Guide.
         * Default: gp2
         */
        var volumeType: VolumeType?

        fun build(): CreateVolumeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var availabilityZone: String? = null
        override var clientToken: String? = null
        override var dryRun: Boolean? = null
        override var encrypted: Boolean? = null
        override var iops: Int? = null
        override var kmsKeyId: String? = null
        override var multiAttachEnabled: Boolean? = null
        override var outpostArn: String? = null
        override var size: Int? = null
        override var snapshotId: String? = null
        override var tagSpecifications: List<TagSpecification>? = null
        override var throughput: Int? = null
        override var volumeType: VolumeType? = null

        constructor(x: CreateVolumeRequest) : this() {
            this.availabilityZone = x.availabilityZone
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.encrypted = x.encrypted
            this.iops = x.iops
            this.kmsKeyId = x.kmsKeyId
            this.multiAttachEnabled = x.multiAttachEnabled
            this.outpostArn = x.outpostArn
            this.size = x.size
            this.snapshotId = x.snapshotId
            this.tagSpecifications = x.tagSpecifications
            this.throughput = x.throughput
            this.volumeType = x.volumeType
        }

        override fun build(): CreateVolumeRequest = CreateVolumeRequest(this)
        override fun availabilityZone(availabilityZone: String): FluentBuilder = apply { this.availabilityZone = availabilityZone }
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun encrypted(encrypted: Boolean): FluentBuilder = apply { this.encrypted = encrypted }
        override fun iops(iops: Int): FluentBuilder = apply { this.iops = iops }
        override fun kmsKeyId(kmsKeyId: String): FluentBuilder = apply { this.kmsKeyId = kmsKeyId }
        override fun multiAttachEnabled(multiAttachEnabled: Boolean): FluentBuilder = apply { this.multiAttachEnabled = multiAttachEnabled }
        override fun outpostArn(outpostArn: String): FluentBuilder = apply { this.outpostArn = outpostArn }
        override fun size(size: Int): FluentBuilder = apply { this.size = size }
        override fun snapshotId(snapshotId: String): FluentBuilder = apply { this.snapshotId = snapshotId }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
        override fun throughput(throughput: Int): FluentBuilder = apply { this.throughput = throughput }
        override fun volumeType(volumeType: VolumeType): FluentBuilder = apply { this.volumeType = volumeType }
    }
}
