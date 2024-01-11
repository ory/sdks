/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// DeleteMySessionsCount : Deleted Session Count



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct DeleteMySessionsCount {
    /// The number of sessions that were revoked.
    #[serde(rename = "count", skip_serializing_if = "Option::is_none")]
    pub count: Option<i64>,
}

impl Default for DeleteMySessionsCount {
    fn default() -> Self {
        Self::new()
    }
}

impl DeleteMySessionsCount {
    /// Deleted Session Count
    pub fn new() -> DeleteMySessionsCount {
        DeleteMySessionsCount {
                count: None,
        }
    }
}


