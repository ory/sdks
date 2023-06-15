/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.38
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// SessionAuthenticationMethod A singular authenticator used during authentication / login.
type SessionAuthenticationMethod struct {
	Aal *AuthenticatorAssuranceLevel `json:"aal,omitempty"`
	// When the authentication challenge was completed.
	CompletedAt *time.Time `json:"completed_at,omitempty"`
	Method *string `json:"method,omitempty"`
	// OIDC or SAML provider id used for authentication
	Provider *string `json:"provider,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _SessionAuthenticationMethod SessionAuthenticationMethod

// NewSessionAuthenticationMethod instantiates a new SessionAuthenticationMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSessionAuthenticationMethod() *SessionAuthenticationMethod {
	this := SessionAuthenticationMethod{}
	return &this
}

// NewSessionAuthenticationMethodWithDefaults instantiates a new SessionAuthenticationMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSessionAuthenticationMethodWithDefaults() *SessionAuthenticationMethod {
	this := SessionAuthenticationMethod{}
	return &this
}

// GetAal returns the Aal field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetAal() AuthenticatorAssuranceLevel {
	if o == nil || o.Aal == nil {
		var ret AuthenticatorAssuranceLevel
		return ret
	}
	return *o.Aal
}

// GetAalOk returns a tuple with the Aal field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetAalOk() (*AuthenticatorAssuranceLevel, bool) {
	if o == nil || o.Aal == nil {
		return nil, false
	}
	return o.Aal, true
}

// HasAal returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasAal() bool {
	if o != nil && o.Aal != nil {
		return true
	}

	return false
}

// SetAal gets a reference to the given AuthenticatorAssuranceLevel and assigns it to the Aal field.
func (o *SessionAuthenticationMethod) SetAal(v AuthenticatorAssuranceLevel) {
	o.Aal = &v
}

// GetCompletedAt returns the CompletedAt field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetCompletedAt() time.Time {
	if o == nil || o.CompletedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.CompletedAt
}

// GetCompletedAtOk returns a tuple with the CompletedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetCompletedAtOk() (*time.Time, bool) {
	if o == nil || o.CompletedAt == nil {
		return nil, false
	}
	return o.CompletedAt, true
}

// HasCompletedAt returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasCompletedAt() bool {
	if o != nil && o.CompletedAt != nil {
		return true
	}

	return false
}

// SetCompletedAt gets a reference to the given time.Time and assigns it to the CompletedAt field.
func (o *SessionAuthenticationMethod) SetCompletedAt(v time.Time) {
	o.CompletedAt = &v
}

// GetMethod returns the Method field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetMethod() string {
	if o == nil || o.Method == nil {
		var ret string
		return ret
	}
	return *o.Method
}

// GetMethodOk returns a tuple with the Method field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetMethodOk() (*string, bool) {
	if o == nil || o.Method == nil {
		return nil, false
	}
	return o.Method, true
}

// HasMethod returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasMethod() bool {
	if o != nil && o.Method != nil {
		return true
	}

	return false
}

// SetMethod gets a reference to the given string and assigns it to the Method field.
func (o *SessionAuthenticationMethod) SetMethod(v string) {
	o.Method = &v
}

// GetProvider returns the Provider field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetProvider() string {
	if o == nil || o.Provider == nil {
		var ret string
		return ret
	}
	return *o.Provider
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetProviderOk() (*string, bool) {
	if o == nil || o.Provider == nil {
		return nil, false
	}
	return o.Provider, true
}

// HasProvider returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasProvider() bool {
	if o != nil && o.Provider != nil {
		return true
	}

	return false
}

// SetProvider gets a reference to the given string and assigns it to the Provider field.
func (o *SessionAuthenticationMethod) SetProvider(v string) {
	o.Provider = &v
}

func (o SessionAuthenticationMethod) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Aal != nil {
		toSerialize["aal"] = o.Aal
	}
	if o.CompletedAt != nil {
		toSerialize["completed_at"] = o.CompletedAt
	}
	if o.Method != nil {
		toSerialize["method"] = o.Method
	}
	if o.Provider != nil {
		toSerialize["provider"] = o.Provider
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *SessionAuthenticationMethod) UnmarshalJSON(bytes []byte) (err error) {
	varSessionAuthenticationMethod := _SessionAuthenticationMethod{}

	if err = json.Unmarshal(bytes, &varSessionAuthenticationMethod); err == nil {
		*o = SessionAuthenticationMethod(varSessionAuthenticationMethod)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "aal")
		delete(additionalProperties, "completed_at")
		delete(additionalProperties, "method")
		delete(additionalProperties, "provider")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableSessionAuthenticationMethod struct {
	value *SessionAuthenticationMethod
	isSet bool
}

func (v NullableSessionAuthenticationMethod) Get() *SessionAuthenticationMethod {
	return v.value
}

func (v *NullableSessionAuthenticationMethod) Set(val *SessionAuthenticationMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableSessionAuthenticationMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableSessionAuthenticationMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSessionAuthenticationMethod(val *SessionAuthenticationMethod) *NullableSessionAuthenticationMethod {
	return &NullableSessionAuthenticationMethod{value: val, isSet: true}
}

func (v NullableSessionAuthenticationMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSessionAuthenticationMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


