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


/**
* ListOryAccessControlPolicyRoles list ory access control policy roles
*/
export class ListOryAccessControlPolicyRoles {
    /**
    * The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\"  in: path
    */
    'flavor': string;
    /**
    * The maximum amount of policies returned.  in: query
    */
    'limit'?: number;
    /**
    * The offset from where to start looking.  in: query
    */
    'offset'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "flavor",
            "baseName": "flavor",
            "type": "string"
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ListOryAccessControlPolicyRoles.attributeTypeMap;
    }
}

