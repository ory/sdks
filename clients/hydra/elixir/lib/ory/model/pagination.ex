# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.Pagination do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :page_size,
    :page_token
  ]

  @type t :: %__MODULE__{
    :page_size => integer() | nil,
    :page_token => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.Pagination do
  def decode(value, _options) do
    value
  end
end

