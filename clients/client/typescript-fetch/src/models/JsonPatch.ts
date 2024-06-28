/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * A JSONPatch document as defined by RFC 6902
 * @export
 * @interface JsonPatch
 */
export interface JsonPatch {
    /**
     * This field is used together with operation "move" and uses JSON Pointer notation.
     * 
     * Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
     * @type {string}
     * @memberof JsonPatch
     */
    from?: string;
    /**
     * The operation to be performed. One of "add", "remove", "replace", "move", "copy", or "test".
     * @type {string}
     * @memberof JsonPatch
     */
    op: JsonPatchOpEnum;
    /**
     * The path to the target path. Uses JSON pointer notation.
     * 
     * Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
     * @type {string}
     * @memberof JsonPatch
     */
    path: string;
    /**
     * The value to be used within the operations.
     * 
     * Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
     * @type {any}
     * @memberof JsonPatch
     */
    value?: any;
}


/**
 * @export
 */
export const JsonPatchOpEnum = {
    Add: 'add',
    Remove: 'remove',
    Replace: 'replace',
    Move: 'move',
    Copy: 'copy',
    Test: 'test'
} as const;
export type JsonPatchOpEnum = typeof JsonPatchOpEnum[keyof typeof JsonPatchOpEnum];


/**
 * Check if a given object implements the JsonPatch interface.
 */
export function instanceOfJsonPatch(value: object): boolean {
    if (!('op' in value)) return false;
    if (!('path' in value)) return false;
    return true;
}

export function JsonPatchFromJSON(json: any): JsonPatch {
    return JsonPatchFromJSONTyped(json, false);
}

export function JsonPatchFromJSONTyped(json: any, ignoreDiscriminator: boolean): JsonPatch {
    if (json == null) {
        return json;
    }
    return {
        
        'from': json['from'] == null ? undefined : json['from'],
        'op': json['op'],
        'path': json['path'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function JsonPatchToJSON(value?: JsonPatch | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'from': value['from'],
        'op': value['op'],
        'path': value['path'],
        'value': value['value'],
    };
}

