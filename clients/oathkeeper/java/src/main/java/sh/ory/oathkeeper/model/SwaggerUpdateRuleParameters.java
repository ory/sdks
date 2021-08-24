/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.50
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

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
import sh.ory.oathkeeper.model.SwaggerRule;

/**
 * SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters swagger update rule parameters
 */
@ApiModel(description = "SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters SwaggerUpdateRuleParameters swagger update rule parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-24T08:58:23.375524725Z[GMT]")
public class SwaggerUpdateRuleParameters {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private SwaggerRule body;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public SwaggerUpdateRuleParameters body(SwaggerRule body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SwaggerRule getBody() {
    return body;
  }


  public void setBody(SwaggerRule body) {
    this.body = body;
  }


  public SwaggerUpdateRuleParameters id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * in: path
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "in: path")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerUpdateRuleParameters swaggerUpdateRuleParameters = (SwaggerUpdateRuleParameters) o;
    return Objects.equals(this.body, swaggerUpdateRuleParameters.body) &&
        Objects.equals(this.id, swaggerUpdateRuleParameters.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerUpdateRuleParameters {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

