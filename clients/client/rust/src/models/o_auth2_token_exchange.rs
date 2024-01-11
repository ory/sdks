/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// OAuth2TokenExchange : OAuth2 Token Exchange Result



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct OAuth2TokenExchange {
    /// The access token issued by the authorization server.
    #[serde(rename = "access_token", skip_serializing_if = "Option::is_none")]
    pub access_token: Option<String>,
    /// The lifetime in seconds of the access token. For example, the value \"3600\" denotes that the access token will expire in one hour from the time the response was generated.
    #[serde(rename = "expires_in", skip_serializing_if = "Option::is_none")]
    pub expires_in: Option<i64>,
    /// To retrieve a refresh token request the id_token scope.
    #[serde(rename = "id_token", skip_serializing_if = "Option::is_none")]
    pub id_token: Option<String>,
    /// The refresh token, which can be used to obtain new access tokens. To retrieve it add the scope \"offline\" to your access token request.
    #[serde(rename = "refresh_token", skip_serializing_if = "Option::is_none")]
    pub refresh_token: Option<String>,
    /// The scope of the access token
    #[serde(rename = "scope", skip_serializing_if = "Option::is_none")]
    pub scope: Option<String>,
    /// The type of the token issued
    #[serde(rename = "token_type", skip_serializing_if = "Option::is_none")]
    pub token_type: Option<String>,
}

impl Default for OAuth2TokenExchange {
    fn default() -> Self {
        Self::new()
    }
}

impl OAuth2TokenExchange {
    /// OAuth2 Token Exchange Result
    pub fn new() -> OAuth2TokenExchange {
        OAuth2TokenExchange {
                access_token: None,
                expires_in: None,
                id_token: None,
                refresh_token: None,
                scope: None,
                token_type: None,
        }
    }
}


