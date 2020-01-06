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
 * Policies is an array of policies.
 */
@ApiModel(description = "Policies is an array of policies.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:19:09.771391+01:00[Europe/Berlin]")
public class ListOryAccessControlPoliciesOK {
  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<OryAccessControlPolicy> payload = null;


  public ListOryAccessControlPoliciesOK payload(List<OryAccessControlPolicy> payload) {
    
    this.payload = payload;
    return this;
  }

  public ListOryAccessControlPoliciesOK addPayloadItem(OryAccessControlPolicy payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<OryAccessControlPolicy>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "payload")

  public List<OryAccessControlPolicy> getPayload() {
    return payload;
  }


  public void setPayload(List<OryAccessControlPolicy> payload) {
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
    ListOryAccessControlPoliciesOK listOryAccessControlPoliciesOK = (ListOryAccessControlPoliciesOK) o;
    return Objects.equals(this.payload, listOryAccessControlPoliciesOK.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOryAccessControlPoliciesOK {\n");
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

