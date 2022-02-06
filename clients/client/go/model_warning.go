/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.70
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// Warning struct for Warning
type Warning struct {
	Code *int64 `json:"code,omitempty"`
	Message *string `json:"message,omitempty"`
}

// NewWarning instantiates a new Warning object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewWarning() *Warning {
	this := Warning{}
	return &this
}

// NewWarningWithDefaults instantiates a new Warning object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewWarningWithDefaults() *Warning {
	this := Warning{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *Warning) GetCode() int64 {
	if o == nil || o.Code == nil {
		var ret int64
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Warning) GetCodeOk() (*int64, bool) {
	if o == nil || o.Code == nil {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *Warning) HasCode() bool {
	if o != nil && o.Code != nil {
		return true
	}

	return false
}

// SetCode gets a reference to the given int64 and assigns it to the Code field.
func (o *Warning) SetCode(v int64) {
	o.Code = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *Warning) GetMessage() string {
	if o == nil || o.Message == nil {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Warning) GetMessageOk() (*string, bool) {
	if o == nil || o.Message == nil {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *Warning) HasMessage() bool {
	if o != nil && o.Message != nil {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *Warning) SetMessage(v string) {
	o.Message = &v
}

func (o Warning) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Code != nil {
		toSerialize["code"] = o.Code
	}
	if o.Message != nil {
		toSerialize["message"] = o.Message
	}
	return json.Marshal(toSerialize)
}

type NullableWarning struct {
	value *Warning
	isSet bool
}

func (v NullableWarning) Get() *Warning {
	return v.value
}

func (v *NullableWarning) Set(val *Warning) {
	v.value = val
	v.isSet = true
}

func (v NullableWarning) IsSet() bool {
	return v.isSet
}

func (v *NullableWarning) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWarning(val *Warning) *NullableWarning {
	return &NullableWarning{value: val, isSet: true}
}

func (v NullableWarning) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWarning) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


