# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CourierMessageStatus do
  @moduledoc """
  A Message's Status
  """

  @derive [Poison.Encoder]
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }
end

defimpl Poison.Decoder, for: Ory.Model.CourierMessageStatus do
  def decode(value, _options) do
    value
  end
end

