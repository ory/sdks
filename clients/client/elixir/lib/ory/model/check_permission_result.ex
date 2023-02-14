# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CheckPermissionResult do
  @moduledoc """
  The content of the allowed field is mirrored in the HTTP status code.
  """

  @derive [Poison.Encoder]
  defstruct [
    :allowed
  ]

  @type t :: %__MODULE__{
    :allowed => boolean()
  }
end

defimpl Poison.Decoder, for: Ory.Model.CheckPermissionResult do
  def decode(value, _options) do
    value
  end
end

