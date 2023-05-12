/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.28
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct OAuth2ConsentRequest {
    /// ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
    #[serde(rename = "acr", skip_serializing_if = "Option::is_none")]
    pub acr: Option<String>,
    #[serde(rename = "amr", skip_serializing_if = "Option::is_none")]
    pub amr: Option<Vec<String>>,
    /// ID is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.
    #[serde(rename = "challenge")]
    pub challenge: String,
    #[serde(rename = "client", skip_serializing_if = "Option::is_none")]
    pub client: Option<Box<crate::models::OAuth2Client>>,
    #[serde(rename = "context", skip_serializing_if = "Option::is_none")]
    pub context: Option<serde_json::Value>,
    /// LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.
    #[serde(rename = "login_challenge", skip_serializing_if = "Option::is_none")]
    pub login_challenge: Option<String>,
    /// LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.
    #[serde(rename = "login_session_id", skip_serializing_if = "Option::is_none")]
    pub login_session_id: Option<String>,
    #[serde(rename = "oidc_context", skip_serializing_if = "Option::is_none")]
    pub oidc_context: Option<Box<crate::models::OAuth2ConsentRequestOpenIdConnectContext>>,
    /// RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
    #[serde(rename = "request_url", skip_serializing_if = "Option::is_none")]
    pub request_url: Option<String>,
    #[serde(rename = "requested_access_token_audience", skip_serializing_if = "Option::is_none")]
    pub requested_access_token_audience: Option<Vec<String>>,
    #[serde(rename = "requested_scope", skip_serializing_if = "Option::is_none")]
    pub requested_scope: Option<Vec<String>>,
    /// Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
    #[serde(rename = "skip", skip_serializing_if = "Option::is_none")]
    pub skip: Option<bool>,
    /// Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<String>,
}


impl OAuth2ConsentRequest {
    pub fn new(challenge: String) -> OAuth2ConsentRequest {
        OAuth2ConsentRequest {
                acr: None,
                amr: None,
                challenge,
                client: None,
                context: None,
                login_challenge: None,
                login_session_id: None,
                oidc_context: None,
                request_url: None,
                requested_access_token_audience: None,
                requested_scope: None,
                skip: None,
                subject: None,
        }
    }
}


