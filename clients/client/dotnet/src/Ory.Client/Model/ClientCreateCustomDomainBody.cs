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
    /// Create Custom Hostname Request Body
    /// </summary>
    [DataContract(Name = "createCustomDomainBody")]
    public partial class ClientCreateCustomDomainBody : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientCreateCustomDomainBody" /> class.
        /// </summary>
        /// <param name="cookieDomain">The domain where cookies will be set. Has to be a parent domain of the custom hostname to work..</param>
        /// <param name="corsAllowedOrigins">CORS Allowed origins for the custom hostname..</param>
        /// <param name="corsEnabled">CORS Enabled for the custom hostname..</param>
        /// <param name="customUiBaseUrl">The base URL where the custom user interface will be exposed..</param>
        /// <param name="hostname">The custom hostname where the API will be exposed..</param>
        public ClientCreateCustomDomainBody(string cookieDomain = default(string), List<string> corsAllowedOrigins = default(List<string>), bool corsEnabled = default(bool), string customUiBaseUrl = default(string), string hostname = default(string))
        {
            this.CookieDomain = cookieDomain;
            this.CorsAllowedOrigins = corsAllowedOrigins;
            this.CorsEnabled = corsEnabled;
            this.CustomUiBaseUrl = customUiBaseUrl;
            this.Hostname = hostname;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.
        /// </summary>
        /// <value>The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.</value>
        [DataMember(Name = "cookie_domain", EmitDefaultValue = false)]
        public string CookieDomain { get; set; }

        /// <summary>
        /// CORS Allowed origins for the custom hostname.
        /// </summary>
        /// <value>CORS Allowed origins for the custom hostname.</value>
        [DataMember(Name = "cors_allowed_origins", EmitDefaultValue = false)]
        public List<string> CorsAllowedOrigins { get; set; }

        /// <summary>
        /// CORS Enabled for the custom hostname.
        /// </summary>
        /// <value>CORS Enabled for the custom hostname.</value>
        [DataMember(Name = "cors_enabled", EmitDefaultValue = true)]
        public bool CorsEnabled { get; set; }

        /// <summary>
        /// The base URL where the custom user interface will be exposed.
        /// </summary>
        /// <value>The base URL where the custom user interface will be exposed.</value>
        [DataMember(Name = "custom_ui_base_url", EmitDefaultValue = false)]
        public string CustomUiBaseUrl { get; set; }

        /// <summary>
        /// The custom hostname where the API will be exposed.
        /// </summary>
        /// <value>The custom hostname where the API will be exposed.</value>
        [DataMember(Name = "hostname", EmitDefaultValue = false)]
        public string Hostname { get; set; }

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
            sb.Append("class ClientCreateCustomDomainBody {\n");
            sb.Append("  CookieDomain: ").Append(CookieDomain).Append("\n");
            sb.Append("  CorsAllowedOrigins: ").Append(CorsAllowedOrigins).Append("\n");
            sb.Append("  CorsEnabled: ").Append(CorsEnabled).Append("\n");
            sb.Append("  CustomUiBaseUrl: ").Append(CustomUiBaseUrl).Append("\n");
            sb.Append("  Hostname: ").Append(Hostname).Append("\n");
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
