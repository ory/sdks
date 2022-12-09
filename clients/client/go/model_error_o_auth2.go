/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.0
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ErrorOAuth2 Error
type ErrorOAuth2 struct {
	// Error
	Error *string `json:"error,omitempty"`
	// Error Debug Information  Only available in dev mode.
	ErrorDebug *string `json:"error_debug,omitempty"`
	// Error Description
	ErrorDescription *string `json:"error_description,omitempty"`
	// Error Hint  Helps the user identify the error cause.
	ErrorHint *string `json:"error_hint,omitempty"`
	// HTTP Status Code
	StatusCode *int64 `json:"status_code,omitempty"`
}

// NewErrorOAuth2 instantiates a new ErrorOAuth2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewErrorOAuth2() *ErrorOAuth2 {
	this := ErrorOAuth2{}
	return &this
}

// NewErrorOAuth2WithDefaults instantiates a new ErrorOAuth2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorOAuth2WithDefaults() *ErrorOAuth2 {
	this := ErrorOAuth2{}
	return &this
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *ErrorOAuth2) GetError() string {
	if o == nil || o.Error == nil {
		var ret string
		return ret
	}
	return *o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorOAuth2) GetErrorOk() (*string, bool) {
	if o == nil || o.Error == nil {
		return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *ErrorOAuth2) HasError() bool {
	if o != nil && o.Error != nil {
		return true
	}

	return false
}

// SetError gets a reference to the given string and assigns it to the Error field.
func (o *ErrorOAuth2) SetError(v string) {
	o.Error = &v
}

// GetErrorDebug returns the ErrorDebug field value if set, zero value otherwise.
func (o *ErrorOAuth2) GetErrorDebug() string {
	if o == nil || o.ErrorDebug == nil {
		var ret string
		return ret
	}
	return *o.ErrorDebug
}

// GetErrorDebugOk returns a tuple with the ErrorDebug field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorOAuth2) GetErrorDebugOk() (*string, bool) {
	if o == nil || o.ErrorDebug == nil {
		return nil, false
	}
	return o.ErrorDebug, true
}

// HasErrorDebug returns a boolean if a field has been set.
func (o *ErrorOAuth2) HasErrorDebug() bool {
	if o != nil && o.ErrorDebug != nil {
		return true
	}

	return false
}

// SetErrorDebug gets a reference to the given string and assigns it to the ErrorDebug field.
func (o *ErrorOAuth2) SetErrorDebug(v string) {
	o.ErrorDebug = &v
}

// GetErrorDescription returns the ErrorDescription field value if set, zero value otherwise.
func (o *ErrorOAuth2) GetErrorDescription() string {
	if o == nil || o.ErrorDescription == nil {
		var ret string
		return ret
	}
	return *o.ErrorDescription
}

// GetErrorDescriptionOk returns a tuple with the ErrorDescription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorOAuth2) GetErrorDescriptionOk() (*string, bool) {
	if o == nil || o.ErrorDescription == nil {
		return nil, false
	}
	return o.ErrorDescription, true
}

// HasErrorDescription returns a boolean if a field has been set.
func (o *ErrorOAuth2) HasErrorDescription() bool {
	if o != nil && o.ErrorDescription != nil {
		return true
	}

	return false
}

// SetErrorDescription gets a reference to the given string and assigns it to the ErrorDescription field.
func (o *ErrorOAuth2) SetErrorDescription(v string) {
	o.ErrorDescription = &v
}

// GetErrorHint returns the ErrorHint field value if set, zero value otherwise.
func (o *ErrorOAuth2) GetErrorHint() string {
	if o == nil || o.ErrorHint == nil {
		var ret string
		return ret
	}
	return *o.ErrorHint
}

// GetErrorHintOk returns a tuple with the ErrorHint field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorOAuth2) GetErrorHintOk() (*string, bool) {
	if o == nil || o.ErrorHint == nil {
		return nil, false
	}
	return o.ErrorHint, true
}

// HasErrorHint returns a boolean if a field has been set.
func (o *ErrorOAuth2) HasErrorHint() bool {
	if o != nil && o.ErrorHint != nil {
		return true
	}

	return false
}

// SetErrorHint gets a reference to the given string and assigns it to the ErrorHint field.
func (o *ErrorOAuth2) SetErrorHint(v string) {
	o.ErrorHint = &v
}

// GetStatusCode returns the StatusCode field value if set, zero value otherwise.
func (o *ErrorOAuth2) GetStatusCode() int64 {
	if o == nil || o.StatusCode == nil {
		var ret int64
		return ret
	}
	return *o.StatusCode
}

// GetStatusCodeOk returns a tuple with the StatusCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ErrorOAuth2) GetStatusCodeOk() (*int64, bool) {
	if o == nil || o.StatusCode == nil {
		return nil, false
	}
	return o.StatusCode, true
}

// HasStatusCode returns a boolean if a field has been set.
func (o *ErrorOAuth2) HasStatusCode() bool {
	if o != nil && o.StatusCode != nil {
		return true
	}

	return false
}

// SetStatusCode gets a reference to the given int64 and assigns it to the StatusCode field.
func (o *ErrorOAuth2) SetStatusCode(v int64) {
	o.StatusCode = &v
}

func (o ErrorOAuth2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Error != nil {
		toSerialize["error"] = o.Error
	}
	if o.ErrorDebug != nil {
		toSerialize["error_debug"] = o.ErrorDebug
	}
	if o.ErrorDescription != nil {
		toSerialize["error_description"] = o.ErrorDescription
	}
	if o.ErrorHint != nil {
		toSerialize["error_hint"] = o.ErrorHint
	}
	if o.StatusCode != nil {
		toSerialize["status_code"] = o.StatusCode
	}
	return json.Marshal(toSerialize)
}

type NullableErrorOAuth2 struct {
	value *ErrorOAuth2
	isSet bool
}

func (v NullableErrorOAuth2) Get() *ErrorOAuth2 {
	return v.value
}

func (v *NullableErrorOAuth2) Set(val *ErrorOAuth2) {
	v.value = val
	v.isSet = true
}

func (v NullableErrorOAuth2) IsSet() bool {
	return v.isSet
}

func (v *NullableErrorOAuth2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableErrorOAuth2(val *ErrorOAuth2) *NullableErrorOAuth2 {
	return &NullableErrorOAuth2{value: val, isSet: true}
}

func (v NullableErrorOAuth2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableErrorOAuth2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


