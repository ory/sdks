/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* SwaggerNotReadyStatus swagger not ready status
*/
export class SwaggerNotReadyStatus {
    /**
    * Errors contains a list of errors that caused the not ready status.
    */
    'errors'?: { [key: string]: string; };

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "errors",
            "baseName": "errors",
            "type": "{ [key: string]: string; }"
        }    ];

    static getAttributeTypeMap() {
        return SwaggerNotReadyStatus.attributeTypeMap;
    }
}

