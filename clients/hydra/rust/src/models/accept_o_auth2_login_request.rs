/*
 * Ory Hydra API
 *
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.2.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AcceptOAuth2LoginRequest {
    /// ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
    #[serde(rename = "acr", skip_serializing_if = "Option::is_none")]
    pub acr: Option<String>,
    #[serde(rename = "amr", skip_serializing_if = "Option::is_none")]
    pub amr: Option<Vec<String>>,
    #[serde(rename = "context", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub context: Option<Option<serde_json::Value>>,
    /// Extend OAuth2 authentication session lifespan  If set to `true`, the OAuth2 authentication cookie lifespan is extended. This is for example useful if you want the user to be able to use `prompt=none` continuously.  This value can only be set to `true` if the user has an authentication, which is the case if the `skip` value is `true`.
    #[serde(rename = "extend_session_lifespan", skip_serializing_if = "Option::is_none")]
    pub extend_session_lifespan: Option<bool>,
    /// ForceSubjectIdentifier forces the \"pairwise\" user ID of the end-user that authenticated. The \"pairwise\" user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\"user\") identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if `pairwise` is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via `subject_type` key in the client's configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
    #[serde(rename = "force_subject_identifier", skip_serializing_if = "Option::is_none")]
    pub force_subject_identifier: Option<String>,
    /// IdentityProviderSessionID is the session ID of the end-user that authenticated. If specified, we will use this value to propagate the logout.
    #[serde(rename = "identity_provider_session_id", skip_serializing_if = "Option::is_none")]
    pub identity_provider_session_id: Option<String>,
    /// Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
    #[serde(rename = "remember", skip_serializing_if = "Option::is_none")]
    pub remember: Option<bool>,
    /// RememberFor sets how long the authentication should be remembered for in seconds. If set to `0`, the authorization will be remembered for the duration of the browser session (using a session cookie).
    #[serde(rename = "remember_for", skip_serializing_if = "Option::is_none")]
    pub remember_for: Option<i64>,
    /// Subject is the user ID of the end-user that authenticated.
    #[serde(rename = "subject")]
    pub subject: String,
}

impl AcceptOAuth2LoginRequest {
    pub fn new(subject: String) -> AcceptOAuth2LoginRequest {
        AcceptOAuth2LoginRequest {
            acr: None,
            amr: None,
            context: None,
            extend_session_lifespan: None,
            force_subject_identifier: None,
            identity_provider_session_id: None,
            remember: None,
            remember_for: None,
            subject,
        }
    }
}

