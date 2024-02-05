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
    /// Update Event Stream Body
    /// </summary>
    [DataContract(Name = "setEventStreamBody")]
    public partial class ClientSetEventStreamBody : IEquatable<ClientSetEventStreamBody>, IValidatableObject
    {
        /// <summary>
        /// The type of the event stream (AWS SNS, GCP Pub/Sub, etc).
        /// </summary>
        /// <value>The type of the event stream (AWS SNS, GCP Pub/Sub, etc).</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Sns for value: sns
            /// </summary>
            [EnumMember(Value = "sns")]
            Sns = 1

        }


        /// <summary>
        /// The type of the event stream (AWS SNS, GCP Pub/Sub, etc).
        /// </summary>
        /// <value>The type of the event stream (AWS SNS, GCP Pub/Sub, etc).</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSetEventStreamBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientSetEventStreamBody()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSetEventStreamBody" /> class.
        /// </summary>
        /// <param name="roleArn">The AWS IAM role ARN to assume when publishing to the SNS topic. (required).</param>
        /// <param name="topicArn">The AWS SNS topic ARN. (required).</param>
        /// <param name="type">The type of the event stream (AWS SNS, GCP Pub/Sub, etc). (required).</param>
        public ClientSetEventStreamBody(string roleArn = default(string), string topicArn = default(string), TypeEnum type = default(TypeEnum))
        {
            // to ensure "roleArn" is required (not null)
            if (roleArn == null) {
                throw new ArgumentNullException("roleArn is a required property for ClientSetEventStreamBody and cannot be null");
            }
            this.RoleArn = roleArn;
            // to ensure "topicArn" is required (not null)
            if (topicArn == null) {
                throw new ArgumentNullException("topicArn is a required property for ClientSetEventStreamBody and cannot be null");
            }
            this.TopicArn = topicArn;
            this.Type = type;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The AWS IAM role ARN to assume when publishing to the SNS topic.
        /// </summary>
        /// <value>The AWS IAM role ARN to assume when publishing to the SNS topic.</value>
        [DataMember(Name = "role_arn", IsRequired = true, EmitDefaultValue = false)]
        public string RoleArn { get; set; }

        /// <summary>
        /// The AWS SNS topic ARN.
        /// </summary>
        /// <value>The AWS SNS topic ARN.</value>
        [DataMember(Name = "topic_arn", IsRequired = true, EmitDefaultValue = false)]
        public string TopicArn { get; set; }

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
            sb.Append("class ClientSetEventStreamBody {\n");
            sb.Append("  RoleArn: ").Append(RoleArn).Append("\n");
            sb.Append("  TopicArn: ").Append(TopicArn).Append("\n");
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
            return this.Equals(input as ClientSetEventStreamBody);
        }

        /// <summary>
        /// Returns true if ClientSetEventStreamBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSetEventStreamBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSetEventStreamBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RoleArn == input.RoleArn ||
                    (this.RoleArn != null &&
                    this.RoleArn.Equals(input.RoleArn))
                ) && 
                (
                    this.TopicArn == input.TopicArn ||
                    (this.TopicArn != null &&
                    this.TopicArn.Equals(input.TopicArn))
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
                if (this.RoleArn != null)
                {
                    hashCode = (hashCode * 59) + this.RoleArn.GetHashCode();
                }
                if (this.TopicArn != null)
                {
                    hashCode = (hashCode * 59) + this.TopicArn.GetHashCode();
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
