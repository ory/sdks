# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.IdentityWithCredentialsOidcConfig do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :config,
    :providers
  ]

  @type t :: %__MODULE__{
    :config => Ory.Model.IdentityWithCredentialsPasswordConfig.t | nil,
    :providers => [Ory.Model.IdentityWithCredentialsOidcConfigProvider.t] | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.IdentityWithCredentialsOidcConfig do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:config, :struct, Ory.Model.IdentityWithCredentialsPasswordConfig, options)
    |> deserialize(:providers, :list, Ory.Model.IdentityWithCredentialsOidcConfigProvider, options)
  end
end

