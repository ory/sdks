/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.1
 * Contact: office@ory.sh
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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.kratos.model.UiNodeAnchorAttributes;
import sh.ory.kratos.model.UiNodeImageAttributes;
import sh.ory.kratos.model.UiNodeInputAttributes;
import sh.ory.kratos.model.UiNodeScriptAttributes;
import sh.ory.kratos.model.UiNodeTextAttributes;
import sh.ory.kratos.model.UiText;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import sh.ory.kratos.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-29T16:30:11.172323687Z[Etc/UTC]")
public class UiNodeAttributes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UiNodeAttributes.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UiNodeAttributes.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UiNodeAttributes' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UiNodeAnchorAttributes> adapterUiNodeAnchorAttributes = gson.getDelegateAdapter(this, TypeToken.get(UiNodeAnchorAttributes.class));
            final TypeAdapter<UiNodeImageAttributes> adapterUiNodeImageAttributes = gson.getDelegateAdapter(this, TypeToken.get(UiNodeImageAttributes.class));
            final TypeAdapter<UiNodeInputAttributes> adapterUiNodeInputAttributes = gson.getDelegateAdapter(this, TypeToken.get(UiNodeInputAttributes.class));
            final TypeAdapter<UiNodeScriptAttributes> adapterUiNodeScriptAttributes = gson.getDelegateAdapter(this, TypeToken.get(UiNodeScriptAttributes.class));
            final TypeAdapter<UiNodeTextAttributes> adapterUiNodeTextAttributes = gson.getDelegateAdapter(this, TypeToken.get(UiNodeTextAttributes.class));

            return (TypeAdapter<T>) new TypeAdapter<UiNodeAttributes>() {
                @Override
                public void write(JsonWriter out, UiNodeAttributes value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UiNodeAnchorAttributes`
                    if (value.getActualInstance() instanceof UiNodeAnchorAttributes) {
                        JsonObject obj = adapterUiNodeAnchorAttributes.toJsonTree((UiNodeAnchorAttributes)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UiNodeImageAttributes`
                    if (value.getActualInstance() instanceof UiNodeImageAttributes) {
                        JsonObject obj = adapterUiNodeImageAttributes.toJsonTree((UiNodeImageAttributes)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UiNodeInputAttributes`
                    if (value.getActualInstance() instanceof UiNodeInputAttributes) {
                        JsonObject obj = adapterUiNodeInputAttributes.toJsonTree((UiNodeInputAttributes)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UiNodeScriptAttributes`
                    if (value.getActualInstance() instanceof UiNodeScriptAttributes) {
                        JsonObject obj = adapterUiNodeScriptAttributes.toJsonTree((UiNodeScriptAttributes)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UiNodeTextAttributes`
                    if (value.getActualInstance() instanceof UiNodeTextAttributes) {
                        JsonObject obj = adapterUiNodeTextAttributes.toJsonTree((UiNodeTextAttributes)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes");
                }

                @Override
                public UiNodeAttributes read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UiNodeAnchorAttributes
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UiNodeAnchorAttributes.validateJsonObject(jsonObject);
                        actualAdapter = adapterUiNodeAnchorAttributes;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UiNodeAnchorAttributes'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UiNodeAnchorAttributes failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UiNodeAnchorAttributes'", e);
                    }

                    // deserialize UiNodeImageAttributes
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UiNodeImageAttributes.validateJsonObject(jsonObject);
                        actualAdapter = adapterUiNodeImageAttributes;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UiNodeImageAttributes'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UiNodeImageAttributes failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UiNodeImageAttributes'", e);
                    }

                    // deserialize UiNodeInputAttributes
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UiNodeInputAttributes.validateJsonObject(jsonObject);
                        actualAdapter = adapterUiNodeInputAttributes;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UiNodeInputAttributes'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UiNodeInputAttributes failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UiNodeInputAttributes'", e);
                    }

                    // deserialize UiNodeScriptAttributes
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UiNodeScriptAttributes.validateJsonObject(jsonObject);
                        actualAdapter = adapterUiNodeScriptAttributes;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UiNodeScriptAttributes'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UiNodeScriptAttributes failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UiNodeScriptAttributes'", e);
                    }

                    // deserialize UiNodeTextAttributes
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UiNodeTextAttributes.validateJsonObject(jsonObject);
                        actualAdapter = adapterUiNodeTextAttributes;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UiNodeTextAttributes'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UiNodeTextAttributes failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UiNodeTextAttributes'", e);
                    }

                    if (match == 1) {
                        UiNodeAttributes ret = new UiNodeAttributes();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UiNodeAttributes: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UiNodeAttributes() {
        super("oneOf", Boolean.FALSE);
    }

    public UiNodeAttributes(UiNodeAnchorAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UiNodeAttributes(UiNodeImageAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UiNodeAttributes(UiNodeInputAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UiNodeAttributes(UiNodeScriptAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UiNodeAttributes(UiNodeTextAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UiNodeAnchorAttributes", new GenericType<UiNodeAnchorAttributes>() {
        });
        schemas.put("UiNodeImageAttributes", new GenericType<UiNodeImageAttributes>() {
        });
        schemas.put("UiNodeInputAttributes", new GenericType<UiNodeInputAttributes>() {
        });
        schemas.put("UiNodeScriptAttributes", new GenericType<UiNodeScriptAttributes>() {
        });
        schemas.put("UiNodeTextAttributes", new GenericType<UiNodeTextAttributes>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UiNodeAttributes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UiNodeAnchorAttributes) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UiNodeImageAttributes) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UiNodeInputAttributes) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UiNodeScriptAttributes) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UiNodeTextAttributes) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes");
    }

    /**
     * Get the actual instance, which can be the following:
     * UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes
     *
     * @return The actual instance (UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UiNodeAnchorAttributes`. If the actual instance is not `UiNodeAnchorAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UiNodeAnchorAttributes`
     * @throws ClassCastException if the instance is not `UiNodeAnchorAttributes`
     */
    public UiNodeAnchorAttributes getUiNodeAnchorAttributes() throws ClassCastException {
        return (UiNodeAnchorAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UiNodeImageAttributes`. If the actual instance is not `UiNodeImageAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UiNodeImageAttributes`
     * @throws ClassCastException if the instance is not `UiNodeImageAttributes`
     */
    public UiNodeImageAttributes getUiNodeImageAttributes() throws ClassCastException {
        return (UiNodeImageAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UiNodeInputAttributes`. If the actual instance is not `UiNodeInputAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UiNodeInputAttributes`
     * @throws ClassCastException if the instance is not `UiNodeInputAttributes`
     */
    public UiNodeInputAttributes getUiNodeInputAttributes() throws ClassCastException {
        return (UiNodeInputAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UiNodeScriptAttributes`. If the actual instance is not `UiNodeScriptAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UiNodeScriptAttributes`
     * @throws ClassCastException if the instance is not `UiNodeScriptAttributes`
     */
    public UiNodeScriptAttributes getUiNodeScriptAttributes() throws ClassCastException {
        return (UiNodeScriptAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UiNodeTextAttributes`. If the actual instance is not `UiNodeTextAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UiNodeTextAttributes`
     * @throws ClassCastException if the instance is not `UiNodeTextAttributes`
     */
    public UiNodeTextAttributes getUiNodeTextAttributes() throws ClassCastException {
        return (UiNodeTextAttributes)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UiNodeAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UiNodeAnchorAttributes
    try {
      UiNodeAnchorAttributes.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UiNodeAnchorAttributes failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UiNodeImageAttributes
    try {
      UiNodeImageAttributes.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UiNodeImageAttributes failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UiNodeInputAttributes
    try {
      UiNodeInputAttributes.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UiNodeInputAttributes failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UiNodeScriptAttributes
    try {
      UiNodeScriptAttributes.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UiNodeScriptAttributes failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UiNodeTextAttributes
    try {
      UiNodeTextAttributes.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UiNodeTextAttributes failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UiNodeAttributes with oneOf schemas: UiNodeAnchorAttributes, UiNodeImageAttributes, UiNodeInputAttributes, UiNodeScriptAttributes, UiNodeTextAttributes. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UiNodeAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UiNodeAttributes
  * @throws IOException if the JSON string is invalid with respect to UiNodeAttributes
  */
  public static UiNodeAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UiNodeAttributes.class);
  }

 /**
  * Convert an instance of UiNodeAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

