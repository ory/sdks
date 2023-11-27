/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.4.3
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
    /// ClientSourcePosition
    /// </summary>
    [DataContract(Name = "SourcePosition")]
    public partial class ClientSourcePosition : IEquatable<ClientSourcePosition>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSourcePosition" /> class.
        /// </summary>
        /// <param name="line">line.</param>
        /// <param name="column">column.</param>
        public ClientSourcePosition(long line = default(long), long column = default(long))
        {
            this.Line = line;
            this.Column = column;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Line
        /// </summary>
        [DataMember(Name = "Line", EmitDefaultValue = false)]
        public long Line { get; set; }

        /// <summary>
        /// Gets or Sets Column
        /// </summary>
        [DataMember(Name = "column", EmitDefaultValue = false)]
        public long Column { get; set; }

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
            sb.Append("class ClientSourcePosition {\n");
            sb.Append("  Line: ").Append(Line).Append("\n");
            sb.Append("  Column: ").Append(Column).Append("\n");
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
            return this.Equals(input as ClientSourcePosition);
        }

        /// <summary>
        /// Returns true if ClientSourcePosition instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSourcePosition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSourcePosition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Line == input.Line ||
                    this.Line.Equals(input.Line)
                ) && 
                (
                    this.Column == input.Column ||
                    this.Column.Equals(input.Column)
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
                hashCode = (hashCode * 59) + this.Line.GetHashCode();
                hashCode = (hashCode * 59) + this.Column.GetHashCode();
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
