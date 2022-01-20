/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.54
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ProjectTotpConfig struct for ProjectTotpConfig
type ProjectTotpConfig struct {
	// Set to true to enable the TOTP authentication method.
	Enabled *bool `json:"enabled,omitempty"`
	// The issuer is the name which will appear in the Authenticator app.
	Issuer *string `json:"issuer,omitempty"`
}

// NewProjectTotpConfig instantiates a new ProjectTotpConfig object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProjectTotpConfig() *ProjectTotpConfig {
	this := ProjectTotpConfig{}
	return &this
}

// NewProjectTotpConfigWithDefaults instantiates a new ProjectTotpConfig object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProjectTotpConfigWithDefaults() *ProjectTotpConfig {
	this := ProjectTotpConfig{}
	return &this
}

// GetEnabled returns the Enabled field value if set, zero value otherwise.
func (o *ProjectTotpConfig) GetEnabled() bool {
	if o == nil || o.Enabled == nil {
		var ret bool
		return ret
	}
	return *o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProjectTotpConfig) GetEnabledOk() (*bool, bool) {
	if o == nil || o.Enabled == nil {
		return nil, false
	}
	return o.Enabled, true
}

// HasEnabled returns a boolean if a field has been set.
func (o *ProjectTotpConfig) HasEnabled() bool {
	if o != nil && o.Enabled != nil {
		return true
	}

	return false
}

// SetEnabled gets a reference to the given bool and assigns it to the Enabled field.
func (o *ProjectTotpConfig) SetEnabled(v bool) {
	o.Enabled = &v
}

// GetIssuer returns the Issuer field value if set, zero value otherwise.
func (o *ProjectTotpConfig) GetIssuer() string {
	if o == nil || o.Issuer == nil {
		var ret string
		return ret
	}
	return *o.Issuer
}

// GetIssuerOk returns a tuple with the Issuer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProjectTotpConfig) GetIssuerOk() (*string, bool) {
	if o == nil || o.Issuer == nil {
		return nil, false
	}
	return o.Issuer, true
}

// HasIssuer returns a boolean if a field has been set.
func (o *ProjectTotpConfig) HasIssuer() bool {
	if o != nil && o.Issuer != nil {
		return true
	}

	return false
}

// SetIssuer gets a reference to the given string and assigns it to the Issuer field.
func (o *ProjectTotpConfig) SetIssuer(v string) {
	o.Issuer = &v
}

func (o ProjectTotpConfig) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Enabled != nil {
		toSerialize["enabled"] = o.Enabled
	}
	if o.Issuer != nil {
		toSerialize["issuer"] = o.Issuer
	}
	return json.Marshal(toSerialize)
}

type NullableProjectTotpConfig struct {
	value *ProjectTotpConfig
	isSet bool
}

func (v NullableProjectTotpConfig) Get() *ProjectTotpConfig {
	return v.value
}

func (v *NullableProjectTotpConfig) Set(val *ProjectTotpConfig) {
	v.value = val
	v.isSet = true
}

func (v NullableProjectTotpConfig) IsSet() bool {
	return v.isSet
}

func (v *NullableProjectTotpConfig) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProjectTotpConfig(val *ProjectTotpConfig) *NullableProjectTotpConfig {
	return &NullableProjectTotpConfig{value: val, isSet: true}
}

func (v NullableProjectTotpConfig) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProjectTotpConfig) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


