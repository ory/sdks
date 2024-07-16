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


/**
 * The state represents the state of the recovery flow.
 * 
 * choose_method: ask the user to choose a method (e.g. recover account via email)
 * sent_email: the email has been sent to the user
 * passed_challenge: the request was successful and the recovery challenge was passed.
 * @export
 */
export const RecoveryFlowState = {
    ChooseMethod: 'choose_method',
    SentEmail: 'sent_email',
    PassedChallenge: 'passed_challenge'
} as const;
export type RecoveryFlowState = typeof RecoveryFlowState[keyof typeof RecoveryFlowState];


export function instanceOfRecoveryFlowState(value: any): boolean {
    for (const key in RecoveryFlowState) {
        if (Object.prototype.hasOwnProperty.call(RecoveryFlowState, key)) {
            if ((RecoveryFlowState as Record<string, RecoveryFlowState>)[key] === value) {
                return true;
            }
        }
    }
    return false;
}

export function RecoveryFlowStateFromJSON(json: any): RecoveryFlowState {
    return RecoveryFlowStateFromJSONTyped(json, false);
}

export function RecoveryFlowStateFromJSONTyped(json: any, ignoreDiscriminator: boolean): RecoveryFlowState {
    return json as RecoveryFlowState;
}

export function RecoveryFlowStateToJSON(value?: RecoveryFlowState | null): any {
    return value as any;
}

