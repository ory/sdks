# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.RecoveryLinkForIdentity do
  @moduledoc """
  Used when an administrator creates a recovery link for an identity.
  """

  @derive [Poison.Encoder]
  defstruct [
    :expires_at,
    :recovery_link
  ]

  @type t :: %__MODULE__{
    :expires_at => DateTime.t | nil,
    :recovery_link => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.RecoveryLinkForIdentity do
  def decode(value, _options) do
    value
  end
end

