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


import * as runtime from '../runtime';
import type {
  ErrorOAuth2,
  JsonWebKeySet,
} from '../models/index';
import {
    ErrorOAuth2FromJSON,
    ErrorOAuth2ToJSON,
    JsonWebKeySetFromJSON,
    JsonWebKeySetToJSON,
} from '../models/index';

/**
 * 
 */
export class WellknownApi extends runtime.BaseAPI {

    /**
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     * Discover Well-Known JSON Web Keys
     */
    async discoverJsonWebKeysRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<JsonWebKeySet>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/.well-known/jwks.json`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => JsonWebKeySetFromJSON(jsonValue));
    }

    /**
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     * Discover Well-Known JSON Web Keys
     */
    async discoverJsonWebKeys(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<JsonWebKeySet> {
        const response = await this.discoverJsonWebKeysRaw(initOverrides);
        return await response.value();
    }

}
