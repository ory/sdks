/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.5.2
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the UpdateSettingsFlowWithProfileMethod type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateSettingsFlowWithProfileMethod{}

// UpdateSettingsFlowWithProfileMethod Update Settings Flow with Profile Method
type UpdateSettingsFlowWithProfileMethod struct {
	// The Anti-CSRF Token  This token is only required when performing browser flows.
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Method  Should be set to profile when trying to update a profile.
	Method string `json:"method"`
	// Traits  The identity's traits.
	Traits map[string]interface{} `json:"traits"`
	AdditionalProperties map[string]interface{}
}

type _UpdateSettingsFlowWithProfileMethod UpdateSettingsFlowWithProfileMethod

// NewUpdateSettingsFlowWithProfileMethod instantiates a new UpdateSettingsFlowWithProfileMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateSettingsFlowWithProfileMethod(method string, traits map[string]interface{}) *UpdateSettingsFlowWithProfileMethod {
	this := UpdateSettingsFlowWithProfileMethod{}
	this.Method = method
	this.Traits = traits
	return &this
}

// NewUpdateSettingsFlowWithProfileMethodWithDefaults instantiates a new UpdateSettingsFlowWithProfileMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateSettingsFlowWithProfileMethodWithDefaults() *UpdateSettingsFlowWithProfileMethod {
	this := UpdateSettingsFlowWithProfileMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithProfileMethod) GetCsrfToken() string {
	if o == nil || IsNil(o.CsrfToken) {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithProfileMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || IsNil(o.CsrfToken) {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithProfileMethod) HasCsrfToken() bool {
	if o != nil && !IsNil(o.CsrfToken) {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateSettingsFlowWithProfileMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetMethod returns the Method field value
func (o *UpdateSettingsFlowWithProfileMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithProfileMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateSettingsFlowWithProfileMethod) SetMethod(v string) {
	o.Method = v
}

// GetTraits returns the Traits field value
func (o *UpdateSettingsFlowWithProfileMethod) GetTraits() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Traits
}

// GetTraitsOk returns a tuple with the Traits field value
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithProfileMethod) GetTraitsOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Traits, true
}

// SetTraits sets field value
func (o *UpdateSettingsFlowWithProfileMethod) SetTraits(v map[string]interface{}) {
	o.Traits = v
}

func (o UpdateSettingsFlowWithProfileMethod) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateSettingsFlowWithProfileMethod) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.CsrfToken) {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	toSerialize["method"] = o.Method
	toSerialize["traits"] = o.Traits

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *UpdateSettingsFlowWithProfileMethod) UnmarshalJSON(bytes []byte) (err error) {
    // This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"method",
		"traits",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(bytes, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varUpdateSettingsFlowWithProfileMethod := _UpdateSettingsFlowWithProfileMethod{}

	err = json.Unmarshal(bytes, &varUpdateSettingsFlowWithProfileMethod)

	if err != nil {
		return err
	}

	*o = UpdateSettingsFlowWithProfileMethod(varUpdateSettingsFlowWithProfileMethod)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "csrf_token")
		delete(additionalProperties, "method")
		delete(additionalProperties, "traits")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUpdateSettingsFlowWithProfileMethod struct {
	value *UpdateSettingsFlowWithProfileMethod
	isSet bool
}

func (v NullableUpdateSettingsFlowWithProfileMethod) Get() *UpdateSettingsFlowWithProfileMethod {
	return v.value
}

func (v *NullableUpdateSettingsFlowWithProfileMethod) Set(val *UpdateSettingsFlowWithProfileMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateSettingsFlowWithProfileMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateSettingsFlowWithProfileMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateSettingsFlowWithProfileMethod(val *UpdateSettingsFlowWithProfileMethod) *NullableUpdateSettingsFlowWithProfileMethod {
	return &NullableUpdateSettingsFlowWithProfileMethod{value: val, isSet: true}
}

func (v NullableUpdateSettingsFlowWithProfileMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateSettingsFlowWithProfileMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


