# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SubmitSelfServiceVerificationFlowBody do
  @moduledoc """
  nolint:deadcode,unused
  """

  @derive [Poison.Encoder]
  defstruct [
    :"csrf_token",
    :"email",
    :"method"
  ]

  @type t :: %__MODULE__{
    :"csrf_token" => String.t | nil,
    :"email" => String.t,
    :"method" => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SubmitSelfServiceVerificationFlowBody do
  def decode(value, _options) do
    value
  end
end

