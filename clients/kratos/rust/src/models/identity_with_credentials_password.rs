/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.1
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// IdentityWithCredentialsPassword : Create Identity and Import Password Credentials
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityWithCredentialsPassword {
    #[serde(rename = "config", skip_serializing_if = "Option::is_none")]
    pub config: Option<Box<models::IdentityWithCredentialsPasswordConfig>>,
}

impl IdentityWithCredentialsPassword {
    /// Create Identity and Import Password Credentials
    pub fn new() -> IdentityWithCredentialsPassword {
        IdentityWithCredentialsPassword {
            config: None,
        }
    }
}

