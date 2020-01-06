/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.37
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* GetOryAccessControlPolicy get ory access control policy
*/
export class GetOryAccessControlPolicy {
    /**
    * The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path
    */
    'flavor': string;
    /**
    * The ID of the ORY Access Control Policy Role.  in: path
    */
    'id': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "flavor",
            "baseName": "flavor",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return GetOryAccessControlPolicy.attributeTypeMap;
    }
}

