/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.6.1
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
    /// ClientListMyWorkspacesResponse
    /// </summary>
    [DataContract(Name = "ListMyWorkspacesResponse")]
    public partial class ClientListMyWorkspacesResponse : IEquatable<ClientListMyWorkspacesResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientListMyWorkspacesResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientListMyWorkspacesResponse()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientListMyWorkspacesResponse" /> class.
        /// </summary>
        /// <param name="hasNextPage">hasNextPage (required).</param>
        /// <param name="nextPageToken">nextPageToken (required).</param>
        /// <param name="workspaces">workspaces (required).</param>
        public ClientListMyWorkspacesResponse(bool hasNextPage = default(bool), string nextPageToken = default(string), List<ClientWorkspaceMeta> workspaces = default(List<ClientWorkspaceMeta>))
        {
            this.HasNextPage = hasNextPage;
            // to ensure "nextPageToken" is required (not null)
            if (nextPageToken == null) {
                throw new ArgumentNullException("nextPageToken is a required property for ClientListMyWorkspacesResponse and cannot be null");
            }
            this.NextPageToken = nextPageToken;
            // to ensure "workspaces" is required (not null)
            if (workspaces == null) {
                throw new ArgumentNullException("workspaces is a required property for ClientListMyWorkspacesResponse and cannot be null");
            }
            this.Workspaces = workspaces;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets HasNextPage
        /// </summary>
        [DataMember(Name = "has_next_page", IsRequired = true, EmitDefaultValue = true)]
        public bool HasNextPage { get; set; }

        /// <summary>
        /// Gets or Sets NextPageToken
        /// </summary>
        [DataMember(Name = "next_page_token", IsRequired = true, EmitDefaultValue = false)]
        public string NextPageToken { get; set; }

        /// <summary>
        /// Gets or Sets Workspaces
        /// </summary>
        [DataMember(Name = "workspaces", IsRequired = true, EmitDefaultValue = false)]
        public List<ClientWorkspaceMeta> Workspaces { get; set; }

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
            sb.Append("class ClientListMyWorkspacesResponse {\n");
            sb.Append("  HasNextPage: ").Append(HasNextPage).Append("\n");
            sb.Append("  NextPageToken: ").Append(NextPageToken).Append("\n");
            sb.Append("  Workspaces: ").Append(Workspaces).Append("\n");
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
            return this.Equals(input as ClientListMyWorkspacesResponse);
        }

        /// <summary>
        /// Returns true if ClientListMyWorkspacesResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientListMyWorkspacesResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientListMyWorkspacesResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HasNextPage == input.HasNextPage ||
                    this.HasNextPage.Equals(input.HasNextPage)
                ) && 
                (
                    this.NextPageToken == input.NextPageToken ||
                    (this.NextPageToken != null &&
                    this.NextPageToken.Equals(input.NextPageToken))
                ) && 
                (
                    this.Workspaces == input.Workspaces ||
                    this.Workspaces != null &&
                    input.Workspaces != null &&
                    this.Workspaces.SequenceEqual(input.Workspaces)
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
                hashCode = (hashCode * 59) + this.HasNextPage.GetHashCode();
                if (this.NextPageToken != null)
                {
                    hashCode = (hashCode * 59) + this.NextPageToken.GetHashCode();
                }
                if (this.Workspaces != null)
                {
                    hashCode = (hashCode * 59) + this.Workspaces.GetHashCode();
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
