// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketWebsiteResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteBucketWebsiteResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketWebsiteResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteBucketWebsiteResponse

        return true
    }

    interface FluentBuilder {
        fun build(): DeleteBucketWebsiteResponse
    }

    interface DslBuilder {

        fun build(): DeleteBucketWebsiteResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DeleteBucketWebsiteResponse) : this() {
        }

        override fun build(): DeleteBucketWebsiteResponse = DeleteBucketWebsiteResponse(this)
    }
}
