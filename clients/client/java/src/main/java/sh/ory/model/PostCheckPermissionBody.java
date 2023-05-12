/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.28
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.model.SubjectSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Check Permission using Post Request Body
 */
@ApiModel(description = "Check Permission using Post Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T07:24:28.228249689Z[Etc/UTC]")
public class PostCheckPermissionBody {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_RELATION = "relation";
  @SerializedName(SERIALIZED_NAME_RELATION)
  private String relation;

  public static final String SERIALIZED_NAME_SUBJECT_ID = "subject_id";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ID)
  private String subjectId;

  public static final String SERIALIZED_NAME_SUBJECT_SET = "subject_set";
  @SerializedName(SERIALIZED_NAME_SUBJECT_SET)
  private SubjectSet subjectSet;

  public PostCheckPermissionBody() {
  }

  public PostCheckPermissionBody namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace to query
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace to query")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public PostCheckPermissionBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Object to query
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object to query")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public PostCheckPermissionBody relation(String relation) {
    
    this.relation = relation;
    return this;
  }

   /**
   * Relation to query
   * @return relation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relation to query")

  public String getRelation() {
    return relation;
  }


  public void setRelation(String relation) {
    this.relation = relation;
  }


  public PostCheckPermissionBody subjectId(String subjectId) {
    
    this.subjectId = subjectId;
    return this;
  }

   /**
   * SubjectID to query  Either SubjectSet or SubjectID can be provided.
   * @return subjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubjectID to query  Either SubjectSet or SubjectID can be provided.")

  public String getSubjectId() {
    return subjectId;
  }


  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  public PostCheckPermissionBody subjectSet(SubjectSet subjectSet) {
    
    this.subjectSet = subjectSet;
    return this;
  }

   /**
   * Get subjectSet
   * @return subjectSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjectSet getSubjectSet() {
    return subjectSet;
  }


  public void setSubjectSet(SubjectSet subjectSet) {
    this.subjectSet = subjectSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCheckPermissionBody postCheckPermissionBody = (PostCheckPermissionBody) o;
    return Objects.equals(this.namespace, postCheckPermissionBody.namespace) &&
        Objects.equals(this._object, postCheckPermissionBody._object) &&
        Objects.equals(this.relation, postCheckPermissionBody.relation) &&
        Objects.equals(this.subjectId, postCheckPermissionBody.subjectId) &&
        Objects.equals(this.subjectSet, postCheckPermissionBody.subjectSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, _object, relation, subjectId, subjectSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCheckPermissionBody {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectSet: ").append(toIndentedString(subjectSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("namespace");
    openapiFields.add("object");
    openapiFields.add("relation");
    openapiFields.add("subject_id");
    openapiFields.add("subject_set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostCheckPermissionBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostCheckPermissionBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostCheckPermissionBody is not found in the empty JSON string", PostCheckPermissionBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostCheckPermissionBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostCheckPermissionBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("relation") != null && !jsonObj.get("relation").isJsonNull()) && !jsonObj.get("relation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation").toString()));
      }
      if ((jsonObj.get("subject_id") != null && !jsonObj.get("subject_id").isJsonNull()) && !jsonObj.get("subject_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_id").toString()));
      }
      // validate the optional field `subject_set`
      if (jsonObj.get("subject_set") != null && !jsonObj.get("subject_set").isJsonNull()) {
        SubjectSet.validateJsonObject(jsonObj.getAsJsonObject("subject_set"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostCheckPermissionBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostCheckPermissionBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostCheckPermissionBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostCheckPermissionBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PostCheckPermissionBody>() {
           @Override
           public void write(JsonWriter out, PostCheckPermissionBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostCheckPermissionBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostCheckPermissionBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostCheckPermissionBody
  * @throws IOException if the JSON string is invalid with respect to PostCheckPermissionBody
  */
  public static PostCheckPermissionBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostCheckPermissionBody.class);
  }

 /**
  * Convert an instance of PostCheckPermissionBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

