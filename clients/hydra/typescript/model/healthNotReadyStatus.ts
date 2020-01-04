/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class HealthNotReadyStatus {
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
        return HealthNotReadyStatus.attributeTypeMap;
    }
}

