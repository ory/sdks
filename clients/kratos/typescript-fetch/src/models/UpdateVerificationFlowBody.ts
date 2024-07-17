/* tslint:disable */
/* eslint-disable */
/**
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.1
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { UpdateVerificationFlowWithCodeMethod } from './UpdateVerificationFlowWithCodeMethod';
import {
    instanceOfUpdateVerificationFlowWithCodeMethod,
    UpdateVerificationFlowWithCodeMethodFromJSON,
    UpdateVerificationFlowWithCodeMethodFromJSONTyped,
    UpdateVerificationFlowWithCodeMethodToJSON,
} from './UpdateVerificationFlowWithCodeMethod';
import type { UpdateVerificationFlowWithLinkMethod } from './UpdateVerificationFlowWithLinkMethod';
import {
    instanceOfUpdateVerificationFlowWithLinkMethod,
    UpdateVerificationFlowWithLinkMethodFromJSON,
    UpdateVerificationFlowWithLinkMethodFromJSONTyped,
    UpdateVerificationFlowWithLinkMethodToJSON,
} from './UpdateVerificationFlowWithLinkMethod';

/**
 * @type UpdateVerificationFlowBody
 * Update Verification Flow Request Body
 * @export
 */
export type UpdateVerificationFlowBody = { method: 'code' } & UpdateVerificationFlowWithCodeMethod | { method: 'link' } & UpdateVerificationFlowWithLinkMethod;

export function UpdateVerificationFlowBodyFromJSON(json: any): UpdateVerificationFlowBody {
    return UpdateVerificationFlowBodyFromJSONTyped(json, false);
}

export function UpdateVerificationFlowBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateVerificationFlowBody {
    if (json == null) {
        return json;
    }
    switch (json['method']) {
        case 'code':
            return Object.assign({}, UpdateVerificationFlowWithCodeMethodFromJSONTyped(json, true), { method: 'code' } as const);
        case 'link':
            return Object.assign({}, UpdateVerificationFlowWithLinkMethodFromJSONTyped(json, true), { method: 'link' } as const);
        default:
            throw new Error(`No variant of UpdateVerificationFlowBody exists with 'method=${json['method']}'`);
    }
}

export function UpdateVerificationFlowBodyToJSON(value?: UpdateVerificationFlowBody | null): any {
    if (value == null) {
        return value;
    }
    switch (value['method']) {
        case 'code':
            return UpdateVerificationFlowWithCodeMethodToJSON(value);
        case 'link':
            return UpdateVerificationFlowWithLinkMethodToJSON(value);
        default:
            throw new Error(`No variant of UpdateVerificationFlowBody exists with 'method=${value['method']}'`);
    }

}

