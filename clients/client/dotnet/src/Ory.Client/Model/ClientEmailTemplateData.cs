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
    /// Contains the data of the email template, including the subject and body in HTML and plaintext variants
    /// </summary>
    [DataContract(Name = "emailTemplateData")]
    public partial class ClientEmailTemplateData : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientEmailTemplateData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientEmailTemplateData()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientEmailTemplateData" /> class.
        /// </summary>
        /// <param name="body">body (required).</param>
        /// <param name="subject">subject (required).</param>
        public ClientEmailTemplateData(ClientEmailTemplateDataBody body = default(ClientEmailTemplateDataBody), string subject = default(string))
        {
            // to ensure "body" is required (not null)
            if (body == null)
            {
                throw new ArgumentNullException("body is a required property for ClientEmailTemplateData and cannot be null");
            }
            this.Body = body;
            // to ensure "subject" is required (not null)
            if (subject == null)
            {
                throw new ArgumentNullException("subject is a required property for ClientEmailTemplateData and cannot be null");
            }
            this.Subject = subject;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "body", IsRequired = true, EmitDefaultValue = true)]
        public ClientEmailTemplateDataBody Body { get; set; }

        /// <summary>
        /// Gets or Sets Subject
        /// </summary>
        [DataMember(Name = "subject", IsRequired = true, EmitDefaultValue = true)]
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
            sb.Append("class ClientEmailTemplateData {\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
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
