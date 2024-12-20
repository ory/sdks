/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.16
 * Contact: support@ory.sh
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
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// Custom Hostname
    /// </summary>
    [DataContract(Name = "customDomain")]
    public partial class ClientCustomDomain : IValidatableObject
    {
        /// <summary>
        /// Defines SslStatus
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SslStatusEnum
        {
            /// <summary>
            /// Enum Initializing for value: initializing
            /// </summary>
            [EnumMember(Value = "initializing")]
            Initializing = 1,

            /// <summary>
            /// Enum PendingValidation for value: pending_validation
            /// </summary>
            [EnumMember(Value = "pending_validation")]
            PendingValidation = 2,

            /// <summary>
            /// Enum Deleted for value: deleted
            /// </summary>
            [EnumMember(Value = "deleted")]
            Deleted = 3,

            /// <summary>
            /// Enum PendingIssuance for value: pending_issuance
            /// </summary>
            [EnumMember(Value = "pending_issuance")]
            PendingIssuance = 4,

            /// <summary>
            /// Enum PendingDeployment for value: pending_deployment
            /// </summary>
            [EnumMember(Value = "pending_deployment")]
            PendingDeployment = 5,

            /// <summary>
            /// Enum PendingDeletion for value: pending_deletion
            /// </summary>
            [EnumMember(Value = "pending_deletion")]
            PendingDeletion = 6,

            /// <summary>
            /// Enum PendingExpiration for value: pending_expiration
            /// </summary>
            [EnumMember(Value = "pending_expiration")]
            PendingExpiration = 7,

            /// <summary>
            /// Enum Expired for value: expired
            /// </summary>
            [EnumMember(Value = "expired")]
            Expired = 8,

            /// <summary>
            /// Enum Active for value: active
            /// </summary>
            [EnumMember(Value = "active")]
            Active = 9,

            /// <summary>
            /// Enum InitializingTimedOut for value: initializing_timed_out
            /// </summary>
            [EnumMember(Value = "initializing_timed_out")]
            InitializingTimedOut = 10,

            /// <summary>
            /// Enum ValidationTimedOut for value: validation_timed_out
            /// </summary>
            [EnumMember(Value = "validation_timed_out")]
            ValidationTimedOut = 11,

            /// <summary>
            /// Enum IssuanceTimedOut for value: issuance_timed_out
            /// </summary>
            [EnumMember(Value = "issuance_timed_out")]
            IssuanceTimedOut = 12,

            /// <summary>
            /// Enum DeploymentTimedOut for value: deployment_timed_out
            /// </summary>
            [EnumMember(Value = "deployment_timed_out")]
            DeploymentTimedOut = 13,

            /// <summary>
            /// Enum DeletionTimedOut for value: deletion_timed_out
            /// </summary>
            [EnumMember(Value = "deletion_timed_out")]
            DeletionTimedOut = 14,

            /// <summary>
            /// Enum PendingCleanup for value: pending_cleanup
            /// </summary>
            [EnumMember(Value = "pending_cleanup")]
            PendingCleanup = 15,

            /// <summary>
            /// Enum StagingDeployment for value: staging_deployment
            /// </summary>
            [EnumMember(Value = "staging_deployment")]
            StagingDeployment = 16,

            /// <summary>
            /// Enum StagingActive for value: staging_active
            /// </summary>
            [EnumMember(Value = "staging_active")]
            StagingActive = 17,

            /// <summary>
            /// Enum Deactivating for value: deactivating
            /// </summary>
            [EnumMember(Value = "deactivating")]
            Deactivating = 18,

            /// <summary>
            /// Enum Inactive for value: inactive
            /// </summary>
            [EnumMember(Value = "inactive")]
            Inactive = 19,

            /// <summary>
            /// Enum BackupIssued for value: backup_issued
            /// </summary>
            [EnumMember(Value = "backup_issued")]
            BackupIssued = 20,

            /// <summary>
            /// Enum HoldingDeployment for value: holding_deployment
            /// </summary>
            [EnumMember(Value = "holding_deployment")]
            HoldingDeployment = 21,

            /// <summary>
            /// Enum Empty for value: 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 22
        }


        /// <summary>
        /// Gets or Sets SslStatus
        /// </summary>
        [DataMember(Name = "ssl_status", EmitDefaultValue = false)]
        public SslStatusEnum? SslStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientCustomDomain" /> class.
        /// </summary>
        /// <param name="cookieDomain">cookieDomain.</param>
        /// <param name="corsAllowedOrigins">corsAllowedOrigins.</param>
        /// <param name="corsEnabled">corsEnabled.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="customUiBaseUrl">customUiBaseUrl.</param>
        /// <param name="hostname">hostname.</param>
        /// <param name="id">id.</param>
        /// <param name="sslStatus">sslStatus.</param>
        /// <param name="updatedAt">updatedAt.</param>
        /// <param name="verificationErrors">verificationErrors.</param>
        /// <param name="verificationStatus">verificationStatus.</param>
        public ClientCustomDomain(string cookieDomain = default(string), List<string> corsAllowedOrigins = default(List<string>), bool corsEnabled = default(bool), DateTime createdAt = default(DateTime), string customUiBaseUrl = default(string), string hostname = default(string), string id = default(string), SslStatusEnum? sslStatus = default(SslStatusEnum?), DateTime updatedAt = default(DateTime), List<string> verificationErrors = default(List<string>), string verificationStatus = default(string))
        {
            this.CookieDomain = cookieDomain;
            this.CorsAllowedOrigins = corsAllowedOrigins;
            this.CorsEnabled = corsEnabled;
            this.CreatedAt = createdAt;
            this.CustomUiBaseUrl = customUiBaseUrl;
            this.Hostname = hostname;
            this.Id = id;
            this.SslStatus = sslStatus;
            this.UpdatedAt = updatedAt;
            this.VerificationErrors = verificationErrors;
            this.VerificationStatus = verificationStatus;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets CookieDomain
        /// </summary>
        [DataMember(Name = "cookie_domain", EmitDefaultValue = false)]
        public string CookieDomain { get; set; }

        /// <summary>
        /// Gets or Sets CorsAllowedOrigins
        /// </summary>
        [DataMember(Name = "cors_allowed_origins", EmitDefaultValue = false)]
        public List<string> CorsAllowedOrigins { get; set; }

        /// <summary>
        /// Gets or Sets CorsEnabled
        /// </summary>
        [DataMember(Name = "cors_enabled", EmitDefaultValue = true)]
        public bool CorsEnabled { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CustomUiBaseUrl
        /// </summary>
        [DataMember(Name = "custom_ui_base_url", EmitDefaultValue = false)]
        public string CustomUiBaseUrl { get; set; }

        /// <summary>
        /// Gets or Sets Hostname
        /// </summary>
        [DataMember(Name = "hostname", EmitDefaultValue = false)]
        public string Hostname { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets VerificationErrors
        /// </summary>
        [DataMember(Name = "verification_errors", EmitDefaultValue = false)]
        public List<string> VerificationErrors { get; set; }

        /// <summary>
        /// Gets or Sets VerificationStatus
        /// </summary>
        [DataMember(Name = "verification_status", EmitDefaultValue = false)]
        public string VerificationStatus { get; set; }

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
            sb.Append("class ClientCustomDomain {\n");
            sb.Append("  CookieDomain: ").Append(CookieDomain).Append("\n");
            sb.Append("  CorsAllowedOrigins: ").Append(CorsAllowedOrigins).Append("\n");
            sb.Append("  CorsEnabled: ").Append(CorsEnabled).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CustomUiBaseUrl: ").Append(CustomUiBaseUrl).Append("\n");
            sb.Append("  Hostname: ").Append(Hostname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SslStatus: ").Append(SslStatus).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  VerificationErrors: ").Append(VerificationErrors).Append("\n");
            sb.Append("  VerificationStatus: ").Append(VerificationStatus).Append("\n");
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
