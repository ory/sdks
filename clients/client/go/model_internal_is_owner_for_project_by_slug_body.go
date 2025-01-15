/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.16.0
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the InternalIsOwnerForProjectBySlugBody type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &InternalIsOwnerForProjectBySlugBody{}

// InternalIsOwnerForProjectBySlugBody Is Owner For Project By Slug Request Body
type InternalIsOwnerForProjectBySlugBody struct {
	// Namespace is the namespace of the subject.
	Namespace string `json:"namespace"`
	// ProjectScope is the project_id resolved from the API key.
	ProjectScope *string `json:"project_scope,omitempty"`
	// ProjectSlug is the project's slug.
	ProjectSlug string `json:"project_slug"`
	// Subject is the subject acting (user or API key).
	Subject string `json:"subject"`
	AdditionalProperties map[string]interface{}
}

type _InternalIsOwnerForProjectBySlugBody InternalIsOwnerForProjectBySlugBody

// NewInternalIsOwnerForProjectBySlugBody instantiates a new InternalIsOwnerForProjectBySlugBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInternalIsOwnerForProjectBySlugBody(namespace string, projectSlug string, subject string) *InternalIsOwnerForProjectBySlugBody {
	this := InternalIsOwnerForProjectBySlugBody{}
	this.Namespace = namespace
	this.ProjectSlug = projectSlug
	this.Subject = subject
	return &this
}

// NewInternalIsOwnerForProjectBySlugBodyWithDefaults instantiates a new InternalIsOwnerForProjectBySlugBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInternalIsOwnerForProjectBySlugBodyWithDefaults() *InternalIsOwnerForProjectBySlugBody {
	this := InternalIsOwnerForProjectBySlugBody{}
	return &this
}

// GetNamespace returns the Namespace field value
func (o *InternalIsOwnerForProjectBySlugBody) GetNamespace() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value
// and a boolean to check if the value has been set.
func (o *InternalIsOwnerForProjectBySlugBody) GetNamespaceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Namespace, true
}

// SetNamespace sets field value
func (o *InternalIsOwnerForProjectBySlugBody) SetNamespace(v string) {
	o.Namespace = v
}

// GetProjectScope returns the ProjectScope field value if set, zero value otherwise.
func (o *InternalIsOwnerForProjectBySlugBody) GetProjectScope() string {
	if o == nil || IsNil(o.ProjectScope) {
		var ret string
		return ret
	}
	return *o.ProjectScope
}

// GetProjectScopeOk returns a tuple with the ProjectScope field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InternalIsOwnerForProjectBySlugBody) GetProjectScopeOk() (*string, bool) {
	if o == nil || IsNil(o.ProjectScope) {
		return nil, false
	}
	return o.ProjectScope, true
}

// HasProjectScope returns a boolean if a field has been set.
func (o *InternalIsOwnerForProjectBySlugBody) HasProjectScope() bool {
	if o != nil && !IsNil(o.ProjectScope) {
		return true
	}

	return false
}

// SetProjectScope gets a reference to the given string and assigns it to the ProjectScope field.
func (o *InternalIsOwnerForProjectBySlugBody) SetProjectScope(v string) {
	o.ProjectScope = &v
}

// GetProjectSlug returns the ProjectSlug field value
func (o *InternalIsOwnerForProjectBySlugBody) GetProjectSlug() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProjectSlug
}

// GetProjectSlugOk returns a tuple with the ProjectSlug field value
// and a boolean to check if the value has been set.
func (o *InternalIsOwnerForProjectBySlugBody) GetProjectSlugOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProjectSlug, true
}

// SetProjectSlug sets field value
func (o *InternalIsOwnerForProjectBySlugBody) SetProjectSlug(v string) {
	o.ProjectSlug = v
}

// GetSubject returns the Subject field value
func (o *InternalIsOwnerForProjectBySlugBody) GetSubject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value
// and a boolean to check if the value has been set.
func (o *InternalIsOwnerForProjectBySlugBody) GetSubjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Subject, true
}

// SetSubject sets field value
func (o *InternalIsOwnerForProjectBySlugBody) SetSubject(v string) {
	o.Subject = v
}

func (o InternalIsOwnerForProjectBySlugBody) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o InternalIsOwnerForProjectBySlugBody) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["namespace"] = o.Namespace
	if !IsNil(o.ProjectScope) {
		toSerialize["project_scope"] = o.ProjectScope
	}
	toSerialize["project_slug"] = o.ProjectSlug
	toSerialize["subject"] = o.Subject

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *InternalIsOwnerForProjectBySlugBody) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"namespace",
		"project_slug",
		"subject",
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

	varInternalIsOwnerForProjectBySlugBody := _InternalIsOwnerForProjectBySlugBody{}

	err = json.Unmarshal(data, &varInternalIsOwnerForProjectBySlugBody)

	if err != nil {
		return err
	}

	*o = InternalIsOwnerForProjectBySlugBody(varInternalIsOwnerForProjectBySlugBody)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "namespace")
		delete(additionalProperties, "project_scope")
		delete(additionalProperties, "project_slug")
		delete(additionalProperties, "subject")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableInternalIsOwnerForProjectBySlugBody struct {
	value *InternalIsOwnerForProjectBySlugBody
	isSet bool
}

func (v NullableInternalIsOwnerForProjectBySlugBody) Get() *InternalIsOwnerForProjectBySlugBody {
	return v.value
}

func (v *NullableInternalIsOwnerForProjectBySlugBody) Set(val *InternalIsOwnerForProjectBySlugBody) {
	v.value = val
	v.isSet = true
}

func (v NullableInternalIsOwnerForProjectBySlugBody) IsSet() bool {
	return v.isSet
}

func (v *NullableInternalIsOwnerForProjectBySlugBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInternalIsOwnerForProjectBySlugBody(val *InternalIsOwnerForProjectBySlugBody) *NullableInternalIsOwnerForProjectBySlugBody {
	return &NullableInternalIsOwnerForProjectBySlugBody{value: val, isSet: true}
}

func (v NullableInternalIsOwnerForProjectBySlugBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInternalIsOwnerForProjectBySlugBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


