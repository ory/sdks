/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.0-alpha.1
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
import org.threeten.bp.OffsetDateTime;

/**
 * RecoveryLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-15T14:12:43.067750Z[GMT]")
public class RecoveryLink {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_RECOVERY_LINK = "recovery_link";
  @SerializedName(SERIALIZED_NAME_RECOVERY_LINK)
  private String recoveryLink;


  public RecoveryLink expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Recovery Link Expires At  The timestamp when the recovery link expires.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recovery Link Expires At  The timestamp when the recovery link expires.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RecoveryLink recoveryLink(String recoveryLink) {
    
    this.recoveryLink = recoveryLink;
    return this;
  }

   /**
   * Recovery Link  This link can be used to recover the account.
   * @return recoveryLink
  **/
  @ApiModelProperty(required = true, value = "Recovery Link  This link can be used to recover the account.")

  public String getRecoveryLink() {
    return recoveryLink;
  }


  public void setRecoveryLink(String recoveryLink) {
    this.recoveryLink = recoveryLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryLink recoveryLink = (RecoveryLink) o;
    return Objects.equals(this.expiresAt, recoveryLink.expiresAt) &&
        Objects.equals(this.recoveryLink, recoveryLink.recoveryLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, recoveryLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryLink {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    recoveryLink: ").append(toIndentedString(recoveryLink)).append("\n");
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

