// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketEncryptionResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): PutBucketEncryptionResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketEncryptionResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PutBucketEncryptionResponse

        return true
    }

    interface FluentBuilder {
        fun build(): PutBucketEncryptionResponse
    }

    interface DslBuilder {

        fun build(): PutBucketEncryptionResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: PutBucketEncryptionResponse) : this() {
        }

        override fun build(): PutBucketEncryptionResponse = PutBucketEncryptionResponse(this)
    }
}
