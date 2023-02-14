# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SubjectSet do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :namespace,
    :object,
    :relation
  ]

  @type t :: %__MODULE__{
    :namespace => String.t,
    :object => String.t,
    :relation => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SubjectSet do
  def decode(value, _options) do
    value
  end
end

