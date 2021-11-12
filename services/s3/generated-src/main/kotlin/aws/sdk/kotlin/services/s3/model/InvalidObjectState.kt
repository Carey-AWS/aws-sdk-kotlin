// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * Object is archived and inaccessible until restored.
 */
class InvalidObjectState private constructor(builder: BuilderImpl) : S3Exception() {

    val accessTier: IntelligentTieringAccessTier? = builder.accessTier
    val storageClass: StorageClass? = builder.storageClass

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): InvalidObjectState = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("InvalidObjectState(")
        append("accessTier=$accessTier,")
        append("storageClass=$storageClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accessTier?.hashCode() ?: 0
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InvalidObjectState

        if (accessTier != other.accessTier) return false
        if (storageClass != other.storageClass) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): InvalidObjectState = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): InvalidObjectState
        fun accessTier(accessTier: IntelligentTieringAccessTier): FluentBuilder
        fun storageClass(storageClass: StorageClass): FluentBuilder
    }

    interface DslBuilder {
        var accessTier: IntelligentTieringAccessTier?
        var storageClass: StorageClass?

        fun build(): InvalidObjectState
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var accessTier: IntelligentTieringAccessTier? = null
        override var storageClass: StorageClass? = null

        constructor(x: InvalidObjectState) : this() {
            this.accessTier = x.accessTier
            this.storageClass = x.storageClass
        }

        override fun build(): InvalidObjectState = InvalidObjectState(this)
        override fun accessTier(accessTier: IntelligentTieringAccessTier): FluentBuilder = apply { this.accessTier = accessTier }
        override fun storageClass(storageClass: StorageClass): FluentBuilder = apply { this.storageClass = storageClass }
    }
}
