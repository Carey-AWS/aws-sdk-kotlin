// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceIamInstanceProfileAssociationResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the IAM instance profile association.
     */
    val iamInstanceProfileAssociation: IamInstanceProfileAssociation? = builder.iamInstanceProfileAssociation

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplaceIamInstanceProfileAssociationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceIamInstanceProfileAssociationResponse(")
        append("iamInstanceProfileAssociation=$iamInstanceProfileAssociation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = iamInstanceProfileAssociation?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplaceIamInstanceProfileAssociationResponse

        if (iamInstanceProfileAssociation != other.iamInstanceProfileAssociation) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplaceIamInstanceProfileAssociationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplaceIamInstanceProfileAssociationResponse
        /**
         * Information about the IAM instance profile association.
         */
        fun iamInstanceProfileAssociation(iamInstanceProfileAssociation: IamInstanceProfileAssociation): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the IAM instance profile association.
         */
        var iamInstanceProfileAssociation: IamInstanceProfileAssociation?

        fun build(): ReplaceIamInstanceProfileAssociationResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation] inside the given [block]
         */
        fun iamInstanceProfileAssociation(block: IamInstanceProfileAssociation.DslBuilder.() -> kotlin.Unit) {
            this.iamInstanceProfileAssociation = IamInstanceProfileAssociation.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var iamInstanceProfileAssociation: IamInstanceProfileAssociation? = null

        constructor(x: ReplaceIamInstanceProfileAssociationResponse) : this() {
            this.iamInstanceProfileAssociation = x.iamInstanceProfileAssociation
        }

        override fun build(): ReplaceIamInstanceProfileAssociationResponse = ReplaceIamInstanceProfileAssociationResponse(this)
        override fun iamInstanceProfileAssociation(iamInstanceProfileAssociation: IamInstanceProfileAssociation): FluentBuilder = apply { this.iamInstanceProfileAssociation = iamInstanceProfileAssociation }
    }
}
