/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.11.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// PreviousConsentSession : The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PreviousConsentSession {
    #[serde(rename = "consent_request", skip_serializing_if = "Option::is_none")]
    pub consent_request: Option<Box<crate::models::ConsentRequest>>,
    #[serde(rename = "grant_access_token_audience", skip_serializing_if = "Option::is_none")]
    pub grant_access_token_audience: Option<Vec<String>>,
    #[serde(rename = "grant_scope", skip_serializing_if = "Option::is_none")]
    pub grant_scope: Option<Vec<String>>,
    #[serde(rename = "handled_at", skip_serializing_if = "Option::is_none")]
    pub handled_at: Option<String>,
    /// Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
    #[serde(rename = "remember", skip_serializing_if = "Option::is_none")]
    pub remember: Option<bool>,
    /// RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.
    #[serde(rename = "remember_for", skip_serializing_if = "Option::is_none")]
    pub remember_for: Option<i64>,
    #[serde(rename = "session", skip_serializing_if = "Option::is_none")]
    pub session: Option<Box<crate::models::ConsentRequestSession>>,
}

impl PreviousConsentSession {
    /// The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json
    pub fn new() -> PreviousConsentSession {
        PreviousConsentSession {
            consent_request: None,
            grant_access_token_audience: None,
            grant_scope: None,
            handled_at: None,
            remember: None,
            remember_for: None,
            session: None,
        }
    }
}


