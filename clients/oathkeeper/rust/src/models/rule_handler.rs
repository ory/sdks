/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.50
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RuleHandler {
    /// Config contains the configuration for the handler. Please read the user guide for a complete list of each handler's available settings.
    #[serde(rename = "config", skip_serializing_if = "Option::is_none")]
    pub config: Option<serde_json::Value>,
    /// Handler identifies the implementation which will be used to handle this specific request. Please read the user guide for a complete list of available handlers.
    #[serde(rename = "handler", skip_serializing_if = "Option::is_none")]
    pub handler: Option<String>,
}

impl RuleHandler {
    pub fn new() -> RuleHandler {
        RuleHandler {
            config: None,
            handler: None,
        }
    }
}


