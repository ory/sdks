# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SelfServiceFlowExpiredError do
  @moduledoc """
  Is sent when a flow is expired
  """

  @derive [Poison.Encoder]
  defstruct [
    :error,
    :expired_at,
    :since,
    :use_flow_id
  ]

  @type t :: %__MODULE__{
    :error => Ory.Model.GenericError.t | nil,
    :expired_at => DateTime.t | nil,
    :since => integer() | nil,
    :use_flow_id => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.SelfServiceFlowExpiredError do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:error, :struct, Ory.Model.GenericError, options)
  end
end

