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
    /// ClientAttributeFilter
    /// </summary>
    [DataContract(Name = "AttributeFilter")]
    public partial class ClientAttributeFilter : IValidatableObject
    {
        /// <summary>
        /// Defines Condition
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ConditionEnum
        {
            /// <summary>
            /// Enum Equals for value: equals
            /// </summary>
            [EnumMember(Value = "equals")]
            Equals = 1,

            /// <summary>
            /// Enum NotEquals for value: not_equals
            /// </summary>
            [EnumMember(Value = "not_equals")]
            NotEquals = 2,

            /// <summary>
            /// Enum Contains for value: contains
            /// </summary>
            [EnumMember(Value = "contains")]
            Contains = 3,

            /// <summary>
            /// Enum NotContains for value: not_contains
            /// </summary>
            [EnumMember(Value = "not_contains")]
            NotContains = 4,

            /// <summary>
            /// Enum Regex for value: regex
            /// </summary>
            [EnumMember(Value = "regex")]
            Regex = 5,

            /// <summary>
            /// Enum NotRegex for value: not_regex
            /// </summary>
            [EnumMember(Value = "not_regex")]
            NotRegex = 6,

            /// <summary>
            /// Enum Set for value: set
            /// </summary>
            [EnumMember(Value = "set")]
            Set = 7,

            /// <summary>
            /// Enum NotSet for value: not_set
            /// </summary>
            [EnumMember(Value = "not_set")]
            NotSet = 8
        }


        /// <summary>
        /// Gets or Sets Condition
        /// </summary>
        [DataMember(Name = "condition", EmitDefaultValue = false)]
        public ConditionEnum? Condition { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientAttributeFilter" /> class.
        /// </summary>
        /// <param name="attribute">attribute.</param>
        /// <param name="condition">condition.</param>
        /// <param name="value">value.</param>
        public ClientAttributeFilter(string attribute = default(string), ConditionEnum? condition = default(ConditionEnum?), string value = default(string))
        {
            this.Attribute = attribute;
            this.Condition = condition;
            this.Value = value;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Attribute
        /// </summary>
        [DataMember(Name = "attribute", EmitDefaultValue = false)]
        public string Attribute { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

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
            sb.Append("class ClientAttributeFilter {\n");
            sb.Append("  Attribute: ").Append(Attribute).Append("\n");
            sb.Append("  Condition: ").Append(Condition).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
