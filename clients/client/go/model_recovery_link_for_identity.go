/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.2.10
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// RecoveryLinkForIdentity Used when an administrator creates a recovery link for an identity.
type RecoveryLinkForIdentity struct {
	// Recovery Link Expires At  The timestamp when the recovery link expires.
	ExpiresAt *time.Time `json:"expires_at,omitempty"`
	// Recovery Link  This link can be used to recover the account.
	RecoveryLink string `json:"recovery_link"`
	AdditionalProperties map[string]interface{}
}

type _RecoveryLinkForIdentity RecoveryLinkForIdentity

// NewRecoveryLinkForIdentity instantiates a new RecoveryLinkForIdentity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecoveryLinkForIdentity(recoveryLink string) *RecoveryLinkForIdentity {
	this := RecoveryLinkForIdentity{}
	this.RecoveryLink = recoveryLink
	return &this
}

// NewRecoveryLinkForIdentityWithDefaults instantiates a new RecoveryLinkForIdentity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecoveryLinkForIdentityWithDefaults() *RecoveryLinkForIdentity {
	this := RecoveryLinkForIdentity{}
	return &this
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise.
func (o *RecoveryLinkForIdentity) GetExpiresAt() time.Time {
	if o == nil || o.ExpiresAt == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecoveryLinkForIdentity) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil || o.ExpiresAt == nil {
		return nil, false
	}
	return o.ExpiresAt, true
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *RecoveryLinkForIdentity) HasExpiresAt() bool {
	if o != nil && o.ExpiresAt != nil {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given time.Time and assigns it to the ExpiresAt field.
func (o *RecoveryLinkForIdentity) SetExpiresAt(v time.Time) {
	o.ExpiresAt = &v
}

// GetRecoveryLink returns the RecoveryLink field value
func (o *RecoveryLinkForIdentity) GetRecoveryLink() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RecoveryLink
}

// GetRecoveryLinkOk returns a tuple with the RecoveryLink field value
// and a boolean to check if the value has been set.
func (o *RecoveryLinkForIdentity) GetRecoveryLinkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RecoveryLink, true
}

// SetRecoveryLink sets field value
func (o *RecoveryLinkForIdentity) SetRecoveryLink(v string) {
	o.RecoveryLink = v
}

func (o RecoveryLinkForIdentity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ExpiresAt != nil {
		toSerialize["expires_at"] = o.ExpiresAt
	}
	if true {
		toSerialize["recovery_link"] = o.RecoveryLink
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *RecoveryLinkForIdentity) UnmarshalJSON(bytes []byte) (err error) {
	varRecoveryLinkForIdentity := _RecoveryLinkForIdentity{}

	if err = json.Unmarshal(bytes, &varRecoveryLinkForIdentity); err == nil {
		*o = RecoveryLinkForIdentity(varRecoveryLinkForIdentity)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "expires_at")
		delete(additionalProperties, "recovery_link")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableRecoveryLinkForIdentity struct {
	value *RecoveryLinkForIdentity
	isSet bool
}

func (v NullableRecoveryLinkForIdentity) Get() *RecoveryLinkForIdentity {
	return v.value
}

func (v *NullableRecoveryLinkForIdentity) Set(val *RecoveryLinkForIdentity) {
	v.value = val
	v.isSet = true
}

func (v NullableRecoveryLinkForIdentity) IsSet() bool {
	return v.isSet
}

func (v *NullableRecoveryLinkForIdentity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecoveryLinkForIdentity(val *RecoveryLinkForIdentity) *NullableRecoveryLinkForIdentity {
	return &NullableRecoveryLinkForIdentity{value: val, isSet: true}
}

func (v NullableRecoveryLinkForIdentity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecoveryLinkForIdentity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


