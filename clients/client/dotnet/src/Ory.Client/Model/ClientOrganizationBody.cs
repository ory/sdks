/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
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
    /// Create B2B SSO Organization Request Body
    /// </summary>
    [DataContract(Name = "OrganizationBody")]
    public partial class ClientOrganizationBody : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientOrganizationBody" /> class.
        /// </summary>
        /// <param name="domains">Domains contains the list of organization&#39;s domains..</param>
        /// <param name="label">Label contains the organization&#39;s label..</param>
        public ClientOrganizationBody(List<string> domains = default(List<string>), string label = default(string))
        {
            this.Domains = domains;
            this.Label = label;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Domains contains the list of organization&#39;s domains.
        /// </summary>
        /// <value>Domains contains the list of organization&#39;s domains.</value>
        [DataMember(Name = "domains", EmitDefaultValue = false)]
        public List<string> Domains { get; set; }

        /// <summary>
        /// Label contains the organization&#39;s label.
        /// </summary>
        /// <value>Label contains the organization&#39;s label.</value>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public string Label { get; set; }

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
            sb.Append("class ClientOrganizationBody {\n");
            sb.Append("  Domains: ").Append(Domains).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
