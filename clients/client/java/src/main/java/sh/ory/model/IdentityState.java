/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.16
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
 * The state can either be &#x60;active&#x60; or &#x60;inactive&#x60;.
 */
@JsonAdapter(IdentityState.Adapter.class)
public enum IdentityState {
  
  ACTIVE("active"),
  
  INACTIVE("inactive");

  private String value;

  IdentityState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityState fromValue(String value) {
    for (IdentityState b : IdentityState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IdentityState> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityState.fromValue(value);
    }
  }
}

