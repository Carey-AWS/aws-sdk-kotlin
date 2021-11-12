// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a replica to be added.
 */
class CreateReplicaAction private constructor(builder: BuilderImpl) {
    /**
     * The Region of the replica to be added.
     */
    val regionName: String? = builder.regionName

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateReplicaAction = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateReplicaAction(")
        append("regionName=$regionName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = regionName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateReplicaAction

        if (regionName != other.regionName) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateReplicaAction = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateReplicaAction
        /**
         * The Region of the replica to be added.
         */
        fun regionName(regionName: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Region of the replica to be added.
         */
        var regionName: String?

        fun build(): CreateReplicaAction
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var regionName: String? = null

        constructor(x: CreateReplicaAction) : this() {
            this.regionName = x.regionName
        }

        override fun build(): CreateReplicaAction = CreateReplicaAction(this)
        override fun regionName(regionName: String): FluentBuilder = apply { this.regionName = regionName }
    }
}
