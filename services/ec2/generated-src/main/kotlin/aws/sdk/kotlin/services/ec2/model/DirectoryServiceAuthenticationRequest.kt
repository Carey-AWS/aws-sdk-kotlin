// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Active Directory to be used for client authentication.
 */
class DirectoryServiceAuthenticationRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the Active Directory to be used for authentication.
     */
    val directoryId: String? = builder.directoryId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DirectoryServiceAuthenticationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DirectoryServiceAuthenticationRequest(")
        append("directoryId=$directoryId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = directoryId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DirectoryServiceAuthenticationRequest

        if (directoryId != other.directoryId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DirectoryServiceAuthenticationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DirectoryServiceAuthenticationRequest
        /**
         * The ID of the Active Directory to be used for authentication.
         */
        fun directoryId(directoryId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the Active Directory to be used for authentication.
         */
        var directoryId: String?

        fun build(): DirectoryServiceAuthenticationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var directoryId: String? = null

        constructor(x: DirectoryServiceAuthenticationRequest) : this() {
            this.directoryId = x.directoryId
        }

        override fun build(): DirectoryServiceAuthenticationRequest = DirectoryServiceAuthenticationRequest(this)
        override fun directoryId(directoryId: String): FluentBuilder = apply { this.directoryId = directoryId }
    }
}
