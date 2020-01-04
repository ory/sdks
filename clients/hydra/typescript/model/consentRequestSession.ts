/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class ConsentRequestSession {
    /**
    * AccessToken sets session data for the access and refresh token, as well as any future tokens issued by the refresh grant. Keep in mind that this data will be available to anyone performing OAuth 2.0 Challenge Introspection. If only your services can perform OAuth 2.0 Challenge Introspection, this is usually fine. But if third parties can access that endpoint as well, sensitive data from the session might be exposed to them. Use with care!
    */
    'accessToken'?: { [key: string]: object; };
    /**
    * IDToken sets session data for the OpenID Connect ID token. Keep in mind that the session\'id payloads are readable by anyone that has access to the ID Challenge. Use with care!
    */
    'idToken'?: { [key: string]: object; };

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accessToken",
            "baseName": "access_token",
            "type": "{ [key: string]: object; }"
        },
        {
            "name": "idToken",
            "baseName": "id_token",
            "type": "{ [key: string]: object; }"
        }    ];

    static getAttributeTypeMap() {
        return ConsentRequestSession.attributeTypeMap;
    }
}

