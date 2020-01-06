/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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

/**
 * Identity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:19:45.176970+01:00[Europe/Berlin]")
public class Identity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_TRAITS_SCHEMA_URL = "traits_schema_url";
  @SerializedName(SERIALIZED_NAME_TRAITS_SCHEMA_URL)
  private String traitsSchemaUrl;


  public Identity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Identity traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Get traits
   * @return traits
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public Identity traitsSchemaUrl(String traitsSchemaUrl) {
    
    this.traitsSchemaUrl = traitsSchemaUrl;
    return this;
  }

   /**
   * TraitsSchemaURL is the JSON Schema to be used for validating the identity&#39;s traits.  format: uri
   * @return traitsSchemaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TraitsSchemaURL is the JSON Schema to be used for validating the identity's traits.  format: uri")

  public String getTraitsSchemaUrl() {
    return traitsSchemaUrl;
  }


  public void setTraitsSchemaUrl(String traitsSchemaUrl) {
    this.traitsSchemaUrl = traitsSchemaUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.id, identity.id) &&
        Objects.equals(this.traits, identity.traits) &&
        Objects.equals(this.traitsSchemaUrl, identity.traitsSchemaUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, traits, traitsSchemaUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    traitsSchemaUrl: ").append(toIndentedString(traitsSchemaUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

