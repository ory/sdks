/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SettingsFlow : This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SettingsFlow {
    /// Active, if set, contains the registration method that is being used. It is initially not set.
    #[serde(rename = "active", skip_serializing_if = "Option::is_none")]
    pub active: Option<String>,
    /// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.
    #[serde(rename = "expires_at")]
    pub expires_at: String,
    /// ID represents the flow's unique ID. When performing the settings flow, this represents the id in the settings ui's query parameter: http://<selfservice.flows.settings.ui_url>?flow=<id>
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "identity")]
    pub identity: Box<crate::models::Identity>,
    /// IssuedAt is the time (UTC) when the flow occurred.
    #[serde(rename = "issued_at")]
    pub issued_at: String,
    /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
    #[serde(rename = "request_url")]
    pub request_url: String,
    /// ReturnTo contains the requested return_to URL.
    #[serde(rename = "return_to", skip_serializing_if = "Option::is_none")]
    pub return_to: Option<String>,
    #[serde(rename = "state")]
    pub state: crate::models::SettingsFlowState,
    /// The flow type can either be `api` or `browser`.
    #[serde(rename = "type")]
    pub _type: String,
    #[serde(rename = "ui")]
    pub ui: Box<crate::models::UiContainer>,
}


impl SettingsFlow {
    /// This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)
    pub fn new(expires_at: String, id: String, identity: crate::models::Identity, issued_at: String, request_url: String, state: crate::models::SettingsFlowState, _type: String, ui: crate::models::UiContainer) -> SettingsFlow {
        SettingsFlow {
                active: None,
                expires_at,
                id,
                identity: Box::new(identity),
                issued_at,
                request_url,
                return_to: None,
                state,
                _type,
                ui: Box::new(ui),
        }
    }
}


