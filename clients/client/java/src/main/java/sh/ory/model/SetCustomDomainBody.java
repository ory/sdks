/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.13
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.JSON;

/**
 * Update Custom Hostname Body
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T11:34:10.105792443Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class SetCustomDomainBody {
  public static final String SERIALIZED_NAME_COOKIE_DOMAIN = "cookie_domain";
  @SerializedName(SERIALIZED_NAME_COOKIE_DOMAIN)
  private String cookieDomain;

  public static final String SERIALIZED_NAME_CORS_ALLOWED_ORIGINS = "cors_allowed_origins";
  @SerializedName(SERIALIZED_NAME_CORS_ALLOWED_ORIGINS)
  private List<String> corsAllowedOrigins = new ArrayList<>();

  public static final String SERIALIZED_NAME_CORS_ENABLED = "cors_enabled";
  @SerializedName(SERIALIZED_NAME_CORS_ENABLED)
  private Boolean corsEnabled;

  public static final String SERIALIZED_NAME_CUSTOM_UI_BASE_URL = "custom_ui_base_url";
  @SerializedName(SERIALIZED_NAME_CUSTOM_UI_BASE_URL)
  private String customUiBaseUrl;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public SetCustomDomainBody() {
  }

  public SetCustomDomainBody cookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
    return this;
  }

  /**
   * The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.
   * @return cookieDomain
   */
  @javax.annotation.Nullable
  public String getCookieDomain() {
    return cookieDomain;
  }

  public void setCookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
  }


  public SetCustomDomainBody corsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
    return this;
  }

  public SetCustomDomainBody addCorsAllowedOriginsItem(String corsAllowedOriginsItem) {
    if (this.corsAllowedOrigins == null) {
      this.corsAllowedOrigins = new ArrayList<>();
    }
    this.corsAllowedOrigins.add(corsAllowedOriginsItem);
    return this;
  }

  /**
   * CORS Allowed origins for the custom hostname.
   * @return corsAllowedOrigins
   */
  @javax.annotation.Nullable
  public List<String> getCorsAllowedOrigins() {
    return corsAllowedOrigins;
  }

  public void setCorsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
  }


  public SetCustomDomainBody corsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
    return this;
  }

  /**
   * CORS Enabled for the custom hostname.
   * @return corsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getCorsEnabled() {
    return corsEnabled;
  }

  public void setCorsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
  }


  public SetCustomDomainBody customUiBaseUrl(String customUiBaseUrl) {
    this.customUiBaseUrl = customUiBaseUrl;
    return this;
  }

  /**
   * The custom UI base URL where the UI will be exposed.
   * @return customUiBaseUrl
   */
  @javax.annotation.Nullable
  public String getCustomUiBaseUrl() {
    return customUiBaseUrl;
  }

  public void setCustomUiBaseUrl(String customUiBaseUrl) {
    this.customUiBaseUrl = customUiBaseUrl;
  }


  public SetCustomDomainBody hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The custom hostname where the API will be exposed.
   * @return hostname
   */
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SetCustomDomainBody instance itself
   */
  public SetCustomDomainBody putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCustomDomainBody setCustomDomainBody = (SetCustomDomainBody) o;
    return Objects.equals(this.cookieDomain, setCustomDomainBody.cookieDomain) &&
        Objects.equals(this.corsAllowedOrigins, setCustomDomainBody.corsAllowedOrigins) &&
        Objects.equals(this.corsEnabled, setCustomDomainBody.corsEnabled) &&
        Objects.equals(this.customUiBaseUrl, setCustomDomainBody.customUiBaseUrl) &&
        Objects.equals(this.hostname, setCustomDomainBody.hostname)&&
        Objects.equals(this.additionalProperties, setCustomDomainBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieDomain, corsAllowedOrigins, corsEnabled, customUiBaseUrl, hostname, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCustomDomainBody {\n");
    sb.append("    cookieDomain: ").append(toIndentedString(cookieDomain)).append("\n");
    sb.append("    corsAllowedOrigins: ").append(toIndentedString(corsAllowedOrigins)).append("\n");
    sb.append("    corsEnabled: ").append(toIndentedString(corsEnabled)).append("\n");
    sb.append("    customUiBaseUrl: ").append(toIndentedString(customUiBaseUrl)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("cookie_domain");
    openapiFields.add("cors_allowed_origins");
    openapiFields.add("cors_enabled");
    openapiFields.add("custom_ui_base_url");
    openapiFields.add("hostname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetCustomDomainBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetCustomDomainBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetCustomDomainBody is not found in the empty JSON string", SetCustomDomainBody.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cookie_domain") != null && !jsonObj.get("cookie_domain").isJsonNull()) && !jsonObj.get("cookie_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cookie_domain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cors_allowed_origins") != null && !jsonObj.get("cors_allowed_origins").isJsonNull() && !jsonObj.get("cors_allowed_origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cors_allowed_origins` to be an array in the JSON string but got `%s`", jsonObj.get("cors_allowed_origins").toString()));
      }
      if ((jsonObj.get("custom_ui_base_url") != null && !jsonObj.get("custom_ui_base_url").isJsonNull()) && !jsonObj.get("custom_ui_base_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_ui_base_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_ui_base_url").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetCustomDomainBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetCustomDomainBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetCustomDomainBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetCustomDomainBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SetCustomDomainBody>() {
           @Override
           public void write(JsonWriter out, SetCustomDomainBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SetCustomDomainBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SetCustomDomainBody instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SetCustomDomainBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetCustomDomainBody
   * @throws IOException if the JSON string is invalid with respect to SetCustomDomainBody
   */
  public static SetCustomDomainBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetCustomDomainBody.class);
  }

  /**
   * Convert an instance of SetCustomDomainBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

