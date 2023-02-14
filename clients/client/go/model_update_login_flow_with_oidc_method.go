/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.10
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// UpdateLoginFlowWithOidcMethod Update Login Flow with OpenID Connect Method
type UpdateLoginFlowWithOidcMethod struct {
	// The CSRF Token
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Method to use  This field must be set to `oidc` when using the oidc method.
	Method string `json:"method"`
	// The provider to register with
	Provider string `json:"provider"`
	// The identity traits. This is a placeholder for the registration flow.
	Traits map[string]interface{} `json:"traits,omitempty"`
}

// NewUpdateLoginFlowWithOidcMethod instantiates a new UpdateLoginFlowWithOidcMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateLoginFlowWithOidcMethod(method string, provider string) *UpdateLoginFlowWithOidcMethod {
	this := UpdateLoginFlowWithOidcMethod{}
	this.Method = method
	this.Provider = provider
	return &this
}

// NewUpdateLoginFlowWithOidcMethodWithDefaults instantiates a new UpdateLoginFlowWithOidcMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateLoginFlowWithOidcMethodWithDefaults() *UpdateLoginFlowWithOidcMethod {
	this := UpdateLoginFlowWithOidcMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateLoginFlowWithOidcMethod) GetCsrfToken() string {
	if o == nil || o.CsrfToken == nil {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithOidcMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || o.CsrfToken == nil {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateLoginFlowWithOidcMethod) HasCsrfToken() bool {
	if o != nil && o.CsrfToken != nil {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateLoginFlowWithOidcMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetMethod returns the Method field value
func (o *UpdateLoginFlowWithOidcMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithOidcMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateLoginFlowWithOidcMethod) SetMethod(v string) {
	o.Method = v
}

// GetProvider returns the Provider field value
func (o *UpdateLoginFlowWithOidcMethod) GetProvider() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Provider
}

// GetProviderOk returns a tuple with the Provider field value
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithOidcMethod) GetProviderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Provider, true
}

// SetProvider sets field value
func (o *UpdateLoginFlowWithOidcMethod) SetProvider(v string) {
	o.Provider = v
}

// GetTraits returns the Traits field value if set, zero value otherwise.
func (o *UpdateLoginFlowWithOidcMethod) GetTraits() map[string]interface{} {
	if o == nil || o.Traits == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Traits
}

// GetTraitsOk returns a tuple with the Traits field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithOidcMethod) GetTraitsOk() (map[string]interface{}, bool) {
	if o == nil || o.Traits == nil {
		return nil, false
	}
	return o.Traits, true
}

// HasTraits returns a boolean if a field has been set.
func (o *UpdateLoginFlowWithOidcMethod) HasTraits() bool {
	if o != nil && o.Traits != nil {
		return true
	}

	return false
}

// SetTraits gets a reference to the given map[string]interface{} and assigns it to the Traits field.
func (o *UpdateLoginFlowWithOidcMethod) SetTraits(v map[string]interface{}) {
	o.Traits = v
}

func (o UpdateLoginFlowWithOidcMethod) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CsrfToken != nil {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	if true {
		toSerialize["method"] = o.Method
	}
	if true {
		toSerialize["provider"] = o.Provider
	}
	if o.Traits != nil {
		toSerialize["traits"] = o.Traits
	}
	return json.Marshal(toSerialize)
}

type NullableUpdateLoginFlowWithOidcMethod struct {
	value *UpdateLoginFlowWithOidcMethod
	isSet bool
}

func (v NullableUpdateLoginFlowWithOidcMethod) Get() *UpdateLoginFlowWithOidcMethod {
	return v.value
}

func (v *NullableUpdateLoginFlowWithOidcMethod) Set(val *UpdateLoginFlowWithOidcMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateLoginFlowWithOidcMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateLoginFlowWithOidcMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateLoginFlowWithOidcMethod(val *UpdateLoginFlowWithOidcMethod) *NullableUpdateLoginFlowWithOidcMethod {
	return &NullableUpdateLoginFlowWithOidcMethod{value: val, isSet: true}
}

func (v NullableUpdateLoginFlowWithOidcMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateLoginFlowWithOidcMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


