# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.PluginDevice do
  @moduledoc """
  PluginDevice plugin device
  """

  @derive [Poison.Encoder]
  defstruct [
    :"Description",
    :"Name",
    :"Path",
    :"Settable"
  ]

  @type t :: %__MODULE__{
    :"Description" => String.t,
    :"Name" => String.t,
    :"Path" => String.t,
    :"Settable" => [String.t]
  }
end

defimpl Poison.Decoder, for: Ory.Model.PluginDevice do
  def decode(value, _options) do
    value
  end
end

