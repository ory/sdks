# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.ErrorFlowReplaced do
  @moduledoc """
  Is sent when a flow is replaced by a different flow of the same class
  """

  @derive [Poison.Encoder]
  defstruct [
    :error,
    :use_flow_id
  ]

  @type t :: %__MODULE__{
    :error => Ory.Model.GenericError.t | nil,
    :use_flow_id => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ErrorFlowReplaced do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:error, :struct, Ory.Model.GenericError, options)
  end
end

