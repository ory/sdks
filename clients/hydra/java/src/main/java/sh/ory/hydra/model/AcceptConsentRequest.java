/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

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
import sh.ory.hydra.model.ConsentRequestSession;

/**
 * AcceptConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-04T15:39:59.559860+01:00[Europe/Berlin]")
public class AcceptConsentRequest {
  public static final String SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE = "grant_access_token_audience";
  @SerializedName(SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE)
  private List<String> grantAccessTokenAudience = null;

  public static final String SERIALIZED_NAME_GRANT_SCOPE = "grant_scope";
  @SerializedName(SERIALIZED_NAME_GRANT_SCOPE)
  private List<String> grantScope = null;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private ConsentRequestSession session;


  public AcceptConsentRequest grantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    
    this.grantAccessTokenAudience = grantAccessTokenAudience;
    return this;
  }

  public AcceptConsentRequest addGrantAccessTokenAudienceItem(String grantAccessTokenAudienceItem) {
    if (this.grantAccessTokenAudience == null) {
      this.grantAccessTokenAudience = new ArrayList<String>();
    }
    this.grantAccessTokenAudience.add(grantAccessTokenAudienceItem);
    return this;
  }

   /**
   * GrantedAudience sets the audience the user authorized the client to use. Should be a subset of &#x60;requested_access_token_audience&#x60;.
   * @return grantAccessTokenAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GrantedAudience sets the audience the user authorized the client to use. Should be a subset of `requested_access_token_audience`.")

  public List<String> getGrantAccessTokenAudience() {
    return grantAccessTokenAudience;
  }


  public void setGrantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
  }


  public AcceptConsentRequest grantScope(List<String> grantScope) {
    
    this.grantScope = grantScope;
    return this;
  }

  public AcceptConsentRequest addGrantScopeItem(String grantScopeItem) {
    if (this.grantScope == null) {
      this.grantScope = new ArrayList<String>();
    }
    this.grantScope.add(grantScopeItem);
    return this;
  }

   /**
   * GrantScope sets the scope the user authorized the client to use. Should be a subset of &#x60;requested_scope&#x60;.
   * @return grantScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GrantScope sets the scope the user authorized the client to use. Should be a subset of `requested_scope`.")

  public List<String> getGrantScope() {
    return grantScope;
  }


  public void setGrantScope(List<String> grantScope) {
    this.grantScope = grantScope;
  }


  public AcceptConsentRequest remember(Boolean remember) {
    
    this.remember = remember;
    return this;
  }

   /**
   * Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
   * @return remember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.")

  public Boolean getRemember() {
    return remember;
  }


  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public AcceptConsentRequest rememberFor(Long rememberFor) {
    
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
   * @return rememberFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.")

  public Long getRememberFor() {
    return rememberFor;
  }


  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public AcceptConsentRequest session(ConsentRequestSession session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsentRequestSession getSession() {
    return session;
  }


  public void setSession(ConsentRequestSession session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptConsentRequest acceptConsentRequest = (AcceptConsentRequest) o;
    return Objects.equals(this.grantAccessTokenAudience, acceptConsentRequest.grantAccessTokenAudience) &&
        Objects.equals(this.grantScope, acceptConsentRequest.grantScope) &&
        Objects.equals(this.remember, acceptConsentRequest.remember) &&
        Objects.equals(this.rememberFor, acceptConsentRequest.rememberFor) &&
        Objects.equals(this.session, acceptConsentRequest.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantAccessTokenAudience, grantScope, remember, rememberFor, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptConsentRequest {\n");
    sb.append("    grantAccessTokenAudience: ").append(toIndentedString(grantAccessTokenAudience)).append("\n");
    sb.append("    grantScope: ").append(toIndentedString(grantScope)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

