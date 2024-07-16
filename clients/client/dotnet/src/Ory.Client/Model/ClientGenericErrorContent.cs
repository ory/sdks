/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.0
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
    /// Error response
    /// </summary>
    [DataContract(Name = "genericErrorContent")]
    public partial class ClientGenericErrorContent : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientGenericErrorContent" /> class.
        /// </summary>
        /// <param name="debug">Debug contains debug information. This is usually not available and has to be enabled..</param>
        /// <param name="error">Name is the error name..</param>
        /// <param name="errorDescription">Description contains further information on the nature of the error..</param>
        /// <param name="message">Message contains the error message..</param>
        /// <param name="statusCode">Code represents the error status code (404, 403, 401, ...)..</param>
        public ClientGenericErrorContent(string debug = default(string), string error = default(string), string errorDescription = default(string), string message = default(string), long statusCode = default(long))
        {
            this.Debug = debug;
            this.Error = error;
            this.ErrorDescription = errorDescription;
            this.Message = message;
            this.StatusCode = statusCode;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Debug contains debug information. This is usually not available and has to be enabled.
        /// </summary>
        /// <value>Debug contains debug information. This is usually not available and has to be enabled.</value>
        /// <example>The database adapter was unable to find the element</example>
        [DataMember(Name = "debug", EmitDefaultValue = false)]
        public string Debug { get; set; }

        /// <summary>
        /// Name is the error name.
        /// </summary>
        /// <value>Name is the error name.</value>
        /// <example>The requested resource could not be found</example>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public string Error { get; set; }

        /// <summary>
        /// Description contains further information on the nature of the error.
        /// </summary>
        /// <value>Description contains further information on the nature of the error.</value>
        /// <example>Object with ID 12345 does not exist</example>
        [DataMember(Name = "error_description", EmitDefaultValue = false)]
        public string ErrorDescription { get; set; }

        /// <summary>
        /// Message contains the error message.
        /// </summary>
        /// <value>Message contains the error message.</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Code represents the error status code (404, 403, 401, ...).
        /// </summary>
        /// <value>Code represents the error status code (404, 403, 401, ...).</value>
        /// <example>404</example>
        [DataMember(Name = "status_code", EmitDefaultValue = false)]
        public long StatusCode { get; set; }

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
            sb.Append("class ClientGenericErrorContent {\n");
            sb.Append("  Debug: ").Append(Debug).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  ErrorDescription: ").Append(ErrorDescription).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  StatusCode: ").Append(StatusCode).Append("\n");
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
