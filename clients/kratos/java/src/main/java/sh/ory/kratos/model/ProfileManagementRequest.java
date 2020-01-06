/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.33
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
import sh.ory.kratos.model.Form;
import sh.ory.kratos.model.Identity;

/**
 * This request is used when an identity wants to update profile information (especially traits) in a selfservice manner.  For more information head over to: https://www.ory.sh/docs/kratos/selfservice/profile
 */
@ApiModel(description = "This request is used when an identity wants to update profile information (especially traits) in a selfservice manner.  For more information head over to: https://www.ory.sh/docs/kratos/selfservice/profile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:23:11.113072+01:00[Europe/Berlin]")
public class ProfileManagementRequest {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private Form form;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_UPDATE_SUCCESSFUL = "update_successful";
  @SerializedName(SERIALIZED_NAME_UPDATE_SUCCESSFUL)
  private Boolean updateSuccessful;


  public ProfileManagementRequest expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the profile, a new request has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the profile, a new request has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public ProfileManagementRequest form(Form form) {
    
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Form getForm() {
    return form;
  }


  public void setForm(Form form) {
    this.form = form;
  }


  public ProfileManagementRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProfileManagementRequest identity(Identity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Identity getIdentity() {
    return identity;
  }


  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  public ProfileManagementRequest issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the request occurred.
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IssuedAt is the time (UTC) when the request occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public ProfileManagementRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public ProfileManagementRequest updateSuccessful(Boolean updateSuccessful) {
    
    this.updateSuccessful = updateSuccessful;
    return this;
  }

   /**
   * UpdateSuccessful, if true, indicates that the profile has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a request with invalid (e.g. \&quot;please use a valid phone number\&quot;) data was sent.
   * @return updateSuccessful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdateSuccessful, if true, indicates that the profile has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a request with invalid (e.g. \"please use a valid phone number\") data was sent.")

  public Boolean getUpdateSuccessful() {
    return updateSuccessful;
  }


  public void setUpdateSuccessful(Boolean updateSuccessful) {
    this.updateSuccessful = updateSuccessful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileManagementRequest profileManagementRequest = (ProfileManagementRequest) o;
    return Objects.equals(this.expiresAt, profileManagementRequest.expiresAt) &&
        Objects.equals(this.form, profileManagementRequest.form) &&
        Objects.equals(this.id, profileManagementRequest.id) &&
        Objects.equals(this.identity, profileManagementRequest.identity) &&
        Objects.equals(this.issuedAt, profileManagementRequest.issuedAt) &&
        Objects.equals(this.requestUrl, profileManagementRequest.requestUrl) &&
        Objects.equals(this.updateSuccessful, profileManagementRequest.updateSuccessful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, form, id, identity, issuedAt, requestUrl, updateSuccessful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileManagementRequest {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    updateSuccessful: ").append(toIndentedString(updateSuccessful)).append("\n");
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

