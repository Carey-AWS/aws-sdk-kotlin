// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a tag.
 */
class Tag private constructor(builder: BuilderImpl) {
    /**
     * The key of the tag.
     * Constraints: Tag keys are case-sensitive and accept a maximum of 127 Unicode characters.
     * May not begin with aws:.
     */
    val key: String? = builder.key
    /**
     * The value of the tag.
     * Constraints: Tag values are case-sensitive and accept a maximum of 255 Unicode characters.
     */
    val value: String? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Tag = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Tag(")
        append("key=$key,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tag

        if (key != other.key) return false
        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Tag = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Tag
        /**
         * The key of the tag.
         * Constraints: Tag keys are case-sensitive and accept a maximum of 127 Unicode characters.
         * May not begin with aws:.
         */
        fun key(key: String): FluentBuilder
        /**
         * The value of the tag.
         * Constraints: Tag values are case-sensitive and accept a maximum of 255 Unicode characters.
         */
        fun value(value: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The key of the tag.
         * Constraints: Tag keys are case-sensitive and accept a maximum of 127 Unicode characters.
         * May not begin with aws:.
         */
        var key: String?
        /**
         * The value of the tag.
         * Constraints: Tag values are case-sensitive and accept a maximum of 255 Unicode characters.
         */
        var value: String?

        fun build(): Tag
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var key: String? = null
        override var value: String? = null

        constructor(x: Tag) : this() {
            this.key = x.key
            this.value = x.value
        }

        override fun build(): Tag = Tag(this)
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun value(value: String): FluentBuilder = apply { this.value = value }
    }
}
