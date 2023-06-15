/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.38
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SourcePosition {
    #[serde(rename = "Line", skip_serializing_if = "Option::is_none")]
    pub line: Option<i64>,
    #[serde(rename = "column", skip_serializing_if = "Option::is_none")]
    pub column: Option<i64>,
}

impl Default for SourcePosition {
    fn default() -> Self {
        Self::new()
    }
}

impl SourcePosition {
    pub fn new() -> SourcePosition {
        SourcePosition {
                line: None,
                column: None,
        }
    }
}


