/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* The Access Token Response
*/
export class Oauth2TokenResponse {
    'accessToken'?: string;
    'expiresIn'?: number;
    'idToken'?: string;
    'refreshToken'?: string;
    'scope'?: string;
    'tokenType'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accessToken",
            "baseName": "access_token",
            "type": "string"
        },
        {
            "name": "expiresIn",
            "baseName": "expires_in",
            "type": "number"
        },
        {
            "name": "idToken",
            "baseName": "id_token",
            "type": "string"
        },
        {
            "name": "refreshToken",
            "baseName": "refresh_token",
            "type": "string"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "string"
        },
        {
            "name": "tokenType",
            "baseName": "token_type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Oauth2TokenResponse.attributeTypeMap;
    }
}

