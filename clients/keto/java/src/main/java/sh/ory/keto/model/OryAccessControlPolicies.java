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
import java.util.ArrayList;
import java.util.List;
import sh.ory.keto.model.OryAccessControlPolicy;

/**
 * OryAccessControlPolicies
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:19:09.771391+01:00[Europe/Berlin]")
public class OryAccessControlPolicies {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private List<OryAccessControlPolicy> body = null;


  public OryAccessControlPolicies body(List<OryAccessControlPolicy> body) {
    
    this.body = body;
    return this;
  }

  public OryAccessControlPolicies addBodyItem(OryAccessControlPolicy bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<OryAccessControlPolicy>();
    }
    this.body.add(bodyItem);
    return this;
  }

   /**
   * The request body.  in: body type: array
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The request body.  in: body type: array")

  public List<OryAccessControlPolicy> getBody() {
    return body;
  }


  public void setBody(List<OryAccessControlPolicy> body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OryAccessControlPolicies oryAccessControlPolicies = (OryAccessControlPolicies) o;
    return Objects.equals(this.body, oryAccessControlPolicies.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OryAccessControlPolicies {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

