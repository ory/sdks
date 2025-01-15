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

/// ManagedIdentitySchema : Together the name and identity uuid are a unique index constraint. This prevents a user from having schemas with the same name. This also allows schemas to have the same name across the system.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ManagedIdentitySchema {
    /// The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage
    #[serde(rename = "blob_name")]
    pub blob_name: String,
    /// The publicly accessible url of the schema
    #[serde(rename = "blob_url")]
    pub blob_url: String,
    /// The Content Hash  Contains a hash of the schema's content.
    #[serde(rename = "content_hash", skip_serializing_if = "Option::is_none")]
    pub content_hash: Option<String>,
    /// The Schema's Creation Date
    #[serde(rename = "created_at")]
    pub created_at: String,
    /// The schema's ID.
    #[serde(rename = "id")]
    pub id: String,
    /// The schema name  This is set by the user and is for them to easily recognise their schema
    #[serde(rename = "name")]
    pub name: String,
    /// Last Time Schema was Updated
    #[serde(rename = "updated_at")]
    pub updated_at: String,
}

impl ManagedIdentitySchema {
    /// Together the name and identity uuid are a unique index constraint. This prevents a user from having schemas with the same name. This also allows schemas to have the same name across the system.
    pub fn new(blob_name: String, blob_url: String, created_at: String, id: String, name: String, updated_at: String) -> ManagedIdentitySchema {
        ManagedIdentitySchema {
            blob_name,
            blob_url,
            content_hash: None,
            created_at,
            id,
            name,
            updated_at,
        }
    }
}

