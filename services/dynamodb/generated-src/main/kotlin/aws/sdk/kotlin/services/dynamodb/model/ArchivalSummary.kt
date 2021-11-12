// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains details of a table archival operation.
 */
class ArchivalSummary private constructor(builder: BuilderImpl) {
    /**
     * The Amazon Resource Name (ARN) of the backup the table was archived
     * to, when applicable in the archival reason. If you wish to restore this
     * backup to the same table name, you will need to delete the original
     * table.
     */
    val archivalBackupArn: String? = builder.archivalBackupArn
    /**
     * The date and time when table archival was initiated by DynamoDB,
     * in UNIX epoch time format.
     */
    val archivalDateTime: Instant? = builder.archivalDateTime
    /**
     * The reason DynamoDB archived the table. Currently, the only
     * possible value is:
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS - The
     * table was archived due to the table's AWS KMS key being inaccessible
     * for more than seven days. An On-Demand backup was created at the archival
     * time.
     */
    val archivalReason: String? = builder.archivalReason

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ArchivalSummary = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ArchivalSummary(")
        append("archivalBackupArn=$archivalBackupArn,")
        append("archivalDateTime=$archivalDateTime,")
        append("archivalReason=$archivalReason)")
    }

    override fun hashCode(): kotlin.Int {
        var result = archivalBackupArn?.hashCode() ?: 0
        result = 31 * result + (archivalDateTime?.hashCode() ?: 0)
        result = 31 * result + (archivalReason?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArchivalSummary

        if (archivalBackupArn != other.archivalBackupArn) return false
        if (archivalDateTime != other.archivalDateTime) return false
        if (archivalReason != other.archivalReason) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ArchivalSummary = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ArchivalSummary
        /**
         * The Amazon Resource Name (ARN) of the backup the table was archived
         * to, when applicable in the archival reason. If you wish to restore this
         * backup to the same table name, you will need to delete the original
         * table.
         */
        fun archivalBackupArn(archivalBackupArn: String): FluentBuilder
        /**
         * The date and time when table archival was initiated by DynamoDB,
         * in UNIX epoch time format.
         */
        fun archivalDateTime(archivalDateTime: Instant): FluentBuilder
        /**
         * The reason DynamoDB archived the table. Currently, the only
         * possible value is:
         * INACCESSIBLE_ENCRYPTION_CREDENTIALS - The
         * table was archived due to the table's AWS KMS key being inaccessible
         * for more than seven days. An On-Demand backup was created at the archival
         * time.
         */
        fun archivalReason(archivalReason: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Amazon Resource Name (ARN) of the backup the table was archived
         * to, when applicable in the archival reason. If you wish to restore this
         * backup to the same table name, you will need to delete the original
         * table.
         */
        var archivalBackupArn: String?
        /**
         * The date and time when table archival was initiated by DynamoDB,
         * in UNIX epoch time format.
         */
        var archivalDateTime: Instant?
        /**
         * The reason DynamoDB archived the table. Currently, the only
         * possible value is:
         * INACCESSIBLE_ENCRYPTION_CREDENTIALS - The
         * table was archived due to the table's AWS KMS key being inaccessible
         * for more than seven days. An On-Demand backup was created at the archival
         * time.
         */
        var archivalReason: String?

        fun build(): ArchivalSummary
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var archivalBackupArn: String? = null
        override var archivalDateTime: Instant? = null
        override var archivalReason: String? = null

        constructor(x: ArchivalSummary) : this() {
            this.archivalBackupArn = x.archivalBackupArn
            this.archivalDateTime = x.archivalDateTime
            this.archivalReason = x.archivalReason
        }

        override fun build(): ArchivalSummary = ArchivalSummary(this)
        override fun archivalBackupArn(archivalBackupArn: String): FluentBuilder = apply { this.archivalBackupArn = archivalBackupArn }
        override fun archivalDateTime(archivalDateTime: Instant): FluentBuilder = apply { this.archivalDateTime = archivalDateTime }
        override fun archivalReason(archivalReason: String): FluentBuilder = apply { this.archivalReason = archivalReason }
    }
}
