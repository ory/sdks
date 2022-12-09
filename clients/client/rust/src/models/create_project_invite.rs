/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// CreateProjectInvite : Create Project Invite Request Body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateProjectInvite {
    #[serde(rename = "invitee_email", skip_serializing_if = "Option::is_none")]
    pub invitee_email: Option<String>,
}

impl Default for CreateProjectInvite {
    fn default() -> Self {
        Self::new()
    }
}

impl CreateProjectInvite {
    /// Create Project Invite Request Body
    pub fn new() -> CreateProjectInvite {
        CreateProjectInvite {
                invitee_email: None,
        }
    }
}


