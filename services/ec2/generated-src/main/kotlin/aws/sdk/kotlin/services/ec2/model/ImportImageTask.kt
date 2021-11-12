// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an import image task.
 */
class ImportImageTask private constructor(builder: BuilderImpl) {
    /**
     * The architecture of the virtual machine.
     * Valid values: i386 | x86_64 | arm64
     */
    val architecture: String? = builder.architecture
    /**
     * The boot mode of the virtual machine.
     */
    val bootMode: BootModeValues? = builder.bootMode
    /**
     * A description of the import task.
     */
    val description: String? = builder.description
    /**
     * Indicates whether the image is encrypted.
     */
    val encrypted: Boolean? = builder.encrypted
    /**
     * The target hypervisor for the import task.
     * Valid values: xen
     */
    val hypervisor: String? = builder.hypervisor
    /**
     * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
     */
    val imageId: String? = builder.imageId
    /**
     * The ID of the import image task.
     */
    val importTaskId: String? = builder.importTaskId
    /**
     * The identifier for the KMS key that was used to create the encrypted image.
     */
    val kmsKeyId: String? = builder.kmsKeyId
    /**
     * The ARNs of the license configurations that are associated with the import image task.
     */
    val licenseSpecifications: List<ImportImageLicenseConfigurationResponse>? = builder.licenseSpecifications
    /**
     * The license type of the virtual machine.
     */
    val licenseType: String? = builder.licenseType
    /**
     * The description string for the import image task.
     */
    val platform: String? = builder.platform
    /**
     * The percentage of progress of the import image task.
     */
    val progress: String? = builder.progress
    /**
     * Information about the snapshots.
     */
    val snapshotDetails: List<SnapshotDetail>? = builder.snapshotDetails
    /**
     * A brief status for the import image task.
     */
    val status: String? = builder.status
    /**
     * A descriptive status message for the import image task.
     */
    val statusMessage: String? = builder.statusMessage
    /**
     * The tags for the import image task.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The usage operation value.
     */
    val usageOperation: String? = builder.usageOperation

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ImportImageTask = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ImportImageTask(")
        append("architecture=$architecture,")
        append("bootMode=$bootMode,")
        append("description=$description,")
        append("encrypted=$encrypted,")
        append("hypervisor=$hypervisor,")
        append("imageId=$imageId,")
        append("importTaskId=$importTaskId,")
        append("kmsKeyId=$kmsKeyId,")
        append("licenseSpecifications=$licenseSpecifications,")
        append("licenseType=$licenseType,")
        append("platform=$platform,")
        append("progress=$progress,")
        append("snapshotDetails=$snapshotDetails,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("tags=$tags,")
        append("usageOperation=$usageOperation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = architecture?.hashCode() ?: 0
        result = 31 * result + (bootMode?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (hypervisor?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (importTaskId?.hashCode() ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (licenseSpecifications?.hashCode() ?: 0)
        result = 31 * result + (licenseType?.hashCode() ?: 0)
        result = 31 * result + (platform?.hashCode() ?: 0)
        result = 31 * result + (progress?.hashCode() ?: 0)
        result = 31 * result + (snapshotDetails?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (usageOperation?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ImportImageTask

        if (architecture != other.architecture) return false
        if (bootMode != other.bootMode) return false
        if (description != other.description) return false
        if (encrypted != other.encrypted) return false
        if (hypervisor != other.hypervisor) return false
        if (imageId != other.imageId) return false
        if (importTaskId != other.importTaskId) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (licenseSpecifications != other.licenseSpecifications) return false
        if (licenseType != other.licenseType) return false
        if (platform != other.platform) return false
        if (progress != other.progress) return false
        if (snapshotDetails != other.snapshotDetails) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (tags != other.tags) return false
        if (usageOperation != other.usageOperation) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ImportImageTask = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ImportImageTask
        /**
         * The architecture of the virtual machine.
         * Valid values: i386 | x86_64 | arm64
         */
        fun architecture(architecture: String): FluentBuilder
        /**
         * The boot mode of the virtual machine.
         */
        fun bootMode(bootMode: BootModeValues): FluentBuilder
        /**
         * A description of the import task.
         */
        fun description(description: String): FluentBuilder
        /**
         * Indicates whether the image is encrypted.
         */
        fun encrypted(encrypted: Boolean): FluentBuilder
        /**
         * The target hypervisor for the import task.
         * Valid values: xen
         */
        fun hypervisor(hypervisor: String): FluentBuilder
        /**
         * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
         */
        fun imageId(imageId: String): FluentBuilder
        /**
         * The ID of the import image task.
         */
        fun importTaskId(importTaskId: String): FluentBuilder
        /**
         * The identifier for the KMS key that was used to create the encrypted image.
         */
        fun kmsKeyId(kmsKeyId: String): FluentBuilder
        /**
         * The ARNs of the license configurations that are associated with the import image task.
         */
        fun licenseSpecifications(licenseSpecifications: List<ImportImageLicenseConfigurationResponse>): FluentBuilder
        /**
         * The license type of the virtual machine.
         */
        fun licenseType(licenseType: String): FluentBuilder
        /**
         * The description string for the import image task.
         */
        fun platform(platform: String): FluentBuilder
        /**
         * The percentage of progress of the import image task.
         */
        fun progress(progress: String): FluentBuilder
        /**
         * Information about the snapshots.
         */
        fun snapshotDetails(snapshotDetails: List<SnapshotDetail>): FluentBuilder
        /**
         * A brief status for the import image task.
         */
        fun status(status: String): FluentBuilder
        /**
         * A descriptive status message for the import image task.
         */
        fun statusMessage(statusMessage: String): FluentBuilder
        /**
         * The tags for the import image task.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * The usage operation value.
         */
        fun usageOperation(usageOperation: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The architecture of the virtual machine.
         * Valid values: i386 | x86_64 | arm64
         */
        var architecture: String?
        /**
         * The boot mode of the virtual machine.
         */
        var bootMode: BootModeValues?
        /**
         * A description of the import task.
         */
        var description: String?
        /**
         * Indicates whether the image is encrypted.
         */
        var encrypted: Boolean?
        /**
         * The target hypervisor for the import task.
         * Valid values: xen
         */
        var hypervisor: String?
        /**
         * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
         */
        var imageId: String?
        /**
         * The ID of the import image task.
         */
        var importTaskId: String?
        /**
         * The identifier for the KMS key that was used to create the encrypted image.
         */
        var kmsKeyId: String?
        /**
         * The ARNs of the license configurations that are associated with the import image task.
         */
        var licenseSpecifications: List<ImportImageLicenseConfigurationResponse>?
        /**
         * The license type of the virtual machine.
         */
        var licenseType: String?
        /**
         * The description string for the import image task.
         */
        var platform: String?
        /**
         * The percentage of progress of the import image task.
         */
        var progress: String?
        /**
         * Information about the snapshots.
         */
        var snapshotDetails: List<SnapshotDetail>?
        /**
         * A brief status for the import image task.
         */
        var status: String?
        /**
         * A descriptive status message for the import image task.
         */
        var statusMessage: String?
        /**
         * The tags for the import image task.
         */
        var tags: List<Tag>?
        /**
         * The usage operation value.
         */
        var usageOperation: String?

        fun build(): ImportImageTask
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var architecture: String? = null
        override var bootMode: BootModeValues? = null
        override var description: String? = null
        override var encrypted: Boolean? = null
        override var hypervisor: String? = null
        override var imageId: String? = null
        override var importTaskId: String? = null
        override var kmsKeyId: String? = null
        override var licenseSpecifications: List<ImportImageLicenseConfigurationResponse>? = null
        override var licenseType: String? = null
        override var platform: String? = null
        override var progress: String? = null
        override var snapshotDetails: List<SnapshotDetail>? = null
        override var status: String? = null
        override var statusMessage: String? = null
        override var tags: List<Tag>? = null
        override var usageOperation: String? = null

        constructor(x: ImportImageTask) : this() {
            this.architecture = x.architecture
            this.bootMode = x.bootMode
            this.description = x.description
            this.encrypted = x.encrypted
            this.hypervisor = x.hypervisor
            this.imageId = x.imageId
            this.importTaskId = x.importTaskId
            this.kmsKeyId = x.kmsKeyId
            this.licenseSpecifications = x.licenseSpecifications
            this.licenseType = x.licenseType
            this.platform = x.platform
            this.progress = x.progress
            this.snapshotDetails = x.snapshotDetails
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.tags = x.tags
            this.usageOperation = x.usageOperation
        }

        override fun build(): ImportImageTask = ImportImageTask(this)
        override fun architecture(architecture: String): FluentBuilder = apply { this.architecture = architecture }
        override fun bootMode(bootMode: BootModeValues): FluentBuilder = apply { this.bootMode = bootMode }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun encrypted(encrypted: Boolean): FluentBuilder = apply { this.encrypted = encrypted }
        override fun hypervisor(hypervisor: String): FluentBuilder = apply { this.hypervisor = hypervisor }
        override fun imageId(imageId: String): FluentBuilder = apply { this.imageId = imageId }
        override fun importTaskId(importTaskId: String): FluentBuilder = apply { this.importTaskId = importTaskId }
        override fun kmsKeyId(kmsKeyId: String): FluentBuilder = apply { this.kmsKeyId = kmsKeyId }
        override fun licenseSpecifications(licenseSpecifications: List<ImportImageLicenseConfigurationResponse>): FluentBuilder = apply { this.licenseSpecifications = licenseSpecifications }
        override fun licenseType(licenseType: String): FluentBuilder = apply { this.licenseType = licenseType }
        override fun platform(platform: String): FluentBuilder = apply { this.platform = platform }
        override fun progress(progress: String): FluentBuilder = apply { this.progress = progress }
        override fun snapshotDetails(snapshotDetails: List<SnapshotDetail>): FluentBuilder = apply { this.snapshotDetails = snapshotDetails }
        override fun status(status: String): FluentBuilder = apply { this.status = status }
        override fun statusMessage(statusMessage: String): FluentBuilder = apply { this.statusMessage = statusMessage }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun usageOperation(usageOperation: String): FluentBuilder = apply { this.usageOperation = usageOperation }
    }
}
