# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SuccessfulCodeExchangeResponse do
  @moduledoc """
  The Response for Registration Flows via API
  """

  @derive Jason.Encoder
  defstruct [
    :session,
    :session_token
  ]

  @type t :: %__MODULE__{
    :session => Ory.Model.Session.t,
    :session_token => String.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:session, :struct, Ory.Model.Session)
  end
end

