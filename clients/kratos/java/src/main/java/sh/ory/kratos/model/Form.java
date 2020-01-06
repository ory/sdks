/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.1
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.ory.kratos.model.Error;
import sh.ory.kratos.model.FormField;

/**
 * HTMLForm represents a HTML Form. The container can work with both HTTP Form and JSON requests
 */
@ApiModel(description = "HTMLForm represents a HTML Form. The container can work with both HTTP Form and JSON requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T13:38:36.268669+01:00[Europe/Berlin]")
public class Form {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, FormField> fields = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public Form action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action should be used as the form action URL (&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;).
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action should be used as the form action URL (<form action=\"{{ .Action }}\" method=\"post\">).")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public Form errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public Form addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors contains all form errors. These will be duplicates of the individual field errors.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Errors contains all form errors. These will be duplicates of the individual field errors.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public Form fields(Map<String, FormField> fields) {
    
    this.fields = fields;
    return this;
  }

  public Form putFieldsItem(String key, FormField fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<String, FormField>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * Fields contains multiple fields asdfasdf
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields contains multiple fields asdfasdf")

  public Map<String, FormField> getFields() {
    return fields;
  }


  public void setFields(Map<String, FormField> fields) {
    this.fields = fields;
  }


  public Form method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the form method (e.g. POST)
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Method is the form method (e.g. POST)")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.action, form.action) &&
        Objects.equals(this.errors, form.errors) &&
        Objects.equals(this.fields, form.fields) &&
        Objects.equals(this.method, form.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, errors, fields, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

