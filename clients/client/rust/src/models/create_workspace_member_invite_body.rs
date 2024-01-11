/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// CreateWorkspaceMemberInviteBody : Create Workspace Invite Request Body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateWorkspaceMemberInviteBody {
    /// A email to invite
    #[serde(rename = "invitee_email", skip_serializing_if = "Option::is_none")]
    pub invitee_email: Option<String>,
}

impl Default for CreateWorkspaceMemberInviteBody {
    fn default() -> Self {
        Self::new()
    }
}

impl CreateWorkspaceMemberInviteBody {
    /// Create Workspace Invite Request Body
    pub fn new() -> CreateWorkspaceMemberInviteBody {
        CreateWorkspaceMemberInviteBody {
                invitee_email: None,
        }
    }
}


