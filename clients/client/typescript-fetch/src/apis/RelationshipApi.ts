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


import * as runtime from '../runtime';
import type {
  CheckOplSyntaxResult,
  CreateRelationshipBody,
  ErrorGeneric,
  Relationship,
  RelationshipNamespaces,
  RelationshipPatch,
  Relationships,
} from '../models/index';
import {
    CheckOplSyntaxResultFromJSON,
    CheckOplSyntaxResultToJSON,
    CreateRelationshipBodyFromJSON,
    CreateRelationshipBodyToJSON,
    ErrorGenericFromJSON,
    ErrorGenericToJSON,
    RelationshipFromJSON,
    RelationshipToJSON,
    RelationshipNamespacesFromJSON,
    RelationshipNamespacesToJSON,
    RelationshipPatchFromJSON,
    RelationshipPatchToJSON,
    RelationshipsFromJSON,
    RelationshipsToJSON,
} from '../models/index';

export interface CheckOplSyntaxRequest {
    body?: string;
}

export interface CreateRelationshipRequest {
    createRelationshipBody?: CreateRelationshipBody;
}

export interface DeleteRelationshipsRequest {
    namespace?: string;
    object?: string;
    relation?: string;
    subjectId?: string;
    subjectSetNamespace?: string;
    subjectSetObject?: string;
    subjectSetRelation?: string;
}

export interface GetRelationshipsRequest {
    pageToken?: string;
    pageSize?: number;
    namespace?: string;
    object?: string;
    relation?: string;
    subjectId?: string;
    subjectSetNamespace?: string;
    subjectSetObject?: string;
    subjectSetRelation?: string;
}

export interface PatchRelationshipsRequest {
    relationshipPatch?: Array<RelationshipPatch>;
}

/**
 * 
 */
export class RelationshipApi extends runtime.BaseAPI {

    /**
     * The OPL file is expected in the body of the request.
     * Check the syntax of an OPL file
     */
    async checkOplSyntaxRaw(requestParameters: CheckOplSyntaxRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CheckOplSyntaxResult>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'text/plain';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/opl/syntax/check`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters['body'] as any,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CheckOplSyntaxResultFromJSON(jsonValue));
    }

    /**
     * The OPL file is expected in the body of the request.
     * Check the syntax of an OPL file
     */
    async checkOplSyntax(requestParameters: CheckOplSyntaxRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CheckOplSyntaxResult> {
        const response = await this.checkOplSyntaxRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Use this endpoint to create a relationship.
     * Create a Relationship
     */
    async createRelationshipRaw(requestParameters: CreateRelationshipRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Relationship>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/admin/relation-tuples`,
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: CreateRelationshipBodyToJSON(requestParameters['createRelationshipBody']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RelationshipFromJSON(jsonValue));
    }

    /**
     * Use this endpoint to create a relationship.
     * Create a Relationship
     */
    async createRelationship(requestParameters: CreateRelationshipRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Relationship> {
        const response = await this.createRelationshipRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Use this endpoint to delete relationships
     * Delete Relationships
     */
    async deleteRelationshipsRaw(requestParameters: DeleteRelationshipsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        const queryParameters: any = {};

        if (requestParameters['namespace'] != null) {
            queryParameters['namespace'] = requestParameters['namespace'];
        }

        if (requestParameters['object'] != null) {
            queryParameters['object'] = requestParameters['object'];
        }

        if (requestParameters['relation'] != null) {
            queryParameters['relation'] = requestParameters['relation'];
        }

        if (requestParameters['subjectId'] != null) {
            queryParameters['subject_id'] = requestParameters['subjectId'];
        }

        if (requestParameters['subjectSetNamespace'] != null) {
            queryParameters['subject_set.namespace'] = requestParameters['subjectSetNamespace'];
        }

        if (requestParameters['subjectSetObject'] != null) {
            queryParameters['subject_set.object'] = requestParameters['subjectSetObject'];
        }

        if (requestParameters['subjectSetRelation'] != null) {
            queryParameters['subject_set.relation'] = requestParameters['subjectSetRelation'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/admin/relation-tuples`,
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Use this endpoint to delete relationships
     * Delete Relationships
     */
    async deleteRelationships(requestParameters: DeleteRelationshipsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteRelationshipsRaw(requestParameters, initOverrides);
    }

    /**
     * Get all relationships that match the query. Only the namespace field is required.
     * Query relationships
     */
    async getRelationshipsRaw(requestParameters: GetRelationshipsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Relationships>> {
        const queryParameters: any = {};

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['namespace'] != null) {
            queryParameters['namespace'] = requestParameters['namespace'];
        }

        if (requestParameters['object'] != null) {
            queryParameters['object'] = requestParameters['object'];
        }

        if (requestParameters['relation'] != null) {
            queryParameters['relation'] = requestParameters['relation'];
        }

        if (requestParameters['subjectId'] != null) {
            queryParameters['subject_id'] = requestParameters['subjectId'];
        }

        if (requestParameters['subjectSetNamespace'] != null) {
            queryParameters['subject_set.namespace'] = requestParameters['subjectSetNamespace'];
        }

        if (requestParameters['subjectSetObject'] != null) {
            queryParameters['subject_set.object'] = requestParameters['subjectSetObject'];
        }

        if (requestParameters['subjectSetRelation'] != null) {
            queryParameters['subject_set.relation'] = requestParameters['subjectSetRelation'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/relation-tuples`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RelationshipsFromJSON(jsonValue));
    }

    /**
     * Get all relationships that match the query. Only the namespace field is required.
     * Query relationships
     */
    async getRelationships(requestParameters: GetRelationshipsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Relationships> {
        const response = await this.getRelationshipsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all namespaces
     * Query namespaces
     */
    async listRelationshipNamespacesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<RelationshipNamespaces>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/namespaces`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RelationshipNamespacesFromJSON(jsonValue));
    }

    /**
     * Get all namespaces
     * Query namespaces
     */
    async listRelationshipNamespaces(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<RelationshipNamespaces> {
        const response = await this.listRelationshipNamespacesRaw(initOverrides);
        return await response.value();
    }

    /**
     * Use this endpoint to patch one or more relationships.
     * Patch Multiple Relationships
     */
    async patchRelationshipsRaw(requestParameters: PatchRelationshipsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("oryAccessToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/admin/relation-tuples`,
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters['relationshipPatch']!.map(RelationshipPatchToJSON),
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Use this endpoint to patch one or more relationships.
     * Patch Multiple Relationships
     */
    async patchRelationships(requestParameters: PatchRelationshipsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.patchRelationshipsRaw(requestParameters, initOverrides);
    }

}
