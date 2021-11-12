// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for the person being granted permissions.
 */
class Grantee private constructor(builder: BuilderImpl) {
    /**
     * Screen name of the grantee.
     */
    val displayName: String? = builder.displayName
    /**
     * Email address of the grantee.
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * US East (N. Virginia)
     * US West (N. California)
     * US West (Oregon)
     * Asia Pacific (Singapore)
     * Asia Pacific (Sydney)
     * Asia Pacific (Tokyo)
     * Europe (Ireland)
     * South America (São Paulo)
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints in the Amazon Web Services General Reference.
     */
    val emailAddress: String? = builder.emailAddress
    /**
     * The canonical user ID of the grantee.
     */
    val id: String? = builder.id
    /**
     * Type of grantee
     */
    val type: Type? = builder.type
    /**
     * URI of the grantee group.
     */
    val uri: String? = builder.uri

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Grantee = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Grantee(")
        append("displayName=$displayName,")
        append("emailAddress=$emailAddress,")
        append("id=$id,")
        append("type=$type,")
        append("uri=$uri)")
    }

    override fun hashCode(): kotlin.Int {
        var result = displayName?.hashCode() ?: 0
        result = 31 * result + (emailAddress?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (uri?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Grantee

        if (displayName != other.displayName) return false
        if (emailAddress != other.emailAddress) return false
        if (id != other.id) return false
        if (type != other.type) return false
        if (uri != other.uri) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Grantee = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Grantee
        /**
         * Screen name of the grantee.
         */
        fun displayName(displayName: String): FluentBuilder
        /**
         * Email address of the grantee.
         * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
         * US East (N. Virginia)
         * US West (N. California)
         * US West (Oregon)
         * Asia Pacific (Singapore)
         * Asia Pacific (Sydney)
         * Asia Pacific (Tokyo)
         * Europe (Ireland)
         * South America (São Paulo)
         * For a list of all the Amazon S3 supported Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints in the Amazon Web Services General Reference.
         */
        fun emailAddress(emailAddress: String): FluentBuilder
        /**
         * The canonical user ID of the grantee.
         */
        fun id(id: String): FluentBuilder
        /**
         * Type of grantee
         */
        fun type(type: Type): FluentBuilder
        /**
         * URI of the grantee group.
         */
        fun uri(uri: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Screen name of the grantee.
         */
        var displayName: String?
        /**
         * Email address of the grantee.
         * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
         * US East (N. Virginia)
         * US West (N. California)
         * US West (Oregon)
         * Asia Pacific (Singapore)
         * Asia Pacific (Sydney)
         * Asia Pacific (Tokyo)
         * Europe (Ireland)
         * South America (São Paulo)
         * For a list of all the Amazon S3 supported Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints in the Amazon Web Services General Reference.
         */
        var emailAddress: String?
        /**
         * The canonical user ID of the grantee.
         */
        var id: String?
        /**
         * Type of grantee
         */
        var type: Type?
        /**
         * URI of the grantee group.
         */
        var uri: String?

        fun build(): Grantee
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var displayName: String? = null
        override var emailAddress: String? = null
        override var id: String? = null
        override var type: Type? = null
        override var uri: String? = null

        constructor(x: Grantee) : this() {
            this.displayName = x.displayName
            this.emailAddress = x.emailAddress
            this.id = x.id
            this.type = x.type
            this.uri = x.uri
        }

        override fun build(): Grantee = Grantee(this)
        override fun displayName(displayName: String): FluentBuilder = apply { this.displayName = displayName }
        override fun emailAddress(emailAddress: String): FluentBuilder = apply { this.emailAddress = emailAddress }
        override fun id(id: String): FluentBuilder = apply { this.id = id }
        override fun type(type: Type): FluentBuilder = apply { this.type = type }
        override fun uri(uri: String): FluentBuilder = apply { this.uri = uri }
    }
}
