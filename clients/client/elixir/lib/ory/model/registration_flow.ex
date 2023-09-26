# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.RegistrationFlow do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :active,
    :expires_at,
    :id,
    :issued_at,
    :oauth2_login_challenge,
    :oauth2_login_request,
    :organization_id,
    :request_url,
    :return_to,
    :session_token_exchange_code,
    :state,
    :transient_payload,
    :type,
    :ui
  ]

  @type t :: %__MODULE__{
    :active => Ory.Model.IdentityCredentialsType.t | nil,
    :expires_at => DateTime.t,
    :id => String.t,
    :issued_at => DateTime.t,
    :oauth2_login_challenge => String.t | nil,
    :oauth2_login_request => Ory.Model.OAuth2LoginRequest.t | nil,
    :organization_id => String.t | nil,
    :request_url => String.t,
    :return_to => String.t | nil,
    :session_token_exchange_code => String.t | nil,
    :state => any() | nil,
    :transient_payload => map() | nil,
    :type => String.t,
    :ui => Ory.Model.UiContainer.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.RegistrationFlow do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:active, :struct, Ory.Model.IdentityCredentialsType, options)
    |> deserialize(:oauth2_login_request, :struct, Ory.Model.OAuth2LoginRequest, options)
    |> deserialize(:ui, :struct, Ory.Model.UiContainer, options)
  end
end

