# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryHydraClient.Model.AcceptConsentRequest do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"grant_access_token_audience",
    :"grant_scope",
    :"handled_at",
    :"remember",
    :"remember_for",
    :"session"
  ]

  @type t :: %__MODULE__{
    :"grant_access_token_audience" => [String.t] | nil,
    :"grant_scope" => [String.t] | nil,
    :"handled_at" => DateTime.t | nil,
    :"remember" => boolean() | nil,
    :"remember_for" => integer() | nil,
    :"session" => OryHydraClient.Model.ConsentRequestSession.t | nil
  }
end

defimpl Poison.Decoder, for: OryHydraClient.Model.AcceptConsentRequest do
  import OryHydraClient.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"session", :struct, OryHydraClient.Model.ConsentRequestSession, options)
  end
end

