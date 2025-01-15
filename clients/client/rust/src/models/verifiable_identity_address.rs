/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// VerifiableIdentityAddress : VerifiableAddress is an identity's verifiable address
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct VerifiableIdentityAddress {
    /// When this entry was created
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// The ID
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema
    #[serde(rename = "status")]
    pub status: String,
    /// When this entry was last updated
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
    /// The address value  example foo@user.com
    #[serde(rename = "value")]
    pub value: String,
    /// Indicates if the address has already been verified
    #[serde(rename = "verified")]
    pub verified: bool,
    #[serde(rename = "verified_at", skip_serializing_if = "Option::is_none")]
    pub verified_at: Option<String>,
    /// The delivery method
    #[serde(rename = "via")]
    pub via: ViaEnum,
}

impl VerifiableIdentityAddress {
    /// VerifiableAddress is an identity's verifiable address
    pub fn new(status: String, value: String, verified: bool, via: ViaEnum) -> VerifiableIdentityAddress {
        VerifiableIdentityAddress {
            created_at: None,
            id: None,
            status,
            updated_at: None,
            value,
            verified,
            verified_at: None,
            via,
        }
    }
}
/// The delivery method
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ViaEnum {
    #[serde(rename = "email")]
    Email,
    #[serde(rename = "sms")]
    Sms,
}

impl Default for ViaEnum {
    fn default() -> ViaEnum {
        Self::Email
    }
}

