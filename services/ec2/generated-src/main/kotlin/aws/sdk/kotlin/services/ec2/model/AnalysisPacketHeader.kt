// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a header. Reflects any changes made by a component as traffic passes through.
 * The fields of an inbound header are null except for the first component of a path.
 */
class AnalysisPacketHeader private constructor(builder: BuilderImpl) {
    /**
     * The destination addresses.
     */
    val destinationAddresses: List<String>? = builder.destinationAddresses
    /**
     * The destination port ranges.
     */
    val destinationPortRanges: List<PortRange>? = builder.destinationPortRanges
    /**
     * The protocol.
     */
    val protocol: String? = builder.protocol
    /**
     * The source addresses.
     */
    val sourceAddresses: List<String>? = builder.sourceAddresses
    /**
     * The source port ranges.
     */
    val sourcePortRanges: List<PortRange>? = builder.sourcePortRanges

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AnalysisPacketHeader = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AnalysisPacketHeader(")
        append("destinationAddresses=$destinationAddresses,")
        append("destinationPortRanges=$destinationPortRanges,")
        append("protocol=$protocol,")
        append("sourceAddresses=$sourceAddresses,")
        append("sourcePortRanges=$sourcePortRanges)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationAddresses?.hashCode() ?: 0
        result = 31 * result + (destinationPortRanges?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (sourceAddresses?.hashCode() ?: 0)
        result = 31 * result + (sourcePortRanges?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AnalysisPacketHeader

        if (destinationAddresses != other.destinationAddresses) return false
        if (destinationPortRanges != other.destinationPortRanges) return false
        if (protocol != other.protocol) return false
        if (sourceAddresses != other.sourceAddresses) return false
        if (sourcePortRanges != other.sourcePortRanges) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AnalysisPacketHeader = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AnalysisPacketHeader
        /**
         * The destination addresses.
         */
        fun destinationAddresses(destinationAddresses: List<String>): FluentBuilder
        /**
         * The destination port ranges.
         */
        fun destinationPortRanges(destinationPortRanges: List<PortRange>): FluentBuilder
        /**
         * The protocol.
         */
        fun protocol(protocol: String): FluentBuilder
        /**
         * The source addresses.
         */
        fun sourceAddresses(sourceAddresses: List<String>): FluentBuilder
        /**
         * The source port ranges.
         */
        fun sourcePortRanges(sourcePortRanges: List<PortRange>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The destination addresses.
         */
        var destinationAddresses: List<String>?
        /**
         * The destination port ranges.
         */
        var destinationPortRanges: List<PortRange>?
        /**
         * The protocol.
         */
        var protocol: String?
        /**
         * The source addresses.
         */
        var sourceAddresses: List<String>?
        /**
         * The source port ranges.
         */
        var sourcePortRanges: List<PortRange>?

        fun build(): AnalysisPacketHeader
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var destinationAddresses: List<String>? = null
        override var destinationPortRanges: List<PortRange>? = null
        override var protocol: String? = null
        override var sourceAddresses: List<String>? = null
        override var sourcePortRanges: List<PortRange>? = null

        constructor(x: AnalysisPacketHeader) : this() {
            this.destinationAddresses = x.destinationAddresses
            this.destinationPortRanges = x.destinationPortRanges
            this.protocol = x.protocol
            this.sourceAddresses = x.sourceAddresses
            this.sourcePortRanges = x.sourcePortRanges
        }

        override fun build(): AnalysisPacketHeader = AnalysisPacketHeader(this)
        override fun destinationAddresses(destinationAddresses: List<String>): FluentBuilder = apply { this.destinationAddresses = destinationAddresses }
        override fun destinationPortRanges(destinationPortRanges: List<PortRange>): FluentBuilder = apply { this.destinationPortRanges = destinationPortRanges }
        override fun protocol(protocol: String): FluentBuilder = apply { this.protocol = protocol }
        override fun sourceAddresses(sourceAddresses: List<String>): FluentBuilder = apply { this.sourceAddresses = sourceAddresses }
        override fun sourcePortRanges(sourcePortRanges: List<PortRange>): FluentBuilder = apply { this.sourcePortRanges = sourcePortRanges }
    }
}
