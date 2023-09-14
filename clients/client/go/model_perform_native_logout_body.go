/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.2.6
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// PerformNativeLogoutBody Perform Native Logout Request Body
type PerformNativeLogoutBody struct {
	// The Session Token  Invalidate this session token.
	SessionToken string `json:"session_token"`
	AdditionalProperties map[string]interface{}
}

type _PerformNativeLogoutBody PerformNativeLogoutBody

// NewPerformNativeLogoutBody instantiates a new PerformNativeLogoutBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPerformNativeLogoutBody(sessionToken string) *PerformNativeLogoutBody {
	this := PerformNativeLogoutBody{}
	this.SessionToken = sessionToken
	return &this
}

// NewPerformNativeLogoutBodyWithDefaults instantiates a new PerformNativeLogoutBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPerformNativeLogoutBodyWithDefaults() *PerformNativeLogoutBody {
	this := PerformNativeLogoutBody{}
	return &this
}

// GetSessionToken returns the SessionToken field value
func (o *PerformNativeLogoutBody) GetSessionToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SessionToken
}

// GetSessionTokenOk returns a tuple with the SessionToken field value
// and a boolean to check if the value has been set.
func (o *PerformNativeLogoutBody) GetSessionTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SessionToken, true
}

// SetSessionToken sets field value
func (o *PerformNativeLogoutBody) SetSessionToken(v string) {
	o.SessionToken = v
}

func (o PerformNativeLogoutBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["session_token"] = o.SessionToken
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *PerformNativeLogoutBody) UnmarshalJSON(bytes []byte) (err error) {
	varPerformNativeLogoutBody := _PerformNativeLogoutBody{}

	if err = json.Unmarshal(bytes, &varPerformNativeLogoutBody); err == nil {
		*o = PerformNativeLogoutBody(varPerformNativeLogoutBody)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "session_token")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullablePerformNativeLogoutBody struct {
	value *PerformNativeLogoutBody
	isSet bool
}

func (v NullablePerformNativeLogoutBody) Get() *PerformNativeLogoutBody {
	return v.value
}

func (v *NullablePerformNativeLogoutBody) Set(val *PerformNativeLogoutBody) {
	v.value = val
	v.isSet = true
}

func (v NullablePerformNativeLogoutBody) IsSet() bool {
	return v.isSet
}

func (v *NullablePerformNativeLogoutBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePerformNativeLogoutBody(val *PerformNativeLogoutBody) *NullablePerformNativeLogoutBody {
	return &NullablePerformNativeLogoutBody{value: val, isSet: true}
}

func (v NullablePerformNativeLogoutBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePerformNativeLogoutBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


