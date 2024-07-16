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
import type { Project } from './Project';
import {
    ProjectFromJSON,
    ProjectFromJSONTyped,
    ProjectToJSON,
} from './Project';
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * 
 * @export
 * @interface SuccessfulProjectUpdate
 */
export interface SuccessfulProjectUpdate {
    /**
     * 
     * @type {Project}
     * @memberof SuccessfulProjectUpdate
     */
    project: Project;
    /**
     * Import Warnings
     * 
     * Not all configuration items can be imported to the Ory Network. For example,
     * setting the port does not make sense because the Ory Network provides the runtime
     * and networking.
     * 
     * This field contains warnings where configuration keys were found but can not
     * be imported. These keys will be ignored by the Ory Network. This field will help
     * you understand why certain configuration keys might not be respected!
     * @type {Array<Warning>}
     * @memberof SuccessfulProjectUpdate
     */
    warnings: Array<Warning>;
}

/**
 * Check if a given object implements the SuccessfulProjectUpdate interface.
 */
export function instanceOfSuccessfulProjectUpdate(value: object): value is SuccessfulProjectUpdate {
    if (!('project' in value) || value['project'] === undefined) return false;
    if (!('warnings' in value) || value['warnings'] === undefined) return false;
    return true;
}

export function SuccessfulProjectUpdateFromJSON(json: any): SuccessfulProjectUpdate {
    return SuccessfulProjectUpdateFromJSONTyped(json, false);
}

export function SuccessfulProjectUpdateFromJSONTyped(json: any, ignoreDiscriminator: boolean): SuccessfulProjectUpdate {
    if (json == null) {
        return json;
    }
    return {
        
        'project': ProjectFromJSON(json['project']),
        'warnings': ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function SuccessfulProjectUpdateToJSON(value?: SuccessfulProjectUpdate | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'project': ProjectToJSON(value['project']),
        'warnings': ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

