# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SchemaPatch do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"data",
    :"name"
  ]

  @type t :: %__MODULE__{
    :"data" => map(),
    :"name" => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SchemaPatch do
  def decode(value, _options) do
    value
  end
end

