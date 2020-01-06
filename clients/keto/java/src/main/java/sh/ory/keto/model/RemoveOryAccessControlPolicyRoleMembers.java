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

/**
 * RemoveOryAccessControlPolicyRoleMembers remove ory access control policy role members
 */
@ApiModel(description = "RemoveOryAccessControlPolicyRoleMembers remove ory access control policy role members")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:49:37.847054+01:00[Europe/Berlin]")
public class RemoveOryAccessControlPolicyRoleMembers {
  public static final String SERIALIZED_NAME_FLAVOR = "flavor";
  @SerializedName(SERIALIZED_NAME_FLAVOR)
  private String flavor;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MEMBER = "member";
  @SerializedName(SERIALIZED_NAME_MEMBER)
  private String member;


  public RemoveOryAccessControlPolicyRoleMembers flavor(String flavor) {
    
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


  public RemoveOryAccessControlPolicyRoleMembers id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the ORY Access Control Policy Role.  in: path
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the ORY Access Control Policy Role.  in: path")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RemoveOryAccessControlPolicyRoleMembers member(String member) {
    
    this.member = member;
    return this;
  }

   /**
   * The member to be removed.  in: path
   * @return member
  **/
  @ApiModelProperty(required = true, value = "The member to be removed.  in: path")

  public String getMember() {
    return member;
  }


  public void setMember(String member) {
    this.member = member;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOryAccessControlPolicyRoleMembers removeOryAccessControlPolicyRoleMembers = (RemoveOryAccessControlPolicyRoleMembers) o;
    return Objects.equals(this.flavor, removeOryAccessControlPolicyRoleMembers.flavor) &&
        Objects.equals(this.id, removeOryAccessControlPolicyRoleMembers.id) &&
        Objects.equals(this.member, removeOryAccessControlPolicyRoleMembers.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavor, id, member);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOryAccessControlPolicyRoleMembers {\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

