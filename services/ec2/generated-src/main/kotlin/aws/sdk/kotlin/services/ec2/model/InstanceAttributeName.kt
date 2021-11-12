// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class InstanceAttributeName {

    abstract val value: kotlin.String

    object BlockDeviceMapping : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "blockDeviceMapping"
        override fun toString(): kotlin.String = value
    }

    object DisableApiTermination : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "disableApiTermination"
        override fun toString(): kotlin.String = value
    }

    object EbsOptimized : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "ebsOptimized"
        override fun toString(): kotlin.String = value
    }

    object EnaSupport : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "enaSupport"
        override fun toString(): kotlin.String = value
    }

    object EnclaveOptions : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "enclaveOptions"
        override fun toString(): kotlin.String = value
    }

    object GroupSet : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "groupSet"
        override fun toString(): kotlin.String = value
    }

    object InstanceInitiatedShutdownBehavior : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "instanceInitiatedShutdownBehavior"
        override fun toString(): kotlin.String = value
    }

    object InstanceType : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "instanceType"
        override fun toString(): kotlin.String = value
    }

    object Kernel : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "kernel"
        override fun toString(): kotlin.String = value
    }

    object ProductCodes : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "productCodes"
        override fun toString(): kotlin.String = value
    }

    object Ramdisk : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "ramdisk"
        override fun toString(): kotlin.String = value
    }

    object RootDeviceName : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "rootDeviceName"
        override fun toString(): kotlin.String = value
    }

    object SourceDestCheck : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "sourceDestCheck"
        override fun toString(): kotlin.String = value
    }

    object SriovNetSupport : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "sriovNetSupport"
        override fun toString(): kotlin.String = value
    }

    object UserData : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override val value: kotlin.String = "userData"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceAttributeName() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceAttributeName = when(str) {
            "blockDeviceMapping" -> BlockDeviceMapping
            "disableApiTermination" -> DisableApiTermination
            "ebsOptimized" -> EbsOptimized
            "enaSupport" -> EnaSupport
            "enclaveOptions" -> EnclaveOptions
            "groupSet" -> GroupSet
            "instanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior
            "instanceType" -> InstanceType
            "kernel" -> Kernel
            "productCodes" -> ProductCodes
            "ramdisk" -> Ramdisk
            "rootDeviceName" -> RootDeviceName
            "sourceDestCheck" -> SourceDestCheck
            "sriovNetSupport" -> SriovNetSupport
            "userData" -> UserData
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceAttributeName> = listOf(
            BlockDeviceMapping,
            DisableApiTermination,
            EbsOptimized,
            EnaSupport,
            EnclaveOptions,
            GroupSet,
            InstanceInitiatedShutdownBehavior,
            InstanceType,
            Kernel,
            ProductCodes,
            Ramdisk,
            RootDeviceName,
            SourceDestCheck,
            SriovNetSupport,
            UserData
        )
    }
}
