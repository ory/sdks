/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ContinueWithRecoveryUi : Indicates, that the UI flow could be continued by showing a recovery ui



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ContinueWithRecoveryUi {
    /// Action will always be `show_recovery_ui` show_recovery_ui ContinueWithActionShowRecoveryUIString
    #[serde(rename = "action")]
    pub action: ActionEnum,
    #[serde(rename = "flow")]
    pub flow: Box<crate::models::ContinueWithRecoveryUiFlow>,
}


impl ContinueWithRecoveryUi {
    /// Indicates, that the UI flow could be continued by showing a recovery ui
    pub fn new(action: ActionEnum, flow: crate::models::ContinueWithRecoveryUiFlow) -> ContinueWithRecoveryUi {
        ContinueWithRecoveryUi {
                action,
                flow: Box::new(flow),
        }
    }
}

/// Action will always be `show_recovery_ui` show_recovery_ui ContinueWithActionShowRecoveryUIString
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ActionEnum {
    #[serde(rename = "show_recovery_ui")]
    ShowRecoveryUi,
}

