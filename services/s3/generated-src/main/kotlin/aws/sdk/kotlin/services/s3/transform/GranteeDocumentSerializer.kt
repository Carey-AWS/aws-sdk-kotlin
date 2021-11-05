// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Grantee
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlAttribute
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun serializeGranteeDocument(serializer: Serializer, input: Grantee) {
    val DISPLAYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("DisplayName"))
    val EMAILADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("EmailAddress"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ID"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("xsi:type"), XmlAttribute)
    val URI_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("URI"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Grantee"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(DISPLAYNAME_DESCRIPTOR)
        field(EMAILADDRESS_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
        field(URI_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.type?.let { field(TYPE_DESCRIPTOR, it.value) }
        input.displayName?.let { field(DISPLAYNAME_DESCRIPTOR, it) }
        input.emailAddress?.let { field(EMAILADDRESS_DESCRIPTOR, it) }
        input.id?.let { field(ID_DESCRIPTOR, it) }
        input.uri?.let { field(URI_DESCRIPTOR, it) }
    }
}
