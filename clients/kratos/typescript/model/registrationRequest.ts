/**
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32+1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RegistrationRequestMethod } from './registrationRequestMethod';

export class RegistrationRequest {
    /**
    * and so on.
    */
    'active'?: string;
    /**
    * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to log in, a new request has to be initiated.
    */
    'expiresAt'?: Date;
    'id'?: string;
    /**
    * IssuedAt is the time (UTC) when the request occurred.
    */
    'issuedAt'?: Date;
    /**
    * Methods contains context for all enabled registration methods. If a registration request has been processed, but for example the password is incorrect, this will contain error messages.
    */
    'methods'?: { [key: string]: RegistrationRequestMethod; };
    /**
    * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL\'s path or query for example.
    */
    'requestUrl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "active",
            "baseName": "active",
            "type": "string"
        },
        {
            "name": "expiresAt",
            "baseName": "expires_at",
            "type": "Date"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "issuedAt",
            "baseName": "issued_at",
            "type": "Date"
        },
        {
            "name": "methods",
            "baseName": "methods",
            "type": "{ [key: string]: RegistrationRequestMethod; }"
        },
        {
            "name": "requestUrl",
            "baseName": "request_url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return RegistrationRequest.attributeTypeMap;
    }
}

