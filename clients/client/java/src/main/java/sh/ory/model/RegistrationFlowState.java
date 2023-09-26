/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.10
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed.
 */
@JsonAdapter(RegistrationFlowState.Adapter.class)
public enum RegistrationFlowState {
  
  CHOOSE_METHOD("choose_method"),
  
  SENT_EMAIL("sent_email"),
  
  PASSED_CHALLENGE("passed_challenge");

  private String value;

  RegistrationFlowState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RegistrationFlowState fromValue(String value) {
    for (RegistrationFlowState b : RegistrationFlowState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RegistrationFlowState> {
    @Override
    public void write(final JsonWriter jsonWriter, final RegistrationFlowState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RegistrationFlowState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RegistrationFlowState.fromValue(value);
    }
  }
}

