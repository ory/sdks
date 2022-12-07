# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.UpdateRegistrationFlowWithPasswordMethod do
  @moduledoc """
  Update Registration Flow with Password Method
  """

  @derive [Poison.Encoder]
  defstruct [
    :csrf_token,
    :method,
    :password,
    :traits
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :method => String.t,
    :password => String.t,
    :traits => map()
  }
end

defimpl Poison.Decoder, for: Ory.Model.UpdateRegistrationFlowWithPasswordMethod do
  def decode(value, _options) do
    value
  end
end

