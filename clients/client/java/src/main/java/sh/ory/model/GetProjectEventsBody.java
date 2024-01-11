/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.AttributeFilter;

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
 * Body of the getProjectEvents endpoint
 */
@ApiModel(description = "Body of the getProjectEvents endpoint")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T09:01:54.811187495Z[Etc/UTC]")
public class GetProjectEventsBody {
  public static final String SERIALIZED_NAME_EVENT_NAME = "event_name";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<AttributeFilter> filters = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private OffsetDateTime from;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = 25l;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "page_token";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private OffsetDateTime to;

  public GetProjectEventsBody() {
  }

  public GetProjectEventsBody eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name to query for
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The event name to query for")

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public GetProjectEventsBody filters(List<AttributeFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public GetProjectEventsBody addFiltersItem(AttributeFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Event attribute filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event attribute filters")

  public List<AttributeFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<AttributeFilter> filters) {
    this.filters = filters;
  }


  public GetProjectEventsBody from(OffsetDateTime from) {
    
    this.from = from;
    return this;
  }

   /**
   * The start RFC3339 date of the time window
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start RFC3339 date of the time window")

  public OffsetDateTime getFrom() {
    return from;
  }


  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }


  public GetProjectEventsBody pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Maximum number of events to return
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of events to return")

  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public GetProjectEventsBody pageToken(String pageToken) {
    
    this.pageToken = pageToken;
    return this;
  }

   /**
   * Pagination token to fetch next page, empty if first page
   * @return pageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pagination token to fetch next page, empty if first page")

  public String getPageToken() {
    return pageToken;
  }


  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  public GetProjectEventsBody to(OffsetDateTime to) {
    
    this.to = to;
    return this;
  }

   /**
   * The end RFC3339 date of the time window
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The end RFC3339 date of the time window")

  public OffsetDateTime getTo() {
    return to;
  }


  public void setTo(OffsetDateTime to) {
    this.to = to;
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
   * @return the GetProjectEventsBody instance itself
   */
  public GetProjectEventsBody putAdditionalProperty(String key, Object value) {
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
    GetProjectEventsBody getProjectEventsBody = (GetProjectEventsBody) o;
    return Objects.equals(this.eventName, getProjectEventsBody.eventName) &&
        Objects.equals(this.filters, getProjectEventsBody.filters) &&
        Objects.equals(this.from, getProjectEventsBody.from) &&
        Objects.equals(this.pageSize, getProjectEventsBody.pageSize) &&
        Objects.equals(this.pageToken, getProjectEventsBody.pageToken) &&
        Objects.equals(this.to, getProjectEventsBody.to)&&
        Objects.equals(this.additionalProperties, getProjectEventsBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, filters, from, pageSize, pageToken, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectEventsBody {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("event_name");
    openapiFields.add("filters");
    openapiFields.add("from");
    openapiFields.add("page_size");
    openapiFields.add("page_token");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetProjectEventsBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetProjectEventsBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProjectEventsBody is not found in the empty JSON string", GetProjectEventsBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProjectEventsBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("event_name") != null && !jsonObj.get("event_name").isJsonNull()) && !jsonObj.get("event_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_name").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            AttributeFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("page_token") != null && !jsonObj.get("page_token").isJsonNull()) && !jsonObj.get("page_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProjectEventsBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProjectEventsBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProjectEventsBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProjectEventsBody.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProjectEventsBody>() {
           @Override
           public void write(JsonWriter out, GetProjectEventsBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProjectEventsBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetProjectEventsBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetProjectEventsBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProjectEventsBody
  * @throws IOException if the JSON string is invalid with respect to GetProjectEventsBody
  */
  public static GetProjectEventsBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProjectEventsBody.class);
  }

 /**
  * Convert an instance of GetProjectEventsBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

