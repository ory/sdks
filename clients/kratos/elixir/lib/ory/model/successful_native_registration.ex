# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SuccessfulNativeRegistration do
  @moduledoc """
  The Response for Registration Flows via API
  """

  @derive Jason.Encoder
  defstruct [
    :continue_with,
    :identity,
    :session,
    :session_token
  ]

  @type t :: %__MODULE__{
    :continue_with => [Ory.Model.ContinueWith.t] | nil,
    :identity => Ory.Model.Identity.t,
    :session => Ory.Model.Session.t | nil,
    :session_token => String.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:continue_with, :list, Ory.Model.ContinueWith)
     |> Deserializer.deserialize(:identity, :struct, Ory.Model.Identity)
     |> Deserializer.deserialize(:session, :struct, Ory.Model.Session)
  end
end

