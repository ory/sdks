# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.TokenPagination do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :page_size,
    :page_token
  ]

  @type t :: %__MODULE__{
    :page_size => integer() | nil,
    :page_token => String.t | nil
  }

  def decode(value) do
    value
  end
end

