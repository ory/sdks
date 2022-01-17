# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryHydraClient.Model.JsonError do
  @moduledoc """
  Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"error",
    :"error_debug",
    :"error_description",
    :"status_code"
  ]

  @type t :: %__MODULE__{
    :"error" => String.t | nil,
    :"error_debug" => String.t | nil,
    :"error_description" => String.t | nil,
    :"status_code" => integer() | nil
  }
end

defimpl Poison.Decoder, for: OryHydraClient.Model.JsonError do
  def decode(value, _options) do
    value
  end
end

