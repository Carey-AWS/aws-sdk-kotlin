// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for describing a condition that must be met for the specified redirect to
 * apply. For example, 1. If request is for pages in the /docs folder, redirect
 * to the /documents folder. 2. If request results in HTTP error 4xx, redirect
 * request to another host where you might process the error.
 */
class Condition private constructor(builder: BuilderImpl) {
    /**
     * The HTTP error code when the redirect is applied. In the event of an error, if the error
     * code equals this value, then the specified redirect is applied. Required when parent
     * element Condition is specified and sibling KeyPrefixEquals is not
     * specified. If both are specified, then both must be true for the redirect to be
     * applied.
     */
    val httpErrorCodeReturnedEquals: String? = builder.httpErrorCodeReturnedEquals
    /**
     * The object key name prefix when the redirect is applied. For example, to redirect
     * requests for ExamplePage.html, the key prefix will be
     * ExamplePage.html. To redirect request for all pages with the prefix
     * docs/, the key prefix will be /docs, which identifies all
     * objects in the docs/ folder. Required when the parent element
     * Condition is specified and sibling HttpErrorCodeReturnedEquals
     * is not specified. If both conditions are specified, both must be true for the redirect to
     * be applied.
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using
     * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML related object key constraints.
     */
    val keyPrefixEquals: String? = builder.keyPrefixEquals

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Condition = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Condition(")
        append("httpErrorCodeReturnedEquals=$httpErrorCodeReturnedEquals,")
        append("keyPrefixEquals=$keyPrefixEquals)")
    }

    override fun hashCode(): kotlin.Int {
        var result = httpErrorCodeReturnedEquals?.hashCode() ?: 0
        result = 31 * result + (keyPrefixEquals?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Condition

        if (httpErrorCodeReturnedEquals != other.httpErrorCodeReturnedEquals) return false
        if (keyPrefixEquals != other.keyPrefixEquals) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Condition = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Condition
        /**
         * The HTTP error code when the redirect is applied. In the event of an error, if the error
         * code equals this value, then the specified redirect is applied. Required when parent
         * element Condition is specified and sibling KeyPrefixEquals is not
         * specified. If both are specified, then both must be true for the redirect to be
         * applied.
         */
        fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String): FluentBuilder
        /**
         * The object key name prefix when the redirect is applied. For example, to redirect
         * requests for ExamplePage.html, the key prefix will be
         * ExamplePage.html. To redirect request for all pages with the prefix
         * docs/, the key prefix will be /docs, which identifies all
         * objects in the docs/ folder. Required when the parent element
         * Condition is specified and sibling HttpErrorCodeReturnedEquals
         * is not specified. If both conditions are specified, both must be true for the redirect to
         * be applied.
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints.
         */
        fun keyPrefixEquals(keyPrefixEquals: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The HTTP error code when the redirect is applied. In the event of an error, if the error
         * code equals this value, then the specified redirect is applied. Required when parent
         * element Condition is specified and sibling KeyPrefixEquals is not
         * specified. If both are specified, then both must be true for the redirect to be
         * applied.
         */
        var httpErrorCodeReturnedEquals: String?
        /**
         * The object key name prefix when the redirect is applied. For example, to redirect
         * requests for ExamplePage.html, the key prefix will be
         * ExamplePage.html. To redirect request for all pages with the prefix
         * docs/, the key prefix will be /docs, which identifies all
         * objects in the docs/ folder. Required when the parent element
         * Condition is specified and sibling HttpErrorCodeReturnedEquals
         * is not specified. If both conditions are specified, both must be true for the redirect to
         * be applied.
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints.
         */
        var keyPrefixEquals: String?

        fun build(): Condition
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var httpErrorCodeReturnedEquals: String? = null
        override var keyPrefixEquals: String? = null

        constructor(x: Condition) : this() {
            this.httpErrorCodeReturnedEquals = x.httpErrorCodeReturnedEquals
            this.keyPrefixEquals = x.keyPrefixEquals
        }

        override fun build(): Condition = Condition(this)
        override fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String): FluentBuilder = apply { this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals }
        override fun keyPrefixEquals(keyPrefixEquals: String): FluentBuilder = apply { this.keyPrefixEquals = keyPrefixEquals }
    }
}
