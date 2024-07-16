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
/**
 * 
 * @export
 * @interface UiText
 */
export interface UiText {
    /**
     * The message's context. Useful when customizing messages.
     * @type {object}
     * @memberof UiText
     */
    context?: object;
    /**
     * 
     * @type {number}
     * @memberof UiText
     */
    id: number;
    /**
     * The message text. Written in american english.
     * @type {string}
     * @memberof UiText
     */
    text: string;
    /**
     * The message type.
     * info Info
     * error Error
     * success Success
     * @type {string}
     * @memberof UiText
     */
    type: UiTextTypeEnum;
}


/**
 * @export
 */
export const UiTextTypeEnum = {
    Info: 'info',
    Error: 'error',
    Success: 'success'
} as const;
export type UiTextTypeEnum = typeof UiTextTypeEnum[keyof typeof UiTextTypeEnum];


/**
 * Check if a given object implements the UiText interface.
 */
export function instanceOfUiText(value: object): value is UiText {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('text' in value) || value['text'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function UiTextFromJSON(json: any): UiText {
    return UiTextFromJSONTyped(json, false);
}

export function UiTextFromJSONTyped(json: any, ignoreDiscriminator: boolean): UiText {
    if (json == null) {
        return json;
    }
    return {
        
        'context': json['context'] == null ? undefined : json['context'],
        'id': json['id'],
        'text': json['text'],
        'type': json['type'],
    };
}

export function UiTextToJSON(value?: UiText | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': value['context'],
        'id': value['id'],
        'text': value['text'],
        'type': value['type'],
    };
}

