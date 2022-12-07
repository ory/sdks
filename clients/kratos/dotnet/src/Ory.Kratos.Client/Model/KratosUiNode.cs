/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// Nodes are represented as HTML elements or their native UI equivalents. For example, a node can be an &#x60;&lt;img&gt;&#x60; tag, or an &#x60;&lt;input element&gt;&#x60; but also &#x60;some plain text&#x60;.
    /// </summary>
    [DataContract(Name = "uiNode")]
    public partial class KratosUiNode : IEquatable<KratosUiNode>, IValidatableObject
    {
        /// <summary>
        /// Group specifies which group (e.g. password authenticator) this node belongs to. default DefaultGroup password PasswordGroup oidc OpenIDConnectGroup profile ProfileGroup link LinkGroup code CodeGroup totp TOTPGroup lookup_secret LookupGroup webauthn WebAuthnGroup
        /// </summary>
        /// <value>Group specifies which group (e.g. password authenticator) this node belongs to. default DefaultGroup password PasswordGroup oidc OpenIDConnectGroup profile ProfileGroup link LinkGroup code CodeGroup totp TOTPGroup lookup_secret LookupGroup webauthn WebAuthnGroup</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum GroupEnum
        {
            /// <summary>
            /// Enum Default for value: default
            /// </summary>
            [EnumMember(Value = "default")]
            Default = 1,

            /// <summary>
            /// Enum Password for value: password
            /// </summary>
            [EnumMember(Value = "password")]
            Password = 2,

            /// <summary>
            /// Enum Oidc for value: oidc
            /// </summary>
            [EnumMember(Value = "oidc")]
            Oidc = 3,

            /// <summary>
            /// Enum Profile for value: profile
            /// </summary>
            [EnumMember(Value = "profile")]
            Profile = 4,

            /// <summary>
            /// Enum Link for value: link
            /// </summary>
            [EnumMember(Value = "link")]
            Link = 5,

            /// <summary>
            /// Enum Code for value: code
            /// </summary>
            [EnumMember(Value = "code")]
            Code = 6,

            /// <summary>
            /// Enum Totp for value: totp
            /// </summary>
            [EnumMember(Value = "totp")]
            Totp = 7,

            /// <summary>
            /// Enum LookupSecret for value: lookup_secret
            /// </summary>
            [EnumMember(Value = "lookup_secret")]
            LookupSecret = 8,

            /// <summary>
            /// Enum Webauthn for value: webauthn
            /// </summary>
            [EnumMember(Value = "webauthn")]
            Webauthn = 9

        }


        /// <summary>
        /// Group specifies which group (e.g. password authenticator) this node belongs to. default DefaultGroup password PasswordGroup oidc OpenIDConnectGroup profile ProfileGroup link LinkGroup code CodeGroup totp TOTPGroup lookup_secret LookupGroup webauthn WebAuthnGroup
        /// </summary>
        /// <value>Group specifies which group (e.g. password authenticator) this node belongs to. default DefaultGroup password PasswordGroup oidc OpenIDConnectGroup profile ProfileGroup link LinkGroup code CodeGroup totp TOTPGroup lookup_secret LookupGroup webauthn WebAuthnGroup</value>
        [DataMember(Name = "group", IsRequired = true, EmitDefaultValue = false)]
        public GroupEnum Group { get; set; }
        /// <summary>
        /// The node&#39;s type text Text input Input img Image a Anchor script Script
        /// </summary>
        /// <value>The node&#39;s type text Text input Input img Image a Anchor script Script</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Text for value: text
            /// </summary>
            [EnumMember(Value = "text")]
            Text = 1,

            /// <summary>
            /// Enum Input for value: input
            /// </summary>
            [EnumMember(Value = "input")]
            Input = 2,

            /// <summary>
            /// Enum Img for value: img
            /// </summary>
            [EnumMember(Value = "img")]
            Img = 3,

            /// <summary>
            /// Enum A for value: a
            /// </summary>
            [EnumMember(Value = "a")]
            A = 4,

            /// <summary>
            /// Enum Script for value: script
            /// </summary>
            [EnumMember(Value = "script")]
            Script = 5

        }


        /// <summary>
        /// The node&#39;s type text Text input Input img Image a Anchor script Script
        /// </summary>
        /// <value>The node&#39;s type text Text input Input img Image a Anchor script Script</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUiNode" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosUiNode()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUiNode" /> class.
        /// </summary>
        /// <param name="attributes">attributes (required).</param>
        /// <param name="group">Group specifies which group (e.g. password authenticator) this node belongs to. default DefaultGroup password PasswordGroup oidc OpenIDConnectGroup profile ProfileGroup link LinkGroup code CodeGroup totp TOTPGroup lookup_secret LookupGroup webauthn WebAuthnGroup (required).</param>
        /// <param name="messages">messages (required).</param>
        /// <param name="meta">meta (required).</param>
        /// <param name="type">The node&#39;s type text Text input Input img Image a Anchor script Script (required).</param>
        public KratosUiNode(KratosUiNodeAttributes attributes = default(KratosUiNodeAttributes), GroupEnum group = default(GroupEnum), List<KratosUiText> messages = default(List<KratosUiText>), KratosUiNodeMeta meta = default(KratosUiNodeMeta), TypeEnum type = default(TypeEnum))
        {
            // to ensure "attributes" is required (not null)
            if (attributes == null) {
                throw new ArgumentNullException("attributes is a required property for KratosUiNode and cannot be null");
            }
            this.Attributes = attributes;
            this.Group = group;
            // to ensure "messages" is required (not null)
            if (messages == null) {
                throw new ArgumentNullException("messages is a required property for KratosUiNode and cannot be null");
            }
            this.Messages = messages;
            // to ensure "meta" is required (not null)
            if (meta == null) {
                throw new ArgumentNullException("meta is a required property for KratosUiNode and cannot be null");
            }
            this.Meta = meta;
            this.Type = type;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [DataMember(Name = "attributes", IsRequired = true, EmitDefaultValue = false)]
        public KratosUiNodeAttributes Attributes { get; set; }

        /// <summary>
        /// Gets or Sets Messages
        /// </summary>
        [DataMember(Name = "messages", IsRequired = true, EmitDefaultValue = false)]
        public List<KratosUiText> Messages { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", IsRequired = true, EmitDefaultValue = false)]
        public KratosUiNodeMeta Meta { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KratosUiNode {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Group: ").Append(Group).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KratosUiNode);
        }

        /// <summary>
        /// Returns true if KratosUiNode instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosUiNode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosUiNode input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    (this.Attributes != null &&
                    this.Attributes.Equals(input.Attributes))
                ) && 
                (
                    this.Group == input.Group ||
                    this.Group.Equals(input.Group)
                ) && 
                (
                    this.Messages == input.Messages ||
                    this.Messages != null &&
                    input.Messages != null &&
                    this.Messages.SequenceEqual(input.Messages)
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Group.GetHashCode();
                if (this.Messages != null)
                {
                    hashCode = (hashCode * 59) + this.Messages.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
