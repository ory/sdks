# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentitySchemaContainer do
  @moduledoc """
  An Identity JSON Schema Container
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :schema
  ]

  @type t :: %__MODULE__{
    :id => String.t | nil,
    :schema => map() | nil
  }

  def decode(value) do
    value
  end
end

