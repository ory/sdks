# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.OAuth2ConsentRequestOpenIdConnectContext do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :acr_values,
    :display,
    :id_token_hint_claims,
    :login_hint,
    :ui_locales
  ]

  @type t :: %__MODULE__{
    :acr_values => [String.t] | nil,
    :display => String.t | nil,
    :id_token_hint_claims => %{optional(String.t) => any()} | nil,
    :login_hint => String.t | nil,
    :ui_locales => [String.t] | nil
  }

  def decode(value) do
    value
  end
end

