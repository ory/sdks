/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class RejectRequest {
    'error'?: string;
    'errorDebug'?: string;
    'errorDescription'?: string;
    'errorHint'?: string;
    'statusCode'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "error",
            "baseName": "error",
            "type": "string"
        },
        {
            "name": "errorDebug",
            "baseName": "error_debug",
            "type": "string"
        },
        {
            "name": "errorDescription",
            "baseName": "error_description",
            "type": "string"
        },
        {
            "name": "errorHint",
            "baseName": "error_hint",
            "type": "string"
        },
        {
            "name": "statusCode",
            "baseName": "status_code",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return RejectRequest.attributeTypeMap;
    }
}

