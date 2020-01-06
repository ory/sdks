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

import { OryAccessControlPolicyRole } from './oryAccessControlPolicyRole';

/**
* Roles is an array of roles.
*/
export class ListOryAccessControlPolicyRolesOK {
    /**
    * payload
    */
    'payload'?: Array<OryAccessControlPolicyRole>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "Array<OryAccessControlPolicyRole>"
        }    ];

    static getAttributeTypeMap() {
        return ListOryAccessControlPolicyRolesOK.attributeTypeMap;
    }
}

