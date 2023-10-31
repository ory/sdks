/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.2.16
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// CheckPermissionResult The content of the allowed field is mirrored in the HTTP status code.
type CheckPermissionResult struct {
	// whether the relation tuple is allowed
	Allowed bool `json:"allowed"`
	AdditionalProperties map[string]interface{}
}

type _CheckPermissionResult CheckPermissionResult

// NewCheckPermissionResult instantiates a new CheckPermissionResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCheckPermissionResult(allowed bool) *CheckPermissionResult {
	this := CheckPermissionResult{}
	this.Allowed = allowed
	return &this
}

// NewCheckPermissionResultWithDefaults instantiates a new CheckPermissionResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCheckPermissionResultWithDefaults() *CheckPermissionResult {
	this := CheckPermissionResult{}
	return &this
}

// GetAllowed returns the Allowed field value
func (o *CheckPermissionResult) GetAllowed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Allowed
}

// GetAllowedOk returns a tuple with the Allowed field value
// and a boolean to check if the value has been set.
func (o *CheckPermissionResult) GetAllowedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Allowed, true
}

// SetAllowed sets field value
func (o *CheckPermissionResult) SetAllowed(v bool) {
	o.Allowed = v
}

func (o CheckPermissionResult) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["allowed"] = o.Allowed
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *CheckPermissionResult) UnmarshalJSON(bytes []byte) (err error) {
	varCheckPermissionResult := _CheckPermissionResult{}

	if err = json.Unmarshal(bytes, &varCheckPermissionResult); err == nil {
		*o = CheckPermissionResult(varCheckPermissionResult)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "allowed")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableCheckPermissionResult struct {
	value *CheckPermissionResult
	isSet bool
}

func (v NullableCheckPermissionResult) Get() *CheckPermissionResult {
	return v.value
}

func (v *NullableCheckPermissionResult) Set(val *CheckPermissionResult) {
	v.value = val
	v.isSet = true
}

func (v NullableCheckPermissionResult) IsSet() bool {
	return v.isSet
}

func (v *NullableCheckPermissionResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCheckPermissionResult(val *CheckPermissionResult) *NullableCheckPermissionResult {
	return &NullableCheckPermissionResult{value: val, isSet: true}
}

func (v NullableCheckPermissionResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCheckPermissionResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


