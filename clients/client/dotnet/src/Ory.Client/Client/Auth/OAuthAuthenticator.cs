/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.0
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Threading.Tasks;
using Newtonsoft.Json;
using RestSharp;
using RestSharp.Authenticators;

namespace Ory.Client.Client.Auth
{
    /// <summary>
    /// An authenticator for OAuth2 authentication flows
    /// </summary>
    public class OAuthAuthenticator : AuthenticatorBase
    {
        readonly string _tokenUrl;
        readonly string _clientId;
        readonly string _clientSecret;
        readonly string? _scope;
        readonly string _grantType;
        readonly JsonSerializerSettings _serializerSettings;
        readonly IReadableConfiguration _configuration;

        /// <summary>
        /// Initialize the OAuth2 Authenticator
        /// </summary>
        public OAuthAuthenticator(
            string tokenUrl,
            string clientId,
            string clientSecret,
            string? scope,
            OAuthFlow? flow,
            JsonSerializerSettings serializerSettings,
            IReadableConfiguration configuration) : base("")
        {
            _tokenUrl = tokenUrl;
            _clientId = clientId;
            _clientSecret = clientSecret;
            _scope = scope;
            _serializerSettings = serializerSettings;
            _configuration = configuration;

            switch (flow)
            {
                /*case OAuthFlow.ACCESS_CODE:
                    _grantType = "authorization_code";
                    break;
                case OAuthFlow.IMPLICIT:
                    _grantType = "implicit";
                    break;
                case OAuthFlow.PASSWORD:
                    _grantType = "password";
                    break;*/
                case OAuthFlow.APPLICATION:
                    _grantType = "client_credentials";
                    break;
                default:
                    break;
            }
        }

        /// <summary>
        /// Creates an authentication parameter from an access token.
        /// </summary>
        /// <param name="accessToken">Access token to create a parameter from.</param>
        /// <returns>An authentication parameter.</returns>
        protected override async ValueTask<Parameter> GetAuthenticationParameter(string accessToken)
        {
            var token = string.IsNullOrEmpty(Token) ? await GetToken().ConfigureAwait(false) : Token;
            return new HeaderParameter(KnownHeaders.Authorization, token);
        }

        /// <summary>
        /// Gets the token from the OAuth2 server.
        /// </summary>
        /// <returns>An authentication token.</returns>
        async Task<string> GetToken()
        {
            var client = new RestClient(_tokenUrl,
                configureSerialization: serializerConfig => serializerConfig.UseSerializer(() => new CustomJsonCodec(_serializerSettings, _configuration)));

            var request = new RestRequest()
                .AddParameter("grant_type", _grantType)
                .AddParameter("client_id", _clientId)
                .AddParameter("client_secret", _clientSecret);

            if (!string.IsNullOrEmpty(_scope))
            {
                request.AddParameter("scope", _scope);
            }

            var response = await client.PostAsync<TokenResponse>(request).ConfigureAwait(false);
            
            // RFC6749 - token_type is case insensitive.
            // RFC6750 - In Authorization header Bearer should be capitalized.
            // Fix the capitalization irrespective of token_type casing.
            switch (response.TokenType?.ToLower())
            {
                case "bearer":
                    return $"Bearer {response.AccessToken}";
                default:
                    return $"{response.TokenType} {response.AccessToken}";
            }
        }
    }
}
