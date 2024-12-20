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

// checks if the ExpandedPermissionTree type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ExpandedPermissionTree{}

// ExpandedPermissionTree struct for ExpandedPermissionTree
type ExpandedPermissionTree struct {
	// The children of the node, possibly none.
	Children []ExpandedPermissionTree `json:"children,omitempty"`
	Tuple *Relationship `json:"tuple,omitempty"`
	// The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified
	Type string `json:"type"`
	AdditionalProperties map[string]interface{}
}

type _ExpandedPermissionTree ExpandedPermissionTree

// NewExpandedPermissionTree instantiates a new ExpandedPermissionTree object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewExpandedPermissionTree(type_ string) *ExpandedPermissionTree {
	this := ExpandedPermissionTree{}
	this.Type = type_
	return &this
}

// NewExpandedPermissionTreeWithDefaults instantiates a new ExpandedPermissionTree object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewExpandedPermissionTreeWithDefaults() *ExpandedPermissionTree {
	this := ExpandedPermissionTree{}
	return &this
}

// GetChildren returns the Children field value if set, zero value otherwise.
func (o *ExpandedPermissionTree) GetChildren() []ExpandedPermissionTree {
	if o == nil || IsNil(o.Children) {
		var ret []ExpandedPermissionTree
		return ret
	}
	return o.Children
}

// GetChildrenOk returns a tuple with the Children field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExpandedPermissionTree) GetChildrenOk() ([]ExpandedPermissionTree, bool) {
	if o == nil || IsNil(o.Children) {
		return nil, false
	}
	return o.Children, true
}

// HasChildren returns a boolean if a field has been set.
func (o *ExpandedPermissionTree) HasChildren() bool {
	if o != nil && !IsNil(o.Children) {
		return true
	}

	return false
}

// SetChildren gets a reference to the given []ExpandedPermissionTree and assigns it to the Children field.
func (o *ExpandedPermissionTree) SetChildren(v []ExpandedPermissionTree) {
	o.Children = v
}

// GetTuple returns the Tuple field value if set, zero value otherwise.
func (o *ExpandedPermissionTree) GetTuple() Relationship {
	if o == nil || IsNil(o.Tuple) {
		var ret Relationship
		return ret
	}
	return *o.Tuple
}

// GetTupleOk returns a tuple with the Tuple field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ExpandedPermissionTree) GetTupleOk() (*Relationship, bool) {
	if o == nil || IsNil(o.Tuple) {
		return nil, false
	}
	return o.Tuple, true
}

// HasTuple returns a boolean if a field has been set.
func (o *ExpandedPermissionTree) HasTuple() bool {
	if o != nil && !IsNil(o.Tuple) {
		return true
	}

	return false
}

// SetTuple gets a reference to the given Relationship and assigns it to the Tuple field.
func (o *ExpandedPermissionTree) SetTuple(v Relationship) {
	o.Tuple = &v
}

// GetType returns the Type field value
func (o *ExpandedPermissionTree) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ExpandedPermissionTree) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ExpandedPermissionTree) SetType(v string) {
	o.Type = v
}

func (o ExpandedPermissionTree) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ExpandedPermissionTree) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Children) {
		toSerialize["children"] = o.Children
	}
	if !IsNil(o.Tuple) {
		toSerialize["tuple"] = o.Tuple
	}
	toSerialize["type"] = o.Type

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *ExpandedPermissionTree) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"type",
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

	varExpandedPermissionTree := _ExpandedPermissionTree{}

	err = json.Unmarshal(data, &varExpandedPermissionTree)

	if err != nil {
		return err
	}

	*o = ExpandedPermissionTree(varExpandedPermissionTree)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "children")
		delete(additionalProperties, "tuple")
		delete(additionalProperties, "type")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableExpandedPermissionTree struct {
	value *ExpandedPermissionTree
	isSet bool
}

func (v NullableExpandedPermissionTree) Get() *ExpandedPermissionTree {
	return v.value
}

func (v *NullableExpandedPermissionTree) Set(val *ExpandedPermissionTree) {
	v.value = val
	v.isSet = true
}

func (v NullableExpandedPermissionTree) IsSet() bool {
	return v.isSet
}

func (v *NullableExpandedPermissionTree) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableExpandedPermissionTree(val *ExpandedPermissionTree) *NullableExpandedPermissionTree {
	return &NullableExpandedPermissionTree{value: val, isSet: true}
}

func (v NullableExpandedPermissionTree) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableExpandedPermissionTree) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


