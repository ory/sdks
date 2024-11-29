/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.13
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
    /// MessageDispatch represents an attempt of sending a courier message It contains the status of the attempt (failed or successful) and the error if any occured
    /// </summary>
    [DataContract(Name = "messageDispatch")]
    public partial class ClientMessageDispatch : IValidatableObject
    {
        /// <summary>
        /// The status of this dispatch Either \&quot;failed\&quot; or \&quot;success\&quot; failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
        /// </summary>
        /// <value>The status of this dispatch Either \&quot;failed\&quot; or \&quot;success\&quot; failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Failed for value: failed
            /// </summary>
            [EnumMember(Value = "failed")]
            Failed = 1,

            /// <summary>
            /// Enum Success for value: success
            /// </summary>
            [EnumMember(Value = "success")]
            Success = 2
        }


        /// <summary>
        /// The status of this dispatch Either \&quot;failed\&quot; or \&quot;success\&quot; failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
        /// </summary>
        /// <value>The status of this dispatch Either \&quot;failed\&quot; or \&quot;success\&quot; failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public StatusEnum Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientMessageDispatch" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientMessageDispatch()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientMessageDispatch" /> class.
        /// </summary>
        /// <param name="createdAt">CreatedAt is a helper struct field for gobuffalo.pop. (required).</param>
        /// <param name="error">error.</param>
        /// <param name="id">The ID of this message dispatch (required).</param>
        /// <param name="messageId">The ID of the message being dispatched (required).</param>
        /// <param name="status">The status of this dispatch Either \&quot;failed\&quot; or \&quot;success\&quot; failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess (required).</param>
        /// <param name="updatedAt">UpdatedAt is a helper struct field for gobuffalo.pop. (required).</param>
        public ClientMessageDispatch(DateTime createdAt = default(DateTime), Object error = default(Object), string id = default(string), string messageId = default(string), StatusEnum status = default(StatusEnum), DateTime updatedAt = default(DateTime))
        {
            this.CreatedAt = createdAt;
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for ClientMessageDispatch and cannot be null");
            }
            this.Id = id;
            // to ensure "messageId" is required (not null)
            if (messageId == null)
            {
                throw new ArgumentNullException("messageId is a required property for ClientMessageDispatch and cannot be null");
            }
            this.MessageId = messageId;
            this.Status = status;
            this.UpdatedAt = updatedAt;
            this.Error = error;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// CreatedAt is a helper struct field for gobuffalo.pop.
        /// </summary>
        /// <value>CreatedAt is a helper struct field for gobuffalo.pop.</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public Object Error { get; set; }

        /// <summary>
        /// The ID of this message dispatch
        /// </summary>
        /// <value>The ID of this message dispatch</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The ID of the message being dispatched
        /// </summary>
        /// <value>The ID of the message being dispatched</value>
        [DataMember(Name = "message_id", IsRequired = true, EmitDefaultValue = true)]
        public string MessageId { get; set; }

        /// <summary>
        /// UpdatedAt is a helper struct field for gobuffalo.pop.
        /// </summary>
        /// <value>UpdatedAt is a helper struct field for gobuffalo.pop.</value>
        [DataMember(Name = "updated_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime UpdatedAt { get; set; }

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
            sb.Append("class ClientMessageDispatch {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MessageId: ").Append(MessageId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
