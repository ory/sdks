/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { OryAccessControlPolicyAllowedInput } from './oryAccessControlPolicyAllowedInput';

/**
* DoOryAccessControlPoliciesAllow do ory access control policies allow
*/
export class DoOryAccessControlPoliciesAllow {
    'body'?: OryAccessControlPolicyAllowedInput;
    /**
    * The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path
    */
    'flavor': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "body",
            "baseName": "Body",
            "type": "OryAccessControlPolicyAllowedInput"
        },
        {
            "name": "flavor",
            "baseName": "flavor",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DoOryAccessControlPoliciesAllow.attributeTypeMap;
    }
}

