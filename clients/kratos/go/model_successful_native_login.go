/*
Ory Identities API

This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

API version: v0.13.1
Contact: office@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// SuccessfulNativeLogin The Response for Login Flows via API
type SuccessfulNativeLogin struct {
	Session Session `json:"session"`
	// The Session Token  A session token is equivalent to a session cookie, but it can be sent in the HTTP Authorization Header:  Authorization: bearer ${session-token}  The session token is only issued for API flows, not for Browser flows!
	SessionToken *string `json:"session_token,omitempty"`
}

// NewSuccessfulNativeLogin instantiates a new SuccessfulNativeLogin object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSuccessfulNativeLogin(session Session) *SuccessfulNativeLogin {
	this := SuccessfulNativeLogin{}
	this.Session = session
	return &this
}

// NewSuccessfulNativeLoginWithDefaults instantiates a new SuccessfulNativeLogin object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSuccessfulNativeLoginWithDefaults() *SuccessfulNativeLogin {
	this := SuccessfulNativeLogin{}
	return &this
}

// GetSession returns the Session field value
func (o *SuccessfulNativeLogin) GetSession() Session {
	if o == nil {
		var ret Session
		return ret
	}

	return o.Session
}

// GetSessionOk returns a tuple with the Session field value
// and a boolean to check if the value has been set.
func (o *SuccessfulNativeLogin) GetSessionOk() (*Session, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Session, true
}

// SetSession sets field value
func (o *SuccessfulNativeLogin) SetSession(v Session) {
	o.Session = v
}

// GetSessionToken returns the SessionToken field value if set, zero value otherwise.
func (o *SuccessfulNativeLogin) GetSessionToken() string {
	if o == nil || o.SessionToken == nil {
		var ret string
		return ret
	}
	return *o.SessionToken
}

// GetSessionTokenOk returns a tuple with the SessionToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuccessfulNativeLogin) GetSessionTokenOk() (*string, bool) {
	if o == nil || o.SessionToken == nil {
		return nil, false
	}
	return o.SessionToken, true
}

// HasSessionToken returns a boolean if a field has been set.
func (o *SuccessfulNativeLogin) HasSessionToken() bool {
	if o != nil && o.SessionToken != nil {
		return true
	}

	return false
}

// SetSessionToken gets a reference to the given string and assigns it to the SessionToken field.
func (o *SuccessfulNativeLogin) SetSessionToken(v string) {
	o.SessionToken = &v
}

func (o SuccessfulNativeLogin) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["session"] = o.Session
	}
	if o.SessionToken != nil {
		toSerialize["session_token"] = o.SessionToken
	}
	return json.Marshal(toSerialize)
}

type NullableSuccessfulNativeLogin struct {
	value *SuccessfulNativeLogin
	isSet bool
}

func (v NullableSuccessfulNativeLogin) Get() *SuccessfulNativeLogin {
	return v.value
}

func (v *NullableSuccessfulNativeLogin) Set(val *SuccessfulNativeLogin) {
	v.value = val
	v.isSet = true
}

func (v NullableSuccessfulNativeLogin) IsSet() bool {
	return v.isSet
}

func (v *NullableSuccessfulNativeLogin) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSuccessfulNativeLogin(val *SuccessfulNativeLogin) *NullableSuccessfulNativeLogin {
	return &NullableSuccessfulNativeLogin{value: val, isSet: true}
}

func (v NullableSuccessfulNativeLogin) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSuccessfulNativeLogin) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


