/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v1.11.6
 * Contact: hi@ory.sh
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
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// HydraTrustedJwtGrantIssuer
    /// </summary>
    [DataContract(Name = "trustedJwtGrantIssuer")]
    public partial class HydraTrustedJwtGrantIssuer : IEquatable<HydraTrustedJwtGrantIssuer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraTrustedJwtGrantIssuer" /> class.
        /// </summary>
        /// <param name="createdAt">The \&quot;created_at\&quot; indicates, when grant was created..</param>
        /// <param name="expiresAt">The \&quot;expires_at\&quot; indicates, when grant will expire, so we will reject assertion from \&quot;issuer\&quot; targeting \&quot;subject\&quot;..</param>
        /// <param name="id">id.</param>
        /// <param name="issuer">The \&quot;issuer\&quot; identifies the principal that issued the JWT assertion (same as \&quot;iss\&quot; claim in JWT)..</param>
        /// <param name="publicKey">publicKey.</param>
        /// <param name="scope">The \&quot;scope\&quot; contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]).</param>
        /// <param name="subject">The \&quot;subject\&quot; identifies the principal that is the subject of the JWT..</param>
        public HydraTrustedJwtGrantIssuer(DateTime createdAt = default(DateTime), DateTime expiresAt = default(DateTime), string id = default(string), string issuer = default(string), HydraTrustedJsonWebKey publicKey = default(HydraTrustedJsonWebKey), List<string> scope = default(List<string>), string subject = default(string))
        {
            this.CreatedAt = createdAt;
            this.ExpiresAt = expiresAt;
            this.Id = id;
            this.Issuer = issuer;
            this.PublicKey = publicKey;
            this.Scope = scope;
            this.Subject = subject;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The \&quot;created_at\&quot; indicates, when grant was created.
        /// </summary>
        /// <value>The \&quot;created_at\&quot; indicates, when grant was created.</value>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// The \&quot;expires_at\&quot; indicates, when grant will expire, so we will reject assertion from \&quot;issuer\&quot; targeting \&quot;subject\&quot;.
        /// </summary>
        /// <value>The \&quot;expires_at\&quot; indicates, when grant will expire, so we will reject assertion from \&quot;issuer\&quot; targeting \&quot;subject\&quot;.</value>
        [DataMember(Name = "expires_at", EmitDefaultValue = false)]
        public DateTime ExpiresAt { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The \&quot;issuer\&quot; identifies the principal that issued the JWT assertion (same as \&quot;iss\&quot; claim in JWT).
        /// </summary>
        /// <value>The \&quot;issuer\&quot; identifies the principal that issued the JWT assertion (same as \&quot;iss\&quot; claim in JWT).</value>
        [DataMember(Name = "issuer", EmitDefaultValue = false)]
        public string Issuer { get; set; }

        /// <summary>
        /// Gets or Sets PublicKey
        /// </summary>
        [DataMember(Name = "public_key", EmitDefaultValue = false)]
        public HydraTrustedJsonWebKey PublicKey { get; set; }

        /// <summary>
        /// The \&quot;scope\&quot; contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])
        /// </summary>
        /// <value>The \&quot;scope\&quot; contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])</value>
        [DataMember(Name = "scope", EmitDefaultValue = false)]
        public List<string> Scope { get; set; }

        /// <summary>
        /// The \&quot;subject\&quot; identifies the principal that is the subject of the JWT.
        /// </summary>
        /// <value>The \&quot;subject\&quot; identifies the principal that is the subject of the JWT.</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

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
            sb.Append("class HydraTrustedJwtGrantIssuer {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  PublicKey: ").Append(PublicKey).Append("\n");
            sb.Append("  Scope: ").Append(Scope).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
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
            return this.Equals(input as HydraTrustedJwtGrantIssuer);
        }

        /// <summary>
        /// Returns true if HydraTrustedJwtGrantIssuer instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraTrustedJwtGrantIssuer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraTrustedJwtGrantIssuer input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.ExpiresAt == input.ExpiresAt ||
                    (this.ExpiresAt != null &&
                    this.ExpiresAt.Equals(input.ExpiresAt))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Issuer == input.Issuer ||
                    (this.Issuer != null &&
                    this.Issuer.Equals(input.Issuer))
                ) && 
                (
                    this.PublicKey == input.PublicKey ||
                    (this.PublicKey != null &&
                    this.PublicKey.Equals(input.PublicKey))
                ) && 
                (
                    this.Scope == input.Scope ||
                    this.Scope != null &&
                    input.Scope != null &&
                    this.Scope.SequenceEqual(input.Scope)
                ) && 
                (
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
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
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.ExpiresAt != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiresAt.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Issuer != null)
                {
                    hashCode = (hashCode * 59) + this.Issuer.GetHashCode();
                }
                if (this.PublicKey != null)
                {
                    hashCode = (hashCode * 59) + this.PublicKey.GetHashCode();
                }
                if (this.Scope != null)
                {
                    hashCode = (hashCode * 59) + this.Scope.GetHashCode();
                }
                if (this.Subject != null)
                {
                    hashCode = (hashCode * 59) + this.Subject.GetHashCode();
                }
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
