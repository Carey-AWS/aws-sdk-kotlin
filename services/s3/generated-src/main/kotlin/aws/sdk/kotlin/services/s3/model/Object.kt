// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * An object consists of data and its descriptive metadata.
 */
class Object private constructor(builder: BuilderImpl) {
    /**
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents
     * of an object, not its metadata. The ETag may or may not be an MD5 digest of the object
     * data. Whether or not it is depends on how the object was created and how it is encrypted as
     * described below:
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the
     * Amazon Web Services Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are
     * an MD5 digest of their object data.
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the
     * Amazon Web Services Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are
     * not an MD5 digest of their object data.
     * If an object is created by either the Multipart Upload or Part Copy operation, the
     * ETag is not an MD5 digest, regardless of the method of encryption.
     */
    val eTag: String? = builder.eTag
    /**
     * The name that you assign to an object. You use the object key to retrieve the
     * object.
     */
    val key: String? = builder.key
    /**
     * Creation date of the object.
     */
    val lastModified: Instant? = builder.lastModified
    /**
     * The owner of the object
     */
    val owner: Owner? = builder.owner
    /**
     * Size in bytes of the object
     */
    val size: Long = builder.size
    /**
     * The class of storage used to store the object.
     */
    val storageClass: ObjectStorageClass? = builder.storageClass

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Object = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Object(")
        append("eTag=$eTag,")
        append("key=$key,")
        append("lastModified=$lastModified,")
        append("owner=$owner,")
        append("size=$size,")
        append("storageClass=$storageClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eTag?.hashCode() ?: 0
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        result = 31 * result + (owner?.hashCode() ?: 0)
        result = 31 * result + (size.hashCode())
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Object

        if (eTag != other.eTag) return false
        if (key != other.key) return false
        if (lastModified != other.lastModified) return false
        if (owner != other.owner) return false
        if (size != other.size) return false
        if (storageClass != other.storageClass) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Object = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Object
        /**
         * The entity tag is a hash of the object. The ETag reflects changes only to the contents
         * of an object, not its metadata. The ETag may or may not be an MD5 digest of the object
         * data. Whether or not it is depends on how the object was created and how it is encrypted as
         * described below:
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are
         * an MD5 digest of their object data.
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are
         * not an MD5 digest of their object data.
         * If an object is created by either the Multipart Upload or Part Copy operation, the
         * ETag is not an MD5 digest, regardless of the method of encryption.
         */
        fun eTag(eTag: String): FluentBuilder
        /**
         * The name that you assign to an object. You use the object key to retrieve the
         * object.
         */
        fun key(key: String): FluentBuilder
        /**
         * Creation date of the object.
         */
        fun lastModified(lastModified: Instant): FluentBuilder
        /**
         * The owner of the object
         */
        fun owner(owner: Owner): FluentBuilder
        /**
         * Size in bytes of the object
         */
        fun size(size: Long): FluentBuilder
        /**
         * The class of storage used to store the object.
         */
        fun storageClass(storageClass: ObjectStorageClass): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The entity tag is a hash of the object. The ETag reflects changes only to the contents
         * of an object, not its metadata. The ETag may or may not be an MD5 digest of the object
         * data. Whether or not it is depends on how the object was created and how it is encrypted as
         * described below:
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are
         * an MD5 digest of their object data.
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are
         * not an MD5 digest of their object data.
         * If an object is created by either the Multipart Upload or Part Copy operation, the
         * ETag is not an MD5 digest, regardless of the method of encryption.
         */
        var eTag: String?
        /**
         * The name that you assign to an object. You use the object key to retrieve the
         * object.
         */
        var key: String?
        /**
         * Creation date of the object.
         */
        var lastModified: Instant?
        /**
         * The owner of the object
         */
        var owner: Owner?
        /**
         * Size in bytes of the object
         */
        var size: Long
        /**
         * The class of storage used to store the object.
         */
        var storageClass: ObjectStorageClass?

        fun build(): Object
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Owner] inside the given [block]
         */
        fun owner(block: Owner.DslBuilder.() -> kotlin.Unit) {
            this.owner = Owner.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var eTag: String? = null
        override var key: String? = null
        override var lastModified: Instant? = null
        override var owner: Owner? = null
        override var size: Long = 0L
        override var storageClass: ObjectStorageClass? = null

        constructor(x: Object) : this() {
            this.eTag = x.eTag
            this.key = x.key
            this.lastModified = x.lastModified
            this.owner = x.owner
            this.size = x.size
            this.storageClass = x.storageClass
        }

        override fun build(): Object = Object(this)
        override fun eTag(eTag: String): FluentBuilder = apply { this.eTag = eTag }
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun lastModified(lastModified: Instant): FluentBuilder = apply { this.lastModified = lastModified }
        override fun owner(owner: Owner): FluentBuilder = apply { this.owner = owner }
        override fun size(size: Long): FluentBuilder = apply { this.size = size }
        override fun storageClass(storageClass: ObjectStorageClass): FluentBuilder = apply { this.storageClass = storageClass }
    }
}
