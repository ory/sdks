/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32+1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* https://tools.ietf.org/html/rfc7662
*/
export class OAuth2TokenIntrospection {
    /**
    * Active is a boolean indicator of whether or not the presented token is currently active.  The specifics of a token\'s \"active\" state will vary depending on the implementation of the authorization server and the information it keeps about its tokens, but a \"true\" value return for the \"active\" property will generally indicate that a given token has been issued by this authorization server, has not been revoked by the resource owner, and is within its given time window of validity (e.g., after its issuance time and before its expiration time).
    */
    'active': boolean;
    /**
    * Audience contains a list of the token\'s intended audiences.
    */
    'aud'?: Array<string>;
    /**
    * ClientID is aclient identifier for the OAuth 2.0 client that requested this token.
    */
    'clientId'?: string;
    /**
    * Expires at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.
    */
    'exp'?: number;
    /**
    * Extra is arbitrary data set by the session.
    */
    'ext'?: { [key: string]: object; };
    /**
    * Issued at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.
    */
    'iat'?: number;
    /**
    * IssuerURL is a string representing the issuer of this token
    */
    'iss'?: string;
    /**
    * NotBefore is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token is not to be used before.
    */
    'nbf'?: number;
    /**
    * ObfuscatedSubject is set when the subject identifier algorithm was set to \"pairwise\" during authorization. It is the `sub` value of the ID Token that was issued.
    */
    'obfuscatedSubject'?: string;
    /**
    * Scope is a JSON string containing a space-separated list of scopes associated with this token.
    */
    'scope'?: string;
    /**
    * Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the resource owner who authorized this token.
    */
    'sub'?: string;
    /**
    * TokenType is the introspected token\'s type, for example `access_token` or `refresh_token`.
    */
    'tokenType'?: string;
    /**
    * Username is a human-readable identifier for the resource owner who authorized this token.
    */
    'username'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "active",
            "baseName": "active",
            "type": "boolean"
        },
        {
            "name": "aud",
            "baseName": "aud",
            "type": "Array<string>"
        },
        {
            "name": "clientId",
            "baseName": "client_id",
            "type": "string"
        },
        {
            "name": "exp",
            "baseName": "exp",
            "type": "number"
        },
        {
            "name": "ext",
            "baseName": "ext",
            "type": "{ [key: string]: object; }"
        },
        {
            "name": "iat",
            "baseName": "iat",
            "type": "number"
        },
        {
            "name": "iss",
            "baseName": "iss",
            "type": "string"
        },
        {
            "name": "nbf",
            "baseName": "nbf",
            "type": "number"
        },
        {
            "name": "obfuscatedSubject",
            "baseName": "obfuscated_subject",
            "type": "string"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "string"
        },
        {
            "name": "sub",
            "baseName": "sub",
            "type": "string"
        },
        {
            "name": "tokenType",
            "baseName": "token_type",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OAuth2TokenIntrospection.attributeTypeMap;
    }
}

