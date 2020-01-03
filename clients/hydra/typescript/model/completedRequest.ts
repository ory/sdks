/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class CompletedRequest {
    /**
    * RedirectURL is the URL which you should redirect the user to once the authentication process is completed.
    */
    'redirectTo'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "redirectTo",
            "baseName": "redirect_to",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CompletedRequest.attributeTypeMap;
    }
}

