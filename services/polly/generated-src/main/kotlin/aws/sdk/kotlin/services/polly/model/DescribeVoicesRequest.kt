// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



class DescribeVoicesRequest private constructor(builder: BuilderImpl) {
    /**
     * Specifies the engine (standard or neural)
     * used by Amazon Polly when processing input text for speech synthesis.
     */
    val engine: Engine? = builder.engine
    /**
     * Boolean value indicating whether to return any bilingual voices that
     * use the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an Italian
     * voice that speaks both Italian (it-IT) and US English, that voice will be
     * included if you specify yes but not if you specify
     * no.
     */
    val includeAdditionalLanguageCodes: Boolean = builder.includeAdditionalLanguageCodes
    /**
     * The language identification tag (ISO 639 code for the language
     * name-ISO 3166 country code) for filtering the list of voices returned. If
     * you don't specify this optional parameter, all available voices are
     * returned.
     */
    val languageCode: LanguageCode? = builder.languageCode
    /**
     * An opaque pagination token returned from the previous
     * DescribeVoices operation. If present, this indicates where
     * to continue the listing.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeVoicesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVoicesRequest(")
        append("engine=$engine,")
        append("includeAdditionalLanguageCodes=$includeAdditionalLanguageCodes,")
        append("languageCode=$languageCode,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = engine?.hashCode() ?: 0
        result = 31 * result + (includeAdditionalLanguageCodes.hashCode())
        result = 31 * result + (languageCode?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeVoicesRequest

        if (engine != other.engine) return false
        if (includeAdditionalLanguageCodes != other.includeAdditionalLanguageCodes) return false
        if (languageCode != other.languageCode) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeVoicesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeVoicesRequest
        /**
         * Specifies the engine (standard or neural)
         * used by Amazon Polly when processing input text for speech synthesis.
         */
        fun engine(engine: Engine): FluentBuilder
        /**
         * Boolean value indicating whether to return any bilingual voices that
         * use the specified language as an additional language. For instance, if you
         * request all languages that use US English (es-US), and there is an Italian
         * voice that speaks both Italian (it-IT) and US English, that voice will be
         * included if you specify yes but not if you specify
         * no.
         */
        fun includeAdditionalLanguageCodes(includeAdditionalLanguageCodes: Boolean): FluentBuilder
        /**
         * The language identification tag (ISO 639 code for the language
         * name-ISO 3166 country code) for filtering the list of voices returned. If
         * you don't specify this optional parameter, all available voices are
         * returned.
         */
        fun languageCode(languageCode: LanguageCode): FluentBuilder
        /**
         * An opaque pagination token returned from the previous
         * DescribeVoices operation. If present, this indicates where
         * to continue the listing.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Specifies the engine (standard or neural)
         * used by Amazon Polly when processing input text for speech synthesis.
         */
        var engine: Engine?
        /**
         * Boolean value indicating whether to return any bilingual voices that
         * use the specified language as an additional language. For instance, if you
         * request all languages that use US English (es-US), and there is an Italian
         * voice that speaks both Italian (it-IT) and US English, that voice will be
         * included if you specify yes but not if you specify
         * no.
         */
        var includeAdditionalLanguageCodes: Boolean
        /**
         * The language identification tag (ISO 639 code for the language
         * name-ISO 3166 country code) for filtering the list of voices returned. If
         * you don't specify this optional parameter, all available voices are
         * returned.
         */
        var languageCode: LanguageCode?
        /**
         * An opaque pagination token returned from the previous
         * DescribeVoices operation. If present, this indicates where
         * to continue the listing.
         */
        var nextToken: String?

        fun build(): DescribeVoicesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var engine: Engine? = null
        override var includeAdditionalLanguageCodes: Boolean = false
        override var languageCode: LanguageCode? = null
        override var nextToken: String? = null

        constructor(x: DescribeVoicesRequest) : this() {
            this.engine = x.engine
            this.includeAdditionalLanguageCodes = x.includeAdditionalLanguageCodes
            this.languageCode = x.languageCode
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeVoicesRequest = DescribeVoicesRequest(this)
        override fun engine(engine: Engine): FluentBuilder = apply { this.engine = engine }
        override fun includeAdditionalLanguageCodes(includeAdditionalLanguageCodes: Boolean): FluentBuilder = apply { this.includeAdditionalLanguageCodes = includeAdditionalLanguageCodes }
        override fun languageCode(languageCode: LanguageCode): FluentBuilder = apply { this.languageCode = languageCode }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
