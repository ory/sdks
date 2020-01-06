/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.35
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
import sh.ory.keto.model.AuthorizationResult;

/**
 * authorizationResult
 */
@ApiModel(description = "authorizationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:49:37.847054+01:00[Europe/Berlin]")
public class DoOryAccessControlPoliciesAllowOK {
  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private AuthorizationResult payload;


  public DoOryAccessControlPoliciesAllowOK payload(AuthorizationResult payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationResult getPayload() {
    return payload;
  }


  public void setPayload(AuthorizationResult payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoOryAccessControlPoliciesAllowOK doOryAccessControlPoliciesAllowOK = (DoOryAccessControlPoliciesAllowOK) o;
    return Objects.equals(this.payload, doOryAccessControlPoliciesAllowOK.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoOryAccessControlPoliciesAllowOK {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

