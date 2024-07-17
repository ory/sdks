/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.1
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
    /// Update Identity Body
    /// </summary>
    [DataContract(Name = "updateIdentityBody")]
    public partial class KratosUpdateIdentityBody : IValidatableObject
    {
        /// <summary>
        /// State is the identity&#39;s state. active StateActive inactive StateInactive
        /// </summary>
        /// <value>State is the identity&#39;s state. active StateActive inactive StateInactive</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StateEnum
        {
            /// <summary>
            /// Enum Active for value: active
            /// </summary>
            [EnumMember(Value = "active")]
            Active = 1,

            /// <summary>
            /// Enum Inactive for value: inactive
            /// </summary>
            [EnumMember(Value = "inactive")]
            Inactive = 2
        }


        /// <summary>
        /// State is the identity&#39;s state. active StateActive inactive StateInactive
        /// </summary>
        /// <value>State is the identity&#39;s state. active StateActive inactive StateInactive</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public StateEnum State { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateIdentityBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosUpdateIdentityBody()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateIdentityBody" /> class.
        /// </summary>
        /// <param name="credentials">credentials.</param>
        /// <param name="metadataAdmin">Store metadata about the user which is only accessible through admin APIs such as &#x60;GET /admin/identities/&lt;id&gt;&#x60;..</param>
        /// <param name="metadataPublic">Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field..</param>
        /// <param name="schemaId">SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits. If set will update the Identity&#39;s SchemaID. (required).</param>
        /// <param name="state">State is the identity&#39;s state. active StateActive inactive StateInactive (required).</param>
        /// <param name="traits">Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_id&#x60;. (required).</param>
        public KratosUpdateIdentityBody(KratosIdentityWithCredentials credentials = default(KratosIdentityWithCredentials), Object metadataAdmin = default(Object), Object metadataPublic = default(Object), string schemaId = default(string), StateEnum state = default(StateEnum), Object traits = default(Object))
        {
            // to ensure "schemaId" is required (not null)
            if (schemaId == null)
            {
                throw new ArgumentNullException("schemaId is a required property for KratosUpdateIdentityBody and cannot be null");
            }
            this.SchemaId = schemaId;
            this.State = state;
            // to ensure "traits" is required (not null)
            if (traits == null)
            {
                throw new ArgumentNullException("traits is a required property for KratosUpdateIdentityBody and cannot be null");
            }
            this.Traits = traits;
            this.Credentials = credentials;
            this.MetadataAdmin = metadataAdmin;
            this.MetadataPublic = metadataPublic;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Credentials
        /// </summary>
        [DataMember(Name = "credentials", EmitDefaultValue = false)]
        public KratosIdentityWithCredentials Credentials { get; set; }

        /// <summary>
        /// Store metadata about the user which is only accessible through admin APIs such as &#x60;GET /admin/identities/&lt;id&gt;&#x60;.
        /// </summary>
        /// <value>Store metadata about the user which is only accessible through admin APIs such as &#x60;GET /admin/identities/&lt;id&gt;&#x60;.</value>
        [DataMember(Name = "metadata_admin", EmitDefaultValue = true)]
        public Object MetadataAdmin { get; set; }

        /// <summary>
        /// Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
        /// </summary>
        /// <value>Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.</value>
        [DataMember(Name = "metadata_public", EmitDefaultValue = true)]
        public Object MetadataPublic { get; set; }

        /// <summary>
        /// SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits. If set will update the Identity&#39;s SchemaID.
        /// </summary>
        /// <value>SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits. If set will update the Identity&#39;s SchemaID.</value>
        [DataMember(Name = "schema_id", IsRequired = true, EmitDefaultValue = true)]
        public string SchemaId { get; set; }

        /// <summary>
        /// Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_id&#x60;.
        /// </summary>
        /// <value>Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_id&#x60;.</value>
        [DataMember(Name = "traits", IsRequired = true, EmitDefaultValue = true)]
        public Object Traits { get; set; }

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
            sb.Append("class KratosUpdateIdentityBody {\n");
            sb.Append("  Credentials: ").Append(Credentials).Append("\n");
            sb.Append("  MetadataAdmin: ").Append(MetadataAdmin).Append("\n");
            sb.Append("  MetadataPublic: ").Append(MetadataPublic).Append("\n");
            sb.Append("  SchemaId: ").Append(SchemaId).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Traits: ").Append(Traits).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
