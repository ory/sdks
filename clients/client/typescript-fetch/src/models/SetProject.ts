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
import type { ProjectCors } from './ProjectCors';
import {
    ProjectCorsFromJSON,
    ProjectCorsFromJSONTyped,
    ProjectCorsToJSON,
} from './ProjectCors';
import type { ProjectServices } from './ProjectServices';
import {
    ProjectServicesFromJSON,
    ProjectServicesFromJSONTyped,
    ProjectServicesToJSON,
} from './ProjectServices';

/**
 * 
 * @export
 * @interface SetProject
 */
export interface SetProject {
    /**
     * 
     * @type {ProjectCors}
     * @memberof SetProject
     */
    cors_admin: ProjectCors;
    /**
     * 
     * @type {ProjectCors}
     * @memberof SetProject
     */
    cors_public: ProjectCors;
    /**
     * The name of the project.
     * @type {string}
     * @memberof SetProject
     */
    name: string;
    /**
     * 
     * @type {ProjectServices}
     * @memberof SetProject
     */
    services: ProjectServices;
}

/**
 * Check if a given object implements the SetProject interface.
 */
export function instanceOfSetProject(value: object): boolean {
    if (!('cors_admin' in value)) return false;
    if (!('cors_public' in value)) return false;
    if (!('name' in value)) return false;
    if (!('services' in value)) return false;
    return true;
}

export function SetProjectFromJSON(json: any): SetProject {
    return SetProjectFromJSONTyped(json, false);
}

export function SetProjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): SetProject {
    if (json == null) {
        return json;
    }
    return {
        
        'cors_admin': ProjectCorsFromJSON(json['cors_admin']),
        'cors_public': ProjectCorsFromJSON(json['cors_public']),
        'name': json['name'],
        'services': ProjectServicesFromJSON(json['services']),
    };
}

export function SetProjectToJSON(value?: SetProject | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cors_admin': ProjectCorsToJSON(value['cors_admin']),
        'cors_public': ProjectCorsToJSON(value['cors_public']),
        'name': value['name'],
        'services': ProjectServicesToJSON(value['services']),
    };
}

