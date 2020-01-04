/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { OAuth2Client } from './oAuth2Client';
import { OpenIDConnectContext } from './openIDConnectContext';

export class LoginRequest {
    /**
    * Challenge is the identifier (\"login challenge\") of the login request. It is used to identify the session.
    */
    'challenge'?: string;
    'client'?: OAuth2Client;
    'oidcContext'?: OpenIDConnectContext;
    /**
    * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
    */
    'requestUrl'?: string;
    /**
    * RequestedScope contains the access token audience as requested by the OAuth 2.0 Client.
    */
    'requestedAccessTokenAudience'?: Array<string>;
    /**
    * RequestedScope contains the OAuth 2.0 Scope requested by the OAuth 2.0 Client.
    */
    'requestedScope'?: Array<string>;
    /**
    * SessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It\'s value can generally be used to associate consecutive login requests by a certain user.
    */
    'sessionId'?: string;
    /**
    * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you can skip asking the user to grant the requested scopes, and simply forward the user to the redirect URL.  This feature allows you to update / set session information.
    */
    'skip'?: boolean;
    /**
    * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client. If this value is set and `skip` is true, you MUST include this subject type when accepting the login request, or the request will fail.
    */
    'subject'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "challenge",
            "baseName": "challenge",
            "type": "string"
        },
        {
            "name": "client",
            "baseName": "client",
            "type": "OAuth2Client"
        },
        {
            "name": "oidcContext",
            "baseName": "oidc_context",
            "type": "OpenIDConnectContext"
        },
        {
            "name": "requestUrl",
            "baseName": "request_url",
            "type": "string"
        },
        {
            "name": "requestedAccessTokenAudience",
            "baseName": "requested_access_token_audience",
            "type": "Array<string>"
        },
        {
            "name": "requestedScope",
            "baseName": "requested_scope",
            "type": "Array<string>"
        },
        {
            "name": "sessionId",
            "baseName": "session_id",
            "type": "string"
        },
        {
            "name": "skip",
            "baseName": "skip",
            "type": "boolean"
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return LoginRequest.attributeTypeMap;
    }
}

