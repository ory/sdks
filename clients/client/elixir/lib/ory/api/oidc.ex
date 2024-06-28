# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Api.Oidc do
  @moduledoc """
  API calls for all endpoints tagged `Oidc`.
  """

  alias Ory.Connection
  import Ory.RequestBuilder

  @doc """
  Register OAuth2 Client using OpenID Dynamic Client Registration
  This endpoint behaves like the administrative counterpart (`createOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  Please note that using this endpoint you are not able to choose the `client_secret` nor the `client_id` as those values will be server generated when specifying `token_endpoint_auth_method` as `client_secret_basic` or `client_secret_post`.  The `client_secret` will be returned in the response and you will not be able to retrieve it later on. Write the secret down and keep it somewhere safe.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `o_auth2_client` (OAuth2Client): Dynamic Client Registration Request Body
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.OAuth2Client.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec create_oidc_dynamic_client(Tesla.Env.client, Ory.Model.OAuth2Client.t, keyword()) :: {:ok, Ory.Model.ErrorOAuth2.t} | {:ok, Ory.Model.OAuth2Client.t} | {:error, Tesla.Env.t}
  def create_oidc_dynamic_client(connection, o_auth2_client, _opts \\ []) do
    request =
      %{}
      |> method(:post)
      |> url("/oauth2/register")
      |> add_param(:body, :body, o_auth2_client)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {201, Ory.Model.OAuth2Client},
      {400, Ory.Model.ErrorOAuth2},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end

  @doc """
  Issues a Verifiable Credential
  This endpoint creates a verifiable credential that attests that the user authenticated with the provided access token owns a certain public/private key pair.  More information can be found at https://openid.net/specs/openid-connect-userinfo-vc-1_0.html.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:body` (CreateVerifiableCredentialRequestBody): 

  ### Returns

  - `{:ok, Ory.Model.VerifiableCredentialResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec create_verifiable_credential(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.VerifiableCredentialPrimingResponse.t} | {:ok, Ory.Model.ErrorOAuth2.t} | {:ok, Ory.Model.VerifiableCredentialResponse.t} | {:error, Tesla.Env.t}
  def create_verifiable_credential(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }

    request =
      %{}
      |> method(:post)
      |> url("/credentials")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.VerifiableCredentialResponse},
      {400, Ory.Model.VerifiableCredentialPrimingResponse},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end

  @doc """
  Delete OAuth 2.0 Client using the OpenID Dynamic Client Registration Management Protocol
  This endpoint behaves like the administrative counterpart (`deleteOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `id` (String.t): The id of the OAuth 2.0 Client.
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec delete_oidc_dynamic_client(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:ok, Ory.Model.GenericError.t} | {:error, Tesla.Env.t}
  def delete_oidc_dynamic_client(connection, id, _opts \\ []) do
    request =
      %{}
      |> method(:delete)
      |> url("/oauth2/register/#{id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {204, false},
      {:default, Ory.Model.GenericError}
    ])
  end

  @doc """
  OpenID Connect Discovery
  A mechanism for an OpenID Connect Relying Party to discover the End-User's OpenID Provider and obtain information needed to interact with it, including its OAuth 2.0 endpoint locations.  Popular libraries for OpenID Connect clients include oidc-client-js (JavaScript), go-oidc (Golang), and others. For a full list of clients go here: https://openid.net/developers/certified/

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.OidcConfiguration.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec discover_oidc_configuration(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.OidcConfiguration.t} | {:ok, Ory.Model.ErrorOAuth2.t} | {:error, Tesla.Env.t}
  def discover_oidc_configuration(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/.well-known/openid-configuration")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.OidcConfiguration},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end

  @doc """
  Get OAuth2 Client using OpenID Dynamic Client Registration
  This endpoint behaves like the administrative counterpart (`getOAuth2Client`) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `id` (String.t): The id of the OAuth 2.0 Client.
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.OAuth2Client.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_oidc_dynamic_client(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorOAuth2.t} | {:ok, Ory.Model.OAuth2Client.t} | {:error, Tesla.Env.t}
  def get_oidc_dynamic_client(connection, id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/oauth2/register/#{id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.OAuth2Client},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end

  @doc """
  OpenID Connect Userinfo
  This endpoint returns the payload of the ID Token, including `session.id_token` values, of the provided OAuth 2.0 Access Token's consent request.  In the case of authentication error, a WWW-Authenticate header might be set in the response with more information about the error. See [the spec](https://datatracker.ietf.org/doc/html/rfc6750#section-3) for more details about header format.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.OidcUserInfo.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_oidc_user_info(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorOAuth2.t} | {:ok, Ory.Model.OidcUserInfo.t} | {:error, Tesla.Env.t}
  def get_oidc_user_info(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/userinfo")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.OidcUserInfo},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end

  @doc """
  OpenID Connect Front- and Back-channel Enabled Logout
  This endpoint initiates and completes user logout at the Ory OAuth2 & OpenID provider and initiates OpenID Connect Front- / Back-channel logout:  https://openid.net/specs/openid-connect-frontchannel-1_0.html https://openid.net/specs/openid-connect-backchannel-1_0.html  Back-channel logout is performed asynchronously and does not affect logout flow.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec revoke_oidc_session(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def revoke_oidc_session(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/oauth2/sessions/logout")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {302, false}
    ])
  end

  @doc """
  Set OAuth2 Client using OpenID Dynamic Client Registration
  This endpoint behaves like the administrative counterpart (`setOAuth2Client`) but is capable of facing the public internet directly to be used by third parties. It implements the OpenID Connect Dynamic Client Registration Protocol.  This feature is disabled per default. It can be enabled by a system administrator.  If you pass `client_secret` the secret is used, otherwise the existing secret is used. If set, the secret is echoed in the response. It is not possible to retrieve it later on.  To use this endpoint, you will need to present the client's authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method `client_secret_post`, you need to present the client secret in the URL query. If it uses `client_secret_basic`, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `id` (String.t): OAuth 2.0 Client ID
  - `o_auth2_client` (OAuth2Client): OAuth 2.0 Client Request Body
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.OAuth2Client.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec set_oidc_dynamic_client(Tesla.Env.client, String.t, Ory.Model.OAuth2Client.t, keyword()) :: {:ok, Ory.Model.ErrorOAuth2.t} | {:ok, Ory.Model.OAuth2Client.t} | {:error, Tesla.Env.t}
  def set_oidc_dynamic_client(connection, id, o_auth2_client, _opts \\ []) do
    request =
      %{}
      |> method(:put)
      |> url("/oauth2/register/#{id}")
      |> add_param(:body, :body, o_auth2_client)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.OAuth2Client},
      {404, Ory.Model.ErrorOAuth2},
      {:default, Ory.Model.ErrorOAuth2}
    ])
  end
end
