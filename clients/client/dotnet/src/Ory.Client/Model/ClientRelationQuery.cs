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
    /// Relation Query
    /// </summary>
    [DataContract(Name = "relationQuery")]
    public partial class ClientRelationQuery : IEquatable<ClientRelationQuery>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientRelationQuery" /> class.
        /// </summary>
        /// <param name="_namespace">Namespace to query.</param>
        /// <param name="_object">Object to query.</param>
        /// <param name="relation">Relation to query.</param>
        /// <param name="subjectId">SubjectID to query  Either SubjectSet or SubjectID can be provided..</param>
        /// <param name="subjectSet">subjectSet.</param>
        public ClientRelationQuery(string _namespace = default(string), string _object = default(string), string relation = default(string), string subjectId = default(string), ClientSubjectSet subjectSet = default(ClientSubjectSet))
        {
            this.Namespace = _namespace;
            this.Object = _object;
            this.Relation = relation;
            this.SubjectId = subjectId;
            this.SubjectSet = subjectSet;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Namespace to query
        /// </summary>
        /// <value>Namespace to query</value>
        [DataMember(Name = "namespace", EmitDefaultValue = false)]
        public string Namespace { get; set; }

        /// <summary>
        /// Object to query
        /// </summary>
        /// <value>Object to query</value>
        [DataMember(Name = "object", EmitDefaultValue = false)]
        public string Object { get; set; }

        /// <summary>
        /// Relation to query
        /// </summary>
        /// <value>Relation to query</value>
        [DataMember(Name = "relation", EmitDefaultValue = false)]
        public string Relation { get; set; }

        /// <summary>
        /// SubjectID to query  Either SubjectSet or SubjectID can be provided.
        /// </summary>
        /// <value>SubjectID to query  Either SubjectSet or SubjectID can be provided.</value>
        [DataMember(Name = "subject_id", EmitDefaultValue = false)]
        public string SubjectId { get; set; }

        /// <summary>
        /// Gets or Sets SubjectSet
        /// </summary>
        [DataMember(Name = "subject_set", EmitDefaultValue = false)]
        public ClientSubjectSet SubjectSet { get; set; }

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
            sb.Append("class ClientRelationQuery {\n");
            sb.Append("  Namespace: ").Append(Namespace).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  Relation: ").Append(Relation).Append("\n");
            sb.Append("  SubjectId: ").Append(SubjectId).Append("\n");
            sb.Append("  SubjectSet: ").Append(SubjectSet).Append("\n");
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
            return this.Equals(input as ClientRelationQuery);
        }

        /// <summary>
        /// Returns true if ClientRelationQuery instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientRelationQuery to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientRelationQuery input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Namespace == input.Namespace ||
                    (this.Namespace != null &&
                    this.Namespace.Equals(input.Namespace))
                ) && 
                (
                    this.Object == input.Object ||
                    (this.Object != null &&
                    this.Object.Equals(input.Object))
                ) && 
                (
                    this.Relation == input.Relation ||
                    (this.Relation != null &&
                    this.Relation.Equals(input.Relation))
                ) && 
                (
                    this.SubjectId == input.SubjectId ||
                    (this.SubjectId != null &&
                    this.SubjectId.Equals(input.SubjectId))
                ) && 
                (
                    this.SubjectSet == input.SubjectSet ||
                    (this.SubjectSet != null &&
                    this.SubjectSet.Equals(input.SubjectSet))
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
                if (this.Namespace != null)
                {
                    hashCode = (hashCode * 59) + this.Namespace.GetHashCode();
                }
                if (this.Object != null)
                {
                    hashCode = (hashCode * 59) + this.Object.GetHashCode();
                }
                if (this.Relation != null)
                {
                    hashCode = (hashCode * 59) + this.Relation.GetHashCode();
                }
                if (this.SubjectId != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectId.GetHashCode();
                }
                if (this.SubjectSet != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectSet.GetHashCode();
                }
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
