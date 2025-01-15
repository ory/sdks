/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { JsonWebKey } from './JsonWebKey';
import {
    JsonWebKeyFromJSON,
    JsonWebKeyFromJSONTyped,
    JsonWebKeyToJSON,
} from './JsonWebKey';

/**
 * Trust OAuth2 JWT Bearer Grant Type Issuer Request Body
 * @export
 * @interface TrustOAuth2JwtGrantIssuer
 */
export interface TrustOAuth2JwtGrantIssuer {
    /**
     * The "allow_any_subject" indicates that the issuer is allowed to have any principal as the subject of the JWT.
     * @type {boolean}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    allow_any_subject?: boolean;
    /**
     * The "expires_at" indicates, when grant will expire, so we will reject assertion from "issuer" targeting "subject".
     * @type {Date}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    expires_at: Date;
    /**
     * The "issuer" identifies the principal that issued the JWT assertion (same as "iss" claim in JWT).
     * @type {string}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    issuer: string;
    /**
     * 
     * @type {JsonWebKey}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    jwk: JsonWebKey;
    /**
     * The "scope" contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])
     * @type {Array<string>}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    scope: Array<string>;
    /**
     * The "subject" identifies the principal that is the subject of the JWT.
     * @type {string}
     * @memberof TrustOAuth2JwtGrantIssuer
     */
    subject?: string;
}

/**
 * Check if a given object implements the TrustOAuth2JwtGrantIssuer interface.
 */
export function instanceOfTrustOAuth2JwtGrantIssuer(value: object): value is TrustOAuth2JwtGrantIssuer {
    if (!('expires_at' in value) || value['expires_at'] === undefined) return false;
    if (!('issuer' in value) || value['issuer'] === undefined) return false;
    if (!('jwk' in value) || value['jwk'] === undefined) return false;
    if (!('scope' in value) || value['scope'] === undefined) return false;
    return true;
}

export function TrustOAuth2JwtGrantIssuerFromJSON(json: any): TrustOAuth2JwtGrantIssuer {
    return TrustOAuth2JwtGrantIssuerFromJSONTyped(json, false);
}

export function TrustOAuth2JwtGrantIssuerFromJSONTyped(json: any, ignoreDiscriminator: boolean): TrustOAuth2JwtGrantIssuer {
    if (json == null) {
        return json;
    }
    return {
        
        'allow_any_subject': json['allow_any_subject'] == null ? undefined : json['allow_any_subject'],
        'expires_at': (new Date(json['expires_at'])),
        'issuer': json['issuer'],
        'jwk': JsonWebKeyFromJSON(json['jwk']),
        'scope': json['scope'],
        'subject': json['subject'] == null ? undefined : json['subject'],
    };
}

export function TrustOAuth2JwtGrantIssuerToJSON(value?: TrustOAuth2JwtGrantIssuer | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allow_any_subject': value['allow_any_subject'],
        'expires_at': ((value['expires_at']).toISOString()),
        'issuer': value['issuer'],
        'jwk': JsonWebKeyToJSON(value['jwk']),
        'scope': value['scope'],
        'subject': value['subject'],
    };
}

