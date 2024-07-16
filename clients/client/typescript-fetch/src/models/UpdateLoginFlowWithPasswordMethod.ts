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
 * Update Login Flow with Password Method
 * @export
 * @interface UpdateLoginFlowWithPasswordMethod
 */
export interface UpdateLoginFlowWithPasswordMethod {
    /**
     * Sending the anti-csrf token is only required for browser login flows.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    csrf_token?: string;
    /**
     * Identifier is the email or username of the user trying to log in.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    identifier: string;
    /**
     * Method should be set to "password" when logging in using the identifier and password strategy.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    method: string;
    /**
     * The user's password.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    password: string;
    /**
     * Identifier is the email or username of the user trying to log in.
     * This field is deprecated!
     * @type {string}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    password_identifier?: string;
    /**
     * Transient data to pass along to any webhooks
     * @type {object}
     * @memberof UpdateLoginFlowWithPasswordMethod
     */
    transient_payload?: object;
}

/**
 * Check if a given object implements the UpdateLoginFlowWithPasswordMethod interface.
 */
export function instanceOfUpdateLoginFlowWithPasswordMethod(value: object): value is UpdateLoginFlowWithPasswordMethod {
    if (!('identifier' in value) || value['identifier'] === undefined) return false;
    if (!('method' in value) || value['method'] === undefined) return false;
    if (!('password' in value) || value['password'] === undefined) return false;
    return true;
}

export function UpdateLoginFlowWithPasswordMethodFromJSON(json: any): UpdateLoginFlowWithPasswordMethod {
    return UpdateLoginFlowWithPasswordMethodFromJSONTyped(json, false);
}

export function UpdateLoginFlowWithPasswordMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateLoginFlowWithPasswordMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'csrf_token': json['csrf_token'] == null ? undefined : json['csrf_token'],
        'identifier': json['identifier'],
        'method': json['method'],
        'password': json['password'],
        'password_identifier': json['password_identifier'] == null ? undefined : json['password_identifier'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
    };
}

export function UpdateLoginFlowWithPasswordMethodToJSON(value?: UpdateLoginFlowWithPasswordMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'csrf_token': value['csrf_token'],
        'identifier': value['identifier'],
        'method': value['method'],
        'password': value['password'],
        'password_identifier': value['password_identifier'],
        'transient_payload': value['transient_payload'],
    };
}

