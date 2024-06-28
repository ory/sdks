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
 * 
 * @export
 * @interface SubjectSet
 */
export interface SubjectSet {
    /**
     * Namespace of the Subject Set
     * @type {string}
     * @memberof SubjectSet
     */
    namespace: string;
    /**
     * Object of the Subject Set
     * @type {string}
     * @memberof SubjectSet
     */
    object: string;
    /**
     * Relation of the Subject Set
     * @type {string}
     * @memberof SubjectSet
     */
    relation: string;
}

/**
 * Check if a given object implements the SubjectSet interface.
 */
export function instanceOfSubjectSet(value: object): boolean {
    if (!('namespace' in value)) return false;
    if (!('object' in value)) return false;
    if (!('relation' in value)) return false;
    return true;
}

export function SubjectSetFromJSON(json: any): SubjectSet {
    return SubjectSetFromJSONTyped(json, false);
}

export function SubjectSetFromJSONTyped(json: any, ignoreDiscriminator: boolean): SubjectSet {
    if (json == null) {
        return json;
    }
    return {
        
        'namespace': json['namespace'],
        'object': json['object'],
        'relation': json['relation'],
    };
}

export function SubjectSetToJSON(value?: SubjectSet | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'namespace': value['namespace'],
        'object': value['object'],
        'relation': value['relation'],
    };
}

