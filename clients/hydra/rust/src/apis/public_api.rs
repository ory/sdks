/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.11.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};


/// struct for typed errors of method `disconnect_user`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DisconnectUserError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `discover_open_id_configuration`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DiscoverOpenIdConfigurationError {
    Status401(crate::models::JsonError),
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `dynamic_client_registration_create_o_auth2_client`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DynamicClientRegistrationCreateOAuth2ClientError {
    DefaultResponse(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `dynamic_client_registration_delete_o_auth2_client`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DynamicClientRegistrationDeleteOAuth2ClientError {
    DefaultResponse(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `dynamic_client_registration_get_o_auth2_client`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DynamicClientRegistrationGetOAuth2ClientError {
    DefaultResponse(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `dynamic_client_registration_update_o_auth2_client`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DynamicClientRegistrationUpdateOAuth2ClientError {
    DefaultResponse(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `is_instance_ready`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum IsInstanceReadyError {
    Status503(crate::models::HealthNotReadyStatus),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `oauth2_token`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum Oauth2TokenError {
    Status400(crate::models::JsonError),
    Status401(crate::models::JsonError),
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `oauth_auth`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum OauthAuthError {
    Status401(crate::models::JsonError),
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `revoke_o_auth2_token`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RevokeOAuth2TokenError {
    Status401(crate::models::JsonError),
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `userinfo`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UserinfoError {
    Status401(crate::models::JsonError),
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `well_known`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum WellKnownError {
    Status500(crate::models::JsonError),
    UnknownValue(serde_json::Value),
}


/// This endpoint initiates and completes user logout at Ory Hydra and initiates OpenID Connect Front-/Back-channel logout:  https://openid.net/specs/openid-connect-frontchannel-1_0.html https://openid.net/specs/openid-connect-backchannel-1_0.html
pub async fn disconnect_user(configuration: &configuration::Configuration, ) -> Result<(), Error<DisconnectUserError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/oauth2/sessions/logout", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<DisconnectUserError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// The well known endpoint an be used to retrieve information for OpenID Connect clients. We encourage you to not roll your own OpenID Connect client but to use an OpenID Connect client library instead. You can learn more on this flow at https://openid.net/specs/openid-connect-discovery-1_0.html .  Popular libraries for OpenID Connect clients include oidc-client-js (JavaScript), go-oidc (Golang), and others. For a full list of clients go here: https://openid.net/developers/certified/
pub async fn discover_open_id_configuration(configuration: &configuration::Configuration, ) -> Result<crate::models::WellKnown, Error<DiscoverOpenIdConfigurationError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/.well-known/openid-configuration", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DiscoverOpenIdConfigurationError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint behaves like the administrative counterpart (`createOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  Please note that using this endpoint you are not able to choose the `client_secret` nor the `client_id` as those values will be server generated when specifying `token_endpoint_auth_method` as `client_secret_basic` or `client_secret_post`.  The `client_secret` will be returned in the response and you will not be able to retrieve it later on. Write the secret down and keep it somewhere safe.
pub async fn dynamic_client_registration_create_o_auth2_client(configuration: &configuration::Configuration, body: crate::models::OAuth2Client) -> Result<crate::models::OAuth2Client, Error<DynamicClientRegistrationCreateOAuth2ClientError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/connect/register", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.json(&body);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DynamicClientRegistrationCreateOAuth2ClientError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint behaves like the administrative counterpart (`deleteOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.
pub async fn dynamic_client_registration_delete_o_auth2_client(configuration: &configuration::Configuration, id: &str) -> Result<(), Error<DynamicClientRegistrationDeleteOAuth2ClientError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/connect/register/{id}", configuration.base_path, id=crate::apis::urlencode(id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<DynamicClientRegistrationDeleteOAuth2ClientError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint behaves like the administrative counterpart (`getOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.
pub async fn dynamic_client_registration_get_o_auth2_client(configuration: &configuration::Configuration, id: &str) -> Result<crate::models::OAuth2Client, Error<DynamicClientRegistrationGetOAuth2ClientError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/connect/register/{id}", configuration.base_path, id=crate::apis::urlencode(id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DynamicClientRegistrationGetOAuth2ClientError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint behaves like the administrative counterpart (`updateOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  If you pass `client_secret` the secret will be updated and returned via the API. This is the only time you will be able to retrieve the client secret, so write it down and keep it safe.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.
pub async fn dynamic_client_registration_update_o_auth2_client(configuration: &configuration::Configuration, id: &str, body: crate::models::OAuth2Client) -> Result<crate::models::OAuth2Client, Error<DynamicClientRegistrationUpdateOAuth2ClientError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/connect/register/{id}", configuration.base_path, id=crate::apis::urlencode(id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.json(&body);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DynamicClientRegistrationUpdateOAuth2ClientError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
pub async fn is_instance_ready(configuration: &configuration::Configuration, ) -> Result<crate::models::HealthStatus, Error<IsInstanceReadyError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/health/ready", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<IsInstanceReadyError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// The client makes a request to the token endpoint by sending the following parameters using the \"application/x-www-form-urlencoded\" HTTP request entity-body.  > Do not implement a client for this endpoint yourself. Use a library. There are many libraries > available for any programming language. You can find a list of libraries here: https://oauth.net/code/ > > Do note that Hydra SDK does not implement this endpoint properly. Use one of the libraries listed above!
pub async fn oauth2_token(configuration: &configuration::Configuration, grant_type: &str, code: Option<&str>, refresh_token: Option<&str>, redirect_uri: Option<&str>, client_id: Option<&str>) -> Result<crate::models::Oauth2TokenResponse, Error<Oauth2TokenError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/oauth2/token", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_auth_conf) = configuration.basic_auth {
        local_var_req_builder = local_var_req_builder.basic_auth(local_var_auth_conf.0.to_owned(), local_var_auth_conf.1.to_owned());
    };
    if let Some(ref local_var_token) = configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("grant_type", grant_type.to_string());
    if let Some(local_var_param_value) = code {
        local_var_form_params.insert("code", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = refresh_token {
        local_var_form_params.insert("refresh_token", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = redirect_uri {
        local_var_form_params.insert("redirect_uri", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = client_id {
        local_var_form_params.insert("client_id", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<Oauth2TokenError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint is not documented here because you should never use your own implementation to perform OAuth2 flows. OAuth2 is a very popular protocol and a library for your programming language will exists.  To learn more about this flow please refer to the specification: https://tools.ietf.org/html/rfc6749
pub async fn oauth_auth(configuration: &configuration::Configuration, ) -> Result<(), Error<OauthAuthError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/oauth2/auth", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<OauthAuthError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Revoking a token (both access and refresh) means that the tokens will be invalid. A revoked access token can no longer be used to make access requests, and a revoked refresh token can no longer be used to refresh an access token. Revoking a refresh token also invalidates the access token that was created with it. A token may only be revoked by the client the token was generated for.
pub async fn revoke_o_auth2_token(configuration: &configuration::Configuration, token: &str) -> Result<(), Error<RevokeOAuth2TokenError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/oauth2/revoke", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_auth_conf) = configuration.basic_auth {
        local_var_req_builder = local_var_req_builder.basic_auth(local_var_auth_conf.0.to_owned(), local_var_auth_conf.1.to_owned());
    };
    if let Some(ref local_var_token) = configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("token", token.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<RevokeOAuth2TokenError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint returns the payload of the ID Token, including the idTokenExtra values, of the provided OAuth 2.0 Access Token.  For more information please [refer to the spec](http://openid.net/specs/openid-connect-core-1_0.html#UserInfo).  In the case of authentication error, a WWW-Authenticate header might be set in the response with more information about the error. See [the spec](https://datatracker.ietf.org/doc/html/rfc6750#section-3) for more details about header format.
pub async fn userinfo(configuration: &configuration::Configuration, ) -> Result<crate::models::UserinfoResponse, Error<UserinfoError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/userinfo", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UserinfoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint returns JSON Web Keys to be used as public keys for verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
pub async fn well_known(configuration: &configuration::Configuration, ) -> Result<crate::models::JsonWebKeySet, Error<WellKnownError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/.well-known/jwks.json", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<WellKnownError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

