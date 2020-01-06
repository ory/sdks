/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

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
import sh.ory.keto.model.OryAccessControlPolicyRole;

/**
 * UpsertOryAccessControlPolicyRole upsert ory access control policy role
 */
@ApiModel(description = "UpsertOryAccessControlPolicyRole upsert ory access control policy role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:19:09.771391+01:00[Europe/Berlin]")
public class UpsertOryAccessControlPolicyRole {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private OryAccessControlPolicyRole body;

  public static final String SERIALIZED_NAME_FLAVOR = "flavor";
  @SerializedName(SERIALIZED_NAME_FLAVOR)
  private String flavor;


  public UpsertOryAccessControlPolicyRole body(OryAccessControlPolicyRole body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OryAccessControlPolicyRole getBody() {
    return body;
  }


  public void setBody(OryAccessControlPolicyRole body) {
    this.body = body;
  }


  public UpsertOryAccessControlPolicyRole flavor(String flavor) {
    
    this.flavor = flavor;
    return this;
  }

   /**
   * The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.  in: path
   * @return flavor
  **/
  @ApiModelProperty(required = true, value = "The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path")

  public String getFlavor() {
    return flavor;
  }


  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertOryAccessControlPolicyRole upsertOryAccessControlPolicyRole = (UpsertOryAccessControlPolicyRole) o;
    return Objects.equals(this.body, upsertOryAccessControlPolicyRole.body) &&
        Objects.equals(this.flavor, upsertOryAccessControlPolicyRole.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, flavor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertOryAccessControlPolicyRole {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

