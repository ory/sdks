# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentityWithCredentials do
  @moduledoc """
  Create Identity and Import Credentials
  """

  @derive [Poison.Encoder]
  defstruct [
    :oidc,
    :password
  ]

  @type t :: %__MODULE__{
    :oidc => Ory.Model.IdentityWithCredentialsOidc.t | nil,
    :password => Ory.Model.IdentityWithCredentialsPassword.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.IdentityWithCredentials do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:oidc, :struct, Ory.Model.IdentityWithCredentialsOidc, options)
    |> deserialize(:password, :struct, Ory.Model.IdentityWithCredentialsPassword, options)
  end
end

