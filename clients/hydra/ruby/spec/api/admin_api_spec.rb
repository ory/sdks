=begin
#ORY Hydra

#Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.

The version of the OpenAPI document: v0.0.0-alpha.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'spec_helper'
require 'json'

# Unit tests for OryHydraClient::AdminApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AdminApi' do
  before do
    # run before each test
    @api_instance = OryHydraClient::AdminApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AdminApi' do
    it 'should create an instance of AdminApi' do
      expect(@api_instance).to be_instance_of(OryHydraClient::AdminApi)
    end
  end

  # unit tests for accept_consent_request
  # Accept an consent request
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.  This endpoint tells ORY Hydra that the subject has authorized the OAuth 2.0 client to access resources on his/her behalf. The consent provider includes additional information, such as session data for access and ID tokens, and if the consent request should be used as basis for future requests.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
  # @param consent_challenge 
  # @param [Hash] opts the optional parameters
  # @option opts [AcceptConsentRequest] :body 
  # @return [CompletedRequest]
  describe 'accept_consent_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for accept_login_request
  # Accept an login request
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.  This endpoint tells ORY Hydra that the subject has successfully authenticated and includes additional information such as the subject&#39;s ID and if ORY Hydra should remember the subject&#39;s subject agent for future authentication attempts by setting a cookie.  The response contains a redirect URL which the login provider should redirect the user-agent to.
  # @param login_challenge 
  # @param [Hash] opts the optional parameters
  # @option opts [AcceptLoginRequest] :body 
  # @return [CompletedRequest]
  describe 'accept_login_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for accept_logout_request
  # Accept a logout request
  # When a user or an application requests ORY Hydra to log out a user, this endpoint is used to confirm that logout request. No body is required.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
  # @param logout_challenge 
  # @param [Hash] opts the optional parameters
  # @return [CompletedRequest]
  describe 'accept_logout_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_json_web_key_set
  # Generate a new JSON Web Key
  # This endpoint is capable of generating JSON Web Key Sets for you. There a different strategies available, such as symmetric cryptographic keys (HS256, HS512) and asymetric cryptographic keys (RS256, ECDSA). If the specified JSON Web Key Set does not exist, it will be created.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @option opts [JsonWebKeySetGeneratorRequest] :body 
  # @return [JSONWebKeySet]
  describe 'create_json_web_key_set test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_o_auth2_client
  # Create an OAuth 2.0 client
  # Create a new OAuth 2.0 client If you pass &#x60;client_secret&#x60; the secret will be used, otherwise a random secret will be generated. The secret will be returned in the response and you will not be able to retrieve it later on. Write the secret down and keep it somwhere safe.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
  # @param body 
  # @param [Hash] opts the optional parameters
  # @return [OAuth2Client]
  describe 'create_o_auth2_client test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_json_web_key
  # Delete a JSON Web Key
  # Use this endpoint to delete a single JSON Web Key.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param kid The kid of the desired key
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_json_web_key test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_json_web_key_set
  # Delete a JSON Web Key Set
  # Use this endpoint to delete a complete JSON Web Key Set and all the keys in that set.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_json_web_key_set test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_o_auth2_client
  # Deletes an OAuth 2.0 Client
  # Delete an existing OAuth 2.0 Client by its ID.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
  # @param id The id of the OAuth 2.0 Client.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_o_auth2_client test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for flush_inactive_o_auth2_tokens
  # Flush Expired OAuth2 Access Tokens
  # This endpoint flushes expired OAuth2 access tokens from the database. You can set a time after which no tokens will be not be touched, in case you want to keep recent tokens for auditing. Refresh tokens can not be flushed as they are deleted automatically when performing the refresh flow.
  # @param [Hash] opts the optional parameters
  # @option opts [FlushInactiveOAuth2TokensRequest] :body 
  # @return [nil]
  describe 'flush_inactive_o_auth2_tokens test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_consent_request
  # Get consent request information
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.
  # @param consent_challenge 
  # @param [Hash] opts the optional parameters
  # @return [ConsentRequest]
  describe 'get_consent_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_json_web_key
  # Fetch a JSON Web Key
  # This endpoint returns a singular JSON Web Key, identified by the set and the specific key ID (kid).
  # @param kid The kid of the desired key
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @return [JSONWebKeySet]
  describe 'get_json_web_key test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_json_web_key_set
  # Retrieve a JSON Web Key Set
  # This endpoint can be used to retrieve JWK Sets stored in ORY Hydra.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @return [JSONWebKeySet]
  describe 'get_json_web_key_set test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_login_request
  # Get an login request
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.
  # @param login_challenge 
  # @param [Hash] opts the optional parameters
  # @return [LoginRequest]
  describe 'get_login_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_logout_request
  # Get a logout request
  # Use this endpoint to fetch a logout request.
  # @param logout_challenge 
  # @param [Hash] opts the optional parameters
  # @return [LogoutRequest]
  describe 'get_logout_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_o_auth2_client
  # Get an OAuth 2.0 Client.
  # Get an OAUth 2.0 client by its ID. This endpoint never returns passwords.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
  # @param id The id of the OAuth 2.0 Client.
  # @param [Hash] opts the optional parameters
  # @return [OAuth2Client]
  describe 'get_o_auth2_client test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_version
  # Get service version
  # This endpoint returns the service version typically notated using semantic versioning.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [Version]
  describe 'get_version test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for introspect_o_auth2_token
  # Introspect OAuth2 tokens
  # The introspection endpoint allows to check if a token (both refresh and access) is active or not. An active token is neither expired nor revoked. If a token is active, additional information on the token will be included. You can set additional data for a token by setting &#x60;accessTokenExtra&#x60; during the consent flow.  For more information [read this blog post](https://www.oauth.com/oauth2-servers/token-introspection-endpoint/).
  # @param token The string value of the token. For access tokens, this is the \\\&quot;access_token\\\&quot; value returned from the token endpoint defined in OAuth 2.0. For refresh tokens, this is the \\\&quot;refresh_token\\\&quot; value returned.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :scope An optional, space separated list of required scopes. If the access token was not granted one of the scopes, the result of active will be false.
  # @return [OAuth2TokenIntrospection]
  describe 'introspect_o_auth2_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for is_instance_alive
  # Check alive status
  # This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [HealthStatus]
  describe 'is_instance_alive test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_o_auth2_clients
  # List OAuth 2.0 Clients
  # This endpoint lists all clients in the database, and never returns client secrets.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components. The \&quot;Link\&quot; header is also included in successful responses, which contains one or more links for pagination, formatted like so: &#39;&lt;https://hydra-url/admin/clients?limit&#x3D;{limit}&amp;offset&#x3D;{offset}&gt;; rel&#x3D;\&quot;{page}\&quot;&#39;, where page is one of the following applicable pages: &#39;first&#39;, &#39;next&#39;, &#39;last&#39;, and &#39;previous&#39;. Multiple links can be included in this header, and will be separated by a comma.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit The maximum amount of policies returned.
  # @option opts [Integer] :offset The offset from where to start looking.
  # @return [Array<OAuth2Client>]
  describe 'list_o_auth2_clients test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_subject_consent_sessions
  # Lists all consent sessions of a subject
  # This endpoint lists all subject&#39;s granted consent sessions, including client and granted scope. The \&quot;Link\&quot; header is also included in successful responses, which contains one or more links for pagination, formatted like so: &#39;&lt;https://hydra-url/admin/oauth2/auth/sessions/consent?subject&#x3D;{user}&amp;limit&#x3D;{limit}&amp;offset&#x3D;{offset}&gt;; rel&#x3D;\&quot;{page}\&quot;&#39;, where page is one of the following applicable pages: &#39;first&#39;, &#39;next&#39;, &#39;last&#39;, and &#39;previous&#39;. Multiple links can be included in this header, and will be separated by a comma.
  # @param subject 
  # @param [Hash] opts the optional parameters
  # @return [Array<PreviousConsentSession>]
  describe 'list_subject_consent_sessions test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for prometheus
  # Get snapshot metrics from the Hydra service. If you&#39;re using k8s, you can then add annotations to your deployment like so:
  # &#x60;&#x60;&#x60; metadata: annotations: prometheus.io/port: \&quot;4445\&quot; prometheus.io/path: \&quot;/metrics/prometheus\&quot; &#x60;&#x60;&#x60;
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'prometheus test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for reject_consent_request
  # Reject an consent request
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.  This endpoint tells ORY Hydra that the subject has not authorized the OAuth 2.0 client to access resources on his/her behalf. The consent provider must include a reason why the consent was not granted.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
  # @param consent_challenge 
  # @param [Hash] opts the optional parameters
  # @option opts [RejectRequest] :body 
  # @return [CompletedRequest]
  describe 'reject_consent_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for reject_login_request
  # Reject a login request
  # When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.  This endpoint tells ORY Hydra that the subject has not authenticated and includes a reason why the authentication was be denied.  The response contains a redirect URL which the login provider should redirect the user-agent to.
  # @param login_challenge 
  # @param [Hash] opts the optional parameters
  # @option opts [RejectRequest] :body 
  # @return [CompletedRequest]
  describe 'reject_login_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for reject_logout_request
  # Reject a logout request
  # When a user or an application requests ORY Hydra to log out a user, this endpoint is used to deny that logout request. No body is required.  The response is empty as the logout provider has to chose what action to perform next.
  # @param logout_challenge 
  # @param [Hash] opts the optional parameters
  # @option opts [RejectRequest] :body 
  # @return [nil]
  describe 'reject_logout_request test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for revoke_authentication_session
  # Invalidates all login sessions of a certain user Invalidates a subject&#39;s authentication session
  # This endpoint invalidates a subject&#39;s authentication session. After revoking the authentication session, the subject has to re-authenticate at ORY Hydra. This endpoint does not invalidate any tokens and does not work with OpenID Connect Front- or Back-channel logout.
  # @param subject 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'revoke_authentication_session test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for revoke_consent_sessions
  # Revokes consent sessions of a subject for a specific OAuth 2.0 Client
  # This endpoint revokes a subject&#39;s granted consent sessions for a specific OAuth 2.0 Client and invalidates all associated OAuth 2.0 Access Tokens.
  # @param subject The subject (Subject) who&#39;s consent sessions should be deleted.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :client If set, deletes only those consent sessions by the Subject that have been granted to the specified OAuth 2.0 Client ID
  # @return [nil]
  describe 'revoke_consent_sessions test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_json_web_key
  # Update a JSON Web Key
  # Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param kid The kid of the desired key
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @option opts [JSONWebKey] :body 
  # @return [JSONWebKey]
  describe 'update_json_web_key test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_json_web_key_set
  # Update a JSON Web Key Set
  # Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
  # @param set The set
  # @param [Hash] opts the optional parameters
  # @option opts [JSONWebKeySet] :body 
  # @return [JSONWebKeySet]
  describe 'update_json_web_key_set test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_o_auth2_client
  # Update an OAuth 2.0 Client
  # Update an existing OAuth 2.0 Client. If you pass &#x60;client_secret&#x60; the secret will be updated and returned via the API. This is the only time you will be able to retrieve the client secret, so write it down and keep it safe.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
  # @param id 
  # @param body 
  # @param [Hash] opts the optional parameters
  # @return [OAuth2Client]
  describe 'update_o_auth2_client test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
