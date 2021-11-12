// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of RegisterImage.
 */
class RegisterImageResponse private constructor(builder: BuilderImpl) {
    /**
     * The ID of the newly registered AMI.
     */
    val imageId: String? = builder.imageId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RegisterImageResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RegisterImageResponse(")
        append("imageId=$imageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = imageId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RegisterImageResponse

        if (imageId != other.imageId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RegisterImageResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RegisterImageResponse
        /**
         * The ID of the newly registered AMI.
         */
        fun imageId(imageId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the newly registered AMI.
         */
        var imageId: String?

        fun build(): RegisterImageResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var imageId: String? = null

        constructor(x: RegisterImageResponse) : this() {
            this.imageId = x.imageId
        }

        override fun build(): RegisterImageResponse = RegisterImageResponse(this)
        override fun imageId(imageId: String): FluentBuilder = apply { this.imageId = imageId }
    }
}
