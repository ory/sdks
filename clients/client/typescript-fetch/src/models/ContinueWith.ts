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

import type { ContinueWithRecoveryUi } from './ContinueWithRecoveryUi';
import {
    instanceOfContinueWithRecoveryUi,
    ContinueWithRecoveryUiFromJSON,
    ContinueWithRecoveryUiFromJSONTyped,
    ContinueWithRecoveryUiToJSON,
} from './ContinueWithRecoveryUi';
import type { ContinueWithRedirectBrowserTo } from './ContinueWithRedirectBrowserTo';
import {
    instanceOfContinueWithRedirectBrowserTo,
    ContinueWithRedirectBrowserToFromJSON,
    ContinueWithRedirectBrowserToFromJSONTyped,
    ContinueWithRedirectBrowserToToJSON,
} from './ContinueWithRedirectBrowserTo';
import type { ContinueWithSetOrySessionToken } from './ContinueWithSetOrySessionToken';
import {
    instanceOfContinueWithSetOrySessionToken,
    ContinueWithSetOrySessionTokenFromJSON,
    ContinueWithSetOrySessionTokenFromJSONTyped,
    ContinueWithSetOrySessionTokenToJSON,
} from './ContinueWithSetOrySessionToken';
import type { ContinueWithSettingsUi } from './ContinueWithSettingsUi';
import {
    instanceOfContinueWithSettingsUi,
    ContinueWithSettingsUiFromJSON,
    ContinueWithSettingsUiFromJSONTyped,
    ContinueWithSettingsUiToJSON,
} from './ContinueWithSettingsUi';
import type { ContinueWithVerificationUi } from './ContinueWithVerificationUi';
import {
    instanceOfContinueWithVerificationUi,
    ContinueWithVerificationUiFromJSON,
    ContinueWithVerificationUiFromJSONTyped,
    ContinueWithVerificationUiToJSON,
} from './ContinueWithVerificationUi';

/**
 * @type ContinueWith
 * 
 * @export
 */
export type ContinueWith = { action: 'redirect_browser_to' } & ContinueWithRedirectBrowserTo | { action: 'set_ory_session_token' } & ContinueWithSetOrySessionToken | { action: 'show_recovery_ui' } & ContinueWithRecoveryUi | { action: 'show_settings_ui' } & ContinueWithSettingsUi | { action: 'show_verification_ui' } & ContinueWithVerificationUi;

export function ContinueWithFromJSON(json: any): ContinueWith {
    return ContinueWithFromJSONTyped(json, false);
}

export function ContinueWithFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContinueWith {
    if (json == null) {
        return json;
    }
    switch (json['action']) {
        case 'redirect_browser_to':
            return Object.assign({}, ContinueWithRedirectBrowserToFromJSONTyped(json, true), { action: 'redirect_browser_to' } as const);
        case 'set_ory_session_token':
            return Object.assign({}, ContinueWithSetOrySessionTokenFromJSONTyped(json, true), { action: 'set_ory_session_token' } as const);
        case 'show_recovery_ui':
            return Object.assign({}, ContinueWithRecoveryUiFromJSONTyped(json, true), { action: 'show_recovery_ui' } as const);
        case 'show_settings_ui':
            return Object.assign({}, ContinueWithSettingsUiFromJSONTyped(json, true), { action: 'show_settings_ui' } as const);
        case 'show_verification_ui':
            return Object.assign({}, ContinueWithVerificationUiFromJSONTyped(json, true), { action: 'show_verification_ui' } as const);
        default:
            throw new Error(`No variant of ContinueWith exists with 'action=${json['action']}'`);
    }
}

export function ContinueWithToJSON(value?: ContinueWith | null): any {
    if (value == null) {
        return value;
    }
    switch (value['action']) {
        case 'redirect_browser_to':
            return ContinueWithRedirectBrowserToToJSON(value);
        case 'set_ory_session_token':
            return ContinueWithSetOrySessionTokenToJSON(value);
        case 'show_recovery_ui':
            return ContinueWithRecoveryUiToJSON(value);
        case 'show_settings_ui':
            return ContinueWithSettingsUiToJSON(value);
        case 'show_verification_ui':
            return ContinueWithVerificationUiToJSON(value);
        default:
            throw new Error(`No variant of ContinueWith exists with 'action=${value['action']}'`);
    }

}

