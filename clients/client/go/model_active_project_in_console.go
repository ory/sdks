/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.5.0
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// checks if the ActiveProjectInConsole type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ActiveProjectInConsole{}

// ActiveProjectInConsole The Active Project ID
type ActiveProjectInConsole struct {
	// The Active Project ID  format: uuid
	ProjectId *string `json:"project_id,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _ActiveProjectInConsole ActiveProjectInConsole

// NewActiveProjectInConsole instantiates a new ActiveProjectInConsole object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewActiveProjectInConsole() *ActiveProjectInConsole {
	this := ActiveProjectInConsole{}
	return &this
}

// NewActiveProjectInConsoleWithDefaults instantiates a new ActiveProjectInConsole object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewActiveProjectInConsoleWithDefaults() *ActiveProjectInConsole {
	this := ActiveProjectInConsole{}
	return &this
}

// GetProjectId returns the ProjectId field value if set, zero value otherwise.
func (o *ActiveProjectInConsole) GetProjectId() string {
	if o == nil || IsNil(o.ProjectId) {
		var ret string
		return ret
	}
	return *o.ProjectId
}

// GetProjectIdOk returns a tuple with the ProjectId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ActiveProjectInConsole) GetProjectIdOk() (*string, bool) {
	if o == nil || IsNil(o.ProjectId) {
		return nil, false
	}
	return o.ProjectId, true
}

// HasProjectId returns a boolean if a field has been set.
func (o *ActiveProjectInConsole) HasProjectId() bool {
	if o != nil && !IsNil(o.ProjectId) {
		return true
	}

	return false
}

// SetProjectId gets a reference to the given string and assigns it to the ProjectId field.
func (o *ActiveProjectInConsole) SetProjectId(v string) {
	o.ProjectId = &v
}

func (o ActiveProjectInConsole) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ActiveProjectInConsole) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ProjectId) {
		toSerialize["project_id"] = o.ProjectId
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *ActiveProjectInConsole) UnmarshalJSON(bytes []byte) (err error) {
	varActiveProjectInConsole := _ActiveProjectInConsole{}

	err = json.Unmarshal(bytes, &varActiveProjectInConsole)

	if err != nil {
		return err
	}

	*o = ActiveProjectInConsole(varActiveProjectInConsole)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "project_id")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableActiveProjectInConsole struct {
	value *ActiveProjectInConsole
	isSet bool
}

func (v NullableActiveProjectInConsole) Get() *ActiveProjectInConsole {
	return v.value
}

func (v *NullableActiveProjectInConsole) Set(val *ActiveProjectInConsole) {
	v.value = val
	v.isSet = true
}

func (v NullableActiveProjectInConsole) IsSet() bool {
	return v.isSet
}

func (v *NullableActiveProjectInConsole) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableActiveProjectInConsole(val *ActiveProjectInConsole) *NullableActiveProjectInConsole {
	return &NullableActiveProjectInConsole{value: val, isSet: true}
}

func (v NullableActiveProjectInConsole) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableActiveProjectInConsole) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


