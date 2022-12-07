# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.TrustedOAuth2JwtGrantIssuer do
  @moduledoc """
  OAuth2 JWT Bearer Grant Type Issuer Trust Relationship
  """

  @derive [Poison.Encoder]
  defstruct [
    :allow_any_subject,
    :created_at,
    :expires_at,
    :id,
    :issuer,
    :public_key,
    :scope,
    :subject
  ]

  @type t :: %__MODULE__{
    :allow_any_subject => boolean() | nil,
    :created_at => DateTime.t | nil,
    :expires_at => DateTime.t | nil,
    :id => String.t | nil,
    :issuer => String.t | nil,
    :public_key => Ory.Model.TrustedOAuth2JwtGrantJsonWebKey.t | nil,
    :scope => [String.t] | nil,
    :subject => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.TrustedOAuth2JwtGrantIssuer do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:public_key, :struct, Ory.Model.TrustedOAuth2JwtGrantJsonWebKey, options)
  end
end

