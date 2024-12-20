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

// UpdateLoginFlowBody - struct for UpdateLoginFlowBody
type UpdateLoginFlowBody struct {
	UpdateLoginFlowWithCodeMethod *UpdateLoginFlowWithCodeMethod
	UpdateLoginFlowWithIdentifierFirstMethod *UpdateLoginFlowWithIdentifierFirstMethod
	UpdateLoginFlowWithLookupSecretMethod *UpdateLoginFlowWithLookupSecretMethod
	UpdateLoginFlowWithOidcMethod *UpdateLoginFlowWithOidcMethod
	UpdateLoginFlowWithPasskeyMethod *UpdateLoginFlowWithPasskeyMethod
	UpdateLoginFlowWithPasswordMethod *UpdateLoginFlowWithPasswordMethod
	UpdateLoginFlowWithTotpMethod *UpdateLoginFlowWithTotpMethod
	UpdateLoginFlowWithWebAuthnMethod *UpdateLoginFlowWithWebAuthnMethod
}

// UpdateLoginFlowWithCodeMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithCodeMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithCodeMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithCodeMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithCodeMethod: v,
	}
}

// UpdateLoginFlowWithIdentifierFirstMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithIdentifierFirstMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithIdentifierFirstMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithIdentifierFirstMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithIdentifierFirstMethod: v,
	}
}

// UpdateLoginFlowWithLookupSecretMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithLookupSecretMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithLookupSecretMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithLookupSecretMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithLookupSecretMethod: v,
	}
}

// UpdateLoginFlowWithOidcMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithOidcMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithOidcMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithOidcMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithOidcMethod: v,
	}
}

// UpdateLoginFlowWithPasskeyMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithPasskeyMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithPasskeyMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithPasskeyMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithPasskeyMethod: v,
	}
}

// UpdateLoginFlowWithPasswordMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithPasswordMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithPasswordMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithPasswordMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithPasswordMethod: v,
	}
}

// UpdateLoginFlowWithTotpMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithTotpMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithTotpMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithTotpMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithTotpMethod: v,
	}
}

// UpdateLoginFlowWithWebAuthnMethodAsUpdateLoginFlowBody is a convenience function that returns UpdateLoginFlowWithWebAuthnMethod wrapped in UpdateLoginFlowBody
func UpdateLoginFlowWithWebAuthnMethodAsUpdateLoginFlowBody(v *UpdateLoginFlowWithWebAuthnMethod) UpdateLoginFlowBody {
	return UpdateLoginFlowBody{
		UpdateLoginFlowWithWebAuthnMethod: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *UpdateLoginFlowBody) UnmarshalJSON(data []byte) error {
	var err error
	// use discriminator value to speed up the lookup
	var jsonDict map[string]interface{}
	err = newStrictDecoder(data).Decode(&jsonDict)
	if err != nil {
		return fmt.Errorf("failed to unmarshal JSON into map for the discriminator lookup")
	}

	// check if the discriminator value is 'code'
	if jsonDict["method"] == "code" {
		// try to unmarshal JSON data into UpdateLoginFlowWithCodeMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithCodeMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithCodeMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithCodeMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithCodeMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'identifier_first'
	if jsonDict["method"] == "identifier_first" {
		// try to unmarshal JSON data into UpdateLoginFlowWithIdentifierFirstMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithIdentifierFirstMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithIdentifierFirstMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithIdentifierFirstMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithIdentifierFirstMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'lookup_secret'
	if jsonDict["method"] == "lookup_secret" {
		// try to unmarshal JSON data into UpdateLoginFlowWithLookupSecretMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithLookupSecretMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithLookupSecretMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithLookupSecretMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithLookupSecretMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'oidc'
	if jsonDict["method"] == "oidc" {
		// try to unmarshal JSON data into UpdateLoginFlowWithOidcMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithOidcMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithOidcMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithOidcMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithOidcMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'passkey'
	if jsonDict["method"] == "passkey" {
		// try to unmarshal JSON data into UpdateLoginFlowWithPasskeyMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithPasskeyMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithPasskeyMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithPasskeyMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithPasskeyMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'password'
	if jsonDict["method"] == "password" {
		// try to unmarshal JSON data into UpdateLoginFlowWithPasswordMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithPasswordMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithPasswordMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithPasswordMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithPasswordMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'totp'
	if jsonDict["method"] == "totp" {
		// try to unmarshal JSON data into UpdateLoginFlowWithTotpMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithTotpMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithTotpMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithTotpMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithTotpMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'webauthn'
	if jsonDict["method"] == "webauthn" {
		// try to unmarshal JSON data into UpdateLoginFlowWithWebAuthnMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithWebAuthnMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithWebAuthnMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithWebAuthnMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithWebAuthnMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithCodeMethod'
	if jsonDict["method"] == "updateLoginFlowWithCodeMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithCodeMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithCodeMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithCodeMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithCodeMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithCodeMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithIdentifierFirstMethod'
	if jsonDict["method"] == "updateLoginFlowWithIdentifierFirstMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithIdentifierFirstMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithIdentifierFirstMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithIdentifierFirstMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithIdentifierFirstMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithIdentifierFirstMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithLookupSecretMethod'
	if jsonDict["method"] == "updateLoginFlowWithLookupSecretMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithLookupSecretMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithLookupSecretMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithLookupSecretMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithLookupSecretMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithLookupSecretMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithOidcMethod'
	if jsonDict["method"] == "updateLoginFlowWithOidcMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithOidcMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithOidcMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithOidcMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithOidcMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithOidcMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithPasskeyMethod'
	if jsonDict["method"] == "updateLoginFlowWithPasskeyMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithPasskeyMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithPasskeyMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithPasskeyMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithPasskeyMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithPasskeyMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithPasswordMethod'
	if jsonDict["method"] == "updateLoginFlowWithPasswordMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithPasswordMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithPasswordMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithPasswordMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithPasswordMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithPasswordMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithTotpMethod'
	if jsonDict["method"] == "updateLoginFlowWithTotpMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithTotpMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithTotpMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithTotpMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithTotpMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithTotpMethod: %s", err.Error())
		}
	}

	// check if the discriminator value is 'updateLoginFlowWithWebAuthnMethod'
	if jsonDict["method"] == "updateLoginFlowWithWebAuthnMethod" {
		// try to unmarshal JSON data into UpdateLoginFlowWithWebAuthnMethod
		err = json.Unmarshal(data, &dst.UpdateLoginFlowWithWebAuthnMethod)
		if err == nil {
			return nil // data stored in dst.UpdateLoginFlowWithWebAuthnMethod, return on the first match
		} else {
			dst.UpdateLoginFlowWithWebAuthnMethod = nil
			return fmt.Errorf("failed to unmarshal UpdateLoginFlowBody as UpdateLoginFlowWithWebAuthnMethod: %s", err.Error())
		}
	}

	return nil
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src UpdateLoginFlowBody) MarshalJSON() ([]byte, error) {
	if src.UpdateLoginFlowWithCodeMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithCodeMethod)
	}

	if src.UpdateLoginFlowWithIdentifierFirstMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithIdentifierFirstMethod)
	}

	if src.UpdateLoginFlowWithLookupSecretMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithLookupSecretMethod)
	}

	if src.UpdateLoginFlowWithOidcMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithOidcMethod)
	}

	if src.UpdateLoginFlowWithPasskeyMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithPasskeyMethod)
	}

	if src.UpdateLoginFlowWithPasswordMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithPasswordMethod)
	}

	if src.UpdateLoginFlowWithTotpMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithTotpMethod)
	}

	if src.UpdateLoginFlowWithWebAuthnMethod != nil {
		return json.Marshal(&src.UpdateLoginFlowWithWebAuthnMethod)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *UpdateLoginFlowBody) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.UpdateLoginFlowWithCodeMethod != nil {
		return obj.UpdateLoginFlowWithCodeMethod
	}

	if obj.UpdateLoginFlowWithIdentifierFirstMethod != nil {
		return obj.UpdateLoginFlowWithIdentifierFirstMethod
	}

	if obj.UpdateLoginFlowWithLookupSecretMethod != nil {
		return obj.UpdateLoginFlowWithLookupSecretMethod
	}

	if obj.UpdateLoginFlowWithOidcMethod != nil {
		return obj.UpdateLoginFlowWithOidcMethod
	}

	if obj.UpdateLoginFlowWithPasskeyMethod != nil {
		return obj.UpdateLoginFlowWithPasskeyMethod
	}

	if obj.UpdateLoginFlowWithPasswordMethod != nil {
		return obj.UpdateLoginFlowWithPasswordMethod
	}

	if obj.UpdateLoginFlowWithTotpMethod != nil {
		return obj.UpdateLoginFlowWithTotpMethod
	}

	if obj.UpdateLoginFlowWithWebAuthnMethod != nil {
		return obj.UpdateLoginFlowWithWebAuthnMethod
	}

	// all schemas are nil
	return nil
}

type NullableUpdateLoginFlowBody struct {
	value *UpdateLoginFlowBody
	isSet bool
}

func (v NullableUpdateLoginFlowBody) Get() *UpdateLoginFlowBody {
	return v.value
}

func (v *NullableUpdateLoginFlowBody) Set(val *UpdateLoginFlowBody) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateLoginFlowBody) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateLoginFlowBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateLoginFlowBody(val *UpdateLoginFlowBody) *NullableUpdateLoginFlowBody {
	return &NullableUpdateLoginFlowBody{value: val, isSet: true}
}

func (v NullableUpdateLoginFlowBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateLoginFlowBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


