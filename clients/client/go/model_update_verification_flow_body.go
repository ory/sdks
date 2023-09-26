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
	"fmt"
)

// UpdateVerificationFlowBody - Update Verification Flow Request Body
type UpdateVerificationFlowBody struct {
	UpdateVerificationFlowWithCodeMethod *UpdateVerificationFlowWithCodeMethod
	UpdateVerificationFlowWithLinkMethod *UpdateVerificationFlowWithLinkMethod
}

// UpdateVerificationFlowWithCodeMethodAsUpdateVerificationFlowBody is a convenience function that returns UpdateVerificationFlowWithCodeMethod wrapped in UpdateVerificationFlowBody
func UpdateVerificationFlowWithCodeMethodAsUpdateVerificationFlowBody(v *UpdateVerificationFlowWithCodeMethod) UpdateVerificationFlowBody {
	return UpdateVerificationFlowBody{
		UpdateVerificationFlowWithCodeMethod: v,
	}
}

// UpdateVerificationFlowWithLinkMethodAsUpdateVerificationFlowBody is a convenience function that returns UpdateVerificationFlowWithLinkMethod wrapped in UpdateVerificationFlowBody
func UpdateVerificationFlowWithLinkMethodAsUpdateVerificationFlowBody(v *UpdateVerificationFlowWithLinkMethod) UpdateVerificationFlowBody {
	return UpdateVerificationFlowBody{
		UpdateVerificationFlowWithLinkMethod: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *UpdateVerificationFlowBody) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into UpdateVerificationFlowWithCodeMethod
	err = newStrictDecoder(data).Decode(&dst.UpdateVerificationFlowWithCodeMethod)
	if err == nil {
		jsonUpdateVerificationFlowWithCodeMethod, _ := json.Marshal(dst.UpdateVerificationFlowWithCodeMethod)
		if string(jsonUpdateVerificationFlowWithCodeMethod) == "{}" { // empty struct
			dst.UpdateVerificationFlowWithCodeMethod = nil
		} else {
			match++
		}
	} else {
		dst.UpdateVerificationFlowWithCodeMethod = nil
	}

	// try to unmarshal data into UpdateVerificationFlowWithLinkMethod
	err = newStrictDecoder(data).Decode(&dst.UpdateVerificationFlowWithLinkMethod)
	if err == nil {
		jsonUpdateVerificationFlowWithLinkMethod, _ := json.Marshal(dst.UpdateVerificationFlowWithLinkMethod)
		if string(jsonUpdateVerificationFlowWithLinkMethod) == "{}" { // empty struct
			dst.UpdateVerificationFlowWithLinkMethod = nil
		} else {
			match++
		}
	} else {
		dst.UpdateVerificationFlowWithLinkMethod = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.UpdateVerificationFlowWithCodeMethod = nil
		dst.UpdateVerificationFlowWithLinkMethod = nil

		return fmt.Errorf("Data matches more than one schema in oneOf(UpdateVerificationFlowBody)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("Data failed to match schemas in oneOf(UpdateVerificationFlowBody)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src UpdateVerificationFlowBody) MarshalJSON() ([]byte, error) {
	if src.UpdateVerificationFlowWithCodeMethod != nil {
		return json.Marshal(&src.UpdateVerificationFlowWithCodeMethod)
	}

	if src.UpdateVerificationFlowWithLinkMethod != nil {
		return json.Marshal(&src.UpdateVerificationFlowWithLinkMethod)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *UpdateVerificationFlowBody) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.UpdateVerificationFlowWithCodeMethod != nil {
		return obj.UpdateVerificationFlowWithCodeMethod
	}

	if obj.UpdateVerificationFlowWithLinkMethod != nil {
		return obj.UpdateVerificationFlowWithLinkMethod
	}

	// all schemas are nil
	return nil
}

type NullableUpdateVerificationFlowBody struct {
	value *UpdateVerificationFlowBody
	isSet bool
}

func (v NullableUpdateVerificationFlowBody) Get() *UpdateVerificationFlowBody {
	return v.value
}

func (v *NullableUpdateVerificationFlowBody) Set(val *UpdateVerificationFlowBody) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateVerificationFlowBody) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateVerificationFlowBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateVerificationFlowBody(val *UpdateVerificationFlowBody) *NullableUpdateVerificationFlowBody {
	return &NullableUpdateVerificationFlowBody{value: val, isSet: true}
}

func (v NullableUpdateVerificationFlowBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateVerificationFlowBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


