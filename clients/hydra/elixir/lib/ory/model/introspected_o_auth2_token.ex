# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IntrospectedOAuth2Token do
  @moduledoc """
  Introspection contains an access token's session data as specified by [IETF RFC 7662](https://tools.ietf.org/html/rfc7662)
  """

  @derive Jason.Encoder
  defstruct [
    :active,
    :aud,
    :client_id,
    :exp,
    :ext,
    :iat,
    :iss,
    :nbf,
    :obfuscated_subject,
    :scope,
    :sub,
    :token_type,
    :token_use,
    :username
  ]

  @type t :: %__MODULE__{
    :active => boolean(),
    :aud => [String.t] | nil,
    :client_id => String.t | nil,
    :exp => integer() | nil,
    :ext => %{optional(String.t) => any()} | nil,
    :iat => integer() | nil,
    :iss => String.t | nil,
    :nbf => integer() | nil,
    :obfuscated_subject => String.t | nil,
    :scope => String.t | nil,
    :sub => String.t | nil,
    :token_type => String.t | nil,
    :token_use => String.t | nil,
    :username => String.t | nil
  }

  def decode(value) do
    value
  end
end

