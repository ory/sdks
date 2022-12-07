# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.TrustOAuth2JwtGrantIssuer do
  @moduledoc """
  Trust OAuth2 JWT Bearer Grant Type Issuer Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :allow_any_subject,
    :expires_at,
    :issuer,
    :jwk,
    :scope,
    :subject
  ]

  @type t :: %__MODULE__{
    :allow_any_subject => boolean() | nil,
    :expires_at => DateTime.t,
    :issuer => String.t,
    :jwk => Ory.Model.JsonWebKey.t,
    :scope => [String.t],
    :subject => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.TrustOAuth2JwtGrantIssuer do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:jwk, :struct, Ory.Model.JsonWebKey, options)
  end
end

