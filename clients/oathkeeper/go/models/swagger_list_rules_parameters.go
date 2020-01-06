// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	strfmt "github.com/go-openapi/strfmt"

	"github.com/go-openapi/swag"
)

// SwaggerListRulesParameters SwaggerListRulesParameters swagger list rules parameters
// swagger:model swaggerListRulesParameters
type SwaggerListRulesParameters struct {

	// The maximum amount of rules returned.
	// in: query
	Limit int64 `json:"limit,omitempty"`

	// The offset from where to start looking.
	// in: query
	Offset int64 `json:"offset,omitempty"`
}

// Validate validates this swagger list rules parameters
func (m *SwaggerListRulesParameters) Validate(formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *SwaggerListRulesParameters) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *SwaggerListRulesParameters) UnmarshalBinary(b []byte) error {
	var res SwaggerListRulesParameters
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
