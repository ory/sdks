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
    /// Update Registration Flow with Passkey Method
    /// </summary>
    [DataContract(Name = "updateRegistrationFlowWithPasskeyMethod")]
    public partial class ClientUpdateRegistrationFlowWithPasskeyMethod : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateRegistrationFlowWithPasskeyMethod" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientUpdateRegistrationFlowWithPasskeyMethod()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateRegistrationFlowWithPasskeyMethod" /> class.
        /// </summary>
        /// <param name="csrfToken">CSRFToken is the anti-CSRF token.</param>
        /// <param name="method">Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a Passkey. (required).</param>
        /// <param name="passkeyRegister">Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here..</param>
        /// <param name="traits">The identity&#39;s traits (required).</param>
        /// <param name="transientPayload">Transient data to pass along to any webhooks.</param>
        public ClientUpdateRegistrationFlowWithPasskeyMethod(string csrfToken = default(string), string method = default(string), string passkeyRegister = default(string), Object traits = default(Object), Object transientPayload = default(Object))
        {
            // to ensure "method" is required (not null)
            if (method == null)
            {
                throw new ArgumentNullException("method is a required property for ClientUpdateRegistrationFlowWithPasskeyMethod and cannot be null");
            }
            this.Method = method;
            // to ensure "traits" is required (not null)
            if (traits == null)
            {
                throw new ArgumentNullException("traits is a required property for ClientUpdateRegistrationFlowWithPasskeyMethod and cannot be null");
            }
            this.Traits = traits;
            this.CsrfToken = csrfToken;
            this.PasskeyRegister = passkeyRegister;
            this.TransientPayload = transientPayload;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// CSRFToken is the anti-CSRF token
        /// </summary>
        /// <value>CSRFToken is the anti-CSRF token</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a Passkey.
        /// </summary>
        /// <value>Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a Passkey.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = true)]
        public string Method { get; set; }

        /// <summary>
        /// Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
        /// </summary>
        /// <value>Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.</value>
        [DataMember(Name = "passkey_register", EmitDefaultValue = false)]
        public string PasskeyRegister { get; set; }

        /// <summary>
        /// The identity&#39;s traits
        /// </summary>
        /// <value>The identity&#39;s traits</value>
        [DataMember(Name = "traits", IsRequired = true, EmitDefaultValue = true)]
        public Object Traits { get; set; }

        /// <summary>
        /// Transient data to pass along to any webhooks
        /// </summary>
        /// <value>Transient data to pass along to any webhooks</value>
        [DataMember(Name = "transient_payload", EmitDefaultValue = false)]
        public Object TransientPayload { get; set; }

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
            sb.Append("class ClientUpdateRegistrationFlowWithPasskeyMethod {\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  PasskeyRegister: ").Append(PasskeyRegister).Append("\n");
            sb.Append("  Traits: ").Append(Traits).Append("\n");
            sb.Append("  TransientPayload: ").Append(TransientPayload).Append("\n");
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
