# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryHydraClient.Connection do
  @moduledoc """
  Handle Tesla connections for OryHydraClient.
  """

  use Tesla

  # Add any middleware here (authentication)
  plug Tesla.Middleware.BaseUrl, "http://localhost"
  plug Tesla.Middleware.Headers, [{"user-agent", "Elixir"}]
  plug Tesla.Middleware.EncodeJson, engine: Poison

  @doc """
  Configure a client connection using Basic authentication.

  ## Parameters

  - username (String): Username used for authentication
  - password (String): Password used for authentication

  # Returns

  Tesla.Env.client
  """
  @spec new(String.t, String.t) :: Tesla.Env.client
  def new(username, password) do
    Tesla.client([
      {Tesla.Middleware.BasicAuth, %{username: username, password: password}}
    ])
  end
  @scopes [
    "offline", # A scope required when requesting refresh tokens (alias for &#x60;offline_access&#x60;)
    "offline_access", # A scope required when requesting refresh tokens
    "openid" # Request an OpenID Connect ID Token
  ]

  @doc """
  Configure a client connection using a provided OAuth2 token as a Bearer token

  ## Parameters

  - token (String): Bearer token

  ## Returns

  Tesla.Env.client
  """
  @spec new(String.t) :: Tesla.Env.client
  def new(token) when is_binary(token) do
    Tesla.client([
      {Tesla.Middleware.Headers,  [{"authorization", "Bearer #{token}"}]}
    ])
  end

  @doc """
  Configure a client connection using a function which yields a Bearer token.

  ## Parameters

  - token_fetcher (function arity of 1): Callback which provides an OAuth2 token
    given a list of scopes

  ## Returns

  Tesla.Env.client
  """
  @spec new(((list(String.t)) -> String.t)) :: Tesla.Env.client
  def new(token_fetcher) when is_function(token_fetcher) do
    token_fetcher.(@scopes)
    |> new
  end
  @doc """
  Configure an authless client connection

  # Returns

  Tesla.Env.client
  """
  @spec new() :: Tesla.Env.client
  def new do
    Tesla.client([])
  end
end
