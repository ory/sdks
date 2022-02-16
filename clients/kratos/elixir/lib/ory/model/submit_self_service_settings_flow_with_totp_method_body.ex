# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SubmitSelfServiceSettingsFlowWithTotpMethodBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"csrf_token",
    :"method",
    :"totp_code",
    :"totp_unlink"
  ]

  @type t :: %__MODULE__{
    :"csrf_token" => String.t | nil,
    :"method" => String.t,
    :"totp_code" => String.t | nil,
    :"totp_unlink" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.SubmitSelfServiceSettingsFlowWithTotpMethodBody do
  def decode(value, _options) do
    value
  end
end

