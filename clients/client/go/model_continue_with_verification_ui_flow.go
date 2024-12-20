/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.15.16
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the ContinueWithVerificationUiFlow type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ContinueWithVerificationUiFlow{}

// ContinueWithVerificationUiFlow struct for ContinueWithVerificationUiFlow
type ContinueWithVerificationUiFlow struct {
	// The ID of the verification flow
	Id string `json:"id"`
	// The URL of the verification flow  If this value is set, redirect the user's browser to this URL. This value is typically unset for native clients / API flows.
	Url *string `json:"url,omitempty"`
	// The address that should be verified in this flow
	VerifiableAddress string `json:"verifiable_address"`
	AdditionalProperties map[string]interface{}
}

type _ContinueWithVerificationUiFlow ContinueWithVerificationUiFlow

// NewContinueWithVerificationUiFlow instantiates a new ContinueWithVerificationUiFlow object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewContinueWithVerificationUiFlow(id string, verifiableAddress string) *ContinueWithVerificationUiFlow {
	this := ContinueWithVerificationUiFlow{}
	this.Id = id
	this.VerifiableAddress = verifiableAddress
	return &this
}

// NewContinueWithVerificationUiFlowWithDefaults instantiates a new ContinueWithVerificationUiFlow object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewContinueWithVerificationUiFlowWithDefaults() *ContinueWithVerificationUiFlow {
	this := ContinueWithVerificationUiFlow{}
	return &this
}

// GetId returns the Id field value
func (o *ContinueWithVerificationUiFlow) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ContinueWithVerificationUiFlow) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ContinueWithVerificationUiFlow) SetId(v string) {
	o.Id = v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *ContinueWithVerificationUiFlow) GetUrl() string {
	if o == nil || IsNil(o.Url) {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ContinueWithVerificationUiFlow) GetUrlOk() (*string, bool) {
	if o == nil || IsNil(o.Url) {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *ContinueWithVerificationUiFlow) HasUrl() bool {
	if o != nil && !IsNil(o.Url) {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *ContinueWithVerificationUiFlow) SetUrl(v string) {
	o.Url = &v
}

// GetVerifiableAddress returns the VerifiableAddress field value
func (o *ContinueWithVerificationUiFlow) GetVerifiableAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.VerifiableAddress
}

// GetVerifiableAddressOk returns a tuple with the VerifiableAddress field value
// and a boolean to check if the value has been set.
func (o *ContinueWithVerificationUiFlow) GetVerifiableAddressOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.VerifiableAddress, true
}

// SetVerifiableAddress sets field value
func (o *ContinueWithVerificationUiFlow) SetVerifiableAddress(v string) {
	o.VerifiableAddress = v
}

func (o ContinueWithVerificationUiFlow) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ContinueWithVerificationUiFlow) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	if !IsNil(o.Url) {
		toSerialize["url"] = o.Url
	}
	toSerialize["verifiable_address"] = o.VerifiableAddress

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *ContinueWithVerificationUiFlow) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"verifiable_address",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varContinueWithVerificationUiFlow := _ContinueWithVerificationUiFlow{}

	err = json.Unmarshal(data, &varContinueWithVerificationUiFlow)

	if err != nil {
		return err
	}

	*o = ContinueWithVerificationUiFlow(varContinueWithVerificationUiFlow)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "url")
		delete(additionalProperties, "verifiable_address")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableContinueWithVerificationUiFlow struct {
	value *ContinueWithVerificationUiFlow
	isSet bool
}

func (v NullableContinueWithVerificationUiFlow) Get() *ContinueWithVerificationUiFlow {
	return v.value
}

func (v *NullableContinueWithVerificationUiFlow) Set(val *ContinueWithVerificationUiFlow) {
	v.value = val
	v.isSet = true
}

func (v NullableContinueWithVerificationUiFlow) IsSet() bool {
	return v.isSet
}

func (v *NullableContinueWithVerificationUiFlow) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableContinueWithVerificationUiFlow(val *ContinueWithVerificationUiFlow) *NullableContinueWithVerificationUiFlow {
	return &NullableContinueWithVerificationUiFlow{value: val, isSet: true}
}

func (v NullableContinueWithVerificationUiFlow) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableContinueWithVerificationUiFlow) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


