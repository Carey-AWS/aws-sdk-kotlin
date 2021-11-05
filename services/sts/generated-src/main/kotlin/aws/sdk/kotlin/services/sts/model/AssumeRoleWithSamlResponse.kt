// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



/**
 * Contains the response to a successful AssumeRoleWithSAML request,
 * including temporary Amazon Web Services credentials that can be used to make Amazon Web Services requests.
 */
class AssumeRoleWithSamlResponse private constructor(builder: BuilderImpl) {
    /**
     * The identifiers for the temporary security credentials that the operation
     * returns.
     */
    val assumedRoleUser: AssumedRoleUser? = builder.assumedRoleUser
    /**
     * The value of the Recipient attribute of the
     * SubjectConfirmationData element of the SAML assertion.
     */
    val audience: String? = builder.audience
    /**
     * The temporary security credentials, which include an access key ID, a secret access key,
     * and a security (or session) token.
     * The size of the security token that STS API operations return is not fixed. We
     * strongly recommend that you make no assumptions about the maximum size.
     */
    val credentials: Credentials? = builder.credentials
    /**
     * The value of the Issuer element of the SAML assertion.
     */
    val issuer: String? = builder.issuer
    /**
     * A hash value based on the concatenation of the following:
     * The Issuer response value.
     * The Amazon Web Services account ID.
     * The friendly name (the last part of the ARN) of the SAML provider in IAM.
     * The combination of NameQualifier and Subject can be used to
     * uniquely identify a federated user.
     * The following pseudocode shows how the hash value is calculated:
     * BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )
     */
    val nameQualifier: String? = builder.nameQualifier
    /**
     * A percentage value that indicates the packed size of the session policies and session
     * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
     * which means the policies and tags exceeded the allowed space.
     */
    val packedPolicySize: Int? = builder.packedPolicySize
    /**
     * The value in the SourceIdentity attribute in the SAML assertion.
     * You can require users to set a source identity value when they assume a role. You do
     * this by using the sts:SourceIdentity condition key in a role trust policy.
     * That way, actions that are taken with the role are associated with that user. After the
     * source identity is set, the value cannot be changed. It is present in the request for all
     * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
     * role sessions. You can configure your SAML identity provider to use an attribute
     * associated with your users, like user name or email, as the source identity when calling
     * AssumeRoleWithSAML. You do this by adding an attribute to the SAML
     * assertion. For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
     * actions taken with assumed roles in the
     * IAM User Guide.
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
     * also include underscores or any of the following characters: =,.@-
     */
    val sourceIdentity: String? = builder.sourceIdentity
    /**
     * The value of the NameID element in the Subject element of the
     * SAML assertion.
     */
    val subject: String? = builder.subject
    /**
     * The format of the name ID, as defined by the Format attribute in the
     * NameID element of the SAML assertion. Typical examples of the format are
     * transient or persistent.
     * If the format includes the prefix
     * urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For
     * example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as
     * transient. If the format includes any other prefix, the format is returned
     * with no modifications.
     */
    val subjectType: String? = builder.subjectType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AssumeRoleWithSamlResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AssumeRoleWithSamlResponse(")
        append("assumedRoleUser=$assumedRoleUser,")
        append("audience=$audience,")
        append("credentials=$credentials,")
        append("issuer=$issuer,")
        append("nameQualifier=$nameQualifier,")
        append("packedPolicySize=$packedPolicySize,")
        append("sourceIdentity=$sourceIdentity,")
        append("subject=$subject,")
        append("subjectType=$subjectType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = assumedRoleUser?.hashCode() ?: 0
        result = 31 * result + (audience?.hashCode() ?: 0)
        result = 31 * result + (credentials?.hashCode() ?: 0)
        result = 31 * result + (issuer?.hashCode() ?: 0)
        result = 31 * result + (nameQualifier?.hashCode() ?: 0)
        result = 31 * result + (packedPolicySize ?: 0)
        result = 31 * result + (sourceIdentity?.hashCode() ?: 0)
        result = 31 * result + (subject?.hashCode() ?: 0)
        result = 31 * result + (subjectType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AssumeRoleWithSamlResponse

        if (assumedRoleUser != other.assumedRoleUser) return false
        if (audience != other.audience) return false
        if (credentials != other.credentials) return false
        if (issuer != other.issuer) return false
        if (nameQualifier != other.nameQualifier) return false
        if (packedPolicySize != other.packedPolicySize) return false
        if (sourceIdentity != other.sourceIdentity) return false
        if (subject != other.subject) return false
        if (subjectType != other.subjectType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AssumeRoleWithSamlResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AssumeRoleWithSamlResponse
        /**
         * The identifiers for the temporary security credentials that the operation
         * returns.
         */
        fun assumedRoleUser(assumedRoleUser: AssumedRoleUser): FluentBuilder
        /**
         * The value of the Recipient attribute of the
         * SubjectConfirmationData element of the SAML assertion.
         */
        fun audience(audience: String): FluentBuilder
        /**
         * The temporary security credentials, which include an access key ID, a secret access key,
         * and a security (or session) token.
         * The size of the security token that STS API operations return is not fixed. We
         * strongly recommend that you make no assumptions about the maximum size.
         */
        fun credentials(credentials: Credentials): FluentBuilder
        /**
         * The value of the Issuer element of the SAML assertion.
         */
        fun issuer(issuer: String): FluentBuilder
        /**
         * A hash value based on the concatenation of the following:
         * The Issuer response value.
         * The Amazon Web Services account ID.
         * The friendly name (the last part of the ARN) of the SAML provider in IAM.
         * The combination of NameQualifier and Subject can be used to
         * uniquely identify a federated user.
         * The following pseudocode shows how the hash value is calculated:
         * BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )
         */
        fun nameQualifier(nameQualifier: String): FluentBuilder
        /**
         * A percentage value that indicates the packed size of the session policies and session
         * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
         * which means the policies and tags exceeded the allowed space.
         */
        fun packedPolicySize(packedPolicySize: Int): FluentBuilder
        /**
         * The value in the SourceIdentity attribute in the SAML assertion.
         * You can require users to set a source identity value when they assume a role. You do
         * this by using the sts:SourceIdentity condition key in a role trust policy.
         * That way, actions that are taken with the role are associated with that user. After the
         * source identity is set, the value cannot be changed. It is present in the request for all
         * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
         * role sessions. You can configure your SAML identity provider to use an attribute
         * associated with your users, like user name or email, as the source identity when calling
         * AssumeRoleWithSAML. You do this by adding an attribute to the SAML
         * assertion. For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
         * actions taken with assumed roles in the
         * IAM User Guide.
         * The regex used to validate this parameter is a string of characters
         * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
         * also include underscores or any of the following characters: =,.@-
         */
        fun sourceIdentity(sourceIdentity: String): FluentBuilder
        /**
         * The value of the NameID element in the Subject element of the
         * SAML assertion.
         */
        fun subject(subject: String): FluentBuilder
        /**
         * The format of the name ID, as defined by the Format attribute in the
         * NameID element of the SAML assertion. Typical examples of the format are
         * transient or persistent.
         * If the format includes the prefix
         * urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For
         * example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as
         * transient. If the format includes any other prefix, the format is returned
         * with no modifications.
         */
        fun subjectType(subjectType: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The identifiers for the temporary security credentials that the operation
         * returns.
         */
        var assumedRoleUser: AssumedRoleUser?
        /**
         * The value of the Recipient attribute of the
         * SubjectConfirmationData element of the SAML assertion.
         */
        var audience: String?
        /**
         * The temporary security credentials, which include an access key ID, a secret access key,
         * and a security (or session) token.
         * The size of the security token that STS API operations return is not fixed. We
         * strongly recommend that you make no assumptions about the maximum size.
         */
        var credentials: Credentials?
        /**
         * The value of the Issuer element of the SAML assertion.
         */
        var issuer: String?
        /**
         * A hash value based on the concatenation of the following:
         * The Issuer response value.
         * The Amazon Web Services account ID.
         * The friendly name (the last part of the ARN) of the SAML provider in IAM.
         * The combination of NameQualifier and Subject can be used to
         * uniquely identify a federated user.
         * The following pseudocode shows how the hash value is calculated:
         * BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )
         */
        var nameQualifier: String?
        /**
         * A percentage value that indicates the packed size of the session policies and session
         * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
         * which means the policies and tags exceeded the allowed space.
         */
        var packedPolicySize: Int?
        /**
         * The value in the SourceIdentity attribute in the SAML assertion.
         * You can require users to set a source identity value when they assume a role. You do
         * this by using the sts:SourceIdentity condition key in a role trust policy.
         * That way, actions that are taken with the role are associated with that user. After the
         * source identity is set, the value cannot be changed. It is present in the request for all
         * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
         * role sessions. You can configure your SAML identity provider to use an attribute
         * associated with your users, like user name or email, as the source identity when calling
         * AssumeRoleWithSAML. You do this by adding an attribute to the SAML
         * assertion. For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
         * actions taken with assumed roles in the
         * IAM User Guide.
         * The regex used to validate this parameter is a string of characters
         * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
         * also include underscores or any of the following characters: =,.@-
         */
        var sourceIdentity: String?
        /**
         * The value of the NameID element in the Subject element of the
         * SAML assertion.
         */
        var subject: String?
        /**
         * The format of the name ID, as defined by the Format attribute in the
         * NameID element of the SAML assertion. Typical examples of the format are
         * transient or persistent.
         * If the format includes the prefix
         * urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For
         * example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as
         * transient. If the format includes any other prefix, the format is returned
         * with no modifications.
         */
        var subjectType: String?

        fun build(): AssumeRoleWithSamlResponse
        /**
         * construct an [aws.sdk.kotlin.services.sts.model.AssumedRoleUser] inside the given [block]
         */
        fun assumedRoleUser(block: AssumedRoleUser.DslBuilder.() -> kotlin.Unit) {
            this.assumedRoleUser = AssumedRoleUser.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.sts.model.Credentials] inside the given [block]
         */
        fun credentials(block: Credentials.DslBuilder.() -> kotlin.Unit) {
            this.credentials = Credentials.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var assumedRoleUser: AssumedRoleUser? = null
        override var audience: String? = null
        override var credentials: Credentials? = null
        override var issuer: String? = null
        override var nameQualifier: String? = null
        override var packedPolicySize: Int? = null
        override var sourceIdentity: String? = null
        override var subject: String? = null
        override var subjectType: String? = null

        constructor(x: AssumeRoleWithSamlResponse) : this() {
            this.assumedRoleUser = x.assumedRoleUser
            this.audience = x.audience
            this.credentials = x.credentials
            this.issuer = x.issuer
            this.nameQualifier = x.nameQualifier
            this.packedPolicySize = x.packedPolicySize
            this.sourceIdentity = x.sourceIdentity
            this.subject = x.subject
            this.subjectType = x.subjectType
        }

        override fun build(): AssumeRoleWithSamlResponse = AssumeRoleWithSamlResponse(this)
        override fun assumedRoleUser(assumedRoleUser: AssumedRoleUser): FluentBuilder = apply { this.assumedRoleUser = assumedRoleUser }
        override fun audience(audience: String): FluentBuilder = apply { this.audience = audience }
        override fun credentials(credentials: Credentials): FluentBuilder = apply { this.credentials = credentials }
        override fun issuer(issuer: String): FluentBuilder = apply { this.issuer = issuer }
        override fun nameQualifier(nameQualifier: String): FluentBuilder = apply { this.nameQualifier = nameQualifier }
        override fun packedPolicySize(packedPolicySize: Int): FluentBuilder = apply { this.packedPolicySize = packedPolicySize }
        override fun sourceIdentity(sourceIdentity: String): FluentBuilder = apply { this.sourceIdentity = sourceIdentity }
        override fun subject(subject: String): FluentBuilder = apply { this.subject = subject }
        override fun subjectType(subjectType: String): FluentBuilder = apply { this.subjectType = subjectType }
    }
}
