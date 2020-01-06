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

import { FormField } from './formField';

export class OidcStrategyRequestMethod {
    /**
    * Action should be used as the form action URL (<form action=\"{{ .Action }}\" method=\"post\">).
    */
    'action'?: string;
    /**
    * Errors contains all form errors. These will be duplicates of the individual field errors.
    */
    'errors'?: Array<Error>;
    /**
    * Fields contains multiple fields asdfasdf
    */
    'fields'?: { [key: string]: FormField; };
    /**
    * Method is the form method (e.g. POST)
    */
    'method'?: string;
    'providers'?: Array<FormField>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "string"
        },
        {
            "name": "errors",
            "baseName": "errors",
            "type": "Array<Error>"
        },
        {
            "name": "fields",
            "baseName": "fields",
            "type": "{ [key: string]: FormField; }"
        },
        {
            "name": "method",
            "baseName": "method",
            "type": "string"
        },
        {
            "name": "providers",
            "baseName": "providers",
            "type": "Array<FormField>"
        }    ];

    static getAttributeTypeMap() {
        return OidcStrategyRequestMethod.attributeTypeMap;
    }
}

