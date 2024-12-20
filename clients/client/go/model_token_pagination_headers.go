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
)

// checks if the TokenPaginationHeaders type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TokenPaginationHeaders{}

// TokenPaginationHeaders struct for TokenPaginationHeaders
type TokenPaginationHeaders struct {
	// The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
	Link *string `json:"link,omitempty"`
	// The total number of clients.  in: header
	XTotalCount *string `json:"x-total-count,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _TokenPaginationHeaders TokenPaginationHeaders

// NewTokenPaginationHeaders instantiates a new TokenPaginationHeaders object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTokenPaginationHeaders() *TokenPaginationHeaders {
	this := TokenPaginationHeaders{}
	return &this
}

// NewTokenPaginationHeadersWithDefaults instantiates a new TokenPaginationHeaders object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTokenPaginationHeadersWithDefaults() *TokenPaginationHeaders {
	this := TokenPaginationHeaders{}
	return &this
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *TokenPaginationHeaders) GetLink() string {
	if o == nil || IsNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TokenPaginationHeaders) GetLinkOk() (*string, bool) {
	if o == nil || IsNil(o.Link) {
		return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *TokenPaginationHeaders) HasLink() bool {
	if o != nil && !IsNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *TokenPaginationHeaders) SetLink(v string) {
	o.Link = &v
}

// GetXTotalCount returns the XTotalCount field value if set, zero value otherwise.
func (o *TokenPaginationHeaders) GetXTotalCount() string {
	if o == nil || IsNil(o.XTotalCount) {
		var ret string
		return ret
	}
	return *o.XTotalCount
}

// GetXTotalCountOk returns a tuple with the XTotalCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TokenPaginationHeaders) GetXTotalCountOk() (*string, bool) {
	if o == nil || IsNil(o.XTotalCount) {
		return nil, false
	}
	return o.XTotalCount, true
}

// HasXTotalCount returns a boolean if a field has been set.
func (o *TokenPaginationHeaders) HasXTotalCount() bool {
	if o != nil && !IsNil(o.XTotalCount) {
		return true
	}

	return false
}

// SetXTotalCount gets a reference to the given string and assigns it to the XTotalCount field.
func (o *TokenPaginationHeaders) SetXTotalCount(v string) {
	o.XTotalCount = &v
}

func (o TokenPaginationHeaders) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TokenPaginationHeaders) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Link) {
		toSerialize["link"] = o.Link
	}
	if !IsNil(o.XTotalCount) {
		toSerialize["x-total-count"] = o.XTotalCount
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *TokenPaginationHeaders) UnmarshalJSON(data []byte) (err error) {
	varTokenPaginationHeaders := _TokenPaginationHeaders{}

	err = json.Unmarshal(data, &varTokenPaginationHeaders)

	if err != nil {
		return err
	}

	*o = TokenPaginationHeaders(varTokenPaginationHeaders)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "link")
		delete(additionalProperties, "x-total-count")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableTokenPaginationHeaders struct {
	value *TokenPaginationHeaders
	isSet bool
}

func (v NullableTokenPaginationHeaders) Get() *TokenPaginationHeaders {
	return v.value
}

func (v *NullableTokenPaginationHeaders) Set(val *TokenPaginationHeaders) {
	v.value = val
	v.isSet = true
}

func (v NullableTokenPaginationHeaders) IsSet() bool {
	return v.isSet
}

func (v *NullableTokenPaginationHeaders) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTokenPaginationHeaders(val *TokenPaginationHeaders) *NullableTokenPaginationHeaders {
	return &NullableTokenPaginationHeaders{value: val, isSet: true}
}

func (v NullableTokenPaginationHeaders) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTokenPaginationHeaders) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


