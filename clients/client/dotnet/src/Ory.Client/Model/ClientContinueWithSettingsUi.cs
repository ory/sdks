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
    /// Indicates, that the UI flow could be continued by showing a settings ui
    /// </summary>
    [DataContract(Name = "continueWithSettingsUi")]
    public partial class ClientContinueWithSettingsUi : IValidatableObject
    {
        /// <summary>
        /// Action will always be &#x60;show_settings_ui&#x60; show_settings_ui ContinueWithActionShowSettingsUIString
        /// </summary>
        /// <value>Action will always be &#x60;show_settings_ui&#x60; show_settings_ui ContinueWithActionShowSettingsUIString</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            /// <summary>
            /// Enum ShowSettingsUi for value: show_settings_ui
            /// </summary>
            [EnumMember(Value = "show_settings_ui")]
            ShowSettingsUi = 1
        }


        /// <summary>
        /// Action will always be &#x60;show_settings_ui&#x60; show_settings_ui ContinueWithActionShowSettingsUIString
        /// </summary>
        /// <value>Action will always be &#x60;show_settings_ui&#x60; show_settings_ui ContinueWithActionShowSettingsUIString</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public ActionEnum Action { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWithSettingsUi" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientContinueWithSettingsUi()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWithSettingsUi" /> class.
        /// </summary>
        /// <param name="action">Action will always be &#x60;show_settings_ui&#x60; show_settings_ui ContinueWithActionShowSettingsUIString (required).</param>
        /// <param name="flow">flow (required).</param>
        public ClientContinueWithSettingsUi(ActionEnum action = default(ActionEnum), ClientContinueWithSettingsUiFlow flow = default(ClientContinueWithSettingsUiFlow))
        {
            this.Action = action;
            // to ensure "flow" is required (not null)
            if (flow == null)
            {
                throw new ArgumentNullException("flow is a required property for ClientContinueWithSettingsUi and cannot be null");
            }
            this.Flow = flow;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Flow
        /// </summary>
        [DataMember(Name = "flow", IsRequired = true, EmitDefaultValue = true)]
        public ClientContinueWithSettingsUiFlow Flow { get; set; }

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
            sb.Append("class ClientContinueWithSettingsUi {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Flow: ").Append(Flow).Append("\n");
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
