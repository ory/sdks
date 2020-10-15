/* 
 * Ory Kratos
 *
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.0-alpha.1
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// KratosRegistrationFlowMethodConfig
    /// </summary>
    [DataContract]
    public partial class KratosRegistrationFlowMethodConfig :  IEquatable<KratosRegistrationFlowMethodConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosRegistrationFlowMethodConfig" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosRegistrationFlowMethodConfig() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosRegistrationFlowMethodConfig" /> class.
        /// </summary>
        /// <param name="action">Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;. (required).</param>
        /// <param name="fields">Fields contains multiple fields (required).</param>
        /// <param name="messages">messages.</param>
        /// <param name="method">Method is the form method (e.g. POST) (required).</param>
        /// <param name="providers">Providers is set for the \&quot;oidc\&quot; registration method..</param>
        public KratosRegistrationFlowMethodConfig(string action = default(string), List<KratosFormField> fields = default(List<KratosFormField>), List<KratosMessage> messages = default(List<KratosMessage>), string method = default(string), List<KratosFormField> providers = default(List<KratosFormField>))
        {
            // to ensure "action" is required (not null)
            this.Action = action ?? throw new ArgumentNullException("action is a required property for KratosRegistrationFlowMethodConfig and cannot be null");
            // to ensure "fields" is required (not null)
            this.Fields = fields ?? throw new ArgumentNullException("fields is a required property for KratosRegistrationFlowMethodConfig and cannot be null");
            // to ensure "method" is required (not null)
            this.Method = method ?? throw new ArgumentNullException("method is a required property for KratosRegistrationFlowMethodConfig and cannot be null");
            this.Messages = messages;
            this.Providers = providers;
        }
        
        /// <summary>
        /// Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.
        /// </summary>
        /// <value>Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.</value>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public string Action { get; set; }

        /// <summary>
        /// Fields contains multiple fields
        /// </summary>
        /// <value>Fields contains multiple fields</value>
        [DataMember(Name="fields", EmitDefaultValue=false)]
        public List<KratosFormField> Fields { get; set; }

        /// <summary>
        /// Gets or Sets Messages
        /// </summary>
        [DataMember(Name="messages", EmitDefaultValue=false)]
        public List<KratosMessage> Messages { get; set; }

        /// <summary>
        /// Method is the form method (e.g. POST)
        /// </summary>
        /// <value>Method is the form method (e.g. POST)</value>
        [DataMember(Name="method", EmitDefaultValue=false)]
        public string Method { get; set; }

        /// <summary>
        /// Providers is set for the \&quot;oidc\&quot; registration method.
        /// </summary>
        /// <value>Providers is set for the \&quot;oidc\&quot; registration method.</value>
        [DataMember(Name="providers", EmitDefaultValue=false)]
        public List<KratosFormField> Providers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KratosRegistrationFlowMethodConfig {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  Providers: ").Append(Providers).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KratosRegistrationFlowMethodConfig);
        }

        /// <summary>
        /// Returns true if KratosRegistrationFlowMethodConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosRegistrationFlowMethodConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosRegistrationFlowMethodConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Action == input.Action ||
                    (this.Action != null &&
                    this.Action.Equals(input.Action))
                ) && 
                (
                    this.Fields == input.Fields ||
                    this.Fields != null &&
                    input.Fields != null &&
                    this.Fields.SequenceEqual(input.Fields)
                ) && 
                (
                    this.Messages == input.Messages ||
                    this.Messages != null &&
                    input.Messages != null &&
                    this.Messages.SequenceEqual(input.Messages)
                ) && 
                (
                    this.Method == input.Method ||
                    (this.Method != null &&
                    this.Method.Equals(input.Method))
                ) && 
                (
                    this.Providers == input.Providers ||
                    this.Providers != null &&
                    input.Providers != null &&
                    this.Providers.SequenceEqual(input.Providers)
                );
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
                if (this.Action != null)
                    hashCode = hashCode * 59 + this.Action.GetHashCode();
                if (this.Fields != null)
                    hashCode = hashCode * 59 + this.Fields.GetHashCode();
                if (this.Messages != null)
                    hashCode = hashCode * 59 + this.Messages.GetHashCode();
                if (this.Method != null)
                    hashCode = hashCode * 59 + this.Method.GetHashCode();
                if (this.Providers != null)
                    hashCode = hashCode * 59 + this.Providers.GetHashCode();
                return hashCode;
            }
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
