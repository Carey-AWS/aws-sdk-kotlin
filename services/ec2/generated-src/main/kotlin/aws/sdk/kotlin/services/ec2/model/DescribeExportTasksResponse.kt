// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeExportTasksResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the export tasks.
     */
    val exportTasks: List<ExportTask>? = builder.exportTasks

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeExportTasksResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeExportTasksResponse(")
        append("exportTasks=$exportTasks)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exportTasks?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeExportTasksResponse

        if (exportTasks != other.exportTasks) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeExportTasksResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeExportTasksResponse
        /**
         * Information about the export tasks.
         */
        fun exportTasks(exportTasks: List<ExportTask>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the export tasks.
         */
        var exportTasks: List<ExportTask>?

        fun build(): DescribeExportTasksResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var exportTasks: List<ExportTask>? = null

        constructor(x: DescribeExportTasksResponse) : this() {
            this.exportTasks = x.exportTasks
        }

        override fun build(): DescribeExportTasksResponse = DescribeExportTasksResponse(this)
        override fun exportTasks(exportTasks: List<ExportTask>): FluentBuilder = apply { this.exportTasks = exportTasks }
    }
}
