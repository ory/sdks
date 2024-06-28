/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.12.1
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// checks if the IdentityCredentialsCode type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IdentityCredentialsCode{}

// IdentityCredentialsCode CredentialsCode represents a one time login/registration code
type IdentityCredentialsCode struct {
	// The type of the address for this code
	AddressType *string `json:"address_type,omitempty"`
	UsedAt NullableTime `json:"used_at,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _IdentityCredentialsCode IdentityCredentialsCode

// NewIdentityCredentialsCode instantiates a new IdentityCredentialsCode object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIdentityCredentialsCode() *IdentityCredentialsCode {
	this := IdentityCredentialsCode{}
	return &this
}

// NewIdentityCredentialsCodeWithDefaults instantiates a new IdentityCredentialsCode object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIdentityCredentialsCodeWithDefaults() *IdentityCredentialsCode {
	this := IdentityCredentialsCode{}
	return &this
}

// GetAddressType returns the AddressType field value if set, zero value otherwise.
func (o *IdentityCredentialsCode) GetAddressType() string {
	if o == nil || IsNil(o.AddressType) {
		var ret string
		return ret
	}
	return *o.AddressType
}

// GetAddressTypeOk returns a tuple with the AddressType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsCode) GetAddressTypeOk() (*string, bool) {
	if o == nil || IsNil(o.AddressType) {
		return nil, false
	}
	return o.AddressType, true
}

// HasAddressType returns a boolean if a field has been set.
func (o *IdentityCredentialsCode) HasAddressType() bool {
	if o != nil && !IsNil(o.AddressType) {
		return true
	}

	return false
}

// SetAddressType gets a reference to the given string and assigns it to the AddressType field.
func (o *IdentityCredentialsCode) SetAddressType(v string) {
	o.AddressType = &v
}

// GetUsedAt returns the UsedAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IdentityCredentialsCode) GetUsedAt() time.Time {
	if o == nil || IsNil(o.UsedAt.Get()) {
		var ret time.Time
		return ret
	}
	return *o.UsedAt.Get()
}

// GetUsedAtOk returns a tuple with the UsedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IdentityCredentialsCode) GetUsedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.UsedAt.Get(), o.UsedAt.IsSet()
}

// HasUsedAt returns a boolean if a field has been set.
func (o *IdentityCredentialsCode) HasUsedAt() bool {
	if o != nil && o.UsedAt.IsSet() {
		return true
	}

	return false
}

// SetUsedAt gets a reference to the given NullableTime and assigns it to the UsedAt field.
func (o *IdentityCredentialsCode) SetUsedAt(v time.Time) {
	o.UsedAt.Set(&v)
}
// SetUsedAtNil sets the value for UsedAt to be an explicit nil
func (o *IdentityCredentialsCode) SetUsedAtNil() {
	o.UsedAt.Set(nil)
}

// UnsetUsedAt ensures that no value is present for UsedAt, not even an explicit nil
func (o *IdentityCredentialsCode) UnsetUsedAt() {
	o.UsedAt.Unset()
}

func (o IdentityCredentialsCode) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IdentityCredentialsCode) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AddressType) {
		toSerialize["address_type"] = o.AddressType
	}
	if o.UsedAt.IsSet() {
		toSerialize["used_at"] = o.UsedAt.Get()
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *IdentityCredentialsCode) UnmarshalJSON(data []byte) (err error) {
	varIdentityCredentialsCode := _IdentityCredentialsCode{}

	err = json.Unmarshal(data, &varIdentityCredentialsCode)

	if err != nil {
		return err
	}

	*o = IdentityCredentialsCode(varIdentityCredentialsCode)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "address_type")
		delete(additionalProperties, "used_at")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableIdentityCredentialsCode struct {
	value *IdentityCredentialsCode
	isSet bool
}

func (v NullableIdentityCredentialsCode) Get() *IdentityCredentialsCode {
	return v.value
}

func (v *NullableIdentityCredentialsCode) Set(val *IdentityCredentialsCode) {
	v.value = val
	v.isSet = true
}

func (v NullableIdentityCredentialsCode) IsSet() bool {
	return v.isSet
}

func (v *NullableIdentityCredentialsCode) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIdentityCredentialsCode(val *IdentityCredentialsCode) *NullableIdentityCredentialsCode {
	return &NullableIdentityCredentialsCode{value: val, isSet: true}
}

func (v NullableIdentityCredentialsCode) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIdentityCredentialsCode) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


