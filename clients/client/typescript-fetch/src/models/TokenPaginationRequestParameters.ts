/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.13
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * The `Link` HTTP header contains multiple links (`first`, `next`, `last`, `previous`) formatted as:
 * `<https://{project-slug}.projects.oryapis.com/admin/clients?page_size={limit}&page_token={offset}>; rel="{page}"`
 * 
 * For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
 * @export
 * @interface TokenPaginationRequestParameters
 */
export interface TokenPaginationRequestParameters {
    /**
     * Items per Page
     * 
     * This is the number of items per page to return.
     * For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
     * @type {number}
     * @memberof TokenPaginationRequestParameters
     */
    page_size?: number;
    /**
     * Next Page Token
     * 
     * The next page token.
     * For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
     * @type {string}
     * @memberof TokenPaginationRequestParameters
     */
    page_token?: string;
}

/**
 * Check if a given object implements the TokenPaginationRequestParameters interface.
 */
export function instanceOfTokenPaginationRequestParameters(value: object): value is TokenPaginationRequestParameters {
    return true;
}

export function TokenPaginationRequestParametersFromJSON(json: any): TokenPaginationRequestParameters {
    return TokenPaginationRequestParametersFromJSONTyped(json, false);
}

export function TokenPaginationRequestParametersFromJSONTyped(json: any, ignoreDiscriminator: boolean): TokenPaginationRequestParameters {
    if (json == null) {
        return json;
    }
    return {
        
        'page_size': json['page_size'] == null ? undefined : json['page_size'],
        'page_token': json['page_token'] == null ? undefined : json['page_token'],
    };
}

export function TokenPaginationRequestParametersToJSON(value?: TokenPaginationRequestParameters | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'page_size': value['page_size'],
        'page_token': value['page_token'],
    };
}

