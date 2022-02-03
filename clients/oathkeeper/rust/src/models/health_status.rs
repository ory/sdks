/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.17-beta.1
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct HealthStatus {
    /// Status always contains \"ok\".
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
}

impl HealthStatus {
    pub fn new() -> HealthStatus {
        HealthStatus {
            status: None,
        }
    }
}


