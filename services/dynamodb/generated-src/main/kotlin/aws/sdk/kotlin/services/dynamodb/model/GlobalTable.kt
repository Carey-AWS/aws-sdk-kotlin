// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a global table.
 */
class GlobalTable private constructor(builder: BuilderImpl) {
    /**
     * The global table name.
     */
    val globalTableName: String? = builder.globalTableName
    /**
     * The Regions where the global table has replicas.
     */
    val replicationGroup: List<Replica>? = builder.replicationGroup

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GlobalTable = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GlobalTable(")
        append("globalTableName=$globalTableName,")
        append("replicationGroup=$replicationGroup)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalTableName?.hashCode() ?: 0
        result = 31 * result + (replicationGroup?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GlobalTable

        if (globalTableName != other.globalTableName) return false
        if (replicationGroup != other.replicationGroup) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GlobalTable = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GlobalTable
        /**
         * The global table name.
         */
        fun globalTableName(globalTableName: String): FluentBuilder
        /**
         * The Regions where the global table has replicas.
         */
        fun replicationGroup(replicationGroup: List<Replica>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The global table name.
         */
        var globalTableName: String?
        /**
         * The Regions where the global table has replicas.
         */
        var replicationGroup: List<Replica>?

        fun build(): GlobalTable
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var globalTableName: String? = null
        override var replicationGroup: List<Replica>? = null

        constructor(x: GlobalTable) : this() {
            this.globalTableName = x.globalTableName
            this.replicationGroup = x.replicationGroup
        }

        override fun build(): GlobalTable = GlobalTable(this)
        override fun globalTableName(globalTableName: String): FluentBuilder = apply { this.globalTableName = globalTableName }
        override fun replicationGroup(replicationGroup: List<Replica>): FluentBuilder = apply { this.replicationGroup = replicationGroup }
    }
}
