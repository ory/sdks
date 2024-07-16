/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// OAuth2ConsentSession : A completed OAuth 2.0 Consent Session.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OAuth2ConsentSession {
    #[serde(rename = "consent_request", skip_serializing_if = "Option::is_none")]
    pub consent_request: Option<Box<models::OAuth2ConsentRequest>>,
    #[serde(rename = "context", skip_serializing_if = "Option::is_none")]
    pub context: Option<serde_json::Value>,
    #[serde(rename = "expires_at", skip_serializing_if = "Option::is_none")]
    pub expires_at: Option<Box<models::OAuth2ConsentSessionExpiresAt>>,
    #[serde(rename = "grant_access_token_audience", skip_serializing_if = "Option::is_none")]
    pub grant_access_token_audience: Option<Vec<String>>,
    #[serde(rename = "grant_scope", skip_serializing_if = "Option::is_none")]
    pub grant_scope: Option<Vec<String>>,
    #[serde(rename = "handled_at", skip_serializing_if = "Option::is_none")]
    pub handled_at: Option<String>,
    /// Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
    #[serde(rename = "remember", skip_serializing_if = "Option::is_none")]
    pub remember: Option<bool>,
    /// Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.
    #[serde(rename = "remember_for", skip_serializing_if = "Option::is_none")]
    pub remember_for: Option<i64>,
    #[serde(rename = "session", skip_serializing_if = "Option::is_none")]
    pub session: Option<Box<models::AcceptOAuth2ConsentRequestSession>>,
}

impl OAuth2ConsentSession {
    /// A completed OAuth 2.0 Consent Session.
    pub fn new() -> OAuth2ConsentSession {
        OAuth2ConsentSession {
            consent_request: None,
            context: None,
            expires_at: None,
            grant_access_token_audience: None,
            grant_scope: None,
            handled_at: None,
            remember: None,
            remember_for: None,
            session: None,
        }
    }
}

