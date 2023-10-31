/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.2.16
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// MemberInvite struct for MemberInvite
type MemberInvite struct {
	// The Project's Revision Creation Date
	CreatedAt time.Time `json:"created_at"`
	// The invite's ID.
	Id string `json:"id"`
	// The invitee's email
	InviteeEmail string `json:"invitee_email"`
	InviteeId NullableString `json:"invitee_id,omitempty"`
	// The invite owner's email Usually the project's owner email
	OwnerEmail string `json:"owner_email"`
	// The invite owner's ID Usually the project's owner
	OwnerId string `json:"owner_id"`
	// The Project's ID this invite is associated with
	ProjectId string `json:"project_id"`
	// The invite's status Keeps track of the invites status such as pending, accepted, declined, expired pending PENDING accepted ACCEPTED declined DECLINED expired EXPIRED cancelled CANCELLED removed REMOVED
	Status string `json:"status"`
	// Last Time Project's Revision was Updated
	UpdatedAt time.Time `json:"updated_at"`
	AdditionalProperties map[string]interface{}
}

type _MemberInvite MemberInvite

// NewMemberInvite instantiates a new MemberInvite object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMemberInvite(createdAt time.Time, id string, inviteeEmail string, ownerEmail string, ownerId string, projectId string, status string, updatedAt time.Time) *MemberInvite {
	this := MemberInvite{}
	this.CreatedAt = createdAt
	this.Id = id
	this.InviteeEmail = inviteeEmail
	this.OwnerEmail = ownerEmail
	this.OwnerId = ownerId
	this.ProjectId = projectId
	this.Status = status
	this.UpdatedAt = updatedAt
	return &this
}

// NewMemberInviteWithDefaults instantiates a new MemberInvite object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMemberInviteWithDefaults() *MemberInvite {
	this := MemberInvite{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *MemberInvite) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *MemberInvite) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetId returns the Id field value
func (o *MemberInvite) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *MemberInvite) SetId(v string) {
	o.Id = v
}

// GetInviteeEmail returns the InviteeEmail field value
func (o *MemberInvite) GetInviteeEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.InviteeEmail
}

// GetInviteeEmailOk returns a tuple with the InviteeEmail field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetInviteeEmailOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.InviteeEmail, true
}

// SetInviteeEmail sets field value
func (o *MemberInvite) SetInviteeEmail(v string) {
	o.InviteeEmail = v
}

// GetInviteeId returns the InviteeId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MemberInvite) GetInviteeId() string {
	if o == nil || o.InviteeId.Get() == nil {
		var ret string
		return ret
	}
	return *o.InviteeId.Get()
}

// GetInviteeIdOk returns a tuple with the InviteeId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MemberInvite) GetInviteeIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.InviteeId.Get(), o.InviteeId.IsSet()
}

// HasInviteeId returns a boolean if a field has been set.
func (o *MemberInvite) HasInviteeId() bool {
	if o != nil && o.InviteeId.IsSet() {
		return true
	}

	return false
}

// SetInviteeId gets a reference to the given NullableString and assigns it to the InviteeId field.
func (o *MemberInvite) SetInviteeId(v string) {
	o.InviteeId.Set(&v)
}
// SetInviteeIdNil sets the value for InviteeId to be an explicit nil
func (o *MemberInvite) SetInviteeIdNil() {
	o.InviteeId.Set(nil)
}

// UnsetInviteeId ensures that no value is present for InviteeId, not even an explicit nil
func (o *MemberInvite) UnsetInviteeId() {
	o.InviteeId.Unset()
}

// GetOwnerEmail returns the OwnerEmail field value
func (o *MemberInvite) GetOwnerEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OwnerEmail
}

// GetOwnerEmailOk returns a tuple with the OwnerEmail field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetOwnerEmailOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OwnerEmail, true
}

// SetOwnerEmail sets field value
func (o *MemberInvite) SetOwnerEmail(v string) {
	o.OwnerEmail = v
}

// GetOwnerId returns the OwnerId field value
func (o *MemberInvite) GetOwnerId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OwnerId
}

// GetOwnerIdOk returns a tuple with the OwnerId field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetOwnerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OwnerId, true
}

// SetOwnerId sets field value
func (o *MemberInvite) SetOwnerId(v string) {
	o.OwnerId = v
}

// GetProjectId returns the ProjectId field value
func (o *MemberInvite) GetProjectId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProjectId
}

// GetProjectIdOk returns a tuple with the ProjectId field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetProjectIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProjectId, true
}

// SetProjectId sets field value
func (o *MemberInvite) SetProjectId(v string) {
	o.ProjectId = v
}

// GetStatus returns the Status field value
func (o *MemberInvite) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *MemberInvite) SetStatus(v string) {
	o.Status = v
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *MemberInvite) GetUpdatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *MemberInvite) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *MemberInvite) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = v
}

func (o MemberInvite) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["created_at"] = o.CreatedAt
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["invitee_email"] = o.InviteeEmail
	}
	if o.InviteeId.IsSet() {
		toSerialize["invitee_id"] = o.InviteeId.Get()
	}
	if true {
		toSerialize["owner_email"] = o.OwnerEmail
	}
	if true {
		toSerialize["owner_id"] = o.OwnerId
	}
	if true {
		toSerialize["project_id"] = o.ProjectId
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["updated_at"] = o.UpdatedAt
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *MemberInvite) UnmarshalJSON(bytes []byte) (err error) {
	varMemberInvite := _MemberInvite{}

	if err = json.Unmarshal(bytes, &varMemberInvite); err == nil {
		*o = MemberInvite(varMemberInvite)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "created_at")
		delete(additionalProperties, "id")
		delete(additionalProperties, "invitee_email")
		delete(additionalProperties, "invitee_id")
		delete(additionalProperties, "owner_email")
		delete(additionalProperties, "owner_id")
		delete(additionalProperties, "project_id")
		delete(additionalProperties, "status")
		delete(additionalProperties, "updated_at")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMemberInvite struct {
	value *MemberInvite
	isSet bool
}

func (v NullableMemberInvite) Get() *MemberInvite {
	return v.value
}

func (v *NullableMemberInvite) Set(val *MemberInvite) {
	v.value = val
	v.isSet = true
}

func (v NullableMemberInvite) IsSet() bool {
	return v.isSet
}

func (v *NullableMemberInvite) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMemberInvite(val *MemberInvite) *NullableMemberInvite {
	return &NullableMemberInvite{value: val, isSet: true}
}

func (v NullableMemberInvite) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMemberInvite) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


