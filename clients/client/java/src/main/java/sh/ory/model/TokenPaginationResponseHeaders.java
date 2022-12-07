/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.2
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * The &#x60;Link&#x60; HTTP header contains multiple links (&#x60;first&#x60;, &#x60;next&#x60;, &#x60;last&#x60;, &#x60;previous&#x60;) formatted as: &#x60;&lt;https://{project-slug}.projects.oryapis.com/admin/clients?limit&#x3D;{limit}&amp;offset&#x3D;{offset}&gt;; rel&#x3D;\&quot;{page}\&quot;&#x60;  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
 */
@ApiModel(description = "The `Link` HTTP header contains multiple links (`first`, `next`, `last`, `previous`) formatted as: `<https://{project-slug}.projects.oryapis.com/admin/clients?limit={limit}&offset={offset}>; rel=\"{page}\"`  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T10:22:49.227448728Z[Etc/UTC]")
public class TokenPaginationResponseHeaders {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_X_TOTAL_COUNT = "x-total-count";
  @SerializedName(SERIALIZED_NAME_X_TOTAL_COUNT)
  private Long xTotalCount;

  public TokenPaginationResponseHeaders() { 
  }

  public TokenPaginationResponseHeaders link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The Link HTTP Header  The &#x60;Link&#x60; header contains a comma-delimited list of links to the following pages:  first: The first page of results. next: The next page of results. prev: The previous page of results. last: The last page of results.  Pages are omitted if they do not exist. For example, if there is no next page, the &#x60;next&#x60; link is omitted. Examples:  &lt;/clients?limit&#x3D;5&amp;offset&#x3D;0&gt;; rel&#x3D;\&quot;first\&quot;,&lt;/clients?limit&#x3D;5&amp;offset&#x3D;15&gt;; rel&#x3D;\&quot;next\&quot;,&lt;/clients?limit&#x3D;5&amp;offset&#x3D;5&gt;; rel&#x3D;\&quot;prev\&quot;,&lt;/clients?limit&#x3D;5&amp;offset&#x3D;20&gt;; rel&#x3D;\&quot;last\&quot;
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Link HTTP Header  The `Link` header contains a comma-delimited list of links to the following pages:  first: The first page of results. next: The next page of results. prev: The previous page of results. last: The last page of results.  Pages are omitted if they do not exist. For example, if there is no next page, the `next` link is omitted. Examples:  </clients?limit=5&offset=0>; rel=\"first\",</clients?limit=5&offset=15>; rel=\"next\",</clients?limit=5&offset=5>; rel=\"prev\",</clients?limit=5&offset=20>; rel=\"last\"")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public TokenPaginationResponseHeaders xTotalCount(Long xTotalCount) {
    
    this.xTotalCount = xTotalCount;
    return this;
  }

   /**
   * The X-Total-Count HTTP Header  The &#x60;X-Total-Count&#x60; header contains the total number of items in the collection.
   * @return xTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The X-Total-Count HTTP Header  The `X-Total-Count` header contains the total number of items in the collection.")

  public Long getxTotalCount() {
    return xTotalCount;
  }


  public void setxTotalCount(Long xTotalCount) {
    this.xTotalCount = xTotalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPaginationResponseHeaders tokenPaginationResponseHeaders = (TokenPaginationResponseHeaders) o;
    return Objects.equals(this.link, tokenPaginationResponseHeaders.link) &&
        Objects.equals(this.xTotalCount, tokenPaginationResponseHeaders.xTotalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, xTotalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPaginationResponseHeaders {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    xTotalCount: ").append(toIndentedString(xTotalCount)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("x-total-count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenPaginationResponseHeaders
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TokenPaginationResponseHeaders.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenPaginationResponseHeaders is not found in the empty JSON string", TokenPaginationResponseHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenPaginationResponseHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenPaginationResponseHeaders` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenPaginationResponseHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenPaginationResponseHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenPaginationResponseHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenPaginationResponseHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenPaginationResponseHeaders>() {
           @Override
           public void write(JsonWriter out, TokenPaginationResponseHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenPaginationResponseHeaders read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenPaginationResponseHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenPaginationResponseHeaders
  * @throws IOException if the JSON string is invalid with respect to TokenPaginationResponseHeaders
  */
  public static TokenPaginationResponseHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenPaginationResponseHeaders.class);
  }

 /**
  * Convert an instance of TokenPaginationResponseHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

