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

// checks if the UiNodeTextAttributes type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UiNodeTextAttributes{}

// UiNodeTextAttributes struct for UiNodeTextAttributes
type UiNodeTextAttributes struct {
	// A unique identifier
	Id string `json:"id"`
	// NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"text\". text Text input Input img Image a Anchor script Script
	NodeType string `json:"node_type"`
	Text UiText `json:"text"`
	AdditionalProperties map[string]interface{}
}

type _UiNodeTextAttributes UiNodeTextAttributes

// NewUiNodeTextAttributes instantiates a new UiNodeTextAttributes object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUiNodeTextAttributes(id string, nodeType string, text UiText) *UiNodeTextAttributes {
	this := UiNodeTextAttributes{}
	this.Id = id
	this.NodeType = nodeType
	this.Text = text
	return &this
}

// NewUiNodeTextAttributesWithDefaults instantiates a new UiNodeTextAttributes object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUiNodeTextAttributesWithDefaults() *UiNodeTextAttributes {
	this := UiNodeTextAttributes{}
	return &this
}

// GetId returns the Id field value
func (o *UiNodeTextAttributes) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *UiNodeTextAttributes) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *UiNodeTextAttributes) SetId(v string) {
	o.Id = v
}

// GetNodeType returns the NodeType field value
func (o *UiNodeTextAttributes) GetNodeType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NodeType
}

// GetNodeTypeOk returns a tuple with the NodeType field value
// and a boolean to check if the value has been set.
func (o *UiNodeTextAttributes) GetNodeTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NodeType, true
}

// SetNodeType sets field value
func (o *UiNodeTextAttributes) SetNodeType(v string) {
	o.NodeType = v
}

// GetText returns the Text field value
func (o *UiNodeTextAttributes) GetText() UiText {
	if o == nil {
		var ret UiText
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *UiNodeTextAttributes) GetTextOk() (*UiText, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *UiNodeTextAttributes) SetText(v UiText) {
	o.Text = v
}

func (o UiNodeTextAttributes) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UiNodeTextAttributes) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["node_type"] = o.NodeType
	toSerialize["text"] = o.Text

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *UiNodeTextAttributes) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"node_type",
		"text",
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

	varUiNodeTextAttributes := _UiNodeTextAttributes{}

	err = json.Unmarshal(data, &varUiNodeTextAttributes)

	if err != nil {
		return err
	}

	*o = UiNodeTextAttributes(varUiNodeTextAttributes)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "node_type")
		delete(additionalProperties, "text")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUiNodeTextAttributes struct {
	value *UiNodeTextAttributes
	isSet bool
}

func (v NullableUiNodeTextAttributes) Get() *UiNodeTextAttributes {
	return v.value
}

func (v *NullableUiNodeTextAttributes) Set(val *UiNodeTextAttributes) {
	v.value = val
	v.isSet = true
}

func (v NullableUiNodeTextAttributes) IsSet() bool {
	return v.isSet
}

func (v *NullableUiNodeTextAttributes) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUiNodeTextAttributes(val *UiNodeTextAttributes) *NullableUiNodeTextAttributes {
	return &NullableUiNodeTextAttributes{value: val, isSet: true}
}

func (v NullableUiNodeTextAttributes) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUiNodeTextAttributes) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


