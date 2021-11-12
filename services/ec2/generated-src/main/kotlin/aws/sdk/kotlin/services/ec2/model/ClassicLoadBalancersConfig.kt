// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Classic Load Balancers to attach to a Spot Fleet. Spot Fleet registers
 * the running Spot Instances with these Classic Load Balancers.
 */
class ClassicLoadBalancersConfig private constructor(builder: BuilderImpl) {
    /**
     * One or more Classic Load Balancers.
     */
    val classicLoadBalancers: List<ClassicLoadBalancer>? = builder.classicLoadBalancers

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ClassicLoadBalancersConfig = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ClassicLoadBalancersConfig(")
        append("classicLoadBalancers=$classicLoadBalancers)")
    }

    override fun hashCode(): kotlin.Int {
        var result = classicLoadBalancers?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClassicLoadBalancersConfig

        if (classicLoadBalancers != other.classicLoadBalancers) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ClassicLoadBalancersConfig = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ClassicLoadBalancersConfig
        /**
         * One or more Classic Load Balancers.
         */
        fun classicLoadBalancers(classicLoadBalancers: List<ClassicLoadBalancer>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * One or more Classic Load Balancers.
         */
        var classicLoadBalancers: List<ClassicLoadBalancer>?

        fun build(): ClassicLoadBalancersConfig
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var classicLoadBalancers: List<ClassicLoadBalancer>? = null

        constructor(x: ClassicLoadBalancersConfig) : this() {
            this.classicLoadBalancers = x.classicLoadBalancers
        }

        override fun build(): ClassicLoadBalancersConfig = ClassicLoadBalancersConfig(this)
        override fun classicLoadBalancers(classicLoadBalancers: List<ClassicLoadBalancer>): FluentBuilder = apply { this.classicLoadBalancers = classicLoadBalancers }
    }
}
