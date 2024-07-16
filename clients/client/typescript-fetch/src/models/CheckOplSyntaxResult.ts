/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ParseError } from './ParseError';
import {
    ParseErrorFromJSON,
    ParseErrorFromJSONTyped,
    ParseErrorToJSON,
} from './ParseError';

/**
 * 
 * @export
 * @interface CheckOplSyntaxResult
 */
export interface CheckOplSyntaxResult {
    /**
     * The list of syntax errors
     * @type {Array<ParseError>}
     * @memberof CheckOplSyntaxResult
     */
    errors?: Array<ParseError>;
}

/**
 * Check if a given object implements the CheckOplSyntaxResult interface.
 */
export function instanceOfCheckOplSyntaxResult(value: object): value is CheckOplSyntaxResult {
    return true;
}

export function CheckOplSyntaxResultFromJSON(json: any): CheckOplSyntaxResult {
    return CheckOplSyntaxResultFromJSONTyped(json, false);
}

export function CheckOplSyntaxResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): CheckOplSyntaxResult {
    if (json == null) {
        return json;
    }
    return {
        
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(ParseErrorFromJSON)),
    };
}

export function CheckOplSyntaxResultToJSON(value?: CheckOplSyntaxResult | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(ParseErrorToJSON)),
    };
}

