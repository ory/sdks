# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryHydraClient.Model.HealthNotReadyStatus do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"errors"
  ]

  @type t :: %__MODULE__{
    :"errors" => %{optional(String.t) => String.t} | nil
  }
end

defimpl Poison.Decoder, for: OryHydraClient.Model.HealthNotReadyStatus do
  def decode(value, _options) do
    value
  end
end

