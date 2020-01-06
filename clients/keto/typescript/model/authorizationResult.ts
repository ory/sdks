/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.36
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class AuthorizationResult {
    /**
    * Allowed is true if the request should be allowed and false otherwise.
    */
    'allowed': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "allowed",
            "baseName": "allowed",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return AuthorizationResult.attributeTypeMap;
    }
}

