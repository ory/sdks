/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.16
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * Update Settings Flow with TOTP Method
 * @export
 * @interface UpdateSettingsFlowWithTotpMethod
 */
export interface UpdateSettingsFlowWithTotpMethod {
    /**
     * CSRFToken is the anti-CSRF token
     * @type {string}
     * @memberof UpdateSettingsFlowWithTotpMethod
     */
    csrf_token?: string;
    /**
     * Method
     * 
     * Should be set to "totp" when trying to add, update, or remove a totp pairing.
     * @type {string}
     * @memberof UpdateSettingsFlowWithTotpMethod
     */
    method: string;
    /**
     * ValidationTOTP must contain a valid TOTP based on the
     * @type {string}
     * @memberof UpdateSettingsFlowWithTotpMethod
     */
    totp_code?: string;
    /**
     * UnlinkTOTP if true will remove the TOTP pairing,
     * effectively removing the credential. This can be used
     * to set up a new TOTP device.
     * @type {boolean}
     * @memberof UpdateSettingsFlowWithTotpMethod
     */
    totp_unlink?: boolean;
    /**
     * Transient data to pass along to any webhooks
     * @type {object}
     * @memberof UpdateSettingsFlowWithTotpMethod
     */
    transient_payload?: object;
}

/**
 * Check if a given object implements the UpdateSettingsFlowWithTotpMethod interface.
 */
export function instanceOfUpdateSettingsFlowWithTotpMethod(value: object): value is UpdateSettingsFlowWithTotpMethod {
    if (!('method' in value) || value['method'] === undefined) return false;
    return true;
}

export function UpdateSettingsFlowWithTotpMethodFromJSON(json: any): UpdateSettingsFlowWithTotpMethod {
    return UpdateSettingsFlowWithTotpMethodFromJSONTyped(json, false);
}

export function UpdateSettingsFlowWithTotpMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateSettingsFlowWithTotpMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'csrf_token': json['csrf_token'] == null ? undefined : json['csrf_token'],
        'method': json['method'],
        'totp_code': json['totp_code'] == null ? undefined : json['totp_code'],
        'totp_unlink': json['totp_unlink'] == null ? undefined : json['totp_unlink'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
    };
}

export function UpdateSettingsFlowWithTotpMethodToJSON(value?: UpdateSettingsFlowWithTotpMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'csrf_token': value['csrf_token'],
        'method': value['method'],
        'totp_code': value['totp_code'],
        'totp_unlink': value['totp_unlink'],
        'transient_payload': value['transient_payload'],
    };
}

