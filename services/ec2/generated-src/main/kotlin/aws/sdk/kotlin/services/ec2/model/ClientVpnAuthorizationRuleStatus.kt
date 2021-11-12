// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the state of an authorization rule.
 */
class ClientVpnAuthorizationRuleStatus private constructor(builder: BuilderImpl) {
    /**
     * The state of the authorization rule.
     */
    val code: ClientVpnAuthorizationRuleStatusCode? = builder.code
    /**
     * A message about the status of the authorization rule, if applicable.
     */
    val message: String? = builder.message

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ClientVpnAuthorizationRuleStatus = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnAuthorizationRuleStatus(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClientVpnAuthorizationRuleStatus

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ClientVpnAuthorizationRuleStatus = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ClientVpnAuthorizationRuleStatus
        /**
         * The state of the authorization rule.
         */
        fun code(code: ClientVpnAuthorizationRuleStatusCode): FluentBuilder
        /**
         * A message about the status of the authorization rule, if applicable.
         */
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The state of the authorization rule.
         */
        var code: ClientVpnAuthorizationRuleStatusCode?
        /**
         * A message about the status of the authorization rule, if applicable.
         */
        var message: String?

        fun build(): ClientVpnAuthorizationRuleStatus
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var code: ClientVpnAuthorizationRuleStatusCode? = null
        override var message: String? = null

        constructor(x: ClientVpnAuthorizationRuleStatus) : this() {
            this.code = x.code
            this.message = x.message
        }

        override fun build(): ClientVpnAuthorizationRuleStatus = ClientVpnAuthorizationRuleStatus(this)
        override fun code(code: ClientVpnAuthorizationRuleStatusCode): FluentBuilder = apply { this.code = code }
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
