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
import type { ProjectMetadata } from './ProjectMetadata';
import {
    ProjectMetadataFromJSON,
    ProjectMetadataFromJSONTyped,
    ProjectMetadataToJSON,
} from './ProjectMetadata';

/**
 * 
 * @export
 * @interface ListWorkspaceProjects
 */
export interface ListWorkspaceProjects {
    /**
     * 
     * @type {boolean}
     * @memberof ListWorkspaceProjects
     */
    has_next_page: boolean;
    /**
     * 
     * @type {string}
     * @memberof ListWorkspaceProjects
     */
    next_page: string;
    /**
     * 
     * @type {Array<ProjectMetadata>}
     * @memberof ListWorkspaceProjects
     */
    projects: Array<ProjectMetadata>;
}

/**
 * Check if a given object implements the ListWorkspaceProjects interface.
 */
export function instanceOfListWorkspaceProjects(value: object): value is ListWorkspaceProjects {
    if (!('has_next_page' in value) || value['has_next_page'] === undefined) return false;
    if (!('next_page' in value) || value['next_page'] === undefined) return false;
    if (!('projects' in value) || value['projects'] === undefined) return false;
    return true;
}

export function ListWorkspaceProjectsFromJSON(json: any): ListWorkspaceProjects {
    return ListWorkspaceProjectsFromJSONTyped(json, false);
}

export function ListWorkspaceProjectsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListWorkspaceProjects {
    if (json == null) {
        return json;
    }
    return {
        
        'has_next_page': json['has_next_page'],
        'next_page': json['next_page'],
        'projects': ((json['projects'] as Array<any>).map(ProjectMetadataFromJSON)),
    };
}

export function ListWorkspaceProjectsToJSON(value?: ListWorkspaceProjects | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'has_next_page': value['has_next_page'],
        'next_page': value['next_page'],
        'projects': ((value['projects'] as Array<any>).map(ProjectMetadataToJSON)),
    };
}

