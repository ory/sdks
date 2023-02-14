/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.10
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
 * UpdateVerificationFlowWithCodeMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T13:30:09.912995281Z[Etc/UTC]")
public class UpdateVerificationFlowWithCodeMethodBody {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public UpdateVerificationFlowWithCodeMethodBody() {
  }

  public UpdateVerificationFlowWithCodeMethodBody code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The verification code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The verification code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public UpdateVerificationFlowWithCodeMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateVerificationFlowWithCodeMethodBody email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateVerificationFlowWithCodeMethodBody flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * The id of the flow
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the flow")

  public String getFlow() {
    return flow;
  }


  public void setFlow(String flow) {
    this.flow = flow;
  }


  public UpdateVerificationFlowWithCodeMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the recovery method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Method is the recovery method")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerificationFlowWithCodeMethodBody updateVerificationFlowWithCodeMethodBody = (UpdateVerificationFlowWithCodeMethodBody) o;
    return Objects.equals(this.code, updateVerificationFlowWithCodeMethodBody.code) &&
        Objects.equals(this.csrfToken, updateVerificationFlowWithCodeMethodBody.csrfToken) &&
        Objects.equals(this.email, updateVerificationFlowWithCodeMethodBody.email) &&
        Objects.equals(this.flow, updateVerificationFlowWithCodeMethodBody.flow) &&
        Objects.equals(this.method, updateVerificationFlowWithCodeMethodBody.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, csrfToken, email, flow, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerificationFlowWithCodeMethodBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("csrf_token");
    openapiFields.add("email");
    openapiFields.add("flow");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateVerificationFlowWithCodeMethodBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateVerificationFlowWithCodeMethodBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVerificationFlowWithCodeMethodBody is not found in the empty JSON string", UpdateVerificationFlowWithCodeMethodBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateVerificationFlowWithCodeMethodBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVerificationFlowWithCodeMethodBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("flow") != null && !jsonObj.get("flow").isJsonNull()) && !jsonObj.get("flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVerificationFlowWithCodeMethodBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVerificationFlowWithCodeMethodBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVerificationFlowWithCodeMethodBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVerificationFlowWithCodeMethodBody.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVerificationFlowWithCodeMethodBody>() {
           @Override
           public void write(JsonWriter out, UpdateVerificationFlowWithCodeMethodBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVerificationFlowWithCodeMethodBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVerificationFlowWithCodeMethodBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVerificationFlowWithCodeMethodBody
  * @throws IOException if the JSON string is invalid with respect to UpdateVerificationFlowWithCodeMethodBody
  */
  public static UpdateVerificationFlowWithCodeMethodBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVerificationFlowWithCodeMethodBody.class);
  }

 /**
  * Convert an instance of UpdateVerificationFlowWithCodeMethodBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

