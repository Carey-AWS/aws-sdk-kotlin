// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The Filter is used to identify objects that a Lifecycle Rule applies to. A
 * Filter must have exactly one of Prefix, Tag, or
 * And specified.
 */
sealed class LifecycleRuleFilter {
    /**
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more
     * predicates. The Lifecycle Rule will apply to any object matching all of the predicates
     * configured inside the And operator.
     */
    data class And(val value: aws.sdk.kotlin.services.s3.model.LifecycleRuleAndOperator) : aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter()
    /**
     * Prefix identifying one or more objects to which the rule applies.
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using
     * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML related object key constraints.
     */
    data class Prefix(val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter()
    /**
     * This tag must exist in the object's tag set in order for the rule to apply.
     */
    data class Tag(val value: aws.sdk.kotlin.services.s3.model.Tag) : aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter()
    object SdkUnknown : aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter()
}
