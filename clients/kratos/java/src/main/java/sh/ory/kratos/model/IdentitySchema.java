/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.2
 * Contact: hi@ory.sh
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
 * IdentitySchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T10:30:47.941316621Z[Etc/UTC]")
public class IdentitySchema {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Object schema;


  public IdentitySchema id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Identity JSON Schema
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Identity JSON Schema")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentitySchema schema(Object schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * The actual Identity JSON Schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual Identity JSON Schema")

  public Object getSchema() {
    return schema;
  }


  public void setSchema(Object schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentitySchema identitySchema = (IdentitySchema) o;
    return Objects.equals(this.id, identitySchema.id) &&
        Objects.equals(this.schema, identitySchema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentitySchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

}
